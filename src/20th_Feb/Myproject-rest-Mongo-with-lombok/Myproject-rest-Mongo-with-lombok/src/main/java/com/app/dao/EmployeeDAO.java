package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.model.EmployeeModel;

@Repository
public interface EmployeeDAO extends MongoRepository<EmployeeModel, Long> {

}
