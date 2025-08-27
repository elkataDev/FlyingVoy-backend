package com.FlyingVoy.FlyingVoy.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





//Skip de BD, Hace falta crear la conexion .
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
})
public class FlyingVoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyingVoyApplication.class, args);
	}





}
