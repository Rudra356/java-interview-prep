package oops.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {
        Payable[] payables = {
                new Employee(101, "Raj", 20000),
                new Freelancer(201, "Rudra", 400, 8)
        };
        double total = 0;
        for (Payable payable : payables) {
            total += payable.calculatePayment();
            System.out.println(
                    payable.calculatePayment()
            );
        }
        System.out.println("Total : " + total);

        Payable p1 = ()->5000.00;
        Payable p2 = ()->10000.00;
        System.out.println(p1.calculatePayment());
        System.out.println(p2.calculatePayment());
    }
}
