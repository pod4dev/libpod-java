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
import io.github.pod4dev.libpodj.model.NetAddress;
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
 * NetInterface
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class NetInterface implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_SUBNETS = "subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List<@Valid NetAddress> subnets = new ArrayList<>();

  public NetInterface() {
  }

  public NetInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MacAddress for this Interface.
   * @return macAddress
   */
  @jakarta.annotation.Nullable

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public NetInterface subnets(List<@Valid NetAddress> subnets) {
    this.subnets = subnets;
    return this;
  }

  public NetInterface addSubnetsItem(NetAddress subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

  /**
   * Subnets list of assigned subnets with their gateway.
   * @return subnets
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid NetAddress> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<@Valid NetAddress> subnets) {
    this.subnets = subnets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetInterface netInterface = (NetInterface) o;
    return Objects.equals(this.macAddress, netInterface.macAddress) &&
        Objects.equals(this.subnets, netInterface.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, subnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetInterface {\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
    openapiFields.add("mac_address");
    openapiFields.add("subnets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetInterface
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetInterface.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetInterface is not found in the empty JSON string", NetInterface.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetInterface.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetInterface` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mac_address") != null && !jsonObj.get("mac_address").isJsonNull()) && !jsonObj.get("mac_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac_address").toString()));
      }
      if (jsonObj.get("subnets") != null && !jsonObj.get("subnets").isJsonNull()) {
        JsonArray jsonArraysubnets = jsonObj.getAsJsonArray("subnets");
        if (jsonArraysubnets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subnets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subnets` to be an array in the JSON string but got `%s`", jsonObj.get("subnets").toString()));
          }

          // validate the optional field `subnets` (array)
          for (int i = 0; i < jsonArraysubnets.size(); i++) {
            NetAddress.validateJsonElement(jsonArraysubnets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetInterface.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetInterface' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetInterface> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetInterface.class));

       return (TypeAdapter<T>) new TypeAdapter<NetInterface>() {
           @Override
           public void write(JsonWriter out, NetInterface value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetInterface read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetInterface given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetInterface
   * @throws IOException if the JSON string is invalid with respect to NetInterface
   */
  public static NetInterface fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetInterface.class);
  }

  /**
   * Convert an instance of NetInterface to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

