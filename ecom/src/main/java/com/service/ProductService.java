package com.service;

import java.util.List;

import com.model.product;

public interface ProductService {
	public List<product> getAll();
	public void create(product p);
	 public product getRowById(int id);

	 public int updateRow(product p);

	 public int deleteRow(int id);

}
