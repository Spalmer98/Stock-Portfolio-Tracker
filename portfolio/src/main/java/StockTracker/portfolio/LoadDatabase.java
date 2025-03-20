package StockTracker.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StockRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Stock("General Electric", "GE", "$203.93")));
            log.info("Preloading " + repository.save(new Stock("Microsoft Corp", "MSFT", "$386.84")));
        };

    }
    
}
