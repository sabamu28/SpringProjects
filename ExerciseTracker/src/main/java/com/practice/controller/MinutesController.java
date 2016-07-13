package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.model.Activity;
import com.practice.model.Exercise;
import com.practice.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise")  Exercise exercise){
		
		System.out.println("exercise:"+exercise.getMinutes());
		System.out.println("activity:"+exercise.getActivity());

		return "addMinutes";
	}
	
	@RequestMapping(value="/activities",method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		
		return exerciseService.findAllActivities();
	}
	
//	@RequestMapping("/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise")  Exercise exercise){
//		
//		System.out.println("exercising:"+exercise.getMinutes());
//		return "addMinutes";
//	}
}
