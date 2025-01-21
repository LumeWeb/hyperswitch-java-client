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
import com.hyperswitch.client.model.AuthorizationStatus;
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
 * IncrementalAuthorizationResponse
 */
@JsonPropertyOrder({
  IncrementalAuthorizationResponse.JSON_PROPERTY_AUTHORIZATION_ID,
  IncrementalAuthorizationResponse.JSON_PROPERTY_AMOUNT,
  IncrementalAuthorizationResponse.JSON_PROPERTY_STATUS,
  IncrementalAuthorizationResponse.JSON_PROPERTY_ERROR_CODE,
  IncrementalAuthorizationResponse.JSON_PROPERTY_ERROR_MESSAGE,
  IncrementalAuthorizationResponse.JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class IncrementalAuthorizationResponse {
  public static final String JSON_PROPERTY_AUTHORIZATION_ID = "authorization_id";
  @javax.annotation.Nonnull
  private String authorizationId;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Long amount;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private AuthorizationStatus status;

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  @javax.annotation.Nullable
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  @javax.annotation.Nullable
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT = "previously_authorized_amount";
  @javax.annotation.Nonnull
  private Long previouslyAuthorizedAmount;

  public IncrementalAuthorizationResponse() {
  }

  public IncrementalAuthorizationResponse authorizationId(@javax.annotation.Nonnull String authorizationId) {
    
    this.authorizationId = authorizationId;
    return this;
  }

  /**
   * The unique identifier of authorization
   * @return authorizationId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthorizationId() {
    return authorizationId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationId(@javax.annotation.Nonnull String authorizationId) {
    this.authorizationId = authorizationId;
  }

  public IncrementalAuthorizationResponse amount(@javax.annotation.Nonnull Long amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * Amount the authorization has been made for
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Long amount) {
    this.amount = amount;
  }

  public IncrementalAuthorizationResponse status(@javax.annotation.Nonnull AuthorizationStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthorizationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull AuthorizationStatus status) {
    this.status = status;
  }

  public IncrementalAuthorizationResponse errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    
    return this;
  }

  /**
   * Error code sent by the connector for authorization
   * @return errorCode
   */
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

  public void setErrorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }

  public IncrementalAuthorizationResponse errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

  /**
   * Error message sent by the connector for authorization
   * @return errorMessage
   */
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

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }

  public IncrementalAuthorizationResponse previouslyAuthorizedAmount(@javax.annotation.Nonnull Long previouslyAuthorizedAmount) {
    
    this.previouslyAuthorizedAmount = previouslyAuthorizedAmount;
    return this;
  }

  /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return previouslyAuthorizedAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPreviouslyAuthorizedAmount() {
    return previouslyAuthorizedAmount;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviouslyAuthorizedAmount(@javax.annotation.Nonnull Long previouslyAuthorizedAmount) {
    this.previouslyAuthorizedAmount = previouslyAuthorizedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncrementalAuthorizationResponse incrementalAuthorizationResponse = (IncrementalAuthorizationResponse) o;
    return Objects.equals(this.authorizationId, incrementalAuthorizationResponse.authorizationId) &&
        Objects.equals(this.amount, incrementalAuthorizationResponse.amount) &&
        Objects.equals(this.status, incrementalAuthorizationResponse.status) &&
        equalsNullable(this.errorCode, incrementalAuthorizationResponse.errorCode) &&
        equalsNullable(this.errorMessage, incrementalAuthorizationResponse.errorMessage) &&
        Objects.equals(this.previouslyAuthorizedAmount, incrementalAuthorizationResponse.previouslyAuthorizedAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationId, amount, status, hashCodeNullable(errorCode), hashCodeNullable(errorMessage), previouslyAuthorizedAmount);
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
    sb.append("class IncrementalAuthorizationResponse {\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    previouslyAuthorizedAmount: ").append(toIndentedString(previouslyAuthorizedAmount)).append("\n");
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

    // add `authorization_id` to the URL query string
    if (getAuthorizationId() != null) {
      try {
        joiner.add(String.format("%sauthorization_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `previously_authorized_amount` to the URL query string
    if (getPreviouslyAuthorizedAmount() != null) {
      try {
        joiner.add(String.format("%spreviously_authorized_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreviouslyAuthorizedAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

