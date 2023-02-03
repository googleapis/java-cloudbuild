/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Build API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= CloudBuildClient =======================
 *
 * <p>Service Description: Creates and manages builds on Google Cloud Platform.
 *
 * <p>Sample for CloudBuildClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) {
 *   SetIamPolicyRequest request =
 *       SetIamPolicyRequest.newBuilder()
 *           .setResource("resource-341064690")
 *           .setPolicy(Policy.newBuilder().build())
 *           .setUpdateMask(FieldMask.newBuilder().build())
 *           .build();
 *   Policy response = cloudBuildClient.setIamPolicy(request);
 * }
 * }</pre>
 *
 * <p>======================= RepositoryManagerClient =======================
 *
 * <p>Service Description: Manages connections to source code repostiories.
 *
 * <p>Sample for RepositoryManagerClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
 *   ConnectionName name = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]");
 *   Connection response = repositoryManagerClient.getConnection(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package google.devtools.cloudbuild.v2;

import javax.annotation.Generated;
