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
 * LifecycleStateAvailableTransitionBeanList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class LifecycleStateAvailableTransitionBeanList {
  @JsonProperty("event")
  private String event = null;

  @JsonProperty("targetState")
  private String targetState = null;

  public LifecycleStateAvailableTransitionBeanList event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(example = "Promote", value = "")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public LifecycleStateAvailableTransitionBeanList targetState(String targetState) {
    this.targetState = targetState;
    return this;
  }

   /**
   * Get targetState
   * @return targetState
  **/
  @ApiModelProperty(example = "Created", value = "")
  public String getTargetState() {
    return targetState;
  }

  public void setTargetState(String targetState) {
    this.targetState = targetState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleStateAvailableTransitionBeanList lifecycleStateAvailableTransitionBeanList = (LifecycleStateAvailableTransitionBeanList) o;
    return Objects.equals(this.event, lifecycleStateAvailableTransitionBeanList.event) &&
        Objects.equals(this.targetState, lifecycleStateAvailableTransitionBeanList.targetState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, targetState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleStateAvailableTransitionBeanList {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
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

