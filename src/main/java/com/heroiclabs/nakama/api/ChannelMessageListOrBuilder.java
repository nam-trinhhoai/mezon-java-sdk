// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface ChannelMessageListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ChannelMessageList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.ChannelMessage> 
      getMessagesList();
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1 [json_name = "messages"];</code>
   */
  com.heroiclabs.nakama.api.ChannelMessage getMessages(int index);
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1 [json_name = "messages"];</code>
   */
  int getMessagesCount();
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.ChannelMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1 [json_name = "messages"];</code>
   */
  com.heroiclabs.nakama.api.ChannelMessageOrBuilder getMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * The cursor to send when retrieving the next page, if any.
   * </pre>
   *
   * <code>string next_cursor = 2 [json_name = "nextCursor"];</code>
   * @return The nextCursor.
   */
  java.lang.String getNextCursor();
  /**
   * <pre>
   * The cursor to send when retrieving the next page, if any.
   * </pre>
   *
   * <code>string next_cursor = 2 [json_name = "nextCursor"];</code>
   * @return The bytes for nextCursor.
   */
  com.google.protobuf.ByteString
      getNextCursorBytes();

  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>string prev_cursor = 3 [json_name = "prevCursor"];</code>
   * @return The prevCursor.
   */
  java.lang.String getPrevCursor();
  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>string prev_cursor = 3 [json_name = "prevCursor"];</code>
   * @return The bytes for prevCursor.
   */
  com.google.protobuf.ByteString
      getPrevCursorBytes();

  /**
   * <pre>
   * Cacheable cursor to list newer messages. Durable and designed to be stored, unlike next/prev cursors.
   * </pre>
   *
   * <code>string cacheable_cursor = 4 [json_name = "cacheableCursor"];</code>
   * @return The cacheableCursor.
   */
  java.lang.String getCacheableCursor();
  /**
   * <pre>
   * Cacheable cursor to list newer messages. Durable and designed to be stored, unlike next/prev cursors.
   * </pre>
   *
   * <code>string cacheable_cursor = 4 [json_name = "cacheableCursor"];</code>
   * @return The bytes for cacheableCursor.
   */
  com.google.protobuf.ByteString
      getCacheableCursorBytes();
}