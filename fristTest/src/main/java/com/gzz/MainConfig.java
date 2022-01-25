package com.gzz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gzz
 * @create 2021-11-27 22:26
 */
@Configuration
public class MainConfig {
	@Bean
	public User user(){
		return new User();
	}
}
