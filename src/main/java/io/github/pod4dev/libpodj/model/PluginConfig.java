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
import io.github.pod4dev.libpodj.model.PluginConfigArgs;
import io.github.pod4dev.libpodj.model.PluginConfigInterface;
import io.github.pod4dev.libpodj.model.PluginConfigLinux;
import io.github.pod4dev.libpodj.model.PluginConfigNetwork;
import io.github.pod4dev.libpodj.model.PluginConfigRootfs;
import io.github.pod4dev.libpodj.model.PluginConfigUser;
import io.github.pod4dev.libpodj.model.PluginEnv;
import io.github.pod4dev.libpodj.model.PluginMount;
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
 * PluginConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PluginConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private PluginConfigArgs args;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCUMENTATION = "Documentation";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION)
  private String documentation;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "Entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private List<String> entrypoint = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<@Valid PluginEnv> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERFACE = "Interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private PluginConfigInterface _interface;

  public static final String SERIALIZED_NAME_IPC_HOST = "IpcHost";
  @SerializedName(SERIALIZED_NAME_IPC_HOST)
  private Boolean ipcHost;

  public static final String SERIALIZED_NAME_LINUX = "Linux";
  @SerializedName(SERIALIZED_NAME_LINUX)
  private PluginConfigLinux linux;

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<@Valid PluginMount> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "Network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private PluginConfigNetwork network;

  public static final String SERIALIZED_NAME_PID_HOST = "PidHost";
  @SerializedName(SERIALIZED_NAME_PID_HOST)
  private Boolean pidHost;

  public static final String SERIALIZED_NAME_PROPAGATED_MOUNT = "PropagatedMount";
  @SerializedName(SERIALIZED_NAME_PROPAGATED_MOUNT)
  private String propagatedMount;

  public static final String SERIALIZED_NAME_WORK_DIR = "WorkDir";
  @SerializedName(SERIALIZED_NAME_WORK_DIR)
  private String workDir;

  public static final String SERIALIZED_NAME_DOCKER_VERSION = "DockerVersion";
  @SerializedName(SERIALIZED_NAME_DOCKER_VERSION)
  private String dockerVersion;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private PluginConfigUser user;

  public static final String SERIALIZED_NAME_ROOTFS = "rootfs";
  @SerializedName(SERIALIZED_NAME_ROOTFS)
  private PluginConfigRootfs rootfs;

  public PluginConfig() {
  }

  public PluginConfig args(PluginConfigArgs args) {
    this.args = args;
    return this;
  }

  /**
   * Get args
   * @return args
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public PluginConfigArgs getArgs() {
    return args;
  }

  public void setArgs(PluginConfigArgs args) {
    this.args = args;
  }


  public PluginConfig description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PluginConfig documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * documentation
   * @return documentation
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }


  public PluginConfig entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public PluginConfig addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * entrypoint
   * @return entrypoint
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }


  public PluginConfig env(List<@Valid PluginEnv> env) {
    this.env = env;
    return this;
  }

  public PluginConfig addEnvItem(PluginEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * env
   * @return env
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public List<@Valid PluginEnv> getEnv() {
    return env;
  }

  public void setEnv(List<@Valid PluginEnv> env) {
    this.env = env;
  }


  public PluginConfig _interface(PluginConfigInterface _interface) {
    this._interface = _interface;
    return this;
  }

  /**
   * Get _interface
   * @return _interface
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public PluginConfigInterface getInterface() {
    return _interface;
  }

  public void setInterface(PluginConfigInterface _interface) {
    this._interface = _interface;
  }


  public PluginConfig ipcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
    return this;
  }

  /**
   * ipc host
   * @return ipcHost
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Boolean getIpcHost() {
    return ipcHost;
  }

  public void setIpcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
  }


  public PluginConfig linux(PluginConfigLinux linux) {
    this.linux = linux;
    return this;
  }

  /**
   * Get linux
   * @return linux
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public PluginConfigLinux getLinux() {
    return linux;
  }

  public void setLinux(PluginConfigLinux linux) {
    this.linux = linux;
  }


  public PluginConfig mounts(List<@Valid PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginConfig addMountsItem(PluginMount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * mounts
   * @return mounts
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public List<@Valid PluginMount> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid PluginMount> mounts) {
    this.mounts = mounts;
  }


  public PluginConfig network(PluginConfigNetwork network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public PluginConfigNetwork getNetwork() {
    return network;
  }

  public void setNetwork(PluginConfigNetwork network) {
    this.network = network;
  }


  public PluginConfig pidHost(Boolean pidHost) {
    this.pidHost = pidHost;
    return this;
  }

  /**
   * pid host
   * @return pidHost
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Boolean getPidHost() {
    return pidHost;
  }

  public void setPidHost(Boolean pidHost) {
    this.pidHost = pidHost;
  }


  public PluginConfig propagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
    return this;
  }

  /**
   * propagated mount
   * @return propagatedMount
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getPropagatedMount() {
    return propagatedMount;
  }

  public void setPropagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
  }


  public PluginConfig workDir(String workDir) {
    this.workDir = workDir;
    return this;
  }

  /**
   * work dir
   * @return workDir
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getWorkDir() {
    return workDir;
  }

  public void setWorkDir(String workDir) {
    this.workDir = workDir;
  }


  public PluginConfig dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * Docker Version used to create the plugin
   * @return dockerVersion
   */
  @jakarta.annotation.Nullable

  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }


  public PluginConfig user(PluginConfigUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @jakarta.annotation.Nullable
  @Valid

  public PluginConfigUser getUser() {
    return user;
  }

  public void setUser(PluginConfigUser user) {
    this.user = user;
  }


  public PluginConfig rootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
    return this;
  }

  /**
   * Get rootfs
   * @return rootfs
   */
  @jakarta.annotation.Nullable
  @Valid

  public PluginConfigRootfs getRootfs() {
    return rootfs;
  }

  public void setRootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfig pluginConfig = (PluginConfig) o;
    return Objects.equals(this.args, pluginConfig.args) &&
        Objects.equals(this.description, pluginConfig.description) &&
        Objects.equals(this.documentation, pluginConfig.documentation) &&
        Objects.equals(this.entrypoint, pluginConfig.entrypoint) &&
        Objects.equals(this.env, pluginConfig.env) &&
        Objects.equals(this._interface, pluginConfig._interface) &&
        Objects.equals(this.ipcHost, pluginConfig.ipcHost) &&
        Objects.equals(this.linux, pluginConfig.linux) &&
        Objects.equals(this.mounts, pluginConfig.mounts) &&
        Objects.equals(this.network, pluginConfig.network) &&
        Objects.equals(this.pidHost, pluginConfig.pidHost) &&
        Objects.equals(this.propagatedMount, pluginConfig.propagatedMount) &&
        Objects.equals(this.workDir, pluginConfig.workDir) &&
        Objects.equals(this.dockerVersion, pluginConfig.dockerVersion) &&
        Objects.equals(this.user, pluginConfig.user) &&
        Objects.equals(this.rootfs, pluginConfig.rootfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, description, documentation, entrypoint, env, _interface, ipcHost, linux, mounts, network, pidHost, propagatedMount, workDir, dockerVersion, user, rootfs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfig {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    ipcHost: ").append(toIndentedString(ipcHost)).append("\n");
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pidHost: ").append(toIndentedString(pidHost)).append("\n");
    sb.append("    propagatedMount: ").append(toIndentedString(propagatedMount)).append("\n");
    sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
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
    openapiFields.add("Args");
    openapiFields.add("Description");
    openapiFields.add("Documentation");
    openapiFields.add("Entrypoint");
    openapiFields.add("Env");
    openapiFields.add("Interface");
    openapiFields.add("IpcHost");
    openapiFields.add("Linux");
    openapiFields.add("Mounts");
    openapiFields.add("Network");
    openapiFields.add("PidHost");
    openapiFields.add("PropagatedMount");
    openapiFields.add("WorkDir");
    openapiFields.add("DockerVersion");
    openapiFields.add("User");
    openapiFields.add("rootfs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Args");
    openapiRequiredFields.add("Description");
    openapiRequiredFields.add("Documentation");
    openapiRequiredFields.add("Entrypoint");
    openapiRequiredFields.add("Env");
    openapiRequiredFields.add("Interface");
    openapiRequiredFields.add("IpcHost");
    openapiRequiredFields.add("Linux");
    openapiRequiredFields.add("Mounts");
    openapiRequiredFields.add("Network");
    openapiRequiredFields.add("PidHost");
    openapiRequiredFields.add("PropagatedMount");
    openapiRequiredFields.add("WorkDir");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PluginConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PluginConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginConfig is not found in the empty JSON string", PluginConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PluginConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PluginConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Args`
      PluginConfigArgs.validateJsonElement(jsonObj.get("Args"));
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (!jsonObj.get("Documentation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Documentation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Documentation").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("Entrypoint") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Entrypoint").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Entrypoint` to be an array in the JSON string but got `%s`", jsonObj.get("Entrypoint").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Env` to be an array in the JSON string but got `%s`", jsonObj.get("Env").toString()));
      }

      JsonArray jsonArrayenv = jsonObj.getAsJsonArray("Env");
      // validate the required field `Env` (array)
      for (int i = 0; i < jsonArrayenv.size(); i++) {
        PluginEnv.validateJsonElement(jsonArrayenv.get(i));
      };
      // validate the required field `Interface`
      PluginConfigInterface.validateJsonElement(jsonObj.get("Interface"));
      // validate the required field `Linux`
      PluginConfigLinux.validateJsonElement(jsonObj.get("Linux"));
      // ensure the json data is an array
      if (!jsonObj.get("Mounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mounts` to be an array in the JSON string but got `%s`", jsonObj.get("Mounts").toString()));
      }

      JsonArray jsonArraymounts = jsonObj.getAsJsonArray("Mounts");
      // validate the required field `Mounts` (array)
      for (int i = 0; i < jsonArraymounts.size(); i++) {
        PluginMount.validateJsonElement(jsonArraymounts.get(i));
      };
      // validate the required field `Network`
      PluginConfigNetwork.validateJsonElement(jsonObj.get("Network"));
      if (!jsonObj.get("PropagatedMount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PropagatedMount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PropagatedMount").toString()));
      }
      if (!jsonObj.get("WorkDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkDir").toString()));
      }
      if ((jsonObj.get("DockerVersion") != null && !jsonObj.get("DockerVersion").isJsonNull()) && !jsonObj.get("DockerVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DockerVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DockerVersion").toString()));
      }
      // validate the optional field `User`
      if (jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) {
        PluginConfigUser.validateJsonElement(jsonObj.get("User"));
      }
      // validate the optional field `rootfs`
      if (jsonObj.get("rootfs") != null && !jsonObj.get("rootfs").isJsonNull()) {
        PluginConfigRootfs.validateJsonElement(jsonObj.get("rootfs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginConfig>() {
           @Override
           public void write(JsonWriter out, PluginConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PluginConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PluginConfig
   * @throws IOException if the JSON string is invalid with respect to PluginConfig
   */
  public static PluginConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginConfig.class);
  }

  /**
   * Convert an instance of PluginConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

