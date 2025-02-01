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
import io.github.pod4dev.libpodj.model.Namespace;
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
 * PodBasicConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PodBasicConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXIT_POLICY = "exit_policy";
  @SerializedName(SERIALIZED_NAME_EXIT_POLICY)
  private String exitPolicy;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_INFRA_COMMAND = "infra_command";
  @SerializedName(SERIALIZED_NAME_INFRA_COMMAND)
  private List<String> infraCommand = new ArrayList<>();

  public static final String SERIALIZED_NAME_INFRA_CONMON_PID_FILE = "infra_conmon_pid_file";
  @SerializedName(SERIALIZED_NAME_INFRA_CONMON_PID_FILE)
  private String infraConmonPidFile;

  public static final String SERIALIZED_NAME_INFRA_IMAGE = "infra_image";
  @SerializedName(SERIALIZED_NAME_INFRA_IMAGE)
  private String infraImage;

  public static final String SERIALIZED_NAME_INFRA_NAME = "infra_name";
  @SerializedName(SERIALIZED_NAME_INFRA_NAME)
  private String infraName;

  public static final String SERIALIZED_NAME_IPCNS = "ipcns";
  @SerializedName(SERIALIZED_NAME_IPCNS)
  private Namespace ipcns;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NO_INFRA = "no_infra";
  @SerializedName(SERIALIZED_NAME_NO_INFRA)
  private Boolean noInfra;

  public static final String SERIALIZED_NAME_PIDNS = "pidns";
  @SerializedName(SERIALIZED_NAME_PIDNS)
  private Namespace pidns;

  public static final String SERIALIZED_NAME_POD_CREATE_COMMAND = "pod_create_command";
  @SerializedName(SERIALIZED_NAME_POD_CREATE_COMMAND)
  private List<String> podCreateCommand = new ArrayList<>();

  public static final String SERIALIZED_NAME_POD_DEVICES = "pod_devices";
  @SerializedName(SERIALIZED_NAME_POD_DEVICES)
  private List<String> podDevices = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restart_policy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;

  public static final String SERIALIZED_NAME_RESTART_TRIES = "restart_tries";
  @SerializedName(SERIALIZED_NAME_RESTART_TRIES)
  private Integer restartTries;

  public static final String SERIALIZED_NAME_SHARE_PARENT = "share_parent";
  @SerializedName(SERIALIZED_NAME_SHARE_PARENT)
  private Boolean shareParent;

  public static final String SERIALIZED_NAME_SHARED_NAMESPACES = "shared_namespaces";
  @SerializedName(SERIALIZED_NAME_SHARED_NAMESPACES)
  private List<String> sharedNamespaces = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYSCTL = "sysctl";
  @SerializedName(SERIALIZED_NAME_SYSCTL)
  private Map<String, String> sysctl = new HashMap<>();

  public static final String SERIALIZED_NAME_USERNS = "userns";
  @SerializedName(SERIALIZED_NAME_USERNS)
  private Namespace userns;

  public static final String SERIALIZED_NAME_UTSNS = "utsns";
  @SerializedName(SERIALIZED_NAME_UTSNS)
  private Namespace utsns;

  public PodBasicConfig() {
  }

  public PodBasicConfig exitPolicy(String exitPolicy) {
    this.exitPolicy = exitPolicy;
    return this;
  }

  /**
   * ExitPolicy determines the pod&#39;s exit and stop behaviour.
   * @return exitPolicy
   */
  @jakarta.annotation.Nullable

  public String getExitPolicy() {
    return exitPolicy;
  }

  public void setExitPolicy(String exitPolicy) {
    this.exitPolicy = exitPolicy;
  }


  public PodBasicConfig hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Hostname is the pod&#39;s hostname. If not set, the name of the pod will be used (if a name was not provided here, the name auto-generated for the pod will be used). This will be used by the infra container and all containers in the pod as long as the UTS namespace is shared. Optional.
   * @return hostname
   */
  @jakarta.annotation.Nullable

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public PodBasicConfig infraCommand(List<String> infraCommand) {
    this.infraCommand = infraCommand;
    return this;
  }

  public PodBasicConfig addInfraCommandItem(String infraCommandItem) {
    if (this.infraCommand == null) {
      this.infraCommand = new ArrayList<>();
    }
    this.infraCommand.add(infraCommandItem);
    return this;
  }

  /**
   * InfraCommand sets the command that will be used to start the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional.
   * @return infraCommand
   */
  @jakarta.annotation.Nullable

  public List<String> getInfraCommand() {
    return infraCommand;
  }

  public void setInfraCommand(List<String> infraCommand) {
    this.infraCommand = infraCommand;
  }


  public PodBasicConfig infraConmonPidFile(String infraConmonPidFile) {
    this.infraConmonPidFile = infraConmonPidFile;
    return this;
  }

  /**
   * InfraConmonPidFile is a custom path to store the infra container&#39;s conmon PID.
   * @return infraConmonPidFile
   */
  @jakarta.annotation.Nullable

  public String getInfraConmonPidFile() {
    return infraConmonPidFile;
  }

  public void setInfraConmonPidFile(String infraConmonPidFile) {
    this.infraConmonPidFile = infraConmonPidFile;
  }


  public PodBasicConfig infraImage(String infraImage) {
    this.infraImage = infraImage;
    return this;
  }

  /**
   * InfraImage is the image that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional.
   * @return infraImage
   */
  @jakarta.annotation.Nullable

  public String getInfraImage() {
    return infraImage;
  }

  public void setInfraImage(String infraImage) {
    this.infraImage = infraImage;
  }


  public PodBasicConfig infraName(String infraName) {
    this.infraName = infraName;
    return this;
  }

  /**
   * InfraName is the name that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional.
   * @return infraName
   */
  @jakarta.annotation.Nullable

  public String getInfraName() {
    return infraName;
  }

  public void setInfraName(String infraName) {
    this.infraName = infraName;
  }


  public PodBasicConfig ipcns(Namespace ipcns) {
    this.ipcns = ipcns;
    return this;
  }

  /**
   * Get ipcns
   * @return ipcns
   */
  @jakarta.annotation.Nullable
  @Valid

  public Namespace getIpcns() {
    return ipcns;
  }

  public void setIpcns(Namespace ipcns) {
    this.ipcns = ipcns;
  }


  public PodBasicConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public PodBasicConfig putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels are key-value pairs that are used to add metadata to pods. Optional.
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public PodBasicConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the pod. If not provided, a name will be generated when the pod is created. Optional.
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PodBasicConfig noInfra(Boolean noInfra) {
    this.noInfra = noInfra;
    return this;
  }

  /**
   * NoInfra tells the pod not to create an infra container. If this is done, many networking-related options will become unavailable. Conflicts with setting any options in PodNetworkConfig, and the InfraCommand and InfraImages in this struct. Optional.
   * @return noInfra
   */
  @jakarta.annotation.Nullable

  public Boolean getNoInfra() {
    return noInfra;
  }

  public void setNoInfra(Boolean noInfra) {
    this.noInfra = noInfra;
  }


  public PodBasicConfig pidns(Namespace pidns) {
    this.pidns = pidns;
    return this;
  }

  /**
   * Get pidns
   * @return pidns
   */
  @jakarta.annotation.Nullable
  @Valid

  public Namespace getPidns() {
    return pidns;
  }

  public void setPidns(Namespace pidns) {
    this.pidns = pidns;
  }


  public PodBasicConfig podCreateCommand(List<String> podCreateCommand) {
    this.podCreateCommand = podCreateCommand;
    return this;
  }

  public PodBasicConfig addPodCreateCommandItem(String podCreateCommandItem) {
    if (this.podCreateCommand == null) {
      this.podCreateCommand = new ArrayList<>();
    }
    this.podCreateCommand.add(podCreateCommandItem);
    return this;
  }

  /**
   * Get podCreateCommand
   * @return podCreateCommand
   */
  @jakarta.annotation.Nullable

  public List<String> getPodCreateCommand() {
    return podCreateCommand;
  }

  public void setPodCreateCommand(List<String> podCreateCommand) {
    this.podCreateCommand = podCreateCommand;
  }


  public PodBasicConfig podDevices(List<String> podDevices) {
    this.podDevices = podDevices;
    return this;
  }

  public PodBasicConfig addPodDevicesItem(String podDevicesItem) {
    if (this.podDevices == null) {
      this.podDevices = new ArrayList<>();
    }
    this.podDevices.add(podDevicesItem);
    return this;
  }

  /**
   * Devices contains user specified Devices to be added to the Pod
   * @return podDevices
   */
  @jakarta.annotation.Nullable

  public List<String> getPodDevices() {
    return podDevices;
  }

  public void setPodDevices(List<String> podDevices) {
    this.podDevices = podDevices;
  }


  public PodBasicConfig restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * RestartPolicy is the pod&#39;s restart policy - an action which will be taken when one or all the containers in the pod exits. If not given, the default policy will be set to Always, which restarts the containers in the pod when they exit indefinitely. Optional.
   * @return restartPolicy
   */
  @jakarta.annotation.Nullable

  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }


  public PodBasicConfig restartTries(Integer restartTries) {
    this.restartTries = restartTries;
    return this;
  }

  /**
   * RestartRetries is the number of attempts that will be made to restart the container. Only available when RestartPolicy is set to \&quot;on-failure\&quot;. Optional.
   * @return restartTries
   */
  @jakarta.annotation.Nullable

  public Integer getRestartTries() {
    return restartTries;
  }

  public void setRestartTries(Integer restartTries) {
    this.restartTries = restartTries;
  }


  public PodBasicConfig shareParent(Boolean shareParent) {
    this.shareParent = shareParent;
    return this;
  }

  /**
   * PodCreateCommand is the command used to create this pod. This will be shown in the output of Inspect() on the pod, and may also be used by some tools that wish to recreate the pod (e.g. &#x60;podman generate systemd --new&#x60;). Optional. ShareParent determines if all containers in the pod will share the pod&#39;s cgroup as the cgroup parent
   * @return shareParent
   */
  @jakarta.annotation.Nullable

  public Boolean getShareParent() {
    return shareParent;
  }

  public void setShareParent(Boolean shareParent) {
    this.shareParent = shareParent;
  }


  public PodBasicConfig sharedNamespaces(List<String> sharedNamespaces) {
    this.sharedNamespaces = sharedNamespaces;
    return this;
  }

  public PodBasicConfig addSharedNamespacesItem(String sharedNamespacesItem) {
    if (this.sharedNamespaces == null) {
      this.sharedNamespaces = new ArrayList<>();
    }
    this.sharedNamespaces.add(sharedNamespacesItem);
    return this;
  }

  /**
   * SharedNamespaces instructs the pod to share a set of namespaces. Shared namespaces will be joined (by default) by every container which joins the pod. If not set and NoInfra is false, the pod will set a default set of namespaces to share. Conflicts with NoInfra&#x3D;true. Optional.
   * @return sharedNamespaces
   */
  @jakarta.annotation.Nullable

  public List<String> getSharedNamespaces() {
    return sharedNamespaces;
  }

  public void setSharedNamespaces(List<String> sharedNamespaces) {
    this.sharedNamespaces = sharedNamespaces;
  }


  public PodBasicConfig sysctl(Map<String, String> sysctl) {
    this.sysctl = sysctl;
    return this;
  }

  public PodBasicConfig putSysctlItem(String key, String sysctlItem) {
    if (this.sysctl == null) {
      this.sysctl = new HashMap<>();
    }
    this.sysctl.put(key, sysctlItem);
    return this;
  }

  /**
   * Sysctl sets kernel parameters for the pod
   * @return sysctl
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getSysctl() {
    return sysctl;
  }

  public void setSysctl(Map<String, String> sysctl) {
    this.sysctl = sysctl;
  }


  public PodBasicConfig userns(Namespace userns) {
    this.userns = userns;
    return this;
  }

  /**
   * Get userns
   * @return userns
   */
  @jakarta.annotation.Nullable
  @Valid

  public Namespace getUserns() {
    return userns;
  }

  public void setUserns(Namespace userns) {
    this.userns = userns;
  }


  public PodBasicConfig utsns(Namespace utsns) {
    this.utsns = utsns;
    return this;
  }

  /**
   * Get utsns
   * @return utsns
   */
  @jakarta.annotation.Nullable
  @Valid

  public Namespace getUtsns() {
    return utsns;
  }

  public void setUtsns(Namespace utsns) {
    this.utsns = utsns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodBasicConfig podBasicConfig = (PodBasicConfig) o;
    return Objects.equals(this.exitPolicy, podBasicConfig.exitPolicy) &&
        Objects.equals(this.hostname, podBasicConfig.hostname) &&
        Objects.equals(this.infraCommand, podBasicConfig.infraCommand) &&
        Objects.equals(this.infraConmonPidFile, podBasicConfig.infraConmonPidFile) &&
        Objects.equals(this.infraImage, podBasicConfig.infraImage) &&
        Objects.equals(this.infraName, podBasicConfig.infraName) &&
        Objects.equals(this.ipcns, podBasicConfig.ipcns) &&
        Objects.equals(this.labels, podBasicConfig.labels) &&
        Objects.equals(this.name, podBasicConfig.name) &&
        Objects.equals(this.noInfra, podBasicConfig.noInfra) &&
        Objects.equals(this.pidns, podBasicConfig.pidns) &&
        Objects.equals(this.podCreateCommand, podBasicConfig.podCreateCommand) &&
        Objects.equals(this.podDevices, podBasicConfig.podDevices) &&
        Objects.equals(this.restartPolicy, podBasicConfig.restartPolicy) &&
        Objects.equals(this.restartTries, podBasicConfig.restartTries) &&
        Objects.equals(this.shareParent, podBasicConfig.shareParent) &&
        Objects.equals(this.sharedNamespaces, podBasicConfig.sharedNamespaces) &&
        Objects.equals(this.sysctl, podBasicConfig.sysctl) &&
        Objects.equals(this.userns, podBasicConfig.userns) &&
        Objects.equals(this.utsns, podBasicConfig.utsns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exitPolicy, hostname, infraCommand, infraConmonPidFile, infraImage, infraName, ipcns, labels, name, noInfra, pidns, podCreateCommand, podDevices, restartPolicy, restartTries, shareParent, sharedNamespaces, sysctl, userns, utsns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodBasicConfig {\n");
    sb.append("    exitPolicy: ").append(toIndentedString(exitPolicy)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    infraCommand: ").append(toIndentedString(infraCommand)).append("\n");
    sb.append("    infraConmonPidFile: ").append(toIndentedString(infraConmonPidFile)).append("\n");
    sb.append("    infraImage: ").append(toIndentedString(infraImage)).append("\n");
    sb.append("    infraName: ").append(toIndentedString(infraName)).append("\n");
    sb.append("    ipcns: ").append(toIndentedString(ipcns)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noInfra: ").append(toIndentedString(noInfra)).append("\n");
    sb.append("    pidns: ").append(toIndentedString(pidns)).append("\n");
    sb.append("    podCreateCommand: ").append(toIndentedString(podCreateCommand)).append("\n");
    sb.append("    podDevices: ").append(toIndentedString(podDevices)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    restartTries: ").append(toIndentedString(restartTries)).append("\n");
    sb.append("    shareParent: ").append(toIndentedString(shareParent)).append("\n");
    sb.append("    sharedNamespaces: ").append(toIndentedString(sharedNamespaces)).append("\n");
    sb.append("    sysctl: ").append(toIndentedString(sysctl)).append("\n");
    sb.append("    userns: ").append(toIndentedString(userns)).append("\n");
    sb.append("    utsns: ").append(toIndentedString(utsns)).append("\n");
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
    openapiFields.add("exit_policy");
    openapiFields.add("hostname");
    openapiFields.add("infra_command");
    openapiFields.add("infra_conmon_pid_file");
    openapiFields.add("infra_image");
    openapiFields.add("infra_name");
    openapiFields.add("ipcns");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("no_infra");
    openapiFields.add("pidns");
    openapiFields.add("pod_create_command");
    openapiFields.add("pod_devices");
    openapiFields.add("restart_policy");
    openapiFields.add("restart_tries");
    openapiFields.add("share_parent");
    openapiFields.add("shared_namespaces");
    openapiFields.add("sysctl");
    openapiFields.add("userns");
    openapiFields.add("utsns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PodBasicConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PodBasicConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodBasicConfig is not found in the empty JSON string", PodBasicConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PodBasicConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodBasicConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("exit_policy") != null && !jsonObj.get("exit_policy").isJsonNull()) && !jsonObj.get("exit_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exit_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exit_policy").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("infra_command") != null && !jsonObj.get("infra_command").isJsonNull() && !jsonObj.get("infra_command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `infra_command` to be an array in the JSON string but got `%s`", jsonObj.get("infra_command").toString()));
      }
      if ((jsonObj.get("infra_conmon_pid_file") != null && !jsonObj.get("infra_conmon_pid_file").isJsonNull()) && !jsonObj.get("infra_conmon_pid_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infra_conmon_pid_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infra_conmon_pid_file").toString()));
      }
      if ((jsonObj.get("infra_image") != null && !jsonObj.get("infra_image").isJsonNull()) && !jsonObj.get("infra_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infra_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infra_image").toString()));
      }
      if ((jsonObj.get("infra_name") != null && !jsonObj.get("infra_name").isJsonNull()) && !jsonObj.get("infra_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infra_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infra_name").toString()));
      }
      // validate the optional field `ipcns`
      if (jsonObj.get("ipcns") != null && !jsonObj.get("ipcns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("ipcns"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `pidns`
      if (jsonObj.get("pidns") != null && !jsonObj.get("pidns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("pidns"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pod_create_command") != null && !jsonObj.get("pod_create_command").isJsonNull() && !jsonObj.get("pod_create_command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pod_create_command` to be an array in the JSON string but got `%s`", jsonObj.get("pod_create_command").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pod_devices") != null && !jsonObj.get("pod_devices").isJsonNull() && !jsonObj.get("pod_devices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pod_devices` to be an array in the JSON string but got `%s`", jsonObj.get("pod_devices").toString()));
      }
      if ((jsonObj.get("restart_policy") != null && !jsonObj.get("restart_policy").isJsonNull()) && !jsonObj.get("restart_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restart_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restart_policy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shared_namespaces") != null && !jsonObj.get("shared_namespaces").isJsonNull() && !jsonObj.get("shared_namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shared_namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("shared_namespaces").toString()));
      }
      // validate the optional field `userns`
      if (jsonObj.get("userns") != null && !jsonObj.get("userns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("userns"));
      }
      // validate the optional field `utsns`
      if (jsonObj.get("utsns") != null && !jsonObj.get("utsns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("utsns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodBasicConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodBasicConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodBasicConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodBasicConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PodBasicConfig>() {
           @Override
           public void write(JsonWriter out, PodBasicConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodBasicConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PodBasicConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PodBasicConfig
   * @throws IOException if the JSON string is invalid with respect to PodBasicConfig
   */
  public static PodBasicConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodBasicConfig.class);
  }

  /**
   * Convert an instance of PodBasicConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

