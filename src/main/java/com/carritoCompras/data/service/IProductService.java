package com.carritoCompras.data.service;

import java.util.List;
import java.util.Optional;

import com.carritoCompras.data.entity.Product;





public interface IProductService {
	
	public List<Product> getAll();
	public Optional<Product> getId(Long id);
	public Product save(Product product);
	public void delete(Long id);
	
	
	

}
