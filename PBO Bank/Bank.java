class Customer {
    private String firstName;
    private String lastName;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(f, l);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Mohammad", "Sahid");
        bank.addCustomer("Abdul", "Rahman");
        bank.addCustomer("Khairul", "Fikri");
        bank.addCustomer("Siti", "Halimah");

        System.out.println("Jumlah nasabah saat ini: " + bank.getNumOfCustomers());
        System.out.println();

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer cust = bank.getCustomer(i);
            System.out.println("Nasabah ke-" + (i + 1) + ": " + cust.getFirstName() + " " + cust.getLastName());
        }
    }
}