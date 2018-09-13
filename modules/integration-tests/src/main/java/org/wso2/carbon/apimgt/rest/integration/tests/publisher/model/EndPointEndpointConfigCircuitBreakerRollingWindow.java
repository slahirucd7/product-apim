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

/**
 * EndPointEndpointConfigCircuitBreakerRollingWindow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class EndPointEndpointConfigCircuitBreakerRollingWindow {
  @JsonProperty("timeWindow")
  private Integer timeWindow = null;

  @JsonProperty("bucketSize")
  private Integer bucketSize = null;

  @JsonProperty("requestVolumeThreshold")
  private Integer requestVolumeThreshold = null;

  public EndPointEndpointConfigCircuitBreakerRollingWindow timeWindow(Integer timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

   /**
   * time window in milliseconds
   * @return timeWindow
  **/
  @ApiModelProperty(example = "1000", value = "time window in milliseconds")
  public Integer getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(Integer timeWindow) {
    this.timeWindow = timeWindow;
  }

  public EndPointEndpointConfigCircuitBreakerRollingWindow bucketSize(Integer bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

   /**
   * bucket size in milliseconds 
   * @return bucketSize
  **/
  @ApiModelProperty(example = "1000", value = "bucket size in milliseconds ")
  public Integer getBucketSize() {
    return bucketSize;
  }

  public void setBucketSize(Integer bucketSize) {
    this.bucketSize = bucketSize;
  }

  public EndPointEndpointConfigCircuitBreakerRollingWindow requestVolumeThreshold(Integer requestVolumeThreshold) {
    this.requestVolumeThreshold = requestVolumeThreshold;
    return this;
  }

   /**
   * Minimum number of requests in a rolling window that will trip the circuit. 
   * @return requestVolumeThreshold
  **/
  @ApiModelProperty(example = "2", value = "Minimum number of requests in a rolling window that will trip the circuit. ")
  public Integer getRequestVolumeThreshold() {
    return requestVolumeThreshold;
  }

  public void setRequestVolumeThreshold(Integer requestVolumeThreshold) {
    this.requestVolumeThreshold = requestVolumeThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPointEndpointConfigCircuitBreakerRollingWindow endPointEndpointConfigCircuitBreakerRollingWindow = (EndPointEndpointConfigCircuitBreakerRollingWindow) o;
    return Objects.equals(this.timeWindow, endPointEndpointConfigCircuitBreakerRollingWindow.timeWindow) &&
        Objects.equals(this.bucketSize, endPointEndpointConfigCircuitBreakerRollingWindow.bucketSize) &&
        Objects.equals(this.requestVolumeThreshold, endPointEndpointConfigCircuitBreakerRollingWindow.requestVolumeThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeWindow, bucketSize, requestVolumeThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPointEndpointConfigCircuitBreakerRollingWindow {\n");
    
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("    bucketSize: ").append(toIndentedString(bucketSize)).append("\n");
    sb.append("    requestVolumeThreshold: ").append(toIndentedString(requestVolumeThreshold)).append("\n");
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

