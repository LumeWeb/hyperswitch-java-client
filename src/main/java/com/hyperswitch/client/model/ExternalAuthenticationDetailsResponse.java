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
import com.hyperswitch.client.model.AuthenticationStatus;
import com.hyperswitch.client.model.DecoupledAuthenticationType;
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
 * Details of external authentication
 */
@JsonPropertyOrder({
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_AUTHENTICATION_FLOW,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_STATUS,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_DS_TRANSACTION_ID,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_VERSION,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_ERROR_CODE,
  ExternalAuthenticationDetailsResponse.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAuthenticationDetailsResponse {
  public static final String JSON_PROPERTY_AUTHENTICATION_FLOW = "authentication_flow";
  private JsonNullable<DecoupledAuthenticationType> authenticationFlow = JsonNullable.<DecoupledAuthenticationType>undefined();

  public static final String JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR = "electronic_commerce_indicator";
  private JsonNullable<String> electronicCommerceIndicator = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private AuthenticationStatus status;

  public static final String JSON_PROPERTY_DS_TRANSACTION_ID = "ds_transaction_id";
  private JsonNullable<String> dsTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public ExternalAuthenticationDetailsResponse() {
  }

  public ExternalAuthenticationDetailsResponse authenticationFlow(DecoupledAuthenticationType authenticationFlow) {
    this.authenticationFlow = JsonNullable.<DecoupledAuthenticationType>of(authenticationFlow);
    
    return this;
  }

   /**
   * Get authenticationFlow
   * @return authenticationFlow
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public DecoupledAuthenticationType getAuthenticationFlow() {
        return authenticationFlow.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DecoupledAuthenticationType> getAuthenticationFlow_JsonNullable() {
    return authenticationFlow;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_FLOW)
  public void setAuthenticationFlow_JsonNullable(JsonNullable<DecoupledAuthenticationType> authenticationFlow) {
    this.authenticationFlow = authenticationFlow;
  }

  public void setAuthenticationFlow(DecoupledAuthenticationType authenticationFlow) {
    this.authenticationFlow = JsonNullable.<DecoupledAuthenticationType>of(authenticationFlow);
  }


  public ExternalAuthenticationDetailsResponse electronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = JsonNullable.<String>of(electronicCommerceIndicator);
    
    return this;
  }

   /**
   * Electronic Commerce Indicator (eci)
   * @return electronicCommerceIndicator
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getElectronicCommerceIndicator() {
        return electronicCommerceIndicator.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getElectronicCommerceIndicator_JsonNullable() {
    return electronicCommerceIndicator;
  }
  
  @JsonProperty(JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR)
  public void setElectronicCommerceIndicator_JsonNullable(JsonNullable<String> electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
  }

  public void setElectronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = JsonNullable.<String>of(electronicCommerceIndicator);
  }


  public ExternalAuthenticationDetailsResponse status(AuthenticationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthenticationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(AuthenticationStatus status) {
    this.status = status;
  }


  public ExternalAuthenticationDetailsResponse dsTransactionId(String dsTransactionId) {
    this.dsTransactionId = JsonNullable.<String>of(dsTransactionId);
    
    return this;
  }

   /**
   * DS Transaction ID
   * @return dsTransactionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDsTransactionId() {
        return dsTransactionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDsTransactionId_JsonNullable() {
    return dsTransactionId;
  }
  
  @JsonProperty(JSON_PROPERTY_DS_TRANSACTION_ID)
  public void setDsTransactionId_JsonNullable(JsonNullable<String> dsTransactionId) {
    this.dsTransactionId = dsTransactionId;
  }

  public void setDsTransactionId(String dsTransactionId) {
    this.dsTransactionId = JsonNullable.<String>of(dsTransactionId);
  }


  public ExternalAuthenticationDetailsResponse version(String version) {
    this.version = JsonNullable.<String>of(version);
    
    return this;
  }

   /**
   * Message Version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }

  public void setVersion(String version) {
    this.version = JsonNullable.<String>of(version);
  }


  public ExternalAuthenticationDetailsResponse errorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    
    return this;
  }

   /**
   * Error Code
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorCode() {
        return errorCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorCode_JsonNullable() {
    return errorCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  public void setErrorCode_JsonNullable(JsonNullable<String> errorCode) {
    this.errorCode = errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }


  public ExternalAuthenticationDetailsResponse errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

   /**
   * Error Message
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAuthenticationDetailsResponse externalAuthenticationDetailsResponse = (ExternalAuthenticationDetailsResponse) o;
    return equalsNullable(this.authenticationFlow, externalAuthenticationDetailsResponse.authenticationFlow) &&
        equalsNullable(this.electronicCommerceIndicator, externalAuthenticationDetailsResponse.electronicCommerceIndicator) &&
        Objects.equals(this.status, externalAuthenticationDetailsResponse.status) &&
        equalsNullable(this.dsTransactionId, externalAuthenticationDetailsResponse.dsTransactionId) &&
        equalsNullable(this.version, externalAuthenticationDetailsResponse.version) &&
        equalsNullable(this.errorCode, externalAuthenticationDetailsResponse.errorCode) &&
        equalsNullable(this.errorMessage, externalAuthenticationDetailsResponse.errorMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(authenticationFlow), hashCodeNullable(electronicCommerceIndicator), status, hashCodeNullable(dsTransactionId), hashCodeNullable(version), hashCodeNullable(errorCode), hashCodeNullable(errorMessage));
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
    sb.append("class ExternalAuthenticationDetailsResponse {\n");
    sb.append("    authenticationFlow: ").append(toIndentedString(authenticationFlow)).append("\n");
    sb.append("    electronicCommerceIndicator: ").append(toIndentedString(electronicCommerceIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dsTransactionId: ").append(toIndentedString(dsTransactionId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

    // add `authentication_flow` to the URL query string
    if (getAuthenticationFlow() != null) {
      try {
        joiner.add(String.format("%sauthentication_flow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthenticationFlow()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `electronic_commerce_indicator` to the URL query string
    if (getElectronicCommerceIndicator() != null) {
      try {
        joiner.add(String.format("%selectronic_commerce_indicator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getElectronicCommerceIndicator()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `ds_transaction_id` to the URL query string
    if (getDsTransactionId() != null) {
      try {
        joiner.add(String.format("%sds_transaction_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDsTransactionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_code` to the URL query string
    if (getErrorCode() != null) {
      try {
        joiner.add(String.format("%serror_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_message` to the URL query string
    if (getErrorMessage() != null) {
      try {
        joiner.add(String.format("%serror_message%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

