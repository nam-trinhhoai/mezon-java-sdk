package com.heroiclabs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

class ChannelMessageContent {
}

class ApiMessageMention {
}

class ApiMessageAttachment {
}

class ApiMessageRef {
}

class ChannelMessageAck {
}

// Interface Client
public interface ClientListener {
    CompletableFuture<String> authenticate();

    CompletableFuture<ChannelMessageAck> sendMessage(
            String clanId,
            String channelId,
            int mode,
            boolean isPublic,
            ChannelMessageContent msg,
            List<ApiMessageMention> mentions,
            List<ApiMessageAttachment> attachments,
            List<ApiMessageRef> refs
    );

    void on(String event, EventListener func);

    void remove(String event, EventListener func);

    CompletableFuture<ChannelMessageAck> sendDMChannelMessage(
            String userId,
            String msg,
            Map<String, Object> messOptions,
            List<ApiMessageAttachment> attachments,
            List<ApiMessageRef> refs
    );
}

@FunctionalInterface
interface EventListener {
    void handle(Object... args);
}
