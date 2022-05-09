package tamagochi;

public class TamagochiApp {
	private static String name;
	public static String id;
	

	public static void main(String[] args) {
//		Start start = new Start();
		State state = new State();

//		start.run();
		state.run();

	}
}
