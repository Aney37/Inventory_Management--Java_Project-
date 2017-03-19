

import java.sql.*;

public class dbconnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public dbconnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
			st=con.createStatement();
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		
	}
	
	
	/*public void getdata(){
		try{
			String query= "select * from products";
			rs=st.executeQuery(query);
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				String price=rs.getString("price");
				String available=rs.getString("available");
				//System.out.println("Name: "+name+"   "+"Age: "+age);
			}
			
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		
	}*/
	
	
	public void insertdata(int id,String name,int price,int available){
		try{
			
		     st = con.createStatement();
		    
		     String sql = "insert into products values "
		     		+ "('" + id +"','" + name + "','" + price + "','" + available + "')";
		        st.executeUpdate(sql);
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		
	}
	
	
	public void updatedata(int id){
		try{
			
		     st = con.createStatement();
		    
		     String sql = "UPDATE products " +
	                   "SET available = available-1 WHERE id=id";
		        st.executeUpdate(sql);
		}catch(Exception ex){
			
			System.out.println("Error: "+ex);
		}
		
	}
}


