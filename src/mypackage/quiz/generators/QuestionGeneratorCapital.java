package mypackage.quiz.generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import mypackage.quiz.Question;

public class QuestionGeneratorCapital extends QuestionsGenerator {
	
	public QuestionGeneratorCapital(int numberOfQuestions) {
		super(numberOfQuestions);
	}

	public ArrayList<Question> generateQuestions() {
		String [][] data = getData();
		String country, theCapital;
		ArrayList<Question> questions = new ArrayList<Question>();
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<Integer>(); 
		int index;
		
		//check if the number entered is not bigger than the data length
		if(numberOfQuestions > data.length) {
			throw new IllegalArgumentException("Il n'ya a que "+data.length+" questions disponible");
		}

		for (int i = 0; i < numberOfQuestions; i++) {
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			} while (indexesAlreadyTaken.contains(index));

			// add index in the list
			indexesAlreadyTaken.add(index);
			
			// select country from index
			country = data[index][0];
			theCapital = data[index][1];
			
			String questionText = String.format("What is the capital of: %s \n ", country);		
			questions.add(new Question(questionText, theCapital));
		}
		
		return  questions;
	} 
	
	static HashMap<String, String> getDatas() {
		HashMap<String, String> countryList = new HashMap<String, String>();
		countryList.put("France", "Paris");
		countryList.put("Poland", "Warsaw");
		countryList.put("Japan", "Tokyo");
		countryList.put("Italy", "Roma");
		countryList.put("Madagascar", "Antananarivo");
		countryList.put("USA", "Washington");
		countryList.put("Nigeria", "Abuja");
		countryList.put("Senegal", "Dakar");
		countryList.put("Morocco", "Rabbat");
		countryList.put("Australia", "Canberra");
		countryList.put("Russia", "Moscow" );
		
		return countryList;
	}
	
	static String[][] getData() {
		String[][] countryList = {
				{ "France", "Paris" },
				{ "Poland", "Warsaw" }, 
				{ "Japan", "Tokyo" },
				{ "Italy", "Roma" }, 
				{ "Madagascar", "Antananarivo" }, 
				{ "Russia", "Moscow" },
				{ "Germany", "Berlin" }, 
				{ "USA", "Washington" }, 
				{ "Australia", "Canberra" },
				{ "Switzerland", "Berne" },
				{ "Morocco", "Rabbat" },
				{ "Perou", "Lima" },
				{ "Nigeria", "Abuja" },
				{ "Senegal", "Dakar" },
		};
		return countryList;
	}
}
