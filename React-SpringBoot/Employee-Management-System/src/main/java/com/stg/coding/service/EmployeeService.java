package com.stg.coding.service;

import com.stg.coding.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
   EmployeeDto getEmployeeById(Long employeeId);
   List<EmployeeDto> getAllEmployees();
   EmployeeDto updatedEmployee(Long employeeId,EmployeeDto updatedEmployee);
   void deleteEmployee(Long employeeId);
}
