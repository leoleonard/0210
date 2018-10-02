package two;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("mleko", 2.5);
         Product product2 = new Product("mleko", 2.5);
//       Product product2 = product1;

        if (product1 == product2) {
            System.out.println("Równe");
        } else {
            System.out.println("Produkty są różne");
        }

        String str1 = new String("Ania");
        String str2 = new String("Ania");

        // rowne
//        String str1 = "Ania";
//        String str2 = "Ania";

        if (str1 == str2) {
            System.out.println("Równe");
        } else {
            System.out.println("Produkty są różne");
        }
    }
}
