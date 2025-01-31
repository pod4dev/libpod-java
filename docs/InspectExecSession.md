

# InspectExecSession


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canRemove** | **Boolean** | CanRemove is legacy and used purely for compatibility reasons. Will always be set to true, unless the exec session is running. |  [optional] |
|**containerID** | **String** | ContainerID is the ID of the container this exec session is attached to. |  [optional] |
|**detachKeys** | **String** | DetachKeys are the detach keys used by the exec session. If set to \&quot;\&quot; the default keys are being used. Will show \&quot;&lt;none&gt;\&quot; if no detach keys are set. |  [optional] |
|**exitCode** | **Long** | ExitCode is the exit code of the exec session. Will be set to 0 if the exec session has not yet exited. |  [optional] |
|**ID** | **String** | ID is the ID of the exec session. |  [optional] |
|**openStderr** | **Boolean** | OpenStderr is whether the container&#39;s STDERR stream will be attached. Always set to true if the exec session created a TTY. |  [optional] |
|**openStdin** | **Boolean** | OpenStdin is whether the container&#39;s STDIN stream will be attached to. |  [optional] |
|**openStdout** | **Boolean** | OpenStdout is whether the container&#39;s STDOUT stream will be attached. Always set to true if the exec session created a TTY. |  [optional] |
|**pid** | **Long** | Pid is the PID of the exec session&#39;s process. Will be set to 0 if the exec session is not running. |  [optional] |
|**processConfig** | [**InspectExecProcess**](InspectExecProcess.md) |  |  [optional] |
|**running** | **Boolean** | Running is whether the exec session is running. |  [optional] |


## Implemented Interfaces

* Serializable


