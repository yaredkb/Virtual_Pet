package test;

import java.awt.Choice;
import java.io.IOException;
import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args){

		VirtualPet myPet = new VirtualPet();
		
		
		System.out.println("Virtual pet vense");
		System.out.println("  1. Hunger = 30");
		System.out.println("  2. thrst = 5");
		System.out.println("  3. waste =  2");
		System.out.println("  4.boredom = 40");
		System.out.println("  5. sickness= 5");
		System.out.println("\n" );
		int state = '1';
		do { 
			myPet.menuPrompt();
			Scanner kbEntery = new Scanner(System.in);
           state = kbEntery.nextInt();
			switch (state) {
			case 1:
				myPet.feed();
				myPet.tick();
				myPet.thrst();
				System.out.println("Vense's hunger level is " + myPet.getHunger());
				System.out.println("Vense's thrst level is " + myPet.getThrst());
				
				break;
			case 2:
				myPet.thrst();
				System.out.println("Vense's thrst level is " + myPet.getThrst());
				myPet.tick();
				break;
			case 3:
				myPet.waste();
				myPet.tick();
				break;
			case 4:
				myPet.bordom();
				myPet.tick();
				myPet.thrst();
				System.out.println("Vense's bored level is " + myPet.getBordom());
				System.out.println("Vense's thrst level is " + myPet.getThrst());
				break;
			case 5:
				myPet.sickness();
				myPet.tick();
				myPet.feed();
				System.out.println("Vense's hunger level is " + myPet.getHunger());
				break;
			case 6:
				System.out.println("Good Bye");
				break;
			default:
				System.out.println("You enterd wrong choice ! " + " " + state + " " + " this is not the righet choice. \n");
				break;
			}// end of switch

		} while (state != 6);
	
	}

}
