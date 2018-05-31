package com.company;

import java.util.Scanner;

public class BooleanDecisionsAssignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = in.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score > 89){
            grade = 'A';
            if(score > 96){
                System.out.println(grade + "+");
            }else if(score < 93 || score <= 90){
                System.out.println(grade + "-");
            }else{
                System.out.println(grade);
            }
        } else if (score > 79){
            grade = 'B';
            if(score > 86){
                System.out.println(grade + "+");
            }else if(score < 83 || score <= 80){
                System.out.println(grade + "-");
            }else{
                System.out.println(grade);
            }
        }else if (score > 69){
            grade = 'C';
            if(score > 76){
                System.out.println(grade + "+");
            }else if(score < 73 || score <= 70){
                System.out.println(grade + "-");
            }else{
                System.out.println(grade);
            }
        }else if(score > 59){
            grade = 'D';
            if(score > 66){
                System.out.println(grade + "+");
            }else if(score < 63 || score <= 60){
                System.out.println(grade + "-");
            }else{
                System.out.println(grade);
            }
        }else {
            grade = 'F';
        }

        if (score > 69) {
            System.out.println("Very good! You don't have to retake the exam!");
        }
        else
            System.out.println("Did you even look at the book?");
    }
}
