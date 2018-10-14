package com.jf.classes;

import com.jf.SwimmingAnimals;

public class Dolphin implements SwimmingAnimals {

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
	public String doSwim() {
		// TODO Auto-generated method stub
		System.out.println("Dolphin are Swimming...");
		return "true";
	}
	
	public String doOtherActivities(){
		System.out.println("Dolphin rescue the people");
		return "true";
	}
}
