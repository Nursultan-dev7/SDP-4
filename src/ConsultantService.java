public class ConsultantService {

    public boolean selectCar(String model) {
        if (model == null || model.isBlank()) {
            System.out.println("Please select a car model.");
            return false;
        }

        System.out.println("Consultant selected: " + model);
        return true;
    }
}