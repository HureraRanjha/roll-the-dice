package com.pluralsight;

public class Dice
{
    public static void main(String[] args)
    {

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        for (int i = 1; i < 101; i++)
        {
            int roll1 = roll();
            int roll2 = roll();
            int diceTotal = roll1 + roll2;

            System.out.printf("Roll %d: \t %d  -  %d\t Sum:  %d \n", i, roll1, roll2, diceTotal );

            if(diceTotal == 2){twoCounter++;}
            if(diceTotal == 4){fourCounter++;}
            if(diceTotal == 6){sixCounter++;}
            if(diceTotal == 7){sevenCounter++;}
        }

        System.out.println("2 Counter: " + twoCounter);
        System.out.println("4 Counter: " + fourCounter);
        System.out.println("6 Counter: " + sixCounter);
        System.out.println("7 Counter: " + sevenCounter);


    }

    public static int roll()
    {
        return (int)(Math.random()* 6) + 1;
    }
}
