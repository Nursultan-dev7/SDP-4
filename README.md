# Car Dealership System — Facade Pattern

## 1. Project Description

This project demonstrates the Facade structural design pattern using a Car Dealership System.

The system simulates the process of purchasing a new car. Several services work together, but the client interacts with them through one simple interface called `CarPurchaseFacade`.

## 2. Facade Pattern Structure

### Facade
- `CarPurchaseFacade` — coordinates the car purchase process and calls the subsystem services in the correct order.

### Subsystem Classes
- `ConsultantService` — validates the selected car model.
- `FactoryService` — simulates ordering a car from the manufacturer.
- `CashierService` — validates and processes the payment.
- `DeliveryService` — simulates handing the car over to the customer.

### Client
- `Main` — starts the purchase process by calling the Facade only.

## 3. Project Structure

```text
src/
├── ConsultantService.java
├── FactoryService.java
├── CashierService.java
├── DeliveryService.java
├── CarPurchaseFacade.java
└── Main.java
```

## 4. How the Facade Pattern Works

The client calls one method:

```java
facade.buyCar("Toyota Camry", 15000000);
```

The Facade coordinates the following steps:

1. Validates the selected car model.
2. Sends the order to the factory.
3. Processes the payment.
4. Arranges the delivery of the car.
5. Confirms that the purchase process is complete.

The client does not need to instantiate or call the subsystem classes directly.

**Note:** Factory, payment, and delivery operations are simulated using console messages. This project does not perform real transactions or orders.

## 5. Clean Code Principles

### 1. Meaningful Names
Class and method names clearly describe their purposes, such as `CashierService`, `DeliveryService`, and `buyCar()`.

### 2. Single Responsibility
Each subsystem class has a specific responsibility. For example, `CashierService` handles payment validation, while `DeliveryService` handles the delivery simulation.

### 3. Separation of Responsibilities
`CarPurchaseFacade` coordinates the workflow, while the subsystem classes implement their own operations.

### 4. No Leaking of Subsystem Details
The client uses the simple `buyCar()` method instead of managing the subsystem services directly.

### 5. Error Handling
The Facade stops the purchase process if the car model is invalid, the factory rejects the order, or the payment fails.

## 6. Example Output

```text
Starting car purchase...
Consultant selected: Toyota Camry
Factory received an order for: Toyota Camry
Factory is preparing the car.
Payment received: 1.5E7 KZT
Toyota Camry is ready for delivery.
Car handed over to the customer.
Car purchase completed successfully!
```

## 7. Conclusion

The Facade pattern simplifies the car purchase process by providing one interface for several subsystem services. It makes the client code easier to understand and keeps coordination logic separate from individual service responsibilities.