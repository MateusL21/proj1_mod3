package com.abutua.model.projectmod3.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControler {

    @GetMapping("student")
    public String getStudent(){
        return "Eu sou um Estudante";
    }
    
}
