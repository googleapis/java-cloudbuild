// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

public interface DeleteRepositoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.DeleteRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Repository to delete.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the Repository to delete.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The current etag of the repository.
   * If an etag is provided and does not match the current etag of the
   * repository, deletion will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * The current etag of the repository.
   * If an etag is provided and does not match the current etag of the
   * repository, deletion will be blocked and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * If set, validate the request, but do not actually post it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
