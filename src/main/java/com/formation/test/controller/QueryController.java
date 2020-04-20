package com.formation.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.test.service.QueryService;
import com.formation.test.model.StudentEntity;
import com.formation.test.model.StudentDetail;
import com.formation.test.model.StudentDetail2;

@RestController
@RequestMapping("/api")
public class QueryController {

    @Autowired
    QueryService queryservice;

    @GetMapping("/joinQuery")
    public List<StudentDetail2> getQuery()
    {
        return queryservice.JPQLQuery();
    }

    @GetMapping("/studentData")
    public List<StudentEntity> getstudentData()
    {
        return queryservice.studentAllData();
    }
    
    @GetMapping("/studentData2")
    public void getstudentData2()
    {
        queryservice.test2();
    }
    
    @GetMapping("/studentData3")
    public void getstudentData3()
    {
        queryservice.test3();
    }
    
    @GetMapping("/studentData0")
    public void getstudentData0()
    {
        queryservice.test0();
    }
}