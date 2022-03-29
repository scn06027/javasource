package test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
 private String ano;
 private int balance;
 private String owner;
 
 public void deposit() {
	 System.out.println("deposit");
	 
 }
 public void print() {
	 System.out.println("print");
 }
 
 public void withdraw() {
	 System.out.println("Withdraw");
 }
public void print2() {
	 System.out.println("print");
 }
}
