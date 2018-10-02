package two;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("mleko", 2.5);
         Product product2 = new Product("mleko", 2.5);
//       Product product2 = product1;

        if (product1.equals(product2)) {
            System.out.println("Równe");
        } else {
            System.out.println("Produkty są różne");
        }



        String str1 = new String("Ania");
        String str2 = new String("Ania");

        // rowne
//        String str1 = "Ania";
//        String str2 = "Ania";

//        if (str1 == str2) {
//            System.out.println("Równe");
//        } else {
//            System.out.println("Produkty są różne");
//        }

        if (str1.equals(str2)) {
            System.out.println("Równe");
        } else {
            System.out.println("Produkty są różne");
        }

        int hash1 = product1.hashCode();
        int hash2 = product2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);

       String opis1 = product1.toString();
        String opis2 = product2.toString();
        System.out.println(opis1);
        System.out.println(opis2);
        System.out.println(product1.toString());
        System.out.println(product2);
    }
}
