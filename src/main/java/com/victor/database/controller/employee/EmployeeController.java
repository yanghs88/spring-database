package com.victor.database.controller.employee;

import com.victor.database.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    EmployeeController (EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping({"/employee"})
    @ResponseBody
    public List<Map<String, Object>> getEmployee() {
        return this.employeeService.getEmployee();
    }
}
