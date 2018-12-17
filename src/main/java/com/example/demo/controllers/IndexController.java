package com.example.demo.controllers;

import com.example.demo.model.DataRepository;
import com.example.demo.model.Koopje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Iterator;


@Controller
public class IndexController {


    @Autowired
    private DataRepository repo;

    @ModelAttribute("all")
    public Iterable <Koopje>  findAll(){
        return repo.findAll();
    }


    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }


}
