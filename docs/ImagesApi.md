# ImagesApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imageBuildLibpod**](ImagesApi.md#imageBuildLibpod) | **POST** /libpod/build | Create image |
| [**imageChangesLibpod**](ImagesApi.md#imageChangesLibpod) | **GET** /libpod/images/{name}/changes | Report on changes to images&#39;s filesystem; adds, deletes or modifications. |
| [**imageDeleteAllLibpod**](ImagesApi.md#imageDeleteAllLibpod) | **DELETE** /libpod/images/remove | Remove one or more images from the storage. |
| [**imageDeleteLibpod**](ImagesApi.md#imageDeleteLibpod) | **DELETE** /libpod/images/{name} | Remove an image from the local storage. |
| [**imageExistsLibpod**](ImagesApi.md#imageExistsLibpod) | **GET** /libpod/images/{name}/exists | Image exists |
| [**imageExportLibpod**](ImagesApi.md#imageExportLibpod) | **GET** /libpod/images/export | Export multiple images |
| [**imageGetLibpod**](ImagesApi.md#imageGetLibpod) | **GET** /libpod/images/{name}/get | Export an image |
| [**imageHistoryLibpod**](ImagesApi.md#imageHistoryLibpod) | **GET** /libpod/images/{name}/history | History of an image |
| [**imageImportLibpod**](ImagesApi.md#imageImportLibpod) | **POST** /libpod/images/import | Import image |
| [**imageInspectLibpod**](ImagesApi.md#imageInspectLibpod) | **GET** /libpod/images/{name}/json | Inspect an image |
| [**imageListLibpod**](ImagesApi.md#imageListLibpod) | **GET** /libpod/images/json | List Images |
| [**imageLoadLibpod**](ImagesApi.md#imageLoadLibpod) | **POST** /libpod/images/load | Load image |
| [**imagePruneLibpod**](ImagesApi.md#imagePruneLibpod) | **POST** /libpod/images/prune | Prune unused images |
| [**imagePullLibpod**](ImagesApi.md#imagePullLibpod) | **POST** /libpod/images/pull | Pull images |
| [**imagePushLibpod**](ImagesApi.md#imagePushLibpod) | **POST** /libpod/images/{name}/push | Push Image |
| [**imageResolveLibpod**](ImagesApi.md#imageResolveLibpod) | **GET** /libpod/images/{name}/resolve | Resolve an image (short) name |
| [**imageScpLibpod**](ImagesApi.md#imageScpLibpod) | **POST** /libpod/images/scp/{name} | Copy an image from one host to another |
| [**imageSearchLibpod**](ImagesApi.md#imageSearchLibpod) | **GET** /libpod/images/search | Search images |
| [**imageTagLibpod**](ImagesApi.md#imageTagLibpod) | **POST** /libpod/images/{name}/tag | Tag an image |
| [**imageTreeLibpod**](ImagesApi.md#imageTreeLibpod) | **GET** /libpod/images/{name}/tree | Image tree |
| [**imageUntagLibpod**](ImagesApi.md#imageUntagLibpod) | **POST** /libpod/images/{name}/untag | Untag an image |


<a id="imageBuildLibpod"></a>
# **imageBuildLibpod**
> ImageBuildLibpod200Response imageBuildLibpod().dockerfile(dockerfile).t(t).allplatforms(allplatforms).extrahosts(extrahosts).nohosts(nohosts).remote(remote).q(q).compatvolumes(compatvolumes).inheritlabels(inheritlabels).nocache(nocache).cachefrom(cachefrom).pull(pull).rm(rm).forcerm(forcerm).memory(memory).memswap(memswap).cpushares(cpushares).cpusetcpus(cpusetcpus).cpuperiod(cpuperiod).cpuquota(cpuquota).buildargs(buildargs).shmsize(shmsize).squash(squash).labels(labels).layerLabel(layerLabel).layers(layers).networkmode(networkmode).platform(platform).target(target).outputs(outputs).httpproxy(httpproxy).unsetenv(unsetenv).unsetlabel(unsetlabel).volume(volume).execute();

Create image

Build an image from the given Dockerfile(s)

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String dockerfile = "Dockerfile"; // String | Path within the build context to the `Dockerfile`. This is ignored if remote is specified and points to an external `Dockerfile`. 
    String t = "latest"; // String | A name and optional tag to apply to the image in the `name:tag` format.  If you omit the tag, the default latest value is assumed. You can provide several t parameters.
    Boolean allplatforms = false; // Boolean | Instead of building for a set of platforms specified using the platform option, inspect the build's base images, and build for all of the platforms that are available.  Stages that use *scratch* as a starting point can not be inspected, so at least one non-*scratch* stage must be present for detection to work usefully. 
    String extrahosts = "extrahosts_example"; // String | TBD Extra hosts to add to /etc/hosts (As of version 1.xx) 
    Boolean nohosts = true; // Boolean | Not to create /etc/hosts when building the image 
    String remote = "remote_example"; // String | A Git repository URI or HTTP/HTTPS context URI. If the URI points to a single text file, the file’s contents are placed into a file called Dockerfile and the image is built from that file. If the URI points to a tarball, the file is downloaded by the daemon and the contents therein used as the context for the build. If the URI points to a tarball and the dockerfile parameter is also specified, there must be a file with the corresponding path inside the tarball. (As of version 1.xx) 
    Boolean q = false; // Boolean | Suppress verbose build output 
    Boolean compatvolumes = false; // Boolean | Contents of base images to be modified on ADD or COPY only (As of Podman version v5.2) 
    Boolean inheritlabels = true; // Boolean | Inherit the labels from the base image or base stages (As of Podman version v5.5) 
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
    List<String> layerLabel = Arrays.asList(); // List<String> | Add an intermediate image *label* (e.g. label=*value*) to the intermediate image metadata.
    Boolean layers = true; // Boolean | Cache intermediate layers during build. (As of version 1.xx) 
    String networkmode = "bridge"; // String | Sets the networking mode for the run commands during build. Supported standard values are:   * `bridge` limited to containers within a single host, port mapping required for external access   * `host` no isolation between host and containers on this network   * `none` disable all networking for this container   * container:<nameOrID> share networking with given container   ---All other values are assumed to be a custom network's name (As of version 1.xx) 
    String platform = "platform_example"; // String | Platform format os[/arch[/variant]] (As of version 1.xx) 
    String target = "target_example"; // String | Target build stage (As of version 1.xx) 
    String outputs = "outputs_example"; // String | output configuration TBD (As of version 1.xx) 
    Boolean httpproxy = true; // Boolean | Inject http proxy environment variables into container (As of version 2.0.0) 
    List<String> unsetenv = Arrays.asList(); // List<String> | Unset environment variables from the final image.
    List<String> unsetlabel = Arrays.asList(); // List<String> | Unset the image label, causing the label not to be inherited from the base image.
    List<String> volume = Arrays.asList(); // List<String> | Extra volumes that should be mounted in the build container.
    try {
      ImageBuildLibpod200Response result = apiInstance.imageBuildLibpod()
            .dockerfile(dockerfile)
            .t(t)
            .allplatforms(allplatforms)
            .extrahosts(extrahosts)
            .nohosts(nohosts)
            .remote(remote)
            .q(q)
            .compatvolumes(compatvolumes)
            .inheritlabels(inheritlabels)
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
            .layerLabel(layerLabel)
            .layers(layers)
            .networkmode(networkmode)
            .platform(platform)
            .target(target)
            .outputs(outputs)
            .httpproxy(httpproxy)
            .unsetenv(unsetenv)
            .unsetlabel(unsetlabel)
            .volume(volume)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageBuildLibpod");
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
| **dockerfile** | **String**| Path within the build context to the &#x60;Dockerfile&#x60;. This is ignored if remote is specified and points to an external &#x60;Dockerfile&#x60;.  | [optional] [default to Dockerfile] |
| **t** | **String**| A name and optional tag to apply to the image in the &#x60;name:tag&#x60; format.  If you omit the tag, the default latest value is assumed. You can provide several t parameters. | [optional] [default to latest] |
| **allplatforms** | **Boolean**| Instead of building for a set of platforms specified using the platform option, inspect the build&#39;s base images, and build for all of the platforms that are available.  Stages that use *scratch* as a starting point can not be inspected, so at least one non-*scratch* stage must be present for detection to work usefully.  | [optional] [default to false] |
| **extrahosts** | **String**| TBD Extra hosts to add to /etc/hosts (As of version 1.xx)  | [optional] |
| **nohosts** | **Boolean**| Not to create /etc/hosts when building the image  | [optional] |
| **remote** | **String**| A Git repository URI or HTTP/HTTPS context URI. If the URI points to a single text file, the file’s contents are placed into a file called Dockerfile and the image is built from that file. If the URI points to a tarball, the file is downloaded by the daemon and the contents therein used as the context for the build. If the URI points to a tarball and the dockerfile parameter is also specified, there must be a file with the corresponding path inside the tarball. (As of version 1.xx)  | [optional] |
| **q** | **Boolean**| Suppress verbose build output  | [optional] [default to false] |
| **compatvolumes** | **Boolean**| Contents of base images to be modified on ADD or COPY only (As of Podman version v5.2)  | [optional] [default to false] |
| **inheritlabels** | **Boolean**| Inherit the labels from the base image or base stages (As of Podman version v5.5)  | [optional] [default to true] |
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
| **layerLabel** | [**List&lt;String&gt;**](String.md)| Add an intermediate image *label* (e.g. label&#x3D;*value*) to the intermediate image metadata. | [optional] |
| **layers** | **Boolean**| Cache intermediate layers during build. (As of version 1.xx)  | [optional] [default to true] |
| **networkmode** | **String**| Sets the networking mode for the run commands during build. Supported standard values are:   * &#x60;bridge&#x60; limited to containers within a single host, port mapping required for external access   * &#x60;host&#x60; no isolation between host and containers on this network   * &#x60;none&#x60; disable all networking for this container   * container:&lt;nameOrID&gt; share networking with given container   ---All other values are assumed to be a custom network&#39;s name (As of version 1.xx)  | [optional] [default to bridge] |
| **platform** | **String**| Platform format os[/arch[/variant]] (As of version 1.xx)  | [optional] |
| **target** | **String**| Target build stage (As of version 1.xx)  | [optional] |
| **outputs** | **String**| output configuration TBD (As of version 1.xx)  | [optional] |
| **httpproxy** | **Boolean**| Inject http proxy environment variables into container (As of version 2.0.0)  | [optional] |
| **unsetenv** | [**List&lt;String&gt;**](String.md)| Unset environment variables from the final image. | [optional] |
| **unsetlabel** | [**List&lt;String&gt;**](String.md)| Unset the image label, causing the label not to be inherited from the base image. | [optional] |
| **volume** | [**List&lt;String&gt;**](String.md)| Extra volumes that should be mounted in the build container. | [optional] |

### Return type

[**ImageBuildLibpod200Response**](ImageBuildLibpod200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK (As of version 1.xx) |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageChangesLibpod"></a>
# **imageChangesLibpod**
> imageChangesLibpod(name).parent(parent).diffType(diffType).execute();

Report on changes to images&#39;s filesystem; adds, deletes or modifications.

Returns which files in an image&#39;s filesystem have been added, deleted, or modified. The Kind of modification can be one of:  0: Modified 1: Added 2: Deleted 

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or id of the image
    String parent = "parent_example"; // String | specify a second layer which is used to compare against it instead of the parent layer
    String diffType = "all"; // String | select what you want to match, default is all
    try {
      apiInstance.imageChangesLibpod(name)
            .parent(parent)
            .diffType(diffType)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageChangesLibpod");
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
| **name** | **String**| the name or id of the image | |
| **parent** | **String**| specify a second layer which is used to compare against it instead of the parent layer | [optional] |
| **diffType** | **String**| select what you want to match, default is all | [optional] [enum: all, container, image] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Changes |  -  |
| **404** | No such container |  -  |
| **500** | Internal server error |  -  |

<a id="imageDeleteAllLibpod"></a>
# **imageDeleteAllLibpod**
> LibpodImagesRemoveReport imageDeleteAllLibpod().images(images).all(all).force(force).ignore(ignore).lookupManifest(lookupManifest).execute();

Remove one or more images from the storage.

Remove one or more images from the storage.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    List<String> images = Arrays.asList(); // List<String> | Images IDs or names to remove.
    Boolean all = true; // Boolean | Remove all images.
    Boolean force = true; // Boolean | Force image removal (including containers using the images).
    Boolean ignore = true; // Boolean | Ignore if a specified image does not exist and do not throw an error.
    Boolean lookupManifest = true; // Boolean | Resolves to manifest list instead of image.
    try {
      LibpodImagesRemoveReport result = apiInstance.imageDeleteAllLibpod()
            .images(images)
            .all(all)
            .force(force)
            .ignore(ignore)
            .lookupManifest(lookupManifest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageDeleteAllLibpod");
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
| **images** | [**List&lt;String&gt;**](String.md)| Images IDs or names to remove. | [optional] |
| **all** | **Boolean**| Remove all images. | [optional] [default to true] |
| **force** | **Boolean**| Force image removal (including containers using the images). | [optional] |
| **ignore** | **Boolean**| Ignore if a specified image does not exist and do not throw an error. | [optional] |
| **lookupManifest** | **Boolean**| Resolves to manifest list instead of image. | [optional] |

### Return type

[**LibpodImagesRemoveReport**](LibpodImagesRemoveReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Remove |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageDeleteLibpod"></a>
# **imageDeleteLibpod**
> LibpodImagesRemoveReport imageDeleteLibpod(name).force(force).execute();

Remove an image from the local storage.

Remove an image from the local storage.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | name or ID of image to remove
    Boolean force = true; // Boolean | remove the image even if used by containers or has other tags
    try {
      LibpodImagesRemoveReport result = apiInstance.imageDeleteLibpod(name)
            .force(force)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageDeleteLibpod");
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
| **name** | **String**| name or ID of image to remove | |
| **force** | **Boolean**| remove the image even if used by containers or has other tags | [optional] |

### Return type

[**LibpodImagesRemoveReport**](LibpodImagesRemoveReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Remove |  -  |
| **400** | Bad parameter in request |  -  |
| **404** | No such image |  -  |
| **409** | Conflict error in operation |  -  |
| **500** | Internal server error |  -  |

<a id="imageExistsLibpod"></a>
# **imageExistsLibpod**
> imageExistsLibpod(name).execute();

Image exists

Check if image exists in local store

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      apiInstance.imageExistsLibpod(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageExistsLibpod");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | image exists |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageExportLibpod"></a>
# **imageExportLibpod**
> File imageExportLibpod().format(format).references(references).compress(compress).ociAcceptUncompressedLayers(ociAcceptUncompressedLayers).execute();

Export multiple images

Export multiple images into a single object. Only &#x60;docker-archive&#x60; is currently supported.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String format = "format_example"; // String | format for exported image (only docker-archive is supported)
    List<String> references = Arrays.asList(); // List<String> | references to images to export
    Boolean compress = true; // Boolean | use compression on image
    Boolean ociAcceptUncompressedLayers = true; // Boolean | accept uncompressed layers when copying OCI images
    try {
      File result = apiInstance.imageExportLibpod()
            .format(format)
            .references(references)
            .compress(compress)
            .ociAcceptUncompressedLayers(ociAcceptUncompressedLayers)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageExportLibpod");
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
| **format** | **String**| format for exported image (only docker-archive is supported) | [optional] |
| **references** | [**List&lt;String&gt;**](String.md)| references to images to export | [optional] |
| **compress** | **Boolean**| use compression on image | [optional] |
| **ociAcceptUncompressedLayers** | **Boolean**| accept uncompressed layers when copying OCI images | [optional] |

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

<a id="imageGetLibpod"></a>
# **imageGetLibpod**
> File imageGetLibpod(name).format(format).compress(compress).execute();

Export an image

Export an image

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String format = "format_example"; // String | format for exported image
    Boolean compress = true; // Boolean | use compression on image
    try {
      File result = apiInstance.imageGetLibpod(name)
            .format(format)
            .compress(compress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageGetLibpod");
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
| **format** | **String**| format for exported image | [optional] |
| **compress** | **Boolean**| use compression on image | [optional] |

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
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageHistoryLibpod"></a>
# **imageHistoryLibpod**
> HistoryResponse imageHistoryLibpod(name).execute();

History of an image

Return parent layers of an image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      HistoryResponse result = apiInstance.imageHistoryLibpod(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageHistoryLibpod");
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

<a id="imageImportLibpod"></a>
# **imageImportLibpod**
> ImageImportReport imageImportLibpod(upload).contentType(contentType).changes(changes).message(message).reference(reference).url(url).execute();

Import image

Import a previously exported tarball as an image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    File upload = new File("/path/to/file"); // File | tarball for imported image
    String contentType = "application/x-tar"; // String | 
    List<String> changes = Arrays.asList(); // List<String> | Apply the following possible instructions to the created image: CMD | ENTRYPOINT | ENV | EXPOSE | LABEL | STOPSIGNAL | USER | VOLUME | WORKDIR.  JSON encoded string
    String message = "message_example"; // String | Set commit message for imported image
    String reference = "reference_example"; // String | Optional Name[:TAG] for the image
    String url = "url_example"; // String | Load image from the specified URL
    try {
      ImageImportReport result = apiInstance.imageImportLibpod(upload)
            .contentType(contentType)
            .changes(changes)
            .message(message)
            .reference(reference)
            .url(url)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageImportLibpod");
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
| **upload** | **File**| tarball for imported image | |
| **contentType** | **String**|  | [optional] [default to application/x-tar] [enum: application/x-tar] |
| **changes** | [**List&lt;String&gt;**](String.md)| Apply the following possible instructions to the created image: CMD | ENTRYPOINT | ENV | EXPOSE | LABEL | STOPSIGNAL | USER | VOLUME | WORKDIR.  JSON encoded string | [optional] |
| **message** | **String**| Set commit message for imported image | [optional] |
| **reference** | **String**| Optional Name[:TAG] for the image | [optional] |
| **url** | **String**| Load image from the specified URL | [optional] |

### Return type

[**ImageImportReport**](ImageImportReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Import |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageInspectLibpod"></a>
# **imageInspectLibpod**
> ImageData imageInspectLibpod(name).execute();

Inspect an image

Obtain low-level information about an image

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    try {
      ImageData result = apiInstance.imageInspectLibpod(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageInspectLibpod");
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

[**ImageData**](ImageData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inspect Image |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageListLibpod"></a>
# **imageListLibpod**
> List&lt;LibpodImageSummary&gt; imageListLibpod().all(all).filters(filters).execute();

List Images

Returns a list of images on the server

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    Boolean all = false; // Boolean | Show all images. Only images from a final layer (no children) are shown by default.
    String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the images list. Available filters: - `before`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) - `dangling=true` - `label=key` or `label=\"key=value\"` of an image label - `reference`=(`<image-name>[:<tag>]`) - `id`=(`<image-id>`) - `since`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) 
    try {
      List<LibpodImageSummary> result = apiInstance.imageListLibpod()
            .all(all)
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageListLibpod");
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
| **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the images list. Available filters: - &#x60;before&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;dangling&#x3D;true&#x60; - &#x60;label&#x3D;key&#x60; or &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; of an image label - &#x60;reference&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;) - &#x60;id&#x60;&#x3D;(&#x60;&lt;image-id&gt;&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;)  | [optional] |

### Return type

[**List&lt;LibpodImageSummary&gt;**](LibpodImageSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image summary for libpod API |  -  |
| **500** | Internal server error |  -  |

<a id="imageLoadLibpod"></a>
# **imageLoadLibpod**
> ImageLoadReport imageLoadLibpod(upload).execute();

Load image

Load an image (oci-archive or docker-archive) stream.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String upload = "upload_example"; // String | tarball of container image
    try {
      ImageLoadReport result = apiInstance.imageLoadLibpod(upload)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageLoadLibpod");
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
| **upload** | **String**| tarball of container image | |

### Return type

[**ImageLoadReport**](ImageLoadReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-tar
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Load |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imagePruneLibpod"></a>
# **imagePruneLibpod**
> List&lt;PruneReport&gt; imagePruneLibpod().all(all).external(external).buildcache(buildcache).filters(filters).execute();

Prune unused images

Remove images that are not being used by a container

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    Boolean all = false; // Boolean | Remove all images not in use by containers, not just dangling ones 
    Boolean external = false; // Boolean | Remove images even when they are used by external containers (e.g, by build containers) 
    Boolean buildcache = false; // Boolean | Remove persistent build cache created by build instructions such as `--mount=type=cache`. 
    String filters = "filters_example"; // String | filters to apply to image pruning, encoded as JSON (map[string][]string). Available filters:   - `dangling=<boolean>` When set to `true` (or `1`), prune only      unused *and* untagged images. When set to `false`      (or `0`), all unused images are pruned.   - `until=<string>` Prune images created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time.   - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune images with (or without, in case `label!=...` is used) the specified labels. 
    try {
      List<PruneReport> result = apiInstance.imagePruneLibpod()
            .all(all)
            .external(external)
            .buildcache(buildcache)
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagePruneLibpod");
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
| **all** | **Boolean**| Remove all images not in use by containers, not just dangling ones  | [optional] [default to false] |
| **external** | **Boolean**| Remove images even when they are used by external containers (e.g, by build containers)  | [optional] [default to false] |
| **buildcache** | **Boolean**| Remove persistent build cache created by build instructions such as &#x60;--mount&#x3D;type&#x3D;cache&#x60;.  | [optional] [default to false] |
| **filters** | **String**| filters to apply to image pruning, encoded as JSON (map[string][]string). Available filters:   - &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to &#x60;true&#x60; (or &#x60;1&#x60;), prune only      unused *and* untagged images. When set to &#x60;false&#x60;      (or &#x60;0&#x60;), all unused images are pruned.   - &#x60;until&#x3D;&lt;string&gt;&#x60; Prune images created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time.   - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune images with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  | [optional] |

### Return type

[**List&lt;PruneReport&gt;**](PruneReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Prune |  -  |
| **500** | Internal server error |  -  |

<a id="imagePullLibpod"></a>
# **imagePullLibpod**
> LibpodImagesPullReport imagePullLibpod().reference(reference).quiet(quiet).compatMode(compatMode).arch(arch).OS(OS).variant(variant).policy(policy).tlsVerify(tlsVerify).allTags(allTags).xRegistryAuth(xRegistryAuth).execute();

Pull images

Pull one or more images from a container registry.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String reference = "reference_example"; // String | Mandatory reference to the image (e.g., quay.io/image/name:tag)
    Boolean quiet = false; // Boolean | silences extra stream data on pull
    Boolean compatMode = false; // Boolean | Return the same JSON payload as the Docker-compat endpoint.
    String arch = "arch_example"; // String | Pull image for the specified architecture.
    String OS = "OS_example"; // String | Pull image for the specified operating system.
    String variant = "variant_example"; // String | Pull image for the specified variant.
    String policy = "policy_example"; // String | Pull policy, \"always\" (default), \"missing\", \"newer\", \"never\".
    Boolean tlsVerify = true; // Boolean | Require TLS verification.
    Boolean allTags = true; // Boolean | Pull all tagged images in the repository.
    String xRegistryAuth = "xRegistryAuth_example"; // String | base-64 encoded auth config. Must include the following four values: username, password, email and server address OR simply just an identity token.
    try {
      LibpodImagesPullReport result = apiInstance.imagePullLibpod()
            .reference(reference)
            .quiet(quiet)
            .compatMode(compatMode)
            .arch(arch)
            .OS(OS)
            .variant(variant)
            .policy(policy)
            .tlsVerify(tlsVerify)
            .allTags(allTags)
            .xRegistryAuth(xRegistryAuth)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagePullLibpod");
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
| **reference** | **String**| Mandatory reference to the image (e.g., quay.io/image/name:tag) | [optional] |
| **quiet** | **Boolean**| silences extra stream data on pull | [optional] [default to false] |
| **compatMode** | **Boolean**| Return the same JSON payload as the Docker-compat endpoint. | [optional] [default to false] |
| **arch** | **String**| Pull image for the specified architecture. | [optional] |
| **OS** | **String**| Pull image for the specified operating system. | [optional] |
| **variant** | **String**| Pull image for the specified variant. | [optional] |
| **policy** | **String**| Pull policy, \&quot;always\&quot; (default), \&quot;missing\&quot;, \&quot;newer\&quot;, \&quot;never\&quot;. | [optional] |
| **tlsVerify** | **Boolean**| Require TLS verification. | [optional] [default to true] |
| **allTags** | **Boolean**| Pull all tagged images in the repository. | [optional] |
| **xRegistryAuth** | **String**| base-64 encoded auth config. Must include the following four values: username, password, email and server address OR simply just an identity token. | [optional] |

### Return type

[**LibpodImagesPullReport**](LibpodImagesPullReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Pull |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imagePushLibpod"></a>
# **imagePushLibpod**
> File imagePushLibpod(name).destination(destination).forceCompressionFormat(forceCompressionFormat).compressionFormat(compressionFormat).compressionLevel(compressionLevel).tlsVerify(tlsVerify).quiet(quiet).format(format).all(all).removeSignatures(removeSignatures).retry(retry).retryDelay(retryDelay).xRegistryAuth(xRegistryAuth).execute();

Push Image

Push an image to a container registry

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of image to push.
    String destination = "destination_example"; // String | Allows for pushing the image to a different destination than the image refers to.
    Boolean forceCompressionFormat = false; // Boolean | Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry.
    String compressionFormat = "compressionFormat_example"; // String | Compression format used to compress image layers.
    Integer compressionLevel = 56; // Integer | Compression level used to compress image layers.
    Boolean tlsVerify = true; // Boolean | Require TLS verification.
    Boolean quiet = true; // Boolean | Silences extra stream data on push.
    String format = "format_example"; // String | Manifest type (oci, v2s1, or v2s2) to use when pushing an image. Default is manifest type of source, with fallbacks.
    Boolean all = true; // Boolean | All indicates whether to push all images related to the image list.
    Boolean removeSignatures = true; // Boolean | Discard any pre-existing signatures in the image.
    Integer retry = 56; // Integer | Number of times to retry push in case of failure.
    String retryDelay = "retryDelay_example"; // String | Delay between retries in case of push failures. Duration format such as \"412ms\", or \"3.5h\".
    String xRegistryAuth = "xRegistryAuth_example"; // String | A base64-encoded auth configuration.
    try {
      File result = apiInstance.imagePushLibpod(name)
            .destination(destination)
            .forceCompressionFormat(forceCompressionFormat)
            .compressionFormat(compressionFormat)
            .compressionLevel(compressionLevel)
            .tlsVerify(tlsVerify)
            .quiet(quiet)
            .format(format)
            .all(all)
            .removeSignatures(removeSignatures)
            .retry(retry)
            .retryDelay(retryDelay)
            .xRegistryAuth(xRegistryAuth)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagePushLibpod");
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
| **destination** | **String**| Allows for pushing the image to a different destination than the image refers to. | [optional] |
| **forceCompressionFormat** | **Boolean**| Enforce compressing the layers with the specified --compression and do not reuse differently compressed blobs on the registry. | [optional] [default to false] |
| **compressionFormat** | **String**| Compression format used to compress image layers. | [optional] |
| **compressionLevel** | **Integer**| Compression level used to compress image layers. | [optional] |
| **tlsVerify** | **Boolean**| Require TLS verification. | [optional] [default to true] |
| **quiet** | **Boolean**| Silences extra stream data on push. | [optional] [default to true] |
| **format** | **String**| Manifest type (oci, v2s1, or v2s2) to use when pushing an image. Default is manifest type of source, with fallbacks. | [optional] |
| **all** | **Boolean**| All indicates whether to push all images related to the image list. | [optional] |
| **removeSignatures** | **Boolean**| Discard any pre-existing signatures in the image. | [optional] |
| **retry** | **Integer**| Number of times to retry push in case of failure. | [optional] |
| **retryDelay** | **String**| Delay between retries in case of push failures. Duration format such as \&quot;412ms\&quot;, or \&quot;3.5h\&quot;. | [optional] |
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

<a id="imageResolveLibpod"></a>
# **imageResolveLibpod**
> imageResolveLibpod(name).execute();

Resolve an image (short) name

Resolve the passed image name to a list of fully-qualified images referring to container registries.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the (short) name to resolve
    try {
      apiInstance.imageResolveLibpod(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageResolveLibpod");
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
| **name** | **String**| the (short) name to resolve | |

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
| **204** | resolved image names |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageScpLibpod"></a>
# **imageScpLibpod**
> ScpReport imageScpLibpod(name).destination(destination).quiet(quiet).execute();

Copy an image from one host to another

Copy an image from one host to another

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | source connection/image
    String destination = "destination_example"; // String | dest connection/image
    Boolean quiet = false; // Boolean | quiet output
    try {
      ScpReport result = apiInstance.imageScpLibpod(name)
            .destination(destination)
            .quiet(quiet)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageScpLibpod");
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
| **name** | **String**| source connection/image | |
| **destination** | **String**| dest connection/image | [optional] |
| **quiet** | **Boolean**| quiet output | [optional] [default to false] |

### Return type

[**ScpReport**](ScpReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Scp |  -  |
| **400** | Bad parameter in request |  -  |
| **500** | Internal server error |  -  |

<a id="imageSearchLibpod"></a>
# **imageSearchLibpod**
> ImageSearch200Response imageSearchLibpod().term(term).limit(limit).filters(filters).tlsVerify(tlsVerify).listTags(listTags).execute();

Search images

Search registries for images

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String term = "term_example"; // String | term to search
    Integer limit = 25; // Integer | maximum number of results
    String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the images list. Available filters: - `is-automated=(true|false)` - `is-official=(true|false)` - `stars=<number>` Matches images that have at least 'number' stars. 
    Boolean tlsVerify = true; // Boolean | Require HTTPS and verify signatures when contacting registries.
    Boolean listTags = false; // Boolean | list the available tags in the repository
    try {
      ImageSearch200Response result = apiInstance.imageSearchLibpod()
            .term(term)
            .limit(limit)
            .filters(filters)
            .tlsVerify(tlsVerify)
            .listTags(listTags)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageSearchLibpod");
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
| **listTags** | **Boolean**| list the available tags in the repository | [optional] [default to false] |

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
| **500** | Internal server error |  -  |

<a id="imageTagLibpod"></a>
# **imageTagLibpod**
> imageTagLibpod(name).repo(repo).tag(tag).execute();

Tag an image

Tag an image so that it becomes part of a repository.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String repo = "repo_example"; // String | the repository to tag in
    String tag = "tag_example"; // String | the name of the new tag
    try {
      apiInstance.imageTagLibpod(name)
            .repo(repo)
            .tag(tag)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageTagLibpod");
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

<a id="imageTreeLibpod"></a>
# **imageTreeLibpod**
> ImageTreeReport imageTreeLibpod(name).whatrequires(whatrequires).execute();

Image tree

Retrieve the image tree for the provided image name or ID

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    Boolean whatrequires = true; // Boolean | show all child images and layers of the specified image
    try {
      ImageTreeReport result = apiInstance.imageTreeLibpod(name)
            .whatrequires(whatrequires)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageTreeLibpod");
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
| **whatrequires** | **Boolean**| show all child images and layers of the specified image | [optional] |

### Return type

[**ImageTreeReport**](ImageTreeReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image Tree |  -  |
| **404** | No such image |  -  |
| **500** | Internal server error |  -  |

<a id="imageUntagLibpod"></a>
# **imageUntagLibpod**
> imageUntagLibpod(name).repo(repo).tag(tag).execute();

Untag an image

Untag an image. If not repo and tag are specified, all tags are removed from the image.

### Example
```java
// Import classes:
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.models.*;
import io.github.pod4dev.libpodj.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://podman.io");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | the name or ID of the container
    String repo = "repo_example"; // String | the repository to untag
    String tag = "tag_example"; // String | the name of the tag to untag
    try {
      apiInstance.imageUntagLibpod(name)
            .repo(repo)
            .tag(tag)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imageUntagLibpod");
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
| **repo** | **String**| the repository to untag | [optional] |
| **tag** | **String**| the name of the tag to untag | [optional] |

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

