// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protoc-gen-openapiv2/options/openapiv2.proto
// Protobuf Java Version: 4.28.2

package com.grpc.gateway.protoc_gen_openapiv2.options;

public interface SecuritySchemeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the security scheme. Valid values are "basic",
   * "apiKey" or "oauth2".
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Type type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the security scheme. Valid values are "basic",
   * "apiKey" or "oauth2".
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Type type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Type getType();

  /**
   * <pre>
   * A short description for security scheme.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A short description for security scheme.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The name of the header or query parameter to be used.
   * Valid for apiKey.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the header or query parameter to be used.
   * Valid for apiKey.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The location of the API key. Valid values are "query" or
   * "header".
   * Valid for apiKey.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.In in = 4 [json_name = "in"];</code>
   * @return The enum numeric value on the wire for in.
   */
  int getInValue();
  /**
   * <pre>
   * The location of the API key. Valid values are "query" or
   * "header".
   * Valid for apiKey.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.In in = 4 [json_name = "in"];</code>
   * @return The in.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.In getIn();

  /**
   * <pre>
   * The flow used by the OAuth2 security scheme. Valid values are
   * "implicit", "password", "application" or "accessCode".
   * Valid for oauth2.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Flow flow = 5 [json_name = "flow"];</code>
   * @return The enum numeric value on the wire for flow.
   */
  int getFlowValue();
  /**
   * <pre>
   * The flow used by the OAuth2 security scheme. Valid values are
   * "implicit", "password", "application" or "accessCode".
   * Valid for oauth2.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Flow flow = 5 [json_name = "flow"];</code>
   * @return The flow.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.Flow getFlow();

  /**
   * <pre>
   * The authorization URL to be used for this flow. This SHOULD be in
   * the form of a URL.
   * Valid for oauth2/implicit and oauth2/accessCode.
   * </pre>
   *
   * <code>string authorization_url = 6 [json_name = "authorizationUrl"];</code>
   * @return The authorizationUrl.
   */
  java.lang.String getAuthorizationUrl();
  /**
   * <pre>
   * The authorization URL to be used for this flow. This SHOULD be in
   * the form of a URL.
   * Valid for oauth2/implicit and oauth2/accessCode.
   * </pre>
   *
   * <code>string authorization_url = 6 [json_name = "authorizationUrl"];</code>
   * @return The bytes for authorizationUrl.
   */
  com.google.protobuf.ByteString
      getAuthorizationUrlBytes();

  /**
   * <pre>
   * The token URL to be used for this flow. This SHOULD be in the
   * form of a URL.
   * Valid for oauth2/password, oauth2/application and oauth2/accessCode.
   * </pre>
   *
   * <code>string token_url = 7 [json_name = "tokenUrl"];</code>
   * @return The tokenUrl.
   */
  java.lang.String getTokenUrl();
  /**
   * <pre>
   * The token URL to be used for this flow. This SHOULD be in the
   * form of a URL.
   * Valid for oauth2/password, oauth2/application and oauth2/accessCode.
   * </pre>
   *
   * <code>string token_url = 7 [json_name = "tokenUrl"];</code>
   * @return The bytes for tokenUrl.
   */
  com.google.protobuf.ByteString
      getTokenUrlBytes();

  /**
   * <pre>
   * The available scopes for the OAuth2 security scheme.
   * Valid for oauth2.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Scopes scopes = 8 [json_name = "scopes"];</code>
   * @return Whether the scopes field is set.
   */
  boolean hasScopes();
  /**
   * <pre>
   * The available scopes for the OAuth2 security scheme.
   * Valid for oauth2.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Scopes scopes = 8 [json_name = "scopes"];</code>
   * @return The scopes.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Scopes getScopes();
  /**
   * <pre>
   * The available scopes for the OAuth2 security scheme.
   * Valid for oauth2.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Scopes scopes = 8 [json_name = "scopes"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ScopesOrBuilder getScopesOrBuilder();

  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 9 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 9 [json_name = "extensions"];</code>
   */
  boolean containsExtensions(
      java.lang.String key);
  /**
   * Use {@link #getExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensions();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 9 [json_name = "extensions"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensionsMap();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 9 [json_name = "extensions"];</code>
   */
  /* nullable */
com.google.protobuf.Value getExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 9 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Value getExtensionsOrThrow(
      java.lang.String key);
}
