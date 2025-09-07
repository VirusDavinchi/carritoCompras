package com.carritoCompras.data.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="product")
public class Product implements Serializable{
	
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "product_id")
   private  Float product_id ;
   
   @Column(name = "name")
   private  String name;
   
   @Column(name = "descripción")
   private  String description;
   
   @Column(name = "price")
   private  float price;
   
   @Column(name = "stock_quantity")
   private  Integer stock_quantity;
   
   @JsonIgnore 
   @Column(name = "CREATED_AT", nullable = false, columnDefinition = "TIMESTAMP")
   private LocalDateTime createdAt;
   
   @PrePersist
   protected void onCreate() {
       this.createdAt = LocalDateTime.now();
   }
   
   @Column(name = "updated_at")
   private  Timestamp updated_at;
   

	
	
	

}
