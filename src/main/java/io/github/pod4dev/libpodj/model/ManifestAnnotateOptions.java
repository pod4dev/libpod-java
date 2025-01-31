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
import java.util.HashMap;
import java.util.List;
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
 * ManifestAnnotateOptions provides model for annotating manifest list
 */
@ApiModel(description = "ManifestAnnotateOptions provides model for annotating manifest list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ManifestAnnotateOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private List<String> annotation = null;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_ARCH = "arch";
  @SerializedName(SERIALIZED_NAME_ARCH)
  private String arch;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_INDEX_ANNOTATION = "index_annotation";
  @SerializedName(SERIALIZED_NAME_INDEX_ANNOTATION)
  private List<String> indexAnnotation = null;

  public static final String SERIALIZED_NAME_INDEX_ANNOTATIONS = "index_annotations";
  @SerializedName(SERIALIZED_NAME_INDEX_ANNOTATIONS)
  private Map<String, String> indexAnnotations = null;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OS_FEATURES = "os_features";
  @SerializedName(SERIALIZED_NAME_OS_FEATURES)
  private List<String> osFeatures = null;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public ManifestAnnotateOptions() {
  }

  public ManifestAnnotateOptions annotation(List<String> annotation) {
    
    this.annotation = annotation;
    return this;
  }

  public ManifestAnnotateOptions addAnnotationItem(String annotationItem) {
    if (this.annotation == null) {
      this.annotation = new ArrayList<>();
    }
    this.annotation.add(annotationItem);
    return this;
  }

   /**
   * Annotation to add to the item in the manifest list
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotation to add to the item in the manifest list")

  public List<String> getAnnotation() {
    return annotation;
  }


  public void setAnnotation(List<String> annotation) {
    this.annotation = annotation;
  }


  public ManifestAnnotateOptions annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public ManifestAnnotateOptions putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations to add to the item in the manifest list by a map which is preferred over Annotation
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to add to the item in the manifest list by a map which is preferred over Annotation")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public ManifestAnnotateOptions arch(String arch) {
    
    this.arch = arch;
    return this;
  }

   /**
   * Arch overrides the architecture for the item in the manifest list
   * @return arch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arch overrides the architecture for the item in the manifest list")

  public String getArch() {
    return arch;
  }


  public void setArch(String arch) {
    this.arch = arch;
  }


  public ManifestAnnotateOptions features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public ManifestAnnotateOptions addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Feature list for the item in the manifest list
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Feature list for the item in the manifest list")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public ManifestAnnotateOptions indexAnnotation(List<String> indexAnnotation) {
    
    this.indexAnnotation = indexAnnotation;
    return this;
  }

  public ManifestAnnotateOptions addIndexAnnotationItem(String indexAnnotationItem) {
    if (this.indexAnnotation == null) {
      this.indexAnnotation = new ArrayList<>();
    }
    this.indexAnnotation.add(indexAnnotationItem);
    return this;
  }

   /**
   * IndexAnnotation is a slice of key&#x3D;value annotations to add to the manifest list itself
   * @return indexAnnotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IndexAnnotation is a slice of key=value annotations to add to the manifest list itself")

  public List<String> getIndexAnnotation() {
    return indexAnnotation;
  }


  public void setIndexAnnotation(List<String> indexAnnotation) {
    this.indexAnnotation = indexAnnotation;
  }


  public ManifestAnnotateOptions indexAnnotations(Map<String, String> indexAnnotations) {
    
    this.indexAnnotations = indexAnnotations;
    return this;
  }

  public ManifestAnnotateOptions putIndexAnnotationsItem(String key, String indexAnnotationsItem) {
    if (this.indexAnnotations == null) {
      this.indexAnnotations = new HashMap<>();
    }
    this.indexAnnotations.put(key, indexAnnotationsItem);
    return this;
  }

   /**
   * IndexAnnotations is a map of key:value annotations to add to the manifest list itself, by a map which is preferred over IndexAnnotation
   * @return indexAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IndexAnnotations is a map of key:value annotations to add to the manifest list itself, by a map which is preferred over IndexAnnotation")

  public Map<String, String> getIndexAnnotations() {
    return indexAnnotations;
  }


  public void setIndexAnnotations(Map<String, String> indexAnnotations) {
    this.indexAnnotations = indexAnnotations;
  }


  public ManifestAnnotateOptions os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * OS overrides the operating system for the item in the manifest list
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OS overrides the operating system for the item in the manifest list")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public ManifestAnnotateOptions osFeatures(List<String> osFeatures) {
    
    this.osFeatures = osFeatures;
    return this;
  }

  public ManifestAnnotateOptions addOsFeaturesItem(String osFeaturesItem) {
    if (this.osFeatures == null) {
      this.osFeatures = new ArrayList<>();
    }
    this.osFeatures.add(osFeaturesItem);
    return this;
  }

   /**
   * OS features for the item in the manifest list
   * @return osFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OS features for the item in the manifest list")

  public List<String> getOsFeatures() {
    return osFeatures;
  }


  public void setOsFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
  }


  public ManifestAnnotateOptions osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * OSVersion overrides the operating system for the item in the manifest list
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OSVersion overrides the operating system for the item in the manifest list")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public ManifestAnnotateOptions subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * IndexSubject is a subject value to set in the manifest list itself
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IndexSubject is a subject value to set in the manifest list itself")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ManifestAnnotateOptions variant(String variant) {
    
    this.variant = variant;
    return this;
  }

   /**
   * Variant for the item in the manifest list
   * @return variant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variant for the item in the manifest list")

  public String getVariant() {
    return variant;
  }


  public void setVariant(String variant) {
    this.variant = variant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestAnnotateOptions manifestAnnotateOptions = (ManifestAnnotateOptions) o;
    return Objects.equals(this.annotation, manifestAnnotateOptions.annotation) &&
        Objects.equals(this.annotations, manifestAnnotateOptions.annotations) &&
        Objects.equals(this.arch, manifestAnnotateOptions.arch) &&
        Objects.equals(this.features, manifestAnnotateOptions.features) &&
        Objects.equals(this.indexAnnotation, manifestAnnotateOptions.indexAnnotation) &&
        Objects.equals(this.indexAnnotations, manifestAnnotateOptions.indexAnnotations) &&
        Objects.equals(this.os, manifestAnnotateOptions.os) &&
        Objects.equals(this.osFeatures, manifestAnnotateOptions.osFeatures) &&
        Objects.equals(this.osVersion, manifestAnnotateOptions.osVersion) &&
        Objects.equals(this.subject, manifestAnnotateOptions.subject) &&
        Objects.equals(this.variant, manifestAnnotateOptions.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, annotations, arch, features, indexAnnotation, indexAnnotations, os, osFeatures, osVersion, subject, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestAnnotateOptions {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    indexAnnotation: ").append(toIndentedString(indexAnnotation)).append("\n");
    sb.append("    indexAnnotations: ").append(toIndentedString(indexAnnotations)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
    openapiFields.add("annotation");
    openapiFields.add("annotations");
    openapiFields.add("arch");
    openapiFields.add("features");
    openapiFields.add("index_annotation");
    openapiFields.add("index_annotations");
    openapiFields.add("os");
    openapiFields.add("os_features");
    openapiFields.add("os_version");
    openapiFields.add("subject");
    openapiFields.add("variant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManifestAnnotateOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ManifestAnnotateOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManifestAnnotateOptions is not found in the empty JSON string", ManifestAnnotateOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ManifestAnnotateOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManifestAnnotateOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("annotation") != null && !jsonObj.get("annotation").isJsonNull()) && !jsonObj.get("annotation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotation` to be an array in the JSON string but got `%s`", jsonObj.get("annotation").toString()));
      }
      if ((jsonObj.get("arch") != null && !jsonObj.get("arch").isJsonNull()) && !jsonObj.get("arch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arch").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) && !jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("index_annotation") != null && !jsonObj.get("index_annotation").isJsonNull()) && !jsonObj.get("index_annotation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `index_annotation` to be an array in the JSON string but got `%s`", jsonObj.get("index_annotation").toString()));
      }
      if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("os_features") != null && !jsonObj.get("os_features").isJsonNull()) && !jsonObj.get("os_features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_features` to be an array in the JSON string but got `%s`", jsonObj.get("os_features").toString()));
      }
      if ((jsonObj.get("os_version") != null && !jsonObj.get("os_version").isJsonNull()) && !jsonObj.get("os_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManifestAnnotateOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManifestAnnotateOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManifestAnnotateOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManifestAnnotateOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ManifestAnnotateOptions>() {
           @Override
           public void write(JsonWriter out, ManifestAnnotateOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManifestAnnotateOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManifestAnnotateOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManifestAnnotateOptions
  * @throws IOException if the JSON string is invalid with respect to ManifestAnnotateOptions
  */
  public static ManifestAnnotateOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManifestAnnotateOptions.class);
  }

 /**
  * Convert an instance of ManifestAnnotateOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

