package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ja_jdbc {

	public static void main(String[] args) throws SQLException {
         String url="jdbc:mysql://localhost:3306/Credentials";
         String usn="root";
         String psw="root";
         Connection connt = DriverManager.getConnection(url, usn, psw);
         // It is used to build connection b/w java and database
         Statement stat = connt.createStatement();
         // It will access the interface of database
         ResultSet query = stat.executeQuery("select * from Testdata");
         query.next();
         String usn1=query.getString("usn");
         String psw1=query.getString("psw");
         System.out.println(usn1+" "+psw1);
         query.next();
         String usn2=query.getString("usn");
         String psw2=query.getString("psw");
         System.out.println(usn2+" "+psw2);
	}

}
