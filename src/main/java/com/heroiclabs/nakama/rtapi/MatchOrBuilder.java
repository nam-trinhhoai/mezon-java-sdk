// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface MatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Match)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The matchId.
   */
  java.lang.String getMatchId();
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The bytes for matchId.
   */
  com.google.protobuf.ByteString
      getMatchIdBytes();

  /**
   * <pre>
   * True if it's an server-managed authoritative match, false otherwise.
   * </pre>
   *
   * <code>bool authoritative = 2 [json_name = "authoritative"];</code>
   * @return The authoritative.
   */
  boolean getAuthoritative();

  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [json_name = "label"];</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [json_name = "label"];</code>
   * @return The label.
   */
  com.google.protobuf.StringValue getLabel();
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [json_name = "label"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLabelOrBuilder();

  /**
   * <pre>
   * The number of users currently in the match.
   * </pre>
   *
   * <code>int32 size = 4 [json_name = "size"];</code>
   * @return The size.
   */
  int getSize();

  /**
   * <pre>
   * The users currently in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 5 [json_name = "presences"];</code>
   */
  java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> 
      getPresencesList();
  /**
   * <pre>
   * The users currently in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 5 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index);
  /**
   * <pre>
   * The users currently in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 5 [json_name = "presences"];</code>
   */
  int getPresencesCount();
  /**
   * <pre>
   * The users currently in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 5 [json_name = "presences"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
      getPresencesOrBuilderList();
  /**
   * <pre>
   * The users currently in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 5 [json_name = "presences"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
      int index);

  /**
   * <pre>
   * A reference to the current user's presence in the match.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 6 [json_name = "self"];</code>
   * @return Whether the self field is set.
   */
  boolean hasSelf();
  /**
   * <pre>
   * A reference to the current user's presence in the match.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 6 [json_name = "self"];</code>
   * @return The self.
   */
  com.heroiclabs.nakama.rtapi.UserPresence getSelf();
  /**
   * <pre>
   * A reference to the current user's presence in the match.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence self = 6 [json_name = "self"];</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getSelfOrBuilder();
}
