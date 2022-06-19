package CoraimaSaavedra_Project4;

import java.util.Arrays;
import java.util.Random;
import javafx.scene.control.RadioButton;
import CoraimaSaavedra_Project4.Turn;
import CoraimaSaavedra_Project4.DiceGame;
public class Roll extends DiceGame {

	
	// Variables
		private int[] roll1 = new int[3];
		private int[] roll2 = new int[3];
		private boolean[] lockNRoll = new boolean [6];
		
		private int sum1;
		private int pairBonus1;
		private int tripBonus1;
		private int strBonus1;
		private int points1;
		private int sum2;
		private int pairBonus2;
		private int tripBonus2;
		private int strBonus2;
		private int points2;
		private boolean reroll;
		
	// Methods
		
		// Set roll1 random values 
		public void setRoll1() {
			Random random = new Random();
			for (int i = 0; i < 3; i++) {
				roll1[i] = random.nextInt(6) + 1;
			}
		}
		
		// TEMP **** Set roll1
		public void setRoll1(int x, int y, int z) {
			roll1[0] = x;
			roll1[1] = y;
			roll1[2] = z;
		}
		
		// Get roll1 array
		public int[] getRoll1() {
			return roll1;
		}
		
		// Get roll1 individual die values
		public int getRoll1(int index) {
			return roll1[index];
		}
		
		// Sort roll1 or roll2
		public void sortRoll(int[] roll) {
			Arrays.sort(roll);
		}
		
		// Set roll1 sum
		public void setSum1() {
			sum1 = roll1[0] + roll1[1] + roll1[2];
		}
		
		// Get roll1 sum
		public int getSum1() {
			return sum1;
		}
		
		// Set roll1 pair bonus
		public void setPairBonus1() {
			pairBonus1 = 0;
			if (roll1[0] == roll1[1] || roll1[0] == roll1[2] || roll1[1] == roll1[2]) {
				pairBonus1 = 2;
			}
		}
		
		// Get roll1 pair bonus
		public int getPairBonus1() {
			return pairBonus1;
		}
		
		// Set roll1 trip bonus
		public void setTripBonus1() {
			tripBonus1 = 0;
			if (roll1[0] == roll1[1] && roll1[0] == roll1[2]) {
				tripBonus1 = 30;
				pairBonus1 = 0;
			}
		}
		
		// Get roll1 trip bonus
		public int getTripBonus1() {
			return tripBonus1;
		}
		
		// Set roll1 straight bonus
		public void setStrBonus1() {
			strBonus1 = 0;
			if (roll1[1] == roll1[0] + 1 && roll1[2] == roll1[1] + 1) {
				strBonus1 = 10;
			}
		}
		
		// Get roll1 straight bonus
		public int getStrBonus1() {
			return strBonus1;
		}
		
		// Set roll1 points
		public void setPoints1() {
			points1 = sum1 + pairBonus1 + tripBonus1 + strBonus1;
		}
		
		// Get roll1 points
		public int getPoints1() {
			return points1;
		}
		
		//
		public boolean[] getLockNRoll(RadioButton[] lr) {
			for(int i = 0; i < 6; i++) {
					lockNRoll[i] = lr[i].isSelected();  
			}
			return lockNRoll;
		}
		
		// Get roll2 individual die values
		public void setRoll2(int index) { 
			roll2[index] = getDieValue();
		}
		
		//
		public void setRoll2(boolean[] lockNRoll) {
			reroll = false;
			for (int i=0; i < 3; i++) {
				roll2[i] = roll1[i];
			}
			for (int i = 3; i < 6; i++) {
				if (lockNRoll[i]) {
					roll2[i-3] = getDieValue();
					reroll = true;
				}
			}
		}
		
		// Set roll2 with random values for R-input dice
		public void setRoll2(Turn turn) {
			reroll = false;
			for (int i = 0; i < 3; i++) {
				roll2[i] = roll1[i];
			}
			for (int i = 0; i < 3; i++) {
				if (turn.getDieLR()[i].equals("R")) {
					roll2[i] = getDieValue(); 
					reroll = true;
				}
			}
		}
		
		// Get roll2 
		public int getRoll2(int index) {
			return roll2[index];
		}
		// Get roll2 array
		public int[] getRoll2() {
			return roll2;
		}
		
	// Set roll2 sum
		public void setSum2() {
			sum2 = roll2[0] + roll2[1] + roll2[2];
		}
		
		// Get roll2 sum
		public int getSum2() {
			return sum2;
		}
		
		// Set roll2 pair bonus
		public void setPairBonus2() {
			pairBonus1 = 0;
			if (roll2[0] == roll2[1] || roll2[0] == roll2[2] || roll2[1] == roll2[2]) {
				pairBonus2 = 2;
			}
		}
		
		// Get roll2 pair bonus
		public int getPairBonus2() {
			return pairBonus2;
			
		}
		
		
		// Set roll2 trip bonus
		public void setTripBonus2() {
			tripBonus2 = 0;
			if (roll2[0] == roll2[1] && roll2[0] == roll2[2]) {
				tripBonus2 = 30;
				pairBonus2 = 0;
			}
		}
		
		// Get roll2 trip bonus
		public int getTripBonus2() {
			return tripBonus2;
		}
		
		// Set roll2 straight bonus
		public void setStrBonus2() {
			strBonus2 = 0;
			if (roll2[1] == roll2[0] + 1 && roll2[2] == roll2[1] + 1) {
				strBonus2 = 10;
			}
		}
		
		// Get roll2 straight bonus
		public int getStrBonus2() {
			return strBonus2;
		}
		
		// Set roll2 points
		public void setPoints2() {
			points2 = sum2 + pairBonus2 + tripBonus2 + strBonus2;
		}
		
		// Get roll1 points
		public int getPoints2() {
			return points2;
		}
		
		// Get improvement from roll1 to roll2
		public int getImprovement() {
			return getPoints2() - getPoints1();
		}
}

