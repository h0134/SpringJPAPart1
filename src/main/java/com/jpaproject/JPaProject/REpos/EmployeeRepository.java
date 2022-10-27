package com.jpaproject.JPaProject.REpos;

import com.jpaproject.JPaProject.Entities.Employee;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//public interface ProductRepository  extends  CrudRepository<Product, Integer>
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByLocation(String location);

    List<Employee> findByLocationStartingWith(String Location);


//    List<Employee> findByNameAndDesc(String name , String desc);
//    List<Employee> findByPriceGreaterThan(double price);
//    List<Employee> findByDescContains(String desc);
//    List<Employee> findByPriceBetween(double price1, double price2);
//   List<Product> findbyDescLike(String desc);


}
