package cz.czechitas.java2webapps.ukol6.controller;
import cz.czechitas.java2webapps.ukol6.entity.Vizitka;
import cz.czechitas.java2webapps.ukol6.repository.VizitkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class VizitkaController {

    private final VizitkaRepository vizitkaRepository;

    @Autowired
    public VizitkaController(VizitkaRepository vizitkaRepository) {
        this.vizitkaRepository = vizitkaRepository;
    }
    @InitBinder
    public void nullStringBinding(WebDataBinder binder) {
        //prázdné textové řetězce nahradit null hodnotou
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @GetMapping("/")
    public Object seznam() {
        return new ModelAndView("seznam")
                .addObject("osoby", vizitkaRepository.findAll());
    }


    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("vizitka");
        Vizitka vizitka = vizitkaRepository.findById(new Long(id)).get();
        modelAndView.addObject("vizitka", vizitka);

        return modelAndView;
    }

    @GetMapping("/nova")
    public ModelAndView formular() {
        ModelAndView modelAndView= new ModelAndView("formular");
        modelAndView.addObject("vizitka", new Vizitka());
        return modelAndView;
    }
    @PostMapping("/nova")
    public Object pridat(/*@PathVariable long id, */@ModelAttribute("vizitka") @Valid Vizitka vizitka, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "formular";
        }
    //vizitka.setId(id);
    vizitkaRepository.save(vizitka);
    return "redirect:/";
    }


}

