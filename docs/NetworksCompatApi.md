# NetworksCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**networkConnect**](NetworksCompatApi.md#networkConnect) | **POST** /networks/{name}/connect | Connect container to network |
| [**networkCreate**](NetworksCompatApi.md#networkCreate) | **POST** /networks/create | Create network |
| [**networkDelete**](NetworksCompatApi.md#networkDelete) | **DELETE** /networks/{name} | Remove a network |
| [**networkDisconnect**](NetworksCompatApi.md#networkDisconnect) | **POST** /networks/{name}/disconnect | Disconnect container from network |
| [**networkInspect**](NetworksCompatApi.md#networkInspect) | **GET** /networks/{name} | Inspect a network |
| [**networkList**](NetworksCompatApi.md#networkList) | **GET** /networks | List networks |
| [**networkPrune**](NetworksCompatApi.md#networkPrune) | **POST** /networks/prune | Delete unused networks |


<a name="networkConnect"></a>
# **networkConnect**
> networkConnect(name).create(create).execute();

Connect container to network

Connect a container to a network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    ConnectOptions create = new ConnectOptions(); // ConnectOptions | attributes for connecting a container to a network
    try {
      apiInstance.networkConnect(name)
            .create(create)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkConnect");
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
| **name** | **String**| the name of the network | |
| **create** | **ConnectOptions**| attributes for connecting a container to a network | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad parameter in request |  -  |
| **403** | Network is already connected and container is running or transitioning to the running state (&#39;initialized&#39;) |  -  |
| **500** | Internal server error |  -  |

<a name="networkCreate"></a>
# **networkCreate**
> NetworkCreate201Response networkCreate().create(create).execute();

Create network

Create a network configuration

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    CreateRequest create = new CreateRequest(); // CreateRequest | attributes for creating a network
    try {
      NetworkCreate201Response result = apiInstance.networkCreate()
            .create(create)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkCreate");
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
| **create** | **CreateRequest**| attributes for creating a network | [optional] |

### Return type

[**NetworkCreate201Response**](NetworkCreate201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | network created |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a name="networkDelete"></a>
# **networkDelete**
> networkDelete(name).execute();

Remove a network

Remove a network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    try {
      apiInstance.networkDelete(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkDelete");
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
| **name** | **String**| the name of the network | |

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
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a name="networkDisconnect"></a>
# **networkDisconnect**
> networkDisconnect(name).create(create).execute();

Disconnect container from network

Disconnect a container from a network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    DisconnectOptions create = new DisconnectOptions(); // DisconnectOptions | attributes for disconnecting a container from a network
    try {
      apiInstance.networkDisconnect(name)
            .create(create)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkDisconnect");
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
| **name** | **String**| the name of the network | |
| **create** | **DisconnectOptions**| attributes for disconnecting a container from a network | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a name="networkInspect"></a>
# **networkInspect**
> Inspect networkInspect(name).verbose(verbose).scope(scope).execute();

Inspect a network

Display low level configuration network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    Boolean verbose = true; // Boolean | Detailed inspect output for troubleshooting
    String scope = "scope_example"; // String | Filter the network by scope (swarm, global, or local)
    try {
      Inspect result = apiInstance.networkInspect(name)
            .verbose(verbose)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkInspect");
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
| **name** | **String**| the name of the network | |
| **verbose** | **Boolean**| Detailed inspect output for troubleshooting | [optional] |
| **scope** | **String**| Filter the network by scope (swarm, global, or local) | [optional] |

### Return type

[**Inspect**](Inspect.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network inspect |  -  |
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a name="networkList"></a>
# **networkList**
> List&lt;Inspect&gt; networkList().filters(filters).execute();

List networks

Display summary of network configurations

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the network list. Currently available filters:   - `name=[name]` Matches network name (accepts regex).   - `id=[id]` Matches for full or partial ID.   - `driver=[driver]` Only bridge is supported.   - `label=[key]` or `label=[key=value]` Matches networks based on the presence of a label alone or a label and a value. 
    try {
      List<Inspect> result = apiInstance.networkList()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkList");
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
| **filters** | **String**| JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the network list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches network name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.   - &#x60;driver&#x3D;[driver]&#x60; Only bridge is supported.   - &#x60;label&#x3D;[key]&#x60; or &#x60;label&#x3D;[key&#x3D;value]&#x60; Matches networks based on the presence of a label alone or a label and a value.  | [optional] |

### Return type

[**List&lt;Inspect&gt;**](Inspect.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network list |  -  |
| **500** | Internal server error |  -  |

<a name="networkPrune"></a>
# **networkPrune**
> NetworkPrune200Response networkPrune().filters(filters).execute();

Delete unused networks

Remove networks that do not have containers

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksCompatApi apiInstance = new NetworksCompatApi(defaultClient);
    String filters = "filters_example"; // String | Filters to process on the prune list, encoded as JSON (a map[string][]string). Available filters:   - `until=<timestamp>` Prune networks created before this timestamp. The <timestamp> can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune networks with (or without, in case `label!=...` is used) the specified labels. 
    try {
      NetworkPrune200Response result = apiInstance.networkPrune()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksCompatApi#networkPrune");
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
| **filters** | **String**| Filters to process on the prune list, encoded as JSON (a map[string][]string). Available filters:   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune networks created before this timestamp. The &lt;timestamp&gt; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune networks with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**NetworkPrune200Response**](NetworkPrune200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal server error |  -  |

