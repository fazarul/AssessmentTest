package com.jf.classes;

import com.jf.SwimmingAnimals;

public class Shark implements SwimmingAnimals {

	@Override
	public int doSing(String type, String Sound) {
		
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
	public int doSwim() {
		// TODO Auto-generated method stub
		System.out.println("Shark are Swimming...");
		return 1;
	}
	
	public int doOtherActivities(){
		System.out.println("Shark is very large and eats other fish");
		return 1;
	}
}
