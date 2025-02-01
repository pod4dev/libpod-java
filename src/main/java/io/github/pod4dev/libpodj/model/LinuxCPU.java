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
import java.io.IOException;
import java.util.Arrays;
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
 * LinuxCPU for Linux cgroup &#39;cpu&#39; resource management
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class LinuxCPU implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BURST = "burst";
  @SerializedName(SERIALIZED_NAME_BURST)
  private Integer burst;

  public static final String SERIALIZED_NAME_CPUS = "cpus";
  @SerializedName(SERIALIZED_NAME_CPUS)
  private String cpus;

  public static final String SERIALIZED_NAME_IDLE = "idle";
  @SerializedName(SERIALIZED_NAME_IDLE)
  private Long idle;

  public static final String SERIALIZED_NAME_MEMS = "mems";
  @SerializedName(SERIALIZED_NAME_MEMS)
  private String mems;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_QUOTA = "quota";
  @SerializedName(SERIALIZED_NAME_QUOTA)
  private Long quota;

  public static final String SERIALIZED_NAME_REALTIME_PERIOD = "realtimePeriod";
  @SerializedName(SERIALIZED_NAME_REALTIME_PERIOD)
  private Integer realtimePeriod;

  public static final String SERIALIZED_NAME_REALTIME_RUNTIME = "realtimeRuntime";
  @SerializedName(SERIALIZED_NAME_REALTIME_RUNTIME)
  private Long realtimeRuntime;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  private Integer shares;

  public LinuxCPU() {
  }

  public LinuxCPU burst(Integer burst) {
    this.burst = burst;
    return this;
  }

  /**
   * CPU hardcap burst limit (in usecs). Allowed accumulated cpu time additionally for burst in a given period.
   * @return burst
   */
  @jakarta.annotation.Nullable

  public Integer getBurst() {
    return burst;
  }

  public void setBurst(Integer burst) {
    this.burst = burst;
  }


  public LinuxCPU cpus(String cpus) {
    this.cpus = cpus;
    return this;
  }

  /**
   * CPUs to use within the cpuset. Default is to use any CPU available.
   * @return cpus
   */
  @jakarta.annotation.Nullable

  public String getCpus() {
    return cpus;
  }

  public void setCpus(String cpus) {
    this.cpus = cpus;
  }


  public LinuxCPU idle(Long idle) {
    this.idle = idle;
    return this;
  }

  /**
   * cgroups are configured with minimum weight, 0: default behavior, 1: SCHED_IDLE.
   * @return idle
   */
  @jakarta.annotation.Nullable

  public Long getIdle() {
    return idle;
  }

  public void setIdle(Long idle) {
    this.idle = idle;
  }


  public LinuxCPU mems(String mems) {
    this.mems = mems;
    return this;
  }

  /**
   * List of memory nodes in the cpuset. Default is to use any available memory node.
   * @return mems
   */
  @jakarta.annotation.Nullable

  public String getMems() {
    return mems;
  }

  public void setMems(String mems) {
    this.mems = mems;
  }


  public LinuxCPU period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * CPU period to be used for hardcapping (in usecs).
   * @return period
   */
  @jakarta.annotation.Nullable

  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }


  public LinuxCPU quota(Long quota) {
    this.quota = quota;
    return this;
  }

  /**
   * CPU hardcap limit (in usecs). Allowed cpu time in a given period.
   * @return quota
   */
  @jakarta.annotation.Nullable

  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }


  public LinuxCPU realtimePeriod(Integer realtimePeriod) {
    this.realtimePeriod = realtimePeriod;
    return this;
  }

  /**
   * CPU period to be used for realtime scheduling (in usecs).
   * @return realtimePeriod
   */
  @jakarta.annotation.Nullable

  public Integer getRealtimePeriod() {
    return realtimePeriod;
  }

  public void setRealtimePeriod(Integer realtimePeriod) {
    this.realtimePeriod = realtimePeriod;
  }


  public LinuxCPU realtimeRuntime(Long realtimeRuntime) {
    this.realtimeRuntime = realtimeRuntime;
    return this;
  }

  /**
   * How much time realtime scheduling may use (in usecs).
   * @return realtimeRuntime
   */
  @jakarta.annotation.Nullable

  public Long getRealtimeRuntime() {
    return realtimeRuntime;
  }

  public void setRealtimeRuntime(Long realtimeRuntime) {
    this.realtimeRuntime = realtimeRuntime;
  }


  public LinuxCPU shares(Integer shares) {
    this.shares = shares;
    return this;
  }

  /**
   * CPU shares (relative weight (ratio) vs. other cgroups with cpu shares).
   * @return shares
   */
  @jakarta.annotation.Nullable

  public Integer getShares() {
    return shares;
  }

  public void setShares(Integer shares) {
    this.shares = shares;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxCPU linuxCPU = (LinuxCPU) o;
    return Objects.equals(this.burst, linuxCPU.burst) &&
        Objects.equals(this.cpus, linuxCPU.cpus) &&
        Objects.equals(this.idle, linuxCPU.idle) &&
        Objects.equals(this.mems, linuxCPU.mems) &&
        Objects.equals(this.period, linuxCPU.period) &&
        Objects.equals(this.quota, linuxCPU.quota) &&
        Objects.equals(this.realtimePeriod, linuxCPU.realtimePeriod) &&
        Objects.equals(this.realtimeRuntime, linuxCPU.realtimeRuntime) &&
        Objects.equals(this.shares, linuxCPU.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burst, cpus, idle, mems, period, quota, realtimePeriod, realtimeRuntime, shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxCPU {\n");
    sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
    sb.append("    mems: ").append(toIndentedString(mems)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    realtimePeriod: ").append(toIndentedString(realtimePeriod)).append("\n");
    sb.append("    realtimeRuntime: ").append(toIndentedString(realtimeRuntime)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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
    openapiFields.add("burst");
    openapiFields.add("cpus");
    openapiFields.add("idle");
    openapiFields.add("mems");
    openapiFields.add("period");
    openapiFields.add("quota");
    openapiFields.add("realtimePeriod");
    openapiFields.add("realtimeRuntime");
    openapiFields.add("shares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinuxCPU
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinuxCPU.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxCPU is not found in the empty JSON string", LinuxCPU.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinuxCPU.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxCPU` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cpus") != null && !jsonObj.get("cpus").isJsonNull()) && !jsonObj.get("cpus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpus").toString()));
      }
      if ((jsonObj.get("mems") != null && !jsonObj.get("mems").isJsonNull()) && !jsonObj.get("mems").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mems` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mems").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinuxCPU.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinuxCPU' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinuxCPU> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinuxCPU.class));

       return (TypeAdapter<T>) new TypeAdapter<LinuxCPU>() {
           @Override
           public void write(JsonWriter out, LinuxCPU value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinuxCPU read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinuxCPU given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinuxCPU
   * @throws IOException if the JSON string is invalid with respect to LinuxCPU
   */
  public static LinuxCPU fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinuxCPU.class);
  }

  /**
   * Convert an instance of LinuxCPU to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

