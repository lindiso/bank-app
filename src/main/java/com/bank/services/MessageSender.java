package com.bank.services;

import software.amazon.awssdk.services.sns.model.PublishResponse;

public interface MessageSender {
    PublishResponse publishMessage(String message);
}
