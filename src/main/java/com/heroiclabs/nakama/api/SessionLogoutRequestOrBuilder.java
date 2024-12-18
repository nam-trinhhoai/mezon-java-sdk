// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface SessionLogoutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.SessionLogoutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Session token to log out.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Session token to log out.
   * </pre>
   *
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * Refresh token to invalidate.
   * </pre>
   *
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <pre>
   * Refresh token to invalidate.
   * </pre>
   *
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();
}
