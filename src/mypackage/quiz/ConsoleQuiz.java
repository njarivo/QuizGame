package mypackage.quiz;

import java.util.Scanner;

import mypackage.quiz.generators.QuestionGeneratorCapital; 

public class ConsoleQuiz extends Quiz {
	Scanner keyboard = new Scanner(System.in);
	
	public ConsoleQuiz(QuestionGeneratorCapital generator) {
		super(generator); 
	} 
	
	@Override
	public void displayMessage(String message) {
		System.out.println(message);		
	}

	@Override
	public String retrieveAnswer(String prompt) {
		displayMessage(prompt);
		return keyboard.nextLine();
	}

}