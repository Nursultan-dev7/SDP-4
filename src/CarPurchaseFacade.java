public class CarPurchaseFacade {

    private ConsultantService consultant;
    private FactoryService factory;
    private CashierService cashier;
    private DeliveryService delivery;

    public CarPurchaseFacade() {
        consultant = new ConsultantService();
        factory = new FactoryService();
        cashier = new CashierService();
        delivery = new DeliveryService();
    }

    public void buyCar(String model, double price) {

        System.out.println("Starting car purchase...");

        if (!consultant.selectCar(model)) {
            return;
        }

        if (!factory.orderCar(model)) {
            return;
        }

        if (!cashier.processPayment(price)) {
            return;
        }

        delivery.deliverCar(model);

        System.out.println("Car purchase completed successfully!");
    }
}