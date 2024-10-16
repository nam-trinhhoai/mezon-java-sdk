// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface GetExperimentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.GetExperimentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Experiment names; if empty string all experiments are returned.
   * </pre>
   *
   * <code>repeated string names = 1 [json_name = "names"];</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * Experiment names; if empty string all experiments are returned.
   * </pre>
   *
   * <code>repeated string names = 1 [json_name = "names"];</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <pre>
   * Experiment names; if empty string all experiments are returned.
   * </pre>
   *
   * <code>repeated string names = 1 [json_name = "names"];</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * Experiment names; if empty string all experiments are returned.
   * </pre>
   *
   * <code>repeated string names = 1 [json_name = "names"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}
