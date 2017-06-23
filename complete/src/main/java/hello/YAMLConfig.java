package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {
  
    private String name;
    private String environment;
    private String database;
 
    public String getdatabase() {
        return database;
  }

  public void setDatabase(String database) {
        this.database = database;
  }
    
    // standard getters and setters
 
}