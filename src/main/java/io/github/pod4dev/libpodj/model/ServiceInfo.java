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
import io.github.pod4dev.libpodj.model.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ServiceInfo represents service parameters with the list of service&#39;s tasks
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ServiceInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOCAL_L_B_INDEX = "LocalLBIndex";
  @SerializedName(SERIALIZED_NAME_LOCAL_L_B_INDEX)
  private Long localLBIndex;

  public static final String SERIALIZED_NAME_PORTS = "Ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<String> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASKS = "Tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<@Valid Task> tasks = new ArrayList<>();

  public static final String SERIALIZED_NAME_V_I_P = "VIP";
  @SerializedName(SERIALIZED_NAME_V_I_P)
  private String VIP;

  public ServiceInfo() {
  }

  public ServiceInfo localLBIndex(Long localLBIndex) {
    this.localLBIndex = localLBIndex;
    return this;
  }

  /**
   * Get localLBIndex
   * @return localLBIndex
   */
  @jakarta.annotation.Nullable

  public Long getLocalLBIndex() {
    return localLBIndex;
  }

  public void setLocalLBIndex(Long localLBIndex) {
    this.localLBIndex = localLBIndex;
  }


  public ServiceInfo ports(List<String> ports) {
    this.ports = ports;
    return this;
  }

  public ServiceInfo addPortsItem(String portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
   */
  @jakarta.annotation.Nullable

  public List<String> getPorts() {
    return ports;
  }

  public void setPorts(List<String> ports) {
    this.ports = ports;
  }


  public ServiceInfo tasks(List<@Valid Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public ServiceInfo addTasksItem(Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks
   * @return tasks
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<@Valid Task> tasks) {
    this.tasks = tasks;
  }


  public ServiceInfo VIP(String VIP) {
    this.VIP = VIP;
    return this;
  }

  /**
   * Get VIP
   * @return VIP
   */
  @jakarta.annotation.Nullable

  public String getVIP() {
    return VIP;
  }

  public void setVIP(String VIP) {
    this.VIP = VIP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInfo serviceInfo = (ServiceInfo) o;
    return Objects.equals(this.localLBIndex, serviceInfo.localLBIndex) &&
        Objects.equals(this.ports, serviceInfo.ports) &&
        Objects.equals(this.tasks, serviceInfo.tasks) &&
        Objects.equals(this.VIP, serviceInfo.VIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localLBIndex, ports, tasks, VIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfo {\n");
    sb.append("    localLBIndex: ").append(toIndentedString(localLBIndex)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    VIP: ").append(toIndentedString(VIP)).append("\n");
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
    openapiFields.add("LocalLBIndex");
    openapiFields.add("Ports");
    openapiFields.add("Tasks");
    openapiFields.add("VIP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ServiceInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ServiceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceInfo is not found in the empty JSON string", ServiceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ServiceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Ports") != null && !jsonObj.get("Ports").isJsonNull() && !jsonObj.get("Ports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Ports` to be an array in the JSON string but got `%s`", jsonObj.get("Ports").toString()));
      }
      if (jsonObj.get("Tasks") != null && !jsonObj.get("Tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("Tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Tasks` to be an array in the JSON string but got `%s`", jsonObj.get("Tasks").toString()));
          }

          // validate the optional field `Tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            Task.validateJsonElement(jsonArraytasks.get(i));
          };
        }
      }
      if ((jsonObj.get("VIP") != null && !jsonObj.get("VIP").isJsonNull()) && !jsonObj.get("VIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VIP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceInfo>() {
           @Override
           public void write(JsonWriter out, ServiceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ServiceInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ServiceInfo
   * @throws IOException if the JSON string is invalid with respect to ServiceInfo
   */
  public static ServiceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceInfo.class);
  }

  /**
   * Convert an instance of ServiceInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

