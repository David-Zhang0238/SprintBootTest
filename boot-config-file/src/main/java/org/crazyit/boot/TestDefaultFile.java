package org.crazyit.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestDefaultFile {
    //Written by David Zhang
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(
				TestDefaultFile.class)
				.properties(
						"spring.config.location=classpath:/test-folder/zcc/my-config.properties")
				.run(args);
		System.out.println(context.getEnvironment().getProperty("jdbc.user"));
	}

}
