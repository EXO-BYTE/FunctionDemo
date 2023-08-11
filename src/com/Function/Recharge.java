package com.Function;
import java.util.function.Function;

public class Recharge {
    private int customerId;
    private float amount;
    private String validate;

    
    public Recharge(int customerId, float amount, String validate) {
        this.customerId = customerId;
        this.amount = amount;
        this.validate = validate;
    }


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getValidate() {
		return validate;
	}


	public void setValidate(String validate) {
		this.validate = validate;
	}
}
