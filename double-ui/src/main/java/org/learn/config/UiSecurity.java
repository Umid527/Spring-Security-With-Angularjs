package org.learn.config;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


/**
 * Created by umahmudov on 26-May-17.
 */

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class UiSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
<<<<<<< HEAD
//        http
//                .httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/index.html", "/home.html", "/login.html", "/").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().
//                csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

        http
                .httpBasic().and()
                .authorizeRequests()
                .antMatchers("/index.html","/").permitAll()
;
//                .anyRequest().authenticated();
=======
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/index.html", "/home.html", "/login.html", "/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().
                csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
    }
}
