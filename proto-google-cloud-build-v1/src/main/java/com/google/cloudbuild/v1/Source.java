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
 * Location of the source in a supported storage service.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.Source}
 */
public final class Source extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.Source)
    SourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Source.newBuilder() to construct.
  private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Source() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Source();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Source(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 18:
            {
              com.google.cloudbuild.v1.StorageSource.Builder subBuilder = null;
              if (sourceCase_ == 2) {
                subBuilder = ((com.google.cloudbuild.v1.StorageSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloudbuild.v1.StorageSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloudbuild.v1.StorageSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 2;
              break;
            }
          case 26:
            {
              com.google.cloudbuild.v1.RepoSource.Builder subBuilder = null;
              if (sourceCase_ == 3) {
                subBuilder = ((com.google.cloudbuild.v1.RepoSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloudbuild.v1.RepoSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloudbuild.v1.RepoSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 3;
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
        .internal_static_google_devtools_cloudbuild_v1_Source_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_Source_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.Source.class, com.google.cloudbuild.v1.Source.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STORAGE_SOURCE(2),
    REPO_SOURCE(3),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2:
          return STORAGE_SOURCE;
        case 3:
          return REPO_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int STORAGE_SOURCE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
   *
   * @return Whether the storageSource field is set.
   */
  public boolean hasStorageSource() {
    return sourceCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
   *
   * @return The storageSource.
   */
  public com.google.cloudbuild.v1.StorageSource getStorageSource() {
    if (sourceCase_ == 2) {
      return (com.google.cloudbuild.v1.StorageSource) source_;
    }
    return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
   */
  public com.google.cloudbuild.v1.StorageSourceOrBuilder getStorageSourceOrBuilder() {
    if (sourceCase_ == 2) {
      return (com.google.cloudbuild.v1.StorageSource) source_;
    }
    return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
  }

  public static final int REPO_SOURCE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
   *
   * @return Whether the repoSource field is set.
   */
  public boolean hasRepoSource() {
    return sourceCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
   *
   * @return The repoSource.
   */
  public com.google.cloudbuild.v1.RepoSource getRepoSource() {
    if (sourceCase_ == 3) {
      return (com.google.cloudbuild.v1.RepoSource) source_;
    }
    return com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
   */
  public com.google.cloudbuild.v1.RepoSourceOrBuilder getRepoSourceOrBuilder() {
    if (sourceCase_ == 3) {
      return (com.google.cloudbuild.v1.RepoSource) source_;
    }
    return com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
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
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloudbuild.v1.StorageSource) source_);
    }
    if (sourceCase_ == 3) {
      output.writeMessage(3, (com.google.cloudbuild.v1.RepoSource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloudbuild.v1.StorageSource) source_);
    }
    if (sourceCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloudbuild.v1.RepoSource) source_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.Source)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.Source other = (com.google.cloudbuild.v1.Source) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 2:
        if (!getStorageSource().equals(other.getStorageSource())) return false;
        break;
      case 3:
        if (!getRepoSource().equals(other.getRepoSource())) return false;
        break;
      case 0:
      default:
    }
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
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + STORAGE_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getStorageSource().hashCode();
        break;
      case 3:
        hash = (37 * hash) + REPO_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getRepoSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.Source parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Source parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Source parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.Source parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.Source prototype) {
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
   * Location of the source in a supported storage service.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.Source}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.Source)
      com.google.cloudbuild.v1.SourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Source_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Source_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.Source.class, com.google.cloudbuild.v1.Source.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.Source.newBuilder()
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
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_Source_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Source getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.Source.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Source build() {
      com.google.cloudbuild.v1.Source result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.Source buildPartial() {
      com.google.cloudbuild.v1.Source result = new com.google.cloudbuild.v1.Source(this);
      if (sourceCase_ == 2) {
        if (storageSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = storageSourceBuilder_.build();
        }
      }
      if (sourceCase_ == 3) {
        if (repoSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = repoSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloudbuild.v1.Source) {
        return mergeFrom((com.google.cloudbuild.v1.Source) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.Source other) {
      if (other == com.google.cloudbuild.v1.Source.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case STORAGE_SOURCE:
          {
            mergeStorageSource(other.getStorageSource());
            break;
          }
        case REPO_SOURCE:
          {
            mergeRepoSource(other.getRepoSource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
      }
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
      com.google.cloudbuild.v1.Source parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.Source) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.StorageSource,
            com.google.cloudbuild.v1.StorageSource.Builder,
            com.google.cloudbuild.v1.StorageSourceOrBuilder>
        storageSourceBuilder_;
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     *
     * @return Whether the storageSource field is set.
     */
    public boolean hasStorageSource() {
      return sourceCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     *
     * @return The storageSource.
     */
    public com.google.cloudbuild.v1.StorageSource getStorageSource() {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloudbuild.v1.StorageSource) source_;
        }
        return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return storageSourceBuilder_.getMessage();
        }
        return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(com.google.cloudbuild.v1.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(
        com.google.cloudbuild.v1.StorageSource.Builder builderForValue) {
      if (storageSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public Builder mergeStorageSource(com.google.cloudbuild.v1.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 2
            && source_ != com.google.cloudbuild.v1.StorageSource.getDefaultInstance()) {
          source_ =
              com.google.cloudbuild.v1.StorageSource.newBuilder(
                      (com.google.cloudbuild.v1.StorageSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          storageSourceBuilder_.mergeFrom(value);
        }
        storageSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public Builder clearStorageSource() {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        storageSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public com.google.cloudbuild.v1.StorageSource.Builder getStorageSourceBuilder() {
      return getStorageSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    public com.google.cloudbuild.v1.StorageSourceOrBuilder getStorageSourceOrBuilder() {
      if ((sourceCase_ == 2) && (storageSourceBuilder_ != null)) {
        return storageSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloudbuild.v1.StorageSource) source_;
        }
        return com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.StorageSource,
            com.google.cloudbuild.v1.StorageSource.Builder,
            com.google.cloudbuild.v1.StorageSourceOrBuilder>
        getStorageSourceFieldBuilder() {
      if (storageSourceBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloudbuild.v1.StorageSource.getDefaultInstance();
        }
        storageSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.StorageSource,
                com.google.cloudbuild.v1.StorageSource.Builder,
                com.google.cloudbuild.v1.StorageSourceOrBuilder>(
                (com.google.cloudbuild.v1.StorageSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      ;
      return storageSourceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.RepoSource,
            com.google.cloudbuild.v1.RepoSource.Builder,
            com.google.cloudbuild.v1.RepoSourceOrBuilder>
        repoSourceBuilder_;
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     *
     * @return Whether the repoSource field is set.
     */
    public boolean hasRepoSource() {
      return sourceCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     *
     * @return The repoSource.
     */
    public com.google.cloudbuild.v1.RepoSource getRepoSource() {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          return (com.google.cloudbuild.v1.RepoSource) source_;
        }
        return com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 3) {
          return repoSourceBuilder_.getMessage();
        }
        return com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public Builder setRepoSource(com.google.cloudbuild.v1.RepoSource value) {
      if (repoSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        repoSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public Builder setRepoSource(com.google.cloudbuild.v1.RepoSource.Builder builderForValue) {
      if (repoSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        repoSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public Builder mergeRepoSource(com.google.cloudbuild.v1.RepoSource value) {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 3
            && source_ != com.google.cloudbuild.v1.RepoSource.getDefaultInstance()) {
          source_ =
              com.google.cloudbuild.v1.RepoSource.newBuilder(
                      (com.google.cloudbuild.v1.RepoSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 3) {
          repoSourceBuilder_.mergeFrom(value);
        }
        repoSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public Builder clearRepoSource() {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
        }
        repoSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public com.google.cloudbuild.v1.RepoSource.Builder getRepoSourceBuilder() {
      return getRepoSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    public com.google.cloudbuild.v1.RepoSourceOrBuilder getRepoSourceOrBuilder() {
      if ((sourceCase_ == 3) && (repoSourceBuilder_ != null)) {
        return repoSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 3) {
          return (com.google.cloudbuild.v1.RepoSource) source_;
        }
        return com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.RepoSource,
            com.google.cloudbuild.v1.RepoSource.Builder,
            com.google.cloudbuild.v1.RepoSourceOrBuilder>
        getRepoSourceFieldBuilder() {
      if (repoSourceBuilder_ == null) {
        if (!(sourceCase_ == 3)) {
          source_ = com.google.cloudbuild.v1.RepoSource.getDefaultInstance();
        }
        repoSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.RepoSource,
                com.google.cloudbuild.v1.RepoSource.Builder,
                com.google.cloudbuild.v1.RepoSourceOrBuilder>(
                (com.google.cloudbuild.v1.RepoSource) source_, getParentForChildren(), isClean());
        source_ = null;
      }
      sourceCase_ = 3;
      onChanged();
      ;
      return repoSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.Source)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.Source)
  private static final com.google.cloudbuild.v1.Source DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.Source();
  }

  public static com.google.cloudbuild.v1.Source getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Source> PARSER =
      new com.google.protobuf.AbstractParser<Source>() {
        @java.lang.Override
        public Source parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Source(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Source> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Source> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.Source getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
