// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface ExperimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.Experiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Experiment name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Experiment name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Value associated with this Experiment.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value associated with this Experiment.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
