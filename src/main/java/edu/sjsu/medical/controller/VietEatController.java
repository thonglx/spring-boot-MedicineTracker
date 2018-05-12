package edu.sjsu.medical.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.sjsu.medical.dao.ReviewDAO;
import edu.sjsu.medical.model.Review;

@Controller
public class VietEatController {
	
	@Autowired
	ReviewDAO reviewDAO;

	@GetMapping({"/","mainMenu"})
    public String home(Model model, @ModelAttribute Review reviewForm) {
		
		//Get reviews
		List<Review> springReview = reviewDAO.getAllReviewsByProductName("Spring");
		List<Review> phoReview = reviewDAO.getAllReviewsByProductName("Pho");
		List<Review> noodleReview = reviewDAO.getAllReviewsByProductName("Noodle");
		List<Review> pancakeReview = reviewDAO.getAllReviewsByProductName("Pancake");
		List<Review> hotpotReview = reviewDAO.getAllReviewsByProductName("Hotpot");
		
		//get average
		String springAverage = reviewDAO.getAverageByProductName("Spring");
		String phoAverage = reviewDAO.getAverageByProductName("Pho");
		String noodleAverage = reviewDAO.getAverageByProductName("Noodle");
		String pancakeAverage = reviewDAO.getAverageByProductName("Pancake");
		String hotpotAverage = reviewDAO.getAverageByProductName("Hotpot");
		
		//Add reviews
		model.addAttribute("reviewForm", reviewForm);
		model.addAttribute("springReview",springReview);
		model.addAttribute("phoReview",phoReview);
		model.addAttribute("noodleReview",noodleReview);
		model.addAttribute("pancakeReview",pancakeReview);
		model.addAttribute("hotpotReview",hotpotReview);
		
		//Add Average
		model.addAttribute("springAverage",springAverage);
		model.addAttribute("phoAverage",phoAverage);
		model.addAttribute("noodleAverage",noodleAverage);
		model.addAttribute("pancakeAverage",pancakeAverage);
		model.addAttribute("hotpotAverage",hotpotAverage);
		

        return "index";
    }
	
	@RequestMapping(value="/postReview", method = RequestMethod.POST)
    public String postReview(Model model,
    		@ModelAttribute Review reviewForm
    		) {
		reviewForm.setImageNum(String.valueOf(getRandomNumberInRange(1,8)));
		reviewDAO.insertReview(reviewForm);
		return "redirect:/";
    }
	
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
