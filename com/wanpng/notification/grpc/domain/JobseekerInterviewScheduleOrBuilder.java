// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/jobseeker_interview_schedule.proto

package com.wanpng.notification.grpc.domain;

public interface JobseekerInterviewScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.domain.JobseekerInterviewSchedule)
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
   * <code>string user_id = 6;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 6;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string employer_id = 7;</code>
   * @return The employerId.
   */
  java.lang.String getEmployerId();
  /**
   * <code>string employer_id = 7;</code>
   * @return The bytes for employerId.
   */
  com.google.protobuf.ByteString
      getEmployerIdBytes();

  /**
   * <code>string job_id = 8;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <code>string job_id = 8;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();
}
