package javagrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: foodvendor.proto")
public final class foodVendorGrpc {

  private foodVendorGrpc() {}

  public static final String SERVICE_NAME = "foodVendor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<javagrpc.Foodvendor.VendorIngredientData,
      javagrpc.Foodvendor.VendorIngredientMap> getGetIngredientFromVendorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIngredientFromVendors",
      requestType = javagrpc.Foodvendor.VendorIngredientData.class,
      responseType = javagrpc.Foodvendor.VendorIngredientMap.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<javagrpc.Foodvendor.VendorIngredientData,
      javagrpc.Foodvendor.VendorIngredientMap> getGetIngredientFromVendorsMethod() {
    io.grpc.MethodDescriptor<javagrpc.Foodvendor.VendorIngredientData, javagrpc.Foodvendor.VendorIngredientMap> getGetIngredientFromVendorsMethod;
    if ((getGetIngredientFromVendorsMethod = foodVendorGrpc.getGetIngredientFromVendorsMethod) == null) {
      synchronized (foodVendorGrpc.class) {
        if ((getGetIngredientFromVendorsMethod = foodVendorGrpc.getGetIngredientFromVendorsMethod) == null) {
          foodVendorGrpc.getGetIngredientFromVendorsMethod = getGetIngredientFromVendorsMethod = 
              io.grpc.MethodDescriptor.<javagrpc.Foodvendor.VendorIngredientData, javagrpc.Foodvendor.VendorIngredientMap>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "foodVendor", "getIngredientFromVendors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Foodvendor.VendorIngredientData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Foodvendor.VendorIngredientMap.getDefaultInstance()))
                  .setSchemaDescriptor(new foodVendorMethodDescriptorSupplier("getIngredientFromVendors"))
                  .build();
          }
        }
     }
     return getGetIngredientFromVendorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static foodVendorStub newStub(io.grpc.Channel channel) {
    return new foodVendorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static foodVendorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new foodVendorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static foodVendorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new foodVendorFutureStub(channel);
  }

  /**
   */
  public static abstract class foodVendorImplBase implements io.grpc.BindableService {

    /**
     */
    public void getIngredientFromVendors(javagrpc.Foodvendor.VendorIngredientData request,
        io.grpc.stub.StreamObserver<javagrpc.Foodvendor.VendorIngredientMap> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIngredientFromVendorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIngredientFromVendorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                javagrpc.Foodvendor.VendorIngredientData,
                javagrpc.Foodvendor.VendorIngredientMap>(
                  this, METHODID_GET_INGREDIENT_FROM_VENDORS)))
          .build();
    }
  }

  /**
   */
  public static final class foodVendorStub extends io.grpc.stub.AbstractStub<foodVendorStub> {
    private foodVendorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodVendorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodVendorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodVendorStub(channel, callOptions);
    }

    /**
     */
    public void getIngredientFromVendors(javagrpc.Foodvendor.VendorIngredientData request,
        io.grpc.stub.StreamObserver<javagrpc.Foodvendor.VendorIngredientMap> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIngredientFromVendorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class foodVendorBlockingStub extends io.grpc.stub.AbstractStub<foodVendorBlockingStub> {
    private foodVendorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodVendorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodVendorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodVendorBlockingStub(channel, callOptions);
    }

    /**
     */
    public javagrpc.Foodvendor.VendorIngredientMap getIngredientFromVendors(javagrpc.Foodvendor.VendorIngredientData request) {
      return blockingUnaryCall(
          getChannel(), getGetIngredientFromVendorsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class foodVendorFutureStub extends io.grpc.stub.AbstractStub<foodVendorFutureStub> {
    private foodVendorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodVendorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodVendorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodVendorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<javagrpc.Foodvendor.VendorIngredientMap> getIngredientFromVendors(
        javagrpc.Foodvendor.VendorIngredientData request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIngredientFromVendorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INGREDIENT_FROM_VENDORS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final foodVendorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(foodVendorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INGREDIENT_FROM_VENDORS:
          serviceImpl.getIngredientFromVendors((javagrpc.Foodvendor.VendorIngredientData) request,
              (io.grpc.stub.StreamObserver<javagrpc.Foodvendor.VendorIngredientMap>) responseObserver);
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

  private static abstract class foodVendorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    foodVendorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return javagrpc.Foodvendor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("foodVendor");
    }
  }

  private static final class foodVendorFileDescriptorSupplier
      extends foodVendorBaseDescriptorSupplier {
    foodVendorFileDescriptorSupplier() {}
  }

  private static final class foodVendorMethodDescriptorSupplier
      extends foodVendorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    foodVendorMethodDescriptorSupplier(String methodName) {
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
      synchronized (foodVendorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new foodVendorFileDescriptorSupplier())
              .addMethod(getGetIngredientFromVendorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
