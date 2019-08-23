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
						"spring.config.location=classpath:/test-folder/my-config.properties")
				.run(args);
		// 输出变量,哈哈
		System.out.println(context.getEnvironment().getProperty("jdbc.user"));
	}

}
