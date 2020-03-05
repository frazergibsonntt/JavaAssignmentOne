package com.nttdata.assigntworedo.main;
import java.util.Scanner;
import com.nttdata.assigntworedo.loops.Loops;

public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 1, 2 or 3");
		int opt1 = myObj.nextInt();
		
		
		Loops myobj = new Loops();
		
		
		if (opt1 == 1) {
			myobj.forloop();
		} else if (opt1 == 2 ){
			myobj.whileloop();
		} else 
			myobj.dowhile();
		

		
	}
}
