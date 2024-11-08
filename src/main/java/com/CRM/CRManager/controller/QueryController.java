package com.CRM.CRManager.controller;

import com.CRM.CRManager.model.Query;
import com.CRM.CRManager.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/queries")
public class QueryController {

    @Autowired
    private QueryService queryService;

    @GetMapping
    public String getAllQueries(Model model) {
        model.addAttribute("queries", queryService.getAllQueries());
        return "queries"; // Refers to queries.html template
    }

    @PostMapping("/add")
    public String addQuery(@ModelAttribute Query query) {
        queryService.saveQuery(query);
        return "redirect:/queries";
    }

    @GetMapping("/delete/{id}")
    public String deleteQuery(@PathVariable Long id) {
        queryService.deleteQuery(id);
        return "redirect:/queries";
    }
}
