package com.aktech.standards.repository;

import com.aktech.standards.model.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardsRepository extends JpaRepository<Standard, Long> {
}
