package com.inventory.gurukirpa.Dto;

import java.time.LocalDateTime;

public class BillDto {
	public Double billedAmount;
    public Double getBilledAmount() {
		return billedAmount;
	}

	public void setBilledAmount(Double billedAmount) {
		this.billedAmount = billedAmount;
	}

	public LocalDateTime date;
    

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
