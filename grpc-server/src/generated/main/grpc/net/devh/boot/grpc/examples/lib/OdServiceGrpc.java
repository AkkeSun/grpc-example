package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *service 규정
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OdServiceGrpc {

  private OdServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "OdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = net.devh.boot.grpc.examples.lib.HelloRequest.class,
      responseType = net.devh.boot.grpc.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = OdServiceGrpc.getSayHelloMethod) == null) {
      synchronized (OdServiceGrpc.class) {
        if ((getSayHelloMethod = OdServiceGrpc.getSayHelloMethod) == null) {
          OdServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new OdServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OdServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OdServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OdServiceStub>() {
        @java.lang.Override
        public OdServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OdServiceStub(channel, callOptions);
        }
      };
    return OdServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OdServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OdServiceBlockingStub>() {
        @java.lang.Override
        public OdServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OdServiceBlockingStub(channel, callOptions);
        }
      };
    return OdServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OdServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OdServiceFutureStub>() {
        @java.lang.Override
        public OdServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OdServiceFutureStub(channel, callOptions);
        }
      };
    return OdServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *service 규정
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *SayHello가 오면 HelloReply를 하겠다의 의미
     * </pre>
     */
    default void sayHello(net.devh.boot.grpc.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OdService.
   * <pre>
   *service 규정
   * </pre>
   */
  public static abstract class OdServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OdServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OdService.
   * <pre>
   *service 규정
   * </pre>
   */
  public static final class OdServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OdServiceStub> {
    private OdServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OdServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OdServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello가 오면 HelloReply를 하겠다의 의미
     * </pre>
     */
    public void sayHello(net.devh.boot.grpc.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OdService.
   * <pre>
   *service 규정
   * </pre>
   */
  public static final class OdServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OdServiceBlockingStub> {
    private OdServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OdServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OdServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello가 오면 HelloReply를 하겠다의 의미
     * </pre>
     */
    public net.devh.boot.grpc.examples.lib.HelloReply sayHello(net.devh.boot.grpc.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OdService.
   * <pre>
   *service 규정
   * </pre>
   */
  public static final class OdServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OdServiceFutureStub> {
    private OdServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OdServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OdServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello가 오면 HelloReply를 하겠다의 의미
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.HelloReply> sayHello(
        net.devh.boot.grpc.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((net.devh.boot.grpc.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              net.devh.boot.grpc.examples.lib.HelloRequest,
              net.devh.boot.grpc.examples.lib.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class OdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OdService");
    }
  }

  private static final class OdServiceFileDescriptorSupplier
      extends OdServiceBaseDescriptorSupplier {
    OdServiceFileDescriptorSupplier() {}
  }

  private static final class OdServiceMethodDescriptorSupplier
      extends OdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OdServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OdServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
