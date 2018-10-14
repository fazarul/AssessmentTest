package com.jf.classes;

import com.jf.OtherAnimals;
import com.jf.SwimmingAnimals;

public class Duck implements SwimmingAnimals,OtherAnimals {

	@Override
	public String doSing(String type, String Sound) {
		
		if(type.equals("1")){
			System.out.println("This animal should not be singing.....");
			return "false";
		}
		else {
			System.out.println(Sound);
			return "true";
		}
		
	}

	@Override
	public String doSwim() {
		// TODO Auto-generated method stub
		System.out.println("Duck are Swimming..");
		return "true";
	}

	@Override
	public String doWalk() {
		// TODO Auto-generated method stub

		System.out.println("Duck are Walking...");
		return "true";
	}

}
