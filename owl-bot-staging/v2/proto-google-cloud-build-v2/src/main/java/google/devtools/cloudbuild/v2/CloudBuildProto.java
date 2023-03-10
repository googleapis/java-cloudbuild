// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/cloudbuild.proto

package google.devtools.cloudbuild.v2;

public final class CloudBuildProto {
  private CloudBuildProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudbuild_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/devtools/cloudbuild/v2/cloudbui" +
      "ld.proto\022\035google.devtools.cloudbuild.v2\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\200\002\n\021Operatio" +
      "nMetadata\0224\n\013create_time\030\001 \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(" +
      "\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n\006ta" +
      "rget\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016st" +
      "atus_message\030\005 \001(\tB\003\340A\003\022#\n\026requested_can" +
      "cellation\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(" +
      "\tB\003\340A\003\"\222\002\n\"RunWorkflowCustomOperationMet" +
      "adata\0224\n\013create_time\030\001 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\022\021\n\004verb\030\003" +
      " \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\004 \001(" +
      "\010B\003\340A\003\022\030\n\013api_version\030\005 \001(\tB\003\340A\003\022\023\n\006targ" +
      "et\030\006 \001(\tB\003\340A\003\022\034\n\017pipeline_run_id\030\007 \001(\tB\003" +
      "\340A\003B\261\005\n\035google.devtools.cloudbuild.v2B\017C" +
      "loudBuildProtoP\001ZGgoogle.golang.org/genp" +
      "roto/googleapis/devtools/cloudbuild/v2;c" +
      "loudbuild\242\002\003GCB\252\002\032Google.Cloud.CloudBuil" +
      "d.V2\312\002\025Google\\Cloud\\Build\\V2\352\002\030Google::C" +
      "loud::Build::V2\352AN\n\036compute.googleapis.c" +
      "om/Network\022,projects/{project}/global/ne" +
      "tworks/{network}\352AY\n!iam.googleapis.com/" +
      "ServiceAccount\0224projects/{project}/servi" +
      "ceAccounts/{service_account}\352AJ\n#secretm" +
      "anager.googleapis.com/Secret\022#projects/{" +
      "project}/secrets/{secret}\352Ad\n*secretmana" +
      "ger.googleapis.com/SecretVersion\0226projec" +
      "ts/{project}/secrets/{secret}/versions/{" +
      "version}\352A|\n0cloudbuild.googleapis.com/g" +
      "ithubEnterpriseConfig\022Hprojects/{project" +
      "}/locations/{location}/githubEnterpriseC" +
      "onfigs/{config}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudbuild_v2_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Verb", "RequestedCancellation", "ApiVersion", "Target", "PipelineRunId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
