package suresbyInc;
import java.sql.*;


import javax.swing.JOptionPane;

public class jdbc_class{

	static String Driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/";
	static String dbname = "testing";
	static String username = "root";
	static String password = "";
	public static void main(String []args) {
		try {
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url+dbname,username,password);
			System.out.println("Connection created successfully");
			Statement st = con.createStatement();
			
			String query = "insert into details values(07,'Chiranjeevi','Narasapuram')";
			int update = st.executeUpdate(query);
			update +=1;
			String query1 = "insert into details values(08,'Megastar','Palakollu')";
			update = st.executeUpdate(query1);
			//rs.next();
			JOptionPane.showMessageDialog(null,update+" Row Effeected...Data Inserted Successfully");
			st.close();
			con.close();
			
		
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Data Insertion failed");
	}
	/*
	static String url ="jdbc:mysql://localhost:3306/testing";
	//static String dbname = "students";
	static String username = "root";
	static String password = "";
	public static void main(String []args){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("INSERT INTO `testing`.`details` (`S.No`, `Name`, `Address`) VALUES ('05', 'sunny', 'lakshimipuram');");
		
		rs.next();
		st.close();
		System.out.println("Data updated");
		con.close();
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Data not Inserted");
		}
		
	}*/

}
}

