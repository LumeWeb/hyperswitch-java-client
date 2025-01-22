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
import com.hyperswitch.client.model.CountryAlpha2;
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
* GiropayBankRedirectAdditionalData
*/
    @JsonPropertyOrder({
        GiropayBankRedirectAdditionalData.JSON_PROPERTY_BIC,
        GiropayBankRedirectAdditionalData.JSON_PROPERTY_IBAN,
        GiropayBankRedirectAdditionalData.JSON_PROPERTY_COUNTRY
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GiropayBankRedirectAdditionalData {
        public static final String JSON_PROPERTY_BIC = "bic";
    @javax.annotation.Nullable
            private JsonNullable<String> bic = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_IBAN = "iban";
    @javax.annotation.Nullable
            private JsonNullable<String> iban = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_COUNTRY = "country";
    @javax.annotation.Nullable
            private JsonNullable<CountryAlpha2> country = JsonNullable.<CountryAlpha2>undefined();

public GiropayBankRedirectAdditionalData() {
}

        public GiropayBankRedirectAdditionalData bic(@javax.annotation.Nullable String bic) {
        this.bic = JsonNullable.<String>of(bic);
        
        return this;
        }

    /**
        * Masked bank account bic code
    * @return bic
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getBic() {
                return bic.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getBic_JsonNullable() {
        return bic;
        }
    
        @JsonProperty(JSON_PROPERTY_BIC)
        public void setBic_JsonNullable(JsonNullable<String> bic) {
        this.bic = bic;
        }

          public void setBic(@javax.annotation.Nullable String bic) {
            this.bic = JsonNullable.<String>of(bic);
        }

        public GiropayBankRedirectAdditionalData iban(@javax.annotation.Nullable String iban) {
        this.iban = JsonNullable.<String>of(iban);
        
        return this;
        }

    /**
        * Partially masked international bank account number (iban) for SEPA
    * @return iban
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getIban() {
                return iban.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getIban_JsonNullable() {
        return iban;
        }
    
        @JsonProperty(JSON_PROPERTY_IBAN)
        public void setIban_JsonNullable(JsonNullable<String> iban) {
        this.iban = iban;
        }

          public void setIban(@javax.annotation.Nullable String iban) {
            this.iban = JsonNullable.<String>of(iban);
        }

        public GiropayBankRedirectAdditionalData country(@javax.annotation.Nullable CountryAlpha2 country) {
        this.country = JsonNullable.<CountryAlpha2>of(country);
        
        return this;
        }

    /**
        * Get country
    * @return country
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public CountryAlpha2 getCountry() {
                return country.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<CountryAlpha2> getCountry_JsonNullable() {
        return country;
        }
    
        @JsonProperty(JSON_PROPERTY_COUNTRY)
        public void setCountry_JsonNullable(JsonNullable<CountryAlpha2> country) {
        this.country = country;
        }

          public void setCountry(@javax.annotation.Nullable CountryAlpha2 country) {
            this.country = JsonNullable.<CountryAlpha2>of(country);
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        GiropayBankRedirectAdditionalData giropayBankRedirectAdditionalData = (GiropayBankRedirectAdditionalData) o;
        return equalsNullable(this.bic, giropayBankRedirectAdditionalData.bic) &&
        equalsNullable(this.iban, giropayBankRedirectAdditionalData.iban) &&
        equalsNullable(this.country, giropayBankRedirectAdditionalData.country);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(bic), hashCodeNullable(iban), hashCodeNullable(country));
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
    sb.append("class GiropayBankRedirectAdditionalData {\n");
        sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
        sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

            // add `bic` to the URL query string
                        if (getBic() != null) {
                        try {
                        joiner.add(String.format("%sbic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBic()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `iban` to the URL query string
                        if (getIban() != null) {
                        try {
                        joiner.add(String.format("%siban%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIban()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `country` to the URL query string
                            if (getCountry() != null) {
                            try {
                            joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
                            } catch (UnsupportedEncodingException e) {
                            // Should never happen, UTF-8 is always supported
                            throw new RuntimeException(e);
                            }
                            }

        return joiner.toString();
        }

    }

