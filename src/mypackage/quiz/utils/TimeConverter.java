package mypackage.quiz.utils;

public class TimeConverter {

	public static int toSeconds(long timeMs) {
		return (int) (timeMs/1000);
	}
}
