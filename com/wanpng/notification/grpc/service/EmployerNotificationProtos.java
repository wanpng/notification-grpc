// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/employer_notification_service.grpc.proto

package com.wanpng.notification.grpc.service;

public final class EmployerNotificationProtos {
  private EmployerNotificationProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_NotifyEmployerInvitationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_NotifyEmployerInvitationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_NotifyApplicantCountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_NotifyApplicantCountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_NotifyEmployerInterviewScheduleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_NotifyEmployerInterviewScheduleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7protos/service/employer_notification_s" +
      "ervice.grpc.proto\022\016protos.service\032,proto" +
      "s/domain/invitation_response.grpc.proto\032" +
      "(protos/domain/applicant_count.grpc.prot" +
      "o\032/protos/domain/employer_interview_sche" +
      "dule.proto\".\n NotifyEmployerInvitationRe" +
      "sponse\022\n\n\002id\030\001 \001(\t\"*\n\034NotifyApplicantCou" +
      "ntResponse\022\n\n\002id\030\001 \001(\t\"5\n\'NotifyEmployer" +
      "InterviewScheduleResponse\022\n\n\002id\030\001 \001(\t2\351\002" +
      "\n\033EmployerNotificationService\022g\n\020NotifyI" +
      "nvitation\022!.protos.domain.InvitationResp" +
      "onse\0320.protos.service.NotifyEmployerInvi" +
      "tationResponse\022c\n\024NotifyApplicantCount\022\035" +
      ".protos.domain.ApplicantCount\032,.protos.s" +
      "ervice.NotifyApplicantCountResponse\022|\n\027N" +
      "otifyInterviewSchedule\022(.protos.domain.E" +
      "mployerInterviewSchedule\0327.protos.servic" +
      "e.NotifyEmployerInterviewScheduleRespons" +
      "eBv\n$com.wanpng.notification.grpc.servic" +
      "eB\032EmployerNotificationProtosP\001Z0github." +
      "com/wanpng/notification-grpc/grpc/servic" +
      "eb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanpng.notification.grpc.domain.InvitationResponseProtos.getDescriptor(),
          com.wanpng.notification.grpc.domain.ApplicationCountProtos.getDescriptor(),
          com.wanpng.notification.grpc.domain.EmployerInterviewScheduleProtos.getDescriptor(),
        });
    internal_static_protos_service_NotifyEmployerInvitationResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_service_NotifyEmployerInvitationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_NotifyEmployerInvitationResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_protos_service_NotifyApplicantCountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_service_NotifyApplicantCountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_NotifyApplicantCountResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_protos_service_NotifyEmployerInterviewScheduleResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protos_service_NotifyEmployerInterviewScheduleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_NotifyEmployerInterviewScheduleResponse_descriptor,
        new java.lang.String[] { "Id", });
    com.wanpng.notification.grpc.domain.InvitationResponseProtos.getDescriptor();
    com.wanpng.notification.grpc.domain.ApplicationCountProtos.getDescriptor();
    com.wanpng.notification.grpc.domain.EmployerInterviewScheduleProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
