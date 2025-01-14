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
import com.hyperswitch.client.model.Connector;
import com.hyperswitch.client.model.GsmDecision;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GsmCreateRequest
 */
@JsonPropertyOrder({
  GsmCreateRequest.JSON_PROPERTY_CONNECTOR,
  GsmCreateRequest.JSON_PROPERTY_FLOW,
  GsmCreateRequest.JSON_PROPERTY_SUB_FLOW,
  GsmCreateRequest.JSON_PROPERTY_CODE,
  GsmCreateRequest.JSON_PROPERTY_MESSAGE,
  GsmCreateRequest.JSON_PROPERTY_STATUS,
  GsmCreateRequest.JSON_PROPERTY_ROUTER_ERROR,
  GsmCreateRequest.JSON_PROPERTY_DECISION,
  GsmCreateRequest.JSON_PROPERTY_STEP_UP_POSSIBLE,
  GsmCreateRequest.JSON_PROPERTY_UNIFIED_CODE,
  GsmCreateRequest.JSON_PROPERTY_UNIFIED_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GsmCreateRequest {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private Connector connector;

  public static final String JSON_PROPERTY_FLOW = "flow";
  private String flow;

  public static final String JSON_PROPERTY_SUB_FLOW = "sub_flow";
  private String subFlow;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ROUTER_ERROR = "router_error";
  private JsonNullable<String> routerError = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DECISION = "decision";
  private GsmDecision decision;

  public static final String JSON_PROPERTY_STEP_UP_POSSIBLE = "step_up_possible";
  private Boolean stepUpPossible;

  public static final String JSON_PROPERTY_UNIFIED_CODE = "unified_code";
  private JsonNullable<String> unifiedCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_MESSAGE = "unified_message";
  private JsonNullable<String> unifiedMessage = JsonNullable.<String>undefined();

  public GsmCreateRequest() {
  }

  public GsmCreateRequest connector(Connector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Connector getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(Connector connector) {
    this.connector = connector;
  }


  public GsmCreateRequest flow(String flow) {
    
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


  public GsmCreateRequest subFlow(String subFlow) {
    
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


  public GsmCreateRequest code(String code) {
    
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


  public GsmCreateRequest message(String message) {
    
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


  public GsmCreateRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * status provided by the router
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public GsmCreateRequest routerError(String routerError) {
    this.routerError = JsonNullable.<String>of(routerError);
    
    return this;
  }

   /**
   * optional error provided by the router
   * @return routerError
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRouterError() {
        return routerError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROUTER_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRouterError_JsonNullable() {
    return routerError;
  }
  
  @JsonProperty(JSON_PROPERTY_ROUTER_ERROR)
  public void setRouterError_JsonNullable(JsonNullable<String> routerError) {
    this.routerError = routerError;
  }

  public void setRouterError(String routerError) {
    this.routerError = JsonNullable.<String>of(routerError);
  }


  public GsmCreateRequest decision(GsmDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GsmDecision getDecision() {
    return decision;
  }


  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDecision(GsmDecision decision) {
    this.decision = decision;
  }


  public GsmCreateRequest stepUpPossible(Boolean stepUpPossible) {
    
    this.stepUpPossible = stepUpPossible;
    return this;
  }

   /**
   * indicates if step_up retry is possible
   * @return stepUpPossible
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STEP_UP_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStepUpPossible() {
    return stepUpPossible;
  }


  @JsonProperty(JSON_PROPERTY_STEP_UP_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStepUpPossible(Boolean stepUpPossible) {
    this.stepUpPossible = stepUpPossible;
  }


  public GsmCreateRequest unifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
    
    return this;
  }

   /**
   * error code unified across the connectors
   * @return unifiedCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedCode() {
        return unifiedCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedCode_JsonNullable() {
    return unifiedCode;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  public void setUnifiedCode_JsonNullable(JsonNullable<String> unifiedCode) {
    this.unifiedCode = unifiedCode;
  }

  public void setUnifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
  }


  public GsmCreateRequest unifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
    
    return this;
  }

   /**
   * error message unified across the connectors
   * @return unifiedMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedMessage() {
        return unifiedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedMessage_JsonNullable() {
    return unifiedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  public void setUnifiedMessage_JsonNullable(JsonNullable<String> unifiedMessage) {
    this.unifiedMessage = unifiedMessage;
  }

  public void setUnifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GsmCreateRequest gsmCreateRequest = (GsmCreateRequest) o;
    return Objects.equals(this.connector, gsmCreateRequest.connector) &&
        Objects.equals(this.flow, gsmCreateRequest.flow) &&
        Objects.equals(this.subFlow, gsmCreateRequest.subFlow) &&
        Objects.equals(this.code, gsmCreateRequest.code) &&
        Objects.equals(this.message, gsmCreateRequest.message) &&
        Objects.equals(this.status, gsmCreateRequest.status) &&
        equalsNullable(this.routerError, gsmCreateRequest.routerError) &&
        Objects.equals(this.decision, gsmCreateRequest.decision) &&
        Objects.equals(this.stepUpPossible, gsmCreateRequest.stepUpPossible) &&
        equalsNullable(this.unifiedCode, gsmCreateRequest.unifiedCode) &&
        equalsNullable(this.unifiedMessage, gsmCreateRequest.unifiedMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, flow, subFlow, code, message, status, hashCodeNullable(routerError), decision, stepUpPossible, hashCodeNullable(unifiedCode), hashCodeNullable(unifiedMessage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GsmCreateRequest {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    subFlow: ").append(toIndentedString(subFlow)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    routerError: ").append(toIndentedString(routerError)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    stepUpPossible: ").append(toIndentedString(stepUpPossible)).append("\n");
    sb.append("    unifiedCode: ").append(toIndentedString(unifiedCode)).append("\n");
    sb.append("    unifiedMessage: ").append(toIndentedString(unifiedMessage)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `connector` to the URL query string
    if (getConnector() != null) {
      try {
        joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `flow` to the URL query string
    if (getFlow() != null) {
      try {
        joiner.add(String.format("%sflow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFlow()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sub_flow` to the URL query string
    if (getSubFlow() != null) {
      try {
        joiner.add(String.format("%ssub_flow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubFlow()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `router_error` to the URL query string
    if (getRouterError() != null) {
      try {
        joiner.add(String.format("%srouter_error%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRouterError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `decision` to the URL query string
    if (getDecision() != null) {
      try {
        joiner.add(String.format("%sdecision%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecision()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `step_up_possible` to the URL query string
    if (getStepUpPossible() != null) {
      try {
        joiner.add(String.format("%sstep_up_possible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStepUpPossible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unified_code` to the URL query string
    if (getUnifiedCode() != null) {
      try {
        joiner.add(String.format("%sunified_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnifiedCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unified_message` to the URL query string
    if (getUnifiedMessage() != null) {
      try {
        joiner.add(String.format("%sunified_message%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnifiedMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

