// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Facebook Instant IAP Purchase validation request
 * </pre>
 *
 * Protobuf type {@code nakama.api.ValidatePurchaseFacebookInstantRequest}
 */
public final class ValidatePurchaseFacebookInstantRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.ValidatePurchaseFacebookInstantRequest)
    ValidatePurchaseFacebookInstantRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      ValidatePurchaseFacebookInstantRequest.class.getName());
  }
  // Use ValidatePurchaseFacebookInstantRequest.newBuilder() to construct.
  private ValidatePurchaseFacebookInstantRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ValidatePurchaseFacebookInstantRequest() {
    signedRequest_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseFacebookInstantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseFacebookInstantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.class, com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SIGNED_REQUEST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signedRequest_ = "";
  /**
   * <pre>
   * Base64 encoded Facebook Instant signedRequest receipt data payload.
   * </pre>
   *
   * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
   * @return The signedRequest.
   */
  @java.lang.Override
  public java.lang.String getSignedRequest() {
    java.lang.Object ref = signedRequest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signedRequest_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Base64 encoded Facebook Instant signedRequest receipt data payload.
   * </pre>
   *
   * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
   * @return The bytes for signedRequest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignedRequestBytes() {
    java.lang.Object ref = signedRequest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signedRequest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERSIST_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue persist_;
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
   * @return Whether the persist field is set.
   */
  @java.lang.Override
  public boolean hasPersist() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
   * @return The persist.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getPersist() {
    return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
  }
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getPersistOrBuilder() {
    return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signedRequest_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, signedRequest_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPersist());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signedRequest_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, signedRequest_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPersist());
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
    if (!(obj instanceof com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest other = (com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest) obj;

    if (!getSignedRequest()
        .equals(other.getSignedRequest())) return false;
    if (hasPersist() != other.hasPersist()) return false;
    if (hasPersist()) {
      if (!getPersist()
          .equals(other.getPersist())) return false;
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
    hash = (37 * hash) + SIGNED_REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getSignedRequest().hashCode();
    if (hasPersist()) {
      hash = (37 * hash) + PERSIST_FIELD_NUMBER;
      hash = (53 * hash) + getPersist().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest prototype) {
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
   * Facebook Instant IAP Purchase validation request
   * </pre>
   *
   * Protobuf type {@code nakama.api.ValidatePurchaseFacebookInstantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ValidatePurchaseFacebookInstantRequest)
      com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseFacebookInstantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseFacebookInstantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.class, com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.newBuilder()
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
        getPersistFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      signedRequest_ = "";
      persist_ = null;
      if (persistBuilder_ != null) {
        persistBuilder_.dispose();
        persistBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseFacebookInstantRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest build() {
      com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest buildPartial() {
      com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest result = new com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signedRequest_ = signedRequest_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.persist_ = persistBuilder_ == null
            ? persist_
            : persistBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest other) {
      if (other == com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.getDefaultInstance()) return this;
      if (!other.getSignedRequest().isEmpty()) {
        signedRequest_ = other.signedRequest_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPersist()) {
        mergePersist(other.getPersist());
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
              signedRequest_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPersistFieldBuilder().getBuilder(),
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

    private java.lang.Object signedRequest_ = "";
    /**
     * <pre>
     * Base64 encoded Facebook Instant signedRequest receipt data payload.
     * </pre>
     *
     * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
     * @return The signedRequest.
     */
    public java.lang.String getSignedRequest() {
      java.lang.Object ref = signedRequest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signedRequest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Base64 encoded Facebook Instant signedRequest receipt data payload.
     * </pre>
     *
     * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
     * @return The bytes for signedRequest.
     */
    public com.google.protobuf.ByteString
        getSignedRequestBytes() {
      java.lang.Object ref = signedRequest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signedRequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Base64 encoded Facebook Instant signedRequest receipt data payload.
     * </pre>
     *
     * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
     * @param value The signedRequest to set.
     * @return This builder for chaining.
     */
    public Builder setSignedRequest(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signedRequest_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Base64 encoded Facebook Instant signedRequest receipt data payload.
     * </pre>
     *
     * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignedRequest() {
      signedRequest_ = getDefaultInstance().getSignedRequest();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Base64 encoded Facebook Instant signedRequest receipt data payload.
     * </pre>
     *
     * <code>string signed_request = 1 [json_name = "signedRequest"];</code>
     * @param value The bytes for signedRequest to set.
     * @return This builder for chaining.
     */
    public Builder setSignedRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signedRequest_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.BoolValue persist_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> persistBuilder_;
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     * @return Whether the persist field is set.
     */
    public boolean hasPersist() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     * @return The persist.
     */
    public com.google.protobuf.BoolValue getPersist() {
      if (persistBuilder_ == null) {
        return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
      } else {
        return persistBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public Builder setPersist(com.google.protobuf.BoolValue value) {
      if (persistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        persist_ = value;
      } else {
        persistBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public Builder setPersist(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (persistBuilder_ == null) {
        persist_ = builderForValue.build();
      } else {
        persistBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public Builder mergePersist(com.google.protobuf.BoolValue value) {
      if (persistBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          persist_ != null &&
          persist_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getPersistBuilder().mergeFrom(value);
        } else {
          persist_ = value;
        }
      } else {
        persistBuilder_.mergeFrom(value);
      }
      if (persist_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public Builder clearPersist() {
      bitField0_ = (bitField0_ & ~0x00000002);
      persist_ = null;
      if (persistBuilder_ != null) {
        persistBuilder_.dispose();
        persistBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public com.google.protobuf.BoolValue.Builder getPersistBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPersistFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getPersistOrBuilder() {
      if (persistBuilder_ != null) {
        return persistBuilder_.getMessageOrBuilder();
      } else {
        return persist_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
      }
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 2 [json_name = "persist"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getPersistFieldBuilder() {
      if (persistBuilder_ == null) {
        persistBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getPersist(),
                getParentForChildren(),
                isClean());
        persist_ = null;
      }
      return persistBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ValidatePurchaseFacebookInstantRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.ValidatePurchaseFacebookInstantRequest)
  private static final com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest();
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatePurchaseFacebookInstantRequest>
      PARSER = new com.google.protobuf.AbstractParser<ValidatePurchaseFacebookInstantRequest>() {
    @java.lang.Override
    public ValidatePurchaseFacebookInstantRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidatePurchaseFacebookInstantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatePurchaseFacebookInstantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

