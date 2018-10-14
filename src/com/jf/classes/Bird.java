package com.jf.classes;

import com.jf.FlyingAnimals;
import com.jf.OtherAnimals;

public class Bird implements FlyingAnimals,OtherAnimals {

	@Override
	public String doSing(String type,String Sound) {
		if(type.equals("butterfly")){
			System.out.println("butterFly won't sing");
			return "false";
		}
		else{
			System.out.println(Sound);
			return "true";
		}
	}

	@Override
	public String doFly() {
		// TODO Auto-generated method stub
		System.out.println("Birds are Flying");
		return "true";
	}

	@Override
	public String doWalk() {
		// TODO Auto-generated method stub
		System.out.println("Birds are Walking...");
		return "true";
	}

}
