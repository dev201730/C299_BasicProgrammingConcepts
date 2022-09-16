package demo;
import java.util.*;

public class HealthyHearts {
	
	public static void calculateHealthyRange(int num) {
		
		int maxHeartRate = 220 - num;
		
		double minHeartRateZoneD = Math.ceil(50* (double)maxHeartRate / 100);
		int minHeartRateZone = (int) minHeartRateZoneD;
		
		double maxHeartRateZoneD = Math.ceil(85* (double)maxHeartRate / 100);
		int maxHeartRateZone = (int) maxHeartRateZoneD;
		
		output("Your maximum heart rate should be "+maxHeartRate+" beats per minute");
		output("Your target HR Zone is "+minHeartRateZone+" - "+maxHeartRateZone+" beats per minute");
		
	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
        System.out.println("What is your age?");
        String userInput = myObj.nextLine();
        if(isInputValid(userInput)) {
        	int age = Integer.parseInt(userInput);
        	calculateHealthyRange(age);
        }
        else {
    		output("PLEASE ENTER A VALID AGE");
    	}
        myObj.close();

	}
	
	private static boolean isInputValid(String input) {

		boolean result = false;

		int tempInput;
		try {
			tempInput = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return result;
		}

		if ((1 <= tempInput) && (tempInput < 220)) {
			result = true;
		}
			
		return result;

	}

	private static void output(String msg) {
		
		System.out.println(msg);
		
	}


}
