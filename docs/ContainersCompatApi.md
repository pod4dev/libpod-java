# ContainersCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerArchive**](ContainersCompatApi.md#containerArchive) | **GET** /containers/{name}/archive | Get files from a container |
| [**containerArchiveLibpod**](ContainersCompatApi.md#containerArchiveLibpod) | **GET** /libpod/containers/{name}/archive | Copy files from a container |
| [**containerAttach**](ContainersCompatApi.md#containerAttach) | **POST** /containers/{name}/attach | Attach to a container |
| [**containerChangesLibpod**](ContainersCompatApi.md#containerChangesLibpod) | **GET** /libpod/containers/{name}/changes | Report on changes to container&#39;s filesystem; adds, deletes or modifications. |
| [**containerCreate**](ContainersCompatApi.md#containerCreate) | **POST** /containers/create | Create a container |
| [**containerDelete**](ContainersCompatApi.md#containerDelete) | **DELETE** /containers/{name} | Remove a container |
| [**containerExport**](ContainersCompatApi.md#containerExport) | **GET** /containers/{name}/export | Export a container |
| [**containerInspect**](ContainersCompatApi.md#containerInspect) | **GET** /containers/{name}/json | Inspect container |
| [**containerKill**](ContainersCompatApi.md#containerKill) | **POST** /containers/{name}/kill | Kill container |
| [**containerList**](ContainersCompatApi.md#containerList) | **GET** /containers/json | List containers |
| [**containerLogs**](ContainersCompatApi.md#containerLogs) | **GET** /containers/{name}/logs | Get container logs |
| [**containerPause**](ContainersCompatApi.md#containerPause) | **POST** /containers/{name}/pause | Pause container |
| [**containerPrune**](ContainersCompatApi.md#containerPrune) | **POST** /containers/prune | Delete stopped containers |
| [**containerRename**](ContainersCompatApi.md#containerRename) | **POST** /containers/{name}/rename | Rename an existing container |
| [**containerResize**](ContainersCompatApi.md#containerResize) | **POST** /containers/{name}/resize | Resize a container&#39;s TTY |
| [**containerRestart**](ContainersCompatApi.md#containerRestart) | **POST** /containers/{name}/restart | Restart container |
| [**containerStart**](ContainersCompatApi.md#containerStart) | **POST** /containers/{name}/start | Start a container |
| [**containerStats**](ContainersCompatApi.md#containerStats) | **GET** /containers/{name}/stats | Get stats for a container |
| [**containerStop**](ContainersCompatApi.md#containerStop) | **POST** /containers/{name}/stop | Stop a container |
| [**containerTop**](ContainersCompatApi.md#containerTop) | **GET** /containers/{name}/top | List processes running inside a container |
| [**containerUnpause**](ContainersCompatApi.md#containerUnpause) | **POST** /containers/{name}/unpause | Unpause container |
| [**containerUpdate**](ContainersCompatApi.md#containerUpdate) | **POST** /containers/{name}/update | Update configuration of an existing container |
| [**containerWait**](ContainersCompatApi.md#containerWait) | **POST** /containers/{name}/wait | Wait on a container |
| [**imageCommit**](ContainersCompatApi.md#imageCommit) | **POST** /commit | New Image |
| [**putContainerArchive**](ContainersCompatApi.md#putContainerArchive) | **PUT** /containers/{name}/archive | Put files into a container |


<a name="containerArchive"></a>
# **containerArchive**
> File containerArchive(name, path).execute();

Get files from a container

Get a tar archive of files from a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | container name or id
    String path = "path_example"; // String | Path to a directory in the container to extract
    try {
      File result = apiInstance.containerArchive(name, path)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| container name or id | |
| **path** | **String**| Path to a directory in the container to extract | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerArchiveLibpod"></a>
# **containerArchiveLibpod**
> File containerArchiveLibpod(name, path).rename(rename).execute();

Copy files from a container

Copy a tar archive of files from a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | container name or id
    String path = "path_example"; // String | Path to a directory in the container to extract
    String rename = "rename_example"; // String | JSON encoded map[string]string to translate paths
    try {
      File result = apiInstance.containerArchiveLibpod(name, path)
            .rename(rename)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerArchiveLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| container name or id | |
| **path** | **String**| Path to a directory in the container to extract | |
| **rename** | **String**| JSON encoded map[string]string to translate paths | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerAttach"></a>
# **containerAttach**
> containerAttach(name).detachKeys(detachKeys).logs(logs).stream(stream).stdout(stdout).stderr(stderr).stdin(stdin).execute();

Attach to a container

Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  It uses the same stream format as docker, see the libpod attach endpoint for a description of the format. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String detachKeys = "detachKeys_example"; // String | keys to use for detaching from the container
    Boolean logs = true; // Boolean | Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set
    Boolean stream = true; // Boolean | Attach to the container. If unset, and logs is set, only the container's logs will be sent. At least one of stream or logs must be set
    Boolean stdout = true; // Boolean | Attach to container STDOUT
    Boolean stderr = true; // Boolean | Attach to container STDERR
    Boolean stdin = true; // Boolean | Attach to container STDIN
    try {
      apiInstance.containerAttach(name)
            .detachKeys(detachKeys)
            .logs(logs)
            .stream(stream)
            .stdout(stdout)
            .stderr(stderr)
            .stdin(stdin)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerAttach");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| keys to use for detaching from the container | [optional] |
| **logs** | **Boolean**| Stream all logs from the container across the connection. Happens before streaming attach (if requested). At least one of logs or stream must be set | [optional] |
| **stream** | **Boolean**| Attach to the container. If unset, and logs is set, only the container&#39;s logs will be sent. At least one of stream or logs must be set | [optional] [default to true] |
| **stdout** | **Boolean**| Attach to container STDOUT | [optional] |
| **stderr** | **Boolean**| Attach to container STDERR | [optional] |
| **stdin** | **Boolean**| Attach to container STDIN | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **101** | No error, connection has been hijacked for transporting streams. |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerChangesLibpod"></a>
# **containerChangesLibpod**
> containerChangesLibpod(name).parent(parent).diffType(diffType).execute();

Report on changes to container&#39;s filesystem; adds, deletes or modifications.

Returns which files in a container&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or id of the container
    String parent = "parent_example"; // String | specify a second layer which is used to compare against it instead of the parent layer
    String diffType = "all"; // String | select what you want to match, default is all
    try {
      apiInstance.containerChangesLibpod(name)
            .parent(parent)
            .diffType(diffType)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerChangesLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **parent** | **String**| specify a second layer which is used to compare against it instead of the parent layer | [optional] |
| **diffType** | **String**| select what you want to match, default is all | [optional] [enum: all, container, image] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Changes |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerCreate"></a>
# **containerCreate**
> ContainerCreateResponse containerCreate(body).name(name).execute();

Create a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    CreateContainerConfig body = new CreateContainerConfig(); // CreateContainerConfig | Container to create
    String name = "name_example"; // String | container name
    try {
      ContainerCreateResponse result = apiInstance.containerCreate(body)
            .name(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateContainerConfig**](CreateContainerConfig.md)| Container to create | |
| **name** | **String**| container name | [optional] |

### Return type

[**ContainerCreateResponse**](ContainerCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create container |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a name="containerDelete"></a>
# **containerDelete**
> containerDelete(name).force(force).v(v).link(link).execute();

Remove a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Boolean force = false; // Boolean | If the container is running, kill it before removing it.
    Boolean v = false; // Boolean | Remove the volumes associated with the container.
    Boolean link = true; // Boolean | not supported
    try {
      apiInstance.containerDelete(name)
            .force(force)
            .v(v)
            .link(link)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **force** | **Boolean**| If the container is running, kill it before removing it. | [optional] [default to false] |
| **v** | **Boolean**| Remove the volumes associated with the container. | [optional] [default to false] |
| **link** | **Boolean**| not supported | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a name="containerExport"></a>
# **containerExport**
> containerExport(name).execute();

Export a container

Export the contents of a container as a tarball.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      apiInstance.containerExport(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tarball is returned in body |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerInspect"></a>
# **containerInspect**
> ContainerJSON containerInspect(name).size(size).execute();

Inspect container

Return low-level information about a container.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or id of the container
    Boolean size = false; // Boolean | include the size of the container
    try {
      ContainerJSON result = apiInstance.containerInspect(name)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerInspect");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or id of the container | |
| **size** | **Boolean**| include the size of the container | [optional] [default to false] |

### Return type

[**ContainerJSON**](ContainerJSON.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerKill"></a>
# **containerKill**
> containerKill(name).all(all).signal(signal).execute();

Kill container

Signal to send to the container as an integer or string (e.g. SIGINT)

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Boolean all = false; // Boolean | Send kill signal to all containers
    String signal = "SIGKILL"; // String | signal to be sent to container
    try {
      apiInstance.containerKill(name)
            .all(all)
            .signal(signal)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerKill");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **all** | **Boolean**| Send kill signal to all containers | [optional] [default to false] |
| **signal** | **String**| signal to be sent to container | [optional] [default to SIGKILL] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a name="containerList"></a>
# **containerList**
> List&lt;Container&gt; containerList().all(all).external(external).limit(limit).size(size).filters(filters).execute();

List containers

Returns a list of containers

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    Boolean all = false; // Boolean | Return all containers. By default, only running containers are shown
    Boolean external = false; // Boolean | Return containers in storage not controlled by Podman
    Integer limit = 56; // Integer | Return this number of most recently created containers, including non-running ones.
    Boolean size = false; // Boolean | Return the size of container as fields SizeRw and SizeRootFs.
    String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the containers list. Available filters: - `ancestor`=(`<image-name>[:<tag>]`, `<image id>`, or `<image@digest>`) - `before`=(`<container id>` or `<container name>`) - `expose`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `exited=<int>` containers with exit code of `<int>` - `health`=(`starting`, `healthy`, `unhealthy` or `none`) - `id=<ID>` a container's ID - `is-task`=(`true` or `false`) - `label`=(`key` or `\"key=value\"`) of a container label - `name=<name>` a container's name - `network`=(`<network id>` or `<network name>`) - `publish`=(`<port>[/<proto>]` or `<startport-endport>/[<proto>]`) - `since`=(`<container id>` or `<container name>`) - `status`=(`created`, `restarting`, `running`, `removing`, `paused`, `exited` or `dead`) - `volume`=(`<volume name>` or `<mount point destination>`) 
    try {
      List<Container> result = apiInstance.containerList()
            .all(all)
            .external(external)
            .limit(limit)
            .size(size)
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **all** | **Boolean**| Return all containers. By default, only running containers are shown | [optional] [default to false] |
| **external** | **Boolean**| Return containers in storage not controlled by Podman | [optional] [default to false] |
| **limit** | **Integer**| Return this number of most recently created containers, including non-running ones. | [optional] |
| **size** | **Boolean**| Return the size of container as fields SizeRw and SizeRootFs. | [optional] [default to false] |
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the containers list. Available filters: - &#x60;ancestor&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;, &#x60;&lt;image id&gt;&#x60;, or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;before&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;expose&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;exited&#x3D;&lt;int&gt;&#x60; containers with exit code of &#x60;&lt;int&gt;&#x60; - &#x60;health&#x60;&#x3D;(&#x60;starting&#x60;, &#x60;healthy&#x60;, &#x60;unhealthy&#x60; or &#x60;none&#x60;) - &#x60;id&#x3D;&lt;ID&gt;&#x60; a container&#39;s ID - &#x60;is-task&#x60;&#x3D;(&#x60;true&#x60; or &#x60;false&#x60;) - &#x60;label&#x60;&#x3D;(&#x60;key&#x60; or &#x60;\&quot;key&#x3D;value\&quot;&#x60;) of a container label - &#x60;name&#x3D;&lt;name&gt;&#x60; a container&#39;s name - &#x60;network&#x60;&#x3D;(&#x60;&lt;network id&gt;&#x60; or &#x60;&lt;network name&gt;&#x60;) - &#x60;publish&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60; or &#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or &#x60;&lt;container name&gt;&#x60;) - &#x60;status&#x60;&#x3D;(&#x60;created&#x60;, &#x60;restarting&#x60;, &#x60;running&#x60;, &#x60;removing&#x60;, &#x60;paused&#x60;, &#x60;exited&#x60; or &#x60;dead&#x60;) - &#x60;volume&#x60;&#x3D;(&#x60;&lt;volume name&gt;&#x60; or &#x60;&lt;mount point destination&gt;&#x60;)  | [optional] |

### Return type

[**List&lt;Container&gt;**](Container.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Containers |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a name="containerLogs"></a>
# **containerLogs**
> containerLogs(name).follow(follow).stdout(stdout).stderr(stderr).since(since).until(until).timestamps(timestamps).tail(tail).execute();

Get container logs

Get stdout and stderr logs from a container.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Boolean follow = true; // Boolean | Keep connection after returning logs.
    Boolean stdout = true; // Boolean | Return logs from stdout
    Boolean stderr = true; // Boolean | Return logs from stderr
    String since = "since_example"; // String | Only return logs since this time, as a UNIX timestamp
    String until = "until_example"; // String | Only return logs before this time, as a UNIX timestamp
    Boolean timestamps = false; // Boolean | Add timestamps to every log line
    String tail = "all"; // String | Only return this number of log lines from the end of the logs
    try {
      apiInstance.containerLogs(name)
            .follow(follow)
            .stdout(stdout)
            .stderr(stderr)
            .since(since)
            .until(until)
            .timestamps(timestamps)
            .tail(tail)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **follow** | **Boolean**| Keep connection after returning logs. | [optional] |
| **stdout** | **Boolean**| Return logs from stdout | [optional] |
| **stderr** | **Boolean**| Return logs from stderr | [optional] |
| **since** | **String**| Only return logs since this time, as a UNIX timestamp | [optional] |
| **until** | **String**| Only return logs before this time, as a UNIX timestamp | [optional] |
| **timestamps** | **Boolean**| Add timestamps to every log line | [optional] [default to false] |
| **tail** | **String**| Only return this number of log lines from the end of the logs | [optional] [default to all] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | logs returned as a stream in response body. |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerPause"></a>
# **containerPause**
> containerPause(name).execute();

Pause container

Use the cgroups freezer to suspend all processes in a container.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      apiInstance.containerPause(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerPause");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerPrune"></a>
# **containerPrune**
> List&lt;ContainersPruneReport&gt; containerPrune().filters(filters).execute();

Delete stopped containers

Remove containers not in use

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String filters = "filters_example"; // String | Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters:  - `until=<timestamp>` Prune containers created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune containers with (or without, in case `label!=...` is used) the specified labels. 
    try {
      List<ContainersPruneReport> result = apiInstance.containerPrune()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerPrune");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | **String**| Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters:  - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune containers created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune containers with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;ContainersPruneReport&gt;**](ContainersPruneReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prune Containers |  -  |
| **500** | Internal server error |  -  |

<a name="containerRename"></a>
# **containerRename**
> containerRename(name, name2).execute();

Rename an existing container

Change the name of an existing container.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | Full or partial ID or full name of the container to rename
    String name2 = "name_example"; // String | New name for the container
    try {
      apiInstance.containerRename(name, name2)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerRename");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to rename | |
| **name2** | **String**| New name for the container | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a name="containerResize"></a>
# **containerResize**
> Object containerResize(name).h(h).w(w).running(running).execute();

Resize a container&#39;s TTY

Resize the terminal attached to a container (for use with Attach).

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Integer h = 56; // Integer | Height to set for the terminal, in characters
    Integer w = 56; // Integer | Width to set for the terminal, in characters
    Boolean running = true; // Boolean | Ignore containers not running errors
    try {
      Object result = apiInstance.containerResize(name)
            .h(h)
            .w(w)
            .running(running)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerResize");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **h** | **Integer**| Height to set for the terminal, in characters | [optional] |
| **w** | **Integer**| Width to set for the terminal, in characters | [optional] |
| **running** | **Boolean**| Ignore containers not running errors | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerRestart"></a>
# **containerRestart**
> containerRestart(name).t(t).execute();

Restart container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Integer t = 56; // Integer | timeout before sending kill signal to container
    try {
      apiInstance.containerRestart(name)
            .t(t)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerRestart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **t** | **Integer**| timeout before sending kill signal to container | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerStart"></a>
# **containerStart**
> containerStart(name).detachKeys(detachKeys).execute();

Start a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String detachKeys = "ctrl-p,ctrl-q"; // String | Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-<value> where <value> is one of: a-z, @, ^, [, , or _.
    try {
      apiInstance.containerStart(name)
            .detachKeys(detachKeys)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerStart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **detachKeys** | **String**| Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-&lt;value&gt; where &lt;value&gt; is one of: a-z, @, ^, [, , or _. | [optional] [default to ctrl-p,ctrl-q] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already started |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerStats"></a>
# **containerStats**
> Object containerStats(name).stream(stream).oneShot(oneShot).execute();

Get stats for a container

This returns a live stream of a container’s resource usage statistics.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Boolean stream = true; // Boolean | Stream the output
    Boolean oneShot = false; // Boolean | Provide a one-shot response in which preCPU stats are blank, resulting in a single cycle return.
    try {
      Object result = apiInstance.containerStats(name)
            .stream(stream)
            .oneShot(oneShot)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **stream** | **Boolean**| Stream the output | [optional] [default to true] |
| **oneShot** | **Boolean**| Provide a one-shot response in which preCPU stats are blank, resulting in a single cycle return. | [optional] [default to false] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerStop"></a>
# **containerStop**
> containerStop(name).t(t).execute();

Stop a container

Stop a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Integer t = 56; // Integer | number of seconds to wait before killing container
    try {
      apiInstance.containerStop(name)
            .t(t)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **t** | **Integer**| number of seconds to wait before killing container | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **304** | Container already stopped |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerTop"></a>
# **containerTop**
> ContainerTopOKBody containerTop(name).psArgs(psArgs).execute();

List processes running inside a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String psArgs = "-ef"; // String | arguments to pass to ps such as aux.
    try {
      ContainerTopOKBody result = apiInstance.containerTop(name)
            .psArgs(psArgs)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerTop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **psArgs** | **String**| arguments to pass to ps such as aux. | [optional] [default to -ef] |

### Return type

[**ContainerTopOKBody**](ContainerTopOKBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List processes in container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerUnpause"></a>
# **containerUnpause**
> containerUnpause(name).execute();

Unpause container

Resume a paused container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      apiInstance.containerUnpause(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerUnpause");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerUpdate"></a>
# **containerUpdate**
> containerUpdate(name).resources(resources).execute();

Update configuration of an existing container

Change configuration settings for an existing container without requiring recreation.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | Full or partial ID or full name of the container to rename
    UpdateConfig resources = new UpdateConfig(); // UpdateConfig | attributes for updating the container
    try {
      apiInstance.containerUpdate(name)
            .resources(resources)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Full or partial ID or full name of the container to rename | |
| **resources** | **UpdateConfig**| attributes for updating the container | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="containerWait"></a>
# **containerWait**
> ContainerWait200Response containerWait(name).condition(condition).interval(interval).execute();

Wait on a container

Block until a container stops or given condition is met.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String condition = "condition_example"; // String | wait until container is to a given condition. default is stopped. valid conditions are:   - configured   - created   - exited   - paused   - running   - stopped 
    String interval = "250ms"; // String | Time Interval to wait before polling for completion.
    try {
      ContainerWait200Response result = apiInstance.containerWait(name)
            .condition(condition)
            .interval(interval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#containerWait");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the container | |
| **condition** | **String**| wait until container is to a given condition. default is stopped. valid conditions are:   - configured   - created   - exited   - paused   - running   - stopped  | [optional] |
| **interval** | **String**| Time Interval to wait before polling for completion. | [optional] [default to 250ms] |

### Return type

[**ContainerWait200Response**](ContainerWait200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wait container |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a name="imageCommit"></a>
# **imageCommit**
> imageCommit().container(container).repo(repo).tag(tag).comment(comment).author(author).pause(pause).changes(changes).squash(squash).execute();

New Image

Create a new image from a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String container = "container_example"; // String | the name or ID of a container
    String repo = "repo_example"; // String | the repository name for the created image
    String tag = "tag_example"; // String | tag name for the created image
    String comment = "comment_example"; // String | commit message
    String author = "author_example"; // String | author of the image
    Boolean pause = true; // Boolean | pause the container before committing it
    String changes = "changes_example"; // String | instructions to apply while committing in Dockerfile format
    Boolean squash = true; // Boolean | squash newly built layers into a single new layer
    try {
      apiInstance.imageCommit()
            .container(container)
            .repo(repo)
            .tag(tag)
            .comment(comment)
            .author(author)
            .pause(pause)
            .changes(changes)
            .squash(squash)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#imageCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **container** | **String**| the name or ID of a container | [optional] |
| **repo** | **String**| the repository name for the created image | [optional] |
| **tag** | **String**| tag name for the created image | [optional] |
| **comment** | **String**| commit message | [optional] |
| **author** | **String**| author of the image | [optional] |
| **pause** | **Boolean**| pause the container before committing it | [optional] |
| **changes** | **String**| instructions to apply while committing in Dockerfile format | [optional] |
| **squash** | **Boolean**| squash newly built layers into a single new layer | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | no error |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a name="putContainerArchive"></a>
# **putContainerArchive**
> putContainerArchive(name, path).noOverwriteDirNonDir(noOverwriteDirNonDir).copyUIDGID(copyUIDGID).request(request).execute();

Put files into a container

Put a tar archive of files into a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ContainersCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ContainersCompatApi apiInstance = new ContainersCompatApi(defaultClient);
    String name = "name_example"; // String | container name or id
    String path = "path_example"; // String | Path to a directory in the container to extract
    String noOverwriteDirNonDir = "noOverwriteDirNonDir_example"; // String | if unpacking the given content would cause an existing directory to be replaced with a non-directory and vice versa (1 or true)
    String copyUIDGID = "copyUIDGID_example"; // String | copy UID/GID maps to the dest file or di (1 or true)
    String request = "request_example"; // String | tarfile of files to copy into the container
    try {
      apiInstance.putContainerArchive(name, path)
            .noOverwriteDirNonDir(noOverwriteDirNonDir)
            .copyUIDGID(copyUIDGID)
            .request(request)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersCompatApi#putContainerArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| container name or id | |
| **path** | **String**| Path to a directory in the container to extract | |
| **noOverwriteDirNonDir** | **String**| if unpacking the given content would cause an existing directory to be replaced with a non-directory and vice versa (1 or true) | [optional] |
| **copyUIDGID** | **String**| copy UID/GID maps to the dest file or di (1 or true) | [optional] |
| **request** | **String**| tarfile of files to copy into the container | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **400** | Bad parameter in request |  -  |
| **403** | the container rootfs is read-only |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

