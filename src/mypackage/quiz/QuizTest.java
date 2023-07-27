package mypackage.quiz;

import mypackage.quiz.generators.QuestionGeneratorCapital; 
//import mypackage.quiz.generators.QuestionGeneratorMath;
public class QuizTest {

	public static void main(String[] args) {
		//Quiz quiz = new GUIQuiz(new QuestionGeneratorMath(2));
		Quiz quiz = new GUIQuiz(new QuestionGeneratorCapital(4));
		quiz.start();
		quiz.displayResult();
	}

}
