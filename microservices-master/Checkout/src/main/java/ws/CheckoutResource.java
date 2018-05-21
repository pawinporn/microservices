package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CheckoutResource {

    @Autowired
    private CheckoutReposity checkoutReposity;

    @GetMapping("/checkouts")
    public List<Checkout> getAllCheckout() {
        return checkoutReposity.findAll();
    }

    @GetMapping("/checkouts/{id}")
    public Checkout getCheckout(@PathVariable int id) {
        Optional<Checkout> checkout = checkoutReposity.findById(id);
        return checkout.get();
    }


    @PostMapping("/checkouts")
    public void createCheckout(@RequestBody Checkout checkout) {
        Checkout savedcheckout = checkoutReposity.save(checkout);
    }

    @PutMapping("/checkouts/{id}")
    public void editcheckout (@RequestBody Checkout checkout, @PathVariable int id) {
        Optional<Checkout> a = checkoutReposity.findById(id);

        checkout.setId(id);
        checkoutReposity.save(checkout);
    }
    //TODO: 2 implement getCheckouts and getCheckout [5 marks]
    //TODO: 3 implement checkout (create) [5 marks]
}
