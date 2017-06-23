package hello;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication
public class Application {

	@Autowired
    private YAMLConfig myConfig;
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			/*Quote quote = restTemplate.getForObject(
					"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			log.info(quote.toString());
			*/
			 HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			//ResponseEntity<Coins> result = restTemplate.exchange("https://api.coinmarketcap.com/v1/ticker/?limit=1",HttpMethod.GET,entity, Coins.class);
			Coins[] result = restTemplate.getForObject("https://api.coinmarketcap.com/v1/ticker/?limit=5", Coins[].class);
			
			String db = myConfig.getdatabase();
			
			
			//System.out.println(Arrays.toString(result));
			String name= result[0].name;
			String leon = result[1].getName();
			System.out.println(name);
			System.out.println(leon);
			System.out.println(db);
			JdbcTemplate jdbcTemplate;
			
			
			
			//(result.toString());
		};
	}
}