// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

/**
 * <pre>
 * Authenticate against the server with a refresh token.
 * </pre>
 *
 * Protobuf type {@code satori.api.AuthenticateRefreshRequest}
 */
public final class AuthenticateRefreshRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:satori.api.AuthenticateRefreshRequest)
    AuthenticateRefreshRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      AuthenticateRefreshRequest.class.getName());
  }
  // Use AuthenticateRefreshRequest.newBuilder() to construct.
  private AuthenticateRefreshRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AuthenticateRefreshRequest() {
    refreshToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.satori.api.SatoriProto.internal_static_satori_api_AuthenticateRefreshRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.satori.api.SatoriProto.internal_static_satori_api_AuthenticateRefreshRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.satori.api.AuthenticateRefreshRequest.class, com.heroiclabs.satori.api.AuthenticateRefreshRequest.Builder.class);
  }

  public static final int REFRESH_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object refreshToken_ = "";
  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  @java.lang.Override
  public java.lang.String getRefreshToken() {
    java.lang.Object ref = refreshToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      refreshToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRefreshTokenBytes() {
    java.lang.Object ref = refreshToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      refreshToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(refreshToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, refreshToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(refreshToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, refreshToken_);
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
    if (!(obj instanceof com.heroiclabs.satori.api.AuthenticateRefreshRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.satori.api.AuthenticateRefreshRequest other = (com.heroiclabs.satori.api.AuthenticateRefreshRequest) obj;

    if (!getRefreshToken()
        .equals(other.getRefreshToken())) return false;
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
    hash = (37 * hash) + REFRESH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getRefreshToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.satori.api.AuthenticateRefreshRequest prototype) {
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
   * Authenticate against the server with a refresh token.
   * </pre>
   *
   * Protobuf type {@code satori.api.AuthenticateRefreshRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:satori.api.AuthenticateRefreshRequest)
      com.heroiclabs.satori.api.AuthenticateRefreshRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.satori.api.SatoriProto.internal_static_satori_api_AuthenticateRefreshRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.satori.api.SatoriProto.internal_static_satori_api_AuthenticateRefreshRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.satori.api.AuthenticateRefreshRequest.class, com.heroiclabs.satori.api.AuthenticateRefreshRequest.Builder.class);
    }

    // Construct using com.heroiclabs.satori.api.AuthenticateRefreshRequest.newBuilder()
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
      refreshToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.satori.api.SatoriProto.internal_static_satori_api_AuthenticateRefreshRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.satori.api.AuthenticateRefreshRequest getDefaultInstanceForType() {
      return com.heroiclabs.satori.api.AuthenticateRefreshRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.satori.api.AuthenticateRefreshRequest build() {
      com.heroiclabs.satori.api.AuthenticateRefreshRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.satori.api.AuthenticateRefreshRequest buildPartial() {
      com.heroiclabs.satori.api.AuthenticateRefreshRequest result = new com.heroiclabs.satori.api.AuthenticateRefreshRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.satori.api.AuthenticateRefreshRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.refreshToken_ = refreshToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.satori.api.AuthenticateRefreshRequest) {
        return mergeFrom((com.heroiclabs.satori.api.AuthenticateRefreshRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.satori.api.AuthenticateRefreshRequest other) {
      if (other == com.heroiclabs.satori.api.AuthenticateRefreshRequest.getDefaultInstance()) return this;
      if (!other.getRefreshToken().isEmpty()) {
        refreshToken_ = other.refreshToken_;
        bitField0_ |= 0x00000001;
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
              refreshToken_ = input.readStringRequireUtf8();
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

    private java.lang.Object refreshToken_ = "";
    /**
     * <pre>
     * Refresh token.
     * </pre>
     *
     * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
     * @return The refreshToken.
     */
    public java.lang.String getRefreshToken() {
      java.lang.Object ref = refreshToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        refreshToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Refresh token.
     * </pre>
     *
     * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
     * @return The bytes for refreshToken.
     */
    public com.google.protobuf.ByteString
        getRefreshTokenBytes() {
      java.lang.Object ref = refreshToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        refreshToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Refresh token.
     * </pre>
     *
     * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
     * @param value The refreshToken to set.
     * @return This builder for chaining.
     */
    public Builder setRefreshToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      refreshToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Refresh token.
     * </pre>
     *
     * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRefreshToken() {
      refreshToken_ = getDefaultInstance().getRefreshToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Refresh token.
     * </pre>
     *
     * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
     * @param value The bytes for refreshToken to set.
     * @return This builder for chaining.
     */
    public Builder setRefreshTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      refreshToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:satori.api.AuthenticateRefreshRequest)
  }

  // @@protoc_insertion_point(class_scope:satori.api.AuthenticateRefreshRequest)
  private static final com.heroiclabs.satori.api.AuthenticateRefreshRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.satori.api.AuthenticateRefreshRequest();
  }

  public static com.heroiclabs.satori.api.AuthenticateRefreshRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticateRefreshRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticateRefreshRequest>() {
    @java.lang.Override
    public AuthenticateRefreshRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthenticateRefreshRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticateRefreshRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.satori.api.AuthenticateRefreshRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

