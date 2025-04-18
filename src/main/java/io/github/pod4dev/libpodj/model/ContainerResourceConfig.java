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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.pod4dev.libpodj.model.LinuxIntelRdt;
import io.github.pod4dev.libpodj.model.LinuxResources;
import io.github.pod4dev.libpodj.model.LinuxThrottleDevice;
import io.github.pod4dev.libpodj.model.LinuxWeightDevice;
import io.github.pod4dev.libpodj.model.POSIXRlimit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.pod4dev.libpodj.JSON;

/**
 * ContainerResourceConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ContainerResourceConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INTEL_RDT = "intelRdt";
  @SerializedName(SERIALIZED_NAME_INTEL_RDT)
  private LinuxIntelRdt intelRdt;

  public static final String SERIALIZED_NAME_OOM_SCORE_ADJ = "oom_score_adj";
  @SerializedName(SERIALIZED_NAME_OOM_SCORE_ADJ)
  private Long oomScoreAdj;

  public static final String SERIALIZED_NAME_R_LIMITS = "r_limits";
  @SerializedName(SERIALIZED_NAME_R_LIMITS)
  private List<@Valid POSIXRlimit> rLimits = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_LIMITS = "resource_limits";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIMITS)
  private LinuxResources resourceLimits;

  public static final String SERIALIZED_NAME_THROTTLE_READ_BPS_DEVICE = "throttleReadBpsDevice";
  @SerializedName(SERIALIZED_NAME_THROTTLE_READ_BPS_DEVICE)
  private Map<String, LinuxThrottleDevice> throttleReadBpsDevice = new HashMap<>();

  public static final String SERIALIZED_NAME_THROTTLE_READ_I_O_P_S_DEVICE = "throttleReadIOPSDevice";
  @SerializedName(SERIALIZED_NAME_THROTTLE_READ_I_O_P_S_DEVICE)
  private Map<String, LinuxThrottleDevice> throttleReadIOPSDevice = new HashMap<>();

  public static final String SERIALIZED_NAME_THROTTLE_WRITE_BPS_DEVICE = "throttleWriteBpsDevice";
  @SerializedName(SERIALIZED_NAME_THROTTLE_WRITE_BPS_DEVICE)
  private Map<String, LinuxThrottleDevice> throttleWriteBpsDevice = new HashMap<>();

  public static final String SERIALIZED_NAME_THROTTLE_WRITE_I_O_P_S_DEVICE = "throttleWriteIOPSDevice";
  @SerializedName(SERIALIZED_NAME_THROTTLE_WRITE_I_O_P_S_DEVICE)
  private Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice = new HashMap<>();

  public static final String SERIALIZED_NAME_UNIFIED = "unified";
  @SerializedName(SERIALIZED_NAME_UNIFIED)
  private Map<String, String> unified = new HashMap<>();

  public static final String SERIALIZED_NAME_WEIGHT_DEVICE = "weightDevice";
  @SerializedName(SERIALIZED_NAME_WEIGHT_DEVICE)
  private Map<String, LinuxWeightDevice> weightDevice = new HashMap<>();

  public ContainerResourceConfig() {
  }

  public ContainerResourceConfig intelRdt(LinuxIntelRdt intelRdt) {
    this.intelRdt = intelRdt;
    return this;
  }

  /**
   * Get intelRdt
   * @return intelRdt
   */
  @jakarta.annotation.Nullable
  @Valid

  public LinuxIntelRdt getIntelRdt() {
    return intelRdt;
  }

  public void setIntelRdt(LinuxIntelRdt intelRdt) {
    this.intelRdt = intelRdt;
  }


  public ContainerResourceConfig oomScoreAdj(Long oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
    return this;
  }

  /**
   * OOMScoreAdj adjusts the score used by the OOM killer to determine processes to kill for the container&#39;s process. Optional.
   * @return oomScoreAdj
   */
  @jakarta.annotation.Nullable

  public Long getOomScoreAdj() {
    return oomScoreAdj;
  }

  public void setOomScoreAdj(Long oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
  }


  public ContainerResourceConfig rLimits(List<@Valid POSIXRlimit> rLimits) {
    this.rLimits = rLimits;
    return this;
  }

  public ContainerResourceConfig addRLimitsItem(POSIXRlimit rLimitsItem) {
    if (this.rLimits == null) {
      this.rLimits = new ArrayList<>();
    }
    this.rLimits.add(rLimitsItem);
    return this;
  }

  /**
   * Rlimits are POSIX rlimits to apply to the container. Optional.
   * @return rLimits
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid POSIXRlimit> getrLimits() {
    return rLimits;
  }

  public void setrLimits(List<@Valid POSIXRlimit> rLimits) {
    this.rLimits = rLimits;
  }


  public ContainerResourceConfig resourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
    return this;
  }

  /**
   * Get resourceLimits
   * @return resourceLimits
   */
  @jakarta.annotation.Nullable
  @Valid

  public LinuxResources getResourceLimits() {
    return resourceLimits;
  }

  public void setResourceLimits(LinuxResources resourceLimits) {
    this.resourceLimits = resourceLimits;
  }


  public ContainerResourceConfig throttleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleReadBpsDeviceItem(String key, LinuxThrottleDevice throttleReadBpsDeviceItem) {
    if (this.throttleReadBpsDevice == null) {
      this.throttleReadBpsDevice = new HashMap<>();
    }
    this.throttleReadBpsDevice.put(key, throttleReadBpsDeviceItem);
    return this;
  }

  /**
   * IO read rate limit per cgroup per device, bytes per second
   * @return throttleReadBpsDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxThrottleDevice> getThrottleReadBpsDevice() {
    return throttleReadBpsDevice;
  }

  public void setThrottleReadBpsDevice(Map<String, LinuxThrottleDevice> throttleReadBpsDevice) {
    this.throttleReadBpsDevice = throttleReadBpsDevice;
  }


  public ContainerResourceConfig throttleReadIOPSDevice(Map<String, LinuxThrottleDevice> throttleReadIOPSDevice) {
    this.throttleReadIOPSDevice = throttleReadIOPSDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleReadIOPSDeviceItem(String key, LinuxThrottleDevice throttleReadIOPSDeviceItem) {
    if (this.throttleReadIOPSDevice == null) {
      this.throttleReadIOPSDevice = new HashMap<>();
    }
    this.throttleReadIOPSDevice.put(key, throttleReadIOPSDeviceItem);
    return this;
  }

  /**
   * IO read rate limit per cgroup per device, IO per second
   * @return throttleReadIOPSDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxThrottleDevice> getThrottleReadIOPSDevice() {
    return throttleReadIOPSDevice;
  }

  public void setThrottleReadIOPSDevice(Map<String, LinuxThrottleDevice> throttleReadIOPSDevice) {
    this.throttleReadIOPSDevice = throttleReadIOPSDevice;
  }


  public ContainerResourceConfig throttleWriteBpsDevice(Map<String, LinuxThrottleDevice> throttleWriteBpsDevice) {
    this.throttleWriteBpsDevice = throttleWriteBpsDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleWriteBpsDeviceItem(String key, LinuxThrottleDevice throttleWriteBpsDeviceItem) {
    if (this.throttleWriteBpsDevice == null) {
      this.throttleWriteBpsDevice = new HashMap<>();
    }
    this.throttleWriteBpsDevice.put(key, throttleWriteBpsDeviceItem);
    return this;
  }

  /**
   * IO write rate limit per cgroup per device, bytes per second
   * @return throttleWriteBpsDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxThrottleDevice> getThrottleWriteBpsDevice() {
    return throttleWriteBpsDevice;
  }

  public void setThrottleWriteBpsDevice(Map<String, LinuxThrottleDevice> throttleWriteBpsDevice) {
    this.throttleWriteBpsDevice = throttleWriteBpsDevice;
  }


  public ContainerResourceConfig throttleWriteIOPSDevice(Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice) {
    this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
    return this;
  }

  public ContainerResourceConfig putThrottleWriteIOPSDeviceItem(String key, LinuxThrottleDevice throttleWriteIOPSDeviceItem) {
    if (this.throttleWriteIOPSDevice == null) {
      this.throttleWriteIOPSDevice = new HashMap<>();
    }
    this.throttleWriteIOPSDevice.put(key, throttleWriteIOPSDeviceItem);
    return this;
  }

  /**
   * IO write rate limit per cgroup per device, IO per second
   * @return throttleWriteIOPSDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxThrottleDevice> getThrottleWriteIOPSDevice() {
    return throttleWriteIOPSDevice;
  }

  public void setThrottleWriteIOPSDevice(Map<String, LinuxThrottleDevice> throttleWriteIOPSDevice) {
    this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
  }


  public ContainerResourceConfig unified(Map<String, String> unified) {
    this.unified = unified;
    return this;
  }

  public ContainerResourceConfig putUnifiedItem(String key, String unifiedItem) {
    if (this.unified == null) {
      this.unified = new HashMap<>();
    }
    this.unified.put(key, unifiedItem);
    return this;
  }

  /**
   * CgroupConf are key-value options passed into the container runtime that are used to configure cgroup v2. Optional.
   * @return unified
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getUnified() {
    return unified;
  }

  public void setUnified(Map<String, String> unified) {
    this.unified = unified;
  }


  public ContainerResourceConfig weightDevice(Map<String, LinuxWeightDevice> weightDevice) {
    this.weightDevice = weightDevice;
    return this;
  }

  public ContainerResourceConfig putWeightDeviceItem(String key, LinuxWeightDevice weightDeviceItem) {
    if (this.weightDevice == null) {
      this.weightDevice = new HashMap<>();
    }
    this.weightDevice.put(key, weightDeviceItem);
    return this;
  }

  /**
   * Weight per cgroup per device, can override BlkioWeight
   * @return weightDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, LinuxWeightDevice> getWeightDevice() {
    return weightDevice;
  }

  public void setWeightDevice(Map<String, LinuxWeightDevice> weightDevice) {
    this.weightDevice = weightDevice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerResourceConfig containerResourceConfig = (ContainerResourceConfig) o;
    return Objects.equals(this.intelRdt, containerResourceConfig.intelRdt) &&
        Objects.equals(this.oomScoreAdj, containerResourceConfig.oomScoreAdj) &&
        Objects.equals(this.rLimits, containerResourceConfig.rLimits) &&
        Objects.equals(this.resourceLimits, containerResourceConfig.resourceLimits) &&
        Objects.equals(this.throttleReadBpsDevice, containerResourceConfig.throttleReadBpsDevice) &&
        Objects.equals(this.throttleReadIOPSDevice, containerResourceConfig.throttleReadIOPSDevice) &&
        Objects.equals(this.throttleWriteBpsDevice, containerResourceConfig.throttleWriteBpsDevice) &&
        Objects.equals(this.throttleWriteIOPSDevice, containerResourceConfig.throttleWriteIOPSDevice) &&
        Objects.equals(this.unified, containerResourceConfig.unified) &&
        Objects.equals(this.weightDevice, containerResourceConfig.weightDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intelRdt, oomScoreAdj, rLimits, resourceLimits, throttleReadBpsDevice, throttleReadIOPSDevice, throttleWriteBpsDevice, throttleWriteIOPSDevice, unified, weightDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerResourceConfig {\n");
    sb.append("    intelRdt: ").append(toIndentedString(intelRdt)).append("\n");
    sb.append("    oomScoreAdj: ").append(toIndentedString(oomScoreAdj)).append("\n");
    sb.append("    rLimits: ").append(toIndentedString(rLimits)).append("\n");
    sb.append("    resourceLimits: ").append(toIndentedString(resourceLimits)).append("\n");
    sb.append("    throttleReadBpsDevice: ").append(toIndentedString(throttleReadBpsDevice)).append("\n");
    sb.append("    throttleReadIOPSDevice: ").append(toIndentedString(throttleReadIOPSDevice)).append("\n");
    sb.append("    throttleWriteBpsDevice: ").append(toIndentedString(throttleWriteBpsDevice)).append("\n");
    sb.append("    throttleWriteIOPSDevice: ").append(toIndentedString(throttleWriteIOPSDevice)).append("\n");
    sb.append("    unified: ").append(toIndentedString(unified)).append("\n");
    sb.append("    weightDevice: ").append(toIndentedString(weightDevice)).append("\n");
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
    openapiFields.add("intelRdt");
    openapiFields.add("oom_score_adj");
    openapiFields.add("r_limits");
    openapiFields.add("resource_limits");
    openapiFields.add("throttleReadBpsDevice");
    openapiFields.add("throttleReadIOPSDevice");
    openapiFields.add("throttleWriteBpsDevice");
    openapiFields.add("throttleWriteIOPSDevice");
    openapiFields.add("unified");
    openapiFields.add("weightDevice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerResourceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerResourceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerResourceConfig is not found in the empty JSON string", ContainerResourceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerResourceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerResourceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `intelRdt`
      if (jsonObj.get("intelRdt") != null && !jsonObj.get("intelRdt").isJsonNull()) {
        LinuxIntelRdt.validateJsonElement(jsonObj.get("intelRdt"));
      }
      if (jsonObj.get("r_limits") != null && !jsonObj.get("r_limits").isJsonNull()) {
        JsonArray jsonArrayrLimits = jsonObj.getAsJsonArray("r_limits");
        if (jsonArrayrLimits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("r_limits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `r_limits` to be an array in the JSON string but got `%s`", jsonObj.get("r_limits").toString()));
          }

          // validate the optional field `r_limits` (array)
          for (int i = 0; i < jsonArrayrLimits.size(); i++) {
            POSIXRlimit.validateJsonElement(jsonArrayrLimits.get(i));
          };
        }
      }
      // validate the optional field `resource_limits`
      if (jsonObj.get("resource_limits") != null && !jsonObj.get("resource_limits").isJsonNull()) {
        LinuxResources.validateJsonElement(jsonObj.get("resource_limits"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerResourceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerResourceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerResourceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerResourceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerResourceConfig>() {
           @Override
           public void write(JsonWriter out, ContainerResourceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerResourceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerResourceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerResourceConfig
   * @throws IOException if the JSON string is invalid with respect to ContainerResourceConfig
   */
  public static ContainerResourceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerResourceConfig.class);
  }

  /**
   * Convert an instance of ContainerResourceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

