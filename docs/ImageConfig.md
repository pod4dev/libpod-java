

# ImageConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**argsEscaped** | **Boolean** | ArgsEscaped  Deprecated: This field is present only for legacy compatibility with Docker and should not be used by new image builders.  It is used by Docker for Windows images to indicate that the &#x60;Entrypoint&#x60; or &#x60;Cmd&#x60; or both, contains only a single element array, that is a pre-escaped, and combined into a single string &#x60;CommandLine&#x60;. If &#x60;true&#x60; the value in &#x60;Entrypoint&#x60; or &#x60;Cmd&#x60; should be used as-is to avoid double escaping. https://github.com/opencontainers/image-spec/pull/892 |  [optional] |
|**cmd** | **List&lt;String&gt;** | Cmd defines the default arguments to the entrypoint of the container. |  [optional] |
|**entrypoint** | **List&lt;String&gt;** | Entrypoint defines a list of arguments to use as the command to execute when the container starts. |  [optional] |
|**env** | **List&lt;String&gt;** | Env is a list of environment variables to be used in a container. |  [optional] |
|**exposedPorts** | **Map&lt;String, Object&gt;** | ExposedPorts a set of ports to expose from a container running this image. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels contains arbitrary metadata for the container. |  [optional] |
|**stopSignal** | **String** | StopSignal contains the system call signal that will be sent to the container to exit. |  [optional] |
|**user** | **String** | User defines the username or UID which the process in the container should run as. |  [optional] |
|**volumes** | **Map&lt;String, Object&gt;** | Volumes is a set of directories describing where the process is likely write data specific to a container instance. |  [optional] |
|**workingDir** | **String** | WorkingDir sets the current working directory of the entrypoint process in the container. |  [optional] |


## Implemented Interfaces

* Serializable


