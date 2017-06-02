package org.learn.config;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


/**
 * Created by umahmudov on 31-May-17.
 */


@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .httpBasic().and()
                .logout().and()
                .authorizeRequests()
                .antMatchers("/index.html", "/login", "/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf()
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
        // @formatter:on
    }
//@Configuration
//public class SpringSecurityConfig
//        extends WebSecurityConfigurerAdapter
//{

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic().disable();
//        http.authorizeRequests().anyRequest().authenticated();
//    }
}
