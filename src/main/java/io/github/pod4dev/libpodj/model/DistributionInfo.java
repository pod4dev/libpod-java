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
 * DistributionInfo describes the host distribution for libpod
 */
@ApiModel(description = "DistributionInfo describes the host distribution for libpod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DistributionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODENAME = "codename";
  @SerializedName(SERIALIZED_NAME_CODENAME)
  private String codename;

  public static final String SERIALIZED_NAME_DISTRIBUTION = "distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private String distribution;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public DistributionInfo() {
  }

  public DistributionInfo codename(String codename) {
    
    this.codename = codename;
    return this;
  }

   /**
   * Get codename
   * @return codename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodename() {
    return codename;
  }


  public void setCodename(String codename) {
    this.codename = codename;
  }


  public DistributionInfo distribution(String distribution) {
    
    this.distribution = distribution;
    return this;
  }

   /**
   * Get distribution
   * @return distribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistribution() {
    return distribution;
  }


  public void setDistribution(String distribution) {
    this.distribution = distribution;
  }


  public DistributionInfo variant(String variant) {
    
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariant() {
    return variant;
  }


  public void setVariant(String variant) {
    this.variant = variant;
  }


  public DistributionInfo version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionInfo distributionInfo = (DistributionInfo) o;
    return Objects.equals(this.codename, distributionInfo.codename) &&
        Objects.equals(this.distribution, distributionInfo.distribution) &&
        Objects.equals(this.variant, distributionInfo.variant) &&
        Objects.equals(this.version, distributionInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codename, distribution, variant, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionInfo {\n");
    sb.append("    codename: ").append(toIndentedString(codename)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("codename");
    openapiFields.add("distribution");
    openapiFields.add("variant");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DistributionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DistributionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DistributionInfo is not found in the empty JSON string", DistributionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DistributionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DistributionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("codename") != null && !jsonObj.get("codename").isJsonNull()) && !jsonObj.get("codename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codename").toString()));
      }
      if ((jsonObj.get("distribution") != null && !jsonObj.get("distribution").isJsonNull()) && !jsonObj.get("distribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distribution").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DistributionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistributionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistributionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistributionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DistributionInfo>() {
           @Override
           public void write(JsonWriter out, DistributionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistributionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DistributionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionInfo
  * @throws IOException if the JSON string is invalid with respect to DistributionInfo
  */
  public static DistributionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionInfo.class);
  }

 /**
  * Convert an instance of DistributionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

