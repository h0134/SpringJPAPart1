package com.jpaproject.JPaProject;

import com.jpaproject.JPaProject.Entities.Employee;
import com.jpaproject.JPaProject.REpos.EmployeeRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPaProjectApplicationTests {

    @Autowired
    EmployeeRepository repository;

    @Test
    void contextLoads() {
    }


    @Test
    public void testCreate() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setAge(23);
        employee.setLocation("Delhi");
        repository.save(employee);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setAge(24);
        employee2.setLocation("Mumbai");
        repository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setAge(25);
        employee3.setLocation("Delhi");
        repository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setAge(26);
        employee4.setLocation("Himachal");
        repository.save(employee4);

        Employee employee5 = new Employee();
        employee5.setId(5);
        employee5.setAge(27);
        employee5.setLocation("Gujrat");
        repository.save(employee5);


    }


    @Test
    public void testUpdate() {
        Employee employee = repository.findById(1).get();
        employee.setLocation("UttarPradesh");
        repository.save(employee);
    }

    @Test
    public void testDelete() {
        repository.deleteById(5);

    }

    @Test
    public void testRead() {
        Employee employee = repository.findById(2).get();
//		assertNotNull(employee);
//		assertEquals("Iphone", employee.getName());
        System.out.println(">>>>>>>>>>>>>>>" + employee.getLocation());
    }


    @Test
    public void testCount() {
        System.out.println("The total number of rows in the table are: " + repository.count());
    }


    @Test
    public void testFindAllPaging() {
        Pageable pageable = PageRequest.of(0, 4, Sort.Direction.ASC, "age");
        Page<Employee> results = repository.findAll(pageable);
        results.forEach(p -> System.out.print(p.getAge()));

    }


    @org.junit.Test
    public void testfindByName() {
        List<Employee> emp = repository.findByLocation("Himachal");
//        emp.stream().forEach(employee -> System.out.println(employee.getAge()));
        emp.forEach(p->System.out.println(p.getAge()));
    }






}














