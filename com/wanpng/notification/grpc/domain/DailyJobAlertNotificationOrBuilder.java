// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/daily_job_alert_notification.grpc.proto

package com.wanpng.notification.grpc.domain;

public interface DailyJobAlertNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.domain.DailyJobAlertNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string jobseeker_id = 1;</code>
   * @return The jobseekerId.
   */
  java.lang.String getJobseekerId();
  /**
   * <code>string jobseeker_id = 1;</code>
   * @return The bytes for jobseekerId.
   */
  com.google.protobuf.ByteString
      getJobseekerIdBytes();

  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>bool is_viewed = 3;</code>
   * @return The isViewed.
   */
  boolean getIsViewed();

  /**
   * <code>bool is_seen = 4;</code>
   * @return The isSeen.
   */
  boolean getIsSeen();

  /**
   * <code>.google.protobuf.Timestamp updated_when = 5;</code>
   * @return Whether the updatedWhen field is set.
   */
  boolean hasUpdatedWhen();
  /**
   * <code>.google.protobuf.Timestamp updated_when = 5;</code>
   * @return The updatedWhen.
   */
  com.google.protobuf.Timestamp getUpdatedWhen();
  /**
   * <code>.google.protobuf.Timestamp updated_when = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedWhenOrBuilder();

  /**
   * <code>string keyword = 6;</code>
   * @return The keyword.
   */
  java.lang.String getKeyword();
  /**
   * <code>string keyword = 6;</code>
   * @return The bytes for keyword.
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <code>int32 count = 7;</code>
   * @return The count.
   */
  int getCount();
}
