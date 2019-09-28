package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;



    public void start();
    //23.09.2019

    {

        Track selectedTrack = getSelectedTrackFromUser();

    }



    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track");
        Scanner scanner = new Scanner(System.in);

        int userChoise;

        try {
            int userChoise = scanner.nextInt();
            return tracks(userChoise - 1);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException) {
            System.out.println("You have entered an invalid number.");
            //recursion - a method calling itself
            return getSelectedTrackFromUser();
        }


    }


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



