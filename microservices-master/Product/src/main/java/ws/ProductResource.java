package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductResource {

    @Autowired
    private ProductReposity productReposity;

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return productReposity.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        Optional<Product> product = productReposity.findById(id);
        return product.get();
    }


    @PostMapping("/products")
    public void createProduct(@RequestBody Product product) {
        Product savedProduct = productReposity.save(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable int id) {
        Optional<Product> p = productReposity.findById(id);

        product.setId(id);
        productReposity.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productReposity.deleteById(id);
    }

    //TODO: 3 implement getProducts and getProduct [5 marks]
    //TODO: 4 implement addProduct [5 marks]
    //TODO: 5 implement updateProduct [5 marks]
    //TODO: 6 implement deleteProduct [5 marks]
}

