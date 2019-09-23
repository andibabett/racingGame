package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;


    public void start();

    {


    }


    //23.09.2019
    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You have entered an invalid number");
        } finally {
            System.out.println("Finally block is always executed.");
        }
        return 0;
    }

}



