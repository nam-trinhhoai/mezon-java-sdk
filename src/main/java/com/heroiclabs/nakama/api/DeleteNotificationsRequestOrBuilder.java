// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface DeleteNotificationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.DeleteNotificationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of notifications.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * The id of notifications.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * The id of notifications.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * The id of notifications.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);
}
