package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
public class DBCon3 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");

			/*------------Save Operation-------------*/

			/*
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Employee ID :");
			int eid=Integer.parseInt(s.nextLine());
			System.out.print("Enter Employee Name :"); 
			String ename=s.nextLine();
			System.out.print("Enter Employee Designation :"); 
			String edesg=s.nextLine();
			System.out.print("Enter Employee Basic Salary :"); 
			double bsal=Double.parseDouble(s.nextLine());
			double totsal=bsal+(0.93*bsal+0.73*bsal); 
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			ps.setInt(1, eid); ps.setString(2, ename);
			ps.setString(3, edesg); 
			ps.setDouble(4, bsal); 
			ps.setDouble(5, totsal); 
			int i = ps.executeUpdate(); 
			if(i>0) 
			{
				System.out.println("Inserted Successfully.");
				System.out.println("ID:"+eid+"\nName:"+ename+"\nDesignation:"+
						edesg+"\nTotal Salary:"+totsal);

			} else 
			{
				System.out.print("Technical Error."); 
			}
			*/

			/*----------------Retrieve Operation-----------------*/

			Employee emp=new Employee();
			PreparedStatement ps=con.prepareStatement("select * from Employee");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setEdesg(rs.getString(3));
				emp.setBsal(rs.getDouble(4));
				emp.setTotsal(rs.getDouble(5));
			}


			/* Writing As Json */

			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(emp); 
			System.out.println(json);  				//sysout

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
