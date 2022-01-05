package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		Hello hello = new Hello();
		hello.setH("hello");
		String data = hello.getH();
		System.out.println(data);
=======
>>>>>>> bf435117f0148c5b4ad6410e2a6bc4a0931bf3b7

		SpringApplication.run(JpashopApplication.class, args);
	}

}
