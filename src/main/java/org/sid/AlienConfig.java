package org.sid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AlienConfig {
	@Bean
	public Laptop lapben() {
		return new Laptop();
	}
	
	@Bean()
	public Alien alienbean() {
	Alien ali = new Alien();
	ali.setLap(lapben());
	return ali;
	}

}
