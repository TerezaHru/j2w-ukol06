package cz.czechitas.java2webapps.ukol6.controller;
import cz.czechitas.java2webapps.ukol6.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class VizitkaController {

    @GetMapping("/")

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
    }
}
