package com.inventory.gurukirpa.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.inventory.gurukirpa.Entity.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, String> {
	
	Optional<Supplier> findByEmail(String email);

}
