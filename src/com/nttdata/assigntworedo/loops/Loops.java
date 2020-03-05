package com.nttdata.assigntworedo.loops;

import java.util.Scanner;

import com.nttdata.assigntworedo.main.Main;

public class Loops {

	public void forloop() {
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("How many lines do you want to print?");
		int opt2 = myObj2.nextInt();

		for (int i = 0; i < opt2; i++) {

			System.out.println("for loop");
		}
	}

	public void whileloop() {
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("How many lines do you want to print?");
		int opt2 = myObj2.nextInt();
		int i = 0;
		while (i < opt2) {
			System.out.println("while loop");
			i++;
		}
	}

	public void dowhile() {
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("How many lines do you want to print?");
		int opt2 = myObj2.nextInt();
		int i = 0;
		do {
			System.out.println("do while loop");
			i++;
		} while (i < opt2);
	}
}
