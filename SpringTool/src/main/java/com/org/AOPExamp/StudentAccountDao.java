package com.org.AOPExamp;

import java.util.ArrayList;
import java.util.List;

public class StudentAccountDao {
	public List findAcc(boolean obj) {
		if(obj) {
			throw new RuntimeException();
		}
		ArrayList<Account> myacc=new ArrayList<Account>();
		Account ac1=new Account("pavan","Abc123");
		Account ac2=new Account("Amit","qbc123");
		Account ac3=new Account("shubham","Xyz123");
		myacc.add(ac1);myacc.add(ac2);
		myacc.add(ac3);
		
		return myacc;
	}
}
