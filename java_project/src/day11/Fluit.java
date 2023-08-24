package day11;

public class Fluit {
	//필드
	private String name;
	private String color;
	private boolean isSeed;
	
	//기본생성자
	public Fluit() {
		
	}
	public Fluit(String name) {
		this.name = name;
	}
	public Fluit(String name, String color) {
		this(name);
		this.color = color;
	}
	public Fluit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	public boolean getIsSeed() {
		return isSeed;
	}
	public void setIsSeed(boolean isSeed) {
		this.isSeed = isSeed;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}

}
