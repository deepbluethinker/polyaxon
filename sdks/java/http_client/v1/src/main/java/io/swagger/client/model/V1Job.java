// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1Environment;
import io.swagger.client.model.V1Init;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Job
 */

public class V1Job {
  @SerializedName("kind")
  private String kind = "job";

  @SerializedName("environment")
  private V1Environment environment = null;

  @SerializedName("connections")
  private List<String> connections = null;

  @SerializedName("volumes")
  private List<V1Volume> volumes = null;

  @SerializedName("init")
  private List<V1Init> init = null;

  @SerializedName("sidecars")
  private List<V1Container> sidecars = null;

  @SerializedName("container")
  private V1Container container = null;

  public V1Job kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Job environment(V1Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public V1Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(V1Environment environment) {
    this.environment = environment;
  }

  public V1Job connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public V1Job addConnectionsItem(String connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<String>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @ApiModelProperty(value = "")
  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }

  public V1Job volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public V1Job addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is a list of volumes that can be mounted.
   * @return volumes
  **/
  @ApiModelProperty(value = "Volumes is a list of volumes that can be mounted.")
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }

  public V1Job init(List<V1Init> init) {
    this.init = init;
    return this;
  }

  public V1Job addInitItem(V1Init initItem) {
    if (this.init == null) {
      this.init = new ArrayList<V1Init>();
    }
    this.init.add(initItem);
    return this;
  }

   /**
   * Get init
   * @return init
  **/
  @ApiModelProperty(value = "")
  public List<V1Init> getInit() {
    return init;
  }

  public void setInit(List<V1Init> init) {
    this.init = init;
  }

  public V1Job sidecars(List<V1Container> sidecars) {
    this.sidecars = sidecars;
    return this;
  }

  public V1Job addSidecarsItem(V1Container sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<V1Container>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * Get sidecars
   * @return sidecars
  **/
  @ApiModelProperty(value = "")
  public List<V1Container> getSidecars() {
    return sidecars;
  }

  public void setSidecars(List<V1Container> sidecars) {
    this.sidecars = sidecars;
  }

  public V1Job container(V1Container container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public V1Container getContainer() {
    return container;
  }

  public void setContainer(V1Container container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Job v1Job = (V1Job) o;
    return Objects.equals(this.kind, v1Job.kind) &&
        Objects.equals(this.environment, v1Job.environment) &&
        Objects.equals(this.connections, v1Job.connections) &&
        Objects.equals(this.volumes, v1Job.volumes) &&
        Objects.equals(this.init, v1Job.init) &&
        Objects.equals(this.sidecars, v1Job.sidecars) &&
        Objects.equals(this.container, v1Job.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, environment, connections, volumes, init, sidecars, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Job {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

