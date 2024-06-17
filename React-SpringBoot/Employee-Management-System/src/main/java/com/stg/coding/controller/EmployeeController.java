package com.stg.coding.controller;

import com.stg.coding.dto.EmployeeDto;
import com.stg.coding.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
private EmployeeService employeeService;

//Rest API to add all employee
    @PostMapping
public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
    EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
}
//Rest API to get employee by id
    @GetMapping("{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
      EmployeeDto employeeDto=  employeeService.getEmployeeById(employeeId);
      return ResponseEntity.ok(employeeDto);
    }
//Rest API to get employee
    @GetMapping
    public  ResponseEntity<List<EmployeeDto>> getAllEmployee(){
      List<EmployeeDto> employees = employeeService.getAllEmployees();
      return  ResponseEntity.ok(employees);
    }

    //Rest API to Update the employee
    @PutMapping("{id}")
    public  ResponseEntity<EmployeeDto> updatedEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
       EmployeeDto employeeDto= employeeService.updatedEmployee(employeeId, updatedEmployee);
       return ResponseEntity.ok(employeeDto);
    }
    //Rest API to delete the employee by id
@DeleteMapping("{id}")
  public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return  ResponseEntity.ok("Employee deleted successfully !!");
  }
}
