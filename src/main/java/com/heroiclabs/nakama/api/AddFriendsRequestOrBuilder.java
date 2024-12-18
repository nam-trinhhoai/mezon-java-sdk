// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface AddFriendsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AddFriendsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);

  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return A list containing the usernames.
   */
  java.util.List<java.lang.String>
      getUsernamesList();
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return The count of usernames.
   */
  int getUsernamesCount();
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the element to return.
   * @return The usernames at the given index.
   */
  java.lang.String getUsernames(int index);
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the usernames at the given index.
   */
  com.google.protobuf.ByteString
      getUsernamesBytes(int index);
}
