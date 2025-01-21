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
 * CardRedirectResponse
 */
@JsonPropertyOrder({
  CardRedirectResponse.JSON_PROPERTY_KNET,
  CardRedirectResponse.JSON_PROPERTY_BENEFIT,
  CardRedirectResponse.JSON_PROPERTY_MOMO_ATM,
  CardRedirectResponse.JSON_PROPERTY_CARD_REDIRECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CardRedirectResponse {
  public static final String JSON_PROPERTY_KNET = "knet";
  @javax.annotation.Nonnull
  private Object knet;

  public static final String JSON_PROPERTY_BENEFIT = "benefit";
  @javax.annotation.Nonnull
  private Object benefit;

  public static final String JSON_PROPERTY_MOMO_ATM = "momo_atm";
  @javax.annotation.Nonnull
  private Object momoAtm;

  public static final String JSON_PROPERTY_CARD_REDIRECT = "card_redirect";
  @javax.annotation.Nonnull
  private Object cardRedirect;

  public CardRedirectResponse() {
  }

  public CardRedirectResponse knet(@javax.annotation.Nonnull Object knet) {
    
    this.knet = knet;
    return this;
  }

  /**
   * Get knet
   * @return knet
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getKnet() {
    return knet;
  }


  @JsonProperty(JSON_PROPERTY_KNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKnet(@javax.annotation.Nonnull Object knet) {
    this.knet = knet;
  }

  public CardRedirectResponse benefit(@javax.annotation.Nonnull Object benefit) {
    
    this.benefit = benefit;
    return this;
  }

  /**
   * Get benefit
   * @return benefit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBenefit() {
    return benefit;
  }


  @JsonProperty(JSON_PROPERTY_BENEFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBenefit(@javax.annotation.Nonnull Object benefit) {
    this.benefit = benefit;
  }

  public CardRedirectResponse momoAtm(@javax.annotation.Nonnull Object momoAtm) {
    
    this.momoAtm = momoAtm;
    return this;
  }

  /**
   * Get momoAtm
   * @return momoAtm
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MOMO_ATM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMomoAtm() {
    return momoAtm;
  }


  @JsonProperty(JSON_PROPERTY_MOMO_ATM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMomoAtm(@javax.annotation.Nonnull Object momoAtm) {
    this.momoAtm = momoAtm;
  }

  public CardRedirectResponse cardRedirect(@javax.annotation.Nonnull Object cardRedirect) {
    
    this.cardRedirect = cardRedirect;
    return this;
  }

  /**
   * Get cardRedirect
   * @return cardRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCardRedirect() {
    return cardRedirect;
  }


  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(@javax.annotation.Nonnull Object cardRedirect) {
    this.cardRedirect = cardRedirect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardRedirectResponse cardRedirectResponse = (CardRedirectResponse) o;
    return Objects.equals(this.knet, cardRedirectResponse.knet) &&
        Objects.equals(this.benefit, cardRedirectResponse.benefit) &&
        Objects.equals(this.momoAtm, cardRedirectResponse.momoAtm) &&
        Objects.equals(this.cardRedirect, cardRedirectResponse.cardRedirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knet, benefit, momoAtm, cardRedirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRedirectResponse {\n");
    sb.append("    knet: ").append(toIndentedString(knet)).append("\n");
    sb.append("    benefit: ").append(toIndentedString(benefit)).append("\n");
    sb.append("    momoAtm: ").append(toIndentedString(momoAtm)).append("\n");
    sb.append("    cardRedirect: ").append(toIndentedString(cardRedirect)).append("\n");
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

    // add `knet` to the URL query string
    if (getKnet() != null) {
      try {
        joiner.add(String.format("%sknet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKnet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `benefit` to the URL query string
    if (getBenefit() != null) {
      try {
        joiner.add(String.format("%sbenefit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBenefit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `momo_atm` to the URL query string
    if (getMomoAtm() != null) {
      try {
        joiner.add(String.format("%smomo_atm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMomoAtm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `card_redirect` to the URL query string
    if (getCardRedirect() != null) {
      try {
        joiner.add(String.format("%scard_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

