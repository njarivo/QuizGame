package mypackage.quiz;

import mypackage.quiz.generators.QuestionsGenerator; 
import mypackage.quiz.utils.TimeConverter;

abstract public class Quiz {
	private QuestionsGenerator generator;
	private int score = 0;
	private long timeElapsed; 
	private boolean isDone = false; 
	
	public Quiz(QuestionsGenerator generator) {
		this.generator = generator;
	}
	
	abstract public void displayMessage(String message);
	
	abstract public String retrieveAnswer(String prompt);
	
	public void start() {
		try {
			long startTime = System.currentTimeMillis();
			for (Question question : generator.generateQuestions()) { 
				String userCapital = retrieveAnswer(question.getText());
	 
				if (userCapital.equalsIgnoreCase(question.getResponse())) {
					displayMessage("Very good!"); 
					score++;
				} else {
					displayMessage(String.format("%s is incorrect! the correct answer is %s \n", userCapital, question.getResponse())); 
				}
			}

			long endTime = System.currentTimeMillis();
			timeElapsed = endTime - startTime;
			isDone = true;
			
		// catching the exception from if(numberOfQuestions > data.length)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// close the scanner at the end
		//keyboard.close();
	}
	 
	public void displayResult() {
		if(isDone) {
			displayMessage(String.format("Your final score is  %d/%d \n", score, generator.getNumberOfQuestion()));
			displayMessage(String.format("You finished the Quizz in  %d  seconds \n", TimeConverter.toSeconds(timeElapsed))); 
		}
	} 

}
