package com.bank.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.regions.*;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Slf4j
@Component
public class MessageSenderImpl implements MessageSender {

    @Value("${arn.aws.sns}${aws.region}${aws.account.id}${aws.topic.name}")
    String snsTopicArn;

    private SnsClient snsClient = null;

    public MessageSenderImpl() {
        this.snsClient = SnsClient.builder()
                .region(Region.AF_SOUTH_1) // Specify your region
                .build();
    }

    @Override
    public PublishResponse publishMessage(String message) {
        PublishRequest publishRequest = PublishRequest.builder()
                .message(message)
                .topicArn(snsTopicArn)
                .build();
        PublishResponse publishResponse = snsClient.publish(publishRequest);
        if (publishResponse != null) {
            log.info("Message published successfully");
            return publishResponse;
        }
        return null;
    }
}
