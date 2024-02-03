package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Admin;
import com.example.springboot.entity.Customer;
import com.example.springboot.entity.Product;

public interface AdminService {
	Admin saveAdmin(Admin admin);
	Admin loginAdmin(Admin admin);
	
	public List<Product> getAllProducts(long adminId);
	public List<Customer> getAllCustomers(long adminId);
}