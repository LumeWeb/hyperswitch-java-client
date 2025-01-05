/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.RoutableConnectorChoice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorVolumeSplit
 */
@JsonPropertyOrder({
  ConnectorVolumeSplit.JSON_PROPERTY_CONNECTOR,
  ConnectorVolumeSplit.JSON_PROPERTY_SPLIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorVolumeSplit {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private RoutableConnectorChoice connector;

  public static final String JSON_PROPERTY_SPLIT = "split";
  private Integer split;

  public ConnectorVolumeSplit() { 
  }

  public ConnectorVolumeSplit connector(RoutableConnectorChoice connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoutableConnectorChoice getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(RoutableConnectorChoice connector) {
    this.connector = connector;
  }


  public ConnectorVolumeSplit split(Integer split) {
    
    this.split = split;
    return this;
  }

   /**
   * Get split
   * minimum: 0
   * @return split
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSplit() {
    return split;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSplit(Integer split) {
    this.split = split;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorVolumeSplit connectorVolumeSplit = (ConnectorVolumeSplit) o;
    return Objects.equals(this.connector, connectorVolumeSplit.connector) &&
        Objects.equals(this.split, connectorVolumeSplit.split);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, split);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorVolumeSplit {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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

}

