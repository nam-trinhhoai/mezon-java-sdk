// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface LiveEventListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.LiveEventList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Live events.
   * </pre>
   *
   * <code>repeated .satori.api.LiveEvent live_events = 1 [json_name = "liveEvents"];</code>
   */
  java.util.List<com.heroiclabs.satori.api.LiveEvent> 
      getLiveEventsList();
  /**
   * <pre>
   * Live events.
   * </pre>
   *
   * <code>repeated .satori.api.LiveEvent live_events = 1 [json_name = "liveEvents"];</code>
   */
  com.heroiclabs.satori.api.LiveEvent getLiveEvents(int index);
  /**
   * <pre>
   * Live events.
   * </pre>
   *
   * <code>repeated .satori.api.LiveEvent live_events = 1 [json_name = "liveEvents"];</code>
   */
  int getLiveEventsCount();
  /**
   * <pre>
   * Live events.
   * </pre>
   *
   * <code>repeated .satori.api.LiveEvent live_events = 1 [json_name = "liveEvents"];</code>
   */
  java.util.List<? extends com.heroiclabs.satori.api.LiveEventOrBuilder> 
      getLiveEventsOrBuilderList();
  /**
   * <pre>
   * Live events.
   * </pre>
   *
   * <code>repeated .satori.api.LiveEvent live_events = 1 [json_name = "liveEvents"];</code>
   */
  com.heroiclabs.satori.api.LiveEventOrBuilder getLiveEventsOrBuilder(
      int index);
}