// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/daily_job_alert_notification.grpc.proto

package com.wanpng.notification.grpc.domain;

public final class DailyJobAlertNotificationProtos {
  private DailyJobAlertNotificationProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_DailyJobAlertNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_DailyJobAlertNotification_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5protos/domain/daily_job_alert_notifica" +
      "tion.grpc.proto\022\rprotos.domain\032\037google/p" +
      "rotobuf/timestamp.proto\"\324\001\n\031DailyJobAler" +
      "tNotification\022\024\n\014jobseeker_id\030\001 \001(\t\022\014\n\004t" +
      "ype\030\002 \001(\t\022\021\n\tis_viewed\030\003 \001(\010\022\017\n\007is_seen\030" +
      "\004 \001(\010\0220\n\014updated_when\030\005 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022\017\n\007keyword\030\006 \001(\t\022\r\n\005coun" +
      "t\030\007 \001(\005\022\013\n\003url\030\010 \001(\t\022\020\n\010province\030\t \001(\tBy" +
      "\n#com.wanpng.notification.grpc.domainB\037D" +
      "ailyJobAlertNotificationProtosP\001Z/github" +
      ".com/wanpng/notification-grpc/grpc/domai" +
      "nb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_protos_domain_DailyJobAlertNotification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_DailyJobAlertNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_DailyJobAlertNotification_descriptor,
        new java.lang.String[] { "JobseekerId", "Type", "IsViewed", "IsSeen", "UpdatedWhen", "Keyword", "Count", "Url", "Province", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
