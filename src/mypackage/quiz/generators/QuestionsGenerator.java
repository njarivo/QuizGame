package mypackage.quiz.generators;

import java.util.ArrayList;

import mypackage.quiz.Question;

abstract public class QuestionsGenerator {

	protected int numberOfQuestions;
	
	public QuestionsGenerator(int numberOfQuestions) { 
		this.numberOfQuestions = numberOfQuestions;
	}
	
	abstract public ArrayList<Question> generateQuestions() throws Exception;
	
	public int getNumberOfQuestion() {
		return numberOfQuestions;
	}

}
