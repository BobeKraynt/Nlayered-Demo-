package oopWithLayeredApp.core.logging;

public class EmailLogger implements Logger {
	public void log(String data) {
		System.out.println("E-postaya loglandı: " + data);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
}
