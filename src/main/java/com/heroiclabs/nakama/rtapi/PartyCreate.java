// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Create a party.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.PartyCreate}
 */
public final class PartyCreate extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.PartyCreate)
    PartyCreateOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      PartyCreate.class.getName());
  }
  // Use PartyCreate.newBuilder() to construct.
  private PartyCreate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PartyCreate() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyCreate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyCreate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.PartyCreate.class, com.heroiclabs.nakama.rtapi.PartyCreate.Builder.class);
  }

  public static final int OPEN_FIELD_NUMBER = 1;
  private boolean open_ = false;
  /**
   * <pre>
   * Whether or not the party will require join requests to be approved by the party leader.
   * </pre>
   *
   * <code>bool open = 1 [json_name = "open"];</code>
   * @return The open.
   */
  @java.lang.Override
  public boolean getOpen() {
    return open_;
  }

  public static final int MAX_SIZE_FIELD_NUMBER = 2;
  private int maxSize_ = 0;
  /**
   * <pre>
   * Maximum number of party members.
   * </pre>
   *
   * <code>int32 max_size = 2 [json_name = "maxSize"];</code>
   * @return The maxSize.
   */
  @java.lang.Override
  public int getMaxSize() {
    return maxSize_;
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
    if (open_ != false) {
      output.writeBool(1, open_);
    }
    if (maxSize_ != 0) {
      output.writeInt32(2, maxSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (open_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, open_);
    }
    if (maxSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxSize_);
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.PartyCreate)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.PartyCreate other = (com.heroiclabs.nakama.rtapi.PartyCreate) obj;

    if (getOpen()
        != other.getOpen()) return false;
    if (getMaxSize()
        != other.getMaxSize()) return false;
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
    hash = (37 * hash) + OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOpen());
    hash = (37 * hash) + MAX_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.PartyCreate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.PartyCreate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyCreate parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.PartyCreate prototype) {
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
   * Create a party.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.PartyCreate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.PartyCreate)
      com.heroiclabs.nakama.rtapi.PartyCreateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyCreate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyCreate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.PartyCreate.class, com.heroiclabs.nakama.rtapi.PartyCreate.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.PartyCreate.newBuilder()
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
      open_ = false;
      maxSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyCreate_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyCreate getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.PartyCreate.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyCreate build() {
      com.heroiclabs.nakama.rtapi.PartyCreate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyCreate buildPartial() {
      com.heroiclabs.nakama.rtapi.PartyCreate result = new com.heroiclabs.nakama.rtapi.PartyCreate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.PartyCreate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.open_ = open_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxSize_ = maxSize_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.PartyCreate) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.PartyCreate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.PartyCreate other) {
      if (other == com.heroiclabs.nakama.rtapi.PartyCreate.getDefaultInstance()) return this;
      if (other.getOpen() != false) {
        setOpen(other.getOpen());
      }
      if (other.getMaxSize() != 0) {
        setMaxSize(other.getMaxSize());
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
            case 8: {
              open_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxSize_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private boolean open_ ;
    /**
     * <pre>
     * Whether or not the party will require join requests to be approved by the party leader.
     * </pre>
     *
     * <code>bool open = 1 [json_name = "open"];</code>
     * @return The open.
     */
    @java.lang.Override
    public boolean getOpen() {
      return open_;
    }
    /**
     * <pre>
     * Whether or not the party will require join requests to be approved by the party leader.
     * </pre>
     *
     * <code>bool open = 1 [json_name = "open"];</code>
     * @param value The open to set.
     * @return This builder for chaining.
     */
    public Builder setOpen(boolean value) {

      open_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the party will require join requests to be approved by the party leader.
     * </pre>
     *
     * <code>bool open = 1 [json_name = "open"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOpen() {
      bitField0_ = (bitField0_ & ~0x00000001);
      open_ = false;
      onChanged();
      return this;
    }

    private int maxSize_ ;
    /**
     * <pre>
     * Maximum number of party members.
     * </pre>
     *
     * <code>int32 max_size = 2 [json_name = "maxSize"];</code>
     * @return The maxSize.
     */
    @java.lang.Override
    public int getMaxSize() {
      return maxSize_;
    }
    /**
     * <pre>
     * Maximum number of party members.
     * </pre>
     *
     * <code>int32 max_size = 2 [json_name = "maxSize"];</code>
     * @param value The maxSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSize(int value) {

      maxSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of party members.
     * </pre>
     *
     * <code>int32 max_size = 2 [json_name = "maxSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxSize_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.PartyCreate)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.PartyCreate)
  private static final com.heroiclabs.nakama.rtapi.PartyCreate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.PartyCreate();
  }

  public static com.heroiclabs.nakama.rtapi.PartyCreate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartyCreate>
      PARSER = new com.google.protobuf.AbstractParser<PartyCreate>() {
    @java.lang.Override
    public PartyCreate parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartyCreate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartyCreate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.PartyCreate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

