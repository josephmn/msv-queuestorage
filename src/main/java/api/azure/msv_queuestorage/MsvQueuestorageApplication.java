package api.azure.msv_queuestorage;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MsvQueuestorageApplication {

	private final static Logger logger = LoggerFactory.getLogger(MsvQueuestorageApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MsvQueuestorageApplication.class, args);
	}

}
