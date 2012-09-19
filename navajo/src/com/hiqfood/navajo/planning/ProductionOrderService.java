package com.hiqfood.navajo.planning;

import java.util.*;

public interface ProductionOrderService {
	public ProductionOrder Create(ProductionOrder po);
	public List<ProductionOrder> Retrieve(String condition);
	public List<ProductionOrder> RetrieveByNo_(String No_);
	public List<List<ProductionOrder>> RetrieveByWeek(int year, int week, String no_Series);
	public boolean Update(ProductionOrder po);
	public boolean Update(List<ProductionOrder> pos);
	public boolean Delete(ProductionOrder po);
	public boolean Delete(List<ProductionOrder> po);
}
