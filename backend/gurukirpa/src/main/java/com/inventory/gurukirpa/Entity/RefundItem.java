package com.inventory.gurukirpa.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("RefundItem")
public class RefundItem {
    @Id
    private int RefundItemId;
    private int qty;
    private float price;
    private double amount;
    private Bill bill;
    private BillItem billItem;

    public int getRefundItemId() {
        return RefundItemId;
    }

    public void setRefundItemId(int refundItemId) {
        RefundItemId = refundItemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public BillItem getBillItem() {
        return billItem;
    }

    public void setBillItem(BillItem billItem) {
        this.billItem = billItem;
    }

}
