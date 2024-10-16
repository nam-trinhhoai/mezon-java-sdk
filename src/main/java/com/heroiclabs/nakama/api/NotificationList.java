// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A collection of zero or more notifications.
 * </pre>
 *
 * Protobuf type {@code nakama.api.NotificationList}
 */
public final class NotificationList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.NotificationList)
    NotificationListOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      NotificationList.class.getName());
  }
  // Use NotificationList.newBuilder() to construct.
  private NotificationList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NotificationList() {
    notifications_ = java.util.Collections.emptyList();
    cacheableCursor_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_NotificationList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_NotificationList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.NotificationList.class, com.heroiclabs.nakama.api.NotificationList.Builder.class);
  }

  public static final int NOTIFICATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.heroiclabs.nakama.api.Notification> notifications_;
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  @java.lang.Override
  public java.util.List<com.heroiclabs.nakama.api.Notification> getNotificationsList() {
    return notifications_;
  }
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.heroiclabs.nakama.api.NotificationOrBuilder> 
      getNotificationsOrBuilderList() {
    return notifications_;
  }
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  @java.lang.Override
  public int getNotificationsCount() {
    return notifications_.size();
  }
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.Notification getNotifications(int index) {
    return notifications_.get(index);
  }
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.NotificationOrBuilder getNotificationsOrBuilder(
      int index) {
    return notifications_.get(index);
  }

  public static final int CACHEABLE_CURSOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cacheableCursor_ = "";
  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
   * @return The cacheableCursor.
   */
  @java.lang.Override
  public java.lang.String getCacheableCursor() {
    java.lang.Object ref = cacheableCursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cacheableCursor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
   * @return The bytes for cacheableCursor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCacheableCursorBytes() {
    java.lang.Object ref = cacheableCursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cacheableCursor_ = b;
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
    for (int i = 0; i < notifications_.size(); i++) {
      output.writeMessage(1, notifications_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cacheableCursor_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, cacheableCursor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < notifications_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, notifications_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cacheableCursor_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, cacheableCursor_);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.NotificationList)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.NotificationList other = (com.heroiclabs.nakama.api.NotificationList) obj;

    if (!getNotificationsList()
        .equals(other.getNotificationsList())) return false;
    if (!getCacheableCursor()
        .equals(other.getCacheableCursor())) return false;
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
    if (getNotificationsCount() > 0) {
      hash = (37 * hash) + NOTIFICATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationsList().hashCode();
    }
    hash = (37 * hash) + CACHEABLE_CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCacheableCursor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.NotificationList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.NotificationList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.NotificationList parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.NotificationList prototype) {
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
   * A collection of zero or more notifications.
   * </pre>
   *
   * Protobuf type {@code nakama.api.NotificationList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.NotificationList)
      com.heroiclabs.nakama.api.NotificationListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_NotificationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_NotificationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.NotificationList.class, com.heroiclabs.nakama.api.NotificationList.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.NotificationList.newBuilder()
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
      if (notificationsBuilder_ == null) {
        notifications_ = java.util.Collections.emptyList();
      } else {
        notifications_ = null;
        notificationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      cacheableCursor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_NotificationList_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.NotificationList getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.NotificationList.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.NotificationList build() {
      com.heroiclabs.nakama.api.NotificationList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.NotificationList buildPartial() {
      com.heroiclabs.nakama.api.NotificationList result = new com.heroiclabs.nakama.api.NotificationList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.heroiclabs.nakama.api.NotificationList result) {
      if (notificationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          notifications_ = java.util.Collections.unmodifiableList(notifications_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.notifications_ = notifications_;
      } else {
        result.notifications_ = notificationsBuilder_.build();
      }
    }

    private void buildPartial0(com.heroiclabs.nakama.api.NotificationList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cacheableCursor_ = cacheableCursor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.NotificationList) {
        return mergeFrom((com.heroiclabs.nakama.api.NotificationList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.NotificationList other) {
      if (other == com.heroiclabs.nakama.api.NotificationList.getDefaultInstance()) return this;
      if (notificationsBuilder_ == null) {
        if (!other.notifications_.isEmpty()) {
          if (notifications_.isEmpty()) {
            notifications_ = other.notifications_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNotificationsIsMutable();
            notifications_.addAll(other.notifications_);
          }
          onChanged();
        }
      } else {
        if (!other.notifications_.isEmpty()) {
          if (notificationsBuilder_.isEmpty()) {
            notificationsBuilder_.dispose();
            notificationsBuilder_ = null;
            notifications_ = other.notifications_;
            bitField0_ = (bitField0_ & ~0x00000001);
            notificationsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getNotificationsFieldBuilder() : null;
          } else {
            notificationsBuilder_.addAllMessages(other.notifications_);
          }
        }
      }
      if (!other.getCacheableCursor().isEmpty()) {
        cacheableCursor_ = other.cacheableCursor_;
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
              com.heroiclabs.nakama.api.Notification m =
                  input.readMessage(
                      com.heroiclabs.nakama.api.Notification.parser(),
                      extensionRegistry);
              if (notificationsBuilder_ == null) {
                ensureNotificationsIsMutable();
                notifications_.add(m);
              } else {
                notificationsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              cacheableCursor_ = input.readStringRequireUtf8();
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

    private java.util.List<com.heroiclabs.nakama.api.Notification> notifications_ =
      java.util.Collections.emptyList();
    private void ensureNotificationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notifications_ = new java.util.ArrayList<com.heroiclabs.nakama.api.Notification>(notifications_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.Notification, com.heroiclabs.nakama.api.Notification.Builder, com.heroiclabs.nakama.api.NotificationOrBuilder> notificationsBuilder_;

    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Notification> getNotificationsList() {
      if (notificationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(notifications_);
      } else {
        return notificationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public int getNotificationsCount() {
      if (notificationsBuilder_ == null) {
        return notifications_.size();
      } else {
        return notificationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public com.heroiclabs.nakama.api.Notification getNotifications(int index) {
      if (notificationsBuilder_ == null) {
        return notifications_.get(index);
      } else {
        return notificationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder setNotifications(
        int index, com.heroiclabs.nakama.api.Notification value) {
      if (notificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotificationsIsMutable();
        notifications_.set(index, value);
        onChanged();
      } else {
        notificationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder setNotifications(
        int index, com.heroiclabs.nakama.api.Notification.Builder builderForValue) {
      if (notificationsBuilder_ == null) {
        ensureNotificationsIsMutable();
        notifications_.set(index, builderForValue.build());
        onChanged();
      } else {
        notificationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder addNotifications(com.heroiclabs.nakama.api.Notification value) {
      if (notificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotificationsIsMutable();
        notifications_.add(value);
        onChanged();
      } else {
        notificationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder addNotifications(
        int index, com.heroiclabs.nakama.api.Notification value) {
      if (notificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotificationsIsMutable();
        notifications_.add(index, value);
        onChanged();
      } else {
        notificationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder addNotifications(
        com.heroiclabs.nakama.api.Notification.Builder builderForValue) {
      if (notificationsBuilder_ == null) {
        ensureNotificationsIsMutable();
        notifications_.add(builderForValue.build());
        onChanged();
      } else {
        notificationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder addNotifications(
        int index, com.heroiclabs.nakama.api.Notification.Builder builderForValue) {
      if (notificationsBuilder_ == null) {
        ensureNotificationsIsMutable();
        notifications_.add(index, builderForValue.build());
        onChanged();
      } else {
        notificationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder addAllNotifications(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.Notification> values) {
      if (notificationsBuilder_ == null) {
        ensureNotificationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, notifications_);
        onChanged();
      } else {
        notificationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder clearNotifications() {
      if (notificationsBuilder_ == null) {
        notifications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        notificationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public Builder removeNotifications(int index) {
      if (notificationsBuilder_ == null) {
        ensureNotificationsIsMutable();
        notifications_.remove(index);
        onChanged();
      } else {
        notificationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public com.heroiclabs.nakama.api.Notification.Builder getNotificationsBuilder(
        int index) {
      return getNotificationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public com.heroiclabs.nakama.api.NotificationOrBuilder getNotificationsOrBuilder(
        int index) {
      if (notificationsBuilder_ == null) {
        return notifications_.get(index);  } else {
        return notificationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public java.util.List<? extends com.heroiclabs.nakama.api.NotificationOrBuilder> 
         getNotificationsOrBuilderList() {
      if (notificationsBuilder_ != null) {
        return notificationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(notifications_);
      }
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public com.heroiclabs.nakama.api.Notification.Builder addNotificationsBuilder() {
      return getNotificationsFieldBuilder().addBuilder(
          com.heroiclabs.nakama.api.Notification.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public com.heroiclabs.nakama.api.Notification.Builder addNotificationsBuilder(
        int index) {
      return getNotificationsFieldBuilder().addBuilder(
          index, com.heroiclabs.nakama.api.Notification.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of notifications.
     * </pre>
     *
     * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Notification.Builder> 
         getNotificationsBuilderList() {
      return getNotificationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.Notification, com.heroiclabs.nakama.api.Notification.Builder, com.heroiclabs.nakama.api.NotificationOrBuilder> 
        getNotificationsFieldBuilder() {
      if (notificationsBuilder_ == null) {
        notificationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.heroiclabs.nakama.api.Notification, com.heroiclabs.nakama.api.Notification.Builder, com.heroiclabs.nakama.api.NotificationOrBuilder>(
                notifications_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        notifications_ = null;
      }
      return notificationsBuilder_;
    }

    private java.lang.Object cacheableCursor_ = "";
    /**
     * <pre>
     * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
     * </pre>
     *
     * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
     * @return The cacheableCursor.
     */
    public java.lang.String getCacheableCursor() {
      java.lang.Object ref = cacheableCursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cacheableCursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
     * </pre>
     *
     * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
     * @return The bytes for cacheableCursor.
     */
    public com.google.protobuf.ByteString
        getCacheableCursorBytes() {
      java.lang.Object ref = cacheableCursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cacheableCursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
     * </pre>
     *
     * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
     * @param value The cacheableCursor to set.
     * @return This builder for chaining.
     */
    public Builder setCacheableCursor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cacheableCursor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
     * </pre>
     *
     * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCacheableCursor() {
      cacheableCursor_ = getDefaultInstance().getCacheableCursor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
     * </pre>
     *
     * <code>string cacheable_cursor = 2 [json_name = "cacheableCursor"];</code>
     * @param value The bytes for cacheableCursor to set.
     * @return This builder for chaining.
     */
    public Builder setCacheableCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cacheableCursor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.NotificationList)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.NotificationList)
  private static final com.heroiclabs.nakama.api.NotificationList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.NotificationList();
  }

  public static com.heroiclabs.nakama.api.NotificationList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationList>
      PARSER = new com.google.protobuf.AbstractParser<NotificationList>() {
    @java.lang.Override
    public NotificationList parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotificationList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.NotificationList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

