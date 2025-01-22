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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.PaymentProcessingDetailsAtOneOf;
import com.hyperswitch.client.model.PaymentProcessingDetailsAtOneOf1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
* PaymentProcessingDetailsAt
*/
    @JsonPropertyOrder({
        PaymentProcessingDetailsAt.JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE,
        PaymentProcessingDetailsAt.JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY,
        PaymentProcessingDetailsAt.JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
@JsonIgnoreProperties(
  value = "payment_processing_details_at", // ignore manually set payment_processing_details_at, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the payment_processing_details_at to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "payment_processing_details_at", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PaymentProcessingDetailsAtOneOf.class, name = "PaymentProcessingDetailsAt_oneOf"),
  @JsonSubTypes.Type(value = PaymentProcessingDetailsAtOneOf1.class, name = "PaymentProcessingDetailsAt_oneOf_1"),
})

    public static PaymentProcessingDetailsAtOneOf1 paymentMethodId(String paymentMethodId) {
        PaymentProcessingDetailsAtOneOf1 result = new PaymentProcessingDetailsAtOneOf1();
        result.setType(PaymentProcessingDetailsAtOneOf1.TypeEnum.PAYMENT_METHOD_ID);
        result.setData(paymentMethodId);
        return result;
    }

    public static PaymentProcessingDetailsAtOneOf mandateId(String mandateId) {
        PaymentProcessingDetailsAtOneOf result = new PaymentProcessingDetailsAtOneOf();
        result.setType(PaymentProcessingDetailsAtOneOf.TypeEnum.MANDATE_ID);
        result.setData(mandateId);
        return result;
    }

    public static PaymentProcessingDetailsAtOneOf2 processorPaymentToken(ProcessorPaymentToken token) {
        PaymentProcessingDetailsAtOneOf2 result = new PaymentProcessingDetailsAtOneOf2();
        result.setType(PaymentProcessingDetailsAtOneOf2.TypeEnum.PROCESSOR_PAYMENT_TOKEN);
        result.setData(token);
        return result;
    }

    public static PaymentProcessingDetailsAtOneOf3 networkTransactionIdAndCardDetails(NetworkTransactionIdAndCardDetails details) {
        PaymentProcessingDetailsAtOneOf3 result = new PaymentProcessingDetailsAtOneOf3();
        result.setType(PaymentProcessingDetailsAtOneOf3.TypeEnum.NETWORK_TRANSACTION_ID_AND_CARD_DETAILS);
        result.setData(details);
        return result;
    }
public class PaymentProcessingDetailsAt extends PaymentProcessingDetailsAt {
        public static final String JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE = "payment_processing_certificate";
    @javax.annotation.Nonnull
            private String paymentProcessingCertificate;

        public static final String JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY = "payment_processing_certificate_key";
    @javax.annotation.Nonnull
            private String paymentProcessingCertificateKey;

              /**
   * Gets or Sets paymentProcessingDetailsAt
   */
  public enum PaymentProcessingDetailsAtEnum {
    CONNECTOR(String.valueOf("Connector"));

    private String value;

    PaymentProcessingDetailsAtEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentProcessingDetailsAtEnum fromValue(String value) {
      for (PaymentProcessingDetailsAtEnum b : PaymentProcessingDetailsAtEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        public static final String JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT = "payment_processing_details_at";
    @javax.annotation.Nonnull
            private PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt;

public PaymentProcessingDetailsAt() {
}

        public PaymentProcessingDetailsAt paymentProcessingCertificate(@javax.annotation.Nonnull String paymentProcessingCertificate) {
        
        this.paymentProcessingCertificate = paymentProcessingCertificate;
        return this;
        }

    /**
        * Get paymentProcessingCertificate
    * @return paymentProcessingCertificate
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getPaymentProcessingCertificate() {
        return paymentProcessingCertificate;
    }


          @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingCertificate(@javax.annotation.Nonnull String paymentProcessingCertificate) {
            this.paymentProcessingCertificate = paymentProcessingCertificate;
        }

        public PaymentProcessingDetailsAt paymentProcessingCertificateKey(@javax.annotation.Nonnull String paymentProcessingCertificateKey) {
        
        this.paymentProcessingCertificateKey = paymentProcessingCertificateKey;
        return this;
        }

    /**
        * Get paymentProcessingCertificateKey
    * @return paymentProcessingCertificateKey
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getPaymentProcessingCertificateKey() {
        return paymentProcessingCertificateKey;
    }


          @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingCertificateKey(@javax.annotation.Nonnull String paymentProcessingCertificateKey) {
            this.paymentProcessingCertificateKey = paymentProcessingCertificateKey;
        }

        public PaymentProcessingDetailsAt paymentProcessingDetailsAt(@javax.annotation.Nonnull PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
        
        this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
        return this;
        }

    /**
        * Get paymentProcessingDetailsAt
    * @return paymentProcessingDetailsAt
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public PaymentProcessingDetailsAtEnum getPaymentProcessingDetailsAt() {
        return paymentProcessingDetailsAt;
    }


          @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingDetailsAt(@javax.annotation.Nonnull PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
            this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        PaymentProcessingDetailsAt paymentProcessingDetailsAt = (PaymentProcessingDetailsAt) o;
        return Objects.equals(this.paymentProcessingCertificate, paymentProcessingDetailsAt.paymentProcessingCertificate) &&
        Objects.equals(this.paymentProcessingCertificateKey, paymentProcessingDetailsAt.paymentProcessingCertificateKey) &&
        Objects.equals(this.paymentProcessingDetailsAt, paymentProcessingDetailsAt.paymentProcessingDetailsAt);
}

    @Override
    public int hashCode() {
        return Objects.hash(paymentProcessingCertificate, paymentProcessingCertificateKey, paymentProcessingDetailsAt);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessingDetailsAt {\n");
        sb.append("    paymentProcessingCertificate: ").append(toIndentedString(paymentProcessingCertificate)).append("\n");
        sb.append("    paymentProcessingCertificateKey: ").append(toIndentedString(paymentProcessingCertificateKey)).append("\n");
        sb.append("    paymentProcessingDetailsAt: ").append(toIndentedString(paymentProcessingDetailsAt)).append("\n");
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

            // add `payment_processing_certificate` to the URL query string
                        if (getPaymentProcessingCertificate() != null) {
                        try {
                        joiner.add(String.format("%spayment_processing_certificate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentProcessingCertificate()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `payment_processing_certificate_key` to the URL query string
                        if (getPaymentProcessingCertificateKey() != null) {
                        try {
                        joiner.add(String.format("%spayment_processing_certificate_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentProcessingCertificateKey()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `payment_processing_details_at` to the URL query string
                        if (getPaymentProcessingDetailsAt() != null) {
                        try {
                        joiner.add(String.format("%spayment_processing_details_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentProcessingDetailsAt()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }

