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
 * Port An open port on a container
 */
@ApiModel(description = "Port An open port on a container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Port implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRIVATE_PORT = "PrivatePort";
  @SerializedName(SERIALIZED_NAME_PRIVATE_PORT)
  private Integer privatePort;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private String IP;

  public static final String SERIALIZED_NAME_PUBLIC_PORT = "PublicPort";
  @SerializedName(SERIALIZED_NAME_PUBLIC_PORT)
  private Integer publicPort;

  public Port() {
  }

  public Port privatePort(Integer privatePort) {
    
    this.privatePort = privatePort;
    return this;
  }

   /**
   * Port on the container
   * @return privatePort
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "Port on the container")

  public Integer getPrivatePort() {
    return privatePort;
  }


  public void setPrivatePort(Integer privatePort) {
    this.privatePort = privatePort;
  }


  public Port type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Port IP(String IP) {
    
    this.IP = IP;
    return this;
  }

   /**
   * Host IP address that the container&#39;s port is mapped to
   * @return IP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host IP address that the container's port is mapped to")

  public String getIP() {
    return IP;
  }


  public void setIP(String IP) {
    this.IP = IP;
  }


  public Port publicPort(Integer publicPort) {
    
    this.publicPort = publicPort;
    return this;
  }

   /**
   * Port exposed on the host
   * @return publicPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port exposed on the host")

  public Integer getPublicPort() {
    return publicPort;
  }


  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Port port = (Port) o;
    return Objects.equals(this.privatePort, port.privatePort) &&
        Objects.equals(this.type, port.type) &&
        Objects.equals(this.IP, port.IP) &&
        Objects.equals(this.publicPort, port.publicPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privatePort, type, IP, publicPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Port {\n");
    sb.append("    privatePort: ").append(toIndentedString(privatePort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
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
    openapiFields.add("PrivatePort");
    openapiFields.add("Type");
    openapiFields.add("IP");
    openapiFields.add("PublicPort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PrivatePort");
    openapiRequiredFields.add("Type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Port
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Port.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Port is not found in the empty JSON string", Port.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Port.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Port` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Port.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if ((jsonObj.get("IP") != null && !jsonObj.get("IP").isJsonNull()) && !jsonObj.get("IP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Port.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Port' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Port> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Port.class));

       return (TypeAdapter<T>) new TypeAdapter<Port>() {
           @Override
           public void write(JsonWriter out, Port value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Port read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Port given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Port
  * @throws IOException if the JSON string is invalid with respect to Port
  */
  public static Port fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Port.class);
  }

 /**
  * Convert an instance of Port to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

