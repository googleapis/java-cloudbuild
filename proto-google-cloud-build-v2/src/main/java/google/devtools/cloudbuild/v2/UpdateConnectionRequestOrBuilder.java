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

public interface UpdateConnectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.UpdateConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Connection to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connection field is set.
   */
  boolean hasConnection();
  /**
   *
   *
   * <pre>
   * Required. The Connection to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connection.
   */
  google.devtools.cloudbuild.v2.Connection getConnection();
  /**
   *
   *
   * <pre>
   * Required. The Connection to update.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Connection connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.devtools.cloudbuild.v2.ConnectionOrBuilder getConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the connection is not found a new connection
   * will be created. In this situation `update_mask` is ignored.
   * The creation will succeed only if the input connection has all the
   * necessary information (e.g a github_config with both  user_oauth_token and
   * installation_id properties).
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * The current etag of the connection.
   * If an etag is provided and does not match the current etag of the
   * connection, update will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 4;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The current etag of the connection.
   * If an etag is provided and does not match the current etag of the
   * connection, update will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 4;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}