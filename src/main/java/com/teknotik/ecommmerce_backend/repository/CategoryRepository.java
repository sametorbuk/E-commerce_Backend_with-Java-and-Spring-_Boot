package com.teknotik.ecommmerce_backend.repository;

import com.teknotik.ecommmerce_backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
