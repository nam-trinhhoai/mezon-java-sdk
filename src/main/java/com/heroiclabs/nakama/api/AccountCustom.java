// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Send a custom ID to the server. Used with authenticate/link/unlink.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AccountCustom}
 */
public final class AccountCustom extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.AccountCustom)
    AccountCustomOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      AccountCustom.class.getName());
  }
  // Use AccountCustom.newBuilder() to construct.
  private AccountCustom(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccountCustom() {
    id_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetVars();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.AccountCustom.class, com.heroiclabs.nakama.api.AccountCustom.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * A custom identifier.
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
   * A custom identifier.
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

  public static final int VARS_FIELD_NUMBER = 2;
  private static final class VarsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_VarsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> vars_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetVars() {
    if (vars_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          VarsDefaultEntryHolder.defaultEntry);
    }
    return vars_;
  }
  public int getVarsCount() {
    return internalGetVars().getMap().size();
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  @java.lang.Override
  public boolean containsVars(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetVars().getMap().containsKey(key);
  }
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getVars() {
    return getVarsMap();
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
    return internalGetVars().getMap();
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getVarsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  @java.lang.Override
  public java.lang.String getVarsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessage
      .serializeStringMapTo(
        output,
        internalGetVars(),
        VarsDefaultEntryHolder.defaultEntry,
        2);
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
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetVars().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      vars__ = VarsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, vars__);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.AccountCustom)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.AccountCustom other = (com.heroiclabs.nakama.api.AccountCustom) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!internalGetVars().equals(
        other.internalGetVars())) return false;
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
    if (!internalGetVars().getMap().isEmpty()) {
      hash = (37 * hash) + VARS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVars().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.AccountCustom parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.AccountCustom parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.AccountCustom parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.AccountCustom prototype) {
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
   * Send a custom ID to the server. Used with authenticate/link/unlink.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AccountCustom}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AccountCustom)
      com.heroiclabs.nakama.api.AccountCustomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetVars();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableVars();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.AccountCustom.class, com.heroiclabs.nakama.api.AccountCustom.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.AccountCustom.newBuilder()
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
      internalGetMutableVars().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_AccountCustom_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AccountCustom getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AccountCustom build() {
      com.heroiclabs.nakama.api.AccountCustom result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.AccountCustom buildPartial() {
      com.heroiclabs.nakama.api.AccountCustom result = new com.heroiclabs.nakama.api.AccountCustom(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.AccountCustom result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vars_ = internalGetVars();
        result.vars_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.AccountCustom) {
        return mergeFrom((com.heroiclabs.nakama.api.AccountCustom)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.AccountCustom other) {
      if (other == com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableVars().mergeFrom(
          other.internalGetVars());
      bitField0_ |= 0x00000002;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              vars__ = input.readMessage(
                  VarsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableVars().getMutableMap().put(
                  vars__.getKey(), vars__.getValue());
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * A custom identifier.
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
     * A custom identifier.
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
     * A custom identifier.
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
     * A custom identifier.
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
     * A custom identifier.
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> vars_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetVars() {
      if (vars_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            VarsDefaultEntryHolder.defaultEntry);
      }
      return vars_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableVars() {
      if (vars_ == null) {
        vars_ = com.google.protobuf.MapField.newMapField(
            VarsDefaultEntryHolder.defaultEntry);
      }
      if (!vars_.isMutable()) {
        vars_ = vars_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return vars_;
    }
    public int getVarsCount() {
      return internalGetVars().getMap().size();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    @java.lang.Override
    public boolean containsVars(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetVars().getMap().containsKey(key);
    }
    /**
     * Use {@link #getVarsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getVars() {
      return getVarsMap();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
      return internalGetVars().getMap();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getVarsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetVars().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    @java.lang.Override
    public java.lang.String getVarsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetVars().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearVars() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableVars().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    public Builder removeVars(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableVars().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableVars() {
      bitField0_ |= 0x00000002;
      return internalGetMutableVars().getMutableMap();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    public Builder putVars(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableVars().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
     */
    public Builder putAllVars(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableVars().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AccountCustom)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.AccountCustom)
  private static final com.heroiclabs.nakama.api.AccountCustom DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.AccountCustom();
  }

  public static com.heroiclabs.nakama.api.AccountCustom getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountCustom>
      PARSER = new com.google.protobuf.AbstractParser<AccountCustom>() {
    @java.lang.Override
    public AccountCustom parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountCustom> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountCustom> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.AccountCustom getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

