// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface UpdateGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.UpdateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>string group_id = 1 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>string group_id = 1 [json_name = "groupId"];</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2 [json_name = "name"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [json_name = "description"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue lang_tag = 4 [json_name = "langTag"];</code>
   * @return Whether the langTag field is set.
   */
  boolean hasLangTag();
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue lang_tag = 4 [json_name = "langTag"];</code>
   * @return The langTag.
   */
  com.google.protobuf.StringValue getLangTag();
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>.google.protobuf.StringValue lang_tag = 4 [json_name = "langTag"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLangTagOrBuilder();

  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue avatar_url = 5 [json_name = "avatarUrl"];</code>
   * @return Whether the avatarUrl field is set.
   */
  boolean hasAvatarUrl();
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue avatar_url = 5 [json_name = "avatarUrl"];</code>
   * @return The avatarUrl.
   */
  com.google.protobuf.StringValue getAvatarUrl();
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue avatar_url = 5 [json_name = "avatarUrl"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getAvatarUrlOrBuilder();

  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue open = 6 [json_name = "open"];</code>
   * @return Whether the open field is set.
   */
  boolean hasOpen();
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue open = 6 [json_name = "open"];</code>
   * @return The open.
   */
  com.google.protobuf.BoolValue getOpen();
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue open = 6 [json_name = "open"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getOpenOrBuilder();
}
