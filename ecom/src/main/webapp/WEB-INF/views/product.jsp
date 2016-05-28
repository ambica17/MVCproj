
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html data-ng-app="myApp">
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style>
        body { padding-top:50px; }
    </style>

    <!-- JS -->
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<script>
	var app=angular.module('myApp',[]);
    function MyController($scope,$http)
    {
    	 $scope.sortType = 'name'; // set the default sort type
   	  $scope.sortReverse = false;  // set the default sort order
   	  $scope.searchPName = '';
    	$scope.getDataFromServer=function()
    	{
    		$http({
    			method:'GET',
    			url:'p'
    		}).success(function(data,status,headers,config){
    			$scope.products=data;
    		}).error(function(data,status,headers,config){
    			
    		});
    	};
    };
    </script>
</head>
<body>

<div class="container" ng-app="myApp" ng-controller="MyController">
 <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>

        <input type="text" class="form-control" placeholder="Search da product" ng-model="searchPName">
		<button ng-click="getDataFromServer()">Fetch Data</button>
      </div>      
    </div>
  </form>
<table class="table table-bordered table-striped">
    
    <thead>
      <tr>
      <td>Product Id</td>
        <td>Product Name</td>
        <td>Description</td>
        <td>  Price  </td>
      </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="roll in products | filter:searchPName"">
        <td>{{roll.id}}</td>
        <td>{{ roll.name }}</td>
        <td>{{ roll.desc }}</td>
        <td>{{ roll.price }}</td>
        <td> <a href="addprod">Add</a></h2></td>
 
       <td>
           			<a href="edit?id={{roll.id}}">Edit</a> &nbsp;
					<a href="delete?id={{roll.id}}">Delete</a></td>
      </tr>
    </tbody>
    
  </table>
</div>
</body>
</html>
