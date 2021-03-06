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
    comments = "Source: foodfinder.proto")
public final class foodFinderGrpc {

  private foodFinderGrpc() {}

  public static final String SERVICE_NAME = "foodFinder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<javagrpc.Ingredients.Ingredient,
      javagrpc.Ingredients.VendorIngredientMap> getGetIngredientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIngredient",
      requestType = javagrpc.Ingredients.Ingredient.class,
      responseType = javagrpc.Ingredients.VendorIngredientMap.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<javagrpc.Ingredients.Ingredient,
      javagrpc.Ingredients.VendorIngredientMap> getGetIngredientMethod() {
    io.grpc.MethodDescriptor<javagrpc.Ingredients.Ingredient, javagrpc.Ingredients.VendorIngredientMap> getGetIngredientMethod;
    if ((getGetIngredientMethod = foodFinderGrpc.getGetIngredientMethod) == null) {
      synchronized (foodFinderGrpc.class) {
        if ((getGetIngredientMethod = foodFinderGrpc.getGetIngredientMethod) == null) {
          foodFinderGrpc.getGetIngredientMethod = getGetIngredientMethod = 
              io.grpc.MethodDescriptor.<javagrpc.Ingredients.Ingredient, javagrpc.Ingredients.VendorIngredientMap>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "foodFinder", "getIngredient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Ingredients.Ingredient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  javagrpc.Ingredients.VendorIngredientMap.getDefaultInstance()))
                  .setSchemaDescriptor(new foodFinderMethodDescriptorSupplier("getIngredient"))
                  .build();
          }
        }
     }
     return getGetIngredientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static foodFinderStub newStub(io.grpc.Channel channel) {
    return new foodFinderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static foodFinderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new foodFinderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static foodFinderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new foodFinderFutureStub(channel);
  }

  /**
   */
  public static abstract class foodFinderImplBase implements io.grpc.BindableService {

    /**
     */
    public void getIngredient(javagrpc.Ingredients.Ingredient request,
        io.grpc.stub.StreamObserver<javagrpc.Ingredients.VendorIngredientMap> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIngredientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIngredientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                javagrpc.Ingredients.Ingredient,
                javagrpc.Ingredients.VendorIngredientMap>(
                  this, METHODID_GET_INGREDIENT)))
          .build();
    }
  }

  /**
   */
  public static final class foodFinderStub extends io.grpc.stub.AbstractStub<foodFinderStub> {
    private foodFinderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodFinderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodFinderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodFinderStub(channel, callOptions);
    }

    /**
     */
    public void getIngredient(javagrpc.Ingredients.Ingredient request,
        io.grpc.stub.StreamObserver<javagrpc.Ingredients.VendorIngredientMap> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIngredientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class foodFinderBlockingStub extends io.grpc.stub.AbstractStub<foodFinderBlockingStub> {
    private foodFinderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodFinderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodFinderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodFinderBlockingStub(channel, callOptions);
    }

    /**
     */
    public javagrpc.Ingredients.VendorIngredientMap getIngredient(javagrpc.Ingredients.Ingredient request) {
      return blockingUnaryCall(
          getChannel(), getGetIngredientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class foodFinderFutureStub extends io.grpc.stub.AbstractStub<foodFinderFutureStub> {
    private foodFinderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foodFinderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foodFinderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foodFinderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<javagrpc.Ingredients.VendorIngredientMap> getIngredient(
        javagrpc.Ingredients.Ingredient request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIngredientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INGREDIENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final foodFinderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(foodFinderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INGREDIENT:
          serviceImpl.getIngredient((javagrpc.Ingredients.Ingredient) request,
              (io.grpc.stub.StreamObserver<javagrpc.Ingredients.VendorIngredientMap>) responseObserver);
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

  private static abstract class foodFinderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    foodFinderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return javagrpc.Foodfinder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("foodFinder");
    }
  }

  private static final class foodFinderFileDescriptorSupplier
      extends foodFinderBaseDescriptorSupplier {
    foodFinderFileDescriptorSupplier() {}
  }

  private static final class foodFinderMethodDescriptorSupplier
      extends foodFinderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    foodFinderMethodDescriptorSupplier(String methodName) {
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
      synchronized (foodFinderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new foodFinderFileDescriptorSupplier())
              .addMethod(getGetIngredientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
