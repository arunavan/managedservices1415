package com.journaldev.mvcpattern.controller;

import com.journaldev.mvcpattern.model.Person;
import com.journaldev.mvcpattern.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("person", new Person());
        return "greeting";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String addPerson(Model model, @ModelAttribute Person person) {
        personService.createPerson(person);
        model.addAttribute("people", personService.getAllPersons());
        return "result";
    }
}
