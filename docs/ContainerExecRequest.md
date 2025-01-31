

# ContainerExecRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachStderr** | **Boolean** | Attach to stderr of the exec command |  [optional] |
|**attachStdin** | **Boolean** | Attach to stdin of the exec command |  [optional] |
|**attachStdout** | **Boolean** | Attach to stdout of the exec command |  [optional] |
|**cmd** | **List&lt;String&gt;** | Command to run, as a string or array of strings. |  [optional] |
|**detachKeys** | **String** | \&quot;Override the key sequence for detaching a container. Format is a single character [a-Z] or ctrl-&lt;value&gt; where &lt;value&gt; is one of: a-z, @, ^, [, , or _.\&quot;  |  [optional] |
|**env** | **List&lt;String&gt;** | A list of environment variables in the form [\&quot;VAR&#x3D;value\&quot;, ...] |  [optional] |
|**privileged** | **Boolean** | Runs the exec process with extended privileges |  [optional] |
|**tty** | **Boolean** | Allocate a pseudo-TTY |  [optional] |
|**user** | **String** | \&quot;The user, and optionally, group to run the exec process inside the container. Format is one of: user, user:group, uid, or uid:gid.\&quot;  |  [optional] |
|**workingDir** | **String** | The working directory for the exec process inside the container. |  [optional] |


## Implemented Interfaces

* Serializable


