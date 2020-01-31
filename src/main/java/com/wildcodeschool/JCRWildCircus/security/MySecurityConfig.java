package com.wildcodeschool.JCRWildCircus.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser("admin")
				.password(encoder.encode("Admin"))
				.roles("ADMIN");

	}
	
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/**", "/CSS/**", "/JS/**", "/pictures/**").permitAll()
	        .antMatchers("/gestionSpectacle/**", "**/accueilAdmin/**", "/gestionAgenda/**", "/adminSidebar/**", "/CSS/**", "/JS/**", "/pictures/**").hasAnyRole("ADMIN")
	        .and()
	        .formLogin()
	        .and()
	        .httpBasic()
	        .and()
	        .logout();
	   }
}









