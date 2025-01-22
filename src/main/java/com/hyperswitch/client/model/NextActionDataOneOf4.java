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
* Contains url to fetch Qr code data
*/
    @JsonPropertyOrder({
        NextActionDataOneOf4.JSON_PROPERTY_QR_CODE_FETCH_URL,
        NextActionDataOneOf4.JSON_PROPERTY_TYPE
    })
            @JsonTypeName("NextActionData_oneOf_4")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NextActionDataOneOf4 {
        public static final String JSON_PROPERTY_QR_CODE_FETCH_URL = "qr_code_fetch_url";
    @javax.annotation.Nonnull
            private String qrCodeFetchUrl;

              /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FETCH_QR_CODE_INFORMATION(String.valueOf("fetch_qr_code_information"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        public static final String JSON_PROPERTY_TYPE = "type";
    @javax.annotation.Nonnull
            private TypeEnum type;

public NextActionDataOneOf4() {
}

        public NextActionDataOneOf4 qrCodeFetchUrl(@javax.annotation.Nonnull String qrCodeFetchUrl) {
        
        this.qrCodeFetchUrl = qrCodeFetchUrl;
        return this;
        }

    /**
        * Get qrCodeFetchUrl
    * @return qrCodeFetchUrl
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_QR_CODE_FETCH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getQrCodeFetchUrl() {
        return qrCodeFetchUrl;
    }


          @JsonProperty(JSON_PROPERTY_QR_CODE_FETCH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQrCodeFetchUrl(@javax.annotation.Nonnull String qrCodeFetchUrl) {
            this.qrCodeFetchUrl = qrCodeFetchUrl;
        }

        public NextActionDataOneOf4 type(@javax.annotation.Nonnull TypeEnum type) {
        
        this.type = type;
        return this;
        }

    /**
        * Get type
    * @return type
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public TypeEnum getType() {
        return type;
    }


          @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TypeEnum type) {
            this.type = type;
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        NextActionDataOneOf4 nextActionDataOneOf4 = (NextActionDataOneOf4) o;
        return Objects.equals(this.qrCodeFetchUrl, nextActionDataOneOf4.qrCodeFetchUrl) &&
        Objects.equals(this.type, nextActionDataOneOf4.type);
}

    @Override
    public int hashCode() {
        return Objects.hash(qrCodeFetchUrl, type);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextActionDataOneOf4 {\n");
        sb.append("    qrCodeFetchUrl: ").append(toIndentedString(qrCodeFetchUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

            // add `qr_code_fetch_url` to the URL query string
                        if (getQrCodeFetchUrl() != null) {
                        try {
                        joiner.add(String.format("%sqr_code_fetch_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQrCodeFetchUrl()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `type` to the URL query string
                        if (getType() != null) {
                        try {
                        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }

