package api.azure.msv_queuestorage.configuration;

import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.QueueClientBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "azure.queue-storage")
public class MessageQueueConfiguration {

    private String endpoint;
    private String queueName;
    private String sasToken;

    @Bean
    public QueueClient getQueueClient() {
        QueueClient client = new QueueClientBuilder()
                .endpoint(endpoint)
                .queueName(queueName)
                .sasToken(sasToken)
                .buildClient();
        client.createIfNotExists();
        return client;
    }
}
