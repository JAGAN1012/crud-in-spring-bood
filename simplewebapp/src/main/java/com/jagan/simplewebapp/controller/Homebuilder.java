package com.jagan.simplewebapp.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

 @RestController
public class Homebuilder {
 @RequestMapping("/")

 public String greet() {
	 return "welcome to tesulko!!!";
 }
 @RequestMapping("/about")
 public String about() {
	 return "welcome jagan.....";
 }
 @RequestMapping("/contact")
 public String contact() {
	 return "12345678910";
 }
}
