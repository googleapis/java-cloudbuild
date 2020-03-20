/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface WorkerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.WorkerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Machine Type of the worker, such as n1-standard-1.
   * See https://cloud.google.com/compute/docs/machine-types.
   * If left blank, Cloud Build will use a standard unspecified machine to
   * create the worker pool.
   * `machine_type` is overridden if you specify a different machine type in
   * `build_options`. In this case, the VM specified in the `build_options`
   * will be created on demand at build time. For more information see
   * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Machine Type of the worker, such as n1-standard-1.
   * See https://cloud.google.com/compute/docs/machine-types.
   * If left blank, Cloud Build will use a standard unspecified machine to
   * create the worker pool.
   * `machine_type` is overridden if you specify a different machine type in
   * `build_options`. In this case, the VM specified in the `build_options`
   * will be created on demand at build time. For more information see
   * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Size of the disk attached to the worker, in GB.
   * See https://cloud.google.com/compute/docs/disks/
   * If `0` is specified, Cloud Build will use a standard disk size.
   * `disk_size` is overridden if you specify a different disk size in
   * `build_options`. In this case, a VM with a disk size specified in the
   * `build_options` will be created on demand at build time. For more
   * information see
   * https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
   * </pre>
   *
   * <code>int64 disk_size_gb = 2;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * The network definition used to create the worker.
   * If this section is left empty, the workers will be created in
   * WorkerPool.project_id on the default network.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Network network = 3;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * The network definition used to create the worker.
   * If this section is left empty, the workers will be created in
   * WorkerPool.project_id on the default network.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Network network = 3;</code>
   *
   * @return The network.
   */
  com.google.cloudbuild.v1.Network getNetwork();
  /**
   *
   *
   * <pre>
   * The network definition used to create the worker.
   * If this section is left empty, the workers will be created in
   * WorkerPool.project_id on the default network.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Network network = 3;</code>
   */
  com.google.cloudbuild.v1.NetworkOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * The tag applied to the worker, and the same tag used by the firewall rule.
   * It is used to identify the Cloud Build workers among other VMs.
   * The default value for tag is `worker`.
   * </pre>
   *
   * <code>string tag = 4;</code>
   *
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   *
   *
   * <pre>
   * The tag applied to the worker, and the same tag used by the firewall rule.
   * It is used to identify the Cloud Build workers among other VMs.
   * The default value for tag is `worker`.
   * </pre>
   *
   * <code>string tag = 4;</code>
   *
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString getTagBytes();
}
