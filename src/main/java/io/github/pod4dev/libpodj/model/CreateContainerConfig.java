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
import io.github.pod4dev.libpodj.model.HealthcheckConfig;
import io.github.pod4dev.libpodj.model.HostConfig;
import io.github.pod4dev.libpodj.model.NetworkingConfig;
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
 * CreateContainerConfig used when compatible endpoint creates a container
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateContainerConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ARGS_ESCAPED = "ArgsEscaped";
  @SerializedName(SERIALIZED_NAME_ARGS_ESCAPED)
  private Boolean argsEscaped;

  public static final String SERIALIZED_NAME_ATTACH_STDERR = "AttachStderr";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDERR)
  private Boolean attachStderr;

  public static final String SERIALIZED_NAME_ATTACH_STDIN = "AttachStdin";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDIN)
  private Boolean attachStdin;

  public static final String SERIALIZED_NAME_ATTACH_STDOUT = "AttachStdout";
  @SerializedName(SERIALIZED_NAME_ATTACH_STDOUT)
  private Boolean attachStdout;

  public static final String SERIALIZED_NAME_CMD = "Cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private List<String> cmd = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAINNAME = "Domainname";
  @SerializedName(SERIALIZED_NAME_DOMAINNAME)
  private String domainname;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "Entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private List<String> entrypoint = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<String> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV_MERGE = "EnvMerge";
  @SerializedName(SERIALIZED_NAME_ENV_MERGE)
  private List<String> envMerge = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPOSED_PORTS = "ExposedPorts";
  @SerializedName(SERIALIZED_NAME_EXPOSED_PORTS)
  private Map<String, Object> exposedPorts = new HashMap<>();

  public static final String SERIALIZED_NAME_HEALTHCHECK = "Healthcheck";
  @SerializedName(SERIALIZED_NAME_HEALTHCHECK)
  private HealthcheckConfig healthcheck;

  public static final String SERIALIZED_NAME_HOST_CONFIG = "HostConfig";
  @SerializedName(SERIALIZED_NAME_HOST_CONFIG)
  private HostConfig hostConfig;

  public static final String SERIALIZED_NAME_HOSTNAME = "Hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_DISABLED = "NetworkDisabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_DISABLED)
  private Boolean networkDisabled;

  public static final String SERIALIZED_NAME_NETWORKING_CONFIG = "NetworkingConfig";
  @SerializedName(SERIALIZED_NAME_NETWORKING_CONFIG)
  private NetworkingConfig networkingConfig;

  public static final String SERIALIZED_NAME_ON_BUILD = "OnBuild";
  @SerializedName(SERIALIZED_NAME_ON_BUILD)
  private List<String> onBuild = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPEN_STDIN = "OpenStdin";
  @SerializedName(SERIALIZED_NAME_OPEN_STDIN)
  private Boolean openStdin;

  public static final String SERIALIZED_NAME_SHELL = "Shell";
  @SerializedName(SERIALIZED_NAME_SHELL)
  private List<String> shell = new ArrayList<>();

  public static final String SERIALIZED_NAME_STDIN_ONCE = "StdinOnce";
  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_STOP_SIGNAL = "StopSignal";
  @SerializedName(SERIALIZED_NAME_STOP_SIGNAL)
  private String stopSignal;

  public static final String SERIALIZED_NAME_STOP_TIMEOUT = "StopTimeout";
  @SerializedName(SERIALIZED_NAME_STOP_TIMEOUT)
  private Long stopTimeout;

  public static final String SERIALIZED_NAME_TTY = "Tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_UNSET_ENV = "UnsetEnv";
  @SerializedName(SERIALIZED_NAME_UNSET_ENV)
  private List<String> unsetEnv = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNSET_ENV_ALL = "UnsetEnvAll";
  @SerializedName(SERIALIZED_NAME_UNSET_ENV_ALL)
  private Boolean unsetEnvAll;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_VOLUMES = "Volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private Map<String, Object> volumes = new HashMap<>();

  public static final String SERIALIZED_NAME_WORKING_DIR = "WorkingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;

  public CreateContainerConfig() {
  }

  public CreateContainerConfig argsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
    return this;
  }

  /**
   * Get argsEscaped
   * @return argsEscaped
   */
  @jakarta.annotation.Nullable

  public Boolean getArgsEscaped() {
    return argsEscaped;
  }

  public void setArgsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
  }


  public CreateContainerConfig attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Get attachStderr
   * @return attachStderr
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }


  public CreateContainerConfig attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Get attachStdin
   * @return attachStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }


  public CreateContainerConfig attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Get attachStdout
   * @return attachStdout
   */
  @jakarta.annotation.Nullable

  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }


  public CreateContainerConfig cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public CreateContainerConfig addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return cmd
   */
  @jakarta.annotation.Nullable

  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public CreateContainerConfig domainname(String domainname) {
    this.domainname = domainname;
    return this;
  }

  /**
   * Get domainname
   * @return domainname
   */
  @jakarta.annotation.Nullable

  public String getDomainname() {
    return domainname;
  }

  public void setDomainname(String domainname) {
    this.domainname = domainname;
  }


  public CreateContainerConfig entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public CreateContainerConfig addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return entrypoint
   */
  @jakarta.annotation.Nullable

  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }


  public CreateContainerConfig env(List<String> env) {
    this.env = env;
    return this;
  }

  public CreateContainerConfig addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
   */
  @jakarta.annotation.Nullable

  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }


  public CreateContainerConfig envMerge(List<String> envMerge) {
    this.envMerge = envMerge;
    return this;
  }

  public CreateContainerConfig addEnvMergeItem(String envMergeItem) {
    if (this.envMerge == null) {
      this.envMerge = new ArrayList<>();
    }
    this.envMerge.add(envMergeItem);
    return this;
  }

  /**
   * Get envMerge
   * @return envMerge
   */
  @jakarta.annotation.Nullable

  public List<String> getEnvMerge() {
    return envMerge;
  }

  public void setEnvMerge(List<String> envMerge) {
    this.envMerge = envMerge;
  }


  public CreateContainerConfig exposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
    return this;
  }

  public CreateContainerConfig putExposedPortsItem(String key, Object exposedPortsItem) {
    if (this.exposedPorts == null) {
      this.exposedPorts = new HashMap<>();
    }
    this.exposedPorts.put(key, exposedPortsItem);
    return this;
  }

  /**
   * PortSet is a collection of structs indexed by Port
   * @return exposedPorts
   */
  @jakarta.annotation.Nullable

  public Map<String, Object> getExposedPorts() {
    return exposedPorts;
  }

  public void setExposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
  }


  public CreateContainerConfig healthcheck(HealthcheckConfig healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

  /**
   * Get healthcheck
   * @return healthcheck
   */
  @jakarta.annotation.Nullable
  @Valid

  public HealthcheckConfig getHealthcheck() {
    return healthcheck;
  }

  public void setHealthcheck(HealthcheckConfig healthcheck) {
    this.healthcheck = healthcheck;
  }


  public CreateContainerConfig hostConfig(HostConfig hostConfig) {
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


  public CreateContainerConfig hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
   */
  @jakarta.annotation.Nullable

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public CreateContainerConfig image(String image) {
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


  public CreateContainerConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateContainerConfig putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public CreateContainerConfig macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Mac Address of the container.  Deprecated: this field is deprecated since API v1.44. Use EndpointSettings.MacAddress instead.
   * @return macAddress
   */
  @jakarta.annotation.Nullable

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public CreateContainerConfig name(String name) {
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


  public CreateContainerConfig networkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
    return this;
  }

  /**
   * Get networkDisabled
   * @return networkDisabled
   */
  @jakarta.annotation.Nullable

  public Boolean getNetworkDisabled() {
    return networkDisabled;
  }

  public void setNetworkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
  }


  public CreateContainerConfig networkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
    return this;
  }

  /**
   * Get networkingConfig
   * @return networkingConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public NetworkingConfig getNetworkingConfig() {
    return networkingConfig;
  }

  public void setNetworkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
  }


  public CreateContainerConfig onBuild(List<String> onBuild) {
    this.onBuild = onBuild;
    return this;
  }

  public CreateContainerConfig addOnBuildItem(String onBuildItem) {
    if (this.onBuild == null) {
      this.onBuild = new ArrayList<>();
    }
    this.onBuild.add(onBuildItem);
    return this;
  }

  /**
   * Get onBuild
   * @return onBuild
   */
  @jakarta.annotation.Nullable

  public List<String> getOnBuild() {
    return onBuild;
  }

  public void setOnBuild(List<String> onBuild) {
    this.onBuild = onBuild;
  }


  public CreateContainerConfig openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Get openStdin
   * @return openStdin
   */
  @jakarta.annotation.Nullable

  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }


  public CreateContainerConfig shell(List<String> shell) {
    this.shell = shell;
    return this;
  }

  public CreateContainerConfig addShellItem(String shellItem) {
    if (this.shell == null) {
      this.shell = new ArrayList<>();
    }
    this.shell.add(shellItem);
    return this;
  }

  /**
   * We need to override the json decoder to accept both options.
   * @return shell
   */
  @jakarta.annotation.Nullable

  public List<String> getShell() {
    return shell;
  }

  public void setShell(List<String> shell) {
    this.shell = shell;
  }


  public CreateContainerConfig stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Get stdinOnce
   * @return stdinOnce
   */
  @jakarta.annotation.Nullable

  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public CreateContainerConfig stopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

  /**
   * Get stopSignal
   * @return stopSignal
   */
  @jakarta.annotation.Nullable

  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
  }


  public CreateContainerConfig stopTimeout(Long stopTimeout) {
    this.stopTimeout = stopTimeout;
    return this;
  }

  /**
   * Get stopTimeout
   * @return stopTimeout
   */
  @jakarta.annotation.Nullable

  public Long getStopTimeout() {
    return stopTimeout;
  }

  public void setStopTimeout(Long stopTimeout) {
    this.stopTimeout = stopTimeout;
  }


  public CreateContainerConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Get tty
   * @return tty
   */
  @jakarta.annotation.Nullable

  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public CreateContainerConfig unsetEnv(List<String> unsetEnv) {
    this.unsetEnv = unsetEnv;
    return this;
  }

  public CreateContainerConfig addUnsetEnvItem(String unsetEnvItem) {
    if (this.unsetEnv == null) {
      this.unsetEnv = new ArrayList<>();
    }
    this.unsetEnv.add(unsetEnvItem);
    return this;
  }

  /**
   * Get unsetEnv
   * @return unsetEnv
   */
  @jakarta.annotation.Nullable

  public List<String> getUnsetEnv() {
    return unsetEnv;
  }

  public void setUnsetEnv(List<String> unsetEnv) {
    this.unsetEnv = unsetEnv;
  }


  public CreateContainerConfig unsetEnvAll(Boolean unsetEnvAll) {
    this.unsetEnvAll = unsetEnvAll;
    return this;
  }

  /**
   * Get unsetEnvAll
   * @return unsetEnvAll
   */
  @jakarta.annotation.Nullable

  public Boolean getUnsetEnvAll() {
    return unsetEnvAll;
  }

  public void setUnsetEnvAll(Boolean unsetEnvAll) {
    this.unsetEnvAll = unsetEnvAll;
  }


  public CreateContainerConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @jakarta.annotation.Nullable

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public CreateContainerConfig volumes(Map<String, Object> volumes) {
    this.volumes = volumes;
    return this;
  }

  public CreateContainerConfig putVolumesItem(String key, Object volumesItem) {
    if (this.volumes == null) {
      this.volumes = new HashMap<>();
    }
    this.volumes.put(key, volumesItem);
    return this;
  }

  /**
   * Get volumes
   * @return volumes
   */
  @jakarta.annotation.Nullable

  public Map<String, Object> getVolumes() {
    return volumes;
  }

  public void setVolumes(Map<String, Object> volumes) {
    this.volumes = volumes;
  }


  public CreateContainerConfig workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * Get workingDir
   * @return workingDir
   */
  @jakarta.annotation.Nullable

  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContainerConfig createContainerConfig = (CreateContainerConfig) o;
    return Objects.equals(this.argsEscaped, createContainerConfig.argsEscaped) &&
        Objects.equals(this.attachStderr, createContainerConfig.attachStderr) &&
        Objects.equals(this.attachStdin, createContainerConfig.attachStdin) &&
        Objects.equals(this.attachStdout, createContainerConfig.attachStdout) &&
        Objects.equals(this.cmd, createContainerConfig.cmd) &&
        Objects.equals(this.domainname, createContainerConfig.domainname) &&
        Objects.equals(this.entrypoint, createContainerConfig.entrypoint) &&
        Objects.equals(this.env, createContainerConfig.env) &&
        Objects.equals(this.envMerge, createContainerConfig.envMerge) &&
        Objects.equals(this.exposedPorts, createContainerConfig.exposedPorts) &&
        Objects.equals(this.healthcheck, createContainerConfig.healthcheck) &&
        Objects.equals(this.hostConfig, createContainerConfig.hostConfig) &&
        Objects.equals(this.hostname, createContainerConfig.hostname) &&
        Objects.equals(this.image, createContainerConfig.image) &&
        Objects.equals(this.labels, createContainerConfig.labels) &&
        Objects.equals(this.macAddress, createContainerConfig.macAddress) &&
        Objects.equals(this.name, createContainerConfig.name) &&
        Objects.equals(this.networkDisabled, createContainerConfig.networkDisabled) &&
        Objects.equals(this.networkingConfig, createContainerConfig.networkingConfig) &&
        Objects.equals(this.onBuild, createContainerConfig.onBuild) &&
        Objects.equals(this.openStdin, createContainerConfig.openStdin) &&
        Objects.equals(this.shell, createContainerConfig.shell) &&
        Objects.equals(this.stdinOnce, createContainerConfig.stdinOnce) &&
        Objects.equals(this.stopSignal, createContainerConfig.stopSignal) &&
        Objects.equals(this.stopTimeout, createContainerConfig.stopTimeout) &&
        Objects.equals(this.tty, createContainerConfig.tty) &&
        Objects.equals(this.unsetEnv, createContainerConfig.unsetEnv) &&
        Objects.equals(this.unsetEnvAll, createContainerConfig.unsetEnvAll) &&
        Objects.equals(this.user, createContainerConfig.user) &&
        Objects.equals(this.volumes, createContainerConfig.volumes) &&
        Objects.equals(this.workingDir, createContainerConfig.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argsEscaped, attachStderr, attachStdin, attachStdout, cmd, domainname, entrypoint, env, envMerge, exposedPorts, healthcheck, hostConfig, hostname, image, labels, macAddress, name, networkDisabled, networkingConfig, onBuild, openStdin, shell, stdinOnce, stopSignal, stopTimeout, tty, unsetEnv, unsetEnvAll, user, volumes, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContainerConfig {\n");
    sb.append("    argsEscaped: ").append(toIndentedString(argsEscaped)).append("\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    domainname: ").append(toIndentedString(domainname)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envMerge: ").append(toIndentedString(envMerge)).append("\n");
    sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkDisabled: ").append(toIndentedString(networkDisabled)).append("\n");
    sb.append("    networkingConfig: ").append(toIndentedString(networkingConfig)).append("\n");
    sb.append("    onBuild: ").append(toIndentedString(onBuild)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
    sb.append("    stopTimeout: ").append(toIndentedString(stopTimeout)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    unsetEnv: ").append(toIndentedString(unsetEnv)).append("\n");
    sb.append("    unsetEnvAll: ").append(toIndentedString(unsetEnvAll)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
    openapiFields.add("ArgsEscaped");
    openapiFields.add("AttachStderr");
    openapiFields.add("AttachStdin");
    openapiFields.add("AttachStdout");
    openapiFields.add("Cmd");
    openapiFields.add("Domainname");
    openapiFields.add("Entrypoint");
    openapiFields.add("Env");
    openapiFields.add("EnvMerge");
    openapiFields.add("ExposedPorts");
    openapiFields.add("Healthcheck");
    openapiFields.add("HostConfig");
    openapiFields.add("Hostname");
    openapiFields.add("Image");
    openapiFields.add("Labels");
    openapiFields.add("MacAddress");
    openapiFields.add("Name");
    openapiFields.add("NetworkDisabled");
    openapiFields.add("NetworkingConfig");
    openapiFields.add("OnBuild");
    openapiFields.add("OpenStdin");
    openapiFields.add("Shell");
    openapiFields.add("StdinOnce");
    openapiFields.add("StopSignal");
    openapiFields.add("StopTimeout");
    openapiFields.add("Tty");
    openapiFields.add("UnsetEnv");
    openapiFields.add("UnsetEnvAll");
    openapiFields.add("User");
    openapiFields.add("Volumes");
    openapiFields.add("WorkingDir");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContainerConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContainerConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContainerConfig is not found in the empty JSON string", CreateContainerConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContainerConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContainerConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Cmd") != null && !jsonObj.get("Cmd").isJsonNull() && !jsonObj.get("Cmd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cmd` to be an array in the JSON string but got `%s`", jsonObj.get("Cmd").toString()));
      }
      if ((jsonObj.get("Domainname") != null && !jsonObj.get("Domainname").isJsonNull()) && !jsonObj.get("Domainname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Domainname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Domainname").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Entrypoint") != null && !jsonObj.get("Entrypoint").isJsonNull() && !jsonObj.get("Entrypoint").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Entrypoint` to be an array in the JSON string but got `%s`", jsonObj.get("Entrypoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Env") != null && !jsonObj.get("Env").isJsonNull() && !jsonObj.get("Env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Env` to be an array in the JSON string but got `%s`", jsonObj.get("Env").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("EnvMerge") != null && !jsonObj.get("EnvMerge").isJsonNull() && !jsonObj.get("EnvMerge").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EnvMerge` to be an array in the JSON string but got `%s`", jsonObj.get("EnvMerge").toString()));
      }
      // validate the optional field `Healthcheck`
      if (jsonObj.get("Healthcheck") != null && !jsonObj.get("Healthcheck").isJsonNull()) {
        HealthcheckConfig.validateJsonElement(jsonObj.get("Healthcheck"));
      }
      // validate the optional field `HostConfig`
      if (jsonObj.get("HostConfig") != null && !jsonObj.get("HostConfig").isJsonNull()) {
        HostConfig.validateJsonElement(jsonObj.get("HostConfig"));
      }
      if ((jsonObj.get("Hostname") != null && !jsonObj.get("Hostname").isJsonNull()) && !jsonObj.get("Hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hostname").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `NetworkingConfig`
      if (jsonObj.get("NetworkingConfig") != null && !jsonObj.get("NetworkingConfig").isJsonNull()) {
        NetworkingConfig.validateJsonElement(jsonObj.get("NetworkingConfig"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("OnBuild") != null && !jsonObj.get("OnBuild").isJsonNull() && !jsonObj.get("OnBuild").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OnBuild` to be an array in the JSON string but got `%s`", jsonObj.get("OnBuild").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Shell") != null && !jsonObj.get("Shell").isJsonNull() && !jsonObj.get("Shell").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Shell` to be an array in the JSON string but got `%s`", jsonObj.get("Shell").toString()));
      }
      if ((jsonObj.get("StopSignal") != null && !jsonObj.get("StopSignal").isJsonNull()) && !jsonObj.get("StopSignal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StopSignal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StopSignal").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("UnsetEnv") != null && !jsonObj.get("UnsetEnv").isJsonNull() && !jsonObj.get("UnsetEnv").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `UnsetEnv` to be an array in the JSON string but got `%s`", jsonObj.get("UnsetEnv").toString()));
      }
      if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) && !jsonObj.get("User").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `User` to be a primitive type in the JSON string but got `%s`", jsonObj.get("User").toString()));
      }
      if ((jsonObj.get("WorkingDir") != null && !jsonObj.get("WorkingDir").isJsonNull()) && !jsonObj.get("WorkingDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkingDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkingDir").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContainerConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContainerConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContainerConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContainerConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContainerConfig>() {
           @Override
           public void write(JsonWriter out, CreateContainerConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContainerConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContainerConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContainerConfig
   * @throws IOException if the JSON string is invalid with respect to CreateContainerConfig
   */
  public static CreateContainerConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContainerConfig.class);
  }

  /**
   * Convert an instance of CreateContainerConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

