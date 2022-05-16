package tamagochi;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	public void game() {
		
		boolean isTrue = true;
		while (isTrue) {
			System.out.println();
			System.out.println("○●○● 1.홀짝 2.가위바위보 3.돌아가기 ○●○●");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				sniffling();
			} else if(menu == 2) {
				RPS();
			} else if(menu == 3) {
				isTrue = false;
			}
		}
		
	}
	
	private void sniffling() {
		//홀짝
		int randam = (int) (Math.random() * 100) + 1;
		int ai = 0;
		if (randam % 2 == 0) {
			//짝
			ai = 2;
		} else if(randam % 2 == 1) {
			//홀
			ai = 1;
		}
		
		while(true) {
			System.out.println("1.홀 2.짝");
			System.out.println("입력>> ");
			int my = sc.nextInt();
			
			if(ai == my) {
				System.out.println("정답입니다!");
				break;
			} else if (ai != my){
				System.out.println("틀렸습니다!");
				continue;
			}
		}
	}
	
	private void RPS() {
		//가위바위보
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣠⠔⠒⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠹⡀⠀⠀⠀⠀⠀⠀⡰⠊⠉⠉⠑⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣠⠤⠤⡄⠀ ⠀⡇⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⡠⠖⠊⠉⠉⡶⠒⠉⠉⠉⡱⠒⠉⠉⠉⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀ ⡸⠀⠀⠀⠀⠀⠀⠀    ⠀⠰⡁⠀⠀⠸⡀⠀⢰⠁⠀⠀⠀⡇⠀⠀⠀ ⠀⡠⠒⠢⡄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⡠⠚⠉⠉⡟⠀⠀⠀⠀⡜⠁⠀⠀⠀⡜⠀⠀⠀⠀⠀ ⠀⠈⠣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⢇⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀  ⢇⠀⠀⠀⣇ ⢸⠀⠀⠀⠀⡇⠀⠀ ⠀⡸⠁⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⡜⠁⠀⠀⠸⠀⠀⠀⠀⡸⠀⠀⣀⣀⣼⣄⣀⣀⣀⡀⠀⠀⠀⠀⢱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⢸⠀⠀⠀⠀⡜⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⣀⠤⣀⠀⠀⠀   ⢸⠀⠀⠀⢸ ⢸⠀⠀⠀⢀⠃⠀  ⡰⠁⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⢠⠃⠀⠀⠀⡇⠀⠀⠀⠀⡇⢀⠎⠁⠀⠀⠀⠀⠀⠀⠈⠉⠒⠦⡀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠈⡆⠀⠀ ⡸⠀⠀⠀⠀⡸⠀⠀⠀⠀⢸⠁⠀⠈⠣⡀⠀  ⠈⡇⠀⠀⠀⡇ ⢸⠀⠀⠀⢸⠀⠀⡰⠁⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⢸⠀⠀⠀⠀⠇⠀⠀⠀⠀⡇⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⢃⠀ ⢰⠀⠀⠀⠀ ⠇⠀⠀⠀⠀⠀⢣⠀⠀⠀⠑⡄⠀ ⠀⡇⠀⠀⠀⢱⣀⡼⠀⠀⠀⡜⠀⡰⠁⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠈⡄⠀⠀⠀⢸⠀⠀⠀⠀⢇⠀⠈⠳⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠚⠉⠓⢾⡀⣀⣀⣀⣸⣤⠇⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠘⣄⠀⡇⠀⠀⠀⠀⠉⠀⠀⠀⠀⠈⠋⠁⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠷⡀⠀⠀⠀⢣⠀⠀⠀⠘⣄⠀⠀⠀⢨⠋⣉⠇⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆⠀⠀⠀⠀⠀⢀⠖⠉⠉⠻⡁⠀⠀⠀⢠⠋⠀⠀⠀⠀⠀⠉⠙⠒⠤⣀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⢣⡀⠀⠀⠘⠦⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⢸⠀⠙⢆⠀⠀⢀⡧⣀⣀⣀⠞⠓⢒⡶⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠀⠀⠀⠀⢸⠀⠀⠀⠀⡇⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠈⠳⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠖⠁⠀⠀⣀⣠⢤⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠈⡆⠀⠀⠙⠒⠉⠀⠀⠉⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢀⠇⠀⠀⠀⠸ ⠀⠀⠀⠸ ⠀⠀⠀⠈⣷⠦⠤⣄⡀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⣀⡠⠴⠚⠉⠀⠀⢀⠔⠋⠁⠀⠀⢣⡀⠀⠀⣀⡴⠊⠉⠉⠉⠑⡄⠀\r\n"
				+ "⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⡠⠋⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⢣⠀⠀⠀⠀⢸⠀⠀⠀⡹⠀⠀⠀⠀⠀⠀ ⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡖⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⡴⠁⠀⠀⠀⠀⠀⠀⠉⠋⠉⠀⠀⠀⠀⠀⢀⡠⠃⠀\r\n"
				+ "⠀⠀⠀⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣠⠞⠀⠀⠀⠀⠀ ⠀⢸⠳⡀⠀⠀⠀⢣⡀⠀⢀⡼⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀ ⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠒⠉⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠈⠳⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠈⠒⠤⠔⠋⠈⠉⠁⠀⠀⠀⠃⠀⠀⠀⠀⠀⠀⠀  ⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠔⠊⠁⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠒⠒⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣀⠤⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠈⠢⠀⠀⠀⠀⠀⠀⠀  ⠀⢀⡠⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠒⠢⠤⠤⠤⠒⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠒⠒⠒⠒⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		
		
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀ ⣴⡶⢶⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⢀⣤⣤⣄⡀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⣤⣶⣶⣦⡀⣿⠃⠀⠀⢹ ⣰⡿⠛⠛⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢠⡿⠁⠀⠘⣷⠀⢀⣴⠟⠛⠛⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣸⡏⠀⠀⢹⣷⣿⠀⠀⠀ ⣿⣿⠃⠀⠀⢸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣤⣤⣤⡀⢀⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⣿⠀⣾⠃⠀⠀⠀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠟⠛⢿⣾⣧⠀⠀⠈⣿⣿⠀⠀⠀⢸⣿⡟⠀⠀⠀⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣾⠟⠋⠙⣻⠟⠉⠉⠉⣿⠟⠋⠉⠉⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⣿⢸⡏⠀⠀⠀⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡀⠀⠀⢿⣿⠀⠀⠀⣿⣿⠀⠀⠀⢸⣿⠇⠀⠀⢠⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⣠⡿⠛⠛⣿⠁⠀⠀⢰⣏⣀⣀⣀⣼⣯⣤⡤⠴⠶⢤⣼⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⠀⠀⣿⣿⠁⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣧⠀⠀⠘⣿⡇⠀⠀⢸⣿⠀⠀⠀⣿⡿⠀⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢠⣿⠃⠀⢸⡇⠀⠀⢰⡟    ⠀⠀⠀⠀⠀⠀⠀⠈⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⠀⣿⡟⠀⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢿⣆⠀⠀⠹⣧⠀⠀⠘⣿⠀⠀⠀⣿⠇⠀⠀⢠⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣼⣿⠀⠀⢸⡇⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡶⢾⡇⢀⣀⣹⣇⠀⠀⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⣿⡄⠀⠀⣻⣀⣀⣠⠿⠤⠤⠴⠿⠶⠀⠀⢸⡇⠀⢀⣠⣴⣶⣦⣄⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢹⣿⠀⠀⢸⡇⠀⠀⠈⢻⣦⣀⣀⣀⢀⣀⣠⡤⠖⠀⠀⠀⠀⠈⣿⡄⠀⠀⠀⠀⠀⠀⢀⣶⠛⢻⠇⠀⣠⠿⠶⠿⠿⠶⠶⠶⠾⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣼⣧⣶⠟⠋⠁⠀⠈⢻⣧⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠘⢿⣦⣤⣤⠿⣦⣀⣀⣨⣧⣀⣀⣿⠟⠉⠀⠀⠀⠀⠀⠀⢀⣿⠇⠀⠀⠀⠀⠀⠀⣼⠇⠀⢸⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀  ⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠞⠋⠉⠁⠉⠀⠀⠀⢀⣠⣴⠿⠃⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⡇⠀⠀⠈⠉⠀⠀⠉⢹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⢻⡆⠀⢸⡄⠀⠈⠳⡶⢤⡤⠤⠂⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠊⠀⠀⠀⠀⠀⠀⠀⣠⣶⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠁⠀⠀⠀⠀⠀⠀⠀⠈⠿⣤⠤⠟⠦⠤⠖⢡⠏⠀⠀⠀⠀⠀⠀⣼⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣄⠀⠀⠀⠀ ⠀⠀⠀⠀⠀ ⣼⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⢿⣶⠖⠒⠒⠒⠂⠀⠀⠉⠙⣿⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠷⢦⣤⣄⣠⡤⠄⠀⠶⣾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢷⣦⣤⣀⡀⠀⠀⢀⣀⣀⣤⡾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣤⣤⣤⣤⣤⣤⣤⣤⣶⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣤⣤⣤⣤⣤⡶⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣏⣀⣀⣀⠀⣀⣀⣨⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠛⠛⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀");
	}

}
