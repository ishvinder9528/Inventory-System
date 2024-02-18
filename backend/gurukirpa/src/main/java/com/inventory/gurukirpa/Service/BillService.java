package com.inventory.gurukirpa.Service;

import com.inventory.gurukirpa.Dto.BillDto;
import com.inventory.gurukirpa.Entity.Bill;
import com.inventory.gurukirpa.Exception.SupplierDoesNotExistsException;

public interface BillService {
	
	public Bill addNewBill(BillDto b, String supplierId) throws SupplierDoesNotExistsException;

}
