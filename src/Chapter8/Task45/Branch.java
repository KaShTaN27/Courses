package Chapter8.Task45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transactions) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, transactions));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String CustomerName) {
        for (int i = 0; i < customers.size(); i++)
            if (customers.get(i).getName().equals(CustomerName))
                return customers.get(i);
        return null;
    }
}
