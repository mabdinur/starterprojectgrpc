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
    comments = "Source: foodsupplier.proto")
public final class foodSupplierGrpc {

  private foodSupplierGrpc() {}

  public static final String SERVICE_NAME = "foodSupplier";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<javagrpc.Foodsupplier.Ingredient,
      javagrpc.Foodsupplier.Vendors> getGetVendorsByIngredientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVendorsByIngredient",
      requestType = javagrpc.Foodsupplier.Ingredient.class,
      responseType = javagrpc.Foodsupplier.Vendors.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<javagrpc.Foodsupplier.Ingredient,
      javagrpc.Foodsupplier.Vendors> getGetVendorsByIngredientMethod() {
    io.grpc.MethodDescriptor<javagrpc.Foodsupplier.Ingredient, javagrpc.Foodsupplier.Vendors> getGetVendorsByIngredientMethod;
    if ((getGetVendorsByIngredientMethod = foodSupplierGrpc.getGetVendorsByIngredientMethod) == null) {
      synchronized (foodSupplierGrpc.class) {
        if ((getGetVendorsByIngredientMethod = foodSupplierGrpc.getGetVendorsByIngredientMethod) == null) {
          foodSupplierGrpc.getGetVendorsByIngredientMethod = getGetVendorsByIngredientMethod = 
              io.grpc.MethodDescriptor.<javagrpc.Foodsupplier.Ingredient, javagrpc.Foodsupplier.Vendors>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "foodSupplier", "getVendorsByIngredient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Foodsupplier.Ingredient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Foodsupplier.Vendors.getDefaultInstance()))
                  .setSchemaDescriptor(new foodSupplierMethodDescriptorSupplier("getVendorsByIngredient"))
                  .build();
          }
        }
     }
     return getGetVendorsByIngredientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static foodSupplierStub newStub(io.grpc.Channel channel) {
    return new foodSupplierStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static foodSupplierBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new foodSupplierBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static foodSupplierFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new foodSupplierFutureStub(channel);
  }

  /**
   */
  public static abstract class foodSupplierImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVendorsByIngredient(javagrpc.Foodsupplier.Ingredient request,
        io.grpc.stub.StreamObserver<javagrpc.Foodsupplier.Vendors> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVendorsByIngredientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVendorsByIngredientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                javagrpc.Foodsupplier.Ingredient,
                javagrpc.Foodsupplier.Vendors>(
                  this, METHODID_GET_VENDORS_BY_INGREDIENT)))
          .build();
    }
  }

  /**
   */
  public static final class foodSupplierStub extends io.grpc.stub.AbstractStub<foodSupplierStub> {
    private foodSupplierStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodSupplierStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodSupplierStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodSupplierStub(channel, callOptions);
    }

    /**
     */
    public void getVendorsByIngredient(javagrpc.Foodsupplier.Ingredient request,
        io.grpc.stub.StreamObserver<javagrpc.Foodsupplier.Vendors> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVendorsByIngredientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class foodSupplierBlockingStub extends io.grpc.stub.AbstractStub<foodSupplierBlockingStub> {
    private foodSupplierBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodSupplierBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodSupplierBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodSupplierBlockingStub(channel, callOptions);
    }

    /**
     */
    public javagrpc.Foodsupplier.Vendors getVendorsByIngredient(javagrpc.Foodsupplier.Ingredient request) {
      return blockingUnaryCall(
          getChannel(), getGetVendorsByIngredientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class foodSupplierFutureStub extends io.grpc.stub.AbstractStub<foodSupplierFutureStub> {
    private foodSupplierFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodSupplierFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodSupplierFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodSupplierFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<javagrpc.Foodsupplier.Vendors> getVendorsByIngredient(
        javagrpc.Foodsupplier.Ingredient request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVendorsByIngredientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VENDORS_BY_INGREDIENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final foodSupplierImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(foodSupplierImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VENDORS_BY_INGREDIENT:
          serviceImpl.getVendorsByIngredient((javagrpc.Foodsupplier.Ingredient) request,
              (io.grpc.stub.StreamObserver<javagrpc.Foodsupplier.Vendors>) responseObserver);
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

  private static abstract class foodSupplierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    foodSupplierBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return javagrpc.Foodsupplier.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("foodSupplier");
    }
  }

  private static final class foodSupplierFileDescriptorSupplier
      extends foodSupplierBaseDescriptorSupplier {
    foodSupplierFileDescriptorSupplier() {}
  }

  private static final class foodSupplierMethodDescriptorSupplier
      extends foodSupplierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    foodSupplierMethodDescriptorSupplier(String methodName) {
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
      synchronized (foodSupplierGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new foodSupplierFileDescriptorSupplier())
              .addMethod(getGetVendorsByIngredientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
