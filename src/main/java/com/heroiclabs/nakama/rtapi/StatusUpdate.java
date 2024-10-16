// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Set the user's own status.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.StatusUpdate}
 */
public final class StatusUpdate extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.StatusUpdate)
    StatusUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      StatusUpdate.class.getName());
  }
  // Use StatusUpdate.newBuilder() to construct.
  private StatusUpdate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StatusUpdate() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_StatusUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_StatusUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.StatusUpdate.class, com.heroiclabs.nakama.rtapi.StatusUpdate.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue status_;
  /**
   * <pre>
   * Status string to set, if not present the user will appear offline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Status string to set, if not present the user will appear offline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getStatus() {
    return status_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Status string to set, if not present the user will appear offline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : status_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.StatusUpdate)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.StatusUpdate other = (com.heroiclabs.nakama.rtapi.StatusUpdate) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUpdate parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.StatusUpdate prototype) {
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
   * Set the user's own status.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.StatusUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.StatusUpdate)
      com.heroiclabs.nakama.rtapi.StatusUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_StatusUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_StatusUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.StatusUpdate.class, com.heroiclabs.nakama.rtapi.StatusUpdate.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.StatusUpdate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_StatusUpdate_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.StatusUpdate getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.StatusUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.StatusUpdate build() {
      com.heroiclabs.nakama.rtapi.StatusUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.StatusUpdate buildPartial() {
      com.heroiclabs.nakama.rtapi.StatusUpdate result = new com.heroiclabs.nakama.rtapi.StatusUpdate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.StatusUpdate result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.StatusUpdate) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.StatusUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.StatusUpdate other) {
      if (other == com.heroiclabs.nakama.rtapi.StatusUpdate.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.protobuf.StringValue status_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     * @return The status.
     */
    public com.google.protobuf.StringValue getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public Builder setStatus(com.google.protobuf.StringValue value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public Builder setStatus(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public Builder mergeStatus(com.google.protobuf.StringValue value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          status_ != null &&
          status_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      if (status_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public com.google.protobuf.StringValue.Builder getStatusBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Status string to set, if not present the user will appear offline.
     * </pre>
     *
     * <code>.google.protobuf.StringValue status = 1 [json_name = "status"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.StatusUpdate)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.StatusUpdate)
  private static final com.heroiclabs.nakama.rtapi.StatusUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.StatusUpdate();
  }

  public static com.heroiclabs.nakama.rtapi.StatusUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusUpdate>
      PARSER = new com.google.protobuf.AbstractParser<StatusUpdate>() {
    @java.lang.Override
    public StatusUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatusUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.StatusUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

