// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/jobseeker_interview_schedule.proto

package com.wanpng.notification.grpc.domain;

public final class JobseekerInterviewScheduleProtos {
  private JobseekerInterviewScheduleProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_JobseekerInterviewSchedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_JobseekerInterviewSchedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0protos/domain/jobseeker_interview_sche" +
      "dule.proto\022\rprotos.domain\032\037google/protob" +
      "uf/timestamp.proto\"\273\001\n\032JobseekerIntervie" +
      "wSchedule\022\024\n\014jobseeker_id\030\001 \001(\t\022\014\n\004type\030" +
      "\002 \001(\t\022\021\n\tis_viewed\030\003 \001(\010\022\017\n\007is_seen\030\004 \001(" +
      "\010\0220\n\014updated_when\030\005 \001(\0132\032.google.protobu" +
      "f.Timestamp\022\023\n\013employer_id\030\006 \001(\t\022\016\n\006job_" +
      "id\030\007 \001(\tBz\n#com.wanpng.notification.grpc" +
      ".domainB JobseekerInterviewScheduleProto" +
      "sP\001Z/github.com/wanpng/notification-grpc" +
      "/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_protos_domain_JobseekerInterviewSchedule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_JobseekerInterviewSchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_JobseekerInterviewSchedule_descriptor,
        new java.lang.String[] { "JobseekerId", "Type", "IsViewed", "IsSeen", "UpdatedWhen", "EmployerId", "JobId", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
