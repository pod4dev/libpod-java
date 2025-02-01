# ImagesCompatApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imageBuild**](ImagesCompatApi.md#imageBuild) | **POST** /build | Create image |
| [**imageCreate**](ImagesCompatApi.md#imageCreate) | **POST** /images/create | Create an image |
| [**imageDelete**](ImagesCompatApi.md#imageDelete) | **DELETE** /images/{name} | Remove Image |
| [**imageGet**](ImagesCompatApi.md#imageGet) | **GET** /images/{name}/get | Export an image |
| [**imageGetAll**](ImagesCompatApi.md#imageGetAll) | **GET** /images/get | Export several images |
| [**imageHistory**](ImagesCompatApi.md#imageHistory) | **GET** /images/{name}/history | History of an image |
| [**imageInspect**](ImagesCompatApi.md#imageInspect) | **GET** /images/{name}/json | Inspect an image |
| [**imageList**](ImagesCompatApi.md#imageList) | **GET** /images/json | List Images |
| [**imageLoad**](ImagesCompatApi.md#imageLoad) | **POST** /images/load | Import image |
| [**imagePrune**](ImagesCompatApi.md#imagePrune) | **POST** /images/prune | Prune unused images |
| [**imagePush**](ImagesCompatApi.md#imagePush) | **POST** /images/{name}/push | Push Image |
| [**imageSearch**](ImagesCompatApi.md#imageSearch) | **GET** /images/search | Search images |
| [**imageTag**](ImagesCompatApi.md#imageTag) | **POST** /images/{name}/tag | Tag an image |


<a id="imageBuild"></a>
# **imageBuild**
> ImageBuild200Response imageBuild().contentType(contentType).xRegistryConfig(xRegistryConfig).dockerfile(dockerfile).t(t).extrahosts(extrahosts).remote(remote).retry(retry).retryDelay(retryDelay).q(q).compatvolumes(compatvolumes).nocache(nocache).cachefrom(cachefrom).pull(pull).rm(rm).forcerm(forcerm).memory(memory).memswap(memswap).cpushares(cpushares).cpusetcpus(cpusetcpus).cpuperiod(cpuperiod).cpuquota(cpuquota).buildargs(buildargs).shmsize(shmsize).squash(squash).labels(labels).networkmode(networkmode).platform(platform).target(target).outputs(outputs).inputStream(inputStream).execute();

Create image

Build an image from the given Dockerfile(s)

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String contentType = "application/x-tar"; // String | 
    String xRegistryConfig = "xRegistryConfig_example"; // String | 
    String dockerfile = "Dockerfile"; // String | Path within the build context to the `Dockerfile`. This is ignored if remote is specified and points to an external `Dockerfile`. 
    String t = "latest"; // String | A name and optional tag to apply to the image in the `name:tag` format. If you omit the tag, the default latest value is assumed. You can provide several t parameters.
    String extrahosts = "extrahosts_example"; // String | TBD Extra hosts to add to /etc/hosts (As of version 1.xx) 
    String remote = "remote_example"; // String | A Git repository URI or HTTP/HTTPS context URI. If the URI points to a single text file, the file’s contents are placed into a file called Dockerfile and the image is built from that file. If the URI points to a tarball, the file is downloaded by the daemon and the contents therein used as the context for the build. If the URI points to a tarball and the dockerfile parameter is also specified, there must be a file with the corresponding path inside the tarball. (As of version 1.xx) 
    Integer retry = 3; // Integer | Number of times to retry in case of failure when performing push/pull. 
    String retryDelay = "2s"; // String | Delay between retries in case of push/pull failures. 
    Boolean q = false; // Boolean | Suppress verbose build output 
    Boolean compatvolumes = false; // Boolean | Contents of base images to be modified on ADD or COPY only (As of Podman version v5.2) 
    Boolean nocache = false; // Boolean | Do not use the cache when building the image (As of version 1.xx) 
    String cachefrom = "cachefrom_example"; // String | JSON array of images used to build cache resolution (As of version 1.xx) 
    Boolean pull = false; // Boolean | Attempt to pull the image even if an older image exists locally (As of version 1.xx) 
    Boolean rm = true; // Boolean | Remove intermediate containers after a successful build (As of version 1.xx) 
    Boolean forcerm = false; // Boolean | Always remove intermediate containers, even upon failure (As of version 1.xx) 
    Integer memory = 56; // Integer | Memory is the upper limit (in bytes) on how much memory running containers can use (As of version 1.xx) 
    Integer memswap = 56; // Integer | MemorySwap limits the amount of memory and swap together (As of version 1.xx) 
    Integer cpushares = 56; // Integer | CPUShares (relative weight (As of version 1.xx) 
    String cpusetcpus = "cpusetcpus_example"; // String | CPUSetCPUs in which to allow execution (0-3, 0,1) (As of version 1.xx) 
    Integer cpuperiod = 56; // Integer | CPUPeriod limits the CPU CFS (Completely Fair Scheduler) period (As of version 1.xx) 
    Integer cpuquota = 56; // Integer | CPUQuota limits the CPU CFS (Completely Fair Scheduler) quota (As of version 1.xx) 
    String buildargs = "buildargs_example"; // String | JSON map of string pairs denoting build-time variables. For example, the build argument `Foo` with the value of `bar` would be encoded in JSON as `[\"Foo\":\"bar\"]`.  For example, buildargs={\"Foo\":\"bar\"}.  Note(s): * This should not be used to pass secrets. * The value of buildargs should be URI component encoded before being passed to the API.  (As of version 1.xx) 
    Integer shmsize = 67108864; // Integer | ShmSize is the \"size\" value to use when mounting an shmfs on the container's /dev/shm directory. Default is 64MB (As of version 1.xx) 
    Boolean squash = false; // Boolean | Silently ignored. Squash the resulting images layers into a single layer (As of version 1.xx) 
    String labels = "labels_example"; // String | JSON map of key, value pairs to set as labels on the new image (As of version 1.xx) 
    String networkmode = "bridge"; // String | Sets the networking mode for the run commands during build. Supported standard values are:   * `bridge` limited to containers within a single host, port mapping required for external access   * `host` no isolation between host and containers on this network   * `none` disable all networking for this container   * container:<nameOrID> share networking with given container   ---All other values are assumed to be a custom network's name (As of version 1.xx) 
    String platform = "platform_example"; // String | Platform format os[/arch[/variant]] Can be comma separated list for multi arch builds. (As of version 1.xx) 
    String target = "target_example"; // String | Target build stage (As of version 1.xx) 
    String outputs = "outputs_example"; // String | output configuration TBD (As of version 1.xx) 
    File inputStream = new File("/path/to/file"); // File | A tar archive compressed with one of the following algorithms: identity (no compression), gzip, bzip2, xz. 
    try {
      ImageBuild200Response result = apiInstance.imageBuild()
            .contentType(contentType)
            .xRegistryConfig(xRegistryConfig)
            .dockerfile(dockerfile)
            .t(t)
            .extrahosts(extrahosts)
            .remote(remote)
            .retry(retry)
            .retryDelay(retryDelay)
            .q(q)
            .compatvolumes(compatvolumes)
            .nocache(nocache)
            .cachefrom(cachefrom)
            .pull(pull)
            .rm(rm)
            .forcerm(forcerm)
            .memory(memory)
            .memswap(memswap)
            .cpushares(cpushares)
            .cpusetcpus(cpusetcpus)
            .cpuperiod(cpuperiod)
            .cpuquota(cpuquota)
            .buildargs(buildargs)
            .shmsize(shmsize)
            .squash(squash)
            .labels(labels)
            .networkmode(networkmode)
            .platform(platform)
            .target(target)
            .outputs(outputs)
            .inputStream(inputStream)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageBuild");
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
| **contentType** | **String**|  | [optional] [default to application/x-tar] [enum: application/x-tar] |
| **xRegistryConfig** | **String**|  | [optional] |
| **dockerfile** | **String**| Path within the build context to the &#x60;Dockerfile&#x60;. This is ignored if remote is specified and points to an external &#x60;Dockerfile&#x60;.  | [optional] [default to Dockerfile] |
| **t** | **String**| A name and optional tag to apply to the image in the &#x60;name:tag&#x60; format. If you omit the tag, the default latest value is assumed. You can provide several t parameters. | [optional] [default to latest] |
| **extrahosts** | **String**| TBD Extra hosts to add to /etc/hosts (As of version 1.xx)  | [optional] |
| **remote** | **String**| A Git repository URI or HTTP/HTTPS context URI. If the URI points to a single text file, the file’s contents are placed into a file called Dockerfile and the image is built from that file. If the URI points to a tarball, the file is downloaded by the daemon and the contents therein used as the context for the build. If the URI points to a tarball and the dockerfile parameter is also specified, there must be a file with the corresponding path inside the tarball. (As of version 1.xx)  | [optional] |
| **retry** | **Integer**| Number of times to retry in case of failure when performing push/pull.  | [optional] [default to 3] |
| **retryDelay** | **String**| Delay between retries in case of push/pull failures.  | [optional] [default to 2s] |
| **q** | **Boolean**| Suppress verbose build output  | [optional] [default to false] |
| **compatvolumes** | **Boolean**| Contents of base images to be modified on ADD or COPY only (As of Podman version v5.2)  | [optional] [default to false] |
| **nocache** | **Boolean**| Do not use the cache when building the image (As of version 1.xx)  | [optional] [default to false] |
| **cachefrom** | **String**| JSON array of images used to build cache resolution (As of version 1.xx)  | [optional] |
| **pull** | **Boolean**| Attempt to pull the image even if an older image exists locally (As of version 1.xx)  | [optional] [default to false] |
| **rm** | **Boolean**| Remove intermediate containers after a successful build (As of version 1.xx)  | [optional] [default to true] |
| **forcerm** | **Boolean**| Always remove intermediate containers, even upon failure (As of version 1.xx)  | [optional] [default to false] |
| **memory** | **Integer**| Memory is the upper limit (in bytes) on how much memory running containers can use (As of version 1.xx)  | [optional] |
| **memswap** | **Integer**| MemorySwap limits the amount of memory and swap together (As of version 1.xx)  | [optional] |
| **cpushares** | **Integer**| CPUShares (relative weight (As of version 1.xx)  | [optional] |
| **cpusetcpus** | **String**| CPUSetCPUs in which to allow execution (0-3, 0,1) (As of version 1.xx)  | [optional] |
| **cpuperiod** | **Integer**| CPUPeriod limits the CPU CFS (Completely Fair Scheduler) period (As of version 1.xx)  | [optional] |
| **cpuquota** | **Integer**| CPUQuota limits the CPU CFS (Completely Fair Scheduler) quota (As of version 1.xx)  | [optional] |
| **buildargs** | **String**| JSON map of string pairs denoting build-time variables. For example, the build argument &#x60;Foo&#x60; with the value of &#x60;bar&#x60; would be encoded in JSON as &#x60;[\&quot;Foo\&quot;:\&quot;bar\&quot;]&#x60;.  For example, buildargs&#x3D;{\&quot;Foo\&quot;:\&quot;bar\&quot;}.  Note(s): * This should not be used to pass secrets. * The value of buildargs should be URI component encoded before being passed to the API.  (As of version 1.xx)  | [optional] |
| **shmsize** | **Integer**| ShmSize is the \&quot;size\&quot; value to use when mounting an shmfs on the container&#39;s /dev/shm directory. Default is 64MB (As of version 1.xx)  | [optional] [default to 67108864] |
| **squash** | **Boolean**| Silently ignored. Squash the resulting images layers into a single layer (As of version 1.xx)  | [optional] [default to false] |
| **labels** | **String**| JSON map of key, value pairs to set as labels on the new image (As of version 1.xx)  | [optional] |
| **networkmode** | **String**| Sets the networking mode for the run commands during build. Supported standard values are:   * &#x60;bridge&#x60; limited to containers within a single host, port mapping required for external access   * &#x60;host&#x60; no isolation between host and containers on this network   * &#x60;none&#x60; disable all networking for this container   * container:&lt;nameOrID&gt; share networking with given container   ---All other values are assumed to be a custom network&#39;s name (As of version 1.xx)  | [optional] [default to bridge] |
| **platform** | **String**| Platform format os[/arch[/variant]] Can be comma separated list for multi arch builds. (As of version 1.xx)  | [optional] |
| **target** | **String**| Target build stage (As of version 1.xx)  | [optional] |
| **outputs** | **String**| output configuration TBD (As of version 1.xx)  | [optional] |
| **inputStream** | **File**| A tar archive compressed with one of the following algorithms: identity (no compression), gzip, bzip2, xz.  | [optional] |

### Return type

[**ImageBuild200Response**](ImageBuild200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK (As of version 1.xx) |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageCreate"></a>
# **imageCreate**
> File imageCreate().xRegistryAuth(xRegistryAuth).fromImage(fromImage).fromSrc(fromSrc).repo(repo).tag(tag).message(message).platform(platform).inputImage(inputImage).execute();

Create an image

Create an image by either pulling it from a registry or importing it.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String xRegistryAuth = "xRegistryAuth_example"; // String | A base64-encoded auth configuration.
    String fromImage = "fromImage_example"; // String | Name of the image to pull. The name may include a tag or digest. This parameter may only be used when pulling an image. The pull is cancelled if the HTTP connection is closed.
    String fromSrc = "fromSrc_example"; // String | Source to import. The value may be a URL from which the image can be retrieved or - to read the image from the request body. This parameter may only be used when importing an image
    String repo = "repo_example"; // String | Repository name given to an image when it is imported. The repo may include a tag. This parameter may only be used when importing an image.
    String tag = "tag_example"; // String | Tag or digest. If empty when pulling an image, this causes all tags for the given image to be pulled.
    String message = "message_example"; // String | Set commit message for imported image.
    String platform = "platform_example"; // String | Platform in the format os[/arch[/variant]]
    File inputImage = new File("/path/to/file"); // File | Image content if fromSrc parameter was used
    try {
      File result = apiInstance.imageCreate()
            .xRegistryAuth(xRegistryAuth)
            .fromImage(fromImage)
            .fromSrc(fromSrc)
            .repo(repo)
            .tag(tag)
            .message(message)
            .platform(platform)
            .inputImage(inputImage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageCreate");
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
| **xRegistryAuth** | **String**| A base64-encoded auth configuration. | [optional] |
| **fromImage** | **String**| Name of the image to pull. The name may include a tag or digest. This parameter may only be used when pulling an image. The pull is cancelled if the HTTP connection is closed. | [optional] |
| **fromSrc** | **String**| Source to import. The value may be a URL from which the image can be retrieved or - to read the image from the request body. This parameter may only be used when importing an image | [optional] |
| **repo** | **String**| Repository name given to an image when it is imported. The repo may include a tag. This parameter may only be used when importing an image. | [optional] |
| **tag** | **String**| Tag or digest. If empty when pulling an image, this causes all tags for the given image to be pulled. | [optional] |
| **message** | **String**| Set commit message for imported image. | [optional] |
| **platform** | **String**| Platform in the format os[/arch[/variant]] | [optional] |
| **inputImage** | **File**| Image content if fromSrc parameter was used | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageDelete"></a>
# **imageDelete**
> List&lt;ImageDelete200ResponseInner&gt; imageDelete(name).force(force).noprune(noprune).execute();

Remove Image

Delete an image from local storage

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | name or ID of image to delete
    Boolean force = true; // Boolean | remove the image even if used by containers or has other tags
    Boolean noprune = true; // Boolean | do not remove dangling parent images
    try {
      List<ImageDelete200ResponseInner> result = apiInstance.imageDelete(name)
            .force(force)
            .noprune(noprune)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageDelete");
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
| **name** | **String**| name or ID of image to delete | |
| **force** | **Boolean**| remove the image even if used by containers or has other tags | [optional] |
| **noprune** | **Boolean**| do not remove dangling parent images | [optional] |

### Return type

[**List&lt;ImageDelete200ResponseInner&gt;**](ImageDelete200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Delete |  -  |
| **404** | No such image |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a id="imageGet"></a>
# **imageGet**
> File imageGet(name).execute();

Export an image

Export an image in tarball format

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      File result = apiInstance.imageGet(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageGet");
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

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-tar

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | no error |  -  |
| **500** | Internal server error |  -  |

<a id="imageGetAll"></a>
# **imageGetAll**
> File imageGetAll(names).execute();

Export several images

Get a tarball containing all images and metadata for several image repositories

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String names = "names_example"; // String | one or more image names or IDs comma separated
    try {
      File result = apiInstance.imageGetAll(names)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageGetAll");
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
| **names** | **String**| one or more image names or IDs comma separated | |

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
| **500** | Internal server error |  -  |

<a id="imageHistory"></a>
# **imageHistory**
> HistoryResponse imageHistory(name).execute();

History of an image

Return parent layers of an image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      HistoryResponse result = apiInstance.imageHistory(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageHistory");
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

[**HistoryResponse**](HistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image History |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageInspect"></a>
# **imageInspect**
> ImageInspect imageInspect(name).execute();

Inspect an image

Return low-level information about an image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      ImageInspect result = apiInstance.imageInspect(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageInspect");
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

[**ImageInspect**](ImageInspect.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Inspect |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageList"></a>
# **imageList**
> List&lt;Summary&gt; imageList().all(all).filters(filters).digests(digests).execute();

List Images

Returns a list of images on the server. Note that it uses a different, smaller representation of an image than inspecting a single image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    Boolean all = false; // Boolean | Show all images. Only images from a final layer (no children) are shown by default.
    String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the images list. Available filters: - `before`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) - `dangling=true` - `label=key` or `label=\"key=value\"` of an image label - `reference`=(`<image-name>[:<tag>]`) - `since`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) 
    Boolean digests = false; // Boolean | Not supported
    try {
      List<Summary> result = apiInstance.imageList()
            .all(all)
            .filters(filters)
            .digests(digests)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageList");
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
| **all** | **Boolean**| Show all images. Only images from a final layer (no children) are shown by default. | [optional] [default to false] |
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the images list. Available filters: - &#x60;before&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;dangling&#x3D;true&#x60; - &#x60;label&#x3D;key&#x60; or &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; of an image label - &#x60;reference&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;)  | [optional] |
| **digests** | **Boolean**| Not supported | [optional] [default to false] |

### Return type

[**List&lt;Summary&gt;**](Summary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image summary for compat API |  -  |
| **500** | Internal server error |  -  |

<a id="imageLoad"></a>
# **imageLoad**
> imageLoad().quiet(quiet).request(request).execute();

Import image

Load a set of images and tags into a repository.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    Boolean quiet = true; // Boolean | not supported
    String request = "request_example"; // String | tarball of container image
    try {
      apiInstance.imageLoad()
            .quiet(quiet)
            .request(request)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageLoad");
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
| **quiet** | **Boolean**| not supported | [optional] |
| **request** | **String**| tarball of container image | [optional] |

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
| **500** | Internal server error |  -  |

<a id="imagePrune"></a>
# **imagePrune**
> List&lt;ImageDelete200ResponseInner&gt; imagePrune().filters(filters).execute();

Prune unused images

Remove images from local storage that are not being used by a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String filters = "filters_example"; // String | filters to apply to image pruning, encoded as JSON (map[string][]string). Available filters:   - `dangling=<boolean>` When set to `true` (or `1`), prune only      unused *and* untagged images. When set to `false`      (or `0`), all unused images are pruned.   - `until=<string>` Prune images created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune images with (or without, in case `label!=...` is used) the specified labels. 
    try {
      List<ImageDelete200ResponseInner> result = apiInstance.imagePrune()
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imagePrune");
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
| **filters** | **String**| filters to apply to image pruning, encoded as JSON (map[string][]string). Available filters:   - &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to &#x60;true&#x60; (or &#x60;1&#x60;), prune only      unused *and* untagged images. When set to &#x60;false&#x60;      (or &#x60;0&#x60;), all unused images are pruned.   - &#x60;until&#x3D;&lt;string&gt;&#x60; Prune images created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune images with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;ImageDelete200ResponseInner&gt;**](ImageDelete200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Delete |  -  |
| **500** | Internal server error |  -  |

<a id="imagePush"></a>
# **imagePush**
> File imagePush(name).tag(tag).all(all).compress(compress).destination(destination).format(format).tlsVerify(tlsVerify).xRegistryAuth(xRegistryAuth).execute();

Push Image

Push an image to a container registry

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | Name of image to push.
    String tag = "tag_example"; // String | The tag to associate with the image on the registry.
    Boolean all = true; // Boolean | All indicates whether to push all images related to the image list
    Boolean compress = true; // Boolean | Use compression on image.
    String destination = "destination_example"; // String | Allows for pushing the image to a different destination than the image refers to.
    String format = "format_example"; // String | Manifest type (oci, v2s1, or v2s2) to use when pushing an image. Default is manifest type of source, with fallbacks.
    Boolean tlsVerify = true; // Boolean | Require TLS verification.
    String xRegistryAuth = "xRegistryAuth_example"; // String | A base64-encoded auth configuration.
    try {
      File result = apiInstance.imagePush(name)
            .tag(tag)
            .all(all)
            .compress(compress)
            .destination(destination)
            .format(format)
            .tlsVerify(tlsVerify)
            .xRegistryAuth(xRegistryAuth)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imagePush");
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
| **name** | **String**| Name of image to push. | |
| **tag** | **String**| The tag to associate with the image on the registry. | [optional] |
| **all** | **Boolean**| All indicates whether to push all images related to the image list | [optional] |
| **compress** | **Boolean**| Use compression on image. | [optional] |
| **destination** | **String**| Allows for pushing the image to a different destination than the image refers to. | [optional] |
| **format** | **String**| Manifest type (oci, v2s1, or v2s2) to use when pushing an image. Default is manifest type of source, with fallbacks. | [optional] |
| **tlsVerify** | **Boolean**| Require TLS verification. | [optional] [default to true] |
| **xRegistryAuth** | **String**| A base64-encoded auth configuration. | [optional] |

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
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageSearch"></a>
# **imageSearch**
> ImageSearch200Response imageSearch().term(term).limit(limit).filters(filters).tlsVerify(tlsVerify).listTags(listTags).execute();

Search images

Search registries for an image

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String term = "term_example"; // String | term to search
    Integer limit = 25; // Integer | maximum number of results
    String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the images list. Available filters: - `is-automated=(true|false)` - `is-official=(true|false)` - `stars=<number>` Matches images that have at least 'number' stars. 
    Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
    Boolean listTags = true; // Boolean | list the available tags in the repository
    try {
      ImageSearch200Response result = apiInstance.imageSearch()
            .term(term)
            .limit(limit)
            .filters(filters)
            .tlsVerify(tlsVerify)
            .listTags(listTags)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageSearch");
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
| **term** | **String**| term to search | [optional] |
| **limit** | **Integer**| maximum number of results | [optional] [default to 25] |
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the images list. Available filters: - &#x60;is-automated&#x3D;(true|false)&#x60; - &#x60;is-official&#x3D;(true|false)&#x60; - &#x60;stars&#x3D;&lt;number&gt;&#x60; Matches images that have at least &#39;number&#39; stars.  | [optional] |
| **tlsVerify** | **Boolean**| Require HTTPS and verify signatures when contacting registries. | [optional] [default to true] |
| **listTags** | **Boolean**| list the available tags in the repository | [optional] |

### Return type

[**ImageSearch200Response**](ImageSearch200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Registry Search |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageTag"></a>
# **imageTag**
> imageTag(name).repo(repo).tag(tag).execute();

Tag an image

Tag an image so that it becomes part of a repository.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesCompatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesCompatApi apiInstance = new ImagesCompatApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String repo = "repo_example"; // String | the repository to tag in
    String tag = "tag_example"; // String | the name of the new tag
    try {
      apiInstance.imageTag(name)
            .repo(repo)
            .tag(tag)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesCompatApi#imageTag");
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
| **repo** | **String**| the repository to tag in | [optional] |
| **tag** | **String**| the name of the new tag | [optional] |

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
| **400** | Bad parameter in request |  -  |
| **404** | No such image |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

