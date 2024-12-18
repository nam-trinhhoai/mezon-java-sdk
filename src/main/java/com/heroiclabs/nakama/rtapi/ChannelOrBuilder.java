// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the channel.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the channel.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2 [json_name = "presences"];</code>
   */
  java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> 
      getPresencesList();
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index);
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2 [json_name = "presences"];</code>
   */
  int getPresencesCount();
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2 [json_name = "presences"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
      getPresencesOrBuilderList();
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
      int index);

  /**
   * <pre>
   * A reference to the current user's presence in the channel.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 3 [json_name = "self"];</code>
   * @return Whether the self field is set.
   */
  boolean hasSelf();
  /**
   * <pre>
   * A reference to the current user's presence in the channel.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 3 [json_name = "self"];</code>
   * @return The self.
   */
  com.heroiclabs.nakama.rtapi.UserPresence getSelf();
  /**
   * <pre>
   * A reference to the current user's presence in the channel.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 3 [json_name = "self"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getSelfOrBuilder();

  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>string room_name = 4 [json_name = "roomName"];</code>
   * @return The roomName.
   */
  java.lang.String getRoomName();
  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>string room_name = 4 [json_name = "roomName"];</code>
   * @return The bytes for roomName.
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>string group_id = 5 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>string group_id = 5 [json_name = "groupId"];</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>string user_id_one = 6 [json_name = "userIdOne"];</code>
   * @return The userIdOne.
   */
  java.lang.String getUserIdOne();
  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>string user_id_one = 6 [json_name = "userIdOne"];</code>
   * @return The bytes for userIdOne.
   */
  com.google.protobuf.ByteString
      getUserIdOneBytes();

  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>string user_id_two = 7 [json_name = "userIdTwo"];</code>
   * @return The userIdTwo.
   */
  java.lang.String getUserIdTwo();
  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>string user_id_two = 7 [json_name = "userIdTwo"];</code>
   * @return The bytes for userIdTwo.
   */
  com.google.protobuf.ByteString
      getUserIdTwoBytes();
}
