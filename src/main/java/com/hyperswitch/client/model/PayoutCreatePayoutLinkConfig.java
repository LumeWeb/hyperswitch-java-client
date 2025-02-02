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
import com.hyperswitch.client.model.UIWidgetFormLayout;
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
 * Custom payout link config for the particular payout, if payout link is to be generated.
 */
@JsonPropertyOrder({
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_LOGO,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_MERCHANT_NAME,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_THEME,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_PAYOUT_LINK_ID,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_ENABLED_PAYMENT_METHODS,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_FORM_LAYOUT,
  PayoutCreatePayoutLinkConfig.JSON_PROPERTY_TEST_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PayoutCreatePayoutLinkConfig {
  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  @javax.annotation.Nullable
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THEME = "theme";
  @javax.annotation.Nullable
  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYOUT_LINK_ID = "payout_link_id";
  @javax.annotation.Nullable
  private JsonNullable<String> payoutLinkId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED_PAYMENT_METHODS = "enabled_payment_methods";
  @javax.annotation.Nullable
  private JsonNullable<List<EnabledPaymentMethod>> enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>undefined();

  public static final String JSON_PROPERTY_FORM_LAYOUT = "form_layout";
  @javax.annotation.Nullable
  private JsonNullable<UIWidgetFormLayout> formLayout = JsonNullable.<UIWidgetFormLayout>undefined();

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> testMode = JsonNullable.<Boolean>undefined();

  public PayoutCreatePayoutLinkConfig() {
  }

  public PayoutCreatePayoutLinkConfig logo(@javax.annotation.Nullable String logo) {
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

  public PayoutCreatePayoutLinkConfig merchantName(@javax.annotation.Nullable String merchantName) {
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

  public PayoutCreatePayoutLinkConfig theme(@javax.annotation.Nullable String theme) {
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

  public PayoutCreatePayoutLinkConfig payoutLinkId(@javax.annotation.Nullable String payoutLinkId) {
    this.payoutLinkId = JsonNullable.<String>of(payoutLinkId);
    
    return this;
  }

  /**
   * The unique identifier for the collect link.
   * @return payoutLinkId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPayoutLinkId() {
        return payoutLinkId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPayoutLinkId_JsonNullable() {
    return payoutLinkId;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYOUT_LINK_ID)
  public void setPayoutLinkId_JsonNullable(JsonNullable<String> payoutLinkId) {
    this.payoutLinkId = payoutLinkId;
  }

  public void setPayoutLinkId(@javax.annotation.Nullable String payoutLinkId) {
    this.payoutLinkId = JsonNullable.<String>of(payoutLinkId);
  }

  public PayoutCreatePayoutLinkConfig enabledPaymentMethods(@javax.annotation.Nullable List<EnabledPaymentMethod> enabledPaymentMethods) {
    this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(enabledPaymentMethods);
    
    return this;
  }

  public PayoutCreatePayoutLinkConfig addEnabledPaymentMethodsItem(EnabledPaymentMethod enabledPaymentMethodsItem) {
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
   * List of payout methods shown on collect UI
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

  public PayoutCreatePayoutLinkConfig formLayout(@javax.annotation.Nullable UIWidgetFormLayout formLayout) {
    this.formLayout = JsonNullable.<UIWidgetFormLayout>of(formLayout);
    
    return this;
  }

  /**
   * Get formLayout
   * @return formLayout
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public UIWidgetFormLayout getFormLayout() {
        return formLayout.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORM_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UIWidgetFormLayout> getFormLayout_JsonNullable() {
    return formLayout;
  }
  
  @JsonProperty(JSON_PROPERTY_FORM_LAYOUT)
  public void setFormLayout_JsonNullable(JsonNullable<UIWidgetFormLayout> formLayout) {
    this.formLayout = formLayout;
  }

  public void setFormLayout(@javax.annotation.Nullable UIWidgetFormLayout formLayout) {
    this.formLayout = JsonNullable.<UIWidgetFormLayout>of(formLayout);
  }

  public PayoutCreatePayoutLinkConfig testMode(@javax.annotation.Nullable Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
    
    return this;
  }

  /**
   * &#x60;test_mode&#x60; allows for opening payout links without any restrictions. This removes - domain name validations - check for making sure link is accessed within an iframe
   * @return testMode
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getTestMode() {
        return testMode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getTestMode_JsonNullable() {
    return testMode;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  public void setTestMode_JsonNullable(JsonNullable<Boolean> testMode) {
    this.testMode = testMode;
  }

  public void setTestMode(@javax.annotation.Nullable Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutCreatePayoutLinkConfig payoutCreatePayoutLinkConfig = (PayoutCreatePayoutLinkConfig) o;
    return equalsNullable(this.logo, payoutCreatePayoutLinkConfig.logo) &&
        equalsNullable(this.merchantName, payoutCreatePayoutLinkConfig.merchantName) &&
        equalsNullable(this.theme, payoutCreatePayoutLinkConfig.theme) &&
        equalsNullable(this.payoutLinkId, payoutCreatePayoutLinkConfig.payoutLinkId) &&
        equalsNullable(this.enabledPaymentMethods, payoutCreatePayoutLinkConfig.enabledPaymentMethods) &&
        equalsNullable(this.formLayout, payoutCreatePayoutLinkConfig.formLayout) &&
        equalsNullable(this.testMode, payoutCreatePayoutLinkConfig.testMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(logo), hashCodeNullable(merchantName), hashCodeNullable(theme), hashCodeNullable(payoutLinkId), hashCodeNullable(enabledPaymentMethods), hashCodeNullable(formLayout), hashCodeNullable(testMode));
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
    sb.append("class PayoutCreatePayoutLinkConfig {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    payoutLinkId: ").append(toIndentedString(payoutLinkId)).append("\n");
    sb.append("    enabledPaymentMethods: ").append(toIndentedString(enabledPaymentMethods)).append("\n");
    sb.append("    formLayout: ").append(toIndentedString(formLayout)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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

    // add `payout_link_id` to the URL query string
    if (getPayoutLinkId() != null) {
      try {
        joiner.add(String.format("%spayout_link_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayoutLinkId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `form_layout` to the URL query string
    if (getFormLayout() != null) {
      try {
        joiner.add(String.format("%sform_layout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormLayout()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `test_mode` to the URL query string
    if (getTestMode() != null) {
      try {
        joiner.add(String.format("%stest_mode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTestMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

