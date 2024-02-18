package com.inventory.gurukirpa.Service;

import com.inventory.gurukirpa.Dto.SupplierDto;
import com.inventory.gurukirpa.Entity.Supplier;
import com.inventory.gurukirpa.Exception.SupplierAlreadyExistsException;

public interface SupplierService {

    public Supplier createSupplier(SupplierDto data) throws SupplierAlreadyExistsException;

}
