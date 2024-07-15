package doyenify.sms.service;

import org.springframework.stereotype.Service;

import doyenify.sms.entities.Product;
import doyenify.sms.repository.ProductRepository;


@Service
public class ProductService {
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
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
}
