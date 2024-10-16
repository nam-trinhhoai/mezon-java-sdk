// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface NotificationListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.NotificationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Notification> 
      getNotificationsList();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  com.heroiclabs.nakama.api.Notification getNotifications(int index);
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  int getNotificationsCount();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.NotificationOrBuilder> 
      getNotificationsOrBuilderList();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  com.heroiclabs.nakama.api.NotificationOrBuilder getNotificationsOrBuilder(
      int index);

  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
   * @return The cacheableCursor.
   */
  java.lang.String getCacheableCursor();
  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
   * @return The bytes for cacheableCursor.
   */
  com.google.protobuf.ByteString
      getCacheableCursorBytes();
}
