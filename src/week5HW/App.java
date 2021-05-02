package week5HW;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger logger1 = new SpacedLogger();
		
		logger.Log("Hello");
		logger.Error("Hello");
		logger1.Log("Hello");
		logger1.Error("Hello");
	}
}
