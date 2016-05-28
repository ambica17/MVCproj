package com.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao{
	List<product> prods;
	
	@Autowired
	 SessionFactory sessionFactory;

	public ProductDaoImpl()
	{}

	

	public List<product> getproduct(String s) { 
		prods = new ArrayList<product>();
	      
	      product prod1=null;
	      if(s.equals("img1"))
			{
	    	  prod1 = new product(1,"c","function oriented",3000);
	    	  
			}
	     if("img2".equals(s))
			{
	    	prod1 = new product(2,"java","object oriented",4000);
	    	
			}
			
	   if("img3".equals(s))
			{
	    	  prod1 = new product(3,"sql","database",4000);
	    	 
			}
	    prods.add(prod1);
	     return prods;
	     }

	public List<product> getAllproduct() {
		Session session = sessionFactory.getCurrentSession();  
	    Query q =session.createQuery("from product");
	    	prods =(List<product>)q.list();
	    	return prods;
	
	
	}

	public void addproduct(product p) {
		System.out.println("In save");
		//Session s=sessionFactory.getCurrentSession();
	   
	   Session session = sessionFactory.openSession();
	    Transaction tx = (Transaction) session.beginTransaction();
		System.out.println("After current");
		session.save(p);
		 tx.commit();
		 Serializable id = session.getIdentifier(p);
		    session.close();

		
	}


	public product getRowById(int id) {
		Session session = sessionFactory.openSession();
	    product p = (product) session.load(product.class, id);
	    return p;
}


	public int updateRow(product p) {
		Session session = sessionFactory.openSession();
	    Transaction tx = (Transaction) session.beginTransaction();
	    session.saveOrUpdate(p);
	    tx.commit();
	    Serializable id = session.getIdentifier(p);
	    session.close();
	    return (Integer) id;
}


	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
	    Transaction tx = session.beginTransaction();
	    product p = (product) session.load(product.class, id);
	    session.delete(p);
	    tx.commit();
	    Serializable ids = session.getIdentifier(p);
	    session.close();
	    return (Integer) ids;	}

}
 