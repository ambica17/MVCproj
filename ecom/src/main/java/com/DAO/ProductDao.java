package com.DAO;

import java.util.List;

import com.model.product;

public interface ProductDao {
	public List<product> getAllproduct();

	public List<product> getproduct(String s);
	public void addproduct(product p);

	public product getRowById(int id);

	public int updateRow(product p);

	public int deleteRow(int id);
		 

}
  