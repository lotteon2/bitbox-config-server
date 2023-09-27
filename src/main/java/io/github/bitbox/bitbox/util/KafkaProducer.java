package io.github.bitbox.bitbox.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.github.bitbox.bitbox.exception.KafkaSubmitException;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {
    public static <T> void send(KafkaTemplate<String, Object> kafkaTemplate, String topic, T messageObject) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        String jsonInString;

        try {
            jsonInString = mapper.writeValueAsString(messageObject);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON 파싱에 실패했습니다", e);
        }

        try {
            kafkaTemplate.send(topic, jsonInString);
        } catch (Exception e) {
            throw new KafkaSubmitException("카프카 메시지 전송에 실패했습니다", e);
        }
    }
}