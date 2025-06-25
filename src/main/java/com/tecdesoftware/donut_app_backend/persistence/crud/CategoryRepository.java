package com.tecdesoftware.donut_app_backend.persistence.crud;
import com.tecdesoftware.donut_app_backend.persistence.entity.Category;
import com.tecdesoftware.donut_app_backend.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
