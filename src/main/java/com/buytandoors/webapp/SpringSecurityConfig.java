package com.buytandoors.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Resource(name = "userDetailService")
//	private UserDetailsService userDetailsService;
//
//	@Autowired
//	AdminUserRepository adminUserRepository;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
            .ignoring()
                .antMatchers("/auth", "/error", "/productimages/**", "/plugins/**", "/js/**", "/images/**", "/bootstrap/**", "/css/**",
						"/fonts/**");
    }
    
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home", "/error").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll().defaultSuccessUrl("/dashboard")
				.and()
			.logout()
				.permitAll();
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		SimpleUrlAuthenticationSuccessHandler authSuccessHandler = new SimpleUrlAuthenticationSuccessHandler();
//	    authSuccessHandler.setUseReferer(true);
//		http.authorizeRequests()
//				.antMatchers("/", "/index").permitAll()
//				.anyRequest().authenticated().and().formLogin().loginPage("/login")
//				.defaultSuccessUrl("/dashboard").permitAll().and().logout().permitAll();
//	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user);
	}
	
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//	}
//
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//	    return super.authenticationManagerBean();
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//		return encoder;
//	}
}