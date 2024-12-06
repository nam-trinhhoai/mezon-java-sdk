// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * A snapshot of statuses for some set of users.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.Status}
 */
public final class Status extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.Status)
    StatusOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Status.class.getName());
  }
  // Use Status.newBuilder() to construct.
  private Status(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Status() {
    presences_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Status_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Status_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.Status.class, com.heroiclabs.nakama.rtapi.Status.Builder.class);
  }

  public static final int PRESENCES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> presences_;
  /**
   * <pre>
   * User statuses.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
   */
  @java.lang.Override
  public java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> getPresencesList() {
    return presences_;
  }
  /**
   * <pre>
   * User statuses.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
      getPresencesOrBuilderList() {
    return presences_;
  }
  /**
   * <pre>
   * User statuses.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
   */
  @java.lang.Override
  public int getPresencesCount() {
    return presences_.size();
  }
  /**
   * <pre>
   * User statuses.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index) {
    return presences_.get(index);
  }
  /**
   * <pre>
   * User statuses.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
      int index) {
    return presences_.get(index);
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
    for (int i = 0; i < presences_.size(); i++) {
      output.writeMessage(1, presences_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < presences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, presences_.get(i));
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.Status)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.Status other = (com.heroiclabs.nakama.rtapi.Status) obj;

    if (!getPresencesList()
        .equals(other.getPresencesList())) return false;
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
    if (getPresencesCount() > 0) {
      hash = (37 * hash) + PRESENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPresencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.Status parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.Status parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.Status parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.Status prototype) {
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
   * A snapshot of statuses for some set of users.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.Status}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.Status)
      com.heroiclabs.nakama.rtapi.StatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Status_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Status_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.Status.class, com.heroiclabs.nakama.rtapi.Status.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.Status.newBuilder()
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
      if (presencesBuilder_ == null) {
        presences_ = java.util.Collections.emptyList();
      } else {
        presences_ = null;
        presencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Status_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Status getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.Status.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Status build() {
      com.heroiclabs.nakama.rtapi.Status result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Status buildPartial() {
      com.heroiclabs.nakama.rtapi.Status result = new com.heroiclabs.nakama.rtapi.Status(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.heroiclabs.nakama.rtapi.Status result) {
      if (presencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          presences_ = java.util.Collections.unmodifiableList(presences_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.presences_ = presences_;
      } else {
        result.presences_ = presencesBuilder_.build();
      }
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.Status result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.Status) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.Status)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.Status other) {
      if (other == com.heroiclabs.nakama.rtapi.Status.getDefaultInstance()) return this;
      if (presencesBuilder_ == null) {
        if (!other.presences_.isEmpty()) {
          if (presences_.isEmpty()) {
            presences_ = other.presences_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePresencesIsMutable();
            presences_.addAll(other.presences_);
          }
          onChanged();
        }
      } else {
        if (!other.presences_.isEmpty()) {
          if (presencesBuilder_.isEmpty()) {
            presencesBuilder_.dispose();
            presencesBuilder_ = null;
            presences_ = other.presences_;
            bitField0_ = (bitField0_ & ~0x00000001);
            presencesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPresencesFieldBuilder() : null;
          } else {
            presencesBuilder_.addAllMessages(other.presences_);
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
            case 10: {
              com.heroiclabs.nakama.rtapi.UserPresence m =
                  input.readMessage(
                      com.heroiclabs.nakama.rtapi.UserPresence.parser(),
                      extensionRegistry);
              if (presencesBuilder_ == null) {
                ensurePresencesIsMutable();
                presences_.add(m);
              } else {
                presencesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> presences_ =
      java.util.Collections.emptyList();
    private void ensurePresencesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        presences_ = new java.util.ArrayList<com.heroiclabs.nakama.rtapi.UserPresence>(presences_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> presencesBuilder_;

    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> getPresencesList() {
      if (presencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(presences_);
      } else {
        return presencesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public int getPresencesCount() {
      if (presencesBuilder_ == null) {
        return presences_.size();
      } else {
        return presencesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index) {
      if (presencesBuilder_ == null) {
        return presences_.get(index);
      } else {
        return presencesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder setPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
      if (presencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePresencesIsMutable();
        presences_.set(index, value);
        onChanged();
      } else {
        presencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder setPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      if (presencesBuilder_ == null) {
        ensurePresencesIsMutable();
        presences_.set(index, builderForValue.build());
        onChanged();
      } else {
        presencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder addPresences(com.heroiclabs.nakama.rtapi.UserPresence value) {
      if (presencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePresencesIsMutable();
        presences_.add(value);
        onChanged();
      } else {
        presencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder addPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
      if (presencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePresencesIsMutable();
        presences_.add(index, value);
        onChanged();
      } else {
        presencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder addPresences(
        com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      if (presencesBuilder_ == null) {
        ensurePresencesIsMutable();
        presences_.add(builderForValue.build());
        onChanged();
      } else {
        presencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder addPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      if (presencesBuilder_ == null) {
        ensurePresencesIsMutable();
        presences_.add(index, builderForValue.build());
        onChanged();
      } else {
        presencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder addAllPresences(
        java.lang.Iterable<? extends com.heroiclabs.nakama.rtapi.UserPresence> values) {
      if (presencesBuilder_ == null) {
        ensurePresencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, presences_);
        onChanged();
      } else {
        presencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder clearPresences() {
      if (presencesBuilder_ == null) {
        presences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        presencesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public Builder removePresences(int index) {
      if (presencesBuilder_ == null) {
        ensurePresencesIsMutable();
        presences_.remove(index);
        onChanged();
      } else {
        presencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence.Builder getPresencesBuilder(
        int index) {
      return getPresencesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
        int index) {
      if (presencesBuilder_ == null) {
        return presences_.get(index);  } else {
        return presencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
         getPresencesOrBuilderList() {
      if (presencesBuilder_ != null) {
        return presencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(presences_);
      }
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence.Builder addPresencesBuilder() {
      return getPresencesFieldBuilder().addBuilder(
          com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance());
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence.Builder addPresencesBuilder(
        int index) {
      return getPresencesFieldBuilder().addBuilder(
          index, com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance());
    }
    /**
     * <pre>
     * User statuses.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 1 [json_name = "presences"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.rtapi.UserPresence.Builder> 
         getPresencesBuilderList() {
      return getPresencesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
        getPresencesFieldBuilder() {
      if (presencesBuilder_ == null) {
        presencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.heroiclabs.nakama.rtapi.UserPresence, com.heroiclabs.nakama.rtapi.UserPresence.Builder, com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder>(
                presences_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        presences_ = null;
      }
      return presencesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.Status)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.Status)
  private static final com.heroiclabs.nakama.rtapi.Status DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.Status();
  }

  public static com.heroiclabs.nakama.rtapi.Status getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Status>
      PARSER = new com.google.protobuf.AbstractParser<Status>() {
    @java.lang.Override
    public Status parsePartialFrom(
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

  public static com.google.protobuf.Parser<Status> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Status> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.Status getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

