package delta.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Define a conexao com o banco de dados
@SpringBootApplication
@EntityScan(basePackages = "br.edu.faculdadedelta.modelo")
@ComponentScan(basePackages = {"br.edu.*"})
@EnableJpaRepositories(basePackages = {"br.edu.faculdadedelta.repository"})
@EnableTransactionManagement
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
