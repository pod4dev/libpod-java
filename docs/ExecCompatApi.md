# ExecCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerExec**](ExecCompatApi.md#containerExec) | **POST** /containers/{name}/exec | Create an exec instance |
| [**execInspect**](ExecCompatApi.md#execInspect) | **GET** /exec/{id}/json | Inspect an exec instance |
| [**execResize**](ExecCompatApi.md#execResize) | **POST** /exec/{id}/resize | Resize an exec instance |
| [**execStart**](ExecCompatApi.md#execStart) | **POST** /exec/{id}/start | Start an exec instance |


<a id="containerExec"></a>
# **containerExec**
> containerExec(name).control(control).execute();

Create an exec instance

Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecCompatApi apiInstance = new ExecCompatApi(defaultClient);
    String name = "name_example"; // String | name of container
    ContainerExecRequest control = new ContainerExecRequest(); // ContainerExecRequest | Attributes for create
    try {
      apiInstance.containerExec(name)
            .control(control)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecCompatApi#containerExec");
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

<a id="execInspect"></a>
# **execInspect**
> InspectExecSession execInspect(id).execute();

Inspect an exec instance

Return low-level information about an exec instance.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecCompatApi apiInstance = new ExecCompatApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    try {
      InspectExecSession result = apiInstance.execInspect(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecCompatApi#execInspect");
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

[**InspectExecSession**](InspectExecSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exec Session Inspect |  -  |
| **404** | No such exec instance |  -  |
| **500** | Internal server error |  -  |

<a id="execResize"></a>
# **execResize**
> execResize(id).h(h).w(w).running(running).execute();

Resize an exec instance

Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecCompatApi apiInstance = new ExecCompatApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    Integer h = 56; // Integer | Height of the TTY session in characters
    Integer w = 56; // Integer | Width of the TTY session in characters
    Boolean running = true; // Boolean | Ignore containers not running errors
    try {
      apiInstance.execResize(id)
            .h(h)
            .w(w)
            .running(running)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecCompatApi#execResize");
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
| **running** | **Boolean**| Ignore containers not running errors | [optional] |

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

<a id="execStart"></a>
# **execStart**
> execStart(id).control(control).execute();

Start an exec instance

Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ExecCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ExecCompatApi apiInstance = new ExecCompatApi(defaultClient);
    String id = "id_example"; // String | Exec instance ID
    ExecStartRequest control = new ExecStartRequest(); // ExecStartRequest | Attributes for start
    try {
      apiInstance.execStart(id)
            .control(control)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecCompatApi#execStart");
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
| **control** | [**ExecStartRequest**](ExecStartRequest.md)| Attributes for start | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such exec instance |  -  |
| **409** | container is not running |  -  |
| **500** | Internal server error |  -  |

