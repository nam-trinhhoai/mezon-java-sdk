// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Authenticate against the server with a custom ID.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AuthenticateCustomRequest}
 */
public final class AuthenticateCustomRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.AuthenticateCustomRequest)
    AuthenticateCustomRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      AuthenticateCustomRequest.class.getName());
  }
  // Use AuthenticateCustomRequest.newBuilder() to construct.
  private AuthenticateCustomRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AuthenticateCustomRequest() {
    username_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AuthenticateCustomRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AuthenticateCustomRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.AuthenticateCustomRequest.class, com.heroiclabs.nakama.api.AuthenticateCustomRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.api.AccountCustom account_;
  /**
   * <pre>
   * The custom account details.
   * </pre>
   *
   * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The custom account details.
   * </pre>
   *
   * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.AccountCustom getAccount() {
    return account_ == null ? com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * The custom account details.
   * </pre>
   *
   * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.AccountCustomOrBuilder getAccountOrBuilder() {
    return account_ == null ? com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance() : account_;
  }

  public static final int CREATE_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue create_;
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   * @return Whether the create field is set.
   */
  @java.lang.Override
  public boolean hasCreate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   * @return The create.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getCreate() {
    return create_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : create_;
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getCreateOrBuilder() {
    return create_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : create_;
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getCreate());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, username_);
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
        .computeMessageSize(2, getCreate());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, username_);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.AuthenticateCustomRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.AuthenticateCustomRequest other = (com.heroiclabs.nakama.api.AuthenticateCustomRequest) obj;

    if (hasAccount() != other.hasAccount()) return false;
    if (hasAccount()) {
      if (!getAccount()
          .equals(other.getAccount())) return false;
    }
    if (hasCreate() != other.hasCreate()) return false;
    if (hasCreate()) {
      if (!getCreate()
          .equals(other.getCreate())) return false;
    }
    if (!getUsername()
        .equals(other.getUsername())) return false;
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
    if (hasCreate()) {
      hash = (37 * hash) + CREATE_FIELD_NUMBER;
      hash = (53 * hash) + getCreate().hashCode();
    }
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.AuthenticateCustomRequest prototype) {
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
   * Authenticate against the server with a custom ID.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AuthenticateCustomRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AuthenticateCustomRequest)
      com.heroiclabs.nakama.api.AuthenticateCustomRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AuthenticateCustomRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AuthenticateCustomRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.AuthenticateCustomRequest.class, com.heroiclabs.nakama.api.AuthenticateCustomRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.AuthenticateCustomRequest.newBuilder()
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
        getCreateFieldBuilder();
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
      create_ = null;
      if (createBuilder_ != null) {
        createBuilder_.dispose();
        createBuilder_ = null;
      }
      username_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AuthenticateCustomRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AuthenticateCustomRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.AuthenticateCustomRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AuthenticateCustomRequest build() {
      com.heroiclabs.nakama.api.AuthenticateCustomRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AuthenticateCustomRequest buildPartial() {
      com.heroiclabs.nakama.api.AuthenticateCustomRequest result = new com.heroiclabs.nakama.api.AuthenticateCustomRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.AuthenticateCustomRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.account_ = accountBuilder_ == null
            ? account_
            : accountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.create_ = createBuilder_ == null
            ? create_
            : createBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.username_ = username_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.AuthenticateCustomRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.AuthenticateCustomRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.AuthenticateCustomRequest other) {
      if (other == com.heroiclabs.nakama.api.AuthenticateCustomRequest.getDefaultInstance()) return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      if (other.hasCreate()) {
        mergeCreate(other.getCreate());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000004;
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
              input.readMessage(
                  getAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCreateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              username_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private com.heroiclabs.nakama.api.AccountCustom account_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.AccountCustom, com.heroiclabs.nakama.api.AccountCustom.Builder, com.heroiclabs.nakama.api.AccountCustomOrBuilder> accountBuilder_;
    /**
     * <pre>
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     * @return The account.
     */
    public com.heroiclabs.nakama.api.AccountCustom getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    public Builder setAccount(com.heroiclabs.nakama.api.AccountCustom value) {
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
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    public Builder setAccount(
        com.heroiclabs.nakama.api.AccountCustom.Builder builderForValue) {
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
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    public Builder mergeAccount(com.heroiclabs.nakama.api.AccountCustom value) {
      if (accountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          account_ != null &&
          account_ != com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()) {
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
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
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
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    public com.heroiclabs.nakama.api.AccountCustom.Builder getAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    public com.heroiclabs.nakama.api.AccountCustomOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance() : account_;
      }
    }
    /**
     * <pre>
     * The custom account details.
     * </pre>
     *
     * <code>.nakama.api.AccountCustom account = 1 [json_name = "account"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.AccountCustom, com.heroiclabs.nakama.api.AccountCustom.Builder, com.heroiclabs.nakama.api.AccountCustomOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.api.AccountCustom, com.heroiclabs.nakama.api.AccountCustom.Builder, com.heroiclabs.nakama.api.AccountCustomOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }

    private com.google.protobuf.BoolValue create_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> createBuilder_;
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     * @return Whether the create field is set.
     */
    public boolean hasCreate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     * @return The create.
     */
    public com.google.protobuf.BoolValue getCreate() {
      if (createBuilder_ == null) {
        return create_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : create_;
      } else {
        return createBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public Builder setCreate(com.google.protobuf.BoolValue value) {
      if (createBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        create_ = value;
      } else {
        createBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public Builder setCreate(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (createBuilder_ == null) {
        create_ = builderForValue.build();
      } else {
        createBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public Builder mergeCreate(com.google.protobuf.BoolValue value) {
      if (createBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          create_ != null &&
          create_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getCreateBuilder().mergeFrom(value);
        } else {
          create_ = value;
        }
      } else {
        createBuilder_.mergeFrom(value);
      }
      if (create_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public Builder clearCreate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      create_ = null;
      if (createBuilder_ != null) {
        createBuilder_.dispose();
        createBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public com.google.protobuf.BoolValue.Builder getCreateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getCreateOrBuilder() {
      if (createBuilder_ != null) {
        return createBuilder_.getMessageOrBuilder();
      } else {
        return create_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : create_;
      }
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getCreateFieldBuilder() {
      if (createBuilder_ == null) {
        createBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getCreate(),
                getParentForChildren(),
                isClean());
        create_ = null;
      }
      return createBuilder_;
    }

    private java.lang.Object username_ = "";
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>string username = 3 [json_name = "username"];</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>string username = 3 [json_name = "username"];</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>string username = 3 [json_name = "username"];</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>string username = 3 [json_name = "username"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>string username = 3 [json_name = "username"];</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AuthenticateCustomRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.AuthenticateCustomRequest)
  private static final com.heroiclabs.nakama.api.AuthenticateCustomRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.AuthenticateCustomRequest();
  }

  public static com.heroiclabs.nakama.api.AuthenticateCustomRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticateCustomRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticateCustomRequest>() {
    @java.lang.Override
    public AuthenticateCustomRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthenticateCustomRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticateCustomRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.AuthenticateCustomRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

