
package com.sugarDreams.controller;


import com.sugarDreams.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/menu")


public class MenuController {
    @GetMapping("/menu")
    public String reposteria(){
        
        
        return "/menu/menu";
        
    }
    
}
