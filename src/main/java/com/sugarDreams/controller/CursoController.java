
package com.sugarDreams.controller;

import com.sugarDreams.domain.Curso;
import com.sugarDreams.service.CursoService;
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
@RequestMapping("/curso")
public class CursoController {
     @Autowired
    private CursoService cursoService;
    @GetMapping("/reposteria")
    public String reposteria(){
        
        
        return "/curso/reposteria";
        
    }
    @GetMapping("/brownie")
    public String brownie(){
        
        
        return "/curso/brownie";
        
    }
    @GetMapping("/queque")
    public String queque(){
        
        
        return "/curso/queque";
        
    }
    @GetMapping("/quequeSeco")
    public String quequeSeco(){
        
        
        return "/curso/quequeSeco";
        
    }
    @PostMapping("/guardar")
    public String guardar(Curso curso){
        
            cursoService.save(curso);
           
        return "redirect:/curso/reposteria";
        
        
    }
    
    
}
