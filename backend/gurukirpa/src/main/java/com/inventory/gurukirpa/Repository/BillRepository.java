package com.inventory.gurukirpa.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.inventory.gurukirpa.Entity.Bill;


@Repository
public interface BillRepository extends MongoRepository<Bill, String> {

}
