package com.gova;

import java.sql.*;
import javax.servlet.*;
public class InsertDAO 
{
    public int k=0;
    
     public int insert(ServletRequest req)
     {
    	 try {
    		 Connection con=DBConnection.getCon();
    		 PreparedStatement ps=con.prepareStatement("insert into bank values(?,?,?,?)");
    		 ps.setInt(1, Integer.parseInt(req.getParameter("accntno")));
    		 ps.setString(2, req.getParameter("name"));
    		 ps.setInt(3,Integer.parseInt(req.getParameter("balance")));
    		 ps.setInt(4,Integer.parseInt(req.getParameter("aadharno")));
    	    k=ps.executeUpdate();
    	 }catch(Exception e) {e.printStackTrace();}
    	 return k;
     }
}
