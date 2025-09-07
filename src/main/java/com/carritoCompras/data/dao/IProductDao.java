package com.carritoCompras.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carritoCompras.data.entity.Product;


@Repository
public interface IProductDao extends JpaRepository<Product, Long>{
	
	
	

}
