package psu.edu.quiz.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		
		
		//define a query to retrieve a user by username
		jdbcUserDetailsManager.setUsersByUsernameQuery(
				"SELECT username, password, enabled FROM users WHERE username=?"
				);
		//define a query to retrieve authorities by username
		jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
				"SELECT user_id, role FROM roles WHERE user_id=?"
				);
		
		return jdbcUserDetailsManager;
	}

   
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(configurer -> configurer
				.requestMatchers("/").hasRole("EMPLOYEE")
				.requestMatchers("/employees/showFormForAdd").hasAnyRole("ADMIN","MANAGER")
				.anyRequest().authenticated())
				.formLogin(form -> 
						form
						.loginPage("/showMyLoginPage")
						.loginProcessingUrl("/authenticateTheUser")
						.permitAll())
				.logout(logout -> 
					logout.permitAll())
				.exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));

		return http.build();
    }    
}