package br.edu.ifsp.lp2a2.comparex.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


   @GetMapping("/admin")
   public String exibir(){

       return "admin/admin";
   }
}