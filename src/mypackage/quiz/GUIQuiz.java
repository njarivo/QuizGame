package mypackage.quiz;

import javax.swing.JOptionPane;

import mypackage.quiz.generators.QuestionsGenerator;

public class GUIQuiz extends Quiz {

	public GUIQuiz(QuestionsGenerator generator) {
		super(generator); 
	}

	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		return JOptionPane.showInputDialog(prompt); 
	}	
}