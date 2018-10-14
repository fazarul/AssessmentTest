
package com.jf.classes;
import com.jf.OtherAnimals;
import com.jf.SwimmingAnimals;




public class Rooster implements OtherAnimals {

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
	public String doWalk() {
	
		System.out.println("Rooster are Walking...");
		return "true";
	}

}
