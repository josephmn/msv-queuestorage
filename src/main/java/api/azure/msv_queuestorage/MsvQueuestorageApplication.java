package api.azure.msv_queuestorage;

import api.azure.msv_queuestorage.configuration.MessageQueueConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageQueueConfiguration.class)
public class MsvQueuestorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvQueuestorageApplication.class, args);
	}

}
