package sicurezza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Prj41BasicSpringSecurityApplication extends WebSecurityConfigurerAdapter{

	@RequestMapping("")
	public String home() {
		return "pippo";
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Prj41BasicSpringSecurityApplication.class, args);
	}

}
