package additionGameExtra;

import java.util.Scanner;

public class additiongameextra {

	
	
		// Below are variables used throughout all methods
	
	 public static int numberOfRounds        = 4;
	    public static int score                 = 0;
	    public static int hardnessOfQuestion    = 10;
	    public static int correctAnswer;
	    public static Scanner input             = new Scanner(System.in);

	    public static void main(String[] args) {    

	        for(int i=1;i<numberOfRounds+1;i++){

	            outputMessage("Round " + i + ". Begin.");

	            if ( correctAnswer() ){         
	                outputMessage("Answer was correct.");           
	                increaseScoreByHardness(hardnessOfQuestion);
	                outputScore();
	                increaseHardnessByFactor(10);           
	            }else{
	                outputMessage("Answer was not correct");            
	                outputCorrectAnswer();

	                if(hardnessOfQuestion>10){
	                    decreaseHardnessByFactor(10);
	                }
	            }           

	            if(i<numberOfRounds){
	                outputMessage("End of round " + i);     
	            }else{
	                outputMessage("End of final round");
	            }
	        }   //End For Loop

	        outputMessage("Thanks for playing!");
	        outputMessage("Out of " + numberOfRounds + " total rounds...");
	        outputFinalScore();

	    }   //End Main Method

	    public static boolean correctAnswer(){
	        int number1 = randNumByHardness(hardnessOfQuestion);        
	        int number2 = randNumByHardness(hardnessOfQuestion);

	        int correctAnswer = number1 + number2;

	        System.out.println("What is " + number1 + " + " + number2 + "?");
	        System.out.println("Please answer in integers only.");

	        int studentAnswer = input.nextInt();

	        if(studentAnswer == correctAnswer){
	            return true;
	        }else{
	            return false;
	        }       
	    }

	    public static int randNumByHardness(int hardness){
	        return (int)(Math.random() * hardness);
	    }

	    public static void increaseHardnessByFactor(int number){
	        hardnessOfQuestion *= number;
	    }

	    public static void decreaseHardnessByFactor(int number){
	        hardnessOfQuestion /= number;
	    }

	    public static void increaseScoreByHardness(int hardness){
	        score += hardness;
	    }

	    public static void outputScore(){
	        System.out.println("Your current score is: " + score);
	    }

	    public static void outputFinalScore(){
	        System.out.println("Your final score is: " + score);
	        if(score==0){
	            System.out.println("Were you even trying?");
	        }
	    }

	    public static void outputHardness(){
	        System.out.println("Current hardness is: " + hardnessOfQuestion);
	    }

	    public static void outputMessage(String message){
	        System.out.println(message);
	    }

	    public static void outputCorrectAnswer(){
	        System.out.println("The correct answer was: " + correctAnswer);
	    }
	}