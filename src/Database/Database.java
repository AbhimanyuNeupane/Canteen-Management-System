package Database;

import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;

//import jdk.vm.ci.code.site.Site;
import models.Customer;
import models.Orders1;


//Database Connection//
public class Database {
	String url = "jdbc:mysql://localhost:3306/canteensystem";
	String username = "root";
	String password = "";
	String sql;
	PreparedStatement stmt = null;
	ResultSet rs;
	Connection con;

	public Database() {
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	//login check //
	public boolean loginCheck(String uname, String pwd) {
		boolean status = false;
		sql = "SELECT * from login where username like ? and password like ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pwd);
			rs = stmt.executeQuery();
			if (rs.next()) {
				status = true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	/*
	 * public static void main(String[] args) { //Database dbDatabase = new
	 * Database(); //Customer c; //Customer customer = new Customer("youbraj");
	 * //Customer customer = new Customer("youbraj"); //Orders orders = new
	 * Orders("coke", 2, 80.0, customer); //c = dbDatabase.getCustomer(2);
	 * //customer.get //customer.setid(id); //dbDatabase.addOrder(orders);
	 * 
	 * //System.out.println(c); }
	 */

	
	//method to add customer in database//
	public int addCustomer(Customer c) {
		int id = 0;
		sql = "Insert into customer (name) " + "values('" + c.getname() + "');";
		try {
			stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();

			if (rs.next()) {
				id = rs.getInt(1);
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return id;
	}

//	public Customer getCustomer(int id) {
//		Customer c = null;
//		sql = "SELECT * FROM customer where id=" + id;
//		// 3. prepare sql statement to be executed
//		// 4 get the resultset from execution
//		try {
//			stmt = con.prepareStatement(sql);
//			rs = stmt.executeQuery();
//			while (rs.next()) {
//				int id1 = rs.getInt(2);
//				String name = rs.getString(3);
//				c = new Customer(id1, name);
//			}
//			rs.close();
//			stmt.close();
//		} catch (SQLException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		return c;
//	}

//	public List<Customer> getCustomers() {
//		Customer c;
//		List<Customer> cList = new ArrayList<Customer>();
//		sql = "SELECT * FROM customer";
//		try {
//			stmt = con.prepareStatement(sql);
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//
//				int id1 = rs.getInt(2);
//				String name = rs.getString(3);
//				c = new Customer(id1, name);
//				cList.add(c);
//			}
//			rs.close();
//			stmt.close();
//		} catch (SQLException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		return cList;
//	}

//	public void deleteCustomer(int id) {
//
//		sql = "DELETE FROM customer WHERE id = ?";
//		try {
//			stmt = con.prepareStatement(sql);
//			stmt.setInt(1, id);
//		} catch (SQLException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//
//	}

//	public void searchCustomer(int id) throws SQLException {
//		String sql = "SELECT * FROM customer WHERE name=?";
//		stmt = con.prepareStatement(sql);
//		PreparedStatement stm = con.prepareStatement(sql,
//		        Statement.RETURN_GENERATED_KEYS);
//		//stmt.setInt(1, id);
//		ResultSet rs = stm.getGeneratedKeys();
//		stmt.executeUpdate();
//		int generatedKey = 0;
//		if(rs.next())
//			generatedKey = rs.Int(1);
//		stmt.close();
//		System.out.println("Inserted record's ID: " + generatedKey);
//	}

	
	//method to add order in database//
	public void addOrder1(Orders1 o) {
		
		
		sql = "Insert into orders1(foodname,amount,moneyreceived,moneyreturn,customerid) values(?,?,?,?,?)";
		try {
			//stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt = con.prepareStatement(sql);
			
			//stmt = con.prepareStatement(sql);
			//stmt.setInt(1, o.getC());
			stmt.setString(1, o.getfoodname());
			// stmt.setInt(2, o.getQuantity());
			stmt.setInt(2, (int) o.getamount());
			stmt.setInt(3, (int) o.getmoneyreceived());
			stmt.setInt(4, o.getMoneyreturn());
			stmt.setInt(5, o.getC().getId());
			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			// TODO: handle exception\
			System.out.println(e.getMessage());
		}

	}

//	public void addAllOrder(List<Orders> oList) {
//		for (Orders o : oList) {
//			addOrder(o);
//		}
	}
//}
