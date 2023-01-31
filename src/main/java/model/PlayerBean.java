package model;

import java.io.Serializable;

public class PlayerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int hp;
	private int power;
	
	public PlayerBean() {
		this.hp = 100;
	}
	
	public PlayerBean(int hp, int power) {
		super();
		this.hp = hp;
		this.power = power;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
}
