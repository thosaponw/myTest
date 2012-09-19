package com.hiqfood.navajo.planning.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hiqfood.navajo.planning.ProductionOrder;
import com.hiqfood.navajo.planning.ProductionOrderService;
 
public class ProductionOrderSQLReadOnlyImpl implements ProductionOrderService {
	private Connection conn = null;
	private final String url = "jdbc:sqlserver://";
    private final String serverName= "kawakawa.hiqfood.com";
    private final String portNumber = "1433";
    private final String databaseName= "navajo";
    private final String userName = "sa";
    private final String password = "hiqit";
    //private final String selectMethod = "cursor";
    private Calendar cal = Calendar.getInstance(Locale.ENGLISH);
    
	private String getConnectionUrl(){
		return url+serverName+":" + portNumber + ";databaseName=" + databaseName + ";userName=" + userName + ";password=" + password + ";";
		//;selectMethod="+selectMethod
	}
    
	public ProductionOrderSQLReadOnlyImpl() {
		cal.setMinimalDaysInFirstWeek(4);
	    cal.setFirstDayOfWeek(Calendar.MONDAY);
	}

	private List<ProductionOrder> Select(String condition) {
		List<ProductionOrder> result = null;
	    try {
	    	if (conn == null) {
	    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection(getConnectionUrl());
			}
			Statement statement = conn.createStatement();
			String queryString = "select [No_ Series], [No_], [Source No_], [Description],"+
								 "	     [Location Code], [Quantity], [Due Date], [Status],"+
								 "		 [Status Post Consumption], [Status Post Output], [Prodction Comment] "+
								 "from   [Production Order] ";
			if (condition != null) queryString += ("where " + condition); 
			ResultSet rs = statement.executeQuery(queryString);
			result = new ArrayList<ProductionOrder>();
			while (rs.next()) {
				ProductionOrder po = new ProductionOrder();
				po.setNo_Series(rs.getString("No_ Series"));
				po.setNo_(rs.getString("No_"));
				po.setSourceNo_(rs.getString("Source No_"));
				po.setDescription(rs.getString("Description"));
				po.setLocationCode(rs.getString("Location Code"));
				po.setQuantity(rs.getDouble("Quantity"));
				po.setDueDate(rs.getDate("Due Date"));
				po.setStatus(rs.getInt("Status"));
				po.setPostConsumption((rs.getInt("Status Post Consumption") == 1));
				po.setPostOutput((rs.getInt("Status Post Output") == 1));
				po.setComment(rs.getString("Prodction Comment"));
				result.add(po);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductionOrder Create(ProductionOrder po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductionOrder> Retrieve(String condition) {
		return Select(condition);
	}

	@Override
	public List<ProductionOrder> RetrieveByNo_(String No_) {
		return Retrieve("No_ = '" + No_ + "'");
	}

	@Override
	public List<List<ProductionOrder>> RetrieveByWeek(int year, int week, String no_Series) {
		List<List<ProductionOrder>>result = new ArrayList<List<ProductionOrder>>();
		List<ProductionOrder> pol = Select("YEAR([Due Date]) = " + year +
										   " and DATEPART(ISOWW, [Due Date]) = " + week +
										   " and [No_ Series] = '" + no_Series + "'" +
										   " Order by No_ asc");
		for (int i=0; i<7; i++) result.add(new ArrayList<ProductionOrder>());
		for (ProductionOrder po: pol) {
			cal.setTime(po.getDueDate());
			int dow = cal.get(Calendar.DAY_OF_WEEK);
			if (dow == Calendar.SUNDAY) result.get(6).add(po);
			else result.get(dow-2).add(po);
		}
		return result;
	}

	@Override
	public boolean Update(ProductionOrder po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(List<ProductionOrder> pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(ProductionOrder po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(List<ProductionOrder> po) {
		// TODO Auto-generated method stub
		return false;
	}
}
