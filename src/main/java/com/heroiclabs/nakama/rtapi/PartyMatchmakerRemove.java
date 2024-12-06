// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Cancel a party matchmaking process using a ticket.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.PartyMatchmakerRemove}
 */
public final class PartyMatchmakerRemove extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.PartyMatchmakerRemove)
    PartyMatchmakerRemoveOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      PartyMatchmakerRemove.class.getName());
  }
  // Use PartyMatchmakerRemove.newBuilder() to construct.
  private PartyMatchmakerRemove(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PartyMatchmakerRemove() {
    partyId_ = "";
    ticket_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyMatchmakerRemove_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyMatchmakerRemove_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.class, com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.Builder.class);
  }

  public static final int PARTY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object partyId_ = "";
  /**
   * <pre>
   * Party ID.
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
   * Party ID.
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

  public static final int TICKET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ticket_ = "";
  /**
   * <pre>
   * The ticket to cancel.
   * </pre>
   *
   * <code>string ticket = 2 [json_name = "ticket"];</code>
   * @return The ticket.
   */
  @java.lang.Override
  public java.lang.String getTicket() {
    java.lang.Object ref = ticket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ticket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ticket to cancel.
   * </pre>
   *
   * <code>string ticket = 2 [json_name = "ticket"];</code>
   * @return The bytes for ticket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTicketBytes() {
    java.lang.Object ref = ticket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ticket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ticket_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, ticket_);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ticket_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, ticket_);
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove other = (com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove) obj;

    if (!getPartyId()
        .equals(other.getPartyId())) return false;
    if (!getTicket()
        .equals(other.getTicket())) return false;
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
    hash = (37 * hash) + TICKET_FIELD_NUMBER;
    hash = (53 * hash) + getTicket().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove prototype) {
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
   * Cancel a party matchmaking process using a ticket.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.PartyMatchmakerRemove}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.PartyMatchmakerRemove)
      com.heroiclabs.nakama.rtapi.PartyMatchmakerRemoveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyMatchmakerRemove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyMatchmakerRemove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.class, com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.newBuilder()
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
      partyId_ = "";
      ticket_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_PartyMatchmakerRemove_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove build() {
      com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove buildPartial() {
      com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove result = new com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partyId_ = partyId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ticket_ = ticket_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove other) {
      if (other == com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove.getDefaultInstance()) return this;
      if (!other.getPartyId().isEmpty()) {
        partyId_ = other.partyId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTicket().isEmpty()) {
        ticket_ = other.ticket_;
        bitField0_ |= 0x00000002;
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
              partyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ticket_ = input.readStringRequireUtf8();
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
     * Party ID.
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
     * Party ID.
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
     * Party ID.
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
     * Party ID.
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
     * Party ID.
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

    private java.lang.Object ticket_ = "";
    /**
     * <pre>
     * The ticket to cancel.
     * </pre>
     *
     * <code>string ticket = 2 [json_name = "ticket"];</code>
     * @return The ticket.
     */
    public java.lang.String getTicket() {
      java.lang.Object ref = ticket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ticket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ticket to cancel.
     * </pre>
     *
     * <code>string ticket = 2 [json_name = "ticket"];</code>
     * @return The bytes for ticket.
     */
    public com.google.protobuf.ByteString
        getTicketBytes() {
      java.lang.Object ref = ticket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ticket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ticket to cancel.
     * </pre>
     *
     * <code>string ticket = 2 [json_name = "ticket"];</code>
     * @param value The ticket to set.
     * @return This builder for chaining.
     */
    public Builder setTicket(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ticket_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ticket to cancel.
     * </pre>
     *
     * <code>string ticket = 2 [json_name = "ticket"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicket() {
      ticket_ = getDefaultInstance().getTicket();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ticket to cancel.
     * </pre>
     *
     * <code>string ticket = 2 [json_name = "ticket"];</code>
     * @param value The bytes for ticket to set.
     * @return This builder for chaining.
     */
    public Builder setTicketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ticket_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.PartyMatchmakerRemove)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.PartyMatchmakerRemove)
  private static final com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove();
  }

  public static com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartyMatchmakerRemove>
      PARSER = new com.google.protobuf.AbstractParser<PartyMatchmakerRemove>() {
    @java.lang.Override
    public PartyMatchmakerRemove parsePartialFrom(
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

  public static com.google.protobuf.Parser<PartyMatchmakerRemove> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartyMatchmakerRemove> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.PartyMatchmakerRemove getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

