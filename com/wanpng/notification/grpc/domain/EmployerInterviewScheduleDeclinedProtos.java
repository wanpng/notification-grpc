// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/employer_interview_schedule_declined.grpc.proto

package com.wanpng.notification.grpc.domain;

public final class EmployerInterviewScheduleDeclinedProtos {
  private EmployerInterviewScheduleDeclinedProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_EmployerInterviewScheduleDeclined_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_EmployerInterviewScheduleDeclined_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=protos/domain/employer_interview_sched" +
      "ule_declined.grpc.proto\022\rprotos.domain\032\037" +
      "google/protobuf/timestamp.proto\"\323\001\n!Empl" +
      "oyerInterviewScheduleDeclined\022\017\n\007user_id" +
      "\030\001 \001(\t\022\023\n\013employer_id\030\002 \001(\t\022\014\n\004type\030\003 \001(" +
      "\t\022\021\n\tis_viewed\030\004 \001(\010\022\017\n\007is_seen\030\005 \001(\010\0220\n" +
      "\014updated_when\030\006 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022\016\n\006job_id\030\007 \001(\t\022\024\n\014jobseeker_id\030" +
      "\010 \001(\tB\201\001\n#com.wanpng.notification.grpc.d" +
      "omainB\'EmployerInterviewScheduleDeclined" +
      "ProtosP\001Z/github.com/wanpng/notification" +
      "-grpc/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_protos_domain_EmployerInterviewScheduleDeclined_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_EmployerInterviewScheduleDeclined_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_EmployerInterviewScheduleDeclined_descriptor,
        new java.lang.String[] { "UserId", "EmployerId", "Type", "IsViewed", "IsSeen", "UpdatedWhen", "JobId", "JobseekerId", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
