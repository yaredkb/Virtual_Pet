package test;

import java.util.Random;

public class VirtualPet {
	
		private int hunger;
		private int thrst ;
		private int waste ;
		private int boredom;
		private int sickness;
		private Random generator = new Random();
		
		public int getHunger(){
			return hunger;
		}
		public void tick(){
			hunger = hunger + 10;
			thrst = thrst + 10;
			waste = waste -10;
			//hunger += (5 + generateRandom());
		
		} 
		public void feed(){
			hunger = hunger - 15;
			if (hunger >= 25){
				System.out.println("I am so hungry,Please feed me");
			}if (hunger <25){
				System.out.println("I am not hungry");
			}
			}
		
	
		 
		public void thrst(){
			thrst = thrst - 5;
			if (thrst>=5){
				System.out.println("I am thirsty and dehydrated plese give me watter");
				
			}if (thrst < 5){
				System.out.println("I am not thirsty");
			}
		}
		     public int getThrst(){
			    return thrst;
		     }
			public void waste(){
				waste = waste - 5;
				if (waste>=2){
					System.out.println("I am wait and dehydrated plese give me watter");
				}if (waste < 5){
					System.out.println("I am not thirsty");
				}
			}
			public void bordom(){
				boredom = boredom - 5;
			
				if (boredom>=5){
					System.out.println("I am bord plese play with  me ");
				}if (boredom < 5){
					System.out.println("I am  thired");
				}	
			
			}
			public int getBordom(){
				return boredom;
			}
			public void sickness(){
				sickness = sickness - 5;
				if (sickness>=5){
					System.out.println("I am sick please take me to the hospital");
				}if (sickness < 5){
					System.out.println("I am not thirsty");
				}
			}
			public void menuPrompt(){
				System.out.println("What would you like to do");
				System.out.println("  1. feed it");
				System.out.println("  2. water it");
				System.out.println("  3. Let it out to the bathroom");
				System.out.println("  4. Play with it");
				System.out.println("  5. take it to the doctor");
				System.out.println("  6. to Exit");
				System.out.println(" Chose one :   or  6  To quit " );
			//	Scanner kbEntery = new Scanner(System.in);
			}
				}
	

	





