package com.application;

import java.util.Scanner;

import com.application.service.QuizeService;
import com.application.serviceImpl.QuizeServiceImpl;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Quiz!");
        System.out.println("Are you ready to start? (Y/y to start)");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        
        QuizeService QuizeServiceObj=new QuizeServiceImpl();

        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println("Answer the following 10 questions to test your Java knowledge.\n");


        	int correctAnswers=QuizeServiceObj.startQuiz();
        	double percentage = ((double) correctAnswers / 10) * 100;

            System.out.println("\nQuiz Completed!");
            System.out.println("Total Correct Answers: " + correctAnswers + "/" + 10);
            System.out.printf("Percentage: %.2f%%\n", percentage);

            if (percentage == 100) {
                System.out.println("Excellent work! You have mastered the basics of Java.");
            } else if (percentage >= 80) {
                System.out.println("Great job! You have a strong understanding of Java, but there's always room for improvement.");
            } else if (percentage >= 50) {
                System.out.println("Good effort! You have a decent understanding of Java, but reviewing key concepts could help you improve.");
            } else {
                System.out.println("Don't worry! Keep practicing and reviewing the basics to strengthen your Java skills.");
            }
        	
        } else {
            System.out.println("Quiz cancelled. Have a nice day!");
        }
    }

}
