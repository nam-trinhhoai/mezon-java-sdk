// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface ChannelMessageUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.ChannelMessageUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The channel the message was sent to.
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * The channel the message was sent to.
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * The ID assigned to the message to update.
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * The ID assigned to the message to update.
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   * New message content.
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * New message content.
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();
}