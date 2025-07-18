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
import io.github.pod4dev.libpodj.model.Config;
import io.github.pod4dev.libpodj.model.Descriptor;
import io.github.pod4dev.libpodj.model.DriverData;
import io.github.pod4dev.libpodj.model.HostConfig;
import io.github.pod4dev.libpodj.model.MountPoint;
import io.github.pod4dev.libpodj.model.NetworkSettings;
import io.github.pod4dev.libpodj.model.State;
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
 * endpoint.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class InspectResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_ARMOR_PROFILE = "AppArmorProfile";
  @SerializedName(SERIALIZED_NAME_APP_ARMOR_PROFILE)
  private String appArmorProfile;

  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Config config;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_EXEC_I_DS = "ExecIDs";
  @SerializedName(SERIALIZED_NAME_EXEC_I_DS)
  private List<String> execIDs = new ArrayList<>();

  public static final String SERIALIZED_NAME_GRAPH_DRIVER = "GraphDriver";
  @SerializedName(SERIALIZED_NAME_GRAPH_DRIVER)
  private DriverData graphDriver;

  public static final String SERIALIZED_NAME_HOST_CONFIG = "HostConfig";
  @SerializedName(SERIALIZED_NAME_HOST_CONFIG)
  private HostConfig hostConfig;

  public static final String SERIALIZED_NAME_HOSTNAME_PATH = "HostnamePath";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_PATH)
  private String hostnamePath;

  public static final String SERIALIZED_NAME_HOSTS_PATH = "HostsPath";
  @SerializedName(SERIALIZED_NAME_HOSTS_PATH)
  private String hostsPath;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_MANIFEST_DESCRIPTOR = "ImageManifestDescriptor";
  @SerializedName(SERIALIZED_NAME_IMAGE_MANIFEST_DESCRIPTOR)
  private Descriptor imageManifestDescriptor;

  public static final String SERIALIZED_NAME_LOG_PATH = "LogPath";
  @SerializedName(SERIALIZED_NAME_LOG_PATH)
  private String logPath;

  public static final String SERIALIZED_NAME_MOUNT_LABEL = "MountLabel";
  @SerializedName(SERIALIZED_NAME_MOUNT_LABEL)
  private String mountLabel;

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<@Valid MountPoint> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_SETTINGS = "NetworkSettings";
  @SerializedName(SERIALIZED_NAME_NETWORK_SETTINGS)
  private NetworkSettings networkSettings;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PLATFORM = "Platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_PROCESS_LABEL = "ProcessLabel";
  @SerializedName(SERIALIZED_NAME_PROCESS_LABEL)
  private String processLabel;

  public static final String SERIALIZED_NAME_RESOLV_CONF_PATH = "ResolvConfPath";
  @SerializedName(SERIALIZED_NAME_RESOLV_CONF_PATH)
  private String resolvConfPath;

  public static final String SERIALIZED_NAME_RESTART_COUNT = "RestartCount";
  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Long restartCount;

  public static final String SERIALIZED_NAME_SIZE_ROOT_FS = "SizeRootFs";
  @SerializedName(SERIALIZED_NAME_SIZE_ROOT_FS)
  private Long sizeRootFs;

  public static final String SERIALIZED_NAME_SIZE_RW = "SizeRw";
  @SerializedName(SERIALIZED_NAME_SIZE_RW)
  private Long sizeRw;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private State state;

  public InspectResponse() {
  }

  public InspectResponse appArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
    return this;
  }

  /**
   * Get appArmorProfile
   * @return appArmorProfile
   */
  @jakarta.annotation.Nullable

  public String getAppArmorProfile() {
    return appArmorProfile;
  }

  public void setAppArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
  }


  public InspectResponse args(List<String> args) {
    this.args = args;
    return this;
  }

  public InspectResponse addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
   */
  @jakarta.annotation.Nullable

  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }


  public InspectResponse config(Config config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @jakarta.annotation.Nullable
  @Valid

  public Config getConfig() {
    return config;
  }

  public void setConfig(Config config) {
    this.config = config;
  }


  public InspectResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }


  public InspectResponse driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @jakarta.annotation.Nullable

  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public InspectResponse execIDs(List<String> execIDs) {
    this.execIDs = execIDs;
    return this;
  }

  public InspectResponse addExecIDsItem(String execIDsItem) {
    if (this.execIDs == null) {
      this.execIDs = new ArrayList<>();
    }
    this.execIDs.add(execIDsItem);
    return this;
  }

  /**
   * Get execIDs
   * @return execIDs
   */
  @jakarta.annotation.Nullable

  public List<String> getExecIDs() {
    return execIDs;
  }

  public void setExecIDs(List<String> execIDs) {
    this.execIDs = execIDs;
  }


  public InspectResponse graphDriver(DriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
   */
  @jakarta.annotation.Nullable
  @Valid

  public DriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(DriverData graphDriver) {
    this.graphDriver = graphDriver;
  }


  public InspectResponse hostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
    return this;
  }

  /**
   * Get hostConfig
   * @return hostConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public HostConfig getHostConfig() {
    return hostConfig;
  }

  public void setHostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
  }


  public InspectResponse hostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
    return this;
  }

  /**
   * Get hostnamePath
   * @return hostnamePath
   */
  @jakarta.annotation.Nullable

  public String getHostnamePath() {
    return hostnamePath;
  }

  public void setHostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
  }


  public InspectResponse hostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
    return this;
  }

  /**
   * Get hostsPath
   * @return hostsPath
   */
  @jakarta.annotation.Nullable

  public String getHostsPath() {
    return hostsPath;
  }

  public void setHostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
  }


  public InspectResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public InspectResponse image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @jakarta.annotation.Nullable

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public InspectResponse imageManifestDescriptor(Descriptor imageManifestDescriptor) {
    this.imageManifestDescriptor = imageManifestDescriptor;
    return this;
  }

  /**
   * Get imageManifestDescriptor
   * @return imageManifestDescriptor
   */
  @jakarta.annotation.Nullable
  @Valid

  public Descriptor getImageManifestDescriptor() {
    return imageManifestDescriptor;
  }

  public void setImageManifestDescriptor(Descriptor imageManifestDescriptor) {
    this.imageManifestDescriptor = imageManifestDescriptor;
  }


  public InspectResponse logPath(String logPath) {
    this.logPath = logPath;
    return this;
  }

  /**
   * Get logPath
   * @return logPath
   */
  @jakarta.annotation.Nullable

  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }


  public InspectResponse mountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
    return this;
  }

  /**
   * Get mountLabel
   * @return mountLabel
   */
  @jakarta.annotation.Nullable

  public String getMountLabel() {
    return mountLabel;
  }

  public void setMountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
  }


  public InspectResponse mounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
    return this;
  }

  public InspectResponse addMountsItem(MountPoint mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid MountPoint> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
  }


  public InspectResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public InspectResponse networkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }

  /**
   * Get networkSettings
   * @return networkSettings
   */
  @jakarta.annotation.Nullable
  @Valid

  public NetworkSettings getNetworkSettings() {
    return networkSettings;
  }

  public void setNetworkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }


  public InspectResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @jakarta.annotation.Nullable

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public InspectResponse platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @jakarta.annotation.Nullable

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public InspectResponse processLabel(String processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @jakarta.annotation.Nullable

  public String getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(String processLabel) {
    this.processLabel = processLabel;
  }


  public InspectResponse resolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
    return this;
  }

  /**
   * Get resolvConfPath
   * @return resolvConfPath
   */
  @jakarta.annotation.Nullable

  public String getResolvConfPath() {
    return resolvConfPath;
  }

  public void setResolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
  }


  public InspectResponse restartCount(Long restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  /**
   * Get restartCount
   * @return restartCount
   */
  @jakarta.annotation.Nullable

  public Long getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Long restartCount) {
    this.restartCount = restartCount;
  }


  public InspectResponse sizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
    return this;
  }

  /**
   * Get sizeRootFs
   * @return sizeRootFs
   */
  @jakarta.annotation.Nullable

  public Long getSizeRootFs() {
    return sizeRootFs;
  }

  public void setSizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
  }


  public InspectResponse sizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
    return this;
  }

  /**
   * Get sizeRw
   * @return sizeRw
   */
  @jakarta.annotation.Nullable

  public Long getSizeRw() {
    return sizeRw;
  }

  public void setSizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
  }


  public InspectResponse state(State state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @jakarta.annotation.Nullable
  @Valid

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectResponse inspectResponse = (InspectResponse) o;
    return Objects.equals(this.appArmorProfile, inspectResponse.appArmorProfile) &&
        Objects.equals(this.args, inspectResponse.args) &&
        Objects.equals(this.config, inspectResponse.config) &&
        Objects.equals(this.created, inspectResponse.created) &&
        Objects.equals(this.driver, inspectResponse.driver) &&
        Objects.equals(this.execIDs, inspectResponse.execIDs) &&
        Objects.equals(this.graphDriver, inspectResponse.graphDriver) &&
        Objects.equals(this.hostConfig, inspectResponse.hostConfig) &&
        Objects.equals(this.hostnamePath, inspectResponse.hostnamePath) &&
        Objects.equals(this.hostsPath, inspectResponse.hostsPath) &&
        Objects.equals(this.id, inspectResponse.id) &&
        Objects.equals(this.image, inspectResponse.image) &&
        Objects.equals(this.imageManifestDescriptor, inspectResponse.imageManifestDescriptor) &&
        Objects.equals(this.logPath, inspectResponse.logPath) &&
        Objects.equals(this.mountLabel, inspectResponse.mountLabel) &&
        Objects.equals(this.mounts, inspectResponse.mounts) &&
        Objects.equals(this.name, inspectResponse.name) &&
        Objects.equals(this.networkSettings, inspectResponse.networkSettings) &&
        Objects.equals(this.path, inspectResponse.path) &&
        Objects.equals(this.platform, inspectResponse.platform) &&
        Objects.equals(this.processLabel, inspectResponse.processLabel) &&
        Objects.equals(this.resolvConfPath, inspectResponse.resolvConfPath) &&
        Objects.equals(this.restartCount, inspectResponse.restartCount) &&
        Objects.equals(this.sizeRootFs, inspectResponse.sizeRootFs) &&
        Objects.equals(this.sizeRw, inspectResponse.sizeRw) &&
        Objects.equals(this.state, inspectResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appArmorProfile, args, config, created, driver, execIDs, graphDriver, hostConfig, hostnamePath, hostsPath, id, image, imageManifestDescriptor, logPath, mountLabel, mounts, name, networkSettings, path, platform, processLabel, resolvConfPath, restartCount, sizeRootFs, sizeRw, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectResponse {\n");
    sb.append("    appArmorProfile: ").append(toIndentedString(appArmorProfile)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    execIDs: ").append(toIndentedString(execIDs)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    hostnamePath: ").append(toIndentedString(hostnamePath)).append("\n");
    sb.append("    hostsPath: ").append(toIndentedString(hostsPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageManifestDescriptor: ").append(toIndentedString(imageManifestDescriptor)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    mountLabel: ").append(toIndentedString(mountLabel)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    resolvConfPath: ").append(toIndentedString(resolvConfPath)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    sizeRootFs: ").append(toIndentedString(sizeRootFs)).append("\n");
    sb.append("    sizeRw: ").append(toIndentedString(sizeRw)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("AppArmorProfile");
    openapiFields.add("Args");
    openapiFields.add("Config");
    openapiFields.add("Created");
    openapiFields.add("Driver");
    openapiFields.add("ExecIDs");
    openapiFields.add("GraphDriver");
    openapiFields.add("HostConfig");
    openapiFields.add("HostnamePath");
    openapiFields.add("HostsPath");
    openapiFields.add("Id");
    openapiFields.add("Image");
    openapiFields.add("ImageManifestDescriptor");
    openapiFields.add("LogPath");
    openapiFields.add("MountLabel");
    openapiFields.add("Mounts");
    openapiFields.add("Name");
    openapiFields.add("NetworkSettings");
    openapiFields.add("Path");
    openapiFields.add("Platform");
    openapiFields.add("ProcessLabel");
    openapiFields.add("ResolvConfPath");
    openapiFields.add("RestartCount");
    openapiFields.add("SizeRootFs");
    openapiFields.add("SizeRw");
    openapiFields.add("State");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectResponse is not found in the empty JSON string", InspectResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AppArmorProfile") != null && !jsonObj.get("AppArmorProfile").isJsonNull()) && !jsonObj.get("AppArmorProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppArmorProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AppArmorProfile").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Args") != null && !jsonObj.get("Args").isJsonNull() && !jsonObj.get("Args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Args` to be an array in the JSON string but got `%s`", jsonObj.get("Args").toString()));
      }
      // validate the optional field `Config`
      if (jsonObj.get("Config") != null && !jsonObj.get("Config").isJsonNull()) {
        Config.validateJsonElement(jsonObj.get("Config"));
      }
      if ((jsonObj.get("Created") != null && !jsonObj.get("Created").isJsonNull()) && !jsonObj.get("Created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Created").toString()));
      }
      if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ExecIDs") != null && !jsonObj.get("ExecIDs").isJsonNull() && !jsonObj.get("ExecIDs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExecIDs` to be an array in the JSON string but got `%s`", jsonObj.get("ExecIDs").toString()));
      }
      // validate the optional field `GraphDriver`
      if (jsonObj.get("GraphDriver") != null && !jsonObj.get("GraphDriver").isJsonNull()) {
        DriverData.validateJsonElement(jsonObj.get("GraphDriver"));
      }
      // validate the optional field `HostConfig`
      if (jsonObj.get("HostConfig") != null && !jsonObj.get("HostConfig").isJsonNull()) {
        HostConfig.validateJsonElement(jsonObj.get("HostConfig"));
      }
      if ((jsonObj.get("HostnamePath") != null && !jsonObj.get("HostnamePath").isJsonNull()) && !jsonObj.get("HostnamePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostnamePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostnamePath").toString()));
      }
      if ((jsonObj.get("HostsPath") != null && !jsonObj.get("HostsPath").isJsonNull()) && !jsonObj.get("HostsPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostsPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostsPath").toString()));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      // validate the optional field `ImageManifestDescriptor`
      if (jsonObj.get("ImageManifestDescriptor") != null && !jsonObj.get("ImageManifestDescriptor").isJsonNull()) {
        Descriptor.validateJsonElement(jsonObj.get("ImageManifestDescriptor"));
      }
      if ((jsonObj.get("LogPath") != null && !jsonObj.get("LogPath").isJsonNull()) && !jsonObj.get("LogPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LogPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LogPath").toString()));
      }
      if ((jsonObj.get("MountLabel") != null && !jsonObj.get("MountLabel").isJsonNull()) && !jsonObj.get("MountLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MountLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MountLabel").toString()));
      }
      if (jsonObj.get("Mounts") != null && !jsonObj.get("Mounts").isJsonNull()) {
        JsonArray jsonArraymounts = jsonObj.getAsJsonArray("Mounts");
        if (jsonArraymounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Mounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Mounts` to be an array in the JSON string but got `%s`", jsonObj.get("Mounts").toString()));
          }

          // validate the optional field `Mounts` (array)
          for (int i = 0; i < jsonArraymounts.size(); i++) {
            MountPoint.validateJsonElement(jsonArraymounts.get(i));
          };
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `NetworkSettings`
      if (jsonObj.get("NetworkSettings") != null && !jsonObj.get("NetworkSettings").isJsonNull()) {
        NetworkSettings.validateJsonElement(jsonObj.get("NetworkSettings"));
      }
      if ((jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull()) && !jsonObj.get("Path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Path").toString()));
      }
      if ((jsonObj.get("Platform") != null && !jsonObj.get("Platform").isJsonNull()) && !jsonObj.get("Platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Platform").toString()));
      }
      if ((jsonObj.get("ProcessLabel") != null && !jsonObj.get("ProcessLabel").isJsonNull()) && !jsonObj.get("ProcessLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessLabel").toString()));
      }
      if ((jsonObj.get("ResolvConfPath") != null && !jsonObj.get("ResolvConfPath").isJsonNull()) && !jsonObj.get("ResolvConfPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResolvConfPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResolvConfPath").toString()));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        State.validateJsonElement(jsonObj.get("State"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectResponse>() {
           @Override
           public void write(JsonWriter out, InspectResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectResponse
   * @throws IOException if the JSON string is invalid with respect to InspectResponse
   */
  public static InspectResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectResponse.class);
  }

  /**
   * Convert an instance of InspectResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

