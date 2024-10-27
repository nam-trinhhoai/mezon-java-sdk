// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface MatchmakerStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.MatchmakerStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 ticket_count = 1 [json_name = "ticketCount"];</code>
   * @return The ticketCount.
   */
  int getTicketCount();

  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   * @return Whether the oldestTicketCreateTime field is set.
   */
  boolean hasOldestTicketCreateTime();
  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   * @return The oldestTicketCreateTime.
   */
  com.google.protobuf.Timestamp getOldestTicketCreateTime();
  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getOldestTicketCreateTimeOrBuilder();

  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats> 
      getCompletionsList();
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  com.heroiclabs.nakama.api.MatchmakerCompletionStats getCompletions(int index);
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  int getCompletionsCount();
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder> 
      getCompletionsOrBuilderList();
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder getCompletionsOrBuilder(
      int index);
}