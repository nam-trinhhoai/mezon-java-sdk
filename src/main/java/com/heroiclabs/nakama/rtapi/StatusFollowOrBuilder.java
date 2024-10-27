// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface StatusFollowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.StatusFollow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return A list containing the usernames.
   */
  java.util.List<java.lang.String>
      getUsernamesList();
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return The count of usernames.
   */
  int getUsernamesCount();
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the element to return.
   * @return The usernames at the given index.
   */
  java.lang.String getUsernames(int index);
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the usernames at the given index.
   */
  com.google.protobuf.ByteString
      getUsernamesBytes(int index);
}