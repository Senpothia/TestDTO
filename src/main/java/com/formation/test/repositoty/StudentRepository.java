package com.formation.test.repositoty;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.formation.test.model.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Override
    public List<StudentEntity> findAll();
}
