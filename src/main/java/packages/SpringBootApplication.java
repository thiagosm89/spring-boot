package packages;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
