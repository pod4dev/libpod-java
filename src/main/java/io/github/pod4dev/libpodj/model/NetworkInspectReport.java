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
import io.github.pod4dev.libpodj.model.NetworkContainerInfo;
import io.github.pod4dev.libpodj.model.Route;
import io.github.pod4dev.libpodj.model.Subnet;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * NetworkInspectReport
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class NetworkInspectReport implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, NetworkContainerInfo> containers = new HashMap<>();

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DNS_ENABLED = "dns_enabled";
  @SerializedName(SERIALIZED_NAME_DNS_ENABLED)
  private Boolean dnsEnabled;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IPAM_OPTIONS = "ipam_options";
  @SerializedName(SERIALIZED_NAME_IPAM_OPTIONS)
  private Map<String, String> ipamOptions = new HashMap<>();

  public static final String SERIALIZED_NAME_IPV6_ENABLED = "ipv6_enabled";
  @SerializedName(SERIALIZED_NAME_IPV6_ENABLED)
  private Boolean ipv6Enabled;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_DNS_SERVERS = "network_dns_servers";
  @SerializedName(SERIALIZED_NAME_NETWORK_DNS_SERVERS)
  private List<String> networkDnsServers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK_INTERFACE = "network_interface";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACE)
  private String networkInterface;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<@Valid Route> routes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBNETS = "subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List<@Valid Subnet> subnets = new ArrayList<>();

  public NetworkInspectReport() {
  }

  public NetworkInspectReport containers(Map<String, NetworkContainerInfo> containers) {
    this.containers = containers;
    return this;
  }

  public NetworkInspectReport putContainersItem(String key, NetworkContainerInfo containersItem) {
    if (this.containers == null) {
      this.containers = new HashMap<>();
    }
    this.containers.put(key, containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, NetworkContainerInfo> getContainers() {
    return containers;
  }

  public void setContainers(Map<String, NetworkContainerInfo> containers) {
    this.containers = containers;
  }


  public NetworkInspectReport created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Created contains the timestamp when this network was created.
   * @return created
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public NetworkInspectReport dnsEnabled(Boolean dnsEnabled) {
    this.dnsEnabled = dnsEnabled;
    return this;
  }

  /**
   * DNSEnabled is whether name resolution is active for container on this Network. Only supported with the bridge driver.
   * @return dnsEnabled
   */
  @jakarta.annotation.Nullable

  public Boolean getDnsEnabled() {
    return dnsEnabled;
  }

  public void setDnsEnabled(Boolean dnsEnabled) {
    this.dnsEnabled = dnsEnabled;
  }


  public NetworkInspectReport driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver for this Network, e.g. bridge, macvlan...
   * @return driver
   */
  @jakarta.annotation.Nullable

  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public NetworkInspectReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the Network.
   * @return id
   */
  @jakarta.annotation.Nullable

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public NetworkInspectReport internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Internal is whether the Network should not have external routes to public or other Networks.
   * @return internal
   */
  @jakarta.annotation.Nullable

  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public NetworkInspectReport ipamOptions(Map<String, String> ipamOptions) {
    this.ipamOptions = ipamOptions;
    return this;
  }

  public NetworkInspectReport putIpamOptionsItem(String key, String ipamOptionsItem) {
    if (this.ipamOptions == null) {
      this.ipamOptions = new HashMap<>();
    }
    this.ipamOptions.put(key, ipamOptionsItem);
    return this;
  }

  /**
   * IPAMOptions contains options used for the ip assignment.
   * @return ipamOptions
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getIpamOptions() {
    return ipamOptions;
  }

  public void setIpamOptions(Map<String, String> ipamOptions) {
    this.ipamOptions = ipamOptions;
  }


  public NetworkInspectReport ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

  /**
   * IPv6Enabled if set to true an ipv6 subnet should be created for this net.
   * @return ipv6Enabled
   */
  @jakarta.annotation.Nullable

  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }


  public NetworkInspectReport labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NetworkInspectReport putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels is a set of key-value labels that have been applied to the Network.
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public NetworkInspectReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Network.
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public NetworkInspectReport networkDnsServers(List<String> networkDnsServers) {
    this.networkDnsServers = networkDnsServers;
    return this;
  }

  public NetworkInspectReport addNetworkDnsServersItem(String networkDnsServersItem) {
    if (this.networkDnsServers == null) {
      this.networkDnsServers = new ArrayList<>();
    }
    this.networkDnsServers.add(networkDnsServersItem);
    return this;
  }

  /**
   * List of custom DNS server for podman&#39;s DNS resolver at network level, all the containers attached to this network will consider resolvers configured at network level.
   * @return networkDnsServers
   */
  @jakarta.annotation.Nullable

  public List<String> getNetworkDnsServers() {
    return networkDnsServers;
  }

  public void setNetworkDnsServers(List<String> networkDnsServers) {
    this.networkDnsServers = networkDnsServers;
  }


  public NetworkInspectReport networkInterface(String networkInterface) {
    this.networkInterface = networkInterface;
    return this;
  }

  /**
   * NetworkInterface is the network interface name on the host.
   * @return networkInterface
   */
  @jakarta.annotation.Nullable

  public String getNetworkInterface() {
    return networkInterface;
  }

  public void setNetworkInterface(String networkInterface) {
    this.networkInterface = networkInterface;
  }


  public NetworkInspectReport options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public NetworkInspectReport putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Options is a set of key-value options that have been applied to the Network.
   * @return options
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public NetworkInspectReport routes(List<@Valid Route> routes) {
    this.routes = routes;
    return this;
  }

  public NetworkInspectReport addRoutesItem(Route routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Routes to use for this network.
   * @return routes
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Route> getRoutes() {
    return routes;
  }

  public void setRoutes(List<@Valid Route> routes) {
    this.routes = routes;
  }


  public NetworkInspectReport subnets(List<@Valid Subnet> subnets) {
    this.subnets = subnets;
    return this;
  }

  public NetworkInspectReport addSubnetsItem(Subnet subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

  /**
   * Subnets to use for this network.
   * @return subnets
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Subnet> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<@Valid Subnet> subnets) {
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
    NetworkInspectReport networkInspectReport = (NetworkInspectReport) o;
    return Objects.equals(this.containers, networkInspectReport.containers) &&
        Objects.equals(this.created, networkInspectReport.created) &&
        Objects.equals(this.dnsEnabled, networkInspectReport.dnsEnabled) &&
        Objects.equals(this.driver, networkInspectReport.driver) &&
        Objects.equals(this.id, networkInspectReport.id) &&
        Objects.equals(this.internal, networkInspectReport.internal) &&
        Objects.equals(this.ipamOptions, networkInspectReport.ipamOptions) &&
        Objects.equals(this.ipv6Enabled, networkInspectReport.ipv6Enabled) &&
        Objects.equals(this.labels, networkInspectReport.labels) &&
        Objects.equals(this.name, networkInspectReport.name) &&
        Objects.equals(this.networkDnsServers, networkInspectReport.networkDnsServers) &&
        Objects.equals(this.networkInterface, networkInspectReport.networkInterface) &&
        Objects.equals(this.options, networkInspectReport.options) &&
        Objects.equals(this.routes, networkInspectReport.routes) &&
        Objects.equals(this.subnets, networkInspectReport.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, dnsEnabled, driver, id, internal, ipamOptions, ipv6Enabled, labels, name, networkDnsServers, networkInterface, options, routes, subnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInspectReport {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dnsEnabled: ").append(toIndentedString(dnsEnabled)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ipamOptions: ").append(toIndentedString(ipamOptions)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkDnsServers: ").append(toIndentedString(networkDnsServers)).append("\n");
    sb.append("    networkInterface: ").append(toIndentedString(networkInterface)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
    openapiFields.add("containers");
    openapiFields.add("created");
    openapiFields.add("dns_enabled");
    openapiFields.add("driver");
    openapiFields.add("id");
    openapiFields.add("internal");
    openapiFields.add("ipam_options");
    openapiFields.add("ipv6_enabled");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("network_dns_servers");
    openapiFields.add("network_interface");
    openapiFields.add("options");
    openapiFields.add("routes");
    openapiFields.add("subnets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetworkInspectReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkInspectReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkInspectReport is not found in the empty JSON string", NetworkInspectReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkInspectReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkInspectReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("driver") != null && !jsonObj.get("driver").isJsonNull()) && !jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("network_dns_servers") != null && !jsonObj.get("network_dns_servers").isJsonNull() && !jsonObj.get("network_dns_servers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_dns_servers` to be an array in the JSON string but got `%s`", jsonObj.get("network_dns_servers").toString()));
      }
      if ((jsonObj.get("network_interface") != null && !jsonObj.get("network_interface").isJsonNull()) && !jsonObj.get("network_interface").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_interface` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network_interface").toString()));
      }
      if (jsonObj.get("routes") != null && !jsonObj.get("routes").isJsonNull()) {
        JsonArray jsonArrayroutes = jsonObj.getAsJsonArray("routes");
        if (jsonArrayroutes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routes` to be an array in the JSON string but got `%s`", jsonObj.get("routes").toString()));
          }

          // validate the optional field `routes` (array)
          for (int i = 0; i < jsonArrayroutes.size(); i++) {
            Route.validateJsonElement(jsonArrayroutes.get(i));
          };
        }
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
            Subnet.validateJsonElement(jsonArraysubnets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkInspectReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkInspectReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkInspectReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkInspectReport.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkInspectReport>() {
           @Override
           public void write(JsonWriter out, NetworkInspectReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkInspectReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetworkInspectReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkInspectReport
   * @throws IOException if the JSON string is invalid with respect to NetworkInspectReport
   */
  public static NetworkInspectReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkInspectReport.class);
  }

  /**
   * Convert an instance of NetworkInspectReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

