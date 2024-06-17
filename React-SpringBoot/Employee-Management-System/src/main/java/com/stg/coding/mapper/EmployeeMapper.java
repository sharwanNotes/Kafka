package com.stg.coding.mapper;

import com.stg.coding.dto.EmployeeDto;
import com.stg.coding.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
           employee.getEmpId(),
           employee.getFirstName(),
           employee.getLastName(),
                employee.getEmail()
        ) ;
    }
    public  static  Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getEmpId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail());
    }
}
