// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobposting_notification_service.grpc.proto

package com.wanpng.notification.grpc.service;

public final class JobPostingNotificationProtos {
  private JobPostingNotificationProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_CloseJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_CloseJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_CloseJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_CloseJobResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9protos/service/jobposting_notification" +
      "_service.grpc.proto\022\016protos.service\"!\n\017C" +
      "loseJobRequest\022\016\n\006job_id\030\001 \001(\t\"\"\n\020CloseJ" +
      "obResponse\022\016\n\006status\030\001 \001(\0102n\n\035JobPosting" +
      "NotificationService\022M\n\010CloseJob\022\037.protos" +
      ".service.CloseJobRequest\032 .protos.servic" +
      "e.CloseJobResponseBx\n$com.wanpng.notific" +
      "ation.grpc.serviceB\034JobPostingNotificati" +
      "onProtosP\001Z0github.com/wanpng/notificati" +
      "on-grpc/grpc/serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_service_CloseJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_service_CloseJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_CloseJobRequest_descriptor,
        new java.lang.String[] { "JobId", });
    internal_static_protos_service_CloseJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_service_CloseJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_CloseJobResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
