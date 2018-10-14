package com.jf.classes;

import com.jf.FlyingAnimals;

public class Parrot implements FlyingAnimals {

	@Override
	public String doSing(String type, String Sound) {
		// TODO Auto-generated method stub
		if(type.equals(""))
		{
			System.out.println("This animal should not be singing.....");
			return "false";
		}
		else{
			System.out.println(Sound);
			return "true";
		}
	}

	@Override
	public String doFly() {
		System.out.println("Parrot is Flying...");
		return "true";
	}

	
}
