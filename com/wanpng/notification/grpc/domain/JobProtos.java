// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/job.grpc.proto

package com.wanpng.notification.grpc.domain;

public final class JobProtos {
  private JobProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_Job_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034protos/domain/job.grpc.proto\022\rprotos.d" +
      "omain\"(\n\003Job\022\016\n\006job_id\030\001 \001(\t\022\021\n\tjob_titl" +
      "e\030\002 \001(\tBc\n#com.wanpng.notification.grpc." +
      "domainB\tJobProtosP\001Z/github.com/wanpng/n" +
      "otification-grpc/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_Job_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_Job_descriptor,
        new java.lang.String[] { "JobId", "JobTitle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
