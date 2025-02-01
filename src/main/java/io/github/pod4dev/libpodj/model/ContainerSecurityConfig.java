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
import io.github.pod4dev.libpodj.model.IDMappingOptions;
import io.github.pod4dev.libpodj.model.Namespace;
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
 * ContainerSecurityConfig is a container&#39;s security features, including SELinux, Apparmor, and Seccomp.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ContainerSecurityConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPARMOR_PROFILE = "apparmor_profile";
  @SerializedName(SERIALIZED_NAME_APPARMOR_PROFILE)
  private String apparmorProfile;

  public static final String SERIALIZED_NAME_CAP_ADD = "cap_add";
  @SerializedName(SERIALIZED_NAME_CAP_ADD)
  private List<String> capAdd = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAP_DROP = "cap_drop";
  @SerializedName(SERIALIZED_NAME_CAP_DROP)
  private List<String> capDrop = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDMAPPINGS = "idmappings";
  @SerializedName(SERIALIZED_NAME_IDMAPPINGS)
  private IDMappingOptions idmappings;

  public static final String SERIALIZED_NAME_LABEL_NESTED = "label_nested";
  @SerializedName(SERIALIZED_NAME_LABEL_NESTED)
  private Boolean labelNested;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private List<String> mask = new ArrayList<>();

  public static final String SERIALIZED_NAME_NO_NEW_PRIVILEGES = "no_new_privileges";
  @SerializedName(SERIALIZED_NAME_NO_NEW_PRIVILEGES)
  private Boolean noNewPrivileges;

  public static final String SERIALIZED_NAME_PRIVILEGED = "privileged";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged;

  public static final String SERIALIZED_NAME_PROCFS_OPTS = "procfs_opts";
  @SerializedName(SERIALIZED_NAME_PROCFS_OPTS)
  private List<String> procfsOpts = new ArrayList<>();

  public static final String SERIALIZED_NAME_READ_ONLY_FILESYSTEM = "read_only_filesystem";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_FILESYSTEM)
  private Boolean readOnlyFilesystem;

  public static final String SERIALIZED_NAME_READ_WRITE_TMPFS = "read_write_tmpfs";
  @SerializedName(SERIALIZED_NAME_READ_WRITE_TMPFS)
  private Boolean readWriteTmpfs;

  public static final String SERIALIZED_NAME_SECCOMP_POLICY = "seccomp_policy";
  @SerializedName(SERIALIZED_NAME_SECCOMP_POLICY)
  private String seccompPolicy;

  public static final String SERIALIZED_NAME_SECCOMP_PROFILE_PATH = "seccomp_profile_path";
  @SerializedName(SERIALIZED_NAME_SECCOMP_PROFILE_PATH)
  private String seccompProfilePath;

  public static final String SERIALIZED_NAME_SELINUX_OPTS = "selinux_opts";
  @SerializedName(SERIALIZED_NAME_SELINUX_OPTS)
  private List<String> selinuxOpts = new ArrayList<>();

  public static final String SERIALIZED_NAME_UMASK = "umask";
  @SerializedName(SERIALIZED_NAME_UMASK)
  private String umask;

  public static final String SERIALIZED_NAME_UNMASK = "unmask";
  @SerializedName(SERIALIZED_NAME_UNMASK)
  private List<String> unmask = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_USERNS = "userns";
  @SerializedName(SERIALIZED_NAME_USERNS)
  private Namespace userns;

  public ContainerSecurityConfig() {
  }

  public ContainerSecurityConfig apparmorProfile(String apparmorProfile) {
    this.apparmorProfile = apparmorProfile;
    return this;
  }

  /**
   * ApparmorProfile is the name of the Apparmor profile the container will use. Optional.
   * @return apparmorProfile
   */
  @jakarta.annotation.Nullable

  public String getApparmorProfile() {
    return apparmorProfile;
  }

  public void setApparmorProfile(String apparmorProfile) {
    this.apparmorProfile = apparmorProfile;
  }


  public ContainerSecurityConfig capAdd(List<String> capAdd) {
    this.capAdd = capAdd;
    return this;
  }

  public ContainerSecurityConfig addCapAddItem(String capAddItem) {
    if (this.capAdd == null) {
      this.capAdd = new ArrayList<>();
    }
    this.capAdd.add(capAddItem);
    return this;
  }

  /**
   * CapAdd are capabilities which will be added to the container. Conflicts with Privileged. Optional.
   * @return capAdd
   */
  @jakarta.annotation.Nullable

  public List<String> getCapAdd() {
    return capAdd;
  }

  public void setCapAdd(List<String> capAdd) {
    this.capAdd = capAdd;
  }


  public ContainerSecurityConfig capDrop(List<String> capDrop) {
    this.capDrop = capDrop;
    return this;
  }

  public ContainerSecurityConfig addCapDropItem(String capDropItem) {
    if (this.capDrop == null) {
      this.capDrop = new ArrayList<>();
    }
    this.capDrop.add(capDropItem);
    return this;
  }

  /**
   * CapDrop are capabilities which will be removed from the container. Conflicts with Privileged. Optional.
   * @return capDrop
   */
  @jakarta.annotation.Nullable

  public List<String> getCapDrop() {
    return capDrop;
  }

  public void setCapDrop(List<String> capDrop) {
    this.capDrop = capDrop;
  }


  public ContainerSecurityConfig groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ContainerSecurityConfig addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups are a list of supplemental groups the container&#39;s user will be granted access to. Optional.
   * @return groups
   */
  @jakarta.annotation.Nullable

  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public ContainerSecurityConfig idmappings(IDMappingOptions idmappings) {
    this.idmappings = idmappings;
    return this;
  }

  /**
   * Get idmappings
   * @return idmappings
   */
  @jakarta.annotation.Nullable
  @Valid

  public IDMappingOptions getIdmappings() {
    return idmappings;
  }

  public void setIdmappings(IDMappingOptions idmappings) {
    this.idmappings = idmappings;
  }


  public ContainerSecurityConfig labelNested(Boolean labelNested) {
    this.labelNested = labelNested;
    return this;
  }

  /**
   * LabelNested indicates whether or not the container is allowed to run fully nested containers including SELinux labelling. Optional.
   * @return labelNested
   */
  @jakarta.annotation.Nullable

  public Boolean getLabelNested() {
    return labelNested;
  }

  public void setLabelNested(Boolean labelNested) {
    this.labelNested = labelNested;
  }


  public ContainerSecurityConfig mask(List<String> mask) {
    this.mask = mask;
    return this;
  }

  public ContainerSecurityConfig addMaskItem(String maskItem) {
    if (this.mask == null) {
      this.mask = new ArrayList<>();
    }
    this.mask.add(maskItem);
    return this;
  }

  /**
   * Mask is the path we want to mask in the container. This masks the paths given in addition to the default list. Optional
   * @return mask
   */
  @jakarta.annotation.Nullable

  public List<String> getMask() {
    return mask;
  }

  public void setMask(List<String> mask) {
    this.mask = mask;
  }


  public ContainerSecurityConfig noNewPrivileges(Boolean noNewPrivileges) {
    this.noNewPrivileges = noNewPrivileges;
    return this;
  }

  /**
   * NoNewPrivileges is whether the container will set the no new privileges flag on create, which disables gaining additional privileges (e.g. via setuid) in the container. Optional.
   * @return noNewPrivileges
   */
  @jakarta.annotation.Nullable

  public Boolean getNoNewPrivileges() {
    return noNewPrivileges;
  }

  public void setNoNewPrivileges(Boolean noNewPrivileges) {
    this.noNewPrivileges = noNewPrivileges;
  }


  public ContainerSecurityConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Privileged is whether the container is privileged. Privileged does the following: Adds all devices on the system to the container. Adds all capabilities to the container. Disables Seccomp, SELinux, and Apparmor confinement. (Though SELinux can be manually re-enabled). TODO: this conflicts with things. TODO: this does more. Optional.
   * @return privileged
   */
  @jakarta.annotation.Nullable

  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }


  public ContainerSecurityConfig procfsOpts(List<String> procfsOpts) {
    this.procfsOpts = procfsOpts;
    return this;
  }

  public ContainerSecurityConfig addProcfsOptsItem(String procfsOptsItem) {
    if (this.procfsOpts == null) {
      this.procfsOpts = new ArrayList<>();
    }
    this.procfsOpts.add(procfsOptsItem);
    return this;
  }

  /**
   * ProcOpts are the options used for the proc mount.
   * @return procfsOpts
   */
  @jakarta.annotation.Nullable

  public List<String> getProcfsOpts() {
    return procfsOpts;
  }

  public void setProcfsOpts(List<String> procfsOpts) {
    this.procfsOpts = procfsOpts;
  }


  public ContainerSecurityConfig readOnlyFilesystem(Boolean readOnlyFilesystem) {
    this.readOnlyFilesystem = readOnlyFilesystem;
    return this;
  }

  /**
   * ReadOnlyFilesystem indicates that everything will be mounted as read-only. Optional.
   * @return readOnlyFilesystem
   */
  @jakarta.annotation.Nullable

  public Boolean getReadOnlyFilesystem() {
    return readOnlyFilesystem;
  }

  public void setReadOnlyFilesystem(Boolean readOnlyFilesystem) {
    this.readOnlyFilesystem = readOnlyFilesystem;
  }


  public ContainerSecurityConfig readWriteTmpfs(Boolean readWriteTmpfs) {
    this.readWriteTmpfs = readWriteTmpfs;
    return this;
  }

  /**
   * ReadWriteTmpfs indicates that when running with a ReadOnlyFilesystem mount temporary file systems. Optional.
   * @return readWriteTmpfs
   */
  @jakarta.annotation.Nullable

  public Boolean getReadWriteTmpfs() {
    return readWriteTmpfs;
  }

  public void setReadWriteTmpfs(Boolean readWriteTmpfs) {
    this.readWriteTmpfs = readWriteTmpfs;
  }


  public ContainerSecurityConfig seccompPolicy(String seccompPolicy) {
    this.seccompPolicy = seccompPolicy;
    return this;
  }

  /**
   * SeccompPolicy determines which seccomp profile gets applied the container. valid values: empty,default,image
   * @return seccompPolicy
   */
  @jakarta.annotation.Nullable

  public String getSeccompPolicy() {
    return seccompPolicy;
  }

  public void setSeccompPolicy(String seccompPolicy) {
    this.seccompPolicy = seccompPolicy;
  }


  public ContainerSecurityConfig seccompProfilePath(String seccompProfilePath) {
    this.seccompProfilePath = seccompProfilePath;
    return this;
  }

  /**
   * SeccompProfilePath is the path to a JSON file containing the container&#39;s Seccomp profile. If not specified, no Seccomp profile will be used. Optional.
   * @return seccompProfilePath
   */
  @jakarta.annotation.Nullable

  public String getSeccompProfilePath() {
    return seccompProfilePath;
  }

  public void setSeccompProfilePath(String seccompProfilePath) {
    this.seccompProfilePath = seccompProfilePath;
  }


  public ContainerSecurityConfig selinuxOpts(List<String> selinuxOpts) {
    this.selinuxOpts = selinuxOpts;
    return this;
  }

  public ContainerSecurityConfig addSelinuxOptsItem(String selinuxOptsItem) {
    if (this.selinuxOpts == null) {
      this.selinuxOpts = new ArrayList<>();
    }
    this.selinuxOpts.add(selinuxOptsItem);
    return this;
  }

  /**
   * SelinuxProcessLabel is the process label the container will use. If SELinux is enabled and this is not specified, a label will be automatically generated if not specified. Optional.
   * @return selinuxOpts
   */
  @jakarta.annotation.Nullable

  public List<String> getSelinuxOpts() {
    return selinuxOpts;
  }

  public void setSelinuxOpts(List<String> selinuxOpts) {
    this.selinuxOpts = selinuxOpts;
  }


  public ContainerSecurityConfig umask(String umask) {
    this.umask = umask;
    return this;
  }

  /**
   * Umask is the umask the init process of the container will be run with.
   * @return umask
   */
  @jakarta.annotation.Nullable

  public String getUmask() {
    return umask;
  }

  public void setUmask(String umask) {
    this.umask = umask;
  }


  public ContainerSecurityConfig unmask(List<String> unmask) {
    this.unmask = unmask;
    return this;
  }

  public ContainerSecurityConfig addUnmaskItem(String unmaskItem) {
    if (this.unmask == null) {
      this.unmask = new ArrayList<>();
    }
    this.unmask.add(unmaskItem);
    return this;
  }

  /**
   * Unmask a path in the container. Some paths are masked by default, preventing them from being accessed within the container; this undoes that masking. If ALL is passed, all paths will be unmasked. Optional.
   * @return unmask
   */
  @jakarta.annotation.Nullable

  public List<String> getUnmask() {
    return unmask;
  }

  public void setUnmask(List<String> unmask) {
    this.unmask = unmask;
  }


  public ContainerSecurityConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User is the user the container will be run as. Can be given as a UID or a username; if a username, it will be resolved within the container, using the container&#39;s /etc/passwd. If unset, the container will be run as root. Optional.
   * @return user
   */
  @jakarta.annotation.Nullable

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public ContainerSecurityConfig userns(Namespace userns) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSecurityConfig containerSecurityConfig = (ContainerSecurityConfig) o;
    return Objects.equals(this.apparmorProfile, containerSecurityConfig.apparmorProfile) &&
        Objects.equals(this.capAdd, containerSecurityConfig.capAdd) &&
        Objects.equals(this.capDrop, containerSecurityConfig.capDrop) &&
        Objects.equals(this.groups, containerSecurityConfig.groups) &&
        Objects.equals(this.idmappings, containerSecurityConfig.idmappings) &&
        Objects.equals(this.labelNested, containerSecurityConfig.labelNested) &&
        Objects.equals(this.mask, containerSecurityConfig.mask) &&
        Objects.equals(this.noNewPrivileges, containerSecurityConfig.noNewPrivileges) &&
        Objects.equals(this.privileged, containerSecurityConfig.privileged) &&
        Objects.equals(this.procfsOpts, containerSecurityConfig.procfsOpts) &&
        Objects.equals(this.readOnlyFilesystem, containerSecurityConfig.readOnlyFilesystem) &&
        Objects.equals(this.readWriteTmpfs, containerSecurityConfig.readWriteTmpfs) &&
        Objects.equals(this.seccompPolicy, containerSecurityConfig.seccompPolicy) &&
        Objects.equals(this.seccompProfilePath, containerSecurityConfig.seccompProfilePath) &&
        Objects.equals(this.selinuxOpts, containerSecurityConfig.selinuxOpts) &&
        Objects.equals(this.umask, containerSecurityConfig.umask) &&
        Objects.equals(this.unmask, containerSecurityConfig.unmask) &&
        Objects.equals(this.user, containerSecurityConfig.user) &&
        Objects.equals(this.userns, containerSecurityConfig.userns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apparmorProfile, capAdd, capDrop, groups, idmappings, labelNested, mask, noNewPrivileges, privileged, procfsOpts, readOnlyFilesystem, readWriteTmpfs, seccompPolicy, seccompProfilePath, selinuxOpts, umask, unmask, user, userns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSecurityConfig {\n");
    sb.append("    apparmorProfile: ").append(toIndentedString(apparmorProfile)).append("\n");
    sb.append("    capAdd: ").append(toIndentedString(capAdd)).append("\n");
    sb.append("    capDrop: ").append(toIndentedString(capDrop)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    idmappings: ").append(toIndentedString(idmappings)).append("\n");
    sb.append("    labelNested: ").append(toIndentedString(labelNested)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    noNewPrivileges: ").append(toIndentedString(noNewPrivileges)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    procfsOpts: ").append(toIndentedString(procfsOpts)).append("\n");
    sb.append("    readOnlyFilesystem: ").append(toIndentedString(readOnlyFilesystem)).append("\n");
    sb.append("    readWriteTmpfs: ").append(toIndentedString(readWriteTmpfs)).append("\n");
    sb.append("    seccompPolicy: ").append(toIndentedString(seccompPolicy)).append("\n");
    sb.append("    seccompProfilePath: ").append(toIndentedString(seccompProfilePath)).append("\n");
    sb.append("    selinuxOpts: ").append(toIndentedString(selinuxOpts)).append("\n");
    sb.append("    umask: ").append(toIndentedString(umask)).append("\n");
    sb.append("    unmask: ").append(toIndentedString(unmask)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userns: ").append(toIndentedString(userns)).append("\n");
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
    openapiFields.add("apparmor_profile");
    openapiFields.add("cap_add");
    openapiFields.add("cap_drop");
    openapiFields.add("groups");
    openapiFields.add("idmappings");
    openapiFields.add("label_nested");
    openapiFields.add("mask");
    openapiFields.add("no_new_privileges");
    openapiFields.add("privileged");
    openapiFields.add("procfs_opts");
    openapiFields.add("read_only_filesystem");
    openapiFields.add("read_write_tmpfs");
    openapiFields.add("seccomp_policy");
    openapiFields.add("seccomp_profile_path");
    openapiFields.add("selinux_opts");
    openapiFields.add("umask");
    openapiFields.add("unmask");
    openapiFields.add("user");
    openapiFields.add("userns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerSecurityConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerSecurityConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerSecurityConfig is not found in the empty JSON string", ContainerSecurityConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerSecurityConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerSecurityConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apparmor_profile") != null && !jsonObj.get("apparmor_profile").isJsonNull()) && !jsonObj.get("apparmor_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apparmor_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apparmor_profile").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cap_add") != null && !jsonObj.get("cap_add").isJsonNull() && !jsonObj.get("cap_add").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cap_add` to be an array in the JSON string but got `%s`", jsonObj.get("cap_add").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cap_drop") != null && !jsonObj.get("cap_drop").isJsonNull() && !jsonObj.get("cap_drop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cap_drop` to be an array in the JSON string but got `%s`", jsonObj.get("cap_drop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull() && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      // validate the optional field `idmappings`
      if (jsonObj.get("idmappings") != null && !jsonObj.get("idmappings").isJsonNull()) {
        IDMappingOptions.validateJsonElement(jsonObj.get("idmappings"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mask") != null && !jsonObj.get("mask").isJsonNull() && !jsonObj.get("mask").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mask` to be an array in the JSON string but got `%s`", jsonObj.get("mask").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("procfs_opts") != null && !jsonObj.get("procfs_opts").isJsonNull() && !jsonObj.get("procfs_opts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `procfs_opts` to be an array in the JSON string but got `%s`", jsonObj.get("procfs_opts").toString()));
      }
      if ((jsonObj.get("seccomp_policy") != null && !jsonObj.get("seccomp_policy").isJsonNull()) && !jsonObj.get("seccomp_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seccomp_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seccomp_policy").toString()));
      }
      if ((jsonObj.get("seccomp_profile_path") != null && !jsonObj.get("seccomp_profile_path").isJsonNull()) && !jsonObj.get("seccomp_profile_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seccomp_profile_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seccomp_profile_path").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("selinux_opts") != null && !jsonObj.get("selinux_opts").isJsonNull() && !jsonObj.get("selinux_opts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selinux_opts` to be an array in the JSON string but got `%s`", jsonObj.get("selinux_opts").toString()));
      }
      if ((jsonObj.get("umask") != null && !jsonObj.get("umask").isJsonNull()) && !jsonObj.get("umask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `umask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("umask").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unmask") != null && !jsonObj.get("unmask").isJsonNull() && !jsonObj.get("unmask").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unmask` to be an array in the JSON string but got `%s`", jsonObj.get("unmask").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // validate the optional field `userns`
      if (jsonObj.get("userns") != null && !jsonObj.get("userns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("userns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerSecurityConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerSecurityConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerSecurityConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerSecurityConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerSecurityConfig>() {
           @Override
           public void write(JsonWriter out, ContainerSecurityConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerSecurityConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerSecurityConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerSecurityConfig
   * @throws IOException if the JSON string is invalid with respect to ContainerSecurityConfig
   */
  public static ContainerSecurityConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerSecurityConfig.class);
  }

  /**
   * Convert an instance of ContainerSecurityConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

