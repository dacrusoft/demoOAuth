package co.edu.usco.demoOauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	public void configure(HttpSecurity http) throws Exception{
		
		http
			.antMatcher("/**").authorizeRequests()
			.antMatchers(new String[] {"/", "/free"}).permitAll()
			.anyRequest().authenticated()
			.and()
			.oauth2Login();
		
	}
}
