package demo.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
// We enable a standard cache. You can chose out of many different implementations!
// See: https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-caching.html
@EnableCaching
public class CachingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingDemoApplication.class, args);
	}
}
