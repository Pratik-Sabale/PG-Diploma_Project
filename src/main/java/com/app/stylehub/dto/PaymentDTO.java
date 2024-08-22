package com.app.stylehub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PaymentDTO {
    private double amount;
    private String paymentMethod;
    private String status; // e.g., "SUCCESS", "FAILED"
    
    public PaymentDTO() {
    	
    }

	public PaymentDTO(double amount, String paymentMethod, String status) {
		super();
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}