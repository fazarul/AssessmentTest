package com.jf.classes;

import com.jf.SwimmingAnimals;

public class Fish implements SwimmingAnimals {

	@Override
	public int doSing(String type, String Sound) {
		// 
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
		System.out.println("Fish are Swiming...");
		return 1;
	}

	
}
