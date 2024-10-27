// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface ListFriendsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListFriendsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 1 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 1 [json_name = "limit"];</code>
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 1 [json_name = "limit"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();

  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  com.google.protobuf.Int32Value getState();
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getStateOrBuilder();

  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>string cursor = 3 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>string cursor = 3 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}