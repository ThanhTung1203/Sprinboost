package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping()
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("list", employeeRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(Employee employee) {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView create(Employee employee) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        employeeRepository.save(employee);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("employee/edit");
        modelAndView.addObject("item", employeeRepository.findById(id).get());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        employeeRepository.deleteById(id);
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search() {
        ModelAndView modelAndView = new ModelAndView("employee/search");

       return modelAndView;
    }
}