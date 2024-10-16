// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface SessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token credential.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Token credential.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();

  /**
   * <pre>
   * Properties associated with this identity.
   * </pre>
   *
   * <code>.satori.api.Properties properties = 3 [json_name = "properties"];</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <pre>
   * Properties associated with this identity.
   * </pre>
   *
   * <code>.satori.api.Properties properties = 3 [json_name = "properties"];</code>
   * @return The properties.
   */
  com.heroiclabs.satori.api.Properties getProperties();
  /**
   * <pre>
   * Properties associated with this identity.
   * </pre>
   *
   * <code>.satori.api.Properties properties = 3 [json_name = "properties"];</code>
   */
  com.heroiclabs.satori.api.PropertiesOrBuilder getPropertiesOrBuilder();
}
