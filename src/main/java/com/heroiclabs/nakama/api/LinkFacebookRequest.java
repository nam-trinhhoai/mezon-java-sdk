// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Link Facebook to the current user's account.
 * </pre>
 *
 * Protobuf type {@code nakama.api.LinkFacebookRequest}
 */
public final class LinkFacebookRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.LinkFacebookRequest)
    LinkFacebookRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      LinkFacebookRequest.class.getName());
  }
  // Use LinkFacebookRequest.newBuilder() to construct.
  private LinkFacebookRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LinkFacebookRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_LinkFacebookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_LinkFacebookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.LinkFacebookRequest.class, com.heroiclabs.nakama.api.LinkFacebookRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.api.AccountFacebook account_;
  /**
   * <pre>
   * The Facebook account details.
   * </pre>
   *
   * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The Facebook account details.
   * </pre>
   *
   * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.AccountFacebook getAccount() {
    return account_ == null ? com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * The Facebook account details.
   * </pre>
   *
   * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.AccountFacebookOrBuilder getAccountOrBuilder() {
    return account_ == null ? com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance() : account_;
  }

  public static final int SYNC_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue sync_;
  /**
   * <pre>
   * Import Facebook friends for the user.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
   * @return Whether the sync field is set.
   */
  @java.lang.Override
  public boolean hasSync() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Import Facebook friends for the user.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
   * @return The sync.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getSync() {
    return sync_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : sync_;
  }
  /**
   * <pre>
   * Import Facebook friends for the user.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getSyncOrBuilder() {
    return sync_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : sync_;
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
      output.writeMessage(1, getAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getSync());
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
        .computeMessageSize(1, getAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSync());
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
    if (!(obj instanceof com.heroiclabs.nakama.api.LinkFacebookRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.LinkFacebookRequest other = (com.heroiclabs.nakama.api.LinkFacebookRequest) obj;

    if (hasAccount() != other.hasAccount()) return false;
    if (hasAccount()) {
      if (!getAccount()
          .equals(other.getAccount())) return false;
    }
    if (hasSync() != other.hasSync()) return false;
    if (hasSync()) {
      if (!getSync()
          .equals(other.getSync())) return false;
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
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    if (hasSync()) {
      hash = (37 * hash) + SYNC_FIELD_NUMBER;
      hash = (53 * hash) + getSync().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.LinkFacebookRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.LinkFacebookRequest prototype) {
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
   * Link Facebook to the current user's account.
   * </pre>
   *
   * Protobuf type {@code nakama.api.LinkFacebookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.LinkFacebookRequest)
      com.heroiclabs.nakama.api.LinkFacebookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_LinkFacebookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_LinkFacebookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.LinkFacebookRequest.class, com.heroiclabs.nakama.api.LinkFacebookRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.LinkFacebookRequest.newBuilder()
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
        getAccountFieldBuilder();
        getSyncFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      sync_ = null;
      if (syncBuilder_ != null) {
        syncBuilder_.dispose();
        syncBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_LinkFacebookRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.LinkFacebookRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.LinkFacebookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.LinkFacebookRequest build() {
      com.heroiclabs.nakama.api.LinkFacebookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.LinkFacebookRequest buildPartial() {
      com.heroiclabs.nakama.api.LinkFacebookRequest result = new com.heroiclabs.nakama.api.LinkFacebookRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.LinkFacebookRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.account_ = accountBuilder_ == null
            ? account_
            : accountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sync_ = syncBuilder_ == null
            ? sync_
            : syncBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.LinkFacebookRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.LinkFacebookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.LinkFacebookRequest other) {
      if (other == com.heroiclabs.nakama.api.LinkFacebookRequest.getDefaultInstance()) return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      if (other.hasSync()) {
        mergeSync(other.getSync());
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
                  getAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSyncFieldBuilder().getBuilder(),
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

    private com.heroiclabs.nakama.api.AccountFacebook account_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.AccountFacebook, com.heroiclabs.nakama.api.AccountFacebook.Builder, com.heroiclabs.nakama.api.AccountFacebookOrBuilder> accountBuilder_;
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     * @return The account.
     */
    public com.heroiclabs.nakama.api.AccountFacebook getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public Builder setAccount(com.heroiclabs.nakama.api.AccountFacebook value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
      } else {
        accountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public Builder setAccount(
        com.heroiclabs.nakama.api.AccountFacebook.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public Builder mergeAccount(com.heroiclabs.nakama.api.AccountFacebook value) {
      if (accountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          account_ != null &&
          account_ != com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance()) {
          getAccountBuilder().mergeFrom(value);
        } else {
          account_ = value;
        }
      } else {
        accountBuilder_.mergeFrom(value);
      }
      if (account_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public Builder clearAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public com.heroiclabs.nakama.api.AccountFacebook.Builder getAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    public com.heroiclabs.nakama.api.AccountFacebookOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance() : account_;
      }
    }
    /**
     * <pre>
     * The Facebook account details.
     * </pre>
     *
     * <code>.nakama.api.AccountFacebook account = 1 [json_name = "account"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.AccountFacebook, com.heroiclabs.nakama.api.AccountFacebook.Builder, com.heroiclabs.nakama.api.AccountFacebookOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.api.AccountFacebook, com.heroiclabs.nakama.api.AccountFacebook.Builder, com.heroiclabs.nakama.api.AccountFacebookOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }

    private com.google.protobuf.BoolValue sync_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> syncBuilder_;
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     * @return Whether the sync field is set.
     */
    public boolean hasSync() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     * @return The sync.
     */
    public com.google.protobuf.BoolValue getSync() {
      if (syncBuilder_ == null) {
        return sync_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : sync_;
      } else {
        return syncBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public Builder setSync(com.google.protobuf.BoolValue value) {
      if (syncBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sync_ = value;
      } else {
        syncBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public Builder setSync(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (syncBuilder_ == null) {
        sync_ = builderForValue.build();
      } else {
        syncBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public Builder mergeSync(com.google.protobuf.BoolValue value) {
      if (syncBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          sync_ != null &&
          sync_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getSyncBuilder().mergeFrom(value);
        } else {
          sync_ = value;
        }
      } else {
        syncBuilder_.mergeFrom(value);
      }
      if (sync_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public Builder clearSync() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sync_ = null;
      if (syncBuilder_ != null) {
        syncBuilder_.dispose();
        syncBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public com.google.protobuf.BoolValue.Builder getSyncBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSyncFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getSyncOrBuilder() {
      if (syncBuilder_ != null) {
        return syncBuilder_.getMessageOrBuilder();
      } else {
        return sync_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : sync_;
      }
    }
    /**
     * <pre>
     * Import Facebook friends for the user.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue sync = 2 [json_name = "sync"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getSyncFieldBuilder() {
      if (syncBuilder_ == null) {
        syncBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getSync(),
                getParentForChildren(),
                isClean());
        sync_ = null;
      }
      return syncBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.LinkFacebookRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.LinkFacebookRequest)
  private static final com.heroiclabs.nakama.api.LinkFacebookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.LinkFacebookRequest();
  }

  public static com.heroiclabs.nakama.api.LinkFacebookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkFacebookRequest>
      PARSER = new com.google.protobuf.AbstractParser<LinkFacebookRequest>() {
    @java.lang.Override
    public LinkFacebookRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LinkFacebookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkFacebookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.LinkFacebookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

