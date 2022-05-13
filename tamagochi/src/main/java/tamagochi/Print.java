package tamagochi;

public class Print {
	
	public void startPrint() {
		blankPrint();
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println("○●	다	마	고	치	START	○●");
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
	}

	// 시간차 출력
	public void sleepTime(int sec) {
		long c = System.currentTimeMillis();
		while (true) {
			if ((System.currentTimeMillis() - c) >= sec) {
				break;
			}
		}
	}

	// 공백출력
	public void blankPrint() {
		for (int i = 1; i <= 40; i++) {
			System.out.println();
		}
	}

}
