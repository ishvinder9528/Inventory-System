package com.inventory.gurukirpa.Service.ImplService;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.gurukirpa.Dto.BillDto;
import com.inventory.gurukirpa.Entity.Bill;
import com.inventory.gurukirpa.Entity.Supplier;
import com.inventory.gurukirpa.Exception.SupplierDoesNotExistsException;
import com.inventory.gurukirpa.Repository.BillRepository;
import com.inventory.gurukirpa.Repository.SupplierRepository;
import com.inventory.gurukirpa.Service.BillService;

@Service
public class BillServiceImpl implements BillService{
	
	
	@Autowired
	private BillRepository repo;
	
	@Autowired
	private SupplierRepository srepo;

	@Override
	public Bill addNewBill(BillDto b, String supplierId) throws SupplierDoesNotExistsException {
		// TODO Auto-generated method stub
		Optional<Supplier> resp = this.srepo.findById(supplierId);
		if(resp.isPresent()) {
			Bill bill = new Bill();
			bill.setBilledAmout(b.getBilledAmount());
			bill.setDate(LocalDateTime.now());
			
			Supplier s = resp.get();
			s.getSupplierBills().add(bill);
			s = this.srepo.save(s);
			
			bill.setSupplierId(supplierId);
			
			return this.repo.save(bill);
		}else {
			throw new SupplierDoesNotExistsException("Supplier Doesn't Exists");
		}
	}

}
