// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Promote a new party leader.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.PartyPromote}
 */
public final class PartyPromote extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.PartyPromote)
    PartyPromoteOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      PartyPromote.class.getName());
  }
  // Use PartyPromote.newBuilder() to construct.
  private PartyPromote(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PartyPromote() {
    partyId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyPromote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyPromote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.PartyPromote.class, com.heroiclabs.nakama.rtapi.PartyPromote.Builder.class);
  }

  private int bitField0_;
  public static final int PARTY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object partyId_ = "";
  /**
   * <pre>
   * Party ID to promote a new leader for.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The partyId.
   */
  @java.lang.Override
  public java.lang.String getPartyId() {
    java.lang.Object ref = partyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Party ID to promote a new leader for.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The bytes for partyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartyIdBytes() {
    java.lang.Object ref = partyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRESENCE_FIELD_NUMBER = 2;
  private com.heroiclabs.nakama.rtapi.UserPresence presence_;
  /**
   * <pre>
   * The presence of an existing party member to promote as the new leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
   * @return Whether the presence field is set.
   */
  @java.lang.Override
  public boolean hasPresence() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The presence of an existing party member to promote as the new leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
   * @return The presence.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.UserPresence getPresence() {
    return presence_ == null ? com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance() : presence_;
  }
  /**
   * <pre>
   * The presence of an existing party member to promote as the new leader.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresenceOrBuilder() {
    return presence_ == null ? com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance() : presence_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(partyId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, partyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPresence());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(partyId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, partyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPresence());
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.PartyPromote)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.PartyPromote other = (com.heroiclabs.nakama.rtapi.PartyPromote) obj;

    if (!getPartyId()
        .equals(other.getPartyId())) return false;
    if (hasPresence() != other.hasPresence()) return false;
    if (hasPresence()) {
      if (!getPresence()
          .equals(other.getPresence())) return false;
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
    hash = (37 * hash) + PARTY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPartyId().hashCode();
    if (hasPresence()) {
      hash = (37 * hash) + PRESENCE_FIELD_NUMBER;
      hash = (53 * hash) + getPresence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.PartyPromote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.PartyPromote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyPromote parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.PartyPromote prototype) {
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
   * Promote a new party leader.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.PartyPromote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.PartyPromote)
      com.heroiclabs.nakama.rtapi.PartyPromoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyPromote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyPromote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.PartyPromote.class, com.heroiclabs.nakama.rtapi.PartyPromote.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.PartyPromote.newBuilder()
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
        getPresenceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      partyId_ = "";
      presence_ = null;
      if (presenceBuilder_ != null) {
        presenceBuilder_.dispose();
        presenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyPromote_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyPromote getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.PartyPromote.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyPromote build() {
      com.heroiclabs.nakama.rtapi.PartyPromote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyPromote buildPartial() {
      com.heroiclabs.nakama.rtapi.PartyPromote result = new com.heroiclabs.nakama.rtapi.PartyPromote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.PartyPromote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partyId_ = partyId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.presence_ = presenceBuilder_ == null
            ? presence_
            : presenceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.PartyPromote) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.PartyPromote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.PartyPromote other) {
      if (other == com.heroiclabs.nakama.rtapi.PartyPromote.getDefaultInstance()) return this;
      if (!other.getPartyId().isEmpty()) {
        partyId_ = other.partyId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPresence()) {
        mergePresence(other.getPresence());
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
              partyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPresenceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object partyId_ = "";
    /**
     * <pre>
     * Party ID to promote a new leader for.
     * </pre>
     *
     * <code>string party_id = 1 [json_name = "partyId"];</code>
     * @return The partyId.
     */
    public java.lang.String getPartyId() {
      java.lang.Object ref = partyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Party ID to promote a new leader for.
     * </pre>
     *
     * <code>string party_id = 1 [json_name = "partyId"];</code>
     * @return The bytes for partyId.
     */
    public com.google.protobuf.ByteString
        getPartyIdBytes() {
      java.lang.Object ref = partyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Party ID to promote a new leader for.
     * </pre>
     *
     * <code>string party_id = 1 [json_name = "partyId"];</code>
     * @param value The partyId to set.
     * @return This builder for chaining.
     */
    public Builder setPartyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      partyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Party ID to promote a new leader for.
     * </pre>
     *
     * <code>string party_id = 1 [json_name = "partyId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartyId() {
      partyId_ = getDefaultInstance().getPartyId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Party ID to promote a new leader for.
     * </pre>
     *
     * <code>string party_id = 1 [json_name = "partyId"];</code>
     * @param value The bytes for partyId to set.
     * @return This builder for chaining.
     */
    public Builder setPartyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      partyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.heroiclabs.nakama.rtapi.UserPresence presence_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> presenceBuilder_;
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     * @return Whether the presence field is set.
     */
    public boolean hasPresence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     * @return The presence.
     */
    public com.heroiclabs.nakama.rtapi.UserPresence getPresence() {
      if (presenceBuilder_ == null) {
        return presence_ == null ? com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance() : presence_;
      } else {
        return presenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public Builder setPresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
      if (presenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        presence_ = value;
      } else {
        presenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public Builder setPresence(
        com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      if (presenceBuilder_ == null) {
        presence_ = builderForValue.build();
      } else {
        presenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public Builder mergePresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
      if (presenceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          presence_ != null &&
          presence_ != com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance()) {
          getPresenceBuilder().mergeFrom(value);
        } else {
          presence_ = value;
        }
      } else {
        presenceBuilder_.mergeFrom(value);
      }
      if (presence_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public Builder clearPresence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      presence_ = null;
      if (presenceBuilder_ != null) {
        presenceBuilder_.dispose();
        presenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence.Builder getPresenceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPresenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresenceOrBuilder() {
      if (presenceBuilder_ != null) {
        return presenceBuilder_.getMessageOrBuilder();
      } else {
        return presence_ == null ?
            com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance() : presence_;
      }
    }
    /**
     * <pre>
     * The presence of an existing party member to promote as the new leader.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence presence = 2 [json_name = "presence"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
        getPresenceFieldBuilder() {
      if (presenceBuilder_ == null) {
        presenceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder>(
                getPresence(),
                getParentForChildren(),
                isClean());
        presence_ = null;
      }
      return presenceBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.PartyPromote)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.PartyPromote)
  private static final com.heroiclabs.nakama.rtapi.PartyPromote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.PartyPromote();
  }

  public static com.heroiclabs.nakama.rtapi.PartyPromote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartyPromote>
      PARSER = new com.google.protobuf.AbstractParser<PartyPromote>() {
    @java.lang.Override
    public PartyPromote parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartyPromote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartyPromote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.PartyPromote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
