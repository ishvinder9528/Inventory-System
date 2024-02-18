package com.inventory.gurukirpa.Service.ImplService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.gurukirpa.Dto.SupplierDto;
import com.inventory.gurukirpa.Entity.Supplier;
import com.inventory.gurukirpa.Exception.SupplierAlreadyExistsException;
import com.inventory.gurukirpa.Repository.SupplierRepository;
import com.inventory.gurukirpa.Service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository repo;

    @Override
    public Supplier createSupplier(SupplierDto data) throws SupplierAlreadyExistsException {
    	Optional<Supplier> resp = this.repo.findByEmail(data.getEmail());
    	if(resp.isPresent()) {
    		throw new SupplierAlreadyExistsException("Supplier Already Exists!!");
    	}else {
    		Supplier s = new Supplier();
    		s.setName(data.getName());
    		s.setEmail(data.getEmail());
    		s.setGst(data.getGst());
    		s.setPhoneNumber(data.getPhone());
    		s.setAddress(data.getAddress());
    		return this.repo.save(s);
    	}
        
    }

}