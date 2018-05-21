package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Checkout {

    @Id
    @GeneratedValue
    private int id;

    private int shoppingCartId;
    private int total;
    private Date checkoutDate;


    //TODO: 1 add getters and setters for the fields (5 marks)

    public Checkout() {}

    public static CheckoutResource get() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public int getShoppingCartId() { return shoppingCartId; }

    public void setTotal(int total) { this.total = total; }

    public int getTotal() { return total; }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
