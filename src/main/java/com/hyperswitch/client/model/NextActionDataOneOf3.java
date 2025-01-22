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
* Contains url for Qr code image, this qr code has to be shown in sdk
*/
    @JsonPropertyOrder({
        NextActionDataOneOf3.JSON_PROPERTY_IMAGE_DATA_URL,
        NextActionDataOneOf3.JSON_PROPERTY_DISPLAY_TO_TIMESTAMP,
        NextActionDataOneOf3.JSON_PROPERTY_QR_CODE_URL,
        NextActionDataOneOf3.JSON_PROPERTY_TYPE
    })
            @JsonTypeName("NextActionData_oneOf_3")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NextActionDataOneOf3 {
        public static final String JSON_PROPERTY_IMAGE_DATA_URL = "image_data_url";
    @javax.annotation.Nonnull
            private String imageDataUrl;

        public static final String JSON_PROPERTY_DISPLAY_TO_TIMESTAMP = "display_to_timestamp";
    @javax.annotation.Nullable
            private JsonNullable<Long> displayToTimestamp = JsonNullable.<Long>undefined();

        public static final String JSON_PROPERTY_QR_CODE_URL = "qr_code_url";
    @javax.annotation.Nonnull
            private String qrCodeUrl;

              /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    QR_CODE_INFORMATION(String.valueOf("qr_code_information"));

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

public NextActionDataOneOf3() {
}

        public NextActionDataOneOf3 imageDataUrl(@javax.annotation.Nonnull String imageDataUrl) {
        
        this.imageDataUrl = imageDataUrl;
        return this;
        }

    /**
        * Hyperswitch generated image data source url
    * @return imageDataUrl
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_IMAGE_DATA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getImageDataUrl() {
        return imageDataUrl;
    }


          @JsonProperty(JSON_PROPERTY_IMAGE_DATA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageDataUrl(@javax.annotation.Nonnull String imageDataUrl) {
            this.imageDataUrl = imageDataUrl;
        }

        public NextActionDataOneOf3 displayToTimestamp(@javax.annotation.Nullable Long displayToTimestamp) {
        this.displayToTimestamp = JsonNullable.<Long>of(displayToTimestamp);
        
        return this;
        }

    /**
        * Get displayToTimestamp
    * @return displayToTimestamp
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public Long getDisplayToTimestamp() {
                return displayToTimestamp.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<Long> getDisplayToTimestamp_JsonNullable() {
        return displayToTimestamp;
        }
    
        @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
        public void setDisplayToTimestamp_JsonNullable(JsonNullable<Long> displayToTimestamp) {
        this.displayToTimestamp = displayToTimestamp;
        }

          public void setDisplayToTimestamp(@javax.annotation.Nullable Long displayToTimestamp) {
            this.displayToTimestamp = JsonNullable.<Long>of(displayToTimestamp);
        }

        public NextActionDataOneOf3 qrCodeUrl(@javax.annotation.Nonnull String qrCodeUrl) {
        
        this.qrCodeUrl = qrCodeUrl;
        return this;
        }

    /**
        * The url for Qr code given by the connector
    * @return qrCodeUrl
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }


          @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQrCodeUrl(@javax.annotation.Nonnull String qrCodeUrl) {
            this.qrCodeUrl = qrCodeUrl;
        }

        public NextActionDataOneOf3 type(@javax.annotation.Nonnull TypeEnum type) {
        
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
        NextActionDataOneOf3 nextActionDataOneOf3 = (NextActionDataOneOf3) o;
        return Objects.equals(this.imageDataUrl, nextActionDataOneOf3.imageDataUrl) &&
        equalsNullable(this.displayToTimestamp, nextActionDataOneOf3.displayToTimestamp) &&
        Objects.equals(this.qrCodeUrl, nextActionDataOneOf3.qrCodeUrl) &&
        Objects.equals(this.type, nextActionDataOneOf3.type);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(imageDataUrl, hashCodeNullable(displayToTimestamp), qrCodeUrl, type);
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
    sb.append("class NextActionDataOneOf3 {\n");
        sb.append("    imageDataUrl: ").append(toIndentedString(imageDataUrl)).append("\n");
        sb.append("    displayToTimestamp: ").append(toIndentedString(displayToTimestamp)).append("\n");
        sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
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

            // add `image_data_url` to the URL query string
                        if (getImageDataUrl() != null) {
                        try {
                        joiner.add(String.format("%simage_data_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageDataUrl()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `display_to_timestamp` to the URL query string
                        if (getDisplayToTimestamp() != null) {
                        try {
                        joiner.add(String.format("%sdisplay_to_timestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayToTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `qr_code_url` to the URL query string
                        if (getQrCodeUrl() != null) {
                        try {
                        joiner.add(String.format("%sqr_code_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQrCodeUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

