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
import com.hyperswitch.client.model.PayLaterDataOneOf;
import com.hyperswitch.client.model.PayLaterDataOneOf1;
import com.hyperswitch.client.model.PayLaterDataOneOf1KlarnaSdk;
import com.hyperswitch.client.model.PayLaterDataOneOf2;
import com.hyperswitch.client.model.PayLaterDataOneOf3;
import com.hyperswitch.client.model.PayLaterDataOneOf3AfterpayClearpayRedirect;
import com.hyperswitch.client.model.PayLaterDataOneOf4;
import com.hyperswitch.client.model.PayLaterDataOneOf5;
import com.hyperswitch.client.model.PayLaterDataOneOf6;
import com.hyperswitch.client.model.PayLaterDataOneOf7;
import com.hyperswitch.client.model.PayLaterDataOneOfKlarnaRedirect;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PayLaterData
 */
@JsonPropertyOrder({
  PayLaterData.JSON_PROPERTY_KLARNA_REDIRECT,
  PayLaterData.JSON_PROPERTY_KLARNA_SDK,
  PayLaterData.JSON_PROPERTY_AFFIRM_REDIRECT,
  PayLaterData.JSON_PROPERTY_AFTERPAY_CLEARPAY_REDIRECT,
  PayLaterData.JSON_PROPERTY_PAY_BRIGHT_REDIRECT,
  PayLaterData.JSON_PROPERTY_WALLEY_REDIRECT,
  PayLaterData.JSON_PROPERTY_ALMA_REDIRECT,
  PayLaterData.JSON_PROPERTY_ATOME_REDIRECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PayLaterData {
  public static final String JSON_PROPERTY_KLARNA_REDIRECT = "klarna_redirect";
  @javax.annotation.Nonnull
  private PayLaterDataOneOfKlarnaRedirect klarnaRedirect;

  public static final String JSON_PROPERTY_KLARNA_SDK = "klarna_sdk";
  @javax.annotation.Nonnull
  private PayLaterDataOneOf1KlarnaSdk klarnaSdk;

  public static final String JSON_PROPERTY_AFFIRM_REDIRECT = "affirm_redirect";
  @javax.annotation.Nonnull
  private Object affirmRedirect;

  public static final String JSON_PROPERTY_AFTERPAY_CLEARPAY_REDIRECT = "afterpay_clearpay_redirect";
  @javax.annotation.Nonnull
  private PayLaterDataOneOf3AfterpayClearpayRedirect afterpayClearpayRedirect;

  public static final String JSON_PROPERTY_PAY_BRIGHT_REDIRECT = "pay_bright_redirect";
  @javax.annotation.Nonnull
  private Object payBrightRedirect;

  public static final String JSON_PROPERTY_WALLEY_REDIRECT = "walley_redirect";
  @javax.annotation.Nonnull
  private Object walleyRedirect;

  public static final String JSON_PROPERTY_ALMA_REDIRECT = "alma_redirect";
  @javax.annotation.Nonnull
  private Object almaRedirect;

  public static final String JSON_PROPERTY_ATOME_REDIRECT = "atome_redirect";
  @javax.annotation.Nonnull
  private Object atomeRedirect;

  public PayLaterData() {
  }

  public PayLaterData klarnaRedirect(@javax.annotation.Nonnull PayLaterDataOneOfKlarnaRedirect klarnaRedirect) {
    
    this.klarnaRedirect = klarnaRedirect;
    return this;
  }

  /**
   * Get klarnaRedirect
   * @return klarnaRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KLARNA_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayLaterDataOneOfKlarnaRedirect getKlarnaRedirect() {
    return klarnaRedirect;
  }


  @JsonProperty(JSON_PROPERTY_KLARNA_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKlarnaRedirect(@javax.annotation.Nonnull PayLaterDataOneOfKlarnaRedirect klarnaRedirect) {
    this.klarnaRedirect = klarnaRedirect;
  }

  public PayLaterData klarnaSdk(@javax.annotation.Nonnull PayLaterDataOneOf1KlarnaSdk klarnaSdk) {
    
    this.klarnaSdk = klarnaSdk;
    return this;
  }

  /**
   * Get klarnaSdk
   * @return klarnaSdk
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KLARNA_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayLaterDataOneOf1KlarnaSdk getKlarnaSdk() {
    return klarnaSdk;
  }


  @JsonProperty(JSON_PROPERTY_KLARNA_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKlarnaSdk(@javax.annotation.Nonnull PayLaterDataOneOf1KlarnaSdk klarnaSdk) {
    this.klarnaSdk = klarnaSdk;
  }

  public PayLaterData affirmRedirect(@javax.annotation.Nonnull Object affirmRedirect) {
    
    this.affirmRedirect = affirmRedirect;
    return this;
  }

  /**
   * For Affirm redirect as PayLater Option
   * @return affirmRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AFFIRM_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAffirmRedirect() {
    return affirmRedirect;
  }


  @JsonProperty(JSON_PROPERTY_AFFIRM_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAffirmRedirect(@javax.annotation.Nonnull Object affirmRedirect) {
    this.affirmRedirect = affirmRedirect;
  }

  public PayLaterData afterpayClearpayRedirect(@javax.annotation.Nonnull PayLaterDataOneOf3AfterpayClearpayRedirect afterpayClearpayRedirect) {
    
    this.afterpayClearpayRedirect = afterpayClearpayRedirect;
    return this;
  }

  /**
   * Get afterpayClearpayRedirect
   * @return afterpayClearpayRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AFTERPAY_CLEARPAY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayLaterDataOneOf3AfterpayClearpayRedirect getAfterpayClearpayRedirect() {
    return afterpayClearpayRedirect;
  }


  @JsonProperty(JSON_PROPERTY_AFTERPAY_CLEARPAY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAfterpayClearpayRedirect(@javax.annotation.Nonnull PayLaterDataOneOf3AfterpayClearpayRedirect afterpayClearpayRedirect) {
    this.afterpayClearpayRedirect = afterpayClearpayRedirect;
  }

  public PayLaterData payBrightRedirect(@javax.annotation.Nonnull Object payBrightRedirect) {
    
    this.payBrightRedirect = payBrightRedirect;
    return this;
  }

  /**
   * For PayBright Redirect as PayLater Option
   * @return payBrightRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_BRIGHT_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPayBrightRedirect() {
    return payBrightRedirect;
  }


  @JsonProperty(JSON_PROPERTY_PAY_BRIGHT_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayBrightRedirect(@javax.annotation.Nonnull Object payBrightRedirect) {
    this.payBrightRedirect = payBrightRedirect;
  }

  public PayLaterData walleyRedirect(@javax.annotation.Nonnull Object walleyRedirect) {
    
    this.walleyRedirect = walleyRedirect;
    return this;
  }

  /**
   * For WalleyRedirect as PayLater Option
   * @return walleyRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLEY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getWalleyRedirect() {
    return walleyRedirect;
  }


  @JsonProperty(JSON_PROPERTY_WALLEY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalleyRedirect(@javax.annotation.Nonnull Object walleyRedirect) {
    this.walleyRedirect = walleyRedirect;
  }

  public PayLaterData almaRedirect(@javax.annotation.Nonnull Object almaRedirect) {
    
    this.almaRedirect = almaRedirect;
    return this;
  }

  /**
   * For Alma Redirection as PayLater Option
   * @return almaRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALMA_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAlmaRedirect() {
    return almaRedirect;
  }


  @JsonProperty(JSON_PROPERTY_ALMA_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlmaRedirect(@javax.annotation.Nonnull Object almaRedirect) {
    this.almaRedirect = almaRedirect;
  }

  public PayLaterData atomeRedirect(@javax.annotation.Nonnull Object atomeRedirect) {
    
    this.atomeRedirect = atomeRedirect;
    return this;
  }

  /**
   * Get atomeRedirect
   * @return atomeRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATOME_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAtomeRedirect() {
    return atomeRedirect;
  }


  @JsonProperty(JSON_PROPERTY_ATOME_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtomeRedirect(@javax.annotation.Nonnull Object atomeRedirect) {
    this.atomeRedirect = atomeRedirect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayLaterData payLaterData = (PayLaterData) o;
    return Objects.equals(this.klarnaRedirect, payLaterData.klarnaRedirect) &&
        Objects.equals(this.klarnaSdk, payLaterData.klarnaSdk) &&
        Objects.equals(this.affirmRedirect, payLaterData.affirmRedirect) &&
        Objects.equals(this.afterpayClearpayRedirect, payLaterData.afterpayClearpayRedirect) &&
        Objects.equals(this.payBrightRedirect, payLaterData.payBrightRedirect) &&
        Objects.equals(this.walleyRedirect, payLaterData.walleyRedirect) &&
        Objects.equals(this.almaRedirect, payLaterData.almaRedirect) &&
        Objects.equals(this.atomeRedirect, payLaterData.atomeRedirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(klarnaRedirect, klarnaSdk, affirmRedirect, afterpayClearpayRedirect, payBrightRedirect, walleyRedirect, almaRedirect, atomeRedirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayLaterData {\n");
    sb.append("    klarnaRedirect: ").append(toIndentedString(klarnaRedirect)).append("\n");
    sb.append("    klarnaSdk: ").append(toIndentedString(klarnaSdk)).append("\n");
    sb.append("    affirmRedirect: ").append(toIndentedString(affirmRedirect)).append("\n");
    sb.append("    afterpayClearpayRedirect: ").append(toIndentedString(afterpayClearpayRedirect)).append("\n");
    sb.append("    payBrightRedirect: ").append(toIndentedString(payBrightRedirect)).append("\n");
    sb.append("    walleyRedirect: ").append(toIndentedString(walleyRedirect)).append("\n");
    sb.append("    almaRedirect: ").append(toIndentedString(almaRedirect)).append("\n");
    sb.append("    atomeRedirect: ").append(toIndentedString(atomeRedirect)).append("\n");
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

    // add `klarna_redirect` to the URL query string
    if (getKlarnaRedirect() != null) {
      joiner.add(getKlarnaRedirect().toUrlQueryString(prefix + "klarna_redirect" + suffix));
    }

    // add `klarna_sdk` to the URL query string
    if (getKlarnaSdk() != null) {
      joiner.add(getKlarnaSdk().toUrlQueryString(prefix + "klarna_sdk" + suffix));
    }

    // add `affirm_redirect` to the URL query string
    if (getAffirmRedirect() != null) {
      try {
        joiner.add(String.format("%saffirm_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAffirmRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `afterpay_clearpay_redirect` to the URL query string
    if (getAfterpayClearpayRedirect() != null) {
      joiner.add(getAfterpayClearpayRedirect().toUrlQueryString(prefix + "afterpay_clearpay_redirect" + suffix));
    }

    // add `pay_bright_redirect` to the URL query string
    if (getPayBrightRedirect() != null) {
      try {
        joiner.add(String.format("%spay_bright_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayBrightRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `walley_redirect` to the URL query string
    if (getWalleyRedirect() != null) {
      try {
        joiner.add(String.format("%swalley_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalleyRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `alma_redirect` to the URL query string
    if (getAlmaRedirect() != null) {
      try {
        joiner.add(String.format("%salma_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlmaRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `atome_redirect` to the URL query string
    if (getAtomeRedirect() != null) {
      try {
        joiner.add(String.format("%satome_redirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAtomeRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

