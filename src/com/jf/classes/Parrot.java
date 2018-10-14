package com.jf.classes;

import com.jf.FlyingAnimals;

public class Parrot implements FlyingAnimals {

	@Override
	public int doSing(String type, String Sound) {
		// TODO Auto-generated method stub
		if(type.equals("1"))
		{
			System.out.println("This animal should not be singing.....");
			return 0;
		}
		else{
			System.out.println(Sound);
			return 1;
		}
	}

	@Override
	public int doFly() {
		System.out.println("Parrot is Flying...");
		return 1;
	}

	
}
