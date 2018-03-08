package madvirus.boot20jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class Boot20JacksonApplication implements Jackson2ObjectMapperBuilderCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(Boot20JacksonApplication.class, args);
	}

	@Override
	public void customize(Jackson2ObjectMapperBuilder builder) {
	}
}
