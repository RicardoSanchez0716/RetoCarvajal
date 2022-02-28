package com.retocarvajal.repository;

import com.retocarvajal.model.Camiseta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamisetaRepository extends JpaRepository<Camiseta, Long> {
}
