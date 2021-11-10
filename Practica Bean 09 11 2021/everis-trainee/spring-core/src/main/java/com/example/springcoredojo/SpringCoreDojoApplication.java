package com.example.springcoredojo;

import com.example.springcoredojo.youtube.usuario.Youtuber;
import org.springframework.context.ApplicationContext;
import com.example.springcoredojo.entidades.Config;
import com.example.springcoredojo.entidades.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDojoApplication.class, args);

/****************************************** Para Youtubero   *************************************************/

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("user-bean-config.xml");
        Youtuber youtuber= (Youtuber)appcontext.getBean("Youtuber");
        System.out.println(youtuber.getNombre());
        ((ConfigurableApplicationContext) appcontext).close();
    }
    }

/****************************************** Para Usuario  /  Alumno ******************************************/

/*
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            creacionBean();
        };
    }

    private void creacionBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Usuario BeanNombre = context.getBean("usuario", Usuario.class);
        System.out.println("Compania: " + BeanNombre);


    }

}
*/