package Chapter8.Task45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String BranchName, String customerName, double transaction) {
        Branch branch = findBranch(BranchName);
        if (branch != null) {
            return branch.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);

        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName))
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println(branch.getName());
            ArrayList<Customer> custmrs = branch.getCustomers();
            for (int i = 0; i < custmrs.size(); i++) {
                Customer custmr = custmrs.get(i);
                System.out.println((i + 1) + ". " + custmr.getName());
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = custmr.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j + 1) + ". Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
