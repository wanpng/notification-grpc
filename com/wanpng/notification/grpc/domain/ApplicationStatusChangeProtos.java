// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/application_status_change.grpc.proto

package com.wanpng.notification.grpc.domain;

public final class ApplicationStatusChangeProtos {
  private ApplicationStatusChangeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_ApplicationStatusChange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_ApplicationStatusChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2protos/domain/application_status_chang" +
      "e.grpc.proto\022\rprotos.domain\032\037google/prot" +
      "obuf/timestamp.proto\"\333\001\n\027ApplicationStat" +
      "usChange\022\024\n\014jobseeker_id\030\001 \001(\t\022\014\n\004type\030\002" +
      " \001(\t\022\021\n\tis_viewed\030\003 \001(\010\022\017\n\007is_seen\030\004 \001(\010" +
      "\0220\n\014updated_when\030\005 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\023\n\013employer_id\030\006 \001(\t\022\016\n\006job_i" +
      "d\030\007 \001(\t\022\021\n\tstatus_id\030\010 \001(\005\022\016\n\006status\030\t \001" +
      "(\tBw\n#com.wanpng.notification.grpc.domai" +
      "nB\035ApplicationStatusChangeProtosP\001Z/gith" +
      "ub.com/wanpng/notification-grpc/grpc/dom" +
      "ainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_protos_domain_ApplicationStatusChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_ApplicationStatusChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_ApplicationStatusChange_descriptor,
        new java.lang.String[] { "JobseekerId", "Type", "IsViewed", "IsSeen", "UpdatedWhen", "EmployerId", "JobId", "StatusId", "Status", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
