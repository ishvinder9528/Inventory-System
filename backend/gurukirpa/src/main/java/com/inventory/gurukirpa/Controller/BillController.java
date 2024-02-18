package com.inventory.gurukirpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.gurukirpa.Dto.BillDto;
import com.inventory.gurukirpa.Entity.Bill;
import com.inventory.gurukirpa.Exception.SupplierDoesNotExistsException;
import com.inventory.gurukirpa.Service.BillService;

@RestController
@RequestMapping("/api/bill")
public class BillController {
	
	@Autowired
	private BillService service;
	
	
	@PostMapping("/add/{supplierId}")
	public ResponseEntity<?> addNewBill(@RequestBody BillDto bill, @PathVariable("supplierId")String supplierId){
		try {
			Bill result = this.service.addNewBill(bill, supplierId);
			return new ResponseEntity<Bill>(result, HttpStatus.CREATED);
		} catch (SupplierDoesNotExistsException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}

}
