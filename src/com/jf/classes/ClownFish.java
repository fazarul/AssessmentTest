
package com.jf.classes;

import com.jf.SwimmingAnimals;

public class ClownFish implements SwimmingAnimals {

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
		System.out.println("ClownFish are Swimming...");
		return "true";
	}
	
	public String doOtherActivities(){
		System.out.println("ClownFish is very small,colorful and make");
		return "true";
	}
}
