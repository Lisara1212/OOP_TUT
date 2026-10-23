package uk.ac.westminster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

 //   @GetMapping("/{id}")
//    public Product getbyId(@PathVariable("id") Long id ) {
//        return new Product(id,"Laptop",999.9);
    @GetMapping("/products")
    public List<Product> getProducts(@PathVariable String id) {
        return productService.getAllProducts();


    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {

        return productService.getProductById(id).orElse(null);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {

        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
            return "Product with id " + id + " has been deleted";

    }
    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }



}



