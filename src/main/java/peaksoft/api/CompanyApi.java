package peaksoft.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.models.Company;
import peaksoft.services.CompanyServices;

/**
 * name : kutman
 **/
@Controller
@RequestMapping("/home")
public class CompanyApi {
    private final CompanyServices companyServices;
    @Autowired
    public CompanyApi(CompanyServices companyServices) {
        this.companyServices = companyServices;
    }

    @GetMapping
    public String getAllCompany(Model model){
        model.addAttribute("getAll",companyServices.getAllCompanies());
        return "index";
    }

    @GetMapping("/create")
    public String createCompany(Model model){
        model.addAttribute("newComp",new Company());
        return "addCompany";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("newComp")Company company){
        companyServices.save(company);
        return "redirect:/home";
    }

    @DeleteMapping("{companyID}/delete")
    public String deleteById(@PathVariable("companyID")Long id){
        companyServices.deleteCompany(id);
        return "redirect:/home";
    }

    @PostMapping
    public String find(Model model){
        model.addAttribute("updateComp",new Company());
        return "update";

    }
    @PostMapping("{id,company}/update")
    public String update(@PathVariable("id")Long id,@ModelAttribute("updateComp")Company company){
        companyServices.updateCompany(id,company);
        return "redirect:/home";
    }



}
