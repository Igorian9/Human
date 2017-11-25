package ua.i.igor_igorovuich;

@SuppressWarnings("serial")
public class FullGroupException extends Exception {

	@Override
	public String getMessage() {
		return "Full group" + System.lineSeparator();
	}

}
