package main;

import boundary.ScreenInterface;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		ScreenInterface screenInterface = new ScreenInterface();
		screenInterface.getInput();
	}

}
