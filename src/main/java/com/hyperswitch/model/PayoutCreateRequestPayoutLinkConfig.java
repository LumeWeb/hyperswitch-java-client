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


package com.hyperswitch.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.EnabledPaymentMethod;
import com.hyperswitch.model.PayoutCreatePayoutLinkConfig;
import com.hyperswitch.model.UIWidgetFormLayout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PayoutCreateRequestPayoutLinkConfig
 */
@JsonPropertyOrder({
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_LOGO,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_MERCHANT_NAME,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_THEME,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_PAYOUT_LINK_ID,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_ENABLED_PAYMENT_METHODS,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_FORM_LAYOUT,
  PayoutCreateRequestPayoutLinkConfig.JSON_PROPERTY_TEST_MODE
})
@JsonTypeName("PayoutCreateRequest_payout_link_config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutCreateRequestPayoutLinkConfig {
  public static final String JSON_PROPERTY_LOGO = "logo";
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THEME = "theme";
  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYOUT_LINK_ID = "payout_link_id";
  private JsonNullable<String> payoutLinkId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED_PAYMENT_METHODS = "enabled_payment_methods";
  private JsonNullable<List<EnabledPaymentMethod>> enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>undefined();

  public static final String JSON_PROPERTY_FORM_LAYOUT = "form_layout";
  private JsonNullable<UIWidgetFormLayout> formLayout = JsonNullable.<UIWidgetFormLayout>undefined();

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  private JsonNullable<Boolean> testMode = JsonNullable.<Boolean>undefined();

  public PayoutCreateRequestPayoutLinkConfig() { 
  }

  public PayoutCreateRequestPayoutLinkConfig logo(String logo) {
    this.logo = JsonNullable.<String>of(logo);
    
    return this;
  }

   /**
   * Merchant&#39;s display logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://hyperswitch.io/favicon.ico", value = "Merchant's display logo")
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

  public void setLogo(String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }


  public PayoutCreateRequestPayoutLinkConfig merchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
    
    return this;
  }

   /**
   * Custom merchant name for the link
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hyperswitch", value = "Custom merchant name for the link")
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

  public void setMerchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
  }


  public PayoutCreateRequestPayoutLinkConfig theme(String theme) {
    this.theme = JsonNullable.<String>of(theme);
    
    return this;
  }

   /**
   * Primary color to be used in the form represented in hex format
   * @return theme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#4285F4", value = "Primary color to be used in the form represented in hex format")
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

  public void setTheme(String theme) {
    this.theme = JsonNullable.<String>of(theme);
  }


  public PayoutCreateRequestPayoutLinkConfig payoutLinkId(String payoutLinkId) {
    this.payoutLinkId = JsonNullable.<String>of(payoutLinkId);
    
    return this;
  }

   /**
   * The unique identifier for the collect link.
   * @return payoutLinkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pm_collect_link_2bdacf398vwzq5n422S1", value = "The unique identifier for the collect link.")
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

  public void setPayoutLinkId(String payoutLinkId) {
    this.payoutLinkId = JsonNullable.<String>of(payoutLinkId);
  }


  public PayoutCreateRequestPayoutLinkConfig enabledPaymentMethods(List<EnabledPaymentMethod> enabledPaymentMethods) {
    this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(enabledPaymentMethods);
    
    return this;
  }

  public PayoutCreateRequestPayoutLinkConfig addEnabledPaymentMethodsItem(EnabledPaymentMethod enabledPaymentMethodsItem) {
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"payment_method\": \"bank_transfer\", \"payment_method_types\": [\"ach\", \"bacs\"]}]", value = "List of payout methods shown on collect UI")
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

  public void setEnabledPaymentMethods(List<EnabledPaymentMethod> enabledPaymentMethods) {
    this.enabledPaymentMethods = JsonNullable.<List<EnabledPaymentMethod>>of(enabledPaymentMethods);
  }


  public PayoutCreateRequestPayoutLinkConfig formLayout(UIWidgetFormLayout formLayout) {
    this.formLayout = JsonNullable.<UIWidgetFormLayout>of(formLayout);
    
    return this;
  }

   /**
   * Get formLayout
   * @return formLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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

  public void setFormLayout(UIWidgetFormLayout formLayout) {
    this.formLayout = JsonNullable.<UIWidgetFormLayout>of(formLayout);
  }


  public PayoutCreateRequestPayoutLinkConfig testMode(Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
    
    return this;
  }

   /**
   * &#x60;test_mode&#x60; allows for opening payout links without any restrictions. This removes - domain name validations - check for making sure link is accessed within an iframe
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "`test_mode` allows for opening payout links without any restrictions. This removes - domain name validations - check for making sure link is accessed within an iframe")
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

  public void setTestMode(Boolean testMode) {
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
    PayoutCreateRequestPayoutLinkConfig payoutCreateRequestPayoutLinkConfig = (PayoutCreateRequestPayoutLinkConfig) o;
    return equalsNullable(this.logo, payoutCreateRequestPayoutLinkConfig.logo) &&
        equalsNullable(this.merchantName, payoutCreateRequestPayoutLinkConfig.merchantName) &&
        equalsNullable(this.theme, payoutCreateRequestPayoutLinkConfig.theme) &&
        equalsNullable(this.payoutLinkId, payoutCreateRequestPayoutLinkConfig.payoutLinkId) &&
        equalsNullable(this.enabledPaymentMethods, payoutCreateRequestPayoutLinkConfig.enabledPaymentMethods) &&
        equalsNullable(this.formLayout, payoutCreateRequestPayoutLinkConfig.formLayout) &&
        equalsNullable(this.testMode, payoutCreateRequestPayoutLinkConfig.testMode);
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
    sb.append("class PayoutCreateRequestPayoutLinkConfig {\n");
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

}

