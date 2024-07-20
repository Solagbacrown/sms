package doyenify.sms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doyenify.sms.entities.Product;
import doyenify.sms.repository.ProductRepository;


@Service
public class ProductService {
   @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }


    public void updateProduct(Long id, Product product) throws Exception {
        var savedProduct = getProduct(id);

        if(savedProduct != null){
            savedProduct.setPrice(product.getPrice());
            savedProduct.setDescription(product.getDescription());
            savedProduct.setName(product.getName());
            savedProduct(savedProduct);
            return;
        }

        throw new Exception("Product not found");
      }

    public void savedProduct(Product product) {
        productRepository.saveAndFlush(product);
    }


    public void deleteProduct(Long id) {
       productRepository.deleteById(id);
    }


    public ArrayList<Product> getAllProducts() {
        return (ArrayList<Product>) productRepository.findAll();
            }
}
