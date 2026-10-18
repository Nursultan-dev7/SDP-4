public class CashierService {

    public boolean processPayment(double price) {
        if (price <= 0) {
            System.out.println("Invalid car price.");
            return false;
        }

        System.out.println("Payment received: " + price + " KZT");
        return true;
    }
}