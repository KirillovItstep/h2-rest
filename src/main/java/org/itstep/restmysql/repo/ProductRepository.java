package org.itstep.restmysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.itstep.restmysql.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
