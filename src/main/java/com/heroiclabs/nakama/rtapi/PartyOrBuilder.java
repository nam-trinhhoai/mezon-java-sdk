// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface PartyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Party)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique party identifier.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The partyId.
   */
  java.lang.String getPartyId();
  /**
   * <pre>
   * Unique party identifier.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The bytes for partyId.
   */
  com.google.protobuf.ByteString
      getPartyIdBytes();

  /**
   * <pre>
   * Open flag.
   * </pre>
   *
   * <code>bool open = 2 [json_name = "open"];</code>
   * @return The open.
   */
  boolean getOpen();

  /**
   * <pre>
   * Maximum number of party members.
   * </pre>
   *
   * <code>int32 max_size = 3 [json_name = "maxSize"];</code>
   * @return The maxSize.
   */
  int getMaxSize();

  /**
   * <pre>
   * Self.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 4 [json_name = "self"];</code>
   * @return Whether the self field is set.
   */
  boolean hasSelf();
  /**
   * <pre>
   * Self.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 4 [json_name = "self"];</code>
   * @return The self.
   */
  com.heroiclabs.nakama.rtapi.UserPresence getSelf();
  /**
   * <pre>
   * Self.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 4 [json_name = "self"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getSelfOrBuilder();

  /**
   * <pre>
   * Leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence leader = 5 [json_name = "leader"];</code>
   * @return Whether the leader field is set.
   */
  boolean hasLeader();
  /**
   * <pre>
   * Leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence leader = 5 [json_name = "leader"];</code>
   * @return The leader.
   */
  com.heroiclabs.nakama.rtapi.UserPresence getLeader();
  /**
   * <pre>
   * Leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence leader = 5 [json_name = "leader"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getLeaderOrBuilder();

  /**
   * <pre>
   * All current party members.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 6 [json_name = "presences"];</code>
   */
  java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> 
      getPresencesList();
  /**
   * <pre>
   * All current party members.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 6 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index);
  /**
   * <pre>
   * All current party members.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 6 [json_name = "presences"];</code>
   */
  int getPresencesCount();
  /**
   * <pre>
   * All current party members.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 6 [json_name = "presences"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
      getPresencesOrBuilderList();
  /**
   * <pre>
   * All current party members.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 6 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
      int index);
}
