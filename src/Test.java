public class Test {

    public static void main(String[] args) {
        try {
            SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 400.0);
            SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 400.0);
            SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 500.0);
            SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 500.0);

            Smartphone smartphone1 = new Smartphone("BrandA", "ModelX", 4000, producerPrice1, retailPrice1);
            Smartphone smartphone2 = new Smartphone("BrandB", "ModelY", 3500, producerPrice2, retailPrice2);

            System.out.println("Smartphone 1 details:");
            System.out.println(smartphone1);

            System.out.println("\nSmartphone 2 details:");
            System.out.println(smartphone2);

            if (smartphone1.equals(smartphone2)) {
                System.out.println("\nSmartphone 1 is equal to Smartphone 2.");
            } else {
                System.out.println("\nSmartphone 1 is not equal to Smartphone 2.");
            }

            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();

            System.out.println("\nCloned Smartphone details:");
            System.out.println(clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nSmartphone 2 is equal to the cloned smartphone.");
            } else {
                System.out.println("\nSmartphone 2 is not equal to the cloned smartphone.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
