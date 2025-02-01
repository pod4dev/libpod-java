# ExecApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerExecLibpod**](ExecApi.md#containerExecLibpod) | **POST** /libpod/containers/{name}/exec | Create an exec instance |
| [**execInspectLibpod**](ExecApi.md#execInspectLibpod) | **GET** /libpod/exec/{id}/json | Inspect an exec instance |
| [**execResizeLibpod**](ExecApi.md#execResizeLibpod) | **POST** /libpod/exec/{id}/resize | Resize an exec instance |
| [**execStartLibpod**](ExecApi.md#execStartLibpod) | **POST** /libpod/exec/{id}/start | Start an exec instance |


<a id="containerExecLibpod"></a>
# **containerExecLibpod**
> containerExecLibpod(name).control(control).execute();

Create an exec instance

Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecApi apiInstance = new ExecApi(defaultClient);
    String name = "name_example"; // String | name of container
    ContainerExecRequest control = new ContainerExecRequest(); // ContainerExecRequest | Attributes for create
    try {
      apiInstance.containerExecLibpod(name)
            .control(control)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecApi#containerExecLibpod");
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
| **name** | **String**| name of container | |
| **control** | [**ContainerExecRequest**](ContainerExecRequest.md)| Attributes for create | [optional] |

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
| **201** | no error |  -  |
| **404** | No such container |  -  |
| **409** | container is paused |  -  |
| **500** | Internal server error |  -  |

<a id="execInspectLibpod"></a>
# **execInspectLibpod**
> execInspectLibpod(id).execute();

Inspect an exec instance

Return low-level information about an exec instance.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecApi apiInstance = new ExecApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    try {
      apiInstance.execInspectLibpod(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecApi#execInspectLibpod");
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
| **id** | **String**| Exec instance ID | |

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
| **200** | no error |  -  |
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |

<a id="execResizeLibpod"></a>
# **execResizeLibpod**
> execResizeLibpod(id).h(h).w(w).execute();

Resize an exec instance

Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecApi apiInstance = new ExecApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    Integer h = 56; // Integer | Height of the TTY session in characters
    Integer w = 56; // Integer | Width of the TTY session in characters
    try {
      apiInstance.execResizeLibpod(id)
            .h(h)
            .w(w)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecApi#execResizeLibpod");
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
| **id** | **String**| Exec instance ID | |
| **h** | **Integer**| Height of the TTY session in characters | [optional] |
| **w** | **Integer**| Width of the TTY session in characters | [optional] |

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
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |

<a id="execStartLibpod"></a>
# **execStartLibpod**
> execStartLibpod(id).control(control).execute();

Start an exec instance

Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. The stream format is the same as the attach endpoint. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecApi apiInstance = new ExecApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    ExecStartLibpodRequest control = new ExecStartLibpodRequest(); // ExecStartLibpodRequest | Attributes for start
    try {
      apiInstance.execStartLibpod(id)
            .control(control)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecApi#execStartLibpod");
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
| **id** | **String**| Exec instance ID | |
| **control** | [**ExecStartLibpodRequest**](ExecStartLibpodRequest.md)| Attributes for start | [optional] |

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
| **404** | No such exec instance |  -  |
| **409** | container is not running. |  -  |
| **500** | Internal server error |  -  |

