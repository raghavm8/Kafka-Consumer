package demokafka.consumer.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfiguration {
    
    @KafkaListener(topics = ConfigurationConstants.Topic_Name_For_Update_Data, groupId = ConfigurationConstants.Group_Id)
    public void UpdateData(String data) {
        System.out.println(data);
    }

}
