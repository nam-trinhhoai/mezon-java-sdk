// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface ListLeaderboardRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListLeaderboardRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>string leaderboard_id = 1 [json_name = "leaderboardId"];</code>
   * @return The leaderboardId.
   */
  java.lang.String getLeaderboardId();
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>string leaderboard_id = 1 [json_name = "leaderboardId"];</code>
   * @return The bytes for leaderboardId.
   */
  com.google.protobuf.ByteString
      getLeaderboardIdBytes();

  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2 [json_name = "ownerIds"];</code>
   * @return A list containing the ownerIds.
   */
  java.util.List<java.lang.String>
      getOwnerIdsList();
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2 [json_name = "ownerIds"];</code>
   * @return The count of ownerIds.
   */
  int getOwnerIdsCount();
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2 [json_name = "ownerIds"];</code>
   * @param index The index of the element to return.
   * @return The ownerIds at the given index.
   */
  java.lang.String getOwnerIds(int index);
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2 [json_name = "ownerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ownerIds at the given index.
   */
  com.google.protobuf.ByteString
      getOwnerIdsBytes(int index);

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();

  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from. Optional. 0 means from current time.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value expiry = 5 [json_name = "expiry"];</code>
   * @return Whether the expiry field is set.
   */
  boolean hasExpiry();
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from. Optional. 0 means from current time.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value expiry = 5 [json_name = "expiry"];</code>
   * @return The expiry.
   */
  com.google.protobuf.Int64Value getExpiry();
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from. Optional. 0 means from current time.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value expiry = 5 [json_name = "expiry"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getExpiryOrBuilder();
}
