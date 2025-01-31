/*
 * supports a RESTful API for the Libpod library
 * This documentation describes the Podman v2.x+ RESTful API. It consists of a Docker-compatible API and a Libpod API providing support for Podman’s unique features such as pods.  To start the service and keep it running for 5,000 seconds (-t 0 runs forever):  podman system service -t 5000 &  You can then use cURL on the socket using requests documented below.  NOTE: if you install the package podman-docker, it will create a symbolic link for /run/docker.sock to /run/podman/podman.sock  NOTE: Some fields in the API response JSON are encoded as omitempty, which means that if said field has a zero value, they will not be encoded in the API response. This is a feature to help reduce the size of the JSON responses returned via the API.  NOTE: Due to the limitations of [go-swagger](https://github.com/go-swagger/go-swagger), some field values that have a complex type show up as null in the docs as well as in the API responses. This is because the zero value for the field type is null. The field description in the docs will state what type the field is expected to be for such cases.  See podman-system-service(1) for more information.  Quick Examples:  'podman info'  curl --unix-socket /run/podman/podman.sock http://d/v5.0.0/libpod/info  'podman pull quay.io/containers/podman'  curl -XPOST --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/images/create?fromImage=quay.io%2Fcontainers%2Fpodman'  'podman list images'  curl --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/libpod/images/json' | jq
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: podman@lists.podman.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.pod4dev.libpodj.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.pod4dev.libpodj.JSON;

/**
 * VolumeConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VolumeConfigResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ANONYMOUS = "Anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private Boolean anonymous;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_G_I_D = "GID";
  @SerializedName(SERIALIZED_NAME_G_I_D)
  private Long GID;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_LOCK_NUMBER = "LockNumber";
  @SerializedName(SERIALIZED_NAME_LOCK_NUMBER)
  private Integer lockNumber;

  public static final String SERIALIZED_NAME_MOUNT_COUNT = "MountCount";
  @SerializedName(SERIALIZED_NAME_MOUNT_COUNT)
  private Integer mountCount;

  public static final String SERIALIZED_NAME_MOUNTPOINT = "Mountpoint";
  @SerializedName(SERIALIZED_NAME_MOUNTPOINT)
  private String mountpoint;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEEDS_CHOWN = "NeedsChown";
  @SerializedName(SERIALIZED_NAME_NEEDS_CHOWN)
  private Boolean needsChown;

  public static final String SERIALIZED_NAME_NEEDS_COPY_UP = "NeedsCopyUp";
  @SerializedName(SERIALIZED_NAME_NEEDS_COPY_UP)
  private Boolean needsCopyUp;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Map<String, Object> status = null;

  public static final String SERIALIZED_NAME_STORAGE_I_D = "StorageID";
  @SerializedName(SERIALIZED_NAME_STORAGE_I_D)
  private String storageID;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_U_I_D = "UID";
  @SerializedName(SERIALIZED_NAME_U_I_D)
  private Long UID;

  public VolumeConfigResponse() {
  }

  public VolumeConfigResponse anonymous(Boolean anonymous) {
    
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Anonymous indicates that the volume was created as an anonymous volume for a specific container, and will be removed when any container using it is removed.
   * @return anonymous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anonymous indicates that the volume was created as an anonymous volume for a specific container, and will be removed when any container using it is removed.")

  public Boolean getAnonymous() {
    return anonymous;
  }


  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }


  public VolumeConfigResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt is the date and time the volume was created at. This is not stored for older Libpod volumes; if so, it will be omitted.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "CreatedAt is the date and time the volume was created at. This is not stored for older Libpod volumes; if so, it will be omitted.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public VolumeConfigResponse driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Driver is the driver used to create the volume. If set to \&quot;local\&quot; or \&quot;\&quot;, the Local driver (Podman built-in code) is used to service the volume; otherwise, a volume plugin with the given name is used to mount and manage the volume.
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Driver is the driver used to create the volume. If set to \"local\" or \"\", the Local driver (Podman built-in code) is used to service the volume; otherwise, a volume plugin with the given name is used to mount and manage the volume.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public VolumeConfigResponse GID(Long GID) {
    
    this.GID = GID;
    return this;
  }

   /**
   * GID is the GID that the volume was created with.
   * @return GID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GID is the GID that the volume was created with.")

  public Long getGID() {
    return GID;
  }


  public void setGID(Long GID) {
    this.GID = GID;
  }


  public VolumeConfigResponse labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public VolumeConfigResponse putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels includes the volume&#39;s configured labels, key:value pairs that can be passed during volume creation to provide information for third party tools.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels includes the volume's configured labels, key:value pairs that can be passed during volume creation to provide information for third party tools.")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public VolumeConfigResponse lockNumber(Integer lockNumber) {
    
    this.lockNumber = lockNumber;
    return this;
  }

   /**
   * LockNumber is the number of the volume&#39;s Libpod lock.
   * @return lockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LockNumber is the number of the volume's Libpod lock.")

  public Integer getLockNumber() {
    return lockNumber;
  }


  public void setLockNumber(Integer lockNumber) {
    this.lockNumber = lockNumber;
  }


  public VolumeConfigResponse mountCount(Integer mountCount) {
    
    this.mountCount = mountCount;
    return this;
  }

   /**
   * MountCount is the number of times this volume has been mounted.
   * @return mountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MountCount is the number of times this volume has been mounted.")

  public Integer getMountCount() {
    return mountCount;
  }


  public void setMountCount(Integer mountCount) {
    this.mountCount = mountCount;
  }


  public VolumeConfigResponse mountpoint(String mountpoint) {
    
    this.mountpoint = mountpoint;
    return this;
  }

   /**
   * Mountpoint is the path on the host where the volume is mounted.
   * @return mountpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mountpoint is the path on the host where the volume is mounted.")

  public String getMountpoint() {
    return mountpoint;
  }


  public void setMountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
  }


  public VolumeConfigResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the volume.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the name of the volume.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VolumeConfigResponse needsChown(Boolean needsChown) {
    
    this.needsChown = needsChown;
    return this;
  }

   /**
   * NeedsChown indicates that the next time the volume is mounted into a container, the container will chown the volume to the container process UID/GID.
   * @return needsChown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NeedsChown indicates that the next time the volume is mounted into a container, the container will chown the volume to the container process UID/GID.")

  public Boolean getNeedsChown() {
    return needsChown;
  }


  public void setNeedsChown(Boolean needsChown) {
    this.needsChown = needsChown;
  }


  public VolumeConfigResponse needsCopyUp(Boolean needsCopyUp) {
    
    this.needsCopyUp = needsCopyUp;
    return this;
  }

   /**
   * NeedsCopyUp indicates that the next time the volume is mounted into
   * @return needsCopyUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NeedsCopyUp indicates that the next time the volume is mounted into")

  public Boolean getNeedsCopyUp() {
    return needsCopyUp;
  }


  public void setNeedsCopyUp(Boolean needsCopyUp) {
    this.needsCopyUp = needsCopyUp;
  }


  public VolumeConfigResponse options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public VolumeConfigResponse putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Options is a set of options that were used when creating the volume. For the Local driver, these are mount options that will be used to determine how a local filesystem is mounted; they are handled as parameters to Mount in a manner described in the volume create manpage. For non-local drivers, these are passed as-is to the volume plugin.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Options is a set of options that were used when creating the volume. For the Local driver, these are mount options that will be used to determine how a local filesystem is mounted; they are handled as parameters to Mount in a manner described in the volume create manpage. For non-local drivers, these are passed as-is to the volume plugin.")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public VolumeConfigResponse scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope is unused and provided solely for Docker compatibility. It is unconditionally set to \&quot;local\&quot;.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scope is unused and provided solely for Docker compatibility. It is unconditionally set to \"local\".")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public VolumeConfigResponse status(Map<String, Object> status) {
    
    this.status = status;
    return this;
  }

  public VolumeConfigResponse putStatusItem(String key, Object statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

   /**
   * Status is used to return information on the volume&#39;s current state, if the volume was created using a volume plugin (uses a Driver that is not the local driver). Status is provided to us by an external program, so no guarantees are made about its format or contents. Further, it is an optional field, so it may not be set even in cases where a volume plugin is in use.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status is used to return information on the volume's current state, if the volume was created using a volume plugin (uses a Driver that is not the local driver). Status is provided to us by an external program, so no guarantees are made about its format or contents. Further, it is an optional field, so it may not be set even in cases where a volume plugin is in use.")

  public Map<String, Object> getStatus() {
    return status;
  }


  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }


  public VolumeConfigResponse storageID(String storageID) {
    
    this.storageID = storageID;
    return this;
  }

   /**
   * StorageID is the ID of the container backing the volume in c/storage. Only used with Image Volumes.
   * @return storageID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StorageID is the ID of the container backing the volume in c/storage. Only used with Image Volumes.")

  public String getStorageID() {
    return storageID;
  }


  public void setStorageID(String storageID) {
    this.storageID = storageID;
  }


  public VolumeConfigResponse timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout is the specified driver timeout if given
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout is the specified driver timeout if given")

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public VolumeConfigResponse UID(Long UID) {
    
    this.UID = UID;
    return this;
  }

   /**
   * UID is the UID that the volume was created with.
   * @return UID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID is the UID that the volume was created with.")

  public Long getUID() {
    return UID;
  }


  public void setUID(Long UID) {
    this.UID = UID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeConfigResponse volumeConfigResponse = (VolumeConfigResponse) o;
    return Objects.equals(this.anonymous, volumeConfigResponse.anonymous) &&
        Objects.equals(this.createdAt, volumeConfigResponse.createdAt) &&
        Objects.equals(this.driver, volumeConfigResponse.driver) &&
        Objects.equals(this.GID, volumeConfigResponse.GID) &&
        Objects.equals(this.labels, volumeConfigResponse.labels) &&
        Objects.equals(this.lockNumber, volumeConfigResponse.lockNumber) &&
        Objects.equals(this.mountCount, volumeConfigResponse.mountCount) &&
        Objects.equals(this.mountpoint, volumeConfigResponse.mountpoint) &&
        Objects.equals(this.name, volumeConfigResponse.name) &&
        Objects.equals(this.needsChown, volumeConfigResponse.needsChown) &&
        Objects.equals(this.needsCopyUp, volumeConfigResponse.needsCopyUp) &&
        Objects.equals(this.options, volumeConfigResponse.options) &&
        Objects.equals(this.scope, volumeConfigResponse.scope) &&
        Objects.equals(this.status, volumeConfigResponse.status) &&
        Objects.equals(this.storageID, volumeConfigResponse.storageID) &&
        Objects.equals(this.timeout, volumeConfigResponse.timeout) &&
        Objects.equals(this.UID, volumeConfigResponse.UID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, createdAt, driver, GID, labels, lockNumber, mountCount, mountpoint, name, needsChown, needsCopyUp, options, scope, status, storageID, timeout, UID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeConfigResponse {\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lockNumber: ").append(toIndentedString(lockNumber)).append("\n");
    sb.append("    mountCount: ").append(toIndentedString(mountCount)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsChown: ").append(toIndentedString(needsChown)).append("\n");
    sb.append("    needsCopyUp: ").append(toIndentedString(needsCopyUp)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageID: ").append(toIndentedString(storageID)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Anonymous");
    openapiFields.add("CreatedAt");
    openapiFields.add("Driver");
    openapiFields.add("GID");
    openapiFields.add("Labels");
    openapiFields.add("LockNumber");
    openapiFields.add("MountCount");
    openapiFields.add("Mountpoint");
    openapiFields.add("Name");
    openapiFields.add("NeedsChown");
    openapiFields.add("NeedsCopyUp");
    openapiFields.add("Options");
    openapiFields.add("Scope");
    openapiFields.add("Status");
    openapiFields.add("StorageID");
    openapiFields.add("Timeout");
    openapiFields.add("UID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VolumeConfigResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VolumeConfigResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VolumeConfigResponse is not found in the empty JSON string", VolumeConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VolumeConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VolumeConfigResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      if ((jsonObj.get("Mountpoint") != null && !jsonObj.get("Mountpoint").isJsonNull()) && !jsonObj.get("Mountpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mountpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mountpoint").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Scope") != null && !jsonObj.get("Scope").isJsonNull()) && !jsonObj.get("Scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Scope").toString()));
      }
      if ((jsonObj.get("StorageID") != null && !jsonObj.get("StorageID").isJsonNull()) && !jsonObj.get("StorageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorageID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VolumeConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VolumeConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VolumeConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VolumeConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VolumeConfigResponse>() {
           @Override
           public void write(JsonWriter out, VolumeConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VolumeConfigResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VolumeConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VolumeConfigResponse
  * @throws IOException if the JSON string is invalid with respect to VolumeConfigResponse
  */
  public static VolumeConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VolumeConfigResponse.class);
  }

 /**
  * Convert an instance of VolumeConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

