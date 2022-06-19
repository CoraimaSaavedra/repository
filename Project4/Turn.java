package CoraimaSaavedra_Project4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Turn {
		
		// Variables
			private int turns;
			private int cntTurns;
			private String[] dieLR = new String[3];
			private String turnRecord;
			private String[] turnHist;
			
			Scanner input = new Scanner(System.in);
			
			
		// Methods
			
			// Set turns from user input
			public void setTurns() {
				//Scanner input = new Scanner(System.in);
				System.out.print("Enter number of turns in this game: ");
				turns = input.nextInt();
				cntTurns = 0;
				turnHist = new String[turns];
				System.out.println();
			}
			
			// Get turns
			public int getTurns() {
				return turns;
			}
			
			// Increm turns
			public void incremCntTurn() {
				cntTurns++;
			}
			
			// Get cntTurns
			public int getCntTurns() {
				return cntTurns;
			}
			
			// Set L or R flag for each die
			public void setDieLR(Roll roll) {
				//Scanner input = new Scanner(System.in);
				for (int i = 0; i < 3; i++) {		// This loop set the flag to L or R for each die
					System.out.print("Die" + (i+1) + "  value: " + roll.getRoll1(i) + "  Enter L or R: ");
					dieLR[i] = input.next();
					dieLR[i] = dieLR[i].toUpperCase();
				}
				System.out.println();
				System.out.println();
			}
			
			// Get dieLR array
			public String[] getDieLR() {
				return dieLR;
			}
			
			// Set turn record
			public void setTurnRecord(String name, Roll roll, String dateTimeFormat) {
				turnRecord = name + " " + dateTimeFormat + " Turn-" + (cntTurns+1) + "  " + 
						roll.getRoll1()[0] + " " + roll.getRoll1()[1] + " " + roll.getRoll1()[2] + "  " +
						roll.getRoll2()[0] + " " + roll.getRoll2()[1] + " " + roll.getRoll2()[2] + 
						"  Pts: " + roll.getPoints2() + "  Imprv: " + (roll.getPoints2() - roll.getPoints1());
			}
			
			// Get turn record
			public String getTurnRecord() {
				return turnRecord;
			}
			
			// Update turn history array
			public void setTurnHist() {
				turnHist[cntTurns] = turnRecord;
			}
			
			// Get turn history array
			public String[] getTurnHist() {
				return turnHist;
			}
			
			// Print turn history
			public void prtTurnHist(Turn turn, String name, Roll roll, String dateTimeFormat) {
				System.out.println(name + " " + dateTimeFormat + " Turn-" + (this.cntTurns+1) + "  " + 
						roll.getRoll1()[0] + " " + roll.getRoll1()[1] + " " + roll.getRoll1()[2] + "  " +
						roll.getRoll2()[0] + " " + roll.getRoll2()[1] + " " + roll.getRoll2()[2] + 
						"  Pts: " + roll.getPoints2() + "  Imprv: " + (roll.getPoints2() - roll.getPoints1()));   
			}
			
			// Close Scanner object input
			public void closeScanner() {
				input.close();
			}
		}