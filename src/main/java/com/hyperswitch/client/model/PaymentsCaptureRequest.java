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
import com.hyperswitch.client.model.MerchantConnectorDetailsWrap;
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
 * PaymentsCaptureRequest
 */
@JsonPropertyOrder({
  PaymentsCaptureRequest.JSON_PROPERTY_MERCHANT_ID,
  PaymentsCaptureRequest.JSON_PROPERTY_AMOUNT_TO_CAPTURE,
  PaymentsCaptureRequest.JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT,
  PaymentsCaptureRequest.JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX,
  PaymentsCaptureRequest.JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX,
  PaymentsCaptureRequest.JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentsCaptureRequest {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @javax.annotation.Nullable
  private JsonNullable<String> merchantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMOUNT_TO_CAPTURE = "amount_to_capture";
  @javax.annotation.Nonnull
  private Long amountToCapture;

  public static final String JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT = "refund_uncaptured_amount";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> refundUncapturedAmount = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX = "statement_descriptor_suffix";
  @javax.annotation.Nullable
  private JsonNullable<String> statementDescriptorSuffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX = "statement_descriptor_prefix";
  @javax.annotation.Nullable
  private JsonNullable<String> statementDescriptorPrefix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS = "merchant_connector_details";
  @javax.annotation.Nullable
  private JsonNullable<MerchantConnectorDetailsWrap> merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>undefined();

  public PaymentsCaptureRequest() {
  }

  public PaymentsCaptureRequest merchantId(@javax.annotation.Nullable String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
    
    return this;
  }

  /**
   * The unique identifier for the merchant
   * @return merchantId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantId() {
        return merchantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantId_JsonNullable() {
    return merchantId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  public void setMerchantId_JsonNullable(JsonNullable<String> merchantId) {
    this.merchantId = merchantId;
  }

  public void setMerchantId(@javax.annotation.Nullable String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
  }

  public PaymentsCaptureRequest amountToCapture(@javax.annotation.Nonnull Long amountToCapture) {
    
    this.amountToCapture = amountToCapture;
    return this;
  }

  /**
   * The Amount to be captured/ debited from the user&#39;s payment method.
   * @return amountToCapture
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_TO_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmountToCapture() {
    return amountToCapture;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_TO_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountToCapture(@javax.annotation.Nonnull Long amountToCapture) {
    this.amountToCapture = amountToCapture;
  }

  public PaymentsCaptureRequest refundUncapturedAmount(@javax.annotation.Nullable Boolean refundUncapturedAmount) {
    this.refundUncapturedAmount = JsonNullable.<Boolean>of(refundUncapturedAmount);
    
    return this;
  }

  /**
   * Decider to refund the uncaptured amount
   * @return refundUncapturedAmount
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getRefundUncapturedAmount() {
        return refundUncapturedAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getRefundUncapturedAmount_JsonNullable() {
    return refundUncapturedAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT)
  public void setRefundUncapturedAmount_JsonNullable(JsonNullable<Boolean> refundUncapturedAmount) {
    this.refundUncapturedAmount = refundUncapturedAmount;
  }

  public void setRefundUncapturedAmount(@javax.annotation.Nullable Boolean refundUncapturedAmount) {
    this.refundUncapturedAmount = JsonNullable.<Boolean>of(refundUncapturedAmount);
  }

  public PaymentsCaptureRequest statementDescriptorSuffix(@javax.annotation.Nullable String statementDescriptorSuffix) {
    this.statementDescriptorSuffix = JsonNullable.<String>of(statementDescriptorSuffix);
    
    return this;
  }

  /**
   * Provides information about a card payment that customers see on their statements.
   * @return statementDescriptorSuffix
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStatementDescriptorSuffix() {
        return statementDescriptorSuffix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatementDescriptorSuffix_JsonNullable() {
    return statementDescriptorSuffix;
  }
  
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX)
  public void setStatementDescriptorSuffix_JsonNullable(JsonNullable<String> statementDescriptorSuffix) {
    this.statementDescriptorSuffix = statementDescriptorSuffix;
  }

  public void setStatementDescriptorSuffix(@javax.annotation.Nullable String statementDescriptorSuffix) {
    this.statementDescriptorSuffix = JsonNullable.<String>of(statementDescriptorSuffix);
  }

  public PaymentsCaptureRequest statementDescriptorPrefix(@javax.annotation.Nullable String statementDescriptorPrefix) {
    this.statementDescriptorPrefix = JsonNullable.<String>of(statementDescriptorPrefix);
    
    return this;
  }

  /**
   * Concatenated with the statement descriptor suffix that’s set on the account to form the complete statement descriptor.
   * @return statementDescriptorPrefix
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStatementDescriptorPrefix() {
        return statementDescriptorPrefix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatementDescriptorPrefix_JsonNullable() {
    return statementDescriptorPrefix;
  }
  
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX)
  public void setStatementDescriptorPrefix_JsonNullable(JsonNullable<String> statementDescriptorPrefix) {
    this.statementDescriptorPrefix = statementDescriptorPrefix;
  }

  public void setStatementDescriptorPrefix(@javax.annotation.Nullable String statementDescriptorPrefix) {
    this.statementDescriptorPrefix = JsonNullable.<String>of(statementDescriptorPrefix);
  }

  public PaymentsCaptureRequest merchantConnectorDetails(@javax.annotation.Nullable MerchantConnectorDetailsWrap merchantConnectorDetails) {
    this.merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>of(merchantConnectorDetails);
    
    return this;
  }

  /**
   * Get merchantConnectorDetails
   * @return merchantConnectorDetails
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantConnectorDetailsWrap getMerchantConnectorDetails() {
        return merchantConnectorDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantConnectorDetailsWrap> getMerchantConnectorDetails_JsonNullable() {
    return merchantConnectorDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS)
  public void setMerchantConnectorDetails_JsonNullable(JsonNullable<MerchantConnectorDetailsWrap> merchantConnectorDetails) {
    this.merchantConnectorDetails = merchantConnectorDetails;
  }

  public void setMerchantConnectorDetails(@javax.annotation.Nullable MerchantConnectorDetailsWrap merchantConnectorDetails) {
    this.merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>of(merchantConnectorDetails);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsCaptureRequest paymentsCaptureRequest = (PaymentsCaptureRequest) o;
    return equalsNullable(this.merchantId, paymentsCaptureRequest.merchantId) &&
        Objects.equals(this.amountToCapture, paymentsCaptureRequest.amountToCapture) &&
        equalsNullable(this.refundUncapturedAmount, paymentsCaptureRequest.refundUncapturedAmount) &&
        equalsNullable(this.statementDescriptorSuffix, paymentsCaptureRequest.statementDescriptorSuffix) &&
        equalsNullable(this.statementDescriptorPrefix, paymentsCaptureRequest.statementDescriptorPrefix) &&
        equalsNullable(this.merchantConnectorDetails, paymentsCaptureRequest.merchantConnectorDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(merchantId), amountToCapture, hashCodeNullable(refundUncapturedAmount), hashCodeNullable(statementDescriptorSuffix), hashCodeNullable(statementDescriptorPrefix), hashCodeNullable(merchantConnectorDetails));
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
    sb.append("class PaymentsCaptureRequest {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    amountToCapture: ").append(toIndentedString(amountToCapture)).append("\n");
    sb.append("    refundUncapturedAmount: ").append(toIndentedString(refundUncapturedAmount)).append("\n");
    sb.append("    statementDescriptorSuffix: ").append(toIndentedString(statementDescriptorSuffix)).append("\n");
    sb.append("    statementDescriptorPrefix: ").append(toIndentedString(statementDescriptorPrefix)).append("\n");
    sb.append("    merchantConnectorDetails: ").append(toIndentedString(merchantConnectorDetails)).append("\n");
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

    // add `merchant_id` to the URL query string
    if (getMerchantId() != null) {
      try {
        joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount_to_capture` to the URL query string
    if (getAmountToCapture() != null) {
      try {
        joiner.add(String.format("%samount_to_capture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountToCapture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refund_uncaptured_amount` to the URL query string
    if (getRefundUncapturedAmount() != null) {
      try {
        joiner.add(String.format("%srefund_uncaptured_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundUncapturedAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statement_descriptor_suffix` to the URL query string
    if (getStatementDescriptorSuffix() != null) {
      try {
        joiner.add(String.format("%sstatement_descriptor_suffix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatementDescriptorSuffix()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statement_descriptor_prefix` to the URL query string
    if (getStatementDescriptorPrefix() != null) {
      try {
        joiner.add(String.format("%sstatement_descriptor_prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatementDescriptorPrefix()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant_connector_details` to the URL query string
    if (getMerchantConnectorDetails() != null) {
      joiner.add(getMerchantConnectorDetails().toUrlQueryString(prefix + "merchant_connector_details" + suffix));
    }

    return joiner.toString();
  }

}

