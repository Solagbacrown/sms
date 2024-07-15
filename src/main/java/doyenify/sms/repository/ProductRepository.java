package doyenify.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import doyenify.sms.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
