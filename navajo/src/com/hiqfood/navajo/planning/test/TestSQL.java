//demo connect sql
package com.hiqfood.navajo.planning.test;

import java.util.*;
import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.event.*;
import org.zkoss.zk.ui.select.*;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.*;

import com.hiqfood.navajo.planning.ProductionOrder;

public class TestSQL extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;

	@Wire
    private Button aButton;

	@Wire
    private Listbox poListbox;
    
	@Listen("onClick = #aButton")
	public void onClick$aButton(Event event) {
		ProductionOrderSQLReadOnlyImpl pos = new ProductionOrderSQLReadOnlyImpl();
		List<ProductionOrder> pol = pos.Retrieve("No_ like 'PBF02%'");
		if (pol != null) poListbox.setModel(new ListModelList<ProductionOrder>(pol));
	}
}