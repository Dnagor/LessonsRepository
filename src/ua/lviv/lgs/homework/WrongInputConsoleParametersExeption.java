package ua.lviv.lgs.homework;

public class WrongInputConsoleParametersExeption extends Exception{

	private String message;

	public WrongInputConsoleParametersExeption(String message) {
	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
