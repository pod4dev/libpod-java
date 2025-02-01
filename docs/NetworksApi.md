# NetworksApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**networkConnectLibpod**](NetworksApi.md#networkConnectLibpod) | **POST** /libpod/networks/{name}/connect | Connect container to network |
| [**networkCreateLibpod**](NetworksApi.md#networkCreateLibpod) | **POST** /libpod/networks/create | Create network |
| [**networkDeleteLibpod**](NetworksApi.md#networkDeleteLibpod) | **DELETE** /libpod/networks/{name} | Remove a network |
| [**networkDisconnectLibpod**](NetworksApi.md#networkDisconnectLibpod) | **POST** /libpod/networks/{name}/disconnect | Disconnect container from network |
| [**networkExistsLibpod**](NetworksApi.md#networkExistsLibpod) | **GET** /libpod/networks/{name}/exists | Network exists |
| [**networkInspectLibpod**](NetworksApi.md#networkInspectLibpod) | **GET** /libpod/networks/{name}/json | Inspect a network |
| [**networkListLibpod**](NetworksApi.md#networkListLibpod) | **GET** /libpod/networks/json | List networks |
| [**networkPruneLibpod**](NetworksApi.md#networkPruneLibpod) | **POST** /libpod/networks/prune | Delete unused networks |
| [**networkUpdateLibpod**](NetworksApi.md#networkUpdateLibpod) | **POST** /libpod/networks/{name}/update | Update existing podman network |


<a id="networkConnectLibpod"></a>
# **networkConnectLibpod**
> networkConnectLibpod(name).create(create).execute();

Connect container to network

Connect a container to a network.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    NetworkConnectOptions create = new NetworkConnectOptions(); // NetworkConnectOptions | attributes for connecting a container to a network
    try {
      apiInstance.networkConnectLibpod(name)
            .create(create)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkConnectLibpod");
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
| **create** | **NetworkConnectOptions**| attributes for connecting a container to a network | [optional] |

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
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a id="networkCreateLibpod"></a>
# **networkCreateLibpod**
> Network networkCreateLibpod().create(create).execute();

Create network

Create a new network configuration

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    NetworkCreateLibpod create = new NetworkCreateLibpod(); // NetworkCreateLibpod | attributes for creating a network
    try {
      Network result = apiInstance.networkCreateLibpod()
            .create(create)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkCreateLibpod");
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
| **create** | [**NetworkCreateLibpod**](NetworkCreateLibpod.md)| attributes for creating a network | [optional] |

### Return type

[**Network**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network create |  -  |
| **400** | Bad parameter in request |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a id="networkDeleteLibpod"></a>
# **networkDeleteLibpod**
> List&lt;NetworkRmReport&gt; networkDeleteLibpod(name).force(force).execute();

Remove a network

Remove a configured network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    Boolean force = true; // Boolean | remove containers associated with network
    try {
      List<NetworkRmReport> result = apiInstance.networkDeleteLibpod(name)
            .force(force)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkDeleteLibpod");
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
| **force** | **Boolean**| remove containers associated with network | [optional] |

### Return type

[**List&lt;NetworkRmReport&gt;**](NetworkRmReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network Delete |  -  |
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a id="networkDisconnectLibpod"></a>
# **networkDisconnectLibpod**
> networkDisconnectLibpod(name).create(create).execute();

Disconnect container from network

Disconnect a container from a network.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    DisconnectOptions create = new DisconnectOptions(); // DisconnectOptions | attributes for disconnecting a container from a network
    try {
      apiInstance.networkDisconnectLibpod(name)
            .create(create)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkDisconnectLibpod");
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
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a id="networkExistsLibpod"></a>
# **networkExistsLibpod**
> networkExistsLibpod(name).execute();

Network exists

Check if network exists

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the network
    try {
      apiInstance.networkExistsLibpod(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkExistsLibpod");
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
| **name** | **String**| the name or ID of the network | |

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
| **204** | network exists |  -  |
| **404** | No such network |  -  |
| **500** | Internal server error |  -  |

<a id="networkInspectLibpod"></a>
# **networkInspectLibpod**
> NetworkInspectReport networkInspectLibpod(name).execute();

Inspect a network

Display configuration for a network. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name of the network
    try {
      NetworkInspectReport result = apiInstance.networkInspectLibpod(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkInspectLibpod");
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

[**NetworkInspectReport**](NetworkInspectReport.md)

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

<a id="networkListLibpod"></a>
# **networkListLibpod**
> List&lt;Network&gt; networkListLibpod().filters(filters).execute();

List networks

Display summary of network configurations.   - In a 200 response, all of the fields named Bytes are returned as a Base64 encoded string. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the network list. Available filters:   - `name=[name]` Matches network name (accepts regex).   - `id=[id]` Matches for full or partial ID.   - `driver=[driver]` Only bridge is supported.   - `label=[key]` or `label=[key=value]` Matches networks based on the presence of a label alone or a label and a value.   - `until=[timestamp]` Matches all networks that were created before the given timestamp. 
    try {
      List<Network> result = apiInstance.networkListLibpod()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkListLibpod");
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
| **filters** | **String**| JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the network list. Available filters:   - &#x60;name&#x3D;[name]&#x60; Matches network name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.   - &#x60;driver&#x3D;[driver]&#x60; Only bridge is supported.   - &#x60;label&#x3D;[key]&#x60; or &#x60;label&#x3D;[key&#x3D;value]&#x60; Matches networks based on the presence of a label alone or a label and a value.   - &#x60;until&#x3D;[timestamp]&#x60; Matches all networks that were created before the given timestamp.  | [optional] |

### Return type

[**List&lt;Network&gt;**](Network.md)

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

<a id="networkPruneLibpod"></a>
# **networkPruneLibpod**
> List&lt;NetworkPruneReport&gt; networkPruneLibpod().filters(filters).execute();

Delete unused networks

Remove networks that do not have containers

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String filters = "filters_example"; // String | Filters to process on the prune list, encoded as JSON (a `map[string][]string`). Available filters:   - `until=<timestamp>` Prune networks created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune networks with (or without, in case `label!=...` is used) the specified labels. 
    try {
      List<NetworkPruneReport> result = apiInstance.networkPruneLibpod()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkPruneLibpod");
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
| **filters** | **String**| Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;). Available filters:   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune networks created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune networks with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;NetworkPruneReport&gt;**](NetworkPruneReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network prune |  -  |
| **500** | Internal server error |  -  |

<a id="networkUpdateLibpod"></a>
# **networkUpdateLibpod**
> networkUpdateLibpod(name).update(update).execute();

Update existing podman network

Update existing podman network

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the network
    NetworkUpdateOptions update = new NetworkUpdateOptions(); // NetworkUpdateOptions | attributes for updating a netavark network
    try {
      apiInstance.networkUpdateLibpod(name)
            .update(update)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#networkUpdateLibpod");
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
| **name** | **String**| the name or ID of the network | |
| **update** | **NetworkUpdateOptions**| attributes for updating a netavark network | [optional] |

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

