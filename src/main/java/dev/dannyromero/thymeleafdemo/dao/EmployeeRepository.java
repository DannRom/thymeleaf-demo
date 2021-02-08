package dev.dannyromero.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.dannyromero.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Spring data JPA will parse the method name.
    // You notice in Intellij it lints the first few words of the method
    // but not the rest. The method name is a format that spring-data-jpa uses
    // to query the database. Now we can use this method in our service layer.
    //
    // Also note that because Thymeleaf is server-side, setting the order must
    // also be done server side.
    public List<Employee> findAllByOrderByLastNameAsc();
}
