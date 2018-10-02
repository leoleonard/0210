public class Car extends Vehicle {

    private boolean radio;

    void enableRadio() {
        radio = true;
    }

    @Override
    void showinfo() {
        System.out.println("jestem samochodem");
    }
}
