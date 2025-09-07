package com.carritoCompras.data.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.carritoCompras.data.dao.IProductDao;
import com.carritoCompras.data.entity.Product;
import com.carritoCompras.data.service.IProductService;

public class IProductServiceImpl implements IProductService{
	
	
	@Autowired
	IProductDao iProductDao;

	@Transactional(readOnly = true)
	@Override
	public List<Product> getAll() {
		
		return iProductDao.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Product> getId(Long id) {		
		return iProductDao.findById(id);
	}

	@Transactional
	@Override
	public Product save(Product product) {		
		return iProductDao.save(product);
	}
	@Transactional
	@Override
	public void delete(Long id) {
		iProductDao.deleteById(id);
		
	}
	
	
	
	
	

}
