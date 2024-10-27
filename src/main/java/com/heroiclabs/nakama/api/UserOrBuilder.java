// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the user's account.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The id of the user's account.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The username of the user's account.
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The username of the user's account.
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The display name of the user.
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the user.
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>string avatar_url = 4 [json_name = "avatarUrl"];</code>
   * @return The avatarUrl.
   */
  java.lang.String getAvatarUrl();
  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>string avatar_url = 4 [json_name = "avatarUrl"];</code>
   * @return The bytes for avatarUrl.
   */
  com.google.protobuf.ByteString
      getAvatarUrlBytes();

  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>string lang_tag = 5 [json_name = "langTag"];</code>
   * @return The langTag.
   */
  java.lang.String getLangTag();
  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>string lang_tag = 5 [json_name = "langTag"];</code>
   * @return The bytes for langTag.
   */
  com.google.protobuf.ByteString
      getLangTagBytes();

  /**
   * <pre>
   * The location set by the user.
   * </pre>
   *
   * <code>string location = 6 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * The location set by the user.
   * </pre>
   *
   * <code>string location = 6 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * The timezone set by the user.
   * </pre>
   *
   * <code>string timezone = 7 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <pre>
   * The timezone set by the user.
   * </pre>
   *
   * <code>string timezone = 7 [json_name = "timezone"];</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();

  /**
   * <pre>
   * Additional information stored as a JSON object.
   * </pre>
   *
   * <code>string metadata = 8 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  java.lang.String getMetadata();
  /**
   * <pre>
   * Additional information stored as a JSON object.
   * </pre>
   *
   * <code>string metadata = 8 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  com.google.protobuf.ByteString
      getMetadataBytes();

  /**
   * <pre>
   * The Facebook id in the user's account.
   * </pre>
   *
   * <code>string facebook_id = 9 [json_name = "facebookId"];</code>
   * @return The facebookId.
   */
  java.lang.String getFacebookId();
  /**
   * <pre>
   * The Facebook id in the user's account.
   * </pre>
   *
   * <code>string facebook_id = 9 [json_name = "facebookId"];</code>
   * @return The bytes for facebookId.
   */
  com.google.protobuf.ByteString
      getFacebookIdBytes();

  /**
   * <pre>
   * The Google id in the user's account.
   * </pre>
   *
   * <code>string google_id = 10 [json_name = "googleId"];</code>
   * @return The googleId.
   */
  java.lang.String getGoogleId();
  /**
   * <pre>
   * The Google id in the user's account.
   * </pre>
   *
   * <code>string google_id = 10 [json_name = "googleId"];</code>
   * @return The bytes for googleId.
   */
  com.google.protobuf.ByteString
      getGoogleIdBytes();

  /**
   * <pre>
   * The Apple Game Center in of the user's account.
   * </pre>
   *
   * <code>string gamecenter_id = 11 [json_name = "gamecenterId"];</code>
   * @return The gamecenterId.
   */
  java.lang.String getGamecenterId();
  /**
   * <pre>
   * The Apple Game Center in of the user's account.
   * </pre>
   *
   * <code>string gamecenter_id = 11 [json_name = "gamecenterId"];</code>
   * @return The bytes for gamecenterId.
   */
  com.google.protobuf.ByteString
      getGamecenterIdBytes();

  /**
   * <pre>
   * The Steam id in the user's account.
   * </pre>
   *
   * <code>string steam_id = 12 [json_name = "steamId"];</code>
   * @return The steamId.
   */
  java.lang.String getSteamId();
  /**
   * <pre>
   * The Steam id in the user's account.
   * </pre>
   *
   * <code>string steam_id = 12 [json_name = "steamId"];</code>
   * @return The bytes for steamId.
   */
  com.google.protobuf.ByteString
      getSteamIdBytes();

  /**
   * <pre>
   * Indicates whether the user is currently online.
   * </pre>
   *
   * <code>bool online = 13 [json_name = "online"];</code>
   * @return The online.
   */
  boolean getOnline();

  /**
   * <pre>
   * Number of related edges to this user.
   * </pre>
   *
   * <code>int32 edge_count = 14 [json_name = "edgeCount"];</code>
   * @return The edgeCount.
   */
  int getEdgeCount();

  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The UNIX time (for gRPC clients) or ISO string (for REST clients) when the user was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The Facebook Instant Game ID in the user's account.
   * </pre>
   *
   * <code>string facebook_instant_game_id = 17 [json_name = "facebookInstantGameId"];</code>
   * @return The facebookInstantGameId.
   */
  java.lang.String getFacebookInstantGameId();
  /**
   * <pre>
   * The Facebook Instant Game ID in the user's account.
   * </pre>
   *
   * <code>string facebook_instant_game_id = 17 [json_name = "facebookInstantGameId"];</code>
   * @return The bytes for facebookInstantGameId.
   */
  com.google.protobuf.ByteString
      getFacebookInstantGameIdBytes();

  /**
   * <pre>
   * The Apple Sign In ID in the user's account.
   * </pre>
   *
   * <code>string apple_id = 18 [json_name = "appleId"];</code>
   * @return The appleId.
   */
  java.lang.String getAppleId();
  /**
   * <pre>
   * The Apple Sign In ID in the user's account.
   * </pre>
   *
   * <code>string apple_id = 18 [json_name = "appleId"];</code>
   * @return The bytes for appleId.
   */
  com.google.protobuf.ByteString
      getAppleIdBytes();
}