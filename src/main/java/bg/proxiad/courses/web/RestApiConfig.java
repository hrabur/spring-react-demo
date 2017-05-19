package bg.proxiad.courses.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.SerializationFeature;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class RestApiConfig {

	@Bean
	public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		return Jackson2ObjectMapperBuilder.json()
			.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	}

	@Bean
	public Docket apiDocs() {
		return new Docket(DocumentationType.SWAGGER_2)
			.groupName("api")
			.apiInfo(apiInfo())
			.select()
			.paths(PathSelectors.ant("/api/**"))
			.build();
	}
	
	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
			.title("Test API")
			.description("Test REST API")
			.version("0.1")
			.build();
	}
}
