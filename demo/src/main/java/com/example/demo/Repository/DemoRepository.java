package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {

}
