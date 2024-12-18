// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Execute an Lua function on the server.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Rpc}
 */
public final class Rpc extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.Rpc)
    RpcOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Rpc.class.getName());
  }
  // Use Rpc.newBuilder() to construct.
  private Rpc(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Rpc() {
    id_ = "";
    payload_ = "";
    httpKey_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Rpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Rpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.Rpc.class, com.heroiclabs.nakama.api.Rpc.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * The identifier of the function.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The identifier of the function.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object payload_ = "";
  /**
   * <pre>
   * The payload of the function which must be a JSON object.
   * </pre>
   *
   * <code>string payload = 2 [json_name = "payload"];</code>
   * @return The payload.
   */
  @java.lang.Override
  public java.lang.String getPayload() {
    java.lang.Object ref = payload_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payload_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The payload of the function which must be a JSON object.
   * </pre>
   *
   * <code>string payload = 2 [json_name = "payload"];</code>
   * @return The bytes for payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayloadBytes() {
    java.lang.Object ref = payload_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payload_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_KEY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object httpKey_ = "";
  /**
   * <pre>
   * The authentication key used when executed as a non-client HTTP request.
   * </pre>
   *
   * <code>string http_key = 3 [json_name = "httpKey"];</code>
   * @return The httpKey.
   */
  @java.lang.Override
  public java.lang.String getHttpKey() {
    java.lang.Object ref = httpKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      httpKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The authentication key used when executed as a non-client HTTP request.
   * </pre>
   *
   * <code>string http_key = 3 [json_name = "httpKey"];</code>
   * @return The bytes for httpKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHttpKeyBytes() {
    java.lang.Object ref = httpKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      httpKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(payload_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, payload_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(httpKey_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, httpKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(payload_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, payload_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(httpKey_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, httpKey_);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.Rpc)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.Rpc other = (com.heroiclabs.nakama.api.Rpc) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
    if (!getHttpKey()
        .equals(other.getHttpKey())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (37 * hash) + HTTP_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getHttpKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.Rpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.Rpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.Rpc parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.Rpc prototype) {
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
   * Execute an Lua function on the server.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Rpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Rpc)
      com.heroiclabs.nakama.api.RpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Rpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Rpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.Rpc.class, com.heroiclabs.nakama.api.Rpc.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.Rpc.newBuilder()
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
      id_ = "";
      payload_ = "";
      httpKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Rpc_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Rpc getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.Rpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Rpc build() {
      com.heroiclabs.nakama.api.Rpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Rpc buildPartial() {
      com.heroiclabs.nakama.api.Rpc result = new com.heroiclabs.nakama.api.Rpc(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.Rpc result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payload_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.httpKey_ = httpKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.Rpc) {
        return mergeFrom((com.heroiclabs.nakama.api.Rpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.Rpc other) {
      if (other == com.heroiclabs.nakama.api.Rpc.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPayload().isEmpty()) {
        payload_ = other.payload_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getHttpKey().isEmpty()) {
        httpKey_ = other.httpKey_;
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              payload_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              httpKey_ = input.readStringRequireUtf8();
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The identifier of the function.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The identifier of the function.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The identifier of the function.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier of the function.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifier of the function.
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object payload_ = "";
    /**
     * <pre>
     * The payload of the function which must be a JSON object.
     * </pre>
     *
     * <code>string payload = 2 [json_name = "payload"];</code>
     * @return The payload.
     */
    public java.lang.String getPayload() {
      java.lang.Object ref = payload_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payload_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The payload of the function which must be a JSON object.
     * </pre>
     *
     * <code>string payload = 2 [json_name = "payload"];</code>
     * @return The bytes for payload.
     */
    public com.google.protobuf.ByteString
        getPayloadBytes() {
      java.lang.Object ref = payload_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The payload of the function which must be a JSON object.
     * </pre>
     *
     * <code>string payload = 2 [json_name = "payload"];</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      payload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The payload of the function which must be a JSON object.
     * </pre>
     *
     * <code>string payload = 2 [json_name = "payload"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      payload_ = getDefaultInstance().getPayload();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The payload of the function which must be a JSON object.
     * </pre>
     *
     * <code>string payload = 2 [json_name = "payload"];</code>
     * @param value The bytes for payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      payload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object httpKey_ = "";
    /**
     * <pre>
     * The authentication key used when executed as a non-client HTTP request.
     * </pre>
     *
     * <code>string http_key = 3 [json_name = "httpKey"];</code>
     * @return The httpKey.
     */
    public java.lang.String getHttpKey() {
      java.lang.Object ref = httpKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        httpKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The authentication key used when executed as a non-client HTTP request.
     * </pre>
     *
     * <code>string http_key = 3 [json_name = "httpKey"];</code>
     * @return The bytes for httpKey.
     */
    public com.google.protobuf.ByteString
        getHttpKeyBytes() {
      java.lang.Object ref = httpKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        httpKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The authentication key used when executed as a non-client HTTP request.
     * </pre>
     *
     * <code>string http_key = 3 [json_name = "httpKey"];</code>
     * @param value The httpKey to set.
     * @return This builder for chaining.
     */
    public Builder setHttpKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      httpKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The authentication key used when executed as a non-client HTTP request.
     * </pre>
     *
     * <code>string http_key = 3 [json_name = "httpKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHttpKey() {
      httpKey_ = getDefaultInstance().getHttpKey();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The authentication key used when executed as a non-client HTTP request.
     * </pre>
     *
     * <code>string http_key = 3 [json_name = "httpKey"];</code>
     * @param value The bytes for httpKey to set.
     * @return This builder for chaining.
     */
    public Builder setHttpKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      httpKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Rpc)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.Rpc)
  private static final com.heroiclabs.nakama.api.Rpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.Rpc();
  }

  public static com.heroiclabs.nakama.api.Rpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rpc>
      PARSER = new com.google.protobuf.AbstractParser<Rpc>() {
    @java.lang.Override
    public Rpc parsePartialFrom(
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

  public static com.google.protobuf.Parser<Rpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.Rpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

