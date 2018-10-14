package com.jf.classes;

import com.jf.FlyingAnimals;

public class Butterfly implements FlyingAnimals{

	@Override
	public String doSing(String type, String Sound) {
		
		if(type.equals("1"))
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
		System.out.println("Butterfly is Flying...");
		return "true";
	}


}
