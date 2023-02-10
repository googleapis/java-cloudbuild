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
package google.devtools.cloudbuild.v2;


/**
 *
 *
 * <pre>
 * Creates and manages builds on Google Cloud Platform.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/devtools/cloudbuild/v2/cloudbuild.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudBuildGrpc {

  private CloudBuildGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.cloudbuild.v2.CloudBuild";

  // Static method descriptors that strictly reflect the proto.
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
   * </pre>
   */
  public abstract static class CloudBuildImplBase implements io.grpc.BindableService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).build();
    }
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
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
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
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
  }

  /**
   *
   *
   * <pre>
   * Creates and manages builds on Google Cloud Platform.
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
  }

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
      return google.devtools.cloudbuild.v2.CloudBuildProto.getDescriptor();
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
                      .build();
        }
      }
    }
    return result;
  }
}
