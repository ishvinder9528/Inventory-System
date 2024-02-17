package com.inventory.gurukirpa.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.inventory.gurukirpa.Entity.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Integer, Supplier> {

}
