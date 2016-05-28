<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>
  
</head>
<body>

<div class="container">
  
  
  <input type="button" class="btn btn-info" value="SignIn">
  <input type="submit" class="btn btn-info" value="SignUp">
</div>
<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>John's Blog</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="home.jsp">Home</a></li>
        <li><a href="#section2">Friends</a></li>
        <li><a href="#section3">Family</a></li>
        <li><a href="#section3">Photos</a></li>
      </ul><br>
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search Blog..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
      </div>
    </div>
<div class="col-sm-9">
<div id="myCarousel" class="carousel slide" data- ride="carousel">

					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="<c:url value="/resources/images/ecom2.jpg"/>" alt="no image" width="300" height="300">
							<div class="carousel-caption">
								<h3>Chania</h3>

							</div>
						</div>

						<div class="item">
							<img src="<c:url value="/resources/images/ecom1.jpg"/>" alt="no image" width="300" height="300">
							<div class="carousel-caption">
								<h3>Chania</h3>

							</div>
						</div>

						<div class="item">
							<img src="<c:url value="/resources/images/ecom5.jpg"/>" alt="no image" width="300" height="300">
							<div class="carousel-caption"></div>
						</div>


					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left" aria- hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria- hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>

			</div>
<a href="Product?name=img1"><img src="<c:url value="/resources/images/ecom2.jpg"/>" alt="no image" width="300" height="300" /></a>
<a href="Product?name=img2"> <img src="<c:url value="/resources/images/ecom1.jpg"/>" alt="no image" width="300" height="300" /> </a>
<a href="Product?name=img3">  <img src="<c:url value="/resources/images/ecom5.jpg"/>" alt="no image" width="300" height="300" /></a>
<center><a href="Product">AllProducts</a>
</div>

</body>
</html>
