// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.17.3
// source: protos/service/jobseeker_notification_service.grpc.proto

package service

import (
	domain "github.com/wanpng/notification-grpc/grpc/domain"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type NotifyJobseekerInvitationResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *NotifyJobseekerInvitationResponse) Reset() {
	*x = NotifyJobseekerInvitationResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotifyJobseekerInvitationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotifyJobseekerInvitationResponse) ProtoMessage() {}

func (x *NotifyJobseekerInvitationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotifyJobseekerInvitationResponse.ProtoReflect.Descriptor instead.
func (*NotifyJobseekerInvitationResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_notification_service_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *NotifyJobseekerInvitationResponse) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type NotifyApplicationStatusChangeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ApplicationStatusChanges []*domain.ApplicationStatusChange `protobuf:"bytes,1,rep,name=applicationStatusChanges,proto3" json:"applicationStatusChanges,omitempty"`
}

func (x *NotifyApplicationStatusChangeRequest) Reset() {
	*x = NotifyApplicationStatusChangeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotifyApplicationStatusChangeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotifyApplicationStatusChangeRequest) ProtoMessage() {}

func (x *NotifyApplicationStatusChangeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotifyApplicationStatusChangeRequest.ProtoReflect.Descriptor instead.
func (*NotifyApplicationStatusChangeRequest) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_notification_service_grpc_proto_rawDescGZIP(), []int{1}
}

func (x *NotifyApplicationStatusChangeRequest) GetApplicationStatusChanges() []*domain.ApplicationStatusChange {
	if x != nil {
		return x.ApplicationStatusChanges
	}
	return nil
}

type NotifyApplicationStatusChangeResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	StatusId int32  `protobuf:"varint,1,opt,name=statusId,proto3" json:"statusId,omitempty"`
	Status   string `protobuf:"bytes,2,opt,name=status,proto3" json:"status,omitempty"`
}

func (x *NotifyApplicationStatusChangeResponse) Reset() {
	*x = NotifyApplicationStatusChangeResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotifyApplicationStatusChangeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotifyApplicationStatusChangeResponse) ProtoMessage() {}

func (x *NotifyApplicationStatusChangeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotifyApplicationStatusChangeResponse.ProtoReflect.Descriptor instead.
func (*NotifyApplicationStatusChangeResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_notification_service_grpc_proto_rawDescGZIP(), []int{2}
}

func (x *NotifyApplicationStatusChangeResponse) GetStatusId() int32 {
	if x != nil {
		return x.StatusId
	}
	return 0
}

func (x *NotifyApplicationStatusChangeResponse) GetStatus() string {
	if x != nil {
		return x.Status
	}
	return ""
}

type NotifyJobseekerInterviewScheduleResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *NotifyJobseekerInterviewScheduleResponse) Reset() {
	*x = NotifyJobseekerInterviewScheduleResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotifyJobseekerInterviewScheduleResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotifyJobseekerInterviewScheduleResponse) ProtoMessage() {}

func (x *NotifyJobseekerInterviewScheduleResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotifyJobseekerInterviewScheduleResponse.ProtoReflect.Descriptor instead.
func (*NotifyJobseekerInterviewScheduleResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_notification_service_grpc_proto_rawDescGZIP(), []int{3}
}

func (x *NotifyJobseekerInterviewScheduleResponse) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

var File_protos_service_jobseeker_notification_service_grpc_proto protoreflect.FileDescriptor

var file_protos_service_jobseeker_notification_service_grpc_proto_rawDesc = []byte{
	0x0a, 0x38, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2f, 0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x5f, 0x6e, 0x6f, 0x74, 0x69, 0x66,
	0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x1a, 0x2b, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x67, 0x72, 0x70,
	0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f,
	0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x5f, 0x63, 0x68, 0x61, 0x6e, 0x67, 0x65,
	0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x6a, 0x6f, 0x62, 0x73, 0x65,
	0x65, 0x6b, 0x65, 0x72, 0x5f, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x73,
	0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x33, 0x0a,
	0x21, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72,
	0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02,
	0x69, 0x64, 0x22, 0x8a, 0x01, 0x0a, 0x24, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x41, 0x70, 0x70,
	0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x68,
	0x61, 0x6e, 0x67, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x62, 0x0a, 0x18, 0x61,
	0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x26, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x41, 0x70,
	0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43,
	0x68, 0x61, 0x6e, 0x67, 0x65, 0x52, 0x18, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x73, 0x22,
	0x5b, 0x0a, 0x25, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x41, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x08, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x49, 0x64, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x22, 0x3a, 0x0a, 0x28,
	0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x49,
	0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x32, 0x96, 0x03, 0x0a, 0x1c, 0x4a, 0x6f, 0x62,
	0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x67, 0x0a, 0x10, 0x4e, 0x6f, 0x74,
	0x69, 0x66, 0x79, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x20, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x49, 0x6e,
	0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x31, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72,
	0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x8c, 0x01, 0x0a, 0x1d, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x41, 0x70, 0x70,
	0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x68,
	0x61, 0x6e, 0x67, 0x65, 0x12, 0x34, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x41, 0x70, 0x70, 0x6c,
	0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x68, 0x61,
	0x6e, 0x67, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x35, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x69,
	0x66, 0x79, 0x41, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x7e, 0x0a, 0x17, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x49, 0x6e, 0x74, 0x65, 0x72,
	0x76, 0x69, 0x65, 0x77, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x12, 0x29, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x4a, 0x6f, 0x62,
	0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x53,
	0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x1a, 0x38, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73,
	0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x4a,
	0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65,
	0x77, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x42, 0x77, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x67, 0x72, 0x70,
	0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x42, 0x1b, 0x4a, 0x6f, 0x62, 0x73, 0x65,
	0x65, 0x6b, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x50, 0x01, 0x5a, 0x30, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x6e, 0x6f, 0x74, 0x69,
	0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72,
	0x70, 0x63, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_protos_service_jobseeker_notification_service_grpc_proto_rawDescOnce sync.Once
	file_protos_service_jobseeker_notification_service_grpc_proto_rawDescData = file_protos_service_jobseeker_notification_service_grpc_proto_rawDesc
)

func file_protos_service_jobseeker_notification_service_grpc_proto_rawDescGZIP() []byte {
	file_protos_service_jobseeker_notification_service_grpc_proto_rawDescOnce.Do(func() {
		file_protos_service_jobseeker_notification_service_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_service_jobseeker_notification_service_grpc_proto_rawDescData)
	})
	return file_protos_service_jobseeker_notification_service_grpc_proto_rawDescData
}

var file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_protos_service_jobseeker_notification_service_grpc_proto_goTypes = []interface{}{
	(*NotifyJobseekerInvitationResponse)(nil),        // 0: protos.service.NotifyJobseekerInvitationResponse
	(*NotifyApplicationStatusChangeRequest)(nil),     // 1: protos.service.NotifyApplicationStatusChangeRequest
	(*NotifyApplicationStatusChangeResponse)(nil),    // 2: protos.service.NotifyApplicationStatusChangeResponse
	(*NotifyJobseekerInterviewScheduleResponse)(nil), // 3: protos.service.NotifyJobseekerInterviewScheduleResponse
	(*domain.ApplicationStatusChange)(nil),           // 4: protos.domain.ApplicationStatusChange
	(*domain.InvitationRequest)(nil),                 // 5: protos.domain.InvitationRequest
	(*domain.JobseekerInterviewSchedule)(nil),        // 6: protos.domain.JobseekerInterviewSchedule
}
var file_protos_service_jobseeker_notification_service_grpc_proto_depIdxs = []int32{
	4, // 0: protos.service.NotifyApplicationStatusChangeRequest.applicationStatusChanges:type_name -> protos.domain.ApplicationStatusChange
	5, // 1: protos.service.JobseekerNotificationService.NotifyInvitation:input_type -> protos.domain.InvitationRequest
	1, // 2: protos.service.JobseekerNotificationService.NotifyApplicationStatusChange:input_type -> protos.service.NotifyApplicationStatusChangeRequest
	6, // 3: protos.service.JobseekerNotificationService.NotifyInterviewSchedule:input_type -> protos.domain.JobseekerInterviewSchedule
	0, // 4: protos.service.JobseekerNotificationService.NotifyInvitation:output_type -> protos.service.NotifyJobseekerInvitationResponse
	2, // 5: protos.service.JobseekerNotificationService.NotifyApplicationStatusChange:output_type -> protos.service.NotifyApplicationStatusChangeResponse
	3, // 6: protos.service.JobseekerNotificationService.NotifyInterviewSchedule:output_type -> protos.service.NotifyJobseekerInterviewScheduleResponse
	4, // [4:7] is the sub-list for method output_type
	1, // [1:4] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_protos_service_jobseeker_notification_service_grpc_proto_init() }
func file_protos_service_jobseeker_notification_service_grpc_proto_init() {
	if File_protos_service_jobseeker_notification_service_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotifyJobseekerInvitationResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotifyApplicationStatusChangeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotifyApplicationStatusChangeResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotifyJobseekerInterviewScheduleResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_service_jobseeker_notification_service_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_protos_service_jobseeker_notification_service_grpc_proto_goTypes,
		DependencyIndexes: file_protos_service_jobseeker_notification_service_grpc_proto_depIdxs,
		MessageInfos:      file_protos_service_jobseeker_notification_service_grpc_proto_msgTypes,
	}.Build()
	File_protos_service_jobseeker_notification_service_grpc_proto = out.File
	file_protos_service_jobseeker_notification_service_grpc_proto_rawDesc = nil
	file_protos_service_jobseeker_notification_service_grpc_proto_goTypes = nil
	file_protos_service_jobseeker_notification_service_grpc_proto_depIdxs = nil
}
