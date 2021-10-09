package com.example.boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InfoConfig {

    //создаем бины, можем их использовать, например, в контроллере
    @Bean
    // @Primary //позволяет поставить приоритет, если есть несколько бинов одного типа, то при конфликтах брать этот параметр
    //можем использовать
    @ConditionalOnProperty(name = "boot.enabled", havingValue = "true") //если два бина, то лучше использовать true//false, если больше то перечисление
                                                                        //можно дополнить matchIfMissing = true - если в проверти не прописано, то будет использовано
    public String name(){
        return "Ivan";
    }

    @Bean
    public String anotherName(){
        return "Another name";
    }
}
