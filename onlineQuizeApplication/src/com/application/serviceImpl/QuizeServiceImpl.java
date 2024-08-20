package com.application.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.application.entity.Question;
import com.application.service.QuizeService;

public class QuizeServiceImpl implements QuizeService {
	
		
	Question obj1 = new Question(1, "What is the size of an int in Java?", "8 bits", "16 bits", "32 bits", "64 bits", "C");
	Question obj2 = new Question(2, "Which of the following is a valid declaration of a variable in Java?", "int 1x = 10;", "int x = 10;", "float x = 10.0f;", "B and C", "D");
	Question obj3 = new Question(3, "Which of the following is a reserved keyword in Java?", "main", "volatile", "interface", "B and C", "D");
	Question obj4 = new Question(4, "What is the default value of a boolean variable?", "true", "false", "0", "null", "B");
	Question obj5 = new Question(5, "Which method is called when an object is created in Java?", "finalize()", "start()", "main()", "constructor", "D");
	Question obj6 = new Question(6, "Which of the following is not an OOP concept in Java?", "Inheritance", "Encapsulation", "Polymorphism", "Compilation", "D");
	Question obj7 = new Question(7, "What is the output of System.out.println(10 + 20 + 'Java');?", "30Java", "1020Java", "Java1020", "Java30", "A");
	Question obj8 = new Question(8, "Which of the following is used to achieve abstraction in Java?", "Interface", "Abstract class", "Both A and B", "None of the above", "C");
	Question obj9 = new Question(9, "Which operator is used by Java to allocate memory?", "malloc", "alloc", "new", "delete", "C");
	Question obj10 = new Question(10, "What is the correct way to declare a constant in Java?", "final int x = 10;", "constant int x = 10;", "int x = constant 10;", "const int x = 10;", "A");
	Question obj11 = new Question(11, "Which exception is thrown when dividing by zero occurs in Java?", "IOException", "ArithmeticException", "NullPointerException", "ClassNotFoundException", "B");
	Question obj12 = new Question(12, "What is the return type of the hashCode() method in Java?", "int", "Object", "long", "void", "A");
	Question obj13 = new Question(13, "Which of these is not a Java feature?", "Dynamic", "Architecture Neutral", "Use of Pointers", "Object-oriented", "C");
	Question obj14 = new Question(14, "What is the output of System.out.println('A' + 'B');?", "AB", "65", "131", "Exception", "C");
	Question obj15 = new Question(15, "What is the use of the toString() method in Java?", "Converts an object to a string representation", "Returns the class name of an object", "Converts a string to an object", "None of the above", "A");
		
//		List<Question> questionList = new ArrayList<>(List.of(
//	            obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15
//	        ));
		List<Question> questionList = new ArrayList<>(List.of(
	            obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10 ));

		@Override
		public int startQuiz() {
			Scanner sc = new Scanner(System.in);
	        int correctAnswers = 0;

	        for (Question question : questionList) {
	            System.out.println("\n"+question.getQuestion());
	            System.out.println("A) " + question.getOption1());
	            System.out.println("B) " + question.getOption2());
	            System.out.println("C) " + question.getOption3());
	            System.out.println("D) " + question.getOption4());
	            System.out.print("Your answer: ");
	            String answer = sc.nextLine();

	            if (answer.equalsIgnoreCase(question.getAnswer())) {
	                correctAnswers++;
	            }
	            
	        }
	        return correctAnswers;
		}
		
		

}
