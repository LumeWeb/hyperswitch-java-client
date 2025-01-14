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
import com.hyperswitch.client.model.OutgoingWebhookRequestContentHeadersInnerInner;
import java.util.ArrayList;
import java.util.List;
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
 * The response information (headers, body and status code) received for the webhook sent.
 */
@JsonPropertyOrder({
  OutgoingWebhookResponseContent.JSON_PROPERTY_BODY,
  OutgoingWebhookResponseContent.JSON_PROPERTY_HEADERS,
  OutgoingWebhookResponseContent.JSON_PROPERTY_STATUS_CODE,
  OutgoingWebhookResponseContent.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutgoingWebhookResponseContent {
  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private JsonNullable<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>> headers = JsonNullable.<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>>undefined();

  public static final String JSON_PROPERTY_STATUS_CODE = "status_code";
  private JsonNullable<Integer> statusCode = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public OutgoingWebhookResponseContent() {
  }

  public OutgoingWebhookResponseContent body(String body) {
    this.body = JsonNullable.<String>of(body);
    
    return this;
  }

   /**
   * The response body received for the webhook sent.
   * @return body
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  public OutgoingWebhookResponseContent headers(List<List<OutgoingWebhookRequestContentHeadersInnerInner>> headers) {
    this.headers = JsonNullable.<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>>of(headers);
    
    return this;
  }

  public OutgoingWebhookResponseContent addHeadersItem(List<OutgoingWebhookRequestContentHeadersInnerInner> headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>>of(new ArrayList<>());
    }
    try {
      this.headers.get().add(headersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The response headers received for the webhook sent.
   * @return headers
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<List<OutgoingWebhookRequestContentHeadersInnerInner>> getHeaders() {
        return headers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>> getHeaders_JsonNullable() {
    return headers;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADERS)
  public void setHeaders_JsonNullable(JsonNullable<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>> headers) {
    this.headers = headers;
  }

  public void setHeaders(List<List<OutgoingWebhookRequestContentHeadersInnerInner>> headers) {
    this.headers = JsonNullable.<List<List<OutgoingWebhookRequestContentHeadersInnerInner>>>of(headers);
  }


  public OutgoingWebhookResponseContent statusCode(Integer statusCode) {
    this.statusCode = JsonNullable.<Integer>of(statusCode);
    
    return this;
  }

   /**
   * The HTTP status code for the webhook sent.
   * minimum: 0
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getStatusCode() {
        return statusCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getStatusCode_JsonNullable() {
    return statusCode;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  public void setStatusCode_JsonNullable(JsonNullable<Integer> statusCode) {
    this.statusCode = statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = JsonNullable.<Integer>of(statusCode);
  }


  public OutgoingWebhookResponseContent errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

   /**
   * Error message in case any error occurred when trying to deliver the webhook.
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
    OutgoingWebhookResponseContent outgoingWebhookResponseContent = (OutgoingWebhookResponseContent) o;
    return equalsNullable(this.body, outgoingWebhookResponseContent.body) &&
        equalsNullable(this.headers, outgoingWebhookResponseContent.headers) &&
        equalsNullable(this.statusCode, outgoingWebhookResponseContent.statusCode) &&
        equalsNullable(this.errorMessage, outgoingWebhookResponseContent.errorMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(body), hashCodeNullable(headers), hashCodeNullable(statusCode), hashCodeNullable(errorMessage));
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
    sb.append("class OutgoingWebhookResponseContent {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

    // add `body` to the URL query string
    if (getBody() != null) {
      try {
        joiner.add(String.format("%sbody%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBody()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (int i = 0; i < getHeaders().size(); i++) {
        if (getHeaders().get(i) != null) {
          try {
            joiner.add(String.format("%sheaders%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getHeaders().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `status_code` to the URL query string
    if (getStatusCode() != null) {
      try {
        joiner.add(String.format("%sstatus_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusCode()), "UTF-8").replaceAll("\\+", "%20")));
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

