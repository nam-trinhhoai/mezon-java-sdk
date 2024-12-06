// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protoc-gen-openapiv2/options/openapiv2.proto
// Protobuf Java Version: 4.28.2

package com.grpc.gateway.protoc_gen_openapiv2.options;

/**
 * <pre>
 * Scheme describes the schemes supported by the OpenAPI Swagger
 * and Operation objects.
 * </pre>
 *
 * Protobuf enum {@code grpc.gateway.protoc_gen_openapiv2.options.Scheme}
 */
public enum Scheme
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>HTTP = 1;</code>
   */
  HTTP(1),
  /**
   * <code>HTTPS = 2;</code>
   */
  HTTPS(2),
  /**
   * <code>WS = 3;</code>
   */
  WS(3),
  /**
   * <code>WSS = 4;</code>
   */
  WSS(4),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Scheme.class.getName());
  }
  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>HTTP = 1;</code>
   */
  public static final int HTTP_VALUE = 1;
  /**
   * <code>HTTPS = 2;</code>
   */
  public static final int HTTPS_VALUE = 2;
  /**
   * <code>WS = 3;</code>
   */
  public static final int WS_VALUE = 3;
  /**
   * <code>WSS = 4;</code>
   */
  public static final int WSS_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Scheme valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Scheme forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return HTTP;
      case 2: return HTTPS;
      case 3: return WS;
      case 4: return WSS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Scheme>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Scheme> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Scheme>() {
          public Scheme findValueByNumber(int number) {
            return Scheme.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Scheme[] VALUES = values();

  public static Scheme valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Scheme(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc.gateway.protoc_gen_openapiv2.options.Scheme)
}

