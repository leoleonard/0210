package two;

import java.util.Objects;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //referencja na ten sam obiekt; this to produkt 1, obj to produkt 2
            return true;
        }
        if (obj == null) { //obiekt nie moze byc pusty (null)
            return false;
        }
        if (!(obj instanceof Product)) { //zabezpieczenie przed porownaniem obiektow roznych typow
            return false;
        }
        Product other = (Product)obj; // rzutowanie by odblokowac dostep do klas
        if (name == null) {             // name do produkt1; gdyby nazwa nie zostala ustanowiona w obiekcie
            if (other.name != null) {   // nazwa w drugim obiekcie nie jest nullem
                return false;
            }
        } else if (!name.equals(other.name)) { // jesli nazwy są nie? rowne, zwroc false;
            return false;
        }
        if(price != other.price)            // ceny sa takie same;
            return false;
        return true; // porownanie nie tylko referencji, ale i wartosci strukturalnej;
//        return super.equals(obj);
    }
//
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + " ::: " + price;
    }
}
