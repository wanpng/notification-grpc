package com.wanpng.notification.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/jobposting_notification_service.grpc.proto")
public final class JobPostingNotificationServiceGrpc {

  private JobPostingNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.JobPostingNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.service.CloseJobRequest,
      com.wanpng.notification.grpc.service.CloseJobResponse> getCloseJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseJob",
      requestType = com.wanpng.notification.grpc.service.CloseJobRequest.class,
      responseType = com.wanpng.notification.grpc.service.CloseJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.service.CloseJobRequest,
      com.wanpng.notification.grpc.service.CloseJobResponse> getCloseJobMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.service.CloseJobRequest, com.wanpng.notification.grpc.service.CloseJobResponse> getCloseJobMethod;
    if ((getCloseJobMethod = JobPostingNotificationServiceGrpc.getCloseJobMethod) == null) {
      synchronized (JobPostingNotificationServiceGrpc.class) {
        if ((getCloseJobMethod = JobPostingNotificationServiceGrpc.getCloseJobMethod) == null) {
          JobPostingNotificationServiceGrpc.getCloseJobMethod = getCloseJobMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.service.CloseJobRequest, com.wanpng.notification.grpc.service.CloseJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.CloseJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.CloseJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingNotificationServiceMethodDescriptorSupplier("CloseJob"))
              .build();
        }
      }
    }
    return getCloseJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobPostingNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceStub>() {
        @java.lang.Override
        public JobPostingNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingNotificationServiceStub(channel, callOptions);
        }
      };
    return JobPostingNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobPostingNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceBlockingStub>() {
        @java.lang.Override
        public JobPostingNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return JobPostingNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobPostingNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingNotificationServiceFutureStub>() {
        @java.lang.Override
        public JobPostingNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return JobPostingNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobPostingNotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void closeJob(com.wanpng.notification.grpc.service.CloseJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.CloseJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCloseJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.service.CloseJobRequest,
                com.wanpng.notification.grpc.service.CloseJobResponse>(
                  this, METHODID_CLOSE_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class JobPostingNotificationServiceStub extends io.grpc.stub.AbstractAsyncStub<JobPostingNotificationServiceStub> {
    private JobPostingNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingNotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void closeJob(com.wanpng.notification.grpc.service.CloseJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.CloseJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobPostingNotificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobPostingNotificationServiceBlockingStub> {
    private JobPostingNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.CloseJobResponse closeJob(com.wanpng.notification.grpc.service.CloseJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobPostingNotificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobPostingNotificationServiceFutureStub> {
    private JobPostingNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.CloseJobResponse> closeJob(
        com.wanpng.notification.grpc.service.CloseJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLOSE_JOB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobPostingNotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobPostingNotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLOSE_JOB:
          serviceImpl.closeJob((com.wanpng.notification.grpc.service.CloseJobRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.CloseJobResponse>) responseObserver);
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

  private static abstract class JobPostingNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobPostingNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.notification.grpc.service.JobPostingNotificationProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobPostingNotificationService");
    }
  }

  private static final class JobPostingNotificationServiceFileDescriptorSupplier
      extends JobPostingNotificationServiceBaseDescriptorSupplier {
    JobPostingNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class JobPostingNotificationServiceMethodDescriptorSupplier
      extends JobPostingNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobPostingNotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobPostingNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobPostingNotificationServiceFileDescriptorSupplier())
              .addMethod(getCloseJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
