package com.atm.www;

public interface AtmInterface {
	public abstract void availableBalance();
	public abstract void depositAmount(double depositAmount);
	public abstract void withdrawAmount(double withdrawAmount);
	public abstract void miniStatement();
}
