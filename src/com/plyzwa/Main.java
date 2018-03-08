package com.plyzwa;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Patryk", 1);
        displayHighScorePosition("Marek", 3);

        int[] score = new int[4];
        score[0] = 1500;
        score[1] = 900;
        score[2] = 400;
        score[3] = 50;
        for (int i=0;i<score.length;i++) {
            System.out.println("The score of " + score[i]
            + " gives you " + calculatedHighScorePostion(score[i]) +
            " postion!");
        }
    }
    public static void displayHighScorePosition(String name, int pos) {
        System.out.println(name + " managed to get into position: " + pos
        + " on the high score table!");
    }
    public static int calculatedHighScorePostion(int score) {
        if (score>1000) {
            return 1;
        } else if (score>500 && score<1000) {
            return 2;
        } else if (score>100 && score<500) {
            return 3;
        } else {
            return 4;
        }
    }
}
