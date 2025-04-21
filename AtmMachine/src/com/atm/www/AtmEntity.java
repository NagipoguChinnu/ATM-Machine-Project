package com.atm.www;

public class AtmEntity 
{
	private double viewBalance;
	private double depositAmount;
	private double withdrawAmount; 
	
	AtmEntity(){
		super();
	}
	public void setBalance(double viewBalance) {
		this.viewBalance=viewBalance;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount=depositAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
	}
	public double getBalance() {
		return viewBalance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	@Override
	public String toString() {
		return "AtmEntity [viewBalance=" + viewBalance + ", depositAmount=" + depositAmount + ", withdrawAmount="
				+ withdrawAmount + "]";
	}
}
