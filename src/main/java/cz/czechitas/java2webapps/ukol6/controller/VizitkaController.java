package cz.czechitas.java2webapps.ukol6.controller;
import cz.czechitas.java2webapps.ukol6.repository.VizitkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class VizitkaController {

    private final VizitkaRepository repository;

    @Autowired
    public VizitkaController(VizitkaRepository repository) {
        this.repository = repository;
    }
    @InitBinder
    public void nullStringBinding(WebDataBinder binder) {
        //prázdné textové řetězce nahradit null hodnotou
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @GetMapping("/")
    public Object seznam() {
        return new ModelAndView("seznam")
                .addObject("osoby", repository.findAll());
    }

    /*@GetMapping("/")


    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView vizitka() {
        ModelAndView modelAndView= new ModelAndView("vizitka");
        return modelAndView;
    }

    @GetMapping("/nova")
    public ModelAndView formular() {
        ModelAndView modelAndView= new ModelAndView("formular");
        return modelAndView;

     */
    }

