package mypackage.quiz.generators;

import java.util.ArrayList;
import java.util.Random;

import mypackage.quiz.Question;

public class QuestionGeneratorMath extends QuestionsGenerator {

	public QuestionGeneratorMath(int numberOfQuestions) {
		super(numberOfQuestions); 
	}

	@Override
	public ArrayList<Question> generateQuestions() {
		ArrayList<Question> questions = new ArrayList<Question>();

		Random random = new Random();
		char[] operators = { '+', '-', '*', '/' };

		for (int i = 0; i < numberOfQuestions; i++) {
			int nbr1 = random.nextInt(15);
			int nbr2 = random.nextInt(15) + 1; // to avoid to have divide by 0
			char operator = operators[random.nextInt(operators.length)];
			
			String questionText = String.format("%d %c %d = ?", nbr1, operator, nbr2);
			questions.add(new Question(questionText, Calculate(operator, nbr1, nbr2)));
		}

		return questions;
	}

	private String Calculate(char operator, int nbr1, int nbr2) {
		String result = "";
		switch (operator) {
			case '+': {
				result = String.valueOf(nbr1+nbr2);
				 break;
			}
			case '-': {
				result = String.valueOf(nbr1-nbr2);
				 break;
			}
			case '*': {
				result = String.valueOf(nbr1*nbr2);
				 break;
			}
			case '/': {
				result = String.valueOf(nbr1/nbr2);
				 break;
			}
		}
		return result;
	}

}
