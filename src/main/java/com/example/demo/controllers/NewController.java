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

@Controller
public class NewController {

    @Autowired
    private DataRepository repo;

    @ModelAttribute("newKoopje")
    public Koopje createKoopje() {
        return new Koopje();
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "new";
    }
    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String savePost(@ModelAttribute("newKoopje") @Valid Koopje newKoopje, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "new";
        }
        repo.save(newKoopje);
        return "redirect:/new";

    }

}

