// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The identifier of the schedule.
   * </pre>
   *
   * <code>string schedule_id = 1 [json_name = "scheduleId"];</code>
   * @return The scheduleId.
   */
  java.lang.String getScheduleId();
  /**
   * <pre>
   * The identifier of the schedule.
   * </pre>
   *
   * <code>string schedule_id = 1 [json_name = "scheduleId"];</code>
   * @return The bytes for scheduleId.
   */
  com.google.protobuf.ByteString
      getScheduleIdBytes();

  /**
   * <pre>
   * The send time for the message.
   * </pre>
   *
   * <code>int64 send_time = 2 [json_name = "sendTime"];</code>
   * @return The sendTime.
   */
  long getSendTime();

  /**
   * <pre>
   * A key-value pairs of metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * A key-value pairs of metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * A key-value pairs of metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * A key-value pairs of metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A key-value pairs of metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The time the message was created.
   * </pre>
   *
   * <code>int64 create_time = 4 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <pre>
   * The time the message was updated.
   * </pre>
   *
   * <code>int64 update_time = 5 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  long getUpdateTime();

  /**
   * <pre>
   * The time the message was read by the client.
   * </pre>
   *
   * <code>int64 read_time = 6 [json_name = "readTime"];</code>
   * @return The readTime.
   */
  long getReadTime();

  /**
   * <pre>
   * The time the message was consumed by the identity.
   * </pre>
   *
   * <code>int64 consume_time = 7 [json_name = "consumeTime"];</code>
   * @return The consumeTime.
   */
  long getConsumeTime();

  /**
   * <pre>
   * The message's text.
   * </pre>
   *
   * <code>string text = 8 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The message's text.
   * </pre>
   *
   * <code>string text = 8 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The message's unique identifier.
   * </pre>
   *
   * <code>string id = 9 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The message's unique identifier.
   * </pre>
   *
   * <code>string id = 9 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The message's title.
   * </pre>
   *
   * <code>string title = 10 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The message's title.
   * </pre>
   *
   * <code>string title = 10 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The message's image url.
   * </pre>
   *
   * <code>string image_url = 11 [json_name = "imageUrl"];</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * The message's image url.
   * </pre>
   *
   * <code>string image_url = 11 [json_name = "imageUrl"];</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();
}