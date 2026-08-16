package oops.interfaces;

public class Freelancer implements Payable{

    private int id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(int id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

}
