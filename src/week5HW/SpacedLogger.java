package week5HW;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		String logN = log.replaceAll(".", "$0 ");
		System.out.println(logN);
	}

	@Override
	public void Error(String error) {
		String errorN = error.replaceAll(".", "$0 ");
		System.err.println("ERROR: " + errorN);
	}

}
