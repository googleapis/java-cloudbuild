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
package com.google.cloudbuild.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Creates and manages builds on Google Cloud Platform.
 * The main concept used by this API is a `Build`, which describes the location
 * of the source to build, how to build the source, and where to store the
 * built artifacts, if any.
 * A user can list previously-requested builds or get builds by their ID to
 * determine the status of the build.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/devtools/cloudbuild/v1/cloudbuild.proto")
public final class CloudBuildGrpc {

  private CloudBuildGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.cloudbuild.v1.CloudBuild";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CreateBuildRequest, com.google.longrunning.Operation>
      getCreateBuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBuild",
      requestType = com.google.cloudbuild.v1.CreateBuildRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CreateBuildRequest, com.google.longrunning.Operation>
      getCreateBuildMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.CreateBuildRequest, com.google.longrunning.Operation>
        getCreateBuildMethod;
    if ((getCreateBuildMethod = CloudBuildGrpc.getCreateBuildMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getCreateBuildMethod = CloudBuildGrpc.getCreateBuildMethod) == null) {
          CloudBuildGrpc.getCreateBuildMethod =
              getCreateBuildMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.CreateBuildRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBuild"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.CreateBuildRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBuildMethodDescriptorSupplier("CreateBuild"))
                      .build();
        }
      }
    }
    return getCreateBuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.GetBuildRequest, com.google.cloudbuild.v1.Build>
      getGetBuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBuild",
      requestType = com.google.cloudbuild.v1.GetBuildRequest.class,
      responseType = com.google.cloudbuild.v1.Build.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.GetBuildRequest, com.google.cloudbuild.v1.Build>
      getGetBuildMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.GetBuildRequest, com.google.cloudbuild.v1.Build>
        getGetBuildMethod;
    if ((getGetBuildMethod = CloudBuildGrpc.getGetBuildMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getGetBuildMethod = CloudBuildGrpc.getGetBuildMethod) == null) {
          CloudBuildGrpc.getGetBuildMethod =
              getGetBuildMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.GetBuildRequest, com.google.cloudbuild.v1.Build>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBuild"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.GetBuildRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.Build.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBuildMethodDescriptorSupplier("GetBuild"))
                      .build();
        }
      }
    }
    return getGetBuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.ListBuildsRequest, com.google.cloudbuild.v1.ListBuildsResponse>
      getListBuildsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBuilds",
      requestType = com.google.cloudbuild.v1.ListBuildsRequest.class,
      responseType = com.google.cloudbuild.v1.ListBuildsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.ListBuildsRequest, com.google.cloudbuild.v1.ListBuildsResponse>
      getListBuildsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.ListBuildsRequest, com.google.cloudbuild.v1.ListBuildsResponse>
        getListBuildsMethod;
    if ((getListBuildsMethod = CloudBuildGrpc.getListBuildsMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getListBuildsMethod = CloudBuildGrpc.getListBuildsMethod) == null) {
          CloudBuildGrpc.getListBuildsMethod =
              getListBuildsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.ListBuildsRequest,
                          com.google.cloudbuild.v1.ListBuildsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBuilds"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.ListBuildsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.ListBuildsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBuildMethodDescriptorSupplier("ListBuilds"))
                      .build();
        }
      }
    }
    return getListBuildsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CancelBuildRequest, com.google.cloudbuild.v1.Build>
      getCancelBuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBuild",
      requestType = com.google.cloudbuild.v1.CancelBuildRequest.class,
      responseType = com.google.cloudbuild.v1.Build.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CancelBuildRequest, com.google.cloudbuild.v1.Build>
      getCancelBuildMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.CancelBuildRequest, com.google.cloudbuild.v1.Build>
        getCancelBuildMethod;
    if ((getCancelBuildMethod = CloudBuildGrpc.getCancelBuildMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getCancelBuildMethod = CloudBuildGrpc.getCancelBuildMethod) == null) {
          CloudBuildGrpc.getCancelBuildMethod =
              getCancelBuildMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.CancelBuildRequest, com.google.cloudbuild.v1.Build>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBuild"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.CancelBuildRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.Build.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBuildMethodDescriptorSupplier("CancelBuild"))
                      .build();
        }
      }
    }
    return getCancelBuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.RetryBuildRequest, com.google.longrunning.Operation>
      getRetryBuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryBuild",
      requestType = com.google.cloudbuild.v1.RetryBuildRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.RetryBuildRequest, com.google.longrunning.Operation>
      getRetryBuildMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.RetryBuildRequest, com.google.longrunning.Operation>
        getRetryBuildMethod;
    if ((getRetryBuildMethod = CloudBuildGrpc.getRetryBuildMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getRetryBuildMethod = CloudBuildGrpc.getRetryBuildMethod) == null) {
          CloudBuildGrpc.getRetryBuildMethod =
              getRetryBuildMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.RetryBuildRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetryBuild"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.RetryBuildRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBuildMethodDescriptorSupplier("RetryBuild"))
                      .build();
        }
      }
    }
    return getRetryBuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CreateBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getCreateBuildTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBuildTrigger",
      requestType = com.google.cloudbuild.v1.CreateBuildTriggerRequest.class,
      responseType = com.google.cloudbuild.v1.BuildTrigger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.CreateBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getCreateBuildTriggerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.CreateBuildTriggerRequest,
            com.google.cloudbuild.v1.BuildTrigger>
        getCreateBuildTriggerMethod;
    if ((getCreateBuildTriggerMethod = CloudBuildGrpc.getCreateBuildTriggerMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getCreateBuildTriggerMethod = CloudBuildGrpc.getCreateBuildTriggerMethod) == null) {
          CloudBuildGrpc.getCreateBuildTriggerMethod =
              getCreateBuildTriggerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.CreateBuildTriggerRequest,
                          com.google.cloudbuild.v1.BuildTrigger>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBuildTrigger"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.CreateBuildTriggerRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("CreateBuildTrigger"))
                      .build();
        }
      }
    }
    return getCreateBuildTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.GetBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getGetBuildTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBuildTrigger",
      requestType = com.google.cloudbuild.v1.GetBuildTriggerRequest.class,
      responseType = com.google.cloudbuild.v1.BuildTrigger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.GetBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getGetBuildTriggerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.GetBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
        getGetBuildTriggerMethod;
    if ((getGetBuildTriggerMethod = CloudBuildGrpc.getGetBuildTriggerMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getGetBuildTriggerMethod = CloudBuildGrpc.getGetBuildTriggerMethod) == null) {
          CloudBuildGrpc.getGetBuildTriggerMethod =
              getGetBuildTriggerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.GetBuildTriggerRequest,
                          com.google.cloudbuild.v1.BuildTrigger>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBuildTrigger"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.GetBuildTriggerRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("GetBuildTrigger"))
                      .build();
        }
      }
    }
    return getGetBuildTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.ListBuildTriggersRequest,
          com.google.cloudbuild.v1.ListBuildTriggersResponse>
      getListBuildTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBuildTriggers",
      requestType = com.google.cloudbuild.v1.ListBuildTriggersRequest.class,
      responseType = com.google.cloudbuild.v1.ListBuildTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.ListBuildTriggersRequest,
          com.google.cloudbuild.v1.ListBuildTriggersResponse>
      getListBuildTriggersMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.ListBuildTriggersRequest,
            com.google.cloudbuild.v1.ListBuildTriggersResponse>
        getListBuildTriggersMethod;
    if ((getListBuildTriggersMethod = CloudBuildGrpc.getListBuildTriggersMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getListBuildTriggersMethod = CloudBuildGrpc.getListBuildTriggersMethod) == null) {
          CloudBuildGrpc.getListBuildTriggersMethod =
              getListBuildTriggersMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.ListBuildTriggersRequest,
                          com.google.cloudbuild.v1.ListBuildTriggersResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBuildTriggers"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.ListBuildTriggersRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.ListBuildTriggersResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("ListBuildTriggers"))
                      .build();
        }
      }
    }
    return getListBuildTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.DeleteBuildTriggerRequest, com.google.protobuf.Empty>
      getDeleteBuildTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBuildTrigger",
      requestType = com.google.cloudbuild.v1.DeleteBuildTriggerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.DeleteBuildTriggerRequest, com.google.protobuf.Empty>
      getDeleteBuildTriggerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.DeleteBuildTriggerRequest, com.google.protobuf.Empty>
        getDeleteBuildTriggerMethod;
    if ((getDeleteBuildTriggerMethod = CloudBuildGrpc.getDeleteBuildTriggerMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getDeleteBuildTriggerMethod = CloudBuildGrpc.getDeleteBuildTriggerMethod) == null) {
          CloudBuildGrpc.getDeleteBuildTriggerMethod =
              getDeleteBuildTriggerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.DeleteBuildTriggerRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBuildTrigger"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.DeleteBuildTriggerRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("DeleteBuildTrigger"))
                      .build();
        }
      }
    }
    return getDeleteBuildTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.UpdateBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getUpdateBuildTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBuildTrigger",
      requestType = com.google.cloudbuild.v1.UpdateBuildTriggerRequest.class,
      responseType = com.google.cloudbuild.v1.BuildTrigger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.UpdateBuildTriggerRequest, com.google.cloudbuild.v1.BuildTrigger>
      getUpdateBuildTriggerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.UpdateBuildTriggerRequest,
            com.google.cloudbuild.v1.BuildTrigger>
        getUpdateBuildTriggerMethod;
    if ((getUpdateBuildTriggerMethod = CloudBuildGrpc.getUpdateBuildTriggerMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getUpdateBuildTriggerMethod = CloudBuildGrpc.getUpdateBuildTriggerMethod) == null) {
          CloudBuildGrpc.getUpdateBuildTriggerMethod =
              getUpdateBuildTriggerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.UpdateBuildTriggerRequest,
                          com.google.cloudbuild.v1.BuildTrigger>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBuildTrigger"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.UpdateBuildTriggerRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("UpdateBuildTrigger"))
                      .build();
        }
      }
    }
    return getUpdateBuildTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.RunBuildTriggerRequest, com.google.longrunning.Operation>
      getRunBuildTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunBuildTrigger",
      requestType = com.google.cloudbuild.v1.RunBuildTriggerRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloudbuild.v1.RunBuildTriggerRequest, com.google.longrunning.Operation>
      getRunBuildTriggerMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloudbuild.v1.RunBuildTriggerRequest, com.google.longrunning.Operation>
        getRunBuildTriggerMethod;
    if ((getRunBuildTriggerMethod = CloudBuildGrpc.getRunBuildTriggerMethod) == null) {
      synchronized (CloudBuildGrpc.class) {
        if ((getRunBuildTriggerMethod = CloudBuildGrpc.getRunBuildTriggerMethod) == null) {
          CloudBuildGrpc.getRunBuildTriggerMethod =
              getRunBuildTriggerMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloudbuild.v1.RunBuildTriggerRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunBuildTrigger"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloudbuild.v1.RunBuildTriggerRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBuildMethodDescriptorSupplier("RunBuildTrigger"))
                      .build();
        }
      }
    }
    return getRunBuildTriggerMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudBuildStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBuildStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBuildStub>() {
          @java.lang.Override
          public CloudBuildStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBuildStub(channel, callOptions);
          }
        };
    return CloudBuildStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBuildBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBuildBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBuildBlockingStub>() {
          @java.lang.Override
          public CloudBuildBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBuildBlockingStub(channel, callOptions);
          }
        };
    return CloudBuildBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudBuildFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBuildFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBuildFutureStub>() {
          @java.lang.Override
          public CloudBuildFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBuildFutureStub(channel, callOptions);
          }
        };
    return CloudBuildFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
   * The main concept used by this API is a `Build`, which describes the location
   * of the source to build, how to build the source, and where to store the
   * built artifacts, if any.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public abstract static class CloudBuildImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Starts a build with the specified configuration.
     * This method returns a long-running `Operation`, which includes the build
     * ID. Pass the build ID to `GetBuild` to determine the build status (such as
     * `SUCCESS` or `FAILURE`).
     * </pre>
     */
    public void createBuild(
        com.google.cloudbuild.v1.CreateBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBuildMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a previously requested build.
     * The `Build` that is returned includes its status (such as `SUCCESS`,
     * `FAILURE`, or `WORKING`), and timing information.
     * </pre>
     */
    public void getBuild(
        com.google.cloudbuild.v1.GetBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBuildMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public void listBuilds(
        com.google.cloudbuild.v1.ListBuildsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBuildsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a build in progress.
     * </pre>
     */
    public void cancelBuild(
        com.google.cloudbuild.v1.CancelBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBuildMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new build based on the specified build.
     * This method creates a new build using the original build request, which may
     * or may not result in an identical build.
     * For triggered builds:
     * * Triggered builds resolve to a precise revision; therefore a retry of a
     * triggered build will result in a build that uses the same revision.
     * For non-triggered builds that specify `RepoSource`:
     * * If the original build built from the tip of a branch, the retried build
     * will build from the tip of that branch, which may not be the same revision
     * as the original build.
     * * If the original build specified a commit sha or revision ID, the retried
     * build will use the identical source.
     * For builds that specify `StorageSource`:
     * * If the original build pulled source from Google Cloud Storage without
     * specifying the generation of the object, the new build will use the current
     * object, which may be different from the original build source.
     * * If the original build pulled source from Cloud Storage and specified the
     * generation of the object, the new build will attempt to use the same
     * object, which may or may not be available depending on the bucket's
     * lifecycle management settings.
     * </pre>
     */
    public void retryBuild(
        com.google.cloudbuild.v1.RetryBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRetryBuildMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public void createBuildTrigger(
        com.google.cloudbuild.v1.CreateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBuildTriggerMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public void getBuildTrigger(
        com.google.cloudbuild.v1.GetBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBuildTriggerMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists existing `BuildTrigger`s.
     * This API is experimental.
     * </pre>
     */
    public void listBuildTriggers(
        com.google.cloudbuild.v1.ListBuildTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListBuildTriggersMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void deleteBuildTrigger(
        com.google.cloudbuild.v1.DeleteBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBuildTriggerMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void updateBuildTrigger(
        com.google.cloudbuild.v1.UpdateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBuildTriggerMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Runs a `BuildTrigger` at a particular source revision.
     * </pre>
     */
    public void runBuildTrigger(
        com.google.cloudbuild.v1.RunBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRunBuildTriggerMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateBuildMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.CreateBuildRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_BUILD)))
          .addMethod(
              getGetBuildMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.GetBuildRequest, com.google.cloudbuild.v1.Build>(
                      this, METHODID_GET_BUILD)))
          .addMethod(
              getListBuildsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.ListBuildsRequest,
                      com.google.cloudbuild.v1.ListBuildsResponse>(this, METHODID_LIST_BUILDS)))
          .addMethod(
              getCancelBuildMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.CancelBuildRequest, com.google.cloudbuild.v1.Build>(
                      this, METHODID_CANCEL_BUILD)))
          .addMethod(
              getRetryBuildMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.RetryBuildRequest, com.google.longrunning.Operation>(
                      this, METHODID_RETRY_BUILD)))
          .addMethod(
              getCreateBuildTriggerMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.CreateBuildTriggerRequest,
                      com.google.cloudbuild.v1.BuildTrigger>(this, METHODID_CREATE_BUILD_TRIGGER)))
          .addMethod(
              getGetBuildTriggerMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.GetBuildTriggerRequest,
                      com.google.cloudbuild.v1.BuildTrigger>(this, METHODID_GET_BUILD_TRIGGER)))
          .addMethod(
              getListBuildTriggersMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.ListBuildTriggersRequest,
                      com.google.cloudbuild.v1.ListBuildTriggersResponse>(
                      this, METHODID_LIST_BUILD_TRIGGERS)))
          .addMethod(
              getDeleteBuildTriggerMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.DeleteBuildTriggerRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_BUILD_TRIGGER)))
          .addMethod(
              getUpdateBuildTriggerMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.UpdateBuildTriggerRequest,
                      com.google.cloudbuild.v1.BuildTrigger>(this, METHODID_UPDATE_BUILD_TRIGGER)))
          .addMethod(
              getRunBuildTriggerMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloudbuild.v1.RunBuildTriggerRequest,
                      com.google.longrunning.Operation>(this, METHODID_RUN_BUILD_TRIGGER)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
   * The main concept used by this API is a `Build`, which describes the location
   * of the source to build, how to build the source, and where to store the
   * built artifacts, if any.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildStub extends io.grpc.stub.AbstractAsyncStub<CloudBuildStub> {
    private CloudBuildStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBuildStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Starts a build with the specified configuration.
     * This method returns a long-running `Operation`, which includes the build
     * ID. Pass the build ID to `GetBuild` to determine the build status (such as
     * `SUCCESS` or `FAILURE`).
     * </pre>
     */
    public void createBuild(
        com.google.cloudbuild.v1.CreateBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBuildMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a previously requested build.
     * The `Build` that is returned includes its status (such as `SUCCESS`,
     * `FAILURE`, or `WORKING`), and timing information.
     * </pre>
     */
    public void getBuild(
        com.google.cloudbuild.v1.GetBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBuildMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public void listBuilds(
        com.google.cloudbuild.v1.ListBuildsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBuildsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a build in progress.
     * </pre>
     */
    public void cancelBuild(
        com.google.cloudbuild.v1.CancelBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBuildMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new build based on the specified build.
     * This method creates a new build using the original build request, which may
     * or may not result in an identical build.
     * For triggered builds:
     * * Triggered builds resolve to a precise revision; therefore a retry of a
     * triggered build will result in a build that uses the same revision.
     * For non-triggered builds that specify `RepoSource`:
     * * If the original build built from the tip of a branch, the retried build
     * will build from the tip of that branch, which may not be the same revision
     * as the original build.
     * * If the original build specified a commit sha or revision ID, the retried
     * build will use the identical source.
     * For builds that specify `StorageSource`:
     * * If the original build pulled source from Google Cloud Storage without
     * specifying the generation of the object, the new build will use the current
     * object, which may be different from the original build source.
     * * If the original build pulled source from Cloud Storage and specified the
     * generation of the object, the new build will attempt to use the same
     * object, which may or may not be available depending on the bucket's
     * lifecycle management settings.
     * </pre>
     */
    public void retryBuild(
        com.google.cloudbuild.v1.RetryBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetryBuildMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public void createBuildTrigger(
        com.google.cloudbuild.v1.CreateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBuildTriggerMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public void getBuildTrigger(
        com.google.cloudbuild.v1.GetBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBuildTriggerMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists existing `BuildTrigger`s.
     * This API is experimental.
     * </pre>
     */
    public void listBuildTriggers(
        com.google.cloudbuild.v1.ListBuildTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBuildTriggersMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void deleteBuildTrigger(
        com.google.cloudbuild.v1.DeleteBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBuildTriggerMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void updateBuildTrigger(
        com.google.cloudbuild.v1.UpdateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBuildTriggerMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Runs a `BuildTrigger` at a particular source revision.
     * </pre>
     */
    public void runBuildTrigger(
        com.google.cloudbuild.v1.RunBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunBuildTriggerMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
   * The main concept used by this API is a `Build`, which describes the location
   * of the source to build, how to build the source, and where to store the
   * built artifacts, if any.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudBuildBlockingStub> {
    private CloudBuildBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBuildBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Starts a build with the specified configuration.
     * This method returns a long-running `Operation`, which includes the build
     * ID. Pass the build ID to `GetBuild` to determine the build status (such as
     * `SUCCESS` or `FAILURE`).
     * </pre>
     */
    public com.google.longrunning.Operation createBuild(
        com.google.cloudbuild.v1.CreateBuildRequest request) {
      return blockingUnaryCall(getChannel(), getCreateBuildMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a previously requested build.
     * The `Build` that is returned includes its status (such as `SUCCESS`,
     * `FAILURE`, or `WORKING`), and timing information.
     * </pre>
     */
    public com.google.cloudbuild.v1.Build getBuild(
        com.google.cloudbuild.v1.GetBuildRequest request) {
      return blockingUnaryCall(getChannel(), getGetBuildMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public com.google.cloudbuild.v1.ListBuildsResponse listBuilds(
        com.google.cloudbuild.v1.ListBuildsRequest request) {
      return blockingUnaryCall(getChannel(), getListBuildsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a build in progress.
     * </pre>
     */
    public com.google.cloudbuild.v1.Build cancelBuild(
        com.google.cloudbuild.v1.CancelBuildRequest request) {
      return blockingUnaryCall(getChannel(), getCancelBuildMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new build based on the specified build.
     * This method creates a new build using the original build request, which may
     * or may not result in an identical build.
     * For triggered builds:
     * * Triggered builds resolve to a precise revision; therefore a retry of a
     * triggered build will result in a build that uses the same revision.
     * For non-triggered builds that specify `RepoSource`:
     * * If the original build built from the tip of a branch, the retried build
     * will build from the tip of that branch, which may not be the same revision
     * as the original build.
     * * If the original build specified a commit sha or revision ID, the retried
     * build will use the identical source.
     * For builds that specify `StorageSource`:
     * * If the original build pulled source from Google Cloud Storage without
     * specifying the generation of the object, the new build will use the current
     * object, which may be different from the original build source.
     * * If the original build pulled source from Cloud Storage and specified the
     * generation of the object, the new build will attempt to use the same
     * object, which may or may not be available depending on the bucket's
     * lifecycle management settings.
     * </pre>
     */
    public com.google.longrunning.Operation retryBuild(
        com.google.cloudbuild.v1.RetryBuildRequest request) {
      return blockingUnaryCall(getChannel(), getRetryBuildMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger createBuildTrigger(
        com.google.cloudbuild.v1.CreateBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBuildTriggerMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger getBuildTrigger(
        com.google.cloudbuild.v1.GetBuildTriggerRequest request) {
      return blockingUnaryCall(getChannel(), getGetBuildTriggerMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists existing `BuildTrigger`s.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.ListBuildTriggersResponse listBuildTriggers(
        com.google.cloudbuild.v1.ListBuildTriggersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListBuildTriggersMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBuildTrigger(
        com.google.cloudbuild.v1.DeleteBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBuildTriggerMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger updateBuildTrigger(
        com.google.cloudbuild.v1.UpdateBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBuildTriggerMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Runs a `BuildTrigger` at a particular source revision.
     * </pre>
     */
    public com.google.longrunning.Operation runBuildTrigger(
        com.google.cloudbuild.v1.RunBuildTriggerRequest request) {
      return blockingUnaryCall(getChannel(), getRunBuildTriggerMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
   * The main concept used by this API is a `Build`, which describes the location
   * of the source to build, how to build the source, and where to store the
   * built artifacts, if any.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudBuildFutureStub> {
    private CloudBuildFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBuildFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Starts a build with the specified configuration.
     * This method returns a long-running `Operation`, which includes the build
     * ID. Pass the build ID to `GetBuild` to determine the build status (such as
     * `SUCCESS` or `FAILURE`).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createBuild(com.google.cloudbuild.v1.CreateBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBuildMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a previously requested build.
     * The `Build` that is returned includes its status (such as `SUCCESS`,
     * `FAILURE`, or `WORKING`), and timing information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.Build>
        getBuild(com.google.cloudbuild.v1.GetBuildRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetBuildMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloudbuild.v1.ListBuildsResponse>
        listBuilds(com.google.cloudbuild.v1.ListBuildsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBuildsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a build in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.Build>
        cancelBuild(com.google.cloudbuild.v1.CancelBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBuildMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new build based on the specified build.
     * This method creates a new build using the original build request, which may
     * or may not result in an identical build.
     * For triggered builds:
     * * Triggered builds resolve to a precise revision; therefore a retry of a
     * triggered build will result in a build that uses the same revision.
     * For non-triggered builds that specify `RepoSource`:
     * * If the original build built from the tip of a branch, the retried build
     * will build from the tip of that branch, which may not be the same revision
     * as the original build.
     * * If the original build specified a commit sha or revision ID, the retried
     * build will use the identical source.
     * For builds that specify `StorageSource`:
     * * If the original build pulled source from Google Cloud Storage without
     * specifying the generation of the object, the new build will use the current
     * object, which may be different from the original build source.
     * * If the original build pulled source from Cloud Storage and specified the
     * generation of the object, the new build will attempt to use the same
     * object, which may or may not be available depending on the bucket's
     * lifecycle management settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        retryBuild(com.google.cloudbuild.v1.RetryBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetryBuildMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger>
        createBuildTrigger(com.google.cloudbuild.v1.CreateBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBuildTriggerMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns information about a `BuildTrigger`.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger>
        getBuildTrigger(com.google.cloudbuild.v1.GetBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBuildTriggerMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists existing `BuildTrigger`s.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloudbuild.v1.ListBuildTriggersResponse>
        listBuildTriggers(com.google.cloudbuild.v1.ListBuildTriggersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBuildTriggersMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteBuildTrigger(com.google.cloudbuild.v1.DeleteBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBuildTriggerMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a `BuildTrigger` by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger>
        updateBuildTrigger(com.google.cloudbuild.v1.UpdateBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBuildTriggerMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Runs a `BuildTrigger` at a particular source revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        runBuildTrigger(com.google.cloudbuild.v1.RunBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunBuildTriggerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUILD = 0;
  private static final int METHODID_GET_BUILD = 1;
  private static final int METHODID_LIST_BUILDS = 2;
  private static final int METHODID_CANCEL_BUILD = 3;
  private static final int METHODID_RETRY_BUILD = 4;
  private static final int METHODID_CREATE_BUILD_TRIGGER = 5;
  private static final int METHODID_GET_BUILD_TRIGGER = 6;
  private static final int METHODID_LIST_BUILD_TRIGGERS = 7;
  private static final int METHODID_DELETE_BUILD_TRIGGER = 8;
  private static final int METHODID_UPDATE_BUILD_TRIGGER = 9;
  private static final int METHODID_RUN_BUILD_TRIGGER = 10;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudBuildImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudBuildImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BUILD:
          serviceImpl.createBuild(
              (com.google.cloudbuild.v1.CreateBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_BUILD:
          serviceImpl.getBuild(
              (com.google.cloudbuild.v1.GetBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build>) responseObserver);
          break;
        case METHODID_LIST_BUILDS:
          serviceImpl.listBuilds(
              (com.google.cloudbuild.v1.ListBuildsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse>)
                  responseObserver);
          break;
        case METHODID_CANCEL_BUILD:
          serviceImpl.cancelBuild(
              (com.google.cloudbuild.v1.CancelBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build>) responseObserver);
          break;
        case METHODID_RETRY_BUILD:
          serviceImpl.retryBuild(
              (com.google.cloudbuild.v1.RetryBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CREATE_BUILD_TRIGGER:
          serviceImpl.createBuildTrigger(
              (com.google.cloudbuild.v1.CreateBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>)
                  responseObserver);
          break;
        case METHODID_GET_BUILD_TRIGGER:
          serviceImpl.getBuildTrigger(
              (com.google.cloudbuild.v1.GetBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>)
                  responseObserver);
          break;
        case METHODID_LIST_BUILD_TRIGGERS:
          serviceImpl.listBuildTriggers(
              (com.google.cloudbuild.v1.ListBuildTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_BUILD_TRIGGER:
          serviceImpl.deleteBuildTrigger(
              (com.google.cloudbuild.v1.DeleteBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BUILD_TRIGGER:
          serviceImpl.updateBuildTrigger(
              (com.google.cloudbuild.v1.UpdateBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>)
                  responseObserver);
          break;
        case METHODID_RUN_BUILD_TRIGGER:
          serviceImpl.runBuildTrigger(
              (com.google.cloudbuild.v1.RunBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class CloudBuildBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudBuildBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudBuild");
    }
  }

  private static final class CloudBuildFileDescriptorSupplier
      extends CloudBuildBaseDescriptorSupplier {
    CloudBuildFileDescriptorSupplier() {}
  }

  private static final class CloudBuildMethodDescriptorSupplier
      extends CloudBuildBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudBuildMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudBuildGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudBuildFileDescriptorSupplier())
                      .addMethod(getCreateBuildMethod())
                      .addMethod(getGetBuildMethod())
                      .addMethod(getListBuildsMethod())
                      .addMethod(getCancelBuildMethod())
                      .addMethod(getRetryBuildMethod())
                      .addMethod(getCreateBuildTriggerMethod())
                      .addMethod(getGetBuildTriggerMethod())
                      .addMethod(getListBuildTriggersMethod())
                      .addMethod(getDeleteBuildTriggerMethod())
                      .addMethod(getUpdateBuildTriggerMethod())
                      .addMethod(getRunBuildTriggerMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
