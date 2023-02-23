package com.zyapaar.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyapaar.model.Product;

@Repository
public interface productRepo extends JpaRepository<Product, Integer>{

}
