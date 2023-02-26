package com.example.hw02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping()
    public String startPage (){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String introProject (){
        return "Ф.И.О.: Желяева Дарья Александровна; " +
                "Название проекта: 'hw02'; " +
                "Дата создания проекта: 25.02.2023; " +
                "Описание проекта: Создание web-приложения" ;
    }

}
