// Parent class
class Customer {
    double getDiscount() {
        return 0.0; // No discount by default
    }
}

// RegularCustomer subclass
class RegularCustomer extends Customer {
    @Override
    double getDiscount() {
        return 5.0; // 5% discount
    }
}

// PremiumCustomer subclass
class PremiumCustomer extends Customer {
    @Override
    double getDiscount() {
        return 10.0; // 10% discount
    }
}

// Main class to test the discount values
public class Main2 {
    public static void main(String[] args) {
        Customer cust1 = new RegularCustomer();
        Customer cust2 = new PremiumCustomer();

        System.out.println("RegularCustomer gets " + cust1.getDiscount() + "% discount.");
        System.out.println("PremiumCustomer gets " + cust2.getDiscount() + "% discount.");
    }
}
