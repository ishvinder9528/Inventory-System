package com.inventory.gurukirpa.Entity;

import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.data.annotation.Id;
import java.util.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Bill")
public class Bill {
    @Id
    private String id;
    private LocalDateTime date;
    private List<BillItem> billedItems = new CopyOnWriteArrayList<>();
    private Double billedAmout;
    private Double paidAmount;
    private Double pendingAmout;
    public List<BillItem> getBilledItems() {
		return billedItems;
	}

	public void setBilledItems(List<BillItem> billedItems) {
		this.billedItems = billedItems;
	}

	public Double getBilledAmout() {
		return billedAmout;
	}

	public void setBilledAmout(Double billedAmout) {
		this.billedAmout = billedAmout;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Double getPendingAmout() {
		return pendingAmout;
	}

	public void setPendingAmout(Double pendingAmout) {
		this.pendingAmout = pendingAmout;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String supplierId;

    public String getId() {
        return this.id;
    }

    public void setBillId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplier) {
        this.supplierId = supplier;
    }

}
