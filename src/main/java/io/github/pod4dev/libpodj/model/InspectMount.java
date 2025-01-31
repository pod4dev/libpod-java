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
import java.util.ArrayList;
import java.util.List;
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
 * InspectMount provides a record of a single mount in a container. It contains fields for both named and normal volumes. Only user-specified volumes will be included, and tmpfs volumes are not included even if the user specified them.
 */
@ApiModel(description = "InspectMount provides a record of a single mount in a container. It contains fields for both named and normal volumes. Only user-specified volumes will be included, and tmpfs volumes are not included even if the user specified them.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InspectMount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESTINATION = "Destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_MODE = "Mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = null;

  public static final String SERIALIZED_NAME_PROPAGATION = "Propagation";
  @SerializedName(SERIALIZED_NAME_PROPAGATION)
  private String propagation;

  public static final String SERIALIZED_NAME_R_W = "RW";
  @SerializedName(SERIALIZED_NAME_R_W)
  private Boolean RW;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SUB_PATH = "SubPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public InspectMount() {
  }

  public InspectMount destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * The destination directory for the volume. Specified as a path within the container, as it would be passed into the OCI runtime.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The destination directory for the volume. Specified as a path within the container, as it would be passed into the OCI runtime.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public InspectMount driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * The driver used for the named volume. Empty for bind mounts.
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The driver used for the named volume. Empty for bind mounts.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public InspectMount mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Contains SELinux :z/:Z mount options. Unclear what, if anything, else goes in here.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains SELinux :z/:Z mount options. Unclear what, if anything, else goes in here.")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public InspectMount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the volume. Empty for bind mounts.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the volume. Empty for bind mounts.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InspectMount options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public InspectMount addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * All remaining mount options. Additional data, not present in the original output.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All remaining mount options. Additional data, not present in the original output.")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public InspectMount propagation(String propagation) {
    
    this.propagation = propagation;
    return this;
  }

   /**
   * Mount propagation for the mount. Can be empty if not specified, but is always printed - no omitempty.
   * @return propagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mount propagation for the mount. Can be empty if not specified, but is always printed - no omitempty.")

  public String getPropagation() {
    return propagation;
  }


  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }


  public InspectMount RW(Boolean RW) {
    
    this.RW = RW;
    return this;
  }

   /**
   * Whether the volume is read-write
   * @return RW
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the volume is read-write")

  public Boolean getRW() {
    return RW;
  }


  public void setRW(Boolean RW) {
    this.RW = RW;
  }


  public InspectMount source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source directory for the volume.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source directory for the volume.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public InspectMount subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * SubPath object from the volume. Specified as a path within the source volume to be mounted at the Destination.
   * @return subPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubPath object from the volume. Specified as a path within the source volume to be mounted at the Destination.")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public InspectMount type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Whether the mount is a volume or bind mount. Allowed values are \&quot;volume\&quot; and \&quot;bind\&quot;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the mount is a volume or bind mount. Allowed values are \"volume\" and \"bind\".")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectMount inspectMount = (InspectMount) o;
    return Objects.equals(this.destination, inspectMount.destination) &&
        Objects.equals(this.driver, inspectMount.driver) &&
        Objects.equals(this.mode, inspectMount.mode) &&
        Objects.equals(this.name, inspectMount.name) &&
        Objects.equals(this.options, inspectMount.options) &&
        Objects.equals(this.propagation, inspectMount.propagation) &&
        Objects.equals(this.RW, inspectMount.RW) &&
        Objects.equals(this.source, inspectMount.source) &&
        Objects.equals(this.subPath, inspectMount.subPath) &&
        Objects.equals(this.type, inspectMount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, driver, mode, name, options, propagation, RW, source, subPath, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectMount {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    RW: ").append(toIndentedString(RW)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("Destination");
    openapiFields.add("Driver");
    openapiFields.add("Mode");
    openapiFields.add("Name");
    openapiFields.add("Options");
    openapiFields.add("Propagation");
    openapiFields.add("RW");
    openapiFields.add("Source");
    openapiFields.add("SubPath");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InspectMount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InspectMount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectMount is not found in the empty JSON string", InspectMount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InspectMount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectMount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Destination") != null && !jsonObj.get("Destination").isJsonNull()) && !jsonObj.get("Destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Destination").toString()));
      }
      if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      if ((jsonObj.get("Mode") != null && !jsonObj.get("Mode").isJsonNull()) && !jsonObj.get("Mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mode").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull()) && !jsonObj.get("Options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Options` to be an array in the JSON string but got `%s`", jsonObj.get("Options").toString()));
      }
      if ((jsonObj.get("Propagation") != null && !jsonObj.get("Propagation").isJsonNull()) && !jsonObj.get("Propagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Propagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Propagation").toString()));
      }
      if ((jsonObj.get("Source") != null && !jsonObj.get("Source").isJsonNull()) && !jsonObj.get("Source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Source").toString()));
      }
      if ((jsonObj.get("SubPath") != null && !jsonObj.get("SubPath").isJsonNull()) && !jsonObj.get("SubPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubPath").toString()));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectMount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectMount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectMount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectMount.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectMount>() {
           @Override
           public void write(JsonWriter out, InspectMount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectMount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InspectMount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InspectMount
  * @throws IOException if the JSON string is invalid with respect to InspectMount
  */
  public static InspectMount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectMount.class);
  }

 /**
  * Convert an instance of InspectMount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

