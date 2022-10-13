package org.bike;

public class Ktm implements Bike {
		@Override
	public void cost() {
		System.out.println("Cost  : 2.4lack");

	}

	@Override
	public void speed() {
		System.out.println("Speed : 180");

	}public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}

}
