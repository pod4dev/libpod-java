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
import io.github.pod4dev.libpodj.model.InspectHostPort;
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
 * InspectPodInfraConfig contains the configuration of the pod&#39;s infra container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class InspectPodInfraConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DN_S_OPTION = "DNSOption";
  @SerializedName(SERIALIZED_NAME_DN_S_OPTION)
  private List<String> dnSOption = new ArrayList<>();

  public static final String SERIALIZED_NAME_DN_S_SEARCH = "DNSSearch";
  @SerializedName(SERIALIZED_NAME_DN_S_SEARCH)
  private List<String> dnSSearch = new ArrayList<>();

  public static final String SERIALIZED_NAME_DN_S_SERVER = "DNSServer";
  @SerializedName(SERIALIZED_NAME_DN_S_SERVER)
  private List<String> dnSServer = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_ADD = "HostAdd";
  @SerializedName(SERIALIZED_NAME_HOST_ADD)
  private List<String> hostAdd = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_NETWORK = "HostNetwork";
  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_HOSTS_FILE = "HostsFile";
  @SerializedName(SERIALIZED_NAME_HOSTS_FILE)
  private String hostsFile;

  public static final String SERIALIZED_NAME_NETWORK_OPTIONS = "NetworkOptions";
  @SerializedName(SERIALIZED_NAME_NETWORK_OPTIONS)
  private Map<String, List<String>> networkOptions = new HashMap<>();

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<String> networks = new ArrayList<>();

  public static final String SERIALIZED_NAME_NO_MANAGE_HOSTNAME = "NoManageHostname";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_HOSTNAME)
  private Boolean noManageHostname;

  public static final String SERIALIZED_NAME_NO_MANAGE_HOSTS = "NoManageHosts";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_HOSTS)
  private Boolean noManageHosts;

  public static final String SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF = "NoManageResolvConf";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF)
  private Boolean noManageResolvConf;

  public static final String SERIALIZED_NAME_PORT_BINDINGS = "PortBindings";
  @SerializedName(SERIALIZED_NAME_PORT_BINDINGS)
  private Map<String, List<@Valid InspectHostPort>> portBindings = new HashMap<>();

  public static final String SERIALIZED_NAME_STATIC_I_P = "StaticIP";
  @SerializedName(SERIALIZED_NAME_STATIC_I_P)
  private String staticIP;

  public static final String SERIALIZED_NAME_STATIC_M_A_C = "StaticMAC";
  @SerializedName(SERIALIZED_NAME_STATIC_M_A_C)
  private String staticMAC;

  public static final String SERIALIZED_NAME_CPU_PERIOD = "cpu_period";
  @SerializedName(SERIALIZED_NAME_CPU_PERIOD)
  private Integer cpuPeriod;

  public static final String SERIALIZED_NAME_CPU_QUOTA = "cpu_quota";
  @SerializedName(SERIALIZED_NAME_CPU_QUOTA)
  private Long cpuQuota;

  public static final String SERIALIZED_NAME_CPUSET_CPUS = "cpuset_cpus";
  @SerializedName(SERIALIZED_NAME_CPUSET_CPUS)
  private String cpusetCpus;

  public static final String SERIALIZED_NAME_PID_NS = "pid_ns";
  @SerializedName(SERIALIZED_NAME_PID_NS)
  private String pidNs;

  public static final String SERIALIZED_NAME_USERNS = "userns";
  @SerializedName(SERIALIZED_NAME_USERNS)
  private String userns;

  public static final String SERIALIZED_NAME_UTS_NS = "uts_ns";
  @SerializedName(SERIALIZED_NAME_UTS_NS)
  private String utsNs;

  public InspectPodInfraConfig() {
  }

  public InspectPodInfraConfig dnSOption(List<String> dnSOption) {
    this.dnSOption = dnSOption;
    return this;
  }

  public InspectPodInfraConfig addDnSOptionItem(String dnSOptionItem) {
    if (this.dnSOption == null) {
      this.dnSOption = new ArrayList<>();
    }
    this.dnSOption.add(dnSOptionItem);
    return this;
  }

  /**
   * DNSOption is a set of DNS options that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod.
   * @return dnSOption
   */
  @jakarta.annotation.Nullable

  public List<String> getDnSOption() {
    return dnSOption;
  }

  public void setDnSOption(List<String> dnSOption) {
    this.dnSOption = dnSOption;
  }


  public InspectPodInfraConfig dnSSearch(List<String> dnSSearch) {
    this.dnSSearch = dnSSearch;
    return this;
  }

  public InspectPodInfraConfig addDnSSearchItem(String dnSSearchItem) {
    if (this.dnSSearch == null) {
      this.dnSSearch = new ArrayList<>();
    }
    this.dnSSearch.add(dnSSearchItem);
    return this;
  }

  /**
   * DNSSearch is a set of DNS search domains that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod.
   * @return dnSSearch
   */
  @jakarta.annotation.Nullable

  public List<String> getDnSSearch() {
    return dnSSearch;
  }

  public void setDnSSearch(List<String> dnSSearch) {
    this.dnSSearch = dnSSearch;
  }


  public InspectPodInfraConfig dnSServer(List<String> dnSServer) {
    this.dnSServer = dnSServer;
    return this;
  }

  public InspectPodInfraConfig addDnSServerItem(String dnSServerItem) {
    if (this.dnSServer == null) {
      this.dnSServer = new ArrayList<>();
    }
    this.dnSServer.add(dnSServerItem);
    return this;
  }

  /**
   * DNSServer is a set of DNS Servers that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod.
   * @return dnSServer
   */
  @jakarta.annotation.Nullable

  public List<String> getDnSServer() {
    return dnSServer;
  }

  public void setDnSServer(List<String> dnSServer) {
    this.dnSServer = dnSServer;
  }


  public InspectPodInfraConfig hostAdd(List<String> hostAdd) {
    this.hostAdd = hostAdd;
    return this;
  }

  public InspectPodInfraConfig addHostAddItem(String hostAddItem) {
    if (this.hostAdd == null) {
      this.hostAdd = new ArrayList<>();
    }
    this.hostAdd.add(hostAddItem);
    return this;
  }

  /**
   * HostAdd adds a number of hosts to the infra container&#39;s resolv.conf which will be shared with the rest of the pod.
   * @return hostAdd
   */
  @jakarta.annotation.Nullable

  public List<String> getHostAdd() {
    return hostAdd;
  }

  public void setHostAdd(List<String> hostAdd) {
    this.hostAdd = hostAdd;
  }


  public InspectPodInfraConfig hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

  /**
   * HostNetwork is whether the infra container (and thus the whole pod) will use the host&#39;s network and not create a network namespace.
   * @return hostNetwork
   */
  @jakarta.annotation.Nullable

  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }


  public InspectPodInfraConfig hostsFile(String hostsFile) {
    this.hostsFile = hostsFile;
    return this;
  }

  /**
   * HostsFile is the base file to create the &#x60;/etc/hosts&#x60; file inside the infra container which will be shared with the rest of the pod.
   * @return hostsFile
   */
  @jakarta.annotation.Nullable

  public String getHostsFile() {
    return hostsFile;
  }

  public void setHostsFile(String hostsFile) {
    this.hostsFile = hostsFile;
  }


  public InspectPodInfraConfig networkOptions(Map<String, List<String>> networkOptions) {
    this.networkOptions = networkOptions;
    return this;
  }

  public InspectPodInfraConfig putNetworkOptionsItem(String key, List<String> networkOptionsItem) {
    if (this.networkOptions == null) {
      this.networkOptions = new HashMap<>();
    }
    this.networkOptions.put(key, networkOptionsItem);
    return this;
  }

  /**
   * NetworkOptions are additional options for each network
   * @return networkOptions
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, List<String>> getNetworkOptions() {
    return networkOptions;
  }

  public void setNetworkOptions(Map<String, List<String>> networkOptions) {
    this.networkOptions = networkOptions;
  }


  public InspectPodInfraConfig networks(List<String> networks) {
    this.networks = networks;
    return this;
  }

  public InspectPodInfraConfig addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

  /**
   * Networks is a list of networks the pod will join.
   * @return networks
   */
  @jakarta.annotation.Nullable

  public List<String> getNetworks() {
    return networks;
  }

  public void setNetworks(List<String> networks) {
    this.networks = networks;
  }


  public InspectPodInfraConfig noManageHostname(Boolean noManageHostname) {
    this.noManageHostname = noManageHostname;
    return this;
  }

  /**
   * NoManageHostname indicates that the pod will not manage /etc/hostname and instead each container will handle their own.
   * @return noManageHostname
   */
  @jakarta.annotation.Nullable

  public Boolean getNoManageHostname() {
    return noManageHostname;
  }

  public void setNoManageHostname(Boolean noManageHostname) {
    this.noManageHostname = noManageHostname;
  }


  public InspectPodInfraConfig noManageHosts(Boolean noManageHosts) {
    this.noManageHosts = noManageHosts;
    return this;
  }

  /**
   * NoManageHosts indicates that the pod will not manage /etc/hosts and instead each container will handle their own.
   * @return noManageHosts
   */
  @jakarta.annotation.Nullable

  public Boolean getNoManageHosts() {
    return noManageHosts;
  }

  public void setNoManageHosts(Boolean noManageHosts) {
    this.noManageHosts = noManageHosts;
  }


  public InspectPodInfraConfig noManageResolvConf(Boolean noManageResolvConf) {
    this.noManageResolvConf = noManageResolvConf;
    return this;
  }

  /**
   * NoManageResolvConf indicates that the pod will not manage resolv.conf and instead each container will handle their own.
   * @return noManageResolvConf
   */
  @jakarta.annotation.Nullable

  public Boolean getNoManageResolvConf() {
    return noManageResolvConf;
  }

  public void setNoManageResolvConf(Boolean noManageResolvConf) {
    this.noManageResolvConf = noManageResolvConf;
  }


  public InspectPodInfraConfig portBindings(Map<String, List<@Valid InspectHostPort>> portBindings) {
    this.portBindings = portBindings;
    return this;
  }

  public InspectPodInfraConfig putPortBindingsItem(String key, List<@Valid InspectHostPort> portBindingsItem) {
    if (this.portBindings == null) {
      this.portBindings = new HashMap<>();
    }
    this.portBindings.put(key, portBindingsItem);
    return this;
  }

  /**
   * PortBindings are ports that will be forwarded to the infra container and then shared with the pod.
   * @return portBindings
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, List<@Valid InspectHostPort>> getPortBindings() {
    return portBindings;
  }

  public void setPortBindings(Map<String, List<@Valid InspectHostPort>> portBindings) {
    this.portBindings = portBindings;
  }


  public InspectPodInfraConfig staticIP(String staticIP) {
    this.staticIP = staticIP;
    return this;
  }

  /**
   * StaticIP is a static IPv4 that will be assigned to the infra container and then used by the pod.
   * @return staticIP
   */
  @jakarta.annotation.Nullable

  public String getStaticIP() {
    return staticIP;
  }

  public void setStaticIP(String staticIP) {
    this.staticIP = staticIP;
  }


  public InspectPodInfraConfig staticMAC(String staticMAC) {
    this.staticMAC = staticMAC;
    return this;
  }

  /**
   * StaticMAC is a static MAC address that will be assigned to the infra container and then used by the pod.
   * @return staticMAC
   */
  @jakarta.annotation.Nullable

  public String getStaticMAC() {
    return staticMAC;
  }

  public void setStaticMAC(String staticMAC) {
    this.staticMAC = staticMAC;
  }


  public InspectPodInfraConfig cpuPeriod(Integer cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
    return this;
  }

  /**
   * CPUPeriod contains the CPU period of the pod
   * @return cpuPeriod
   */
  @jakarta.annotation.Nullable

  public Integer getCpuPeriod() {
    return cpuPeriod;
  }

  public void setCpuPeriod(Integer cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
  }


  public InspectPodInfraConfig cpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
    return this;
  }

  /**
   * CPUQuota contains the CPU quota of the pod
   * @return cpuQuota
   */
  @jakarta.annotation.Nullable

  public Long getCpuQuota() {
    return cpuQuota;
  }

  public void setCpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
  }


  public InspectPodInfraConfig cpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
    return this;
  }

  /**
   * CPUSetCPUs contains linux specific CPU data for the container
   * @return cpusetCpus
   */
  @jakarta.annotation.Nullable

  public String getCpusetCpus() {
    return cpusetCpus;
  }

  public void setCpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
  }


  public InspectPodInfraConfig pidNs(String pidNs) {
    this.pidNs = pidNs;
    return this;
  }

  /**
   * Pid is the PID namespace mode of the pod&#39;s infra container
   * @return pidNs
   */
  @jakarta.annotation.Nullable

  public String getPidNs() {
    return pidNs;
  }

  public void setPidNs(String pidNs) {
    this.pidNs = pidNs;
  }


  public InspectPodInfraConfig userns(String userns) {
    this.userns = userns;
    return this;
  }

  /**
   * UserNS is the usernamespace that all the containers in the pod will join.
   * @return userns
   */
  @jakarta.annotation.Nullable

  public String getUserns() {
    return userns;
  }

  public void setUserns(String userns) {
    this.userns = userns;
  }


  public InspectPodInfraConfig utsNs(String utsNs) {
    this.utsNs = utsNs;
    return this;
  }

  /**
   * UtsNS is the uts namespace that all containers in the pod will join
   * @return utsNs
   */
  @jakarta.annotation.Nullable

  public String getUtsNs() {
    return utsNs;
  }

  public void setUtsNs(String utsNs) {
    this.utsNs = utsNs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectPodInfraConfig inspectPodInfraConfig = (InspectPodInfraConfig) o;
    return Objects.equals(this.dnSOption, inspectPodInfraConfig.dnSOption) &&
        Objects.equals(this.dnSSearch, inspectPodInfraConfig.dnSSearch) &&
        Objects.equals(this.dnSServer, inspectPodInfraConfig.dnSServer) &&
        Objects.equals(this.hostAdd, inspectPodInfraConfig.hostAdd) &&
        Objects.equals(this.hostNetwork, inspectPodInfraConfig.hostNetwork) &&
        Objects.equals(this.hostsFile, inspectPodInfraConfig.hostsFile) &&
        Objects.equals(this.networkOptions, inspectPodInfraConfig.networkOptions) &&
        Objects.equals(this.networks, inspectPodInfraConfig.networks) &&
        Objects.equals(this.noManageHostname, inspectPodInfraConfig.noManageHostname) &&
        Objects.equals(this.noManageHosts, inspectPodInfraConfig.noManageHosts) &&
        Objects.equals(this.noManageResolvConf, inspectPodInfraConfig.noManageResolvConf) &&
        Objects.equals(this.portBindings, inspectPodInfraConfig.portBindings) &&
        Objects.equals(this.staticIP, inspectPodInfraConfig.staticIP) &&
        Objects.equals(this.staticMAC, inspectPodInfraConfig.staticMAC) &&
        Objects.equals(this.cpuPeriod, inspectPodInfraConfig.cpuPeriod) &&
        Objects.equals(this.cpuQuota, inspectPodInfraConfig.cpuQuota) &&
        Objects.equals(this.cpusetCpus, inspectPodInfraConfig.cpusetCpus) &&
        Objects.equals(this.pidNs, inspectPodInfraConfig.pidNs) &&
        Objects.equals(this.userns, inspectPodInfraConfig.userns) &&
        Objects.equals(this.utsNs, inspectPodInfraConfig.utsNs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnSOption, dnSSearch, dnSServer, hostAdd, hostNetwork, hostsFile, networkOptions, networks, noManageHostname, noManageHosts, noManageResolvConf, portBindings, staticIP, staticMAC, cpuPeriod, cpuQuota, cpusetCpus, pidNs, userns, utsNs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectPodInfraConfig {\n");
    sb.append("    dnSOption: ").append(toIndentedString(dnSOption)).append("\n");
    sb.append("    dnSSearch: ").append(toIndentedString(dnSSearch)).append("\n");
    sb.append("    dnSServer: ").append(toIndentedString(dnSServer)).append("\n");
    sb.append("    hostAdd: ").append(toIndentedString(hostAdd)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostsFile: ").append(toIndentedString(hostsFile)).append("\n");
    sb.append("    networkOptions: ").append(toIndentedString(networkOptions)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    noManageHostname: ").append(toIndentedString(noManageHostname)).append("\n");
    sb.append("    noManageHosts: ").append(toIndentedString(noManageHosts)).append("\n");
    sb.append("    noManageResolvConf: ").append(toIndentedString(noManageResolvConf)).append("\n");
    sb.append("    portBindings: ").append(toIndentedString(portBindings)).append("\n");
    sb.append("    staticIP: ").append(toIndentedString(staticIP)).append("\n");
    sb.append("    staticMAC: ").append(toIndentedString(staticMAC)).append("\n");
    sb.append("    cpuPeriod: ").append(toIndentedString(cpuPeriod)).append("\n");
    sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
    sb.append("    cpusetCpus: ").append(toIndentedString(cpusetCpus)).append("\n");
    sb.append("    pidNs: ").append(toIndentedString(pidNs)).append("\n");
    sb.append("    userns: ").append(toIndentedString(userns)).append("\n");
    sb.append("    utsNs: ").append(toIndentedString(utsNs)).append("\n");
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
    openapiFields.add("DNSOption");
    openapiFields.add("DNSSearch");
    openapiFields.add("DNSServer");
    openapiFields.add("HostAdd");
    openapiFields.add("HostNetwork");
    openapiFields.add("HostsFile");
    openapiFields.add("NetworkOptions");
    openapiFields.add("Networks");
    openapiFields.add("NoManageHostname");
    openapiFields.add("NoManageHosts");
    openapiFields.add("NoManageResolvConf");
    openapiFields.add("PortBindings");
    openapiFields.add("StaticIP");
    openapiFields.add("StaticMAC");
    openapiFields.add("cpu_period");
    openapiFields.add("cpu_quota");
    openapiFields.add("cpuset_cpus");
    openapiFields.add("pid_ns");
    openapiFields.add("userns");
    openapiFields.add("uts_ns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectPodInfraConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectPodInfraConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectPodInfraConfig is not found in the empty JSON string", InspectPodInfraConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectPodInfraConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectPodInfraConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("DNSOption") != null && !jsonObj.get("DNSOption").isJsonNull() && !jsonObj.get("DNSOption").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DNSOption` to be an array in the JSON string but got `%s`", jsonObj.get("DNSOption").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("DNSSearch") != null && !jsonObj.get("DNSSearch").isJsonNull() && !jsonObj.get("DNSSearch").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DNSSearch` to be an array in the JSON string but got `%s`", jsonObj.get("DNSSearch").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("DNSServer") != null && !jsonObj.get("DNSServer").isJsonNull() && !jsonObj.get("DNSServer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DNSServer` to be an array in the JSON string but got `%s`", jsonObj.get("DNSServer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("HostAdd") != null && !jsonObj.get("HostAdd").isJsonNull() && !jsonObj.get("HostAdd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostAdd` to be an array in the JSON string but got `%s`", jsonObj.get("HostAdd").toString()));
      }
      if ((jsonObj.get("HostsFile") != null && !jsonObj.get("HostsFile").isJsonNull()) && !jsonObj.get("HostsFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostsFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostsFile").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Networks") != null && !jsonObj.get("Networks").isJsonNull() && !jsonObj.get("Networks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Networks` to be an array in the JSON string but got `%s`", jsonObj.get("Networks").toString()));
      }
      if ((jsonObj.get("StaticIP") != null && !jsonObj.get("StaticIP").isJsonNull()) && !jsonObj.get("StaticIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StaticIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StaticIP").toString()));
      }
      if ((jsonObj.get("StaticMAC") != null && !jsonObj.get("StaticMAC").isJsonNull()) && !jsonObj.get("StaticMAC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StaticMAC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StaticMAC").toString()));
      }
      if ((jsonObj.get("cpuset_cpus") != null && !jsonObj.get("cpuset_cpus").isJsonNull()) && !jsonObj.get("cpuset_cpus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpuset_cpus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpuset_cpus").toString()));
      }
      if ((jsonObj.get("pid_ns") != null && !jsonObj.get("pid_ns").isJsonNull()) && !jsonObj.get("pid_ns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid_ns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid_ns").toString()));
      }
      if ((jsonObj.get("userns") != null && !jsonObj.get("userns").isJsonNull()) && !jsonObj.get("userns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userns").toString()));
      }
      if ((jsonObj.get("uts_ns") != null && !jsonObj.get("uts_ns").isJsonNull()) && !jsonObj.get("uts_ns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uts_ns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uts_ns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectPodInfraConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectPodInfraConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectPodInfraConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectPodInfraConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectPodInfraConfig>() {
           @Override
           public void write(JsonWriter out, InspectPodInfraConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectPodInfraConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectPodInfraConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectPodInfraConfig
   * @throws IOException if the JSON string is invalid with respect to InspectPodInfraConfig
   */
  public static InspectPodInfraConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectPodInfraConfig.class);
  }

  /**
   * Convert an instance of InspectPodInfraConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

