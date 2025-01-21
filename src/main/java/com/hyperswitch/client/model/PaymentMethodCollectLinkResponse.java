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
import com.hyperswitch.client.model.EnabledPaymentMethod;
import java.time.OffsetDateTime;
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
 * PaymentMethodCollectLinkResponse
 */
@JsonPropertyOrder({
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_LOGO,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_MERCHANT_NAME,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_THEME,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_PM_COLLECT_LINK_ID,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_CUSTOMER_ID,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_EXPIRY,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_LINK,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_RETURN_URL,
  PaymentMethodCollectLinkResponse.JSON_PROPERTY_ENABLED_PAYMENT_METHODS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentMethodCollectLinkResponse {
  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  @javax.annotation.Nullable
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THEME = "theme";
  @javax.annotation.Nullable
  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PM_COLLECT_LINK_ID = "pm_collect_link_id";
  @javax.annotation.Nonnull
  private String pmCollectLinkId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  @javax.annotation.Nonnull
  private String customerId;

  public static final String JSON_PROPERTY_EXPIRY = "expiry";
  @javax.annotation.Nonnull
  private OffsetDateTime expiry;

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nonnull
  private String link;

  public static final String JSON_PROPERTY_RETURN_URL = "return_url";
  @javax.annotation.Nullable
  private JsonNullable<String> returnUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED_PAYMENT_METHODS = "enabled_payment_methods";
  @javax.annotation.Nullable
  private JsonNullable<List<EnabledPaymentMethod>> enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>undefined();

  public PaymentMethodCollectLinkResponse() {
  }

  public PaymentMethodCollectLinkResponse logo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
    
    return this;
  }

  /**
   * Merchant&#39;s display logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogo() {
        return logo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogo_JsonNullable() {
    return logo;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO)
  public void setLogo_JsonNullable(JsonNullable<String> logo) {
    this.logo = logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }

  public PaymentMethodCollectLinkResponse merchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
    
    return this;
  }

  /**
   * Custom merchant name for the link
   * @return merchantName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantName() {
        return merchantName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantName_JsonNullable() {
    return merchantName;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  public void setMerchantName_JsonNullable(JsonNullable<String> merchantName) {
    this.merchantName = merchantName;
  }

  public void setMerchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
  }

  public PaymentMethodCollectLinkResponse theme(@javax.annotation.Nullable String theme) {
    this.theme = JsonNullable.<String>of(theme);
    
    return this;
  }

  /**
   * Primary color to be used in the form represented in hex format
   * @return theme
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTheme() {
        return theme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTheme_JsonNullable() {
    return theme;
  }
  
  @JsonProperty(JSON_PROPERTY_THEME)
  public void setTheme_JsonNullable(JsonNullable<String> theme) {
    this.theme = theme;
  }

  public void setTheme(@javax.annotation.Nullable String theme) {
    this.theme = JsonNullable.<String>of(theme);
  }

  public PaymentMethodCollectLinkResponse pmCollectLinkId(@javax.annotation.Nonnull String pmCollectLinkId) {
    
    this.pmCollectLinkId = pmCollectLinkId;
    return this;
  }

  /**
   * The unique identifier for the collect link.
   * @return pmCollectLinkId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PM_COLLECT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPmCollectLinkId() {
    return pmCollectLinkId;
  }


  @JsonProperty(JSON_PROPERTY_PM_COLLECT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPmCollectLinkId(@javax.annotation.Nonnull String pmCollectLinkId) {
    this.pmCollectLinkId = pmCollectLinkId;
  }

  public PaymentMethodCollectLinkResponse customerId(@javax.annotation.Nonnull String customerId) {
    
    this.customerId = customerId;
    return this;
  }

  /**
   * The unique identifier of the customer.
   * @return customerId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerId(@javax.annotation.Nonnull String customerId) {
    this.customerId = customerId;
  }

  public PaymentMethodCollectLinkResponse expiry(@javax.annotation.Nonnull OffsetDateTime expiry) {
    
    this.expiry = expiry;
    return this;
  }

  /**
   * Time when this link will be expired in ISO8601 format
   * @return expiry
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExpiry() {
    return expiry;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiry(@javax.annotation.Nonnull OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public PaymentMethodCollectLinkResponse link(@javax.annotation.Nonnull String link) {
    
    this.link = link;
    return this;
  }

  /**
   * URL to the form&#39;s link generated for collecting payment method details.
   * @return link
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLink(@javax.annotation.Nonnull String link) {
    this.link = link;
  }

  public PaymentMethodCollectLinkResponse returnUrl(@javax.annotation.Nullable String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
    
    return this;
  }

  /**
   * Redirect to this URL post completion
   * @return returnUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReturnUrl() {
        return returnUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReturnUrl_JsonNullable() {
    return returnUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  public void setReturnUrl_JsonNullable(JsonNullable<String> returnUrl) {
    this.returnUrl = returnUrl;
  }

  public void setReturnUrl(@javax.annotation.Nullable String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
  }

  public PaymentMethodCollectLinkResponse enabledPaymentMethods(@javax.annotation.Nullable List<EnabledPaymentMethod> enabledPaymentMethods) {
    this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(enabledPaymentMethods);
    
    return this;
  }

  public PaymentMethodCollectLinkResponse addEnabledPaymentMethodsItem(EnabledPaymentMethod enabledPaymentMethodsItem) {
    if (this.enabledPaymentMethods == null || !this.enabledPaymentMethods.isPresent()) {
      this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(new ArrayList<>());
    }
    try {
      this.enabledPaymentMethods.get().add(enabledPaymentMethodsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of payment methods shown on collect UI
   * @return enabledPaymentMethods
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<EnabledPaymentMethod> getEnabledPaymentMethods() {
        return enabledPaymentMethods.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<EnabledPaymentMethod>> getEnabledPaymentMethods_JsonNullable() {
    return enabledPaymentMethods;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED_PAYMENT_METHODS)
  public void setEnabledPaymentMethods_JsonNullable(JsonNullable<List<EnabledPaymentMethod>> enabledPaymentMethods) {
    this.enabledPaymentMethods = enabledPaymentMethods;
  }

  public void setEnabledPaymentMethods(@javax.annotation.Nullable List<EnabledPaymentMethod> enabledPaymentMethods) {
    this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(enabledPaymentMethods);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCollectLinkResponse paymentMethodCollectLinkResponse = (PaymentMethodCollectLinkResponse) o;
    return equalsNullable(this.logo, paymentMethodCollectLinkResponse.logo) &&
        equalsNullable(this.merchantName, paymentMethodCollectLinkResponse.merchantName) &&
        equalsNullable(this.theme, paymentMethodCollectLinkResponse.theme) &&
        Objects.equals(this.pmCollectLinkId, paymentMethodCollectLinkResponse.pmCollectLinkId) &&
        Objects.equals(this.customerId, paymentMethodCollectLinkResponse.customerId) &&
        Objects.equals(this.expiry, paymentMethodCollectLinkResponse.expiry) &&
        Objects.equals(this.link, paymentMethodCollectLinkResponse.link) &&
        equalsNullable(this.returnUrl, paymentMethodCollectLinkResponse.returnUrl) &&
        equalsNullable(this.enabledPaymentMethods, paymentMethodCollectLinkResponse.enabledPaymentMethods);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(logo), hashCodeNullable(merchantName), hashCodeNullable(theme), pmCollectLinkId, customerId, expiry, link, hashCodeNullable(returnUrl), hashCodeNullable(enabledPaymentMethods));
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
    sb.append("class PaymentMethodCollectLinkResponse {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    pmCollectLinkId: ").append(toIndentedString(pmCollectLinkId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    enabledPaymentMethods: ").append(toIndentedString(enabledPaymentMethods)).append("\n");
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant_name` to the URL query string
    if (getMerchantName() != null) {
      try {
        joiner.add(String.format("%smerchant_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `theme` to the URL query string
    if (getTheme() != null) {
      try {
        joiner.add(String.format("%stheme%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTheme()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pm_collect_link_id` to the URL query string
    if (getPmCollectLinkId() != null) {
      try {
        joiner.add(String.format("%spm_collect_link_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPmCollectLinkId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customer_id` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomer_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expiry` to the URL query string
    if (getExpiry() != null) {
      try {
        joiner.add(String.format("%sexpiry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `return_url` to the URL query string
    if (getReturnUrl() != null) {
      try {
        joiner.add(String.format("%sreturn_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled_payment_methods` to the URL query string
    if (getEnabledPaymentMethods() != null) {
      for (int i = 0; i < getEnabledPaymentMethods().size(); i++) {
        if (getEnabledPaymentMethods().get(i) != null) {
          joiner.add(getEnabledPaymentMethods().get(i).toUrlQueryString(String.format("%senabled_payment_methods%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

