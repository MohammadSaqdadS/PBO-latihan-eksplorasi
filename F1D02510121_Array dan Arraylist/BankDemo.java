public class BankDemo {
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