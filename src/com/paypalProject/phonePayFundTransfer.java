package com.paypalProject;

import org.testng.annotations.Test;

import com.GenericMethods.CommonMethods;

public class phonePayFundTransfer {
  @Test
  public static void phonePayTransferAmt(){
		
		CommonMethods cm = new CommonMethods();
		cm.transferAmt("Kiran", "Kumar", "500");
		
	}
}
