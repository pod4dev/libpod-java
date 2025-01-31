# VolumesCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**volumeCreate**](VolumesCompatApi.md#volumeCreate) | **POST** /volumes/create | Create a volume |
| [**volumeDelete**](VolumesCompatApi.md#volumeDelete) | **DELETE** /volumes/{name} | Remove volume |
| [**volumeInspect**](VolumesCompatApi.md#volumeInspect) | **GET** /volumes/{name} | Inspect volume |
| [**volumeList**](VolumesCompatApi.md#volumeList) | **GET** /volumes | List volumes |
| [**volumePrune**](VolumesCompatApi.md#volumePrune) | **POST** /volumes/prune | Prune volumes |


<a name="volumeCreate"></a>
# **volumeCreate**
> Volume volumeCreate().create(create).execute();

Create a volume

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.VolumesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
    VolumeCreate create = new VolumeCreate(); // VolumeCreate | attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume's information will be generated. 
    try {
      Volume result = apiInstance.volumeCreate()
            .create(create)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VolumesCompatApi#volumeCreate");
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
| **create** | [**VolumeCreate**](VolumeCreate.md)| attributes for creating a volume. Note: If a volume by the same name exists, a 201 response with that volume&#39;s information will be generated.  | [optional] |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |

<a name="volumeDelete"></a>
# **volumeDelete**
> volumeDelete(name).force(force).execute();

Remove volume

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.VolumesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the volume
    Boolean force = true; // Boolean | Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements. 
    try {
      apiInstance.volumeDelete(name)
            .force(force)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VolumesCompatApi#volumeDelete");
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
| **name** | **String**| the name or ID of the volume | |
| **force** | **Boolean**| Force removal of the volume. This actually only causes errors due to the names volume not being found to be suppressed, which is the behaviour Docker implements.  | [optional] |

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
| **404** | No such volume |  -  |
| **409** | Volume is in use and cannot be removed |  -  |
| **500** | Internal server error |  -  |

<a name="volumeInspect"></a>
# **volumeInspect**
> Volume volumeInspect(name).execute();

Inspect volume

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.VolumesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the volume
    try {
      Volume result = apiInstance.volumeInspect(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VolumesCompatApi#volumeInspect");
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
| **name** | **String**| the name or ID of the volume | |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response definition is used for both the create and inspect endpoints |  -  |
| **500** | Internal server error |  -  |

<a name="volumeList"></a>
# **volumeList**
> ListResponse volumeList().filters(filters).execute();

List volumes

Returns a list of volume

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.VolumesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver=<volume-driver-name> Matches volumes based on their driver.   - label=<key> or label=<key>:<value> Matches volumes based on the presence of a label alone or a label and a value.   - name=<volume-name> Matches all of volume name.   - `until=<timestamp>` List volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.  Note:   The boolean `dangling` filter is not yet implemented for this endpoint. 
    try {
      ListResponse result = apiInstance.volumeList()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VolumesCompatApi#volumeList");
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
| **filters** | **String**| JSON encoded value of the filters (a map[string][]string) to process on the volumes list. Available filters:   - driver&#x3D;&lt;volume-driver-name&gt; Matches volumes based on their driver.   - label&#x3D;&lt;key&gt; or label&#x3D;&lt;key&gt;:&lt;value&gt; Matches volumes based on the presence of a label alone or a label and a value.   - name&#x3D;&lt;volume-name&gt; Matches all of volume name.   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; List volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.  Note:   The boolean &#x60;dangling&#x60; filter is not yet implemented for this endpoint.  | [optional] |

### Return type

[**ListResponse**](ListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume List |  -  |
| **500** | Internal server error |  -  |

<a name="volumePrune"></a>
# **volumePrune**
> PruneReport volumePrune().filters(filters).execute();

Prune volumes

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.VolumesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    VolumesCompatApi apiInstance = new VolumesCompatApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - `until=<timestamp>` Prune volumes created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. 
    try {
      PruneReport result = apiInstance.volumePrune()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VolumesCompatApi#volumePrune");
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
| **filters** | **String**| JSON encoded value of filters (a map[string][]string) to match volumes against before pruning. Available filters:   - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune volumes created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune volumes with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**PruneReport**](PruneReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume prune |  -  |
| **500** | Internal server error |  -  |

