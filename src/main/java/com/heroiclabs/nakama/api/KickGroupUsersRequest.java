// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Kick a set of users from a group.
 * </pre>
 *
 * Protobuf type {@code nakama.api.KickGroupUsersRequest}
 */
public final class KickGroupUsersRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.KickGroupUsersRequest)
    KickGroupUsersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      KickGroupUsersRequest.class.getName());
  }
  // Use KickGroupUsersRequest.newBuilder() to construct.
  private KickGroupUsersRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private KickGroupUsersRequest() {
    groupId_ = "";
    userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_KickGroupUsersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_KickGroupUsersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.KickGroupUsersRequest.class, com.heroiclabs.nakama.api.KickGroupUsersRequest.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object groupId_ = "";
  /**
   * <pre>
   * The group ID to kick from.
   * </pre>
   *
   * <code>string group_id = 1 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The group ID to kick from.
   * </pre>
   *
   * <code>string group_id = 1 [json_name = "groupId"];</code>
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(groupId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, groupId_);
    }
    for (int i = 0; i < userIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, userIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(groupId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, groupId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(userIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.heroiclabs.nakama.api.KickGroupUsersRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.KickGroupUsersRequest other = (com.heroiclabs.nakama.api.KickGroupUsersRequest) obj;

    if (!getGroupId()
        .equals(other.getGroupId())) return false;
    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    if (getUserIdsCount() > 0) {
      hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.KickGroupUsersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.KickGroupUsersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Kick a set of users from a group.
   * </pre>
   *
   * Protobuf type {@code nakama.api.KickGroupUsersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.KickGroupUsersRequest)
      com.heroiclabs.nakama.api.KickGroupUsersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_KickGroupUsersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_KickGroupUsersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.KickGroupUsersRequest.class, com.heroiclabs.nakama.api.KickGroupUsersRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.KickGroupUsersRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      groupId_ = "";
      userIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_KickGroupUsersRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.KickGroupUsersRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.KickGroupUsersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.KickGroupUsersRequest build() {
      com.heroiclabs.nakama.api.KickGroupUsersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.KickGroupUsersRequest buildPartial() {
      com.heroiclabs.nakama.api.KickGroupUsersRequest result = new com.heroiclabs.nakama.api.KickGroupUsersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.KickGroupUsersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupId_ = groupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        userIds_.makeImmutable();
        result.userIds_ = userIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.KickGroupUsersRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.KickGroupUsersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.KickGroupUsersRequest other) {
      if (other == com.heroiclabs.nakama.api.KickGroupUsersRequest.getDefaultInstance()) return this;
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.userIds_.isEmpty()) {
        if (userIds_.isEmpty()) {
          userIds_ = other.userIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureUserIdsIsMutable();
          userIds_.addAll(other.userIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              groupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object groupId_ = "";
    /**
     * <pre>
     * The group ID to kick from.
     * </pre>
     *
     * <code>string group_id = 1 [json_name = "groupId"];</code>
     * @return The groupId.
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The group ID to kick from.
     * </pre>
     *
     * <code>string group_id = 1 [json_name = "groupId"];</code>
     * @return The bytes for groupId.
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The group ID to kick from.
     * </pre>
     *
     * <code>string group_id = 1 [json_name = "groupId"];</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      groupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The group ID to kick from.
     * </pre>
     *
     * <code>string group_id = 1 [json_name = "groupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      groupId_ = getDefaultInstance().getGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The group ID to kick from.
     * </pre>
     *
     * <code>string group_id = 1 [json_name = "groupId"];</code>
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      groupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserIdsIsMutable() {
      if (!userIds_.isModifiable()) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      userIds_.makeImmutable();
      return userIds_;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index to set the value at.
     * @param value The userIds to set.
     * @return This builder for chaining.
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param value The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param values The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserIds() {
      userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The users to kick.
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param value The bytes of the userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.KickGroupUsersRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.KickGroupUsersRequest)
  private static final com.heroiclabs.nakama.api.KickGroupUsersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.KickGroupUsersRequest();
  }

  public static com.heroiclabs.nakama.api.KickGroupUsersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KickGroupUsersRequest>
      PARSER = new com.google.protobuf.AbstractParser<KickGroupUsersRequest>() {
    @java.lang.Override
    public KickGroupUsersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<KickGroupUsersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KickGroupUsersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.KickGroupUsersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

