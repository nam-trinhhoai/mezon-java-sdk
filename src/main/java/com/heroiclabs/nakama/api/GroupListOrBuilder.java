// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface GroupListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.GroupList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Group> 
      getGroupsList();
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1 [json_name = "groups"];</code>
   */
  com.heroiclabs.nakama.api.Group getGroups(int index);
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1 [json_name = "groups"];</code>
   */
  int getGroupsCount();
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.GroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1 [json_name = "groups"];</code>
   */
  com.heroiclabs.nakama.api.GroupOrBuilder getGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * A cursor used to get the next page.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A cursor used to get the next page.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
