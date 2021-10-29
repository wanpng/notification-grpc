package com.wanpng.notification.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/employer_notification_service.grpc.proto")
public final class EmployerNotificationServiceGrpc {

  private EmployerNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.EmployerNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationResponse,
      com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> getNotifyInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyInvitation",
      requestType = com.wanpng.notification.grpc.domain.InvitationResponse.class,
      responseType = com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationResponse,
      com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> getNotifyInvitationMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.InvitationResponse, com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> getNotifyInvitationMethod;
    if ((getNotifyInvitationMethod = EmployerNotificationServiceGrpc.getNotifyInvitationMethod) == null) {
      synchronized (EmployerNotificationServiceGrpc.class) {
        if ((getNotifyInvitationMethod = EmployerNotificationServiceGrpc.getNotifyInvitationMethod) == null) {
          EmployerNotificationServiceGrpc.getNotifyInvitationMethod = getNotifyInvitationMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.InvitationResponse, com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.InvitationResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerNotificationServiceMethodDescriptorSupplier("NotifyInvitation"))
              .build();
        }
      }
    }
    return getNotifyInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicantCount,
      com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> getNotifyApplicantCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyApplicantCount",
      requestType = com.wanpng.notification.grpc.domain.ApplicantCount.class,
      responseType = com.wanpng.notification.grpc.service.NotifyApplicantCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicantCount,
      com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> getNotifyApplicantCountMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.ApplicantCount, com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> getNotifyApplicantCountMethod;
    if ((getNotifyApplicantCountMethod = EmployerNotificationServiceGrpc.getNotifyApplicantCountMethod) == null) {
      synchronized (EmployerNotificationServiceGrpc.class) {
        if ((getNotifyApplicantCountMethod = EmployerNotificationServiceGrpc.getNotifyApplicantCountMethod) == null) {
          EmployerNotificationServiceGrpc.getNotifyApplicantCountMethod = getNotifyApplicantCountMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.ApplicantCount, com.wanpng.notification.grpc.service.NotifyApplicantCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyApplicantCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.ApplicantCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyApplicantCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerNotificationServiceMethodDescriptorSupplier("NotifyApplicantCount"))
              .build();
        }
      }
    }
    return getNotifyApplicantCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewSchedule,
      com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyInterviewSchedule",
      requestType = com.wanpng.notification.grpc.domain.EmployerInterviewSchedule.class,
      responseType = com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewSchedule,
      com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewSchedule, com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleMethod;
    if ((getNotifyInterviewScheduleMethod = EmployerNotificationServiceGrpc.getNotifyInterviewScheduleMethod) == null) {
      synchronized (EmployerNotificationServiceGrpc.class) {
        if ((getNotifyInterviewScheduleMethod = EmployerNotificationServiceGrpc.getNotifyInterviewScheduleMethod) == null) {
          EmployerNotificationServiceGrpc.getNotifyInterviewScheduleMethod = getNotifyInterviewScheduleMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.EmployerInterviewSchedule, com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyInterviewSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.EmployerInterviewSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerNotificationServiceMethodDescriptorSupplier("NotifyInterviewSchedule"))
              .build();
        }
      }
    }
    return getNotifyInterviewScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined,
      com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleDeclinedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyInterviewScheduleDeclined",
      requestType = com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined.class,
      responseType = com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined,
      com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleDeclinedMethod() {
    io.grpc.MethodDescriptor<com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined, com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> getNotifyInterviewScheduleDeclinedMethod;
    if ((getNotifyInterviewScheduleDeclinedMethod = EmployerNotificationServiceGrpc.getNotifyInterviewScheduleDeclinedMethod) == null) {
      synchronized (EmployerNotificationServiceGrpc.class) {
        if ((getNotifyInterviewScheduleDeclinedMethod = EmployerNotificationServiceGrpc.getNotifyInterviewScheduleDeclinedMethod) == null) {
          EmployerNotificationServiceGrpc.getNotifyInterviewScheduleDeclinedMethod = getNotifyInterviewScheduleDeclinedMethod =
              io.grpc.MethodDescriptor.<com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined, com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyInterviewScheduleDeclined"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployerNotificationServiceMethodDescriptorSupplier("NotifyInterviewScheduleDeclined"))
              .build();
        }
      }
    }
    return getNotifyInterviewScheduleDeclinedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployerNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceStub>() {
        @java.lang.Override
        public EmployerNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerNotificationServiceStub(channel, callOptions);
        }
      };
    return EmployerNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployerNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceBlockingStub>() {
        @java.lang.Override
        public EmployerNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployerNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployerNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployerNotificationServiceFutureStub>() {
        @java.lang.Override
        public EmployerNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployerNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return EmployerNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployerNotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notifyInvitation(com.wanpng.notification.grpc.domain.InvitationResponse request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyInvitationMethod(), responseObserver);
    }

    /**
     */
    public void notifyApplicantCount(com.wanpng.notification.grpc.domain.ApplicantCount request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyApplicantCountMethod(), responseObserver);
    }

    /**
     */
    public void notifyInterviewSchedule(com.wanpng.notification.grpc.domain.EmployerInterviewSchedule request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyInterviewScheduleMethod(), responseObserver);
    }

    /**
     */
    public void notifyInterviewScheduleDeclined(com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyInterviewScheduleDeclinedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyInvitationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.InvitationResponse,
                com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse>(
                  this, METHODID_NOTIFY_INVITATION)))
          .addMethod(
            getNotifyApplicantCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.ApplicantCount,
                com.wanpng.notification.grpc.service.NotifyApplicantCountResponse>(
                  this, METHODID_NOTIFY_APPLICANT_COUNT)))
          .addMethod(
            getNotifyInterviewScheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.EmployerInterviewSchedule,
                com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>(
                  this, METHODID_NOTIFY_INTERVIEW_SCHEDULE)))
          .addMethod(
            getNotifyInterviewScheduleDeclinedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined,
                com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>(
                  this, METHODID_NOTIFY_INTERVIEW_SCHEDULE_DECLINED)))
          .build();
    }
  }

  /**
   */
  public static final class EmployerNotificationServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployerNotificationServiceStub> {
    private EmployerNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerNotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void notifyInvitation(com.wanpng.notification.grpc.domain.InvitationResponse request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyApplicantCount(com.wanpng.notification.grpc.domain.ApplicantCount request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyApplicantCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyInterviewSchedule(com.wanpng.notification.grpc.domain.EmployerInterviewSchedule request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyInterviewScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyInterviewScheduleDeclined(com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined request,
        io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyInterviewScheduleDeclinedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployerNotificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployerNotificationServiceBlockingStub> {
    private EmployerNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse notifyInvitation(com.wanpng.notification.grpc.domain.InvitationResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyInvitationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyApplicantCountResponse notifyApplicantCount(com.wanpng.notification.grpc.domain.ApplicantCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyApplicantCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse notifyInterviewSchedule(com.wanpng.notification.grpc.domain.EmployerInterviewSchedule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyInterviewScheduleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse notifyInterviewScheduleDeclined(com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyInterviewScheduleDeclinedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployerNotificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployerNotificationServiceFutureStub> {
    private EmployerNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployerNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployerNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse> notifyInvitation(
        com.wanpng.notification.grpc.domain.InvitationResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyInvitationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyApplicantCountResponse> notifyApplicantCount(
        com.wanpng.notification.grpc.domain.ApplicantCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyApplicantCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> notifyInterviewSchedule(
        com.wanpng.notification.grpc.domain.EmployerInterviewSchedule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyInterviewScheduleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse> notifyInterviewScheduleDeclined(
        com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyInterviewScheduleDeclinedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_INVITATION = 0;
  private static final int METHODID_NOTIFY_APPLICANT_COUNT = 1;
  private static final int METHODID_NOTIFY_INTERVIEW_SCHEDULE = 2;
  private static final int METHODID_NOTIFY_INTERVIEW_SCHEDULE_DECLINED = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployerNotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployerNotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY_INVITATION:
          serviceImpl.notifyInvitation((com.wanpng.notification.grpc.domain.InvitationResponse) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInvitationResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_APPLICANT_COUNT:
          serviceImpl.notifyApplicantCount((com.wanpng.notification.grpc.domain.ApplicantCount) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyApplicantCountResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_INTERVIEW_SCHEDULE:
          serviceImpl.notifyInterviewSchedule((com.wanpng.notification.grpc.domain.EmployerInterviewSchedule) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_INTERVIEW_SCHEDULE_DECLINED:
          serviceImpl.notifyInterviewScheduleDeclined((com.wanpng.notification.grpc.domain.EmployerInterviewScheduleDeclined) request,
              (io.grpc.stub.StreamObserver<com.wanpng.notification.grpc.service.NotifyEmployerInterviewScheduleResponse>) responseObserver);
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

  private static abstract class EmployerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployerNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.notification.grpc.service.EmployerNotificationProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployerNotificationService");
    }
  }

  private static final class EmployerNotificationServiceFileDescriptorSupplier
      extends EmployerNotificationServiceBaseDescriptorSupplier {
    EmployerNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class EmployerNotificationServiceMethodDescriptorSupplier
      extends EmployerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployerNotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployerNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployerNotificationServiceFileDescriptorSupplier())
              .addMethod(getNotifyInvitationMethod())
              .addMethod(getNotifyApplicantCountMethod())
              .addMethod(getNotifyInterviewScheduleMethod())
              .addMethod(getNotifyInterviewScheduleDeclinedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
