package doyenify.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import doyenify.sms.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
