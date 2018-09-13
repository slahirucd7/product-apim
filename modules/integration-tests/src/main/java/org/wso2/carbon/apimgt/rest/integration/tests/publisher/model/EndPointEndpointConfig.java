/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.EndPointEndpointConfigCircuitBreaker;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.EndpointConfig;

/**
 * EndPointEndpointConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class EndPointEndpointConfig {
  /**
   * Gets or Sets endpointType
   */
  public enum EndpointTypeEnum {
    SINGLE("SINGLE"),
    
    LOAD_BALANCED("LOAD_BALANCED"),
    
    FAIL_OVER("FAIL_OVER");

    private String value;

    EndpointTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndpointTypeEnum fromValue(String text) {
      for (EndpointTypeEnum b : EndpointTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("endpointType")
  private EndpointTypeEnum endpointType = null;

  @JsonProperty("list")
  private List<EndpointConfig> list = null;

  @JsonProperty("circuitBreaker")
  private EndPointEndpointConfigCircuitBreaker circuitBreaker = null;

  public EndPointEndpointConfig endpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @ApiModelProperty(example = "FAIL_OVER", value = "")
  public EndpointTypeEnum getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
  }

  public EndPointEndpointConfig list(List<EndpointConfig> list) {
    this.list = list;
    return this;
  }

  public EndPointEndpointConfig addListItem(EndpointConfig listItem) {
    if (this.list == null) {
      this.list = new ArrayList<EndpointConfig>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<EndpointConfig> getList() {
    return list;
  }

  public void setList(List<EndpointConfig> list) {
    this.list = list;
  }

  public EndPointEndpointConfig circuitBreaker(EndPointEndpointConfigCircuitBreaker circuitBreaker) {
    this.circuitBreaker = circuitBreaker;
    return this;
  }

   /**
   * Get circuitBreaker
   * @return circuitBreaker
  **/
  @ApiModelProperty(value = "")
  public EndPointEndpointConfigCircuitBreaker getCircuitBreaker() {
    return circuitBreaker;
  }

  public void setCircuitBreaker(EndPointEndpointConfigCircuitBreaker circuitBreaker) {
    this.circuitBreaker = circuitBreaker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPointEndpointConfig endPointEndpointConfig = (EndPointEndpointConfig) o;
    return Objects.equals(this.endpointType, endPointEndpointConfig.endpointType) &&
        Objects.equals(this.list, endPointEndpointConfig.list) &&
        Objects.equals(this.circuitBreaker, endPointEndpointConfig.circuitBreaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, list, circuitBreaker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPointEndpointConfig {\n");
    
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    circuitBreaker: ").append(toIndentedString(circuitBreaker)).append("\n");
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

