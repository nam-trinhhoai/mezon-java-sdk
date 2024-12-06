// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface AccountAppleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountApple)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID token received from Apple to validate.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * The ID token received from Apple to validate.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  int getVarsCount();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
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
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVarsMap();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
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
   * <code>map&lt;string, string&gt; vars = 2 [json_name = "vars"];</code>
   */
  java.lang.String getVarsOrThrow(
      java.lang.String key);
}
