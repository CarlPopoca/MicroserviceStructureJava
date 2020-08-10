
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@ComponentScan(basePackages = {"com.microservicio.*"})
@EntityScan(basePackages ={"com.microservicio.*"})
@EnableJpaRepositories(basePackages ={ "com.microservicio.*"})
@EnableDiscoveryClient
public class ContactApplication {
 public static void main(String[] args)
 {
	 SpringApplication.run(ContactApplication.class, args);
 }


}
