// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobseeker_notification_service.grpc.proto

package com.wanpng.notification.grpc.service;

public interface NotifyApplicationStatusChangeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.service.NotifyApplicationStatusChangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protos.domain.ApplicationStatusChange applicationStatusChanges = 1;</code>
   */
  java.util.List<com.wanpng.notification.grpc.domain.ApplicationStatusChange> 
      getApplicationStatusChangesList();
  /**
   * <code>repeated .protos.domain.ApplicationStatusChange applicationStatusChanges = 1;</code>
   */
  com.wanpng.notification.grpc.domain.ApplicationStatusChange getApplicationStatusChanges(int index);
  /**
   * <code>repeated .protos.domain.ApplicationStatusChange applicationStatusChanges = 1;</code>
   */
  int getApplicationStatusChangesCount();
  /**
   * <code>repeated .protos.domain.ApplicationStatusChange applicationStatusChanges = 1;</code>
   */
  java.util.List<? extends com.wanpng.notification.grpc.domain.ApplicationStatusChangeOrBuilder> 
      getApplicationStatusChangesOrBuilderList();
  /**
   * <code>repeated .protos.domain.ApplicationStatusChange applicationStatusChanges = 1;</code>
   */
  com.wanpng.notification.grpc.domain.ApplicationStatusChangeOrBuilder getApplicationStatusChangesOrBuilder(
      int index);
}
