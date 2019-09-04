package models;

public class Customer {
	private int id;
	private String name;
	
	
	//default constructor
	public Customer() {
		this.id=0;
		this.name="";
		
	}
	
	//parameterized Constructor
	public Customer(String name) {
		this.name=name;
		
	}
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	

	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	
	
	public String toString() {
		return "Customer [id=" + id + ", name=" + name +"]";
	}	
}
