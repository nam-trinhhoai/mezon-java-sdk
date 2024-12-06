// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface AuthenticateAppleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AuthenticateAppleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Apple account details.
   * </pre>
   *
   * <code>.nakama.api.AccountApple account = 1 [json_name = "account"];</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <pre>
   * The Apple account details.
   * </pre>
   *
   * <code>.nakama.api.AccountApple account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  com.heroiclabs.nakama.api.AccountApple getAccount();
  /**
   * <pre>
   * The Apple account details.
   * </pre>
   *
   * <code>.nakama.api.AccountApple account = 1 [json_name = "account"];</code>
   */
  com.heroiclabs.nakama.api.AccountAppleOrBuilder getAccountOrBuilder();

  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   * @return The create.
   */
  com.google.protobuf.BoolValue getCreate();
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue create = 2 [json_name = "create"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>string username = 3 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
