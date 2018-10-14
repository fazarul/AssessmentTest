package com.jf.classes;


public class RunnerClass {
	
	public static void main(String a[]){
		
		//Bird
		Bird bird = new Bird();
		bird.doFly();
		bird.doWalk();
		bird.doSing("2", "Booo Booo Booo");
		//Duck
		Duck duck = new Duck();
		duck.doSing("2", "Quack Quack");
		duck.doSwim();
		duck.doWalk();
		
	//  Chicken
		Chicken chicken = new Chicken();
		chicken.doSing("2", "Cluck Cluck");
		chicken.doWalk();
		
	// Rooster
		Rooster rooster = new Rooster();
		rooster.doSing("2", "Cock-a-doodle-doo");
		rooster.doWalk();
	
	
		// Parrot
		Parrot parrot = new Parrot();
		parrot.doSing("2", "Woof,woof");
		parrot.doSing("2", "Meow");
		parrot.doSing("2", "Cock-a-doodle-doo");
		parrot.doFly();
		
	}

}
