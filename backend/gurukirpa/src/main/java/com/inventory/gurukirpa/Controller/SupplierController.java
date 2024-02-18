package com.inventory.gurukirpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.gurukirpa.Dto.SupplierDto;
import com.inventory.gurukirpa.Entity.Supplier;
import com.inventory.gurukirpa.Exception.SupplierAlreadyExistsException;
import com.inventory.gurukirpa.Service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService service;
	
	@PostMapping("/add")
	public ResponseEntity<?> addSupplier(@RequestBody SupplierDto supplier){
		try {
			Supplier result = this.service.createSupplier(supplier);
			return new ResponseEntity<Supplier>(result, HttpStatus.CREATED);
		} catch (SupplierAlreadyExistsException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}

}
