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


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GsmDeleteRequest
 */
@JsonPropertyOrder({
  GsmDeleteRequest.JSON_PROPERTY_CONNECTOR,
  GsmDeleteRequest.JSON_PROPERTY_FLOW,
  GsmDeleteRequest.JSON_PROPERTY_SUB_FLOW,
  GsmDeleteRequest.JSON_PROPERTY_CODE,
  GsmDeleteRequest.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GsmDeleteRequest {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_FLOW = "flow";
  private String flow;

  public static final String JSON_PROPERTY_SUB_FLOW = "sub_flow";
  private String subFlow;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public GsmDeleteRequest() {
  }

  public GsmDeleteRequest connector(String connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * The connector through which payment has gone through
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public GsmDeleteRequest flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * The flow in which the code and message occurred for a connector
   * @return flow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlow() {
    return flow;
  }


  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlow(String flow) {
    this.flow = flow;
  }


  public GsmDeleteRequest subFlow(String subFlow) {
    
    this.subFlow = subFlow;
    return this;
  }

   /**
   * The sub_flow in which the code and message occurred  for a connector
   * @return subFlow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubFlow() {
    return subFlow;
  }


  @JsonProperty(JSON_PROPERTY_SUB_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubFlow(String subFlow) {
    this.subFlow = subFlow;
  }


  public GsmDeleteRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * code received from the connector
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public GsmDeleteRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message received from the connector
   * @return message
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GsmDeleteRequest gsmDeleteRequest = (GsmDeleteRequest) o;
    return Objects.equals(this.connector, gsmDeleteRequest.connector) &&
        Objects.equals(this.flow, gsmDeleteRequest.flow) &&
        Objects.equals(this.subFlow, gsmDeleteRequest.subFlow) &&
        Objects.equals(this.code, gsmDeleteRequest.code) &&
        Objects.equals(this.message, gsmDeleteRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, flow, subFlow, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GsmDeleteRequest {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    subFlow: ").append(toIndentedString(subFlow)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

