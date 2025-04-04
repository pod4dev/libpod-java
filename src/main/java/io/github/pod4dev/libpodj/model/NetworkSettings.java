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
import io.github.pod4dev.libpodj.model.Address;
import io.github.pod4dev.libpodj.model.EndpointSettings;
import io.github.pod4dev.libpodj.model.PortBinding;
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
 * NetworkSettings exposes the network settings in the api
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class NetworkSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRIDGE = "Bridge";
  @SerializedName(SERIALIZED_NAME_BRIDGE)
  private String bridge;

  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "EndpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_GATEWAY = "Gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS = "GlobalIPv6Address";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS)
  private String globalIPv6Address;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN = "GlobalIPv6PrefixLen";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN)
  private Long globalIPv6PrefixLen;

  public static final String SERIALIZED_NAME_HAIRPIN_MODE = "HairpinMode";
  @SerializedName(SERIALIZED_NAME_HAIRPIN_MODE)
  private Boolean hairpinMode;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IPAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_PREFIX_LEN = "IPPrefixLen";
  @SerializedName(SERIALIZED_NAME_IP_PREFIX_LEN)
  private Long ipPrefixLen;

  public static final String SERIALIZED_NAME_IPV6_GATEWAY = "IPv6Gateway";
  @SerializedName(SERIALIZED_NAME_IPV6_GATEWAY)
  private String ipv6Gateway;

  public static final String SERIALIZED_NAME_LINK_LOCAL_I_PV6_ADDRESS = "LinkLocalIPv6Address";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_I_PV6_ADDRESS)
  private String linkLocalIPv6Address;

  public static final String SERIALIZED_NAME_LINK_LOCAL_I_PV6_PREFIX_LEN = "LinkLocalIPv6PrefixLen";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_I_PV6_PREFIX_LEN)
  private Long linkLocalIPv6PrefixLen;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private Map<String, EndpointSettings> networks = new HashMap<>();

  public static final String SERIALIZED_NAME_PORTS = "Ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private Map<String, List<@Valid PortBinding>> ports = new HashMap<>();

  public static final String SERIALIZED_NAME_SANDBOX_I_D = "SandboxID";
  @SerializedName(SERIALIZED_NAME_SANDBOX_I_D)
  private String sandboxID;

  public static final String SERIALIZED_NAME_SANDBOX_KEY = "SandboxKey";
  @SerializedName(SERIALIZED_NAME_SANDBOX_KEY)
  private String sandboxKey;

  public static final String SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES = "SecondaryIPAddresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES)
  private List<@Valid Address> secondaryIPAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES = "SecondaryIPv6Addresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES)
  private List<@Valid Address> secondaryIPv6Addresses = new ArrayList<>();

  public NetworkSettings() {
  }

  public NetworkSettings bridge(String bridge) {
    this.bridge = bridge;
    return this;
  }

  /**
   * Get bridge
   * @return bridge
   */
  @jakarta.annotation.Nullable

  public String getBridge() {
    return bridge;
  }

  public void setBridge(String bridge) {
    this.bridge = bridge;
  }


  public NetworkSettings endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
   */
  @jakarta.annotation.Nullable

  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public NetworkSettings gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * @return gateway
   */
  @jakarta.annotation.Nullable

  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public NetworkSettings globalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * Get globalIPv6Address
   * @return globalIPv6Address
   */
  @jakarta.annotation.Nullable

  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }

  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }


  public NetworkSettings globalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * Get globalIPv6PrefixLen
   * @return globalIPv6PrefixLen
   */
  @jakarta.annotation.Nullable

  public Long getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }

  public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }


  public NetworkSettings hairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
    return this;
  }

  /**
   * HairpinMode specifies if hairpin NAT should be enabled on the virtual interface  Deprecated: This field is never set and will be removed in a future release.
   * @return hairpinMode
   */
  @jakarta.annotation.Nullable

  public Boolean getHairpinMode() {
    return hairpinMode;
  }

  public void setHairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
  }


  public NetworkSettings ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
   */
  @jakarta.annotation.Nullable

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public NetworkSettings ipPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * Get ipPrefixLen
   * @return ipPrefixLen
   */
  @jakarta.annotation.Nullable

  public Long getIpPrefixLen() {
    return ipPrefixLen;
  }

  public void setIpPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }


  public NetworkSettings ipv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * Get ipv6Gateway
   * @return ipv6Gateway
   */
  @jakarta.annotation.Nullable

  public String getIpv6Gateway() {
    return ipv6Gateway;
  }

  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }


  public NetworkSettings linkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
    return this;
  }

  /**
   * LinkLocalIPv6Address is an IPv6 unicast address using the link-local prefix  Deprecated: This field is never set and will be removed in a future release.
   * @return linkLocalIPv6Address
   */
  @jakarta.annotation.Nullable

  public String getLinkLocalIPv6Address() {
    return linkLocalIPv6Address;
  }

  public void setLinkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
  }


  public NetworkSettings linkLocalIPv6PrefixLen(Long linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
    return this;
  }

  /**
   * LinkLocalIPv6PrefixLen is the prefix length of an IPv6 unicast address  Deprecated: This field is never set and will be removed in a future release.
   * @return linkLocalIPv6PrefixLen
   */
  @jakarta.annotation.Nullable

  public Long getLinkLocalIPv6PrefixLen() {
    return linkLocalIPv6PrefixLen;
  }

  public void setLinkLocalIPv6PrefixLen(Long linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
  }


  public NetworkSettings macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Get macAddress
   * @return macAddress
   */
  @jakarta.annotation.Nullable

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public NetworkSettings networks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
    return this;
  }

  public NetworkSettings putNetworksItem(String key, EndpointSettings networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Get networks
   * @return networks
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, EndpointSettings> getNetworks() {
    return networks;
  }

  public void setNetworks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
  }


  public NetworkSettings ports(Map<String, List<@Valid PortBinding>> ports) {
    this.ports = ports;
    return this;
  }

  public NetworkSettings putPortsItem(String key, List<@Valid PortBinding> portsItem) {
    if (this.ports == null) {
      this.ports = new HashMap<>();
    }
    this.ports.put(key, portsItem);
    return this;
  }

  /**
   * PortMap is a collection of PortBinding indexed by Port
   * @return ports
   */
  @jakarta.annotation.Nullable
  @Valid

  public Map<String, List<@Valid PortBinding>> getPorts() {
    return ports;
  }

  public void setPorts(Map<String, List<@Valid PortBinding>> ports) {
    this.ports = ports;
  }


  public NetworkSettings sandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
    return this;
  }

  /**
   * Get sandboxID
   * @return sandboxID
   */
  @jakarta.annotation.Nullable

  public String getSandboxID() {
    return sandboxID;
  }

  public void setSandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
  }


  public NetworkSettings sandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
    return this;
  }

  /**
   * Get sandboxKey
   * @return sandboxKey
   */
  @jakarta.annotation.Nullable

  public String getSandboxKey() {
    return sandboxKey;
  }

  public void setSandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
  }


  public NetworkSettings secondaryIPAddresses(List<@Valid Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
    return this;
  }

  public NetworkSettings addSecondaryIPAddressesItem(Address secondaryIPAddressesItem) {
    if (this.secondaryIPAddresses == null) {
      this.secondaryIPAddresses = new ArrayList<>();
    }
    this.secondaryIPAddresses.add(secondaryIPAddressesItem);
    return this;
  }

  /**
   * Get secondaryIPAddresses
   * @return secondaryIPAddresses
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Address> getSecondaryIPAddresses() {
    return secondaryIPAddresses;
  }

  public void setSecondaryIPAddresses(List<@Valid Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
  }


  public NetworkSettings secondaryIPv6Addresses(List<@Valid Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
    return this;
  }

  public NetworkSettings addSecondaryIPv6AddressesItem(Address secondaryIPv6AddressesItem) {
    if (this.secondaryIPv6Addresses == null) {
      this.secondaryIPv6Addresses = new ArrayList<>();
    }
    this.secondaryIPv6Addresses.add(secondaryIPv6AddressesItem);
    return this;
  }

  /**
   * Get secondaryIPv6Addresses
   * @return secondaryIPv6Addresses
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Address> getSecondaryIPv6Addresses() {
    return secondaryIPv6Addresses;
  }

  public void setSecondaryIPv6Addresses(List<@Valid Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSettings networkSettings = (NetworkSettings) o;
    return Objects.equals(this.bridge, networkSettings.bridge) &&
        Objects.equals(this.endpointID, networkSettings.endpointID) &&
        Objects.equals(this.gateway, networkSettings.gateway) &&
        Objects.equals(this.globalIPv6Address, networkSettings.globalIPv6Address) &&
        Objects.equals(this.globalIPv6PrefixLen, networkSettings.globalIPv6PrefixLen) &&
        Objects.equals(this.hairpinMode, networkSettings.hairpinMode) &&
        Objects.equals(this.ipAddress, networkSettings.ipAddress) &&
        Objects.equals(this.ipPrefixLen, networkSettings.ipPrefixLen) &&
        Objects.equals(this.ipv6Gateway, networkSettings.ipv6Gateway) &&
        Objects.equals(this.linkLocalIPv6Address, networkSettings.linkLocalIPv6Address) &&
        Objects.equals(this.linkLocalIPv6PrefixLen, networkSettings.linkLocalIPv6PrefixLen) &&
        Objects.equals(this.macAddress, networkSettings.macAddress) &&
        Objects.equals(this.networks, networkSettings.networks) &&
        Objects.equals(this.ports, networkSettings.ports) &&
        Objects.equals(this.sandboxID, networkSettings.sandboxID) &&
        Objects.equals(this.sandboxKey, networkSettings.sandboxKey) &&
        Objects.equals(this.secondaryIPAddresses, networkSettings.secondaryIPAddresses) &&
        Objects.equals(this.secondaryIPv6Addresses, networkSettings.secondaryIPv6Addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge, endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, hairpinMode, ipAddress, ipPrefixLen, ipv6Gateway, linkLocalIPv6Address, linkLocalIPv6PrefixLen, macAddress, networks, ports, sandboxID, sandboxKey, secondaryIPAddresses, secondaryIPv6Addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSettings {\n");
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIPv6Address: ").append(toIndentedString(globalIPv6Address)).append("\n");
    sb.append("    globalIPv6PrefixLen: ").append(toIndentedString(globalIPv6PrefixLen)).append("\n");
    sb.append("    hairpinMode: ").append(toIndentedString(hairpinMode)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPrefixLen: ").append(toIndentedString(ipPrefixLen)).append("\n");
    sb.append("    ipv6Gateway: ").append(toIndentedString(ipv6Gateway)).append("\n");
    sb.append("    linkLocalIPv6Address: ").append(toIndentedString(linkLocalIPv6Address)).append("\n");
    sb.append("    linkLocalIPv6PrefixLen: ").append(toIndentedString(linkLocalIPv6PrefixLen)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    sandboxID: ").append(toIndentedString(sandboxID)).append("\n");
    sb.append("    sandboxKey: ").append(toIndentedString(sandboxKey)).append("\n");
    sb.append("    secondaryIPAddresses: ").append(toIndentedString(secondaryIPAddresses)).append("\n");
    sb.append("    secondaryIPv6Addresses: ").append(toIndentedString(secondaryIPv6Addresses)).append("\n");
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
    openapiFields.add("Bridge");
    openapiFields.add("EndpointID");
    openapiFields.add("Gateway");
    openapiFields.add("GlobalIPv6Address");
    openapiFields.add("GlobalIPv6PrefixLen");
    openapiFields.add("HairpinMode");
    openapiFields.add("IPAddress");
    openapiFields.add("IPPrefixLen");
    openapiFields.add("IPv6Gateway");
    openapiFields.add("LinkLocalIPv6Address");
    openapiFields.add("LinkLocalIPv6PrefixLen");
    openapiFields.add("MacAddress");
    openapiFields.add("Networks");
    openapiFields.add("Ports");
    openapiFields.add("SandboxID");
    openapiFields.add("SandboxKey");
    openapiFields.add("SecondaryIPAddresses");
    openapiFields.add("SecondaryIPv6Addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetworkSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkSettings is not found in the empty JSON string", NetworkSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Bridge") != null && !jsonObj.get("Bridge").isJsonNull()) && !jsonObj.get("Bridge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Bridge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Bridge").toString()));
      }
      if ((jsonObj.get("EndpointID") != null && !jsonObj.get("EndpointID").isJsonNull()) && !jsonObj.get("EndpointID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointID").toString()));
      }
      if ((jsonObj.get("Gateway") != null && !jsonObj.get("Gateway").isJsonNull()) && !jsonObj.get("Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Gateway").toString()));
      }
      if ((jsonObj.get("GlobalIPv6Address") != null && !jsonObj.get("GlobalIPv6Address").isJsonNull()) && !jsonObj.get("GlobalIPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalIPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalIPv6Address").toString()));
      }
      if ((jsonObj.get("IPAddress") != null && !jsonObj.get("IPAddress").isJsonNull()) && !jsonObj.get("IPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPAddress").toString()));
      }
      if ((jsonObj.get("IPv6Gateway") != null && !jsonObj.get("IPv6Gateway").isJsonNull()) && !jsonObj.get("IPv6Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Gateway").toString()));
      }
      if ((jsonObj.get("LinkLocalIPv6Address") != null && !jsonObj.get("LinkLocalIPv6Address").isJsonNull()) && !jsonObj.get("LinkLocalIPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkLocalIPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LinkLocalIPv6Address").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("SandboxID") != null && !jsonObj.get("SandboxID").isJsonNull()) && !jsonObj.get("SandboxID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SandboxID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SandboxID").toString()));
      }
      if ((jsonObj.get("SandboxKey") != null && !jsonObj.get("SandboxKey").isJsonNull()) && !jsonObj.get("SandboxKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SandboxKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SandboxKey").toString()));
      }
      if (jsonObj.get("SecondaryIPAddresses") != null && !jsonObj.get("SecondaryIPAddresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPAddresses = jsonObj.getAsJsonArray("SecondaryIPAddresses");
        if (jsonArraysecondaryIPAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPAddresses").toString()));
          }

          // validate the optional field `SecondaryIPAddresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPAddresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPAddresses.get(i));
          };
        }
      }
      if (jsonObj.get("SecondaryIPv6Addresses") != null && !jsonObj.get("SecondaryIPv6Addresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPv6Addresses = jsonObj.getAsJsonArray("SecondaryIPv6Addresses");
        if (jsonArraysecondaryIPv6Addresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPv6Addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPv6Addresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPv6Addresses").toString()));
          }

          // validate the optional field `SecondaryIPv6Addresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPv6Addresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPv6Addresses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkSettings>() {
           @Override
           public void write(JsonWriter out, NetworkSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetworkSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkSettings
   * @throws IOException if the JSON string is invalid with respect to NetworkSettings
   */
  public static NetworkSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkSettings.class);
  }

  /**
   * Convert an instance of NetworkSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

