# SecretsCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secretCreate**](SecretsCompatApi.md#secretCreate) | **POST** /secrets/create | Create a secret |
| [**secretDelete**](SecretsCompatApi.md#secretDelete) | **DELETE** /secrets/{name} | Remove secret |
| [**secretInspect**](SecretsCompatApi.md#secretInspect) | **GET** /secrets/{name} | Inspect secret |
| [**secretList**](SecretsCompatApi.md#secretList) | **GET** /secrets | List secrets |


<a name="secretCreate"></a>
# **secretCreate**
> SecretCreateLibpod201Response secretCreate().create(create).execute();

Create a secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsCompatApi apiInstance = new SecretsCompatApi(defaultClient);
    SecretCreate create = new SecretCreate(); // SecretCreate | attributes for creating a secret 
    try {
      SecretCreateLibpod201Response result = apiInstance.secretCreate()
            .create(create)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsCompatApi#secretCreate");
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
| **create** | [**SecretCreate**](SecretCreate.md)| attributes for creating a secret  | [optional] |

### Return type

[**SecretCreateLibpod201Response**](SecretCreateLibpod201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Secret create response |  -  |
| **409** | Secret in use |  -  |
| **500** | Internal server error |  -  |

<a name="secretDelete"></a>
# **secretDelete**
> secretDelete(name).execute();

Remove secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsCompatApi apiInstance = new SecretsCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the secret
    try {
      apiInstance.secretDelete(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsCompatApi#secretDelete");
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
| **name** | **String**| the name or ID of the secret | |

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
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

<a name="secretInspect"></a>
# **secretInspect**
> SecretInfoReportCompat secretInspect(name).execute();

Inspect secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsCompatApi apiInstance = new SecretsCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the secret
    try {
      SecretInfoReportCompat result = apiInstance.secretInspect(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsCompatApi#secretInspect");
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
| **name** | **String**| the name or ID of the secret | |

### Return type

[**SecretInfoReportCompat**](SecretInfoReportCompat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret inspect compat |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

<a name="secretList"></a>
# **secretList**
> List&lt;SecretInfoReportCompat&gt; secretList().filters(filters).execute();

List secrets

Returns a list of secrets

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsCompatApi apiInstance = new SecretsCompatApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the secrets list. Currently available filters:   - `name=[name]` Matches secrets name (accepts regex).   - `id=[id]` Matches for full or partial ID. 
    try {
      List<SecretInfoReportCompat> result = apiInstance.secretList()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsCompatApi#secretList");
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
| **filters** | **String**| JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  | [optional] |

### Return type

[**List&lt;SecretInfoReportCompat&gt;**](SecretInfoReportCompat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret list response |  -  |
| **500** | Internal server error |  -  |

