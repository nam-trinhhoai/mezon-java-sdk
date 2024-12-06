// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface SessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * True if the corresponding account was just created, false otherwise.
   * </pre>
   *
   * <code>bool created = 1 [json_name = "created"];</code>
   * @return The created.
   */
  boolean getCreated();

  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * Refresh token that can be used for session token renewal.
   * </pre>
   *
   * <code>string refresh_token = 3 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <pre>
   * Refresh token that can be used for session token renewal.
   * </pre>
   *
   * <code>string refresh_token = 3 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();
}
