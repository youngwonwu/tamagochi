package dto;

import lombok.Data;

@Data
public class TamaInfoVO {
	
	private String name;
	private int hungry;
	private int clean;
	private int tlike;
	private int health;
	private String id;
	
	public String toString() {
		System.out.print("name : " + name + " | ");
		System.out.print("hungry : " + hungry + " | ");
		System.out.print("clean : " + clean + " | ");
		System.out.print("tlike : " + tlike + " | ");
		System.out.print("health : " + health + " | ");
		System.out.println("id : " + id + " | ");
		return null;
	}
	
}
