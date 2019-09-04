package models;

public class Orders1 {
	private int id;
	private String foodname;
	private int quantity;
	private int moneyreceived;
	private int moneyreturn;
	//private String search;
	private int amount;
	Customer c;
	
	//default constructor
	public Orders1() {
		this.foodname="";
		this.quantity=0;
		this.moneyreceived = 0;
		this.amount=0;
		//this.search="";
		this.c =null;
		
	}

	//parameterized Constructor
	public Orders1( String foodname, int amount,int moneyreceived,int moneyreturn,Customer c) {
		this.foodname = foodname;
		this.amount = amount;
		this.moneyreceived = moneyreceived;
		this.moneyreturn = moneyreturn;
		this.c = c;
	
	}
	
	public int getMoneyreturn() {
		return moneyreturn;
	}

	public void setMoneyreturn(int moneyreturn) {
		this.moneyreturn = moneyreturn;
	}

	public int getmoneyreceived() {
		return moneyreceived;
	}
	
	public void setmoneyreceived(int moneyreceived) {
		this.moneyreceived = moneyreceived;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getfoodname() {
		return foodname;
	}
	
	public void setName(String foodname) {
		this.foodname = foodname;
	}
	

	public double getamount() {
		return amount;
	}
	public void setamount(int amount) {
		this.amount =  amount;
	}
	
	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}	
	
	public String toString() {
		return "Food [foodname=" + foodname + ", quantity=" + quantity + ", money="+ moneyreceived +", + moneyreturn =" + moneyreturn +" amount=" + amount+"]";
	}

	
	
}
