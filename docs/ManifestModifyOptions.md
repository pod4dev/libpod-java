

# ManifestModifyOptions

swagger 2.0 does not support oneOf for schema validation.  Operation \"update\" uses all fields. Operation \"remove\" uses fields: Operation and Images Operation \"annotate\" uses fields: Operation and Annotations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Boolean** | True when operating on a list to include all images |  [optional] |
|**annotation** | **List&lt;String&gt;** | Annotation to add to the item in the manifest list |  [optional] |
|**annotations** | **Map&lt;String, String&gt;** | Annotations to add to the item in the manifest list by a map which is preferred over Annotation |  [optional] |
|**arch** | **String** | Arch overrides the architecture for the item in the manifest list |  [optional] |
|**artifactAnnotations** | **Map&lt;String, String&gt;** |  |  [optional] |
|**artifactConfig** | **String** |  |  [optional] |
|**artifactConfigType** | **String** |  |  [optional] |
|**artifactExcludeTitles** | **Boolean** |  |  [optional] |
|**artifactFiles** | **List&lt;String&gt;** |  |  [optional] |
|**artifactLayerType** | **String** |  |  [optional] |
|**artifactSubject** | **String** |  |  [optional] |
|**artifactType** | **String** | The following are all of the fields from ManifestAddArtifactOptions. We can&#39;t just embed the whole structure because it embeds a ManifestAnnotateOptions, which would conflict with the one that ManifestAddOptions embeds. |  [optional] |
|**features** | **List&lt;String&gt;** | Feature list for the item in the manifest list |  [optional] |
|**images** | **List&lt;String&gt;** | Images is an optional list of image references to add to manifest list |  [optional] |
|**indexAnnotation** | **List&lt;String&gt;** | IndexAnnotation is a slice of key&#x3D;value annotations to add to the manifest list itself |  [optional] |
|**indexAnnotations** | **Map&lt;String, String&gt;** | IndexAnnotations is a map of key:value annotations to add to the manifest list itself, by a map which is preferred over IndexAnnotation |  [optional] |
|**operation** | **String** |  |  [optional] |
|**os** | **String** | OS overrides the operating system for the item in the manifest list |  [optional] |
|**osFeatures** | **List&lt;String&gt;** | OS features for the item in the manifest list |  [optional] |
|**osVersion** | **String** | OSVersion overrides the operating system for the item in the manifest list |  [optional] |
|**subject** | **String** | IndexSubject is a subject value to set in the manifest list itself |  [optional] |
|**variant** | **String** | Variant for the item in the manifest list |  [optional] |


## Implemented Interfaces

* Serializable


