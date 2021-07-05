package com.wanpng.notification.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/jobseeker_notification_service.grpc.proto")
public final class JobseekerNotificationServiceGrpc {

  private JobseekerNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.JobseekerNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationRequest,
      com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> getNotifyInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyInvitation",
      requestType = com.wanpng.notification.grpc.domain.InvitationRequest.class,
      responseType = com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationRequest,
      com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> getNotifyInvitationMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationRequest, com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> getNotifyInvitationMethod;
    if ((getNotifyInvitationMethod = JobseekerNotificationServiceGrpc.getNotifyInvitationMethod) == null) {
      synchronized (JobseekerNotificationServiceGrpc.class) {
        if ((getNotifyInvitationMethod = JobseekerNotificationServiceGrpc.getNotifyInvitationMethod) == null) {
          JobseekerNotificationServiceGrpc.getNotifyInvitationMethod = getNotifyInvitationMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.InvitationRequest, com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.InvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseekerNotificationServiceMethodDescriptorSupplier("NotifyInvitation"))
              .build();
        }
      }
    }
    return getNotifyInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicationStatusChange,
      com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> getNotifyApplicationStatusChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyApplicationStatusChange",
      requestType = com.wanpng.notification.grpc.domain.ApplicationStatusChange.class,
      responseType = com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicationStatusChange,
      com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> getNotifyApplicationStatusChangeMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicationStatusChange, com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> getNotifyApplicationStatusChangeMethod;
    if ((getNotifyApplicationStatusChangeMethod = JobseekerNotificationServiceGrpc.getNotifyApplicationStatusChangeMethod) == null) {
      synchronized (JobseekerNotificationServiceGrpc.class) {
        if ((getNotifyApplicationStatusChangeMethod = JobseekerNotificationServiceGrpc.getNotifyApplicationStatusChangeMethod) == null) {
          JobseekerNotificationServiceGrpc.getNotifyApplicationStatusChangeMethod = getNotifyApplicationStatusChangeMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.ApplicationStatusChange, com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyApplicationStatusChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.ApplicationStatusChange.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobseekerNotificationServiceMethodDescriptorSupplier("NotifyApplicationStatusChange"))
              .build();
        }
      }
    }
    return getNotifyApplicationStatusChangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobseekerNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceStub>() {
        @java.lang.Override
        public JobseekerNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseekerNotificationServiceStub(channel, callOptions);
        }
      };
    return JobseekerNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobseekerNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceBlockingStub>() {
        @java.lang.Override
        public JobseekerNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseekerNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return JobseekerNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobseekerNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobseekerNotificationServiceFutureStub>() {
        @java.lang.Override
        public JobseekerNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobseekerNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return JobseekerNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobseekerNotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notifyInvitation(com.wanpng.notification.grpc.domain.InvitationRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyInvitationMethod(), responseObserver);
    }

    /**
     */
    public void notifyApplicationStatusChange(com.wanpng.notification.grpc.domain.ApplicationStatusChange request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyApplicationStatusChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyInvitationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.InvitationRequest,
                com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse>(
                  this, METHODID_NOTIFY_INVITATION)))
          .addMethod(
            getNotifyApplicationStatusChangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.ApplicationStatusChange,
                com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse>(
                  this, METHODID_NOTIFY_APPLICATION_STATUS_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class JobseekerNotificationServiceStub extends io.grpc.stub.AbstractAsyncStub<JobseekerNotificationServiceStub> {
    private JobseekerNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseekerNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseekerNotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void notifyInvitation(com.wanpng.notification.grpc.domain.InvitationRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyApplicationStatusChange(com.wanpng.notification.grpc.domain.ApplicationStatusChange request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyApplicationStatusChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobseekerNotificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobseekerNotificationServiceBlockingStub> {
    private JobseekerNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseekerNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseekerNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse notifyInvitation(com.wanpng.notification.grpc.domain.InvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyInvitationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse notifyApplicationStatusChange(com.wanpng.notification.grpc.domain.ApplicationStatusChange request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyApplicationStatusChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobseekerNotificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobseekerNotificationServiceFutureStub> {
    private JobseekerNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobseekerNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobseekerNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse> notifyInvitation(
        com.wanpng.notification.grpc.domain.InvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyInvitationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse> notifyApplicationStatusChange(
        com.wanpng.notification.grpc.domain.ApplicationStatusChange request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyApplicationStatusChangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_INVITATION = 0;
  private static final int METHODID_NOTIFY_APPLICATION_STATUS_CHANGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobseekerNotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobseekerNotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY_INVITATION:
          serviceImpl.notifyInvitation((com.wanpng.notification.grpc.domain.InvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyJobseekerInvitationResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_APPLICATION_STATUS_CHANGE:
          serviceImpl.notifyApplicationStatusChange((com.wanpng.notification.grpc.domain.ApplicationStatusChange) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicationStatusChangeResponse>) responseObserver);
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

  private static abstract class JobseekerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobseekerNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.notification.grpc.service.JobseekerNotificationProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobseekerNotificationService");
    }
  }

  private static final class JobseekerNotificationServiceFileDescriptorSupplier
      extends JobseekerNotificationServiceBaseDescriptorSupplier {
    JobseekerNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class JobseekerNotificationServiceMethodDescriptorSupplier
      extends JobseekerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobseekerNotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobseekerNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobseekerNotificationServiceFileDescriptorSupplier())
              .addMethod(getNotifyInvitationMethod())
              .addMethod(getNotifyApplicationStatusChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}