package com.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.ProductDao;
import com.model.product;

@Service
@Transactional 
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao pdi;
	
	
	public List<product> getAll() {
		return pdi.getAllproduct();
	} 
 
	
	public void create(product p) {
	
		pdi.addproduct(p);
	}

	
	public product getRowById(int id) { 
		return pdi.getRowById(id);
			}


	public int updateRow(product p) {
		return pdi.updateRow(p);
			}


	public int deleteRow(int id) {
		
		return pdi.deleteRow(id);
	}

}
 