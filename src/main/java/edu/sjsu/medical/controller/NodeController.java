package edu.sjsu.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import edu.sjsu.medical.model.IssueForm;
import edu.sjsu.medical.model.NewTransaction;
import edu.sjsu.medical.service.GeneralService;
import edu.sjsu.medical.service.ProductService;

@Controller
public class NodeController{
	
	@Autowired
	ProductService productService;
	
	@Autowired
	GeneralService generalService;
	
	@GetMapping({"/node/{nodeId}"})
    public String home(
    		@PathVariable(value = "nodeId")
			Integer nodeId,
    		Model model,
    		@ModelAttribute IssueForm issueForm,
    		@ModelAttribute NewTransaction newTransactionForm
    		) {
		String nodeName= generalService.getNodeNameById(nodeId);
        model.addAttribute("title", "Node Name");
        model.addAttribute("issueForm", issueForm);
        model.addAttribute("newTransactionForm", newTransactionForm);
        model.addAttribute("nodeName", nodeName);
        model.addAttribute("transactions", generalService.getTransactionByNodeId(nodeId));
        return "nodeController";
    }
	
	
	@RequestMapping( value = {"/issue"})
    public String issue(  		
    		Model model,
    		@ModelAttribute IssueForm issueForm
    		) {
		generalService.issueMedicine(issueForm);
        return "redirect:/mainMenu";
    }
	
	@RequestMapping( value = {"/newTransaction"})
    public String newTransaction(  		
    		Model model,
    		@ModelAttribute NewTransaction newTransactionForm
    		) {
		generalService.newTransaction(newTransactionForm);
        return "redirect:/mainMenu";
    }
	
	@RequestMapping( value = {"/product"})
    public String products(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		model.addAttribute("title", "List of all Medicines");
        return "product";
    }
	
	@RequestMapping( value = {"/transaction"})
    public String transactions(Model model) {
		model.addAttribute("transactions", generalService.getAllTransaction());
		model.addAttribute("title", "List of all Transactions");
        return "transaction";
    }
	
}
