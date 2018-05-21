package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String brand;
    private int price;
    private int stocknumber;

    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Product() {}

    public static Product get() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getstocknumber() {
        return stocknumber ;
    }

    public void setstocknumber(int stocknumber) {
        this.stocknumber = stocknumber;
    }




//-------------------------------------------ประกาศ--------------------------------------
    @Override
    public String toString() {
        return String.format("Product [id=%s, name=%s,brand=%s,price=%s,stocknumber=%s]", id, name,brand,price,stocknumber);
    }
}
