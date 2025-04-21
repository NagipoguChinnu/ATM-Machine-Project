package com.atm.www;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ImplmtClass implements AtmInterface{
	
	AtmEntity atm=new AtmEntity();
	Map<String,Double> minstmt=new LinkedHashMap<String,Double>();
	public void availableBalance() {
		System.out.println("Available Balance is "+atm.getBalance());
	}
	public void depositAmount(double depositAmount) {
		atm.setBalance(atm.getBalance()+depositAmount);
		System.out.println("Amount deposited Successfully!");
		minstmt.put("Deposited Amount",depositAmount);
	}
	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%500==0 || withdrawAmount%200==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("Collect the cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				minstmt.put("Withdrawl Amount", withdrawAmount);
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}else {
			System.out.println("Please Enter multiples of 200 or 500");
		}
	}
	
	public void miniStatement(){
		Set<String> key=minstmt.keySet();
		
		for(String d:key) {
			System.out.println(minstmt.get(d)+" = "+d);
		}
	}
	
	}

