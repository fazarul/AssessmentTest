package com.jf.classes;

import com.jf.SwimmingAnimals;

public class Fish implements SwimmingAnimals {

	@Override
	public String doSing(String type, String Sound) {
		// 
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
		System.out.println("Fish are Swiming...");
		return "true";
	}

	
}
