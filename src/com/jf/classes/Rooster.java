
package com.jf.classes;
import com.jf.OtherAnimals;
import com.jf.SwimmingAnimals;




public class Rooster implements OtherAnimals {

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
	public int doWalk() {
	
		System.out.println("Rooster are Walking...");
		return 1;
	}

}
