package doyenify.sms.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import doyenify.sms.entities.Product;
import doyenify.sms.service.ProductService;

@RestController
public class ProductController {
   
    @Autowired
    private ProductService productService;



@GetMapping("/products/{id}")
        public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }


@PostMapping("/products")
    public void addProduct(@RequestBody Product product){
    productService.savedProduct(product);  
    }


@PutMapping("/products/{id}")
public void updateProduct(@RequestBody Product product, @PathVariable Long id) throws Exception{
            productService.updateProduct(id, product);
}


}
