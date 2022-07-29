package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Libreria;

@RestController
@RequestMapping({"generales"})
public class GeneralesController {
    private Libreria libreria;
    
    public GeneralesController()
    {
        libreria = new Libreria();
        libreria.setNombre("Libreria Central");
        libreria.setDireccion("Cerca del Centro");
        libreria.setTelefono("123456789");
        libreria.setHorario("9-18");
    }


    @GetMapping("/")
    public Libreria info()
    {
        return libreria;
        
    }

    @GetMapping("/nombre")
    public String nombre()
    {
        return libreria.getNombre();
        
    }

    @GetMapping("/direccion")
    public String direccion()
    {
        return libreria.getDireccion();
        
    }

    @GetMapping("/telefono")
    public String telefono() {
        return libreria.getTelefono();
    }

    @GetMapping("/horario")
    public String horario() {
        return libreria.getHorario();
    }

    @PostMapping("/user")
    @ResponseBody
    public String user(String user) {
        return "USER con método POST --> " + user;
    }
}
