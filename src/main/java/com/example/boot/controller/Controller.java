package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//сразу добавляем аннотацию, что бы Spring нашел этот класс
@RestController
public class Controller {
    /*
    @Value("${boot.username}")
    private String username;//берет значения по умолчанию из проперти, либо можем дефолтное указать здесь, например вот так "${boot.username:Oleg}"
    после создания класса User, реализация уже будет такой:
     */
    //private User user;
    private String user;
//так ак есть аннотация и конструктор один, то спринг инжектирует сюда бин

    //с инфоКонфиг:
    public Controller(String user) { //Ошибку идея не выдала, только при компиляйии, по факту два бина, указываем конкретный
        // @Qualifier("bv")
        this.user = user;
    }



    @GetMapping("/hello")  //когда будет задан запрос на адрес/hello он будет обработан здесь
    public String greeting(){
        return "Hello, " + user + ", from SpringBootApp ! Your pass is";
    }
}
