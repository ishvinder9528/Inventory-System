package com.inventory.gurukirpa.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;

import org.springframework.data.annotation.Id;

@Document("Supplier")
public class Supplier {
    @Id
    private String id;
    private String name;
    private String gst;
    private String address;
    private String email;
    private String phoneNumber;
    @JsonIgnore
    private List<Bill> supplierBills = new ArrayList<>();
    public List<Bill> getSupplierBills() {
		return supplierBills;
	}

	public void setSupplierBills(List<Bill> supplierBills) {
		this.supplierBills = supplierBills;
	}

	public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
