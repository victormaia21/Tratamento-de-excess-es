package Entities;

import model.exceptions.Exceptiones;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawlimit;
	
	Account(){
		
	}

	public Account(Integer number, String holder, double balance, double withdrawlimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimit = withdrawlimit;
	}

	
	
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawlimit() {
		return withdrawlimit;
	}

	public void setWithdrawlimit(double withdrawlimit) {
		this.withdrawlimit = withdrawlimit;
	}

	public void withdraw(double amount) {
		withdraw1(amount);
		balance = balance - amount;
	}
	private void withdraw1(double amount) {
		if(amount > getWithdrawlimit()) {
			throw new Exceptiones("Erro de saque: a quantia exede o limite");
		}
		if(amount > getBalance()) {
			throw new Exceptiones("Erro de saque: saldo insuficiente");
		}
	}
	
	
	
}
