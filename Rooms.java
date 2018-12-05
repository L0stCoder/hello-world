/**
 * @(#)Rooms.java
 *
 *
 * @author 
 * @version 1.00 2018/11/29
 */

import java.util.Scanner;

public class Rooms{
	
	private int w1, x1, y1, z1, TestWin=1, win, Tries=0, guess;
	private int TotalPoints=0, ComNum=1, Guess=0;
	private String Tresure, Trap, Escape, Start;
    public Rooms(int points){
    	TotalPoints=points;
    }
   	public String Start(){
  		w1=(int)(Math.random()*5);
  		if(w1==0){
  			System.out.println("Welcome to my chamber!!");
  		}
  		else if(w1==1){
  			System.out.println("Hey, you. You're Finally awake.");
  		}
  		else if(w1==2){
  			System.out.println("Oops, you just upset the king!\nNow you ended up in a dungeon.");
  		}
  		else if(w1==3){
  			System.out.println("Would you like to play a game?");
  		}
  		else{
  			System.out.println("You just woke up in a dark room.");
  		}
   		return Start;
   	}
    
    public String Tresure(){
    	x1=(int)(Math.random()*8);
    	for(int win=0; win<TestWin; win++){
    		if(x1==0){
    			System.out.println("You found the Master sword");	
    			TotalPoints=TotalPoints+100;
    		}
    		else if(x1==1){
    			System.out.println("You find King Arthers Crown");
    			TotalPoints=TotalPoints+400;
    		}
    		else if(x1==2){
    			System.out.println("You find the long lost journal of Da Vinci");
    			TotalPoints=TotalPoints+300;
    		}
    		else if(x1==3){
    			System.out.println("Wow, you don't get to exit! But hey you didn't die");
    			TotalPoints=TotalPoints+0;
    		}
    		else if(x1==4){
    			System.out.println("eh, just an old left boot here");
    			TotalPoints=TotalPoints-10;
    		}
    		else if(x1==5){
    			System.out.println("You found the lost arc");
    			TotalPoints=TotalPoints+500;
    		}
    		else if(x1==6){
    			System.out.println("You find a Heavy Chest, inside crystals from 980BC");
    			TotalPoints=TotalPoints+50;
    		}
    		else{
    			System.out.println("WOW A ROOM FULL OF GOLD!");
    			TotalPoints=TotalPoints+1000;
    		}
    	}   	
    	return Tresure;
    }
    
    public String Trap(){
    	y1=(int)(Math.random()*8);
    	int delay=5;
    	if(y1==0){
    		System.out.print("You Found the EXIT");
    		for(int start=0; start<delay; start++){
    			try{
    				Thread.sleep(500);
    			}
    			catch (InterruptedException ie){
        	        ie.printStackTrace();
        	    }
    			System.out.print(".");
    		}
    		System.out.println("Right before you get to the exit, you run out of breath and pass out forever!");
    	}
    	else if(y1==1){
    		System.out.println("You manage to fall into a big pit with spikes at the bottom.");
    	}
    	else if(y1==2){
    		System.out.println("The door slowly closes behind you, the room is pitch black....");
    	}
    	else if(y1==3){
    		System.out.println("You are mauled by a lion.");
    	}
    	else if(y1==4){
    		System.out.print("The room floods as you open the door.");
    		for(int start=0; start<delay; start++){
    			try{
    				Thread.sleep(600);
    			}
    			catch (InterruptedException ie){
        	        ie.printStackTrace();
        	    }
    			System.out.print(".");
    		}
    		System.out.println("You drowned!");
    	}
    	else if(y1==5){
    		System.out.println("As you enter the door closes behind you. It starts to fill with posion gas.");
    	}
    	else if(y1==6){
    		System.out.print("When you walk in the door closes. You start to hear a sound as dirt start to fall.");
    		for(int start=0; start<delay; start++){
    			try{
    				Thread.sleep(600);
    			}
    			catch (InterruptedException ie){
        	        ie.printStackTrace();
        	    }
    			System.out.print(".");
    		}
    		System.out.println("You are now buried alive.");
    	}
    	else{
    		System.out.println("You suffer a bite from the most venomous snake. As the venom spreads you slowly die.");
    	}
    	System.out.println("You ended the game with: "+TotalPoints+" points!");
    	TotalPoints=0;
    	return Trap;	
    }
    
    public String Escape(){
    	Scanner input=new Scanner(System.in);
    	z1=(int)(Math.random()*8);
    	if(z1==0){
    		System.out.println("The door slowly opens, You feel the warm sunlight on your face\nBut there is an evil troll with a riddle!");
    	}
    	else if(z1==1){
    		System.out.println("Congrats on leaving the cave, But you see a dragon that is going to kill you!\nUnless you can guess the riddle!");
    	}
    	else if(z1==2){
    		System.out.println("Walking out of the cave hurts your eyes for a bit, but you lived for now.\nIt is time for a riddle now!");
    	}
    	else if(z1==3){
    		System.out.println("The door wont budge because it is sealed with a spell!\nYou have to guess the number to escape");
    	}
    	else if(z1==4){
    		System.out.println("You exit with no problem, Time for a riddle");	
    	}
    	else if(z1==5){
    		System.out.println("You find a computer that needs a number, But it is a random number!");	
    	}
    	else if(z1==6){
    		System.out.println("You walk through the door and see a amazing sunset, but you can't leave Yet!");	
    	}
    	else{
    		System.out.println("You have Escaped, But now time for a riddle!");	
    	}
    	guess=0;
    	Tries=0;
    	ComNum=(int)((Math.random()*50)+1);
    	while(guess!=ComNum){
    		while(Tries<10){
    			System.out.print("Please enter a number! [1-50]: ");
    			guess=input.nextInt();
    			if(guess<0||guess>50){
    				System.out.println("Please enter a number that is in the range!");
    				Tries++;
    			}
    			else if(guess<ComNum){
    				System.out.println("Your guess is under the Computer's Number!");
    				Tries++;
    			}
    			else if(guess>ComNum){
    				System.out.println("Your guess is over the Computer's Number!");
    				Tries++;
    			}
    			else{
    				Tries=10;
    			}
    		}
    	}
    	if(Tries<11){
    		System.out.println("You just won!");
    		if(TotalPoints>-1000)
   			System.out.println("Your total points: "+TotalPoints);
    	}
    	else{
    		System.out.println("Sorry but you lost!");
    		guess=ComNum;
    		if(TotalPoints>-1000)
   			System.out.println("Your total points: "+TotalPoints);
    	}
    	return Escape;
    }    
}