// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface AccountGameCenterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountGameCenter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>string bundle_id = 2 [json_name = "bundleId"];</code>
   * @return The bundleId.
   */
  java.lang.String getBundleId();
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>string bundle_id = 2 [json_name = "bundleId"];</code>
   * @return The bytes for bundleId.
   */
  com.google.protobuf.ByteString
      getBundleIdBytes();

  /**
   * <pre>
   * Time since UNIX epoch when the signature was created.
   * </pre>
   *
   * <code>int64 timestamp_seconds = 3 [json_name = "timestampSeconds"];</code>
   * @return The timestampSeconds.
   */
  long getTimestampSeconds();

  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>string salt = 4 [json_name = "salt"];</code>
   * @return The salt.
   */
  java.lang.String getSalt();
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>string salt = 4 [json_name = "salt"];</code>
   * @return The bytes for salt.
   */
  com.google.protobuf.ByteString
      getSaltBytes();

  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>string signature = 5 [json_name = "signature"];</code>
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>string signature = 5 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>string public_key_url = 6 [json_name = "publicKeyUrl"];</code>
   * @return The publicKeyUrl.
   */
  java.lang.String getPublicKeyUrl();
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>string public_key_url = 6 [json_name = "publicKeyUrl"];</code>
   * @return The bytes for publicKeyUrl.
   */
  com.google.protobuf.ByteString
      getPublicKeyUrlBytes();

  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 7 [json_name = "vars"];</code>
   */
  int getVarsCount();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 7 [json_name = "vars"];</code>
   */
  boolean containsVars(
      java.lang.String key);
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVars();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 7 [json_name = "vars"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVarsMap();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 7 [json_name = "vars"];</code>
   */
  /* nullable */
java.lang.String getVarsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 7 [json_name = "vars"];</code>
   */
  java.lang.String getVarsOrThrow(
      java.lang.String key);
}
