// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Write objects to the storage engine.
 * </pre>
 *
 * Protobuf type {@code nakama.api.WriteStorageObjectsRequest}
 */
public final class WriteStorageObjectsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.WriteStorageObjectsRequest)
    WriteStorageObjectsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      WriteStorageObjectsRequest.class.getName());
  }
  // Use WriteStorageObjectsRequest.newBuilder() to construct.
  private WriteStorageObjectsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private WriteStorageObjectsRequest() {
    objects_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_WriteStorageObjectsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_WriteStorageObjectsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.WriteStorageObjectsRequest.class, com.heroiclabs.nakama.api.WriteStorageObjectsRequest.Builder.class);
  }

  public static final int OBJECTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> objects_;
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> getObjectsList() {
    return objects_;
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder> 
      getObjectsOrBuilderList() {
    return objects_;
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public int getObjectsCount() {
    return objects_.size();
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.WriteStorageObject getObjects(int index) {
    return objects_.get(index);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder getObjectsOrBuilder(
      int index) {
    return objects_.get(index);
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
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(1, objects_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objects_.get(i));
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
    if (!(obj instanceof com.heroiclabs.nakama.api.WriteStorageObjectsRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.WriteStorageObjectsRequest other = (com.heroiclabs.nakama.api.WriteStorageObjectsRequest) obj;

    if (!getObjectsList()
        .equals(other.getObjectsList())) return false;
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
    if (getObjectsCount() > 0) {
      hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.WriteStorageObjectsRequest prototype) {
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
   * Write objects to the storage engine.
   * </pre>
   *
   * Protobuf type {@code nakama.api.WriteStorageObjectsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.WriteStorageObjectsRequest)
      com.heroiclabs.nakama.api.WriteStorageObjectsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_WriteStorageObjectsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_WriteStorageObjectsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.WriteStorageObjectsRequest.class, com.heroiclabs.nakama.api.WriteStorageObjectsRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.WriteStorageObjectsRequest.newBuilder()
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
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
      } else {
        objects_ = null;
        objectsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_WriteStorageObjectsRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.WriteStorageObjectsRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.WriteStorageObjectsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.WriteStorageObjectsRequest build() {
      com.heroiclabs.nakama.api.WriteStorageObjectsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.WriteStorageObjectsRequest buildPartial() {
      com.heroiclabs.nakama.api.WriteStorageObjectsRequest result = new com.heroiclabs.nakama.api.WriteStorageObjectsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.heroiclabs.nakama.api.WriteStorageObjectsRequest result) {
      if (objectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objects_ = objects_;
      } else {
        result.objects_ = objectsBuilder_.build();
      }
    }

    private void buildPartial0(com.heroiclabs.nakama.api.WriteStorageObjectsRequest result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.WriteStorageObjectsRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.WriteStorageObjectsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.WriteStorageObjectsRequest other) {
      if (other == com.heroiclabs.nakama.api.WriteStorageObjectsRequest.getDefaultInstance()) return this;
      if (objectsBuilder_ == null) {
        if (!other.objects_.isEmpty()) {
          if (objects_.isEmpty()) {
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjectsIsMutable();
            objects_.addAll(other.objects_);
          }
          onChanged();
        }
      } else {
        if (!other.objects_.isEmpty()) {
          if (objectsBuilder_.isEmpty()) {
            objectsBuilder_.dispose();
            objectsBuilder_ = null;
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            objectsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getObjectsFieldBuilder() : null;
          } else {
            objectsBuilder_.addAllMessages(other.objects_);
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
              com.heroiclabs.nakama.api.WriteStorageObject m =
                  input.readMessage(
                      com.heroiclabs.nakama.api.WriteStorageObject.parser(),
                      extensionRegistry);
              if (objectsBuilder_ == null) {
                ensureObjectsIsMutable();
                objects_.add(m);
              } else {
                objectsBuilder_.addMessage(m);
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

    private java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> objects_ =
      java.util.Collections.emptyList();
    private void ensureObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        objects_ = new java.util.ArrayList<com.heroiclabs.nakama.api.WriteStorageObject>(objects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.WriteStorageObject, com.heroiclabs.nakama.api.WriteStorageObject.Builder, com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder> objectsBuilder_;

    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> getObjectsList() {
      if (objectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objects_);
      } else {
        return objectsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public int getObjectsCount() {
      if (objectsBuilder_ == null) {
        return objects_.size();
      } else {
        return objectsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObject getObjects(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.set(index, value);
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(com.heroiclabs.nakama.api.WriteStorageObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(index, value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.WriteStorageObject> values) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objects_);
        onChanged();
      } else {
        objectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder clearObjects() {
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public Builder removeObjects(int index) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.remove(index);
        onChanged();
      } else {
        objectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObject.Builder getObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder getObjectsOrBuilder(
        int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);  } else {
        return objectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<? extends com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder> 
         getObjectsOrBuilderList() {
      if (objectsBuilder_ != null) {
        return objectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objects_);
      }
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObject.Builder addObjectsBuilder() {
      return getObjectsFieldBuilder().addBuilder(
          com.heroiclabs.nakama.api.WriteStorageObject.getDefaultInstance());
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObject.Builder addObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().addBuilder(
          index, com.heroiclabs.nakama.api.WriteStorageObject.getDefaultInstance());
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.WriteStorageObject.Builder> 
         getObjectsBuilderList() {
      return getObjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.WriteStorageObject, com.heroiclabs.nakama.api.WriteStorageObject.Builder, com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder> 
        getObjectsFieldBuilder() {
      if (objectsBuilder_ == null) {
        objectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.heroiclabs.nakama.api.WriteStorageObject, com.heroiclabs.nakama.api.WriteStorageObject.Builder, com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder>(
                objects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        objects_ = null;
      }
      return objectsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.WriteStorageObjectsRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.WriteStorageObjectsRequest)
  private static final com.heroiclabs.nakama.api.WriteStorageObjectsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.WriteStorageObjectsRequest();
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteStorageObjectsRequest>
      PARSER = new com.google.protobuf.AbstractParser<WriteStorageObjectsRequest>() {
    @java.lang.Override
    public WriteStorageObjectsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteStorageObjectsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteStorageObjectsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.WriteStorageObjectsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

