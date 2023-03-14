// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package com.google.cloudbuild.v2;

public interface ServiceDirectoryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.ServiceDirectoryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Service Directory service name.
   * Format:
   * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Required. The Service Directory service name.
   * Format:
   * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();
}
