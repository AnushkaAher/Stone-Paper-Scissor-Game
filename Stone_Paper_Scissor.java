//importing a class for taking the inputs from user
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

//importing a class for generating random input from computer
import java.util.Random;

class Stone_Paper_Scissor
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Stone-Paper-Scissor Game!!");
        System.out.println("This game will be played between You and computer");
        
        System.out.println("*******************************************************");

        System.out.println("Enter 0 for Stone");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");

        System.out.println("*******************************************************");

        String user=" ";
        String Computer=" ";


        //taking input from user
        Scanner usc=new Scanner(System.in);
        int user_input=usc.nextInt();

        //genearting a random input from computer
        Random ran=new Random();
        int comp_input=ran.nextInt(3);

        if(user_input==comp_input)
        {
            System.out.println("DRAW");
        }

        else if((user_input==0 && comp_input==2)||(user_input==1 && comp_input==0)||(user_input==2 && comp_input==1))
        {
            System.out.println("WOHHHHHH !!!! YOU WIN");
        }
        else
        {
            System.out.println("OOF !! BETTER LUCK NEXT TIME");
        }

        switch(user_input)
        {
            case 0:
            user="Stone";
            break;

            case 1:
            user="Paper";
            break;

            case 2:
            user="Scissor";
            break;
        }

        switch(comp_input)
        {
            case 0:
            Computer="Stone";
            break;

            case 1:
            Computer="Paper";
            break;


            case 2:
            Computer="Scissor";
            break;

        }

        System.out.printf("You choosed-%s and computer choosed-%s ",user,Computer);




        
    }
}