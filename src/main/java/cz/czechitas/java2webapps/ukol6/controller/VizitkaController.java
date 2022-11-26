package cz.czechitas.java2webapps.ukol6.controller;
import cz.czechitas.java2webapps.ukol6.entity.Vizitka;
import cz.czechitas.java2webapps.ukol6.repository.VizitkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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

            Optional<Vizitka> optionalvizitka = vizitkaRepository.findById(new Long(id));

            if(optionalvizitka.isPresent()) {
                Vizitka vizitka = optionalvizitka.get();
                modelAndView.addObject("vizitka", vizitka);
                return modelAndView;
            }
            else{
                throw new ResponseStatusException(NOT_FOUND, "404 not found - Vizitka nenalezena.");
            }
    }
    @GetMapping("/nova")
    public ModelAndView formular() {
        ModelAndView modelAndView= new ModelAndView("formular");
        modelAndView.addObject("vizitka", new Vizitka());
        return modelAndView;
    }
    @PostMapping("/nova")
    public Object pridat(@ModelAttribute("vizitka") @Valid Vizitka vizitka, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "formular";
        }

    vizitkaRepository.save(vizitka);
    return "redirect:/";
    }


}

