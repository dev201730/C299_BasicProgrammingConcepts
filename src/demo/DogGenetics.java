package demo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
	
   public static void generateDNA(String dog) {
	    
	    Random rng = new Random();
	    
		String [] dogBreedsArr = {"golden retriever", "labrador retriever", "french bulldog",
				"beagle", "german shepherd dog", "poodle", "bulldog"};
        // Convert String Array to List
        ArrayList<String> dogBreeds = new ArrayList<String>( Arrays. asList( dogBreedsArr ) );
        
		int availablePercentage = 100;
		
		output("Well then, I have this highly reliable report on "+dog+"'s prestigious background right here.\n");
		output(dog+" is:\n");
		
		for(int i=4; i>=0; i--) {
			
			//to make sure a UNIQUE dog breed is randomly selected each time
			int randIndex = rng.nextInt( dogBreeds.size() );
			String randBreed = dogBreeds.get(randIndex);
			dogBreeds.remove(randIndex);
			
			int randPercentage = 0;
			if(i!=0) {
				// (availablePercentage - i) is to make sure we have 
				// at least 1% available for the remaining breed compositions
				randPercentage = rng.nextInt(availablePercentage - i) + 1;
				availablePercentage = availablePercentage - randPercentage;
			}else {
				//The last option needs to contribute to ADD UP TO 100
				randPercentage = availablePercentage;	
			}
			output(randPercentage+"% "+randBreed);
			
			
			
		}
		
		
		output("\nWow, that's QUITE the dog!");
		
	}

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        
        String dogName = myObj.nextLine();
        generateDNA(dogName);
        
       
        myObj.close();

	}
	
    private static void output(String msg) {
		
		System.out.println(msg);
		
	}

}
