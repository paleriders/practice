package com.atlearn.practice.repository;

import com.atlearn.practice.entity.Procure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcureRepo extends JpaRepository<Procure,String> {
}
