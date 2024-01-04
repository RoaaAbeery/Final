package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.Model.Company;
import com.example.foodtruck.Model.Employee;
import com.example.foodtruck.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public void addEmployee(Employee employee){
        Employee add=employeeRepository.findEmployeeById(employee.getId());
        if (add == null) {
            throw new ApiException("the id nt found");
        }
        employeeRepository.save(add);
    }
    public void updateEmployee(Integer auth ,Employee employee) {
        Employee oldadd = employeeRepository.findEmployeeById(auth);
        if (oldadd == null) {
            throw new ApiException("the id nt found");
        }
        employee.setId(oldadd.getId());
        employeeRepository.save(employee);
    }
    public void deleteEmployee(Integer auth){
        Employee com = employeeRepository.findEmployeeById(auth);
        if (com == null) {
            throw new ApiException("the id nt found");
        }
        employeeRepository.delete(com);
    }
}
