package dto;

import lombok.Data;

@Data
public class TamaUserVO {
	
	private String id;
	private String password;
	
	public String toString() {
		System.out.print("id : " + id + " | ");
		System.out.println("password : " + password + " | ");
		return null;
	}

}
