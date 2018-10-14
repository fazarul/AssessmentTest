package com.jf.classes;


public class RunnerClass {
	
    static int  flyCount=0;
	static int walkCount=0;
	static int singCount=0;
	static int swimCount=0;
	
	
	public static void main(String a[]){
		
		//Bird
		Bird bird = new Bird();
		flyCount += bird.doFly();
		walkCount += bird.doWalk();
		singCount += bird.doSing("2", "Booo Booo Booo");
		//Duck
		Duck duck = new Duck();
		singCount += duck.doSing("2", "Quack Quack");
		swimCount += duck.doSwim();
		walkCount += duck.doWalk();
		
	//  Chicken
		Chicken chicken = new Chicken();
		singCount += chicken.doSing("2", "Cluck Cluck");
		walkCount += chicken.doWalk();
		
	// Rooster
		Rooster rooster = new Rooster();
		singCount += rooster.doSing("2", "Cock-a-doodle-doo");
		walkCount += rooster.doWalk();
	
	
		// Parrot
		Parrot parrot = new Parrot();
		singCount += parrot.doSing("2", "Woof,woof");
		singCount += parrot.doSing("2", "Meow");
		singCount += parrot.doSing("2", "Cock-a-doodle-doo");
		flyCount += parrot.doFly();
	
		// Fish
		Fish fish = new Fish();
		singCount += fish.doSing("1", "No Sound");
		swimCount += fish.doSwim();
		
		Shark shark = new Shark();
		singCount += shark.doSing("1", "No Sound");
		swimCount += shark.doSwim();
		shark.doOtherActivities();
		
		ClownFish clown = new ClownFish();
		singCount += clown.doSing("1", "No Sound");
		swimCount += clown.doSwim();
		clown.doOtherActivities();
		
		Dolphin dolphin = new Dolphin();
		singCount += dolphin.doSing("1", "No Sound");
		swimCount += dolphin.doSwim();
		dolphin.doOtherActivities();
		
		Butterfly butterfly = new Butterfly();
		singCount += butterfly.doSing("1", "No Sound");
		flyCount += butterfly.doFly();
		
		CatterPiller catter = new CatterPiller();
		singCount += catter.doSing("1", "No Sound");
		walkCount += catter.doWalk();
		
		
	System.out.println("how many of these animals can fly?"+  flyCount);
	System.out.println("how many of these animals can walk?"+   walkCount);
	System.out.println("how many of these animals can sing?"+  singCount);
	System.out.println("how many of these animals can swim?" + swimCount);
	
		
	}

}
