package com.example.demo.controllers;

import com.example.demo.model.DataRepository;
import com.example.demo.model.Koopje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailsController {
    @Autowired
    private DataRepository repo;

    @RequestMapping(value = {"/details/{id}"}, method = RequestMethod.GET)
    public String showDetailsForID(@PathVariable(name = "id") int id, ModelMap map) {

        Koopje k=repo.findById(id).get();
        map.addAttribute("artikel",k);
        return "details";
    }

}
