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
* PaymentsCancelRequest
*/
    @JsonPropertyOrder({
        PaymentsCancelRequest.JSON_PROPERTY_CANCELLATION_REASON,
        PaymentsCancelRequest.JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentsCancelRequest {
        public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellation_reason";
    @javax.annotation.Nullable
            private JsonNullable<String> cancellationReason = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS = "merchant_connector_details";
    @javax.annotation.Nullable
            private JsonNullable<MerchantConnectorDetailsWrap> merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>undefined();

public PaymentsCancelRequest() {
}

        public PaymentsCancelRequest cancellationReason(@javax.annotation.Nullable String cancellationReason) {
        this.cancellationReason = JsonNullable.<String>of(cancellationReason);
        
        return this;
        }

    /**
        * The reason for the payment cancel
    * @return cancellationReason
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getCancellationReason() {
                return cancellationReason.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getCancellationReason_JsonNullable() {
        return cancellationReason;
        }
    
        @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
        public void setCancellationReason_JsonNullable(JsonNullable<String> cancellationReason) {
        this.cancellationReason = cancellationReason;
        }

          public void setCancellationReason(@javax.annotation.Nullable String cancellationReason) {
            this.cancellationReason = JsonNullable.<String>of(cancellationReason);
        }

        public PaymentsCancelRequest merchantConnectorDetails(@javax.annotation.Nullable MerchantConnectorDetailsWrap merchantConnectorDetails) {
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
        PaymentsCancelRequest paymentsCancelRequest = (PaymentsCancelRequest) o;
        return equalsNullable(this.cancellationReason, paymentsCancelRequest.cancellationReason) &&
        equalsNullable(this.merchantConnectorDetails, paymentsCancelRequest.merchantConnectorDetails);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(cancellationReason), hashCodeNullable(merchantConnectorDetails));
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
    sb.append("class PaymentsCancelRequest {\n");
        sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
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

            // add `cancellation_reason` to the URL query string
                        if (getCancellationReason() != null) {
                        try {
                        joiner.add(String.format("%scancellation_reason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCancellationReason()), "UTF-8").replaceAll("\\+", "%20")));
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

