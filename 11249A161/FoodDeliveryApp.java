class OrderPlacement extends Thread {
    public void run() {
        System.out.println("[Placement] Order received. Processing payment and confirming order...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[Placement] Order placed successfully!");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("[Delivery] Driver assigned. Food is out for delivery...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[Delivery] Order delivered to customer!");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        OrderPlacement placementThread = new OrderPlacement();
        OrderDelivery deliveryThread = new OrderDelivery();

        try {
            placementThread.start();
            placementThread.join(); // Ensures delivery begins only after placement finishes

            deliveryThread.start();
            deliveryThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}