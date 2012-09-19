package foo;

import java.util.*;

public class CustomerList {
	private List<Customer> customers = new ArrayList<Customer>();

	public CustomerList() {
		customers.add(new Customer("John"));
		customers.add(new Customer("Herry"));
		customers.add(new Customer("Peter"));
		customers.add(new Customer("Justin"));
		customers.add(new Customer("Alexandra"));
	}
	
	public List<Customer> getAll() {
		return customers;
	}
}
