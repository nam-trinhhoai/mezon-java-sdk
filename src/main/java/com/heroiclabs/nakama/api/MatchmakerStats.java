// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Matchmaker stats
 * </pre>
 *
 * Protobuf type {@code nakama.api.MatchmakerStats}
 */
public final class MatchmakerStats extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.MatchmakerStats)
    MatchmakerStatsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      MatchmakerStats.class.getName());
  }
  // Use MatchmakerStats.newBuilder() to construct.
  private MatchmakerStats(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MatchmakerStats() {
    completions_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_MatchmakerStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_MatchmakerStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.MatchmakerStats.class, com.heroiclabs.nakama.api.MatchmakerStats.Builder.class);
  }

  private int bitField0_;
  public static final int TICKET_COUNT_FIELD_NUMBER = 1;
  private int ticketCount_ = 0;
  /**
   * <code>int32 ticket_count = 1 [json_name = "ticketCount"];</code>
   * @return The ticketCount.
   */
  @java.lang.Override
  public int getTicketCount() {
    return ticketCount_;
  }

  public static final int OLDEST_TICKET_CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp oldestTicketCreateTime_;
  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   * @return Whether the oldestTicketCreateTime field is set.
   */
  @java.lang.Override
  public boolean hasOldestTicketCreateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   * @return The oldestTicketCreateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getOldestTicketCreateTime() {
    return oldestTicketCreateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : oldestTicketCreateTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getOldestTicketCreateTimeOrBuilder() {
    return oldestTicketCreateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : oldestTicketCreateTime_;
  }

  public static final int COMPLETIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats> completions_;
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats> getCompletionsList() {
    return completions_;
  }
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder> 
      getCompletionsOrBuilderList() {
    return completions_;
  }
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  @java.lang.Override
  public int getCompletionsCount() {
    return completions_.size();
  }
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.MatchmakerCompletionStats getCompletions(int index) {
    return completions_.get(index);
  }
  /**
   * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder getCompletionsOrBuilder(
      int index) {
    return completions_.get(index);
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
    if (ticketCount_ != 0) {
      output.writeInt32(1, ticketCount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOldestTicketCreateTime());
    }
    for (int i = 0; i < completions_.size(); i++) {
      output.writeMessage(3, completions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ticketCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ticketCount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOldestTicketCreateTime());
    }
    for (int i = 0; i < completions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, completions_.get(i));
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
    if (!(obj instanceof com.heroiclabs.nakama.api.MatchmakerStats)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.MatchmakerStats other = (com.heroiclabs.nakama.api.MatchmakerStats) obj;

    if (getTicketCount()
        != other.getTicketCount()) return false;
    if (hasOldestTicketCreateTime() != other.hasOldestTicketCreateTime()) return false;
    if (hasOldestTicketCreateTime()) {
      if (!getOldestTicketCreateTime()
          .equals(other.getOldestTicketCreateTime())) return false;
    }
    if (!getCompletionsList()
        .equals(other.getCompletionsList())) return false;
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
    hash = (37 * hash) + TICKET_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTicketCount();
    if (hasOldestTicketCreateTime()) {
      hash = (37 * hash) + OLDEST_TICKET_CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOldestTicketCreateTime().hashCode();
    }
    if (getCompletionsCount() > 0) {
      hash = (37 * hash) + COMPLETIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCompletionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.MatchmakerStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.MatchmakerStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.MatchmakerStats parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.MatchmakerStats prototype) {
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
   * Matchmaker stats
   * </pre>
   *
   * Protobuf type {@code nakama.api.MatchmakerStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.MatchmakerStats)
      com.heroiclabs.nakama.api.MatchmakerStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_MatchmakerStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_MatchmakerStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.MatchmakerStats.class, com.heroiclabs.nakama.api.MatchmakerStats.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.MatchmakerStats.newBuilder()
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
        getOldestTicketCreateTimeFieldBuilder();
        getCompletionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ticketCount_ = 0;
      oldestTicketCreateTime_ = null;
      if (oldestTicketCreateTimeBuilder_ != null) {
        oldestTicketCreateTimeBuilder_.dispose();
        oldestTicketCreateTimeBuilder_ = null;
      }
      if (completionsBuilder_ == null) {
        completions_ = java.util.Collections.emptyList();
      } else {
        completions_ = null;
        completionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_MatchmakerStats_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.MatchmakerStats getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.MatchmakerStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.MatchmakerStats build() {
      com.heroiclabs.nakama.api.MatchmakerStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.MatchmakerStats buildPartial() {
      com.heroiclabs.nakama.api.MatchmakerStats result = new com.heroiclabs.nakama.api.MatchmakerStats(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.heroiclabs.nakama.api.MatchmakerStats result) {
      if (completionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          completions_ = java.util.Collections.unmodifiableList(completions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.completions_ = completions_;
      } else {
        result.completions_ = completionsBuilder_.build();
      }
    }

    private void buildPartial0(com.heroiclabs.nakama.api.MatchmakerStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketCount_ = ticketCount_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oldestTicketCreateTime_ = oldestTicketCreateTimeBuilder_ == null
            ? oldestTicketCreateTime_
            : oldestTicketCreateTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.MatchmakerStats) {
        return mergeFrom((com.heroiclabs.nakama.api.MatchmakerStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.MatchmakerStats other) {
      if (other == com.heroiclabs.nakama.api.MatchmakerStats.getDefaultInstance()) return this;
      if (other.getTicketCount() != 0) {
        setTicketCount(other.getTicketCount());
      }
      if (other.hasOldestTicketCreateTime()) {
        mergeOldestTicketCreateTime(other.getOldestTicketCreateTime());
      }
      if (completionsBuilder_ == null) {
        if (!other.completions_.isEmpty()) {
          if (completions_.isEmpty()) {
            completions_ = other.completions_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureCompletionsIsMutable();
            completions_.addAll(other.completions_);
          }
          onChanged();
        }
      } else {
        if (!other.completions_.isEmpty()) {
          if (completionsBuilder_.isEmpty()) {
            completionsBuilder_.dispose();
            completionsBuilder_ = null;
            completions_ = other.completions_;
            bitField0_ = (bitField0_ & ~0x00000004);
            completionsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCompletionsFieldBuilder() : null;
          } else {
            completionsBuilder_.addAllMessages(other.completions_);
          }
        }
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
              ticketCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getOldestTicketCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.heroiclabs.nakama.api.MatchmakerCompletionStats m =
                  input.readMessage(
                      com.heroiclabs.nakama.api.MatchmakerCompletionStats.parser(),
                      extensionRegistry);
              if (completionsBuilder_ == null) {
                ensureCompletionsIsMutable();
                completions_.add(m);
              } else {
                completionsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private int ticketCount_ ;
    /**
     * <code>int32 ticket_count = 1 [json_name = "ticketCount"];</code>
     * @return The ticketCount.
     */
    @java.lang.Override
    public int getTicketCount() {
      return ticketCount_;
    }
    /**
     * <code>int32 ticket_count = 1 [json_name = "ticketCount"];</code>
     * @param value The ticketCount to set.
     * @return This builder for chaining.
     */
    public Builder setTicketCount(int value) {

      ticketCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ticket_count = 1 [json_name = "ticketCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp oldestTicketCreateTime_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> oldestTicketCreateTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     * @return Whether the oldestTicketCreateTime field is set.
     */
    public boolean hasOldestTicketCreateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     * @return The oldestTicketCreateTime.
     */
    public com.google.protobuf.Timestamp getOldestTicketCreateTime() {
      if (oldestTicketCreateTimeBuilder_ == null) {
        return oldestTicketCreateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : oldestTicketCreateTime_;
      } else {
        return oldestTicketCreateTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public Builder setOldestTicketCreateTime(com.google.protobuf.Timestamp value) {
      if (oldestTicketCreateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oldestTicketCreateTime_ = value;
      } else {
        oldestTicketCreateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public Builder setOldestTicketCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (oldestTicketCreateTimeBuilder_ == null) {
        oldestTicketCreateTime_ = builderForValue.build();
      } else {
        oldestTicketCreateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public Builder mergeOldestTicketCreateTime(com.google.protobuf.Timestamp value) {
      if (oldestTicketCreateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          oldestTicketCreateTime_ != null &&
          oldestTicketCreateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getOldestTicketCreateTimeBuilder().mergeFrom(value);
        } else {
          oldestTicketCreateTime_ = value;
        }
      } else {
        oldestTicketCreateTimeBuilder_.mergeFrom(value);
      }
      if (oldestTicketCreateTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public Builder clearOldestTicketCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      oldestTicketCreateTime_ = null;
      if (oldestTicketCreateTimeBuilder_ != null) {
        oldestTicketCreateTimeBuilder_.dispose();
        oldestTicketCreateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getOldestTicketCreateTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOldestTicketCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getOldestTicketCreateTimeOrBuilder() {
      if (oldestTicketCreateTimeBuilder_ != null) {
        return oldestTicketCreateTimeBuilder_.getMessageOrBuilder();
      } else {
        return oldestTicketCreateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : oldestTicketCreateTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp oldest_ticket_create_time = 2 [json_name = "oldestTicketCreateTime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getOldestTicketCreateTimeFieldBuilder() {
      if (oldestTicketCreateTimeBuilder_ == null) {
        oldestTicketCreateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getOldestTicketCreateTime(),
                getParentForChildren(),
                isClean());
        oldestTicketCreateTime_ = null;
      }
      return oldestTicketCreateTimeBuilder_;
    }

    private java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats> completions_ =
      java.util.Collections.emptyList();
    private void ensureCompletionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        completions_ = new java.util.ArrayList<com.heroiclabs.nakama.api.MatchmakerCompletionStats>(completions_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.MatchmakerCompletionStats, com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder, com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder> completionsBuilder_;

    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats> getCompletionsList() {
      if (completionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(completions_);
      } else {
        return completionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public int getCompletionsCount() {
      if (completionsBuilder_ == null) {
        return completions_.size();
      } else {
        return completionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public com.heroiclabs.nakama.api.MatchmakerCompletionStats getCompletions(int index) {
      if (completionsBuilder_ == null) {
        return completions_.get(index);
      } else {
        return completionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder setCompletions(
        int index, com.heroiclabs.nakama.api.MatchmakerCompletionStats value) {
      if (completionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompletionsIsMutable();
        completions_.set(index, value);
        onChanged();
      } else {
        completionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder setCompletions(
        int index, com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder builderForValue) {
      if (completionsBuilder_ == null) {
        ensureCompletionsIsMutable();
        completions_.set(index, builderForValue.build());
        onChanged();
      } else {
        completionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder addCompletions(com.heroiclabs.nakama.api.MatchmakerCompletionStats value) {
      if (completionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompletionsIsMutable();
        completions_.add(value);
        onChanged();
      } else {
        completionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder addCompletions(
        int index, com.heroiclabs.nakama.api.MatchmakerCompletionStats value) {
      if (completionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompletionsIsMutable();
        completions_.add(index, value);
        onChanged();
      } else {
        completionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder addCompletions(
        com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder builderForValue) {
      if (completionsBuilder_ == null) {
        ensureCompletionsIsMutable();
        completions_.add(builderForValue.build());
        onChanged();
      } else {
        completionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder addCompletions(
        int index, com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder builderForValue) {
      if (completionsBuilder_ == null) {
        ensureCompletionsIsMutable();
        completions_.add(index, builderForValue.build());
        onChanged();
      } else {
        completionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder addAllCompletions(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.MatchmakerCompletionStats> values) {
      if (completionsBuilder_ == null) {
        ensureCompletionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, completions_);
        onChanged();
      } else {
        completionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder clearCompletions() {
      if (completionsBuilder_ == null) {
        completions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        completionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public Builder removeCompletions(int index) {
      if (completionsBuilder_ == null) {
        ensureCompletionsIsMutable();
        completions_.remove(index);
        onChanged();
      } else {
        completionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder getCompletionsBuilder(
        int index) {
      return getCompletionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder getCompletionsOrBuilder(
        int index) {
      if (completionsBuilder_ == null) {
        return completions_.get(index);  } else {
        return completionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public java.util.List<? extends com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder> 
         getCompletionsOrBuilderList() {
      if (completionsBuilder_ != null) {
        return completionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(completions_);
      }
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder addCompletionsBuilder() {
      return getCompletionsFieldBuilder().addBuilder(
          com.heroiclabs.nakama.api.MatchmakerCompletionStats.getDefaultInstance());
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder addCompletionsBuilder(
        int index) {
      return getCompletionsFieldBuilder().addBuilder(
          index, com.heroiclabs.nakama.api.MatchmakerCompletionStats.getDefaultInstance());
    }
    /**
     * <code>repeated .nakama.api.MatchmakerCompletionStats completions = 3 [json_name = "completions"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder> 
         getCompletionsBuilderList() {
      return getCompletionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.MatchmakerCompletionStats, com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder, com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder> 
        getCompletionsFieldBuilder() {
      if (completionsBuilder_ == null) {
        completionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.heroiclabs.nakama.api.MatchmakerCompletionStats, com.heroiclabs.nakama.api.MatchmakerCompletionStats.Builder, com.heroiclabs.nakama.api.MatchmakerCompletionStatsOrBuilder>(
                completions_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        completions_ = null;
      }
      return completionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.MatchmakerStats)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.MatchmakerStats)
  private static final com.heroiclabs.nakama.api.MatchmakerStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.MatchmakerStats();
  }

  public static com.heroiclabs.nakama.api.MatchmakerStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchmakerStats>
      PARSER = new com.google.protobuf.AbstractParser<MatchmakerStats>() {
    @java.lang.Override
    public MatchmakerStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<MatchmakerStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchmakerStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.MatchmakerStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

