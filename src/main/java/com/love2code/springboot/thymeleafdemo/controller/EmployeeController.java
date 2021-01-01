package com.love2code.springboot.thymeleafdemo.controller;

import com.love2code.springboot.thymeleafdemo.entity.Employee;
import com.love2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model model) {

        // get the employees from the db
        List<Employee> theEmployees = employeeService.findAll();
        model.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        // create model attribute to bind from data
        Employee theEmp = new Employee();

        theModel.addAttribute("employee", theEmp);

        return "/employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmp) {
        // save the employee
        employeeService.save(theEmp);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int empId, Model theModel) {
        // get the employee fromt the service
        Employee theEmployee = employeeService.findById(empId);

        // set the employee as a model attribute to pre-populate the form
        theModel.addAttribute("employee", theEmployee);

        // send over to our form
        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String showFormForUpdate(@RequestParam("employeeId") int empId) {

        // get the employee from the service
        employeeService.deleteById(empId);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }
}
