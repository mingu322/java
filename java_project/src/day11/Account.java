package day11;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Account {
	//필드
	private String name;
	private String account;
	private int balance;
	private String joinDate;
	private static int num = 100;
	//생성자
	public Account() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());	
	}
	//메서드
	public void deposit(int inMoney) { //입금
		balance += inMoney;
	}
	public boolean withdraw(int outMoney) {
		if(balance >= outMoney) {F
			balance -= outMoney;
			return true;
		}else {
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = (num++) +"-"+account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void print() {
		System.out.println(name+"\t"+account+"\t"+balance+"\t"+joinDate);
	}
	
}
