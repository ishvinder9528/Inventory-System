package com.inventory.gurukirpa.Service.ImplService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.gurukirpa.Dto.SupplierDto;
import com.inventory.gurukirpa.Entity.Supplier;
import com.inventory.gurukirpa.Repository.SupplierRepository;
import com.inventory.gurukirpa.Service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository repo;

    @Override
    public Supplier createSupplier(SupplierDto data) {
        try {
            Supplier s = new Supplier();
            s.setName(data.getName());
            s.setPhoneNumber(data.getPhone());
            s.setGst(data.getGst());
            s.setAddress(data.getAddress());
            s.setEmail(data.getEmail());
            return null; // return has to do something..
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Unimplemented method 'createSupplier'");
        }
    }

}