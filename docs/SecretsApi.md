# SecretsApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secretCreateLibpod**](SecretsApi.md#secretCreateLibpod) | **POST** /libpod/secrets/create | Create a secret |
| [**secretDeleteLibpod**](SecretsApi.md#secretDeleteLibpod) | **DELETE** /libpod/secrets/{name} | Remove secret |
| [**secretExistsLibpod**](SecretsApi.md#secretExistsLibpod) | **GET** /libpod/secrets/{name}/exists | Secret exists |
| [**secretInspectLibpod**](SecretsApi.md#secretInspectLibpod) | **GET** /libpod/secrets/{name}/json | Inspect secret |
| [**secretListLibpod**](SecretsApi.md#secretListLibpod) | **GET** /libpod/secrets/json | List secrets |


<a id="secretCreateLibpod"></a>
# **secretCreateLibpod**
> ContainerUpdateLibpod201Response secretCreateLibpod(name).driver(driver).driveropts(driveropts).labels(labels).request(request).execute();

Create a secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    String name = "name_example"; // String | User-defined name of the secret.
    String driver = "file"; // String | Secret driver
    String driveropts = "driveropts_example"; // String | Secret driver options
    String labels = "labels_example"; // String | Labels on the secret
    String request = "request_example"; // String | Secret
    try {
      ContainerUpdateLibpod201Response result = apiInstance.secretCreateLibpod(name)
            .driver(driver)
            .driveropts(driveropts)
            .labels(labels)
            .request(request)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#secretCreateLibpod");
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
| **name** | **String**| User-defined name of the secret. | |
| **driver** | **String**| Secret driver | [optional] [default to file] |
| **driveropts** | **String**| Secret driver options | [optional] |
| **labels** | **String**| Labels on the secret | [optional] |
| **request** | **String**| Secret | [optional] |

### Return type

[**ContainerUpdateLibpod201Response**](ContainerUpdateLibpod201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Secret create response |  -  |
| **500** | Internal server error |  -  |

<a id="secretDeleteLibpod"></a>
# **secretDeleteLibpod**
> secretDeleteLibpod(name).all(all).execute();

Remove secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the secret
    Boolean all = false; // Boolean | Remove all secrets
    try {
      apiInstance.secretDeleteLibpod(name)
            .all(all)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#secretDeleteLibpod");
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
| **all** | **Boolean**| Remove all secrets | [optional] [default to false] |

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

<a id="secretExistsLibpod"></a>
# **secretExistsLibpod**
> secretExistsLibpod(name).execute();

Secret exists

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the secret
    try {
      apiInstance.secretExistsLibpod(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#secretExistsLibpod");
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
| **204** | secret exists |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

<a id="secretInspectLibpod"></a>
# **secretInspectLibpod**
> SecretInfoReport secretInspectLibpod(name).showsecret(showsecret).execute();

Inspect secret

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the secret
    Boolean showsecret = false; // Boolean | Display Secret
    try {
      SecretInfoReport result = apiInstance.secretInspectLibpod(name)
            .showsecret(showsecret)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#secretInspectLibpod");
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
| **showsecret** | **Boolean**| Display Secret | [optional] [default to false] |

### Return type

[**SecretInfoReport**](SecretInfoReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret inspect response |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

<a id="secretListLibpod"></a>
# **secretListLibpod**
> List&lt;SecretInfoReport&gt; secretListLibpod().filters(filters).execute();

List secrets

Returns a list of secrets

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the secrets list. Currently available filters:   - `name=[name]` Matches secrets name (accepts regex).   - `id=[id]` Matches for full or partial ID. 
    try {
      List<SecretInfoReport> result = apiInstance.secretListLibpod()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#secretListLibpod");
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

[**List&lt;SecretInfoReport&gt;**](SecretInfoReport.md)

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

