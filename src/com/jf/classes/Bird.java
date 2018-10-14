package com.jf.classes;

import com.jf.FlyingAnimals;
import com.jf.OtherAnimals;

public class Bird implements FlyingAnimals,OtherAnimals {

	@Override
	public int doSing(String type,String Sound) {
		if(type.equals("1")){
			System.out.println("butterFly won't sing");
			return 0;
		}
		else{
			System.out.println(Sound);
			return 1;
		}
	}

	@Override
	public int doFly() {
		// TODO Auto-generated method stub
		System.out.println("Birds are Flying");
		return 1;
	}

	@Override
	public int doWalk() {
		// TODO Auto-generated method stub
		System.out.println("Birds are Walking...");
		return 1;
	}

}
