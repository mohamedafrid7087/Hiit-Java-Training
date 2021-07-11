package com.SundayRevision;

//aggregation is creating part of relationship
//This is used to achive overcomming the problems of association
public class AggregationDemo {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.workWithAgent();
		
		customer.workWithEmployee();
	}
}
class Customer{
	Bank bank=new Bank();
	Agent agent=new Agent();//knowledge of
	Employee employee=new Employee(bank);//knowledge of
	
	//agent is a associate....
	//in case of association the employee work is non transparent that is visible
	public void workWithAgent() {
		agent.setBank(bank);
		agent.applying(this);
		agent.helpInVerifying(this);
		agent.helpInSanctioning(this);
	}
	
	//employee is a aggregate/part of bank
	//in case of aggregation the employee work is transparent that is invisible
	public void workWithEmployee() {
		employee.doApproach("my documents...");
	}
}
class Bank{
	public void applyForLoan(Customer c) {
		System.out.println("apply for loan....the customer is approaching this through agent...");
	}
	public void applyForLoan(String document) {
		System.out.println("the employee is calling applyforload method and passing customer documents....");
	}
	public void doVerification(Customer c) { 
		System.out.println("do verification.......the customer is approaching this through agent");
	}
	public void doVerification(String document) {
		System.out.println("the employee is calling verification method and passing customer documents...");
	}
	public void sanction(Customer c) {
		System.out.println("sanction the loan....the customer is approaching this through agent");
	}
	public void sanction(String document) {
		System.out.println("the employee is calling sanction method and passing customer documents...");
	}
}
//agent has knowledge of the Bank...
class Agent{
	Bank bank;
	
	public void setBank(Bank bank) {
		this.bank=bank;
	}
	
	public void applying(Customer c) {
		bank.applyForLoan(c);
	}
	public void helpInVerifying(Customer c) {
		bank.doVerification(c);
	}
	public void helpInSanctioning(Customer c) {
		bank.sanction(c);
	}
}
//employee is a a part of the Bank....
class Employee{
	Bank bank;
	public Employee(Bank bank) {
		this.bank=bank;
	}
	public void doApproach(String document) {
		bank.applyForLoan(document);
		bank.doVerification(document);
		bank.sanction(document);
	}
}