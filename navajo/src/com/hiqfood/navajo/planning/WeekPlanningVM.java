package com.hiqfood.navajo.planning;

import java.text.SimpleDateFormat;
import java.util.*;

import org.zkoss.bind.annotation.*;

public class WeekPlanningVM {

	private Calendar cal = Calendar.getInstance(Locale.ENGLISH);
	private int Year;
	private int Week;
	private Date FirstDate;
	private Date LastDate;
	private String No_Series;
	private ProductionOrderService srv;
	private List<List<ProductionOrder>> Weekplans;
	
	public WeekPlanningVM() {
		srv = new com.hiqfood.navajo.planning.test.ProductionOrderSQLReadOnlyImpl();
		No_Series = "PD-BF-04";
		cal.setMinimalDaysInFirstWeek(4);
	    cal.setFirstDayOfWeek(Calendar.MONDAY);
	    Update();
	}
	
	public int getYear() {
		return Year;
	}
	
	public int getWeek() {
		return Week;
	}
	
	public Date getFirstDate() {
		return FirstDate;
	}
	
	public Date getLastDate() {
		return LastDate;
	}

	public String getRange() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		return sdf.format(FirstDate) + " - " + sdf.format(LastDate);
	}

	@Command @NotifyChange({"year", "week", "firstDate", "lastDate", "range", "weekplans"})
	public void MoveNext() {
		cal.add(Calendar.DATE, 7);
		Update();
	}

	@Command @NotifyChange({"year", "week", "firstDate", "lastDate", "range", "weekplans"})
	public void MovePrev() {
		cal.add(Calendar.DATE, -7);
		Update();
	}

	private void Update() {
	    cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	    LastDate = cal.getTime();
	    cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    FirstDate = cal.getTime();
	    Week = cal.get(Calendar.WEEK_OF_YEAR);
	    Year = cal.get(Calendar.YEAR);
	    if (No_Series == null) Weekplans = null;
	    else Weekplans = srv.RetrieveByWeek(Year, Week, No_Series);
	}
	
	public List<List<ProductionOrder>> getWeekplans() {
		return Weekplans;
	}

	public String getNo_Series() {
		return No_Series;
	}
	
	@NotifyChange("weekplans")
	public void setNo_Series(String no_Series) {
		No_Series = no_Series;
	}
}
