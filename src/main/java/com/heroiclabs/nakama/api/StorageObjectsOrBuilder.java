// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface StorageObjectsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.StorageObjects)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.StorageObject objects = 1 [json_name = "objects"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.StorageObject> 
      getObjectsList();
  /**
   * <pre>
   * The batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.StorageObject objects = 1 [json_name = "objects"];</code>
   */
  com.heroiclabs.nakama.api.StorageObject getObjects(int index);
  /**
   * <pre>
   * The batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.StorageObject objects = 1 [json_name = "objects"];</code>
   */
  int getObjectsCount();
  /**
   * <pre>
   * The batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.StorageObject objects = 1 [json_name = "objects"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.StorageObjectOrBuilder> 
      getObjectsOrBuilderList();
  /**
   * <pre>
   * The batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.StorageObject objects = 1 [json_name = "objects"];</code>
   */
  com.heroiclabs.nakama.api.StorageObjectOrBuilder getObjectsOrBuilder(
      int index);
}