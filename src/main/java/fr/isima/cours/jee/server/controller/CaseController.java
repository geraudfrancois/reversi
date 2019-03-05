package fr.isima.cours.jee.server.controller;

import fr.isima.cours.jee.server.business.CaseService;
import fr.isima.cours.jee.server.model.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/case")
public class CaseController {

    private final CaseService caseService;

    @Autowired
    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/save/{x}/{y}")
    public Case save(@PathVariable("x") Integer x, @PathVariable("y") Integer y){
        caseService.save()
    }
}
