package org.learn.config;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


/**
 * Created by umahmudov on 24-Apr-17.
 */

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/index.html", "/home.html", "/login.html", "/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().
                csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }
}