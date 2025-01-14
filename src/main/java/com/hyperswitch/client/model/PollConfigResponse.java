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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PollConfigResponse
 */
@JsonPropertyOrder({
  PollConfigResponse.JSON_PROPERTY_POLL_ID,
  PollConfigResponse.JSON_PROPERTY_DELAY_IN_SECS,
  PollConfigResponse.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PollConfigResponse {
  public static final String JSON_PROPERTY_POLL_ID = "poll_id";
  private String pollId;

  public static final String JSON_PROPERTY_DELAY_IN_SECS = "delay_in_secs";
  private Integer delayInSecs;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Integer frequency;

  public PollConfigResponse() {
  }

  public PollConfigResponse pollId(String pollId) {
    
    this.pollId = pollId;
    return this;
  }

   /**
   * Poll Id
   * @return pollId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPollId() {
    return pollId;
  }


  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPollId(String pollId) {
    this.pollId = pollId;
  }


  public PollConfigResponse delayInSecs(Integer delayInSecs) {
    
    this.delayInSecs = delayInSecs;
    return this;
  }

   /**
   * Interval of the poll
   * @return delayInSecs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELAY_IN_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDelayInSecs() {
    return delayInSecs;
  }


  @JsonProperty(JSON_PROPERTY_DELAY_IN_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelayInSecs(Integer delayInSecs) {
    this.delayInSecs = delayInSecs;
  }


  public PollConfigResponse frequency(Integer frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency of the poll
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollConfigResponse pollConfigResponse = (PollConfigResponse) o;
    return Objects.equals(this.pollId, pollConfigResponse.pollId) &&
        Objects.equals(this.delayInSecs, pollConfigResponse.delayInSecs) &&
        Objects.equals(this.frequency, pollConfigResponse.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollId, delayInSecs, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollConfigResponse {\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    delayInSecs: ").append(toIndentedString(delayInSecs)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

    // add `poll_id` to the URL query string
    if (getPollId() != null) {
      try {
        joiner.add(String.format("%spoll_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPollId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delay_in_secs` to the URL query string
    if (getDelayInSecs() != null) {
      try {
        joiner.add(String.format("%sdelay_in_secs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayInSecs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frequency` to the URL query string
    if (getFrequency() != null) {
      try {
        joiner.add(String.format("%sfrequency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrequency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

