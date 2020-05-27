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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Pairs a set of secret environment variables containing encrypted
 * values with the Cloud KMS key to use to decrypt the value.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.Secret}
 */
public final class Secret extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.Secret)
    SecretOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Secret.newBuilder() to construct.
  private Secret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Secret() {
    kmsKeyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Secret();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Secret(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              kmsKeyName_ = s;
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                secretEnv_ =
                    com.google.protobuf.MapField.newMapField(
                        SecretEnvDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
                  secretEnv__ =
                      input.readMessage(
                          SecretEnvDefaultEntryHolder.defaultEntry.getParserForType(),
                          extensionRegistry);
              secretEnv_.getMutableMap().put(secretEnv__.getKey(), secretEnv__.getValue());
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_Secret_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetSecretEnv();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_Secret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.Secret.class, com.google.cloudbuild.v1.Secret.Builder.class);
  }

  public static final int KMS_KEY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object kmsKeyName_;
  /**
   *
   *
   * <pre>
   * Cloud KMS key name to use to decrypt these envs.
   * </pre>
   *
   * <code>string kms_key_name = 1;</code>
   *
   * @return The kmsKeyName.
   */
  @java.lang.Override
  public java.lang.String getKmsKeyName() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKeyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud KMS key name to use to decrypt these envs.
   * </pre>
   *
   * <code>string kms_key_name = 1;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKmsKeyNameBytes() {
    java.lang.Object ref = kmsKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kmsKeyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_ENV_FIELD_NUMBER = 3;

  private static final class SecretEnvDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                    com.google.cloudbuild.v1.Cloudbuild
                        .internal_static_google_devtools_cloudbuild_v1_Secret_SecretEnvEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.BYTES,
                    com.google.protobuf.ByteString.EMPTY);
  }

  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString> secretEnv_;

  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
      internalGetSecretEnv() {
    if (secretEnv_ == null) {
      return com.google.protobuf.MapField.emptyMapField(SecretEnvDefaultEntryHolder.defaultEntry);
    }
    return secretEnv_;
  }

  public int getSecretEnvCount() {
    return internalGetSecretEnv().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
   */
  @java.lang.Override
  public boolean containsSecretEnv(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetSecretEnv().getMap().containsKey(key);
  }
  /** Use {@link #getSecretEnvMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getSecretEnv() {
    return getSecretEnvMap();
  }
  /**
   *
   *
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getSecretEnvMap() {
    return internalGetSecretEnv().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretEnvOrDefault(
      java.lang.String key, com.google.protobuf.ByteString defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetSecretEnv().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretEnvOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetSecretEnv().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getKmsKeyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kmsKeyName_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetSecretEnv(), SecretEnvDefaultEntryHolder.defaultEntry, 3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKmsKeyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kmsKeyName_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ByteString> entry :
        internalGetSecretEnv().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString> secretEnv__ =
          SecretEnvDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, secretEnv__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloudbuild.v1.Secret)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.Secret other = (com.google.cloudbuild.v1.Secret) obj;

    if (!getKmsKeyName().equals(other.getKmsKeyName())) return false;
    if (!internalGetSecretEnv().equals(other.internalGetSecretEnv())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKeyName().hashCode();
    if (!internalGetSecretEnv().getMap().isEmpty()) {
      hash = (37 * hash) + SECRET_ENV_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecretEnv().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Secret parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Secret parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Secret parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloudbuild.v1.Secret prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Pairs a set of secret environment variables containing encrypted
   * values with the Cloud KMS key to use to decrypt the value.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.Secret}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.Secret)
      com.google.cloudbuild.v1.SecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Secret_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetSecretEnv();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableSecretEnv();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Secret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.Secret.class, com.google.cloudbuild.v1.Secret.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.Secret.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      kmsKeyName_ = "";

      internalGetMutableSecretEnv().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Secret_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Secret getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.Secret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Secret build() {
      com.google.cloudbuild.v1.Secret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Secret buildPartial() {
      com.google.cloudbuild.v1.Secret result = new com.google.cloudbuild.v1.Secret(this);
      int from_bitField0_ = bitField0_;
      result.kmsKeyName_ = kmsKeyName_;
      result.secretEnv_ = internalGetSecretEnv();
      result.secretEnv_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloudbuild.v1.Secret) {
        return mergeFrom((com.google.cloudbuild.v1.Secret) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.Secret other) {
      if (other == com.google.cloudbuild.v1.Secret.getDefaultInstance()) return this;
      if (!other.getKmsKeyName().isEmpty()) {
        kmsKeyName_ = other.kmsKeyName_;
        onChanged();
      }
      internalGetMutableSecretEnv().mergeFrom(other.internalGetSecretEnv());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloudbuild.v1.Secret parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.Secret) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object kmsKeyName_ = "";
    /**
     *
     *
     * <pre>
     * Cloud KMS key name to use to decrypt these envs.
     * </pre>
     *
     * <code>string kms_key_name = 1;</code>
     *
     * @return The kmsKeyName.
     */
    public java.lang.String getKmsKeyName() {
      java.lang.Object ref = kmsKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud KMS key name to use to decrypt these envs.
     * </pre>
     *
     * <code>string kms_key_name = 1;</code>
     *
     * @return The bytes for kmsKeyName.
     */
    public com.google.protobuf.ByteString getKmsKeyNameBytes() {
      java.lang.Object ref = kmsKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kmsKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud KMS key name to use to decrypt these envs.
     * </pre>
     *
     * <code>string kms_key_name = 1;</code>
     *
     * @param value The kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      kmsKeyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud KMS key name to use to decrypt these envs.
     * </pre>
     *
     * <code>string kms_key_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyName() {

      kmsKeyName_ = getDefaultInstance().getKmsKeyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud KMS key name to use to decrypt these envs.
     * </pre>
     *
     * <code>string kms_key_name = 1;</code>
     *
     * @param value The bytes for kmsKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      kmsKeyName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
        secretEnv_;

    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
        internalGetSecretEnv() {
      if (secretEnv_ == null) {
        return com.google.protobuf.MapField.emptyMapField(SecretEnvDefaultEntryHolder.defaultEntry);
      }
      return secretEnv_;
    }

    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
        internalGetMutableSecretEnv() {
      onChanged();
      ;
      if (secretEnv_ == null) {
        secretEnv_ =
            com.google.protobuf.MapField.newMapField(SecretEnvDefaultEntryHolder.defaultEntry);
      }
      if (!secretEnv_.isMutable()) {
        secretEnv_ = secretEnv_.copy();
      }
      return secretEnv_;
    }

    public int getSecretEnvCount() {
      return internalGetSecretEnv().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    @java.lang.Override
    public boolean containsSecretEnv(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetSecretEnv().getMap().containsKey(key);
    }
    /** Use {@link #getSecretEnvMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getSecretEnv() {
      return getSecretEnvMap();
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getSecretEnvMap() {
      return internalGetSecretEnv().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSecretEnvOrDefault(
        java.lang.String key, com.google.protobuf.ByteString defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetSecretEnv().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSecretEnvOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetSecretEnv().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSecretEnv() {
      internalGetMutableSecretEnv().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    public Builder removeSecretEnv(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableSecretEnv().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getMutableSecretEnv() {
      return internalGetMutableSecretEnv().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    public Builder putSecretEnv(java.lang.String key, com.google.protobuf.ByteString value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableSecretEnv().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; secret_env = 3;</code>
     */
    public Builder putAllSecretEnv(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      internalGetMutableSecretEnv().getMutableMap().putAll(values);
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.Secret)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.Secret)
  private static final com.google.cloudbuild.v1.Secret DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.Secret();
  }

  public static com.google.cloudbuild.v1.Secret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Secret> PARSER =
      new com.google.protobuf.AbstractParser<Secret>() {
        @java.lang.Override
        public Secret parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Secret(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Secret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Secret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.Secret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
