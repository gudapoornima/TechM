package com.test;
import com.test.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface DeptRepo extends JpaRepository<Dept, Long> {}