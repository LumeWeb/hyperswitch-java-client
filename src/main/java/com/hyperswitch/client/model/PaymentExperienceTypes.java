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
import com.hyperswitch.client.model.PaymentExperience;
import java.util.ArrayList;
import java.util.Arrays;
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
 * PaymentExperienceTypes
 */
@JsonPropertyOrder({
  PaymentExperienceTypes.JSON_PROPERTY_PAYMENT_EXPERIENCE_TYPE,
  PaymentExperienceTypes.JSON_PROPERTY_ELIGIBLE_CONNECTORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentExperienceTypes {
  public static final String JSON_PROPERTY_PAYMENT_EXPERIENCE_TYPE = "payment_experience_type";
  @javax.annotation.Nullable
  private JsonNullable<PaymentExperience> paymentExperienceType = JsonNullable.<PaymentExperience>undefined();

  public static final String JSON_PROPERTY_ELIGIBLE_CONNECTORS = "eligible_connectors";
  @javax.annotation.Nonnull
  private List<String> eligibleConnectors = new ArrayList<>();

  public PaymentExperienceTypes() {
  }

  public PaymentExperienceTypes paymentExperienceType(@javax.annotation.Nullable PaymentExperience paymentExperienceType) {
    this.paymentExperienceType = JsonNullable.<PaymentExperience>of(paymentExperienceType);
    
    return this;
  }

  /**
   * Get paymentExperienceType
   * @return paymentExperienceType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentExperience getPaymentExperienceType() {
        return paymentExperienceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentExperience> getPaymentExperienceType_JsonNullable() {
    return paymentExperienceType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE_TYPE)
  public void setPaymentExperienceType_JsonNullable(JsonNullable<PaymentExperience> paymentExperienceType) {
    this.paymentExperienceType = paymentExperienceType;
  }

  public void setPaymentExperienceType(@javax.annotation.Nullable PaymentExperience paymentExperienceType) {
    this.paymentExperienceType = JsonNullable.<PaymentExperience>of(paymentExperienceType);
  }

  public PaymentExperienceTypes eligibleConnectors(@javax.annotation.Nonnull List<String> eligibleConnectors) {
    
    this.eligibleConnectors = eligibleConnectors;
    return this;
  }

  public PaymentExperienceTypes addEligibleConnectorsItem(String eligibleConnectorsItem) {
    if (this.eligibleConnectors == null) {
      this.eligibleConnectors = new ArrayList<>();
    }
    this.eligibleConnectors.add(eligibleConnectorsItem);
    return this;
  }

  /**
   * The list of eligible connectors for a given payment experience
   * @return eligibleConnectors
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEligibleConnectors() {
    return eligibleConnectors;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEligibleConnectors(@javax.annotation.Nonnull List<String> eligibleConnectors) {
    this.eligibleConnectors = eligibleConnectors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExperienceTypes paymentExperienceTypes = (PaymentExperienceTypes) o;
    return equalsNullable(this.paymentExperienceType, paymentExperienceTypes.paymentExperienceType) &&
        Objects.equals(this.eligibleConnectors, paymentExperienceTypes.eligibleConnectors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(paymentExperienceType), eligibleConnectors);
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
    sb.append("class PaymentExperienceTypes {\n");
    sb.append("    paymentExperienceType: ").append(toIndentedString(paymentExperienceType)).append("\n");
    sb.append("    eligibleConnectors: ").append(toIndentedString(eligibleConnectors)).append("\n");
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

    // add `payment_experience_type` to the URL query string
    if (getPaymentExperienceType() != null) {
      try {
        joiner.add(String.format("%spayment_experience_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentExperienceType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `eligible_connectors` to the URL query string
    if (getEligibleConnectors() != null) {
      for (int i = 0; i < getEligibleConnectors().size(); i++) {
        try {
          joiner.add(String.format("%seligible_connectors%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEligibleConnectors().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

