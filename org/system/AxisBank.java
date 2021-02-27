//
//Assignment3:
//============
//    Class     :BankInfo
//    Methods :saving(),fixed(),deposit()
//
//     Class     :AxisBank
//     Methods :deposit()
//
//Description:
//You have to override the method deposit in AxisBank.


package org.system;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("AxisBank class: From deposit method: Overriding super class");
		super.deposit();//super cannot be used inside static method
	}

	
	public static void main(String[] args) {
		
		AxisBank axisBank = new AxisBank();
		BankInfo bankInfo = new BankInfo();
		
		axisBank.deposit();
		axisBank.fixed();
		axisBank.saving();
		
		bankInfo.deposit();
				
	}
}
