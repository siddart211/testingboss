
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QAT02Connection {
	
	public static Connection con=null;

	public static void getData() throws SQLException 

	{
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.out.println("unable to launch the server class");
		}
		try
		{
		 con = DriverManager.getConnection("jdbc:oracle:thin:@10.158.201.66:1521:QAT32", "QATAPP16", "QATAPP16");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("unable to made connection to qlab02 dude");
		}
	    Statement stm=con.createStatement();
	    
	    ResultSet result=stm.executeQuery("select * from customer where customer_id='958601565'");
	    System.out.println(result);
	    
//	    while(result.next())
//	    {
//	    	
//	    	System.out.println(result.getObject(1)+" ");
//	    	result.
//	    }
	    con.close();
	    //jdbc:mysql://localhost:3306/dbname
	   
	}

}
