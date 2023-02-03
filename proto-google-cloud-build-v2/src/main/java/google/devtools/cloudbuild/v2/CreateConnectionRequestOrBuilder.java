/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

public interface CreateConnectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.CreateConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project and location where the connection will be created.
   * Format: `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Project and location where the connection will be created.
   * Format: `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The Connection to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connection field is set.
   */
  boolean hasConnection();
  /**
   *
   *
   * <pre>
   * Required. The Connection to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connection.
   */
  google.devtools.cloudbuild.v2.Connection getConnection();
  /**
   *
   *
   * <pre>
   * Required. The Connection to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.devtools.cloudbuild.v2.ConnectionOrBuilder getConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the Connection, which will become the final
   * component of the Connection's resource name. Names must be unique
   * per-project per-location. Allows alphanumeric characters and any of
   * -._~%!$&amp;'()*+,;=&#64;.
   * </pre>
   *
   * <code>string connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the Connection, which will become the final
   * component of the Connection's resource name. Names must be unique
   * per-project per-location. Allows alphanumeric characters and any of
   * -._~%!$&amp;'()*+,;=&#64;.
   * </pre>
   *
   * <code>string connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString getConnectionIdBytes();
}