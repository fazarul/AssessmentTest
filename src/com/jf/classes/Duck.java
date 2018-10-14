package com.jf.classes;

import com.jf.OtherAnimals;
import com.jf.SwimmingAnimals;

public class Duck implements SwimmingAnimals,OtherAnimals {

	@Override
	public int doSing(String type, String Sound) {
		
		if(type.equals("1")){
			System.out.println("This animal should not be singing.....");
			return 0;
		}
		else {
			System.out.println(Sound);
			return 1;
		}
		
	}

	@Override
	public int doSwim() {
		// TODO Auto-generated method stub
		System.out.println("Duck are Swimming..");
		return 1;
	}

	@Override
	public int doWalk() {
		// TODO Auto-generated method stub

		System.out.println("Duck are Walking...");
		return 1;
	}

}
