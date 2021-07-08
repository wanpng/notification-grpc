// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/applicant_count.grpc.proto

package com.wanpng.notification.grpc.domain;

/**
 * Protobuf type {@code protos.domain.ApplicantCount}
 */
public final class ApplicantCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.domain.ApplicantCount)
    ApplicantCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplicantCount.newBuilder() to construct.
  private ApplicantCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplicantCount() {
    userId_ = "";
    employerId_ = "";
    type_ = "";
    jobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplicantCount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplicantCount(
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

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            employerId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 32: {

            isViewed_ = input.readBool();
            break;
          }
          case 40: {

            isSeen_ = input.readBool();
            break;
          }
          case 50: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (updatedWhen_ != null) {
              subBuilder = updatedWhen_.toBuilder();
            }
            updatedWhen_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updatedWhen_);
              updatedWhen_ = subBuilder.buildPartial();
            }

            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            jobId_ = s;
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
    return com.wanpng.notification.grpc.domain.ApplicationCountProtos.internal_static_protos_domain_ApplicantCount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.notification.grpc.domain.ApplicationCountProtos.internal_static_protos_domain_ApplicantCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.notification.grpc.domain.ApplicantCount.class, com.wanpng.notification.grpc.domain.ApplicantCount.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMPLOYER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object employerId_;
  /**
   * <code>string employer_id = 2;</code>
   * @return The employerId.
   */
  @java.lang.Override
  public java.lang.String getEmployerId() {
    java.lang.Object ref = employerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employerId_ = s;
      return s;
    }
  }
  /**
   * <code>string employer_id = 2;</code>
   * @return The bytes for employerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmployerIdBytes() {
    java.lang.Object ref = employerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      employerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_VIEWED_FIELD_NUMBER = 4;
  private boolean isViewed_;
  /**
   * <code>bool is_viewed = 4;</code>
   * @return The isViewed.
   */
  @java.lang.Override
  public boolean getIsViewed() {
    return isViewed_;
  }

  public static final int IS_SEEN_FIELD_NUMBER = 5;
  private boolean isSeen_;
  /**
   * <code>bool is_seen = 5;</code>
   * @return The isSeen.
   */
  @java.lang.Override
  public boolean getIsSeen() {
    return isSeen_;
  }

  public static final int UPDATED_WHEN_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp updatedWhen_;
  /**
   * <code>.google.protobuf.Timestamp updated_when = 6;</code>
   * @return Whether the updatedWhen field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedWhen() {
    return updatedWhen_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_when = 6;</code>
   * @return The updatedWhen.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedWhen() {
    return updatedWhen_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedWhen_;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_when = 6;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedWhenOrBuilder() {
    return getUpdatedWhen();
  }

  public static final int JOB_ID_FIELD_NUMBER = 7;
  private volatile java.lang.Object jobId_;
  /**
   * <code>string job_id = 7;</code>
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
   * <code>string job_id = 7;</code>
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
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getEmployerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, employerId_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (isViewed_ != false) {
      output.writeBool(4, isViewed_);
    }
    if (isSeen_ != false) {
      output.writeBool(5, isSeen_);
    }
    if (updatedWhen_ != null) {
      output.writeMessage(6, getUpdatedWhen());
    }
    if (!getJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, jobId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getEmployerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, employerId_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (isViewed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isViewed_);
    }
    if (isSeen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isSeen_);
    }
    if (updatedWhen_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getUpdatedWhen());
    }
    if (!getJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, jobId_);
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
    if (!(obj instanceof com.wanpng.notification.grpc.domain.ApplicantCount)) {
      return super.equals(obj);
    }
    com.wanpng.notification.grpc.domain.ApplicantCount other = (com.wanpng.notification.grpc.domain.ApplicantCount) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getEmployerId()
        .equals(other.getEmployerId())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (getIsViewed()
        != other.getIsViewed()) return false;
    if (getIsSeen()
        != other.getIsSeen()) return false;
    if (hasUpdatedWhen() != other.hasUpdatedWhen()) return false;
    if (hasUpdatedWhen()) {
      if (!getUpdatedWhen()
          .equals(other.getUpdatedWhen())) return false;
    }
    if (!getJobId()
        .equals(other.getJobId())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + EMPLOYER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmployerId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + IS_VIEWED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsViewed());
    hash = (37 * hash) + IS_SEEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSeen());
    if (hasUpdatedWhen()) {
      hash = (37 * hash) + UPDATED_WHEN_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedWhen().hashCode();
    }
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.notification.grpc.domain.ApplicantCount parseFrom(
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
  public static Builder newBuilder(com.wanpng.notification.grpc.domain.ApplicantCount prototype) {
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
   * Protobuf type {@code protos.domain.ApplicantCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.domain.ApplicantCount)
      com.wanpng.notification.grpc.domain.ApplicantCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.notification.grpc.domain.ApplicationCountProtos.internal_static_protos_domain_ApplicantCount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.notification.grpc.domain.ApplicationCountProtos.internal_static_protos_domain_ApplicantCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.notification.grpc.domain.ApplicantCount.class, com.wanpng.notification.grpc.domain.ApplicantCount.Builder.class);
    }

    // Construct using com.wanpng.notification.grpc.domain.ApplicantCount.newBuilder()
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
      userId_ = "";

      employerId_ = "";

      type_ = "";

      isViewed_ = false;

      isSeen_ = false;

      if (updatedWhenBuilder_ == null) {
        updatedWhen_ = null;
      } else {
        updatedWhen_ = null;
        updatedWhenBuilder_ = null;
      }
      jobId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.notification.grpc.domain.ApplicationCountProtos.internal_static_protos_domain_ApplicantCount_descriptor;
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.ApplicantCount getDefaultInstanceForType() {
      return com.wanpng.notification.grpc.domain.ApplicantCount.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.ApplicantCount build() {
      com.wanpng.notification.grpc.domain.ApplicantCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.notification.grpc.domain.ApplicantCount buildPartial() {
      com.wanpng.notification.grpc.domain.ApplicantCount result = new com.wanpng.notification.grpc.domain.ApplicantCount(this);
      result.userId_ = userId_;
      result.employerId_ = employerId_;
      result.type_ = type_;
      result.isViewed_ = isViewed_;
      result.isSeen_ = isSeen_;
      if (updatedWhenBuilder_ == null) {
        result.updatedWhen_ = updatedWhen_;
      } else {
        result.updatedWhen_ = updatedWhenBuilder_.build();
      }
      result.jobId_ = jobId_;
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
      if (other instanceof com.wanpng.notification.grpc.domain.ApplicantCount) {
        return mergeFrom((com.wanpng.notification.grpc.domain.ApplicantCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.notification.grpc.domain.ApplicantCount other) {
      if (other == com.wanpng.notification.grpc.domain.ApplicantCount.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getEmployerId().isEmpty()) {
        employerId_ = other.employerId_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getIsViewed() != false) {
        setIsViewed(other.getIsViewed());
      }
      if (other.getIsSeen() != false) {
        setIsSeen(other.getIsSeen());
      }
      if (other.hasUpdatedWhen()) {
        mergeUpdatedWhen(other.getUpdatedWhen());
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
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
      com.wanpng.notification.grpc.domain.ApplicantCount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.notification.grpc.domain.ApplicantCount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object employerId_ = "";
    /**
     * <code>string employer_id = 2;</code>
     * @return The employerId.
     */
    public java.lang.String getEmployerId() {
      java.lang.Object ref = employerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string employer_id = 2;</code>
     * @return The bytes for employerId.
     */
    public com.google.protobuf.ByteString
        getEmployerIdBytes() {
      java.lang.Object ref = employerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        employerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string employer_id = 2;</code>
     * @param value The employerId to set.
     * @return This builder for chaining.
     */
    public Builder setEmployerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      employerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string employer_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmployerId() {
      
      employerId_ = getDefaultInstance().getEmployerId();
      onChanged();
      return this;
    }
    /**
     * <code>string employer_id = 2;</code>
     * @param value The bytes for employerId to set.
     * @return This builder for chaining.
     */
    public Builder setEmployerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      employerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private boolean isViewed_ ;
    /**
     * <code>bool is_viewed = 4;</code>
     * @return The isViewed.
     */
    @java.lang.Override
    public boolean getIsViewed() {
      return isViewed_;
    }
    /**
     * <code>bool is_viewed = 4;</code>
     * @param value The isViewed to set.
     * @return This builder for chaining.
     */
    public Builder setIsViewed(boolean value) {
      
      isViewed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_viewed = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsViewed() {
      
      isViewed_ = false;
      onChanged();
      return this;
    }

    private boolean isSeen_ ;
    /**
     * <code>bool is_seen = 5;</code>
     * @return The isSeen.
     */
    @java.lang.Override
    public boolean getIsSeen() {
      return isSeen_;
    }
    /**
     * <code>bool is_seen = 5;</code>
     * @param value The isSeen to set.
     * @return This builder for chaining.
     */
    public Builder setIsSeen(boolean value) {
      
      isSeen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_seen = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSeen() {
      
      isSeen_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updatedWhen_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedWhenBuilder_;
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     * @return Whether the updatedWhen field is set.
     */
    public boolean hasUpdatedWhen() {
      return updatedWhenBuilder_ != null || updatedWhen_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     * @return The updatedWhen.
     */
    public com.google.protobuf.Timestamp getUpdatedWhen() {
      if (updatedWhenBuilder_ == null) {
        return updatedWhen_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedWhen_;
      } else {
        return updatedWhenBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public Builder setUpdatedWhen(com.google.protobuf.Timestamp value) {
      if (updatedWhenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedWhen_ = value;
        onChanged();
      } else {
        updatedWhenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public Builder setUpdatedWhen(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedWhenBuilder_ == null) {
        updatedWhen_ = builderForValue.build();
        onChanged();
      } else {
        updatedWhenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public Builder mergeUpdatedWhen(com.google.protobuf.Timestamp value) {
      if (updatedWhenBuilder_ == null) {
        if (updatedWhen_ != null) {
          updatedWhen_ =
            com.google.protobuf.Timestamp.newBuilder(updatedWhen_).mergeFrom(value).buildPartial();
        } else {
          updatedWhen_ = value;
        }
        onChanged();
      } else {
        updatedWhenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public Builder clearUpdatedWhen() {
      if (updatedWhenBuilder_ == null) {
        updatedWhen_ = null;
        onChanged();
      } else {
        updatedWhen_ = null;
        updatedWhenBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedWhenBuilder() {
      
      onChanged();
      return getUpdatedWhenFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedWhenOrBuilder() {
      if (updatedWhenBuilder_ != null) {
        return updatedWhenBuilder_.getMessageOrBuilder();
      } else {
        return updatedWhen_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedWhen_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_when = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedWhenFieldBuilder() {
      if (updatedWhenBuilder_ == null) {
        updatedWhenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedWhen(),
                getParentForChildren(),
                isClean());
        updatedWhen_ = null;
      }
      return updatedWhenBuilder_;
    }

    private java.lang.Object jobId_ = "";
    /**
     * <code>string job_id = 7;</code>
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
     * <code>string job_id = 7;</code>
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
     * <code>string job_id = 7;</code>
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
     * <code>string job_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      
      jobId_ = getDefaultInstance().getJobId();
      onChanged();
      return this;
    }
    /**
     * <code>string job_id = 7;</code>
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


    // @@protoc_insertion_point(builder_scope:protos.domain.ApplicantCount)
  }

  // @@protoc_insertion_point(class_scope:protos.domain.ApplicantCount)
  private static final com.wanpng.notification.grpc.domain.ApplicantCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.notification.grpc.domain.ApplicantCount();
  }

  public static com.wanpng.notification.grpc.domain.ApplicantCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicantCount>
      PARSER = new com.google.protobuf.AbstractParser<ApplicantCount>() {
    @java.lang.Override
    public ApplicantCount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplicantCount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplicantCount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicantCount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.notification.grpc.domain.ApplicantCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

