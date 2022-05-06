package tamagochi;

import lombok.Data;

@Data
public class State {
	
	Start start = new Start();

	public void run() {
		Info();
	}

	private int hungry;
	private int clean;
	private int like;
	private int health;
	private String x = "■", o = "□";

	private void set() {		//상태 기본값
		hungry = 50;
		clean = 50;
		like = 50;
		health = 50;
	}

	private void Info() {
		System.out.println();
		System.out.println(start.getName() + "의 상태");
		set();
		
		System.out.print("배고픔 : ");
		for (int i = 1; i <= 10; i++) {
			if (hungry / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 청결 : ");
		for (int i = 1; i <= 10; i++) {
			if (clean / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 애정 : ");
		for (int i = 1; i <= 10; i++) {
			if (like / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 건강 : ");
		for (int i = 1; i <= 10; i++) {
			if (health / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
	}

}
