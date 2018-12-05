/**
 * Create a cave that has three doors, Let one lead to tresure, one to a trap, and another to the exit.
 * Let each do randomize each itteration of the program
 * 
 */

import java.util.Scanner;
public class CaveV2{
    public static void main(String[]args){
      	int Loop=0;
      	int Escape1, Trap1, Tresure1;
      	int Points=0;
      	RoomsV2 Tresure, Trap, Escape, Start;
      	Rooms out = new Rooms(Points);
    	Scanner input=new Scanner(System.in);
 		out.Start();
 		System.out.print("[0 = quit, 1 = play]: ");
  		Loop=input.nextInt();
 		while(Loop==1){
 			Escape1=(int)((Math.random()*3)+1);  		//=======================================//
    		Trap1=(int)((Math.random()*3)+1);    		//										 //
    		while(Escape1==Trap1){			    		//		   This is the randomizer		 //
    			Trap1=(int)((Math.random()*3)+1);		//		It give random numbers 0-2 to    //
    		}											//      each door but will never over-   //
    		Tresure1=(int)((Math.random()*3)+1);		//      lap with eachother. It will add  //
    		while(Escape1==Tresure1||Trap1==Tresure1){	//      one making it 1-3.				 //
    			Tresure1=(int)((Math.random()*3)+1);	//										 //
    		}											//=======================================//
    		
			System.out.println("You see three doors.\nOne will lead you tresure, One to your Death, and One will lead you to freedom.");
			System.out.print("Which door would you like to go in? [1, 2, 3]: ");			
			int door=input.nextInt();
 			if(door==Escape1){
 				out.Escape();
 			}
 			else if(door==Trap1){
 				out.Trap();
 			}
 			else if(door==Tresure1){
 				out.Tresure();
 				if(Escape1>Trap1){
 					System.out.print("What door would you like to enter now? ["+Trap1+", "+Escape1+"]: ");
 					door=input.nextInt();
 				}
 				else{
 					System.out.print("What door would you like to enter now? ["+Escape1+", "+Trap1+"]: ");
 					door=input.nextInt();
 				}
 				if(door==Escape1){
 					out.Escape();
 				}
 				else if(door==Trap1){
 					out.Trap();
 				}
 			}
 			else{
 				System.out.println("That isn't in the range!");
 			}
 			System.out.print("Would you like to retry? [0 = no, 1 = yes]: ");
 			Loop=input.nextInt();
 		}
 	}
}