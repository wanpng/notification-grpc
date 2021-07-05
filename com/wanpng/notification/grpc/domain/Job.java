// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/job.grpc.proto

package com.wanpng.notification.grpc.domain;

/**
 * Protobuf type {@code protos.domain.Job}
 */
public final class Job extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.domain.Job)
    JobOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Job.newBuilder() to construct.
  private Job(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Job() {
    jobId_ = "";
    jobTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Job();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Job(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            jobId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jobTitle_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.notification.grpc.domain.JobProtos.internal_static_protos_domain_Job_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.notification.grpc.domain.JobProtos.internal_static_protos_domain_Job_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.notification.grpc.domain.Job.class, com.wanpng.notification.grpc.domain.Job.Builder.class);
  }

  public static final int JOB_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object jobId_;
  /**
   * <code>string job_id = 1;</code>
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   * <code>string job_id = 1;</code>
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobTitle_;
  /**
   * <code>string job_title = 2;</code>
   * @return The jobTitle.
   */
  @java.lang.Override
  public java.lang.String getJobTitle() {
    java.lang.Object ref = jobTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobTitle_ = s;
      return s;
    }
  }
  /**
   * <code>string job_title = 2;</code>
   * @return The bytes for jobTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobTitleBytes() {
    java.lang.Object ref = jobTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobId_);
    }
    if (!getJobTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobTitle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobId_);
    }
    if (!getJobTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobTitle_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanpng.notification.grpc.domain.Job)) {
      return super.equals(obj);
    }
    com.wanpng.notification.grpc.domain.Job other = (com.wanpng.notification.grpc.domain.Job) obj;

    if (!getJobId()
        .equals(other.getJobId())) return false;
    if (!getJobTitle()
        .equals(other.getJobTitle())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (37 * hash) + JOB_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getJobTitle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.Job parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.Job parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.Job parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanpng.notification.grpc.domain.Job prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protos.domain.Job}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.domain.Job)
      com.wanpng.notification.grpc.domain.JobOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.notification.grpc.domain.JobProtos.internal_static_protos_domain_Job_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.notification.grpc.domain.JobProtos.internal_static_protos_domain_Job_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.notification.grpc.domain.Job.class, com.wanpng.notification.grpc.domain.Job.Builder.class);
    }

    // Construct using com.wanpng.notification.grpc.domain.Job.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      jobId_ = "";

      jobTitle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.notification.grpc.domain.JobProtos.internal_static_protos_domain_Job_descriptor;
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.Job getDefaultInstanceForType() {
      return com.wanpng.notification.grpc.domain.Job.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.Job build() {
      com.wanpng.notification.grpc.domain.Job result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.Job buildPartial() {
      com.wanpng.notification.grpc.domain.Job result = new com.wanpng.notification.grpc.domain.Job(this);
      result.jobId_ = jobId_;
      result.jobTitle_ = jobTitle_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanpng.notification.grpc.domain.Job) {
        return mergeFrom((com.wanpng.notification.grpc.domain.Job)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.notification.grpc.domain.Job other) {
      if (other == com.wanpng.notification.grpc.domain.Job.getDefaultInstance()) return this;
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        onChanged();
      }
      if (!other.getJobTitle().isEmpty()) {
        jobTitle_ = other.jobTitle_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanpng.notification.grpc.domain.Job parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.notification.grpc.domain.Job) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     * <code>string job_id = 1;</code>
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string job_id = 1;</code>
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString
        getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string job_id = 1;</code>
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string job_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      
      jobId_ = getDefaultInstance().getJobId();
      onChanged();
      return this;
    }
    /**
     * <code>string job_id = 1;</code>
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jobTitle_ = "";
    /**
     * <code>string job_title = 2;</code>
     * @return The jobTitle.
     */
    public java.lang.String getJobTitle() {
      java.lang.Object ref = jobTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string job_title = 2;</code>
     * @return The bytes for jobTitle.
     */
    public com.google.protobuf.ByteString
        getJobTitleBytes() {
      java.lang.Object ref = jobTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string job_title = 2;</code>
     * @param value The jobTitle to set.
     * @return This builder for chaining.
     */
    public Builder setJobTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string job_title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobTitle() {
      
      jobTitle_ = getDefaultInstance().getJobTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string job_title = 2;</code>
     * @param value The bytes for jobTitle to set.
     * @return This builder for chaining.
     */
    public Builder setJobTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobTitle_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protos.domain.Job)
  }

  // @@protoc_insertion_point(class_scope:protos.domain.Job)
  private static final com.wanpng.notification.grpc.domain.Job DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.notification.grpc.domain.Job();
  }

  public static com.wanpng.notification.grpc.domain.Job getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Job>
      PARSER = new com.google.protobuf.AbstractParser<Job>() {
    @java.lang.Override
    public Job parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Job(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Job> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Job> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.notification.grpc.domain.Job getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
