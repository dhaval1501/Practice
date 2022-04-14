package com.company;

import java.util.Scanner;

import java.util.Random;

class Game {
    public int n, un;
    public static int onOfGuesses =0;

     Game() {
        Random r = new Random();
        n = r.nextInt(101);
    }

    public void takeUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        un = s.nextInt();


    }

    public boolean isCorrectNumber() {
        onOfGuesses++;
        if (n == un) {

            System.out.println("you guess right");
            return true;
        } else if (n < un) {
            System.out.println("lower");
        } else if (n > un) {
            System.out.println("upper");
        }
        return false;
    }


}



public class guessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
            System.out.println(Game.onOfGuesses);

    }

}
