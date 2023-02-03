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

package google.devtools.cloudbuild.v2;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import google.devtools.cloudbuild.v2.stub.RepositoryManagerStub;
import google.devtools.cloudbuild.v2.stub.RepositoryManagerStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Manages connections to source code repostiories.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
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
 *
 * <p>Note: close() needs to be called on the RepositoryManagerClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RepositoryManagerSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RepositoryManagerSettings repositoryManagerSettings =
 *     RepositoryManagerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RepositoryManagerClient repositoryManagerClient =
 *     RepositoryManagerClient.create(repositoryManagerSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RepositoryManagerSettings repositoryManagerSettings =
 *     RepositoryManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RepositoryManagerClient repositoryManagerClient =
 *     RepositoryManagerClient.create(repositoryManagerSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RepositoryManagerSettings repositoryManagerSettings =
 *     RepositoryManagerSettings.newHttpJsonBuilder().build();
 * RepositoryManagerClient repositoryManagerClient =
 *     RepositoryManagerClient.create(repositoryManagerSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RepositoryManagerClient implements BackgroundResource {
  private final RepositoryManagerSettings settings;
  private final RepositoryManagerStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of RepositoryManagerClient with default settings. */
  public static final RepositoryManagerClient create() throws IOException {
    return create(RepositoryManagerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RepositoryManagerClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RepositoryManagerClient create(RepositoryManagerSettings settings)
      throws IOException {
    return new RepositoryManagerClient(settings);
  }

  /**
   * Constructs an instance of RepositoryManagerClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(RepositoryManagerSettings).
   */
  public static final RepositoryManagerClient create(RepositoryManagerStub stub) {
    return new RepositoryManagerClient(stub);
  }

  /**
   * Constructs an instance of RepositoryManagerClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected RepositoryManagerClient(RepositoryManagerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RepositoryManagerStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected RepositoryManagerClient(RepositoryManagerStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final RepositoryManagerSettings getSettings() {
    return settings;
  }

  public RepositoryManagerStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Connection connection = Connection.newBuilder().build();
   *   String connectionId = "connectionId1923106969";
   *   Connection response =
   *       repositoryManagerClient.createConnectionAsync(parent, connection, connectionId).get();
   * }
   * }</pre>
   *
   * @param parent Required. Project and location where the connection will be created. Format:
   *     `projects/&#42;/locations/&#42;`.
   * @param connection Required. The Connection to create.
   * @param connectionId Required. The ID to use for the Connection, which will become the final
   *     component of the Connection's resource name. Names must be unique per-project per-location.
   *     Allows alphanumeric characters and any of -._~%!$&amp;'()&#42;+,;={@literal @}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Connection, OperationMetadata> createConnectionAsync(
      LocationName parent, Connection connection, String connectionId) {
    CreateConnectionRequest request =
        CreateConnectionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setConnection(connection)
            .setConnectionId(connectionId)
            .build();
    return createConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   Connection connection = Connection.newBuilder().build();
   *   String connectionId = "connectionId1923106969";
   *   Connection response =
   *       repositoryManagerClient.createConnectionAsync(parent, connection, connectionId).get();
   * }
   * }</pre>
   *
   * @param parent Required. Project and location where the connection will be created. Format:
   *     `projects/&#42;/locations/&#42;`.
   * @param connection Required. The Connection to create.
   * @param connectionId Required. The ID to use for the Connection, which will become the final
   *     component of the Connection's resource name. Names must be unique per-project per-location.
   *     Allows alphanumeric characters and any of -._~%!$&amp;'()&#42;+,;={@literal @}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Connection, OperationMetadata> createConnectionAsync(
      String parent, Connection connection, String connectionId) {
    CreateConnectionRequest request =
        CreateConnectionRequest.newBuilder()
            .setParent(parent)
            .setConnection(connection)
            .setConnectionId(connectionId)
            .build();
    return createConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateConnectionRequest request =
   *       CreateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConnection(Connection.newBuilder().build())
   *           .setConnectionId("connectionId1923106969")
   *           .build();
   *   Connection response = repositoryManagerClient.createConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Connection, OperationMetadata> createConnectionAsync(
      CreateConnectionRequest request) {
    return createConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateConnectionRequest request =
   *       CreateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConnection(Connection.newBuilder().build())
   *           .setConnectionId("connectionId1923106969")
   *           .build();
   *   OperationFuture<Connection, OperationMetadata> future =
   *       repositoryManagerClient.createConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   Connection response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateConnectionRequest, Connection, OperationMetadata>
      createConnectionOperationCallable() {
    return stub.createConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateConnectionRequest request =
   *       CreateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConnection(Connection.newBuilder().build())
   *           .setConnectionId("connectionId1923106969")
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.createConnectionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateConnectionRequest, Operation> createConnectionCallable() {
    return stub.createConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection.
   *
   * <p>Sample code:
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
   *
   * @param name Required. The name of the Connection to retrieve. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Connection getConnection(ConnectionName name) {
    GetConnectionRequest request =
        GetConnectionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String name = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString();
   *   Connection response = repositoryManagerClient.getConnection(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Connection to retrieve. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Connection getConnection(String name) {
    GetConnectionRequest request = GetConnectionRequest.newBuilder().setName(name).build();
    return getConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetConnectionRequest request =
   *       GetConnectionRequest.newBuilder()
   *           .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .build();
   *   Connection response = repositoryManagerClient.getConnection(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Connection getConnection(GetConnectionRequest request) {
    return getConnectionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetConnectionRequest request =
   *       GetConnectionRequest.newBuilder()
   *           .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .build();
   *   ApiFuture<Connection> future =
   *       repositoryManagerClient.getConnectionCallable().futureCall(request);
   *   // Do something.
   *   Connection response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConnectionRequest, Connection> getConnectionCallable() {
    return stub.getConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Connection element : repositoryManagerClient.listConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of Connections. Format:
   *     `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionsPagedResponse listConnections(LocationName parent) {
    ListConnectionsRequest request =
        ListConnectionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Connection element : repositoryManagerClient.listConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of Connections. Format:
   *     `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionsPagedResponse listConnections(String parent) {
    ListConnectionsRequest request = ListConnectionsRequest.newBuilder().setParent(parent).build();
    return listConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListConnectionsRequest request =
   *       ListConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Connection element : repositoryManagerClient.listConnections(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionsPagedResponse listConnections(ListConnectionsRequest request) {
    return listConnectionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListConnectionsRequest request =
   *       ListConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Connection> future =
   *       repositoryManagerClient.listConnectionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Connection element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConnectionsRequest, ListConnectionsPagedResponse>
      listConnectionsPagedCallable() {
    return stub.listConnectionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListConnectionsRequest request =
   *       ListConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListConnectionsResponse response =
   *         repositoryManagerClient.listConnectionsCallable().call(request);
   *     for (Connection element : response.getConnectionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConnectionsRequest, ListConnectionsResponse>
      listConnectionsCallable() {
    return stub.listConnectionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   Connection connection = Connection.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Connection response =
   *       repositoryManagerClient.updateConnectionAsync(connection, updateMask).get();
   * }
   * }</pre>
   *
   * @param connection Required. The Connection to update.
   * @param updateMask The list of fields to be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Connection, OperationMetadata> updateConnectionAsync(
      Connection connection, FieldMask updateMask) {
    UpdateConnectionRequest request =
        UpdateConnectionRequest.newBuilder()
            .setConnection(connection)
            .setUpdateMask(updateMask)
            .build();
    return updateConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   UpdateConnectionRequest request =
   *       UpdateConnectionRequest.newBuilder()
   *           .setConnection(Connection.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setAllowMissing(true)
   *           .setEtag("etag3123477")
   *           .build();
   *   Connection response = repositoryManagerClient.updateConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Connection, OperationMetadata> updateConnectionAsync(
      UpdateConnectionRequest request) {
    return updateConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   UpdateConnectionRequest request =
   *       UpdateConnectionRequest.newBuilder()
   *           .setConnection(Connection.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setAllowMissing(true)
   *           .setEtag("etag3123477")
   *           .build();
   *   OperationFuture<Connection, OperationMetadata> future =
   *       repositoryManagerClient.updateConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   Connection response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateConnectionRequest, Connection, OperationMetadata>
      updateConnectionOperationCallable() {
    return stub.updateConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   UpdateConnectionRequest request =
   *       UpdateConnectionRequest.newBuilder()
   *           .setConnection(Connection.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setAllowMissing(true)
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.updateConnectionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateConnectionRequest, Operation> updateConnectionCallable() {
    return stub.updateConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ConnectionName name = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]");
   *   repositoryManagerClient.deleteConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Connection to delete. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionAsync(
      ConnectionName name) {
    DeleteConnectionRequest request =
        DeleteConnectionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String name = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString();
   *   repositoryManagerClient.deleteConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Connection to delete. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionAsync(String name) {
    DeleteConnectionRequest request = DeleteConnectionRequest.newBuilder().setName(name).build();
    return deleteConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteConnectionRequest request =
   *       DeleteConnectionRequest.newBuilder()
   *           .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   repositoryManagerClient.deleteConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionAsync(
      DeleteConnectionRequest request) {
    return deleteConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteConnectionRequest request =
   *       DeleteConnectionRequest.newBuilder()
   *           .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       repositoryManagerClient.deleteConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteConnectionRequest, Empty, OperationMetadata>
      deleteConnectionOperationCallable() {
    return stub.deleteConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteConnectionRequest request =
   *       DeleteConnectionRequest.newBuilder()
   *           .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.deleteConnectionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteConnectionRequest, Operation> deleteConnectionCallable() {
    return stub.deleteConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ConnectionName parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]");
   *   Repository repository = Repository.newBuilder().build();
   *   String repositoryId = "repositoryId2113747461";
   *   Repository response =
   *       repositoryManagerClient.createRepositoryAsync(parent, repository, repositoryId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The connection to contain the repository. If the request is part of a
   *     BatchCreateRepositoriesRequest, this field should be empty or match the parent specified
   *     there.
   * @param repository Required. The repository to create.
   * @param repositoryId Required. The ID to use for the repository, which will become the final
   *     component of the repository's resource name. This ID should be unique in the connection.
   *     Allows alphanumeric characters and any of -._~%!$&amp;'()&#42;+,;={@literal @}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Repository, OperationMetadata> createRepositoryAsync(
      ConnectionName parent, Repository repository, String repositoryId) {
    CreateRepositoryRequest request =
        CreateRepositoryRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setRepository(repository)
            .setRepositoryId(repositoryId)
            .build();
    return createRepositoryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString();
   *   Repository repository = Repository.newBuilder().build();
   *   String repositoryId = "repositoryId2113747461";
   *   Repository response =
   *       repositoryManagerClient.createRepositoryAsync(parent, repository, repositoryId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The connection to contain the repository. If the request is part of a
   *     BatchCreateRepositoriesRequest, this field should be empty or match the parent specified
   *     there.
   * @param repository Required. The repository to create.
   * @param repositoryId Required. The ID to use for the repository, which will become the final
   *     component of the repository's resource name. This ID should be unique in the connection.
   *     Allows alphanumeric characters and any of -._~%!$&amp;'()&#42;+,;={@literal @}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Repository, OperationMetadata> createRepositoryAsync(
      String parent, Repository repository, String repositoryId) {
    CreateRepositoryRequest request =
        CreateRepositoryRequest.newBuilder()
            .setParent(parent)
            .setRepository(repository)
            .setRepositoryId(repositoryId)
            .build();
    return createRepositoryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateRepositoryRequest request =
   *       CreateRepositoryRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setRepository(Repository.newBuilder().build())
   *           .setRepositoryId("repositoryId2113747461")
   *           .build();
   *   Repository response = repositoryManagerClient.createRepositoryAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Repository, OperationMetadata> createRepositoryAsync(
      CreateRepositoryRequest request) {
    return createRepositoryOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateRepositoryRequest request =
   *       CreateRepositoryRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setRepository(Repository.newBuilder().build())
   *           .setRepositoryId("repositoryId2113747461")
   *           .build();
   *   OperationFuture<Repository, OperationMetadata> future =
   *       repositoryManagerClient.createRepositoryOperationCallable().futureCall(request);
   *   // Do something.
   *   Repository response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationCallable() {
    return stub.createRepositoryOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   CreateRepositoryRequest request =
   *       CreateRepositoryRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setRepository(Repository.newBuilder().build())
   *           .setRepositoryId("repositoryId2113747461")
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.createRepositoryCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateRepositoryRequest, Operation> createRepositoryCallable() {
    return stub.createRepositoryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates multiple repositories inside a connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ConnectionName parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]");
   *   List<CreateRepositoryRequest> requests = new ArrayList<>();
   *   BatchCreateRepositoriesResponse response =
   *       repositoryManagerClient.batchCreateRepositoriesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The connection to contain all the repositories being created. Format:
   *     projects/&#42;/locations/&#42;/connections/&#42; The parent field in the
   *     CreateRepositoryRequest messages must either be empty or match this field.
   * @param requests Required. The request messages specifying the repositories to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateRepositoriesResponse, OperationMetadata>
      batchCreateRepositoriesAsync(ConnectionName parent, List<CreateRepositoryRequest> requests) {
    BatchCreateRepositoriesRequest request =
        BatchCreateRepositoriesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllRequests(requests)
            .build();
    return batchCreateRepositoriesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates multiple repositories inside a connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString();
   *   List<CreateRepositoryRequest> requests = new ArrayList<>();
   *   BatchCreateRepositoriesResponse response =
   *       repositoryManagerClient.batchCreateRepositoriesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The connection to contain all the repositories being created. Format:
   *     projects/&#42;/locations/&#42;/connections/&#42; The parent field in the
   *     CreateRepositoryRequest messages must either be empty or match this field.
   * @param requests Required. The request messages specifying the repositories to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateRepositoriesResponse, OperationMetadata>
      batchCreateRepositoriesAsync(String parent, List<CreateRepositoryRequest> requests) {
    BatchCreateRepositoriesRequest request =
        BatchCreateRepositoriesRequest.newBuilder()
            .setParent(parent)
            .addAllRequests(requests)
            .build();
    return batchCreateRepositoriesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates multiple repositories inside a connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   BatchCreateRepositoriesRequest request =
   *       BatchCreateRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .addAllRequests(new ArrayList<CreateRepositoryRequest>())
   *           .build();
   *   BatchCreateRepositoriesResponse response =
   *       repositoryManagerClient.batchCreateRepositoriesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateRepositoriesResponse, OperationMetadata>
      batchCreateRepositoriesAsync(BatchCreateRepositoriesRequest request) {
    return batchCreateRepositoriesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates multiple repositories inside a connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   BatchCreateRepositoriesRequest request =
   *       BatchCreateRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .addAllRequests(new ArrayList<CreateRepositoryRequest>())
   *           .build();
   *   OperationFuture<BatchCreateRepositoriesResponse, OperationMetadata> future =
   *       repositoryManagerClient.batchCreateRepositoriesOperationCallable().futureCall(request);
   *   // Do something.
   *   BatchCreateRepositoriesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          BatchCreateRepositoriesRequest, BatchCreateRepositoriesResponse, OperationMetadata>
      batchCreateRepositoriesOperationCallable() {
    return stub.batchCreateRepositoriesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates multiple repositories inside a connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   BatchCreateRepositoriesRequest request =
   *       BatchCreateRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .addAllRequests(new ArrayList<CreateRepositoryRequest>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.batchCreateRepositoriesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchCreateRepositoriesRequest, Operation>
      batchCreateRepositoriesCallable() {
    return stub.batchCreateRepositoriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   RepositoryName name =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]");
   *   Repository response = repositoryManagerClient.getRepository(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Repository to retrieve. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Repository getRepository(RepositoryName name) {
    GetRepositoryRequest request =
        GetRepositoryRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getRepository(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String name =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]").toString();
   *   Repository response = repositoryManagerClient.getRepository(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Repository to retrieve. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Repository getRepository(String name) {
    GetRepositoryRequest request = GetRepositoryRequest.newBuilder().setName(name).build();
    return getRepository(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetRepositoryRequest request =
   *       GetRepositoryRequest.newBuilder()
   *           .setName(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   Repository response = repositoryManagerClient.getRepository(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Repository getRepository(GetRepositoryRequest request) {
    return getRepositoryCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetRepositoryRequest request =
   *       GetRepositoryRequest.newBuilder()
   *           .setName(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Repository> future =
   *       repositoryManagerClient.getRepositoryCallable().futureCall(request);
   *   // Do something.
   *   Repository response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRepositoryRequest, Repository> getRepositoryCallable() {
    return stub.getRepositoryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Repositories in a given connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ConnectionName parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]");
   *   for (Repository element : repositoryManagerClient.listRepositories(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of Repositories. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRepositoriesPagedResponse listRepositories(ConnectionName parent) {
    ListRepositoriesRequest request =
        ListRepositoriesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listRepositories(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Repositories in a given connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String parent = ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString();
   *   for (Repository element : repositoryManagerClient.listRepositories(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of Repositories. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRepositoriesPagedResponse listRepositories(String parent) {
    ListRepositoriesRequest request =
        ListRepositoriesRequest.newBuilder().setParent(parent).build();
    return listRepositories(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Repositories in a given connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListRepositoriesRequest request =
   *       ListRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   for (Repository element : repositoryManagerClient.listRepositories(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRepositoriesPagedResponse listRepositories(ListRepositoriesRequest request) {
    return listRepositoriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Repositories in a given connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListRepositoriesRequest request =
   *       ListRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<Repository> future =
   *       repositoryManagerClient.listRepositoriesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Repository element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRepositoriesRequest, ListRepositoriesPagedResponse>
      listRepositoriesPagedCallable() {
    return stub.listRepositoriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Repositories in a given connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   ListRepositoriesRequest request =
   *       ListRepositoriesRequest.newBuilder()
   *           .setParent(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   while (true) {
   *     ListRepositoriesResponse response =
   *         repositoryManagerClient.listRepositoriesCallable().call(request);
   *     for (Repository element : response.getRepositoriesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesCallable() {
    return stub.listRepositoriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   RepositoryName name =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]");
   *   repositoryManagerClient.deleteRepositoryAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Repository to delete. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteRepositoryAsync(
      RepositoryName name) {
    DeleteRepositoryRequest request =
        DeleteRepositoryRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteRepositoryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String name =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]").toString();
   *   repositoryManagerClient.deleteRepositoryAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Repository to delete. Format:
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteRepositoryAsync(String name) {
    DeleteRepositoryRequest request = DeleteRepositoryRequest.newBuilder().setName(name).build();
    return deleteRepositoryAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteRepositoryRequest request =
   *       DeleteRepositoryRequest.newBuilder()
   *           .setName(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   repositoryManagerClient.deleteRepositoryAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteRepositoryAsync(
      DeleteRepositoryRequest request) {
    return deleteRepositoryOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteRepositoryRequest request =
   *       DeleteRepositoryRequest.newBuilder()
   *           .setName(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       repositoryManagerClient.deleteRepositoryOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationCallable() {
    return stub.deleteRepositoryOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   DeleteRepositoryRequest request =
   *       DeleteRepositoryRequest.newBuilder()
   *           .setName(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       repositoryManagerClient.deleteRepositoryCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteRepositoryRequest, Operation> deleteRepositoryCallable() {
    return stub.deleteRepositoryCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read/write token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   RepositoryName repository =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]");
   *   FetchReadWriteTokenResponse response =
   *       repositoryManagerClient.fetchReadWriteToken(repository);
   * }
   * }</pre>
   *
   * @param repository Required. The resource name of the repository in the format
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadWriteTokenResponse fetchReadWriteToken(RepositoryName repository) {
    FetchReadWriteTokenRequest request =
        FetchReadWriteTokenRequest.newBuilder()
            .setRepository(repository == null ? null : repository.toString())
            .build();
    return fetchReadWriteToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read/write token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String repository =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]").toString();
   *   FetchReadWriteTokenResponse response =
   *       repositoryManagerClient.fetchReadWriteToken(repository);
   * }
   * }</pre>
   *
   * @param repository Required. The resource name of the repository in the format
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadWriteTokenResponse fetchReadWriteToken(String repository) {
    FetchReadWriteTokenRequest request =
        FetchReadWriteTokenRequest.newBuilder().setRepository(repository).build();
    return fetchReadWriteToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read/write token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchReadWriteTokenRequest request =
   *       FetchReadWriteTokenRequest.newBuilder()
   *           .setRepository(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   FetchReadWriteTokenResponse response = repositoryManagerClient.fetchReadWriteToken(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadWriteTokenResponse fetchReadWriteToken(FetchReadWriteTokenRequest request) {
    return fetchReadWriteTokenCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read/write token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchReadWriteTokenRequest request =
   *       FetchReadWriteTokenRequest.newBuilder()
   *           .setRepository(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<FetchReadWriteTokenResponse> future =
   *       repositoryManagerClient.fetchReadWriteTokenCallable().futureCall(request);
   *   // Do something.
   *   FetchReadWriteTokenResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchReadWriteTokenRequest, FetchReadWriteTokenResponse>
      fetchReadWriteTokenCallable() {
    return stub.fetchReadWriteTokenCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   RepositoryName repository =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]");
   *   FetchReadTokenResponse response = repositoryManagerClient.fetchReadToken(repository);
   * }
   * }</pre>
   *
   * @param repository Required. The resource name of the repository in the format
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadTokenResponse fetchReadToken(RepositoryName repository) {
    FetchReadTokenRequest request =
        FetchReadTokenRequest.newBuilder()
            .setRepository(repository == null ? null : repository.toString())
            .build();
    return fetchReadToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   String repository =
   *       RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]").toString();
   *   FetchReadTokenResponse response = repositoryManagerClient.fetchReadToken(repository);
   * }
   * }</pre>
   *
   * @param repository Required. The resource name of the repository in the format
   *     `projects/&#42;/locations/&#42;/connections/&#42;/repositories/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadTokenResponse fetchReadToken(String repository) {
    FetchReadTokenRequest request =
        FetchReadTokenRequest.newBuilder().setRepository(repository).build();
    return fetchReadToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchReadTokenRequest request =
   *       FetchReadTokenRequest.newBuilder()
   *           .setRepository(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   FetchReadTokenResponse response = repositoryManagerClient.fetchReadToken(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchReadTokenResponse fetchReadToken(FetchReadTokenRequest request) {
    return fetchReadTokenCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches read token of a given repository.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchReadTokenRequest request =
   *       FetchReadTokenRequest.newBuilder()
   *           .setRepository(
   *               RepositoryName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]", "[REPOSITORY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<FetchReadTokenResponse> future =
   *       repositoryManagerClient.fetchReadTokenCallable().futureCall(request);
   *   // Do something.
   *   FetchReadTokenResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchReadTokenRequest, FetchReadTokenResponse>
      fetchReadTokenCallable() {
    return stub.fetchReadTokenCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * FetchLinkableRepositories get repositories from SCM that are accessible and could be added to
   * the connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchLinkableRepositoriesRequest request =
   *       FetchLinkableRepositoriesRequest.newBuilder()
   *           .setConnection(
   *               ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Repository element :
   *       repositoryManagerClient.fetchLinkableRepositories(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchLinkableRepositoriesPagedResponse fetchLinkableRepositories(
      FetchLinkableRepositoriesRequest request) {
    return fetchLinkableRepositoriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * FetchLinkableRepositories get repositories from SCM that are accessible and could be added to
   * the connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchLinkableRepositoriesRequest request =
   *       FetchLinkableRepositoriesRequest.newBuilder()
   *           .setConnection(
   *               ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Repository> future =
   *       repositoryManagerClient.fetchLinkableRepositoriesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Repository element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesPagedResponse>
      fetchLinkableRepositoriesPagedCallable() {
    return stub.fetchLinkableRepositoriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * FetchLinkableRepositories get repositories from SCM that are accessible and could be added to
   * the connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   FetchLinkableRepositoriesRequest request =
   *       FetchLinkableRepositoriesRequest.newBuilder()
   *           .setConnection(
   *               ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     FetchLinkableRepositoriesResponse response =
   *         repositoryManagerClient.fetchLinkableRepositoriesCallable().call(request);
   *     for (Repository element : response.getRepositoriesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesResponse>
      fetchLinkableRepositoriesCallable() {
    return stub.fetchLinkableRepositoriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = repositoryManagerClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = repositoryManagerClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = repositoryManagerClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future = repositoryManagerClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = repositoryManagerClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       repositoryManagerClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListConnectionsPagedResponse
      extends AbstractPagedListResponse<
          ListConnectionsRequest,
          ListConnectionsResponse,
          Connection,
          ListConnectionsPage,
          ListConnectionsFixedSizeCollection> {

    public static ApiFuture<ListConnectionsPagedResponse> createAsync(
        PageContext<ListConnectionsRequest, ListConnectionsResponse, Connection> context,
        ApiFuture<ListConnectionsResponse> futureResponse) {
      ApiFuture<ListConnectionsPage> futurePage =
          ListConnectionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListConnectionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListConnectionsPagedResponse(ListConnectionsPage page) {
      super(page, ListConnectionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListConnectionsPage
      extends AbstractPage<
          ListConnectionsRequest, ListConnectionsResponse, Connection, ListConnectionsPage> {

    private ListConnectionsPage(
        PageContext<ListConnectionsRequest, ListConnectionsResponse, Connection> context,
        ListConnectionsResponse response) {
      super(context, response);
    }

    private static ListConnectionsPage createEmptyPage() {
      return new ListConnectionsPage(null, null);
    }

    @Override
    protected ListConnectionsPage createPage(
        PageContext<ListConnectionsRequest, ListConnectionsResponse, Connection> context,
        ListConnectionsResponse response) {
      return new ListConnectionsPage(context, response);
    }

    @Override
    public ApiFuture<ListConnectionsPage> createPageAsync(
        PageContext<ListConnectionsRequest, ListConnectionsResponse, Connection> context,
        ApiFuture<ListConnectionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListConnectionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListConnectionsRequest,
          ListConnectionsResponse,
          Connection,
          ListConnectionsPage,
          ListConnectionsFixedSizeCollection> {

    private ListConnectionsFixedSizeCollection(
        List<ListConnectionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListConnectionsFixedSizeCollection createEmptyCollection() {
      return new ListConnectionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListConnectionsFixedSizeCollection createCollection(
        List<ListConnectionsPage> pages, int collectionSize) {
      return new ListConnectionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRepositoriesPagedResponse
      extends AbstractPagedListResponse<
          ListRepositoriesRequest,
          ListRepositoriesResponse,
          Repository,
          ListRepositoriesPage,
          ListRepositoriesFixedSizeCollection> {

    public static ApiFuture<ListRepositoriesPagedResponse> createAsync(
        PageContext<ListRepositoriesRequest, ListRepositoriesResponse, Repository> context,
        ApiFuture<ListRepositoriesResponse> futureResponse) {
      ApiFuture<ListRepositoriesPage> futurePage =
          ListRepositoriesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRepositoriesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRepositoriesPagedResponse(ListRepositoriesPage page) {
      super(page, ListRepositoriesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRepositoriesPage
      extends AbstractPage<
          ListRepositoriesRequest, ListRepositoriesResponse, Repository, ListRepositoriesPage> {

    private ListRepositoriesPage(
        PageContext<ListRepositoriesRequest, ListRepositoriesResponse, Repository> context,
        ListRepositoriesResponse response) {
      super(context, response);
    }

    private static ListRepositoriesPage createEmptyPage() {
      return new ListRepositoriesPage(null, null);
    }

    @Override
    protected ListRepositoriesPage createPage(
        PageContext<ListRepositoriesRequest, ListRepositoriesResponse, Repository> context,
        ListRepositoriesResponse response) {
      return new ListRepositoriesPage(context, response);
    }

    @Override
    public ApiFuture<ListRepositoriesPage> createPageAsync(
        PageContext<ListRepositoriesRequest, ListRepositoriesResponse, Repository> context,
        ApiFuture<ListRepositoriesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRepositoriesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRepositoriesRequest,
          ListRepositoriesResponse,
          Repository,
          ListRepositoriesPage,
          ListRepositoriesFixedSizeCollection> {

    private ListRepositoriesFixedSizeCollection(
        List<ListRepositoriesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRepositoriesFixedSizeCollection createEmptyCollection() {
      return new ListRepositoriesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRepositoriesFixedSizeCollection createCollection(
        List<ListRepositoriesPage> pages, int collectionSize) {
      return new ListRepositoriesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class FetchLinkableRepositoriesPagedResponse
      extends AbstractPagedListResponse<
          FetchLinkableRepositoriesRequest,
          FetchLinkableRepositoriesResponse,
          Repository,
          FetchLinkableRepositoriesPage,
          FetchLinkableRepositoriesFixedSizeCollection> {

    public static ApiFuture<FetchLinkableRepositoriesPagedResponse> createAsync(
        PageContext<FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesResponse, Repository>
            context,
        ApiFuture<FetchLinkableRepositoriesResponse> futureResponse) {
      ApiFuture<FetchLinkableRepositoriesPage> futurePage =
          FetchLinkableRepositoriesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new FetchLinkableRepositoriesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private FetchLinkableRepositoriesPagedResponse(FetchLinkableRepositoriesPage page) {
      super(page, FetchLinkableRepositoriesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class FetchLinkableRepositoriesPage
      extends AbstractPage<
          FetchLinkableRepositoriesRequest,
          FetchLinkableRepositoriesResponse,
          Repository,
          FetchLinkableRepositoriesPage> {

    private FetchLinkableRepositoriesPage(
        PageContext<FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesResponse, Repository>
            context,
        FetchLinkableRepositoriesResponse response) {
      super(context, response);
    }

    private static FetchLinkableRepositoriesPage createEmptyPage() {
      return new FetchLinkableRepositoriesPage(null, null);
    }

    @Override
    protected FetchLinkableRepositoriesPage createPage(
        PageContext<FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesResponse, Repository>
            context,
        FetchLinkableRepositoriesResponse response) {
      return new FetchLinkableRepositoriesPage(context, response);
    }

    @Override
    public ApiFuture<FetchLinkableRepositoriesPage> createPageAsync(
        PageContext<FetchLinkableRepositoriesRequest, FetchLinkableRepositoriesResponse, Repository>
            context,
        ApiFuture<FetchLinkableRepositoriesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class FetchLinkableRepositoriesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          FetchLinkableRepositoriesRequest,
          FetchLinkableRepositoriesResponse,
          Repository,
          FetchLinkableRepositoriesPage,
          FetchLinkableRepositoriesFixedSizeCollection> {

    private FetchLinkableRepositoriesFixedSizeCollection(
        List<FetchLinkableRepositoriesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static FetchLinkableRepositoriesFixedSizeCollection createEmptyCollection() {
      return new FetchLinkableRepositoriesFixedSizeCollection(null, 0);
    }

    @Override
    protected FetchLinkableRepositoriesFixedSizeCollection createCollection(
        List<FetchLinkableRepositoriesPage> pages, int collectionSize) {
      return new FetchLinkableRepositoriesFixedSizeCollection(pages, collectionSize);
    }
  }
}
