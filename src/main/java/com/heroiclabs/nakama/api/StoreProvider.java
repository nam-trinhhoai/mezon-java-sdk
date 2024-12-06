// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Validation Provider,
 * </pre>
 *
 * Protobuf enum {@code nakama.api.StoreProvider}
 */
public enum StoreProvider
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Apple App Store
   * </pre>
   *
   * <code>APPLE_APP_STORE = 0;</code>
   */
  APPLE_APP_STORE(0),
  /**
   * <pre>
   * Google Play Store
   * </pre>
   *
   * <code>GOOGLE_PLAY_STORE = 1;</code>
   */
  GOOGLE_PLAY_STORE(1),
  /**
   * <pre>
   * Huawei App Gallery
   * </pre>
   *
   * <code>HUAWEI_APP_GALLERY = 2;</code>
   */
  HUAWEI_APP_GALLERY(2),
  /**
   * <pre>
   * Facebook Instant Store
   * </pre>
   *
   * <code>FACEBOOK_INSTANT_STORE = 3;</code>
   */
  FACEBOOK_INSTANT_STORE(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      StoreProvider.class.getName());
  }
  /**
   * <pre>
   * Apple App Store
   * </pre>
   *
   * <code>APPLE_APP_STORE = 0;</code>
   */
  public static final int APPLE_APP_STORE_VALUE = 0;
  /**
   * <pre>
   * Google Play Store
   * </pre>
   *
   * <code>GOOGLE_PLAY_STORE = 1;</code>
   */
  public static final int GOOGLE_PLAY_STORE_VALUE = 1;
  /**
   * <pre>
   * Huawei App Gallery
   * </pre>
   *
   * <code>HUAWEI_APP_GALLERY = 2;</code>
   */
  public static final int HUAWEI_APP_GALLERY_VALUE = 2;
  /**
   * <pre>
   * Facebook Instant Store
   * </pre>
   *
   * <code>FACEBOOK_INSTANT_STORE = 3;</code>
   */
  public static final int FACEBOOK_INSTANT_STORE_VALUE = 3;


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
  public static StoreProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StoreProvider forNumber(int value) {
    switch (value) {
      case 0: return APPLE_APP_STORE;
      case 1: return GOOGLE_PLAY_STORE;
      case 2: return HUAWEI_APP_GALLERY;
      case 3: return FACEBOOK_INSTANT_STORE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StoreProvider>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StoreProvider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StoreProvider>() {
          public StoreProvider findValueByNumber(int number) {
            return StoreProvider.forNumber(number);
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
    return com.heroiclabs.nakama.api.ApiProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final StoreProvider[] VALUES = values();

  public static StoreProvider valueOf(
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

  private StoreProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:nakama.api.StoreProvider)
}

