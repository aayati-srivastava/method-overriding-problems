// Base Employee class
class Employee {
    double baseSalary;

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary; // Default implementation
    }
}

// Manager subclass
class Manager extends Employee {
    double bonus;

    Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass
class Developer extends Employee {
    double overtimePay;

    Developer(double baseSalary, double overtimePay) {
        super(baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

// Main testing class
public class Main3 {
    public static void main(String[] args) {
        Employee manager = new Manager(50000, 10000);
        Employee developer = new Developer(40000, 5000);

        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println("Developer Salary: $" + developer.calculateSalary());
    }
}
