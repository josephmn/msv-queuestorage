package api.azure.msv_queuestorage.api;

import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.models.SendMessageResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class MessageApi {

    private final QueueClient client;

    @GetMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        if (null != message) {
            SendMessageResult sendMessageResult = client.sendMessage(message);
            log.info("Message sent with Id:{}", sendMessageResult.getMessageId());
            return message + " -> sent to the queue successfully";
        }

        return "message is empty or null, please send valid message";
    }
}
