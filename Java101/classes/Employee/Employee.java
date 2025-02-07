public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000)
            return 0;
        return salary * 0.03;
    }

    public double bonus() {
        if (workHours > 40)
            return (workHours - 40) * 30;
        return 0;
    }

    public double raiseSalary() {
        int years = 2021 - hireYear;
        double raiseRate;

        if (years < 10)
            raiseRate = 0.05;
        else if (years < 20)
            raiseRate = 0.10;
        else
            raiseRate = 0.15;
        return salary * raiseRate;
    }

    @Override
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double netSalary = salary - taxAmount + bonusAmount + raiseAmount;

        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Work Hours: " + workHours + "\n" +
                "Hire Year: " + hireYear + "\n" +
                "Tax: " + taxAmount + "\n" +
                "Bonus: " + bonusAmount + "\n" +
                "Salary Increase: " + raiseAmount + "\n" +
                "Salary After Tax and Bonus: " + (salary - taxAmount + bonusAmount) + "\n" +
                "Total Salary: " + netSalary + "\n";
    }
}
