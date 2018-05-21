package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    private int id;
    private int customerId;
    private int[] productIds;


    //TODO: 1 add getters and setters for the fields (10 marks)

    public ShoppingCart() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCustomerId(int customerId ) {
        this.customerId = customerId;
    }
    public int getCustumerId() {
        return (int) customerId;
    }

    public void setProductIds(int[] productIds) {
        this.productIds = productIds;
    }

    public int[] getProductIds() {
        return productIds;
    }

    @Override
    public String toString(){
        return String.format("ShoppingCart [id=%s,customerId=%s,productIds=%s]", id,customerId, productIds);
    }

}
