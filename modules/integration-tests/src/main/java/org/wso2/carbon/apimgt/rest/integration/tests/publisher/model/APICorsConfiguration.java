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

/**
 * CORS configuration for the API 
 */
@ApiModel(description = "CORS configuration for the API ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class APICorsConfiguration {
  @JsonProperty("corsConfigurationEnabled")
  private Boolean corsConfigurationEnabled = false;

  @JsonProperty("accessControlAllowOrigins")
  private List<String> accessControlAllowOrigins = null;

  @JsonProperty("accessControlAllowCredentials")
  private Boolean accessControlAllowCredentials = false;

  @JsonProperty("accessControlAllowHeaders")
  private List<String> accessControlAllowHeaders = null;

  @JsonProperty("accessControlAllowMethods")
  private List<String> accessControlAllowMethods = null;

  public APICorsConfiguration corsConfigurationEnabled(Boolean corsConfigurationEnabled) {
    this.corsConfigurationEnabled = corsConfigurationEnabled;
    return this;
  }

   /**
   * Get corsConfigurationEnabled
   * @return corsConfigurationEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getCorsConfigurationEnabled() {
    return corsConfigurationEnabled;
  }

  public void setCorsConfigurationEnabled(Boolean corsConfigurationEnabled) {
    this.corsConfigurationEnabled = corsConfigurationEnabled;
  }

  public APICorsConfiguration accessControlAllowOrigins(List<String> accessControlAllowOrigins) {
    this.accessControlAllowOrigins = accessControlAllowOrigins;
    return this;
  }

  public APICorsConfiguration addAccessControlAllowOriginsItem(String accessControlAllowOriginsItem) {
    if (this.accessControlAllowOrigins == null) {
      this.accessControlAllowOrigins = new ArrayList<String>();
    }
    this.accessControlAllowOrigins.add(accessControlAllowOriginsItem);
    return this;
  }

   /**
   * Get accessControlAllowOrigins
   * @return accessControlAllowOrigins
  **/
  @ApiModelProperty(value = "")
  public List<String> getAccessControlAllowOrigins() {
    return accessControlAllowOrigins;
  }

  public void setAccessControlAllowOrigins(List<String> accessControlAllowOrigins) {
    this.accessControlAllowOrigins = accessControlAllowOrigins;
  }

  public APICorsConfiguration accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
    this.accessControlAllowCredentials = accessControlAllowCredentials;
    return this;
  }

   /**
   * Get accessControlAllowCredentials
   * @return accessControlAllowCredentials
  **/
  @ApiModelProperty(value = "")
  public Boolean getAccessControlAllowCredentials() {
    return accessControlAllowCredentials;
  }

  public void setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
    this.accessControlAllowCredentials = accessControlAllowCredentials;
  }

  public APICorsConfiguration accessControlAllowHeaders(List<String> accessControlAllowHeaders) {
    this.accessControlAllowHeaders = accessControlAllowHeaders;
    return this;
  }

  public APICorsConfiguration addAccessControlAllowHeadersItem(String accessControlAllowHeadersItem) {
    if (this.accessControlAllowHeaders == null) {
      this.accessControlAllowHeaders = new ArrayList<String>();
    }
    this.accessControlAllowHeaders.add(accessControlAllowHeadersItem);
    return this;
  }

   /**
   * Get accessControlAllowHeaders
   * @return accessControlAllowHeaders
  **/
  @ApiModelProperty(value = "")
  public List<String> getAccessControlAllowHeaders() {
    return accessControlAllowHeaders;
  }

  public void setAccessControlAllowHeaders(List<String> accessControlAllowHeaders) {
    this.accessControlAllowHeaders = accessControlAllowHeaders;
  }

  public APICorsConfiguration accessControlAllowMethods(List<String> accessControlAllowMethods) {
    this.accessControlAllowMethods = accessControlAllowMethods;
    return this;
  }

  public APICorsConfiguration addAccessControlAllowMethodsItem(String accessControlAllowMethodsItem) {
    if (this.accessControlAllowMethods == null) {
      this.accessControlAllowMethods = new ArrayList<String>();
    }
    this.accessControlAllowMethods.add(accessControlAllowMethodsItem);
    return this;
  }

   /**
   * Get accessControlAllowMethods
   * @return accessControlAllowMethods
  **/
  @ApiModelProperty(value = "")
  public List<String> getAccessControlAllowMethods() {
    return accessControlAllowMethods;
  }

  public void setAccessControlAllowMethods(List<String> accessControlAllowMethods) {
    this.accessControlAllowMethods = accessControlAllowMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICorsConfiguration apICorsConfiguration = (APICorsConfiguration) o;
    return Objects.equals(this.corsConfigurationEnabled, apICorsConfiguration.corsConfigurationEnabled) &&
        Objects.equals(this.accessControlAllowOrigins, apICorsConfiguration.accessControlAllowOrigins) &&
        Objects.equals(this.accessControlAllowCredentials, apICorsConfiguration.accessControlAllowCredentials) &&
        Objects.equals(this.accessControlAllowHeaders, apICorsConfiguration.accessControlAllowHeaders) &&
        Objects.equals(this.accessControlAllowMethods, apICorsConfiguration.accessControlAllowMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsConfigurationEnabled, accessControlAllowOrigins, accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICorsConfiguration {\n");
    
    sb.append("    corsConfigurationEnabled: ").append(toIndentedString(corsConfigurationEnabled)).append("\n");
    sb.append("    accessControlAllowOrigins: ").append(toIndentedString(accessControlAllowOrigins)).append("\n");
    sb.append("    accessControlAllowCredentials: ").append(toIndentedString(accessControlAllowCredentials)).append("\n");
    sb.append("    accessControlAllowHeaders: ").append(toIndentedString(accessControlAllowHeaders)).append("\n");
    sb.append("    accessControlAllowMethods: ").append(toIndentedString(accessControlAllowMethods)).append("\n");
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

