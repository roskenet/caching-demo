package demo.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
// We enable a standard cache. You can chose out of many different implementations!
// We configured redis in application.properties
// 
// $ docker run --name local-redis -d -p 6379:6379 redis:4
// 
// Use redis-cli to check that the keys were created for your cache.
// When you run the test twice, it must fail!
@EnableCaching
public class CachingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingDemoApplication.class, args);
	}
}
