package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
аннотация, которая содержит в себе @Configuration @EnableAutoConfiguration @ComponentScan
Функционал, включаемый аннотацией @SpringBootApplication по умолчанию:
● Конфигурирование. Класс может содержать декларацию бинов с помощью @Bean.
● Автоконфигурация. Включает функционал автоконфигурирования.
● Поиск бинов и конфигураций. С текущего пакета начнется
поиск классов, помеченных аннотациями @Component или
@Configuration.
*/
@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        //метод run запускает Spring по поиску бинов и конфигурированю
        //создаст неявно dispatcher servlet который обрабатывает запросы, по сути механизмы javaEE
        //dispatcher найдет контроллер

        SpringApplication.run(BootApplication.class, args);

		/*
		моем получить наш бин:
		ApplicationContext context = SpringApplication.run(BootApplication.class, args);
		context.getBean(Controller.class);
		*/

    }

}
