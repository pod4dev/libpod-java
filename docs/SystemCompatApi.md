# SystemCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**systemAuth**](SystemCompatApi.md#systemAuth) | **POST** /auth | Check auth configuration |
| [**systemDataUsage**](SystemCompatApi.md#systemDataUsage) | **GET** /system/df | Show disk usage |
| [**systemEvents**](SystemCompatApi.md#systemEvents) | **GET** /events | Get events |
| [**systemInfo**](SystemCompatApi.md#systemInfo) | **GET** /info | Get info |
| [**systemPing**](SystemCompatApi.md#systemPing) | **GET** /libpod/_ping | Ping service |
| [**systemVersion**](SystemCompatApi.md#systemVersion) | **GET** /version | Component Version information |


<a name="systemAuth"></a>
# **systemAuth**
> AuthReport systemAuth().authConfig(authConfig).execute();

Check auth configuration

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    AuthConfig authConfig = new AuthConfig(); // AuthConfig | Authentication to check
    try {
      AuthReport result = apiInstance.systemAuth()
            .authConfig(authConfig)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemAuth");
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
| **authConfig** | [**AuthConfig**](AuthConfig.md)| Authentication to check | [optional] |

### Return type

[**AuthReport**](AuthReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Auth response |  -  |
| **500** | Internal server error |  -  |

<a name="systemDataUsage"></a>
# **systemDataUsage**
> SystemDfReport systemDataUsage().execute();

Show disk usage

Return information about disk usage for containers, images, and volumes

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    try {
      SystemDfReport result = apiInstance.systemDataUsage()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemDataUsage");
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

<a name="systemEvents"></a>
# **systemEvents**
> systemEvents().since(since).until(until).filters(filters).execute();

Get events

Returns events filtered on query parameters

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    String since = "since_example"; // String | start streaming events from this time
    String until = "until_example"; // String | stop streaming events later than this
    String filters = "filters_example"; // String | JSON encoded map[string][]string of constraints
    try {
      apiInstance.systemEvents()
            .since(since)
            .until(until)
            .filters(filters)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemEvents");
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

<a name="systemInfo"></a>
# **systemInfo**
> systemInfo().execute();

Get info

Returns information on the system and libpod configuration

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    try {
      apiInstance.systemInfo()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemInfo");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | to be determined |  -  |
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
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    try {
      String result = apiInstance.systemPing()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemPing");
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

<a name="systemVersion"></a>
# **systemVersion**
> SystemComponentVersion systemVersion().execute();

Component Version information

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SystemCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SystemCompatApi apiInstance = new SystemCompatApi(defaultClient);
    try {
      SystemComponentVersion result = apiInstance.systemVersion()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemCompatApi#systemVersion");
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

