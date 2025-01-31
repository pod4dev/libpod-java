# SystemApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**systemCheckLibpod**](SystemApi.md#systemCheckLibpod) | **POST** /libpod/system/check | Performs consistency checks on storage, optionally removing items which fail checks |
| [**systemDataUsageLibpod**](SystemApi.md#systemDataUsageLibpod) | **GET** /libpod/system/df | Show disk usage |
| [**systemEventsLibpod**](SystemApi.md#systemEventsLibpod) | **GET** /libpod/events | Get events |
| [**systemInfoLibpod**](SystemApi.md#systemInfoLibpod) | **GET** /libpod/info | Get info |
| [**systemPing**](SystemApi.md#systemPing) | **GET** /libpod/_ping | Ping service |
| [**systemPruneLibpod**](SystemApi.md#systemPruneLibpod) | **POST** /libpod/system/prune | Prune unused data |
| [**systemVersionLibpod**](SystemApi.md#systemVersionLibpod) | **GET** /libpod/version | Component Version information |


<a name="systemCheckLibpod"></a>
# **systemCheckLibpod**
> SystemCheckReport systemCheckLibpod().quick(quick).repair(repair).repairLossy(repairLossy).unreferencedLayerMaxAge(unreferencedLayerMaxAge).execute();

Performs consistency checks on storage, optionally removing items which fail checks

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    Boolean quick = true; // Boolean | Skip time-consuming checks
    Boolean repair = true; // Boolean | Remove inconsistent images
    Boolean repairLossy = true; // Boolean | Remove inconsistent containers and images
    String unreferencedLayerMaxAge = "24h0m0s"; // String | Maximum allowed age of unreferenced layers
    try {
      SystemCheckReport result = apiInstance.systemCheckLibpod()
            .quick(quick)
            .repair(repair)
            .repairLossy(repairLossy)
            .unreferencedLayerMaxAge(unreferencedLayerMaxAge)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemCheckLibpod");
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
| **quick** | **Boolean**| Skip time-consuming checks | [optional] |
| **repair** | **Boolean**| Remove inconsistent images | [optional] |
| **repairLossy** | **Boolean**| Remove inconsistent containers and images | [optional] |
| **unreferencedLayerMaxAge** | **String**| Maximum allowed age of unreferenced layers | [optional] [default to 24h0m0s] |

### Return type

[**SystemCheckReport**](SystemCheckReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a name="systemDataUsageLibpod"></a>
# **systemDataUsageLibpod**
> SystemDfReport systemDataUsageLibpod().execute();

Show disk usage

Return information about disk usage for containers, images, and volumes

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      SystemDfReport result = apiInstance.systemDataUsageLibpod()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemDataUsageLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemDfReport**](SystemDfReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disk usage |  -  |
| **500** | Internal server error |  -  |

<a name="systemEventsLibpod"></a>
# **systemEventsLibpod**
> systemEventsLibpod().since(since).until(until).filters(filters).stream(stream).execute();

Get events

Returns events filtered on query parameters

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    String since = "since_example"; // String | start streaming events from this time
    String until = "until_example"; // String | stop streaming events later than this
    String filters = "filters_example"; // String | JSON encoded map[string][]string of constraints
    Boolean stream = true; // Boolean | when false, do not follow events
    try {
      apiInstance.systemEventsLibpod()
            .since(since)
            .until(until)
            .filters(filters)
            .stream(stream)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemEventsLibpod");
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
| **since** | **String**| start streaming events from this time | [optional] |
| **until** | **String**| stop streaming events later than this | [optional] |
| **filters** | **String**| JSON encoded map[string][]string of constraints | [optional] |
| **stream** | **Boolean**| when false, do not follow events | [optional] [default to true] |

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
| **200** | returns a string of json data describing an event |  -  |
| **500** | Internal server error |  -  |

<a name="systemInfoLibpod"></a>
# **systemInfoLibpod**
> LibpodInfo systemInfoLibpod().execute();

Get info

Returns information on the system and libpod configuration

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      LibpodInfo result = apiInstance.systemInfoLibpod()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemInfoLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LibpodInfo**](LibpodInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Info |  -  |
| **500** | Internal server error |  -  |

<a name="systemPing"></a>
# **systemPing**
> String systemPing().execute();

Ping service

Return protocol information in response headers. &#x60;HEAD /libpod/_ping&#x60; is also supported. &#x60;/_ping&#x60; is available for compatibility with other engines. The &#39;_ping&#39; endpoints are not versioned. 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      String result = apiInstance.systemPing()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemPing");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Docker-Experimental - If the server is running with experimental mode enabled, always true <br>  * Cache-Control - always no-cache <br>  * Libpod-Buildah-Version - Default version of libpod image builder.   Available if service is backed by Podman, therefore may be used to   determine if talking to Podman engine or another engine  <br>  * Libpod-API-Version - Max Podman API Version the server supports. Available if service is backed by Podman, therefore may be used to determine if talking to Podman engine or another engine  <br>  * BuildKit-Version - Default version of docker image builder <br>  * Pragma - always no-cache <br>  * API-Version - Max compatibility API Version the server supports <br>  |
| **500** | Internal server error |  -  |

<a name="systemPruneLibpod"></a>
# **systemPruneLibpod**
> SystemPruneReport systemPruneLibpod().execute();

Prune unused data

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      SystemPruneReport result = apiInstance.systemPruneLibpod()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemPruneLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemPruneReport**](SystemPruneReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | System Prune results |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a name="systemVersionLibpod"></a>
# **systemVersionLibpod**
> SystemComponentVersion systemVersionLibpod().execute();

Component Version information

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      SystemComponentVersion result = apiInstance.systemVersionLibpod()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#systemVersionLibpod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemComponentVersion**](SystemComponentVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Version |  -  |

