public class FactoryService {

    public boolean orderCar(String model) {
        System.out.println("Factory received an order for: " + model);
        System.out.println("Factory is preparing the car.");

        return true;
    }
}