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
import com.hyperswitch.model.PaymentLinkConfigRequest;
import com.hyperswitch.model.PaymentLinkTransactionDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BusinessPaymentLinkConfig
 */
@JsonPropertyOrder({
  BusinessPaymentLinkConfig.JSON_PROPERTY_THEME,
  BusinessPaymentLinkConfig.JSON_PROPERTY_LOGO,
  BusinessPaymentLinkConfig.JSON_PROPERTY_SELLER_NAME,
  BusinessPaymentLinkConfig.JSON_PROPERTY_SDK_LAYOUT,
  BusinessPaymentLinkConfig.JSON_PROPERTY_DISPLAY_SDK_ONLY,
  BusinessPaymentLinkConfig.JSON_PROPERTY_ENABLED_SAVED_PAYMENT_METHOD,
  BusinessPaymentLinkConfig.JSON_PROPERTY_TRANSACTION_DETAILS,
  BusinessPaymentLinkConfig.JSON_PROPERTY_DOMAIN_NAME,
  BusinessPaymentLinkConfig.JSON_PROPERTY_BUSINESS_SPECIFIC_CONFIGS,
  BusinessPaymentLinkConfig.JSON_PROPERTY_ALLOWED_DOMAINS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BusinessPaymentLinkConfig {
  public static final String JSON_PROPERTY_THEME = "theme";
  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SELLER_NAME = "seller_name";
  private JsonNullable<String> sellerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SDK_LAYOUT = "sdk_layout";
  private JsonNullable<String> sdkLayout = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_SDK_ONLY = "display_sdk_only";
  private JsonNullable<Boolean> displaySdkOnly = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_ENABLED_SAVED_PAYMENT_METHOD = "enabled_saved_payment_method";
  private JsonNullable<Boolean> enabledSavedPaymentMethod = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_TRANSACTION_DETAILS = "transaction_details";
  private JsonNullable<List<PaymentLinkTransactionDetails>> transactionDetails = JsonNullable.<List<PaymentLinkTransactionDetails>>undefined();

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domain_name";
  private JsonNullable<String> domainName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUSINESS_SPECIFIC_CONFIGS = "business_specific_configs";
  private JsonNullable<Map<String, PaymentLinkConfigRequest>> businessSpecificConfigs = JsonNullable.<Map<String, PaymentLinkConfigRequest>>undefined();

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private JsonNullable<Set<String>> allowedDomains = JsonNullable.<Set<String>>undefined();

  public BusinessPaymentLinkConfig() {
  }

  public BusinessPaymentLinkConfig theme(@javax.annotation.Nullable String theme) {
    this.theme = JsonNullable.<String>of(theme);
    
    return this;
  }

  /**
   * custom theme for the payment link
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


  public BusinessPaymentLinkConfig logo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
    
    return this;
  }

  /**
   * merchant display logo
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


  public BusinessPaymentLinkConfig sellerName(@javax.annotation.Nullable String sellerName) {
    this.sellerName = JsonNullable.<String>of(sellerName);
    
    return this;
  }

  /**
   * Custom merchant name for payment link
   * @return sellerName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSellerName() {
        return sellerName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELLER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSellerName_JsonNullable() {
    return sellerName;
  }
  
  @JsonProperty(JSON_PROPERTY_SELLER_NAME)
  public void setSellerName_JsonNullable(JsonNullable<String> sellerName) {
    this.sellerName = sellerName;
  }

  public void setSellerName(@javax.annotation.Nullable String sellerName) {
    this.sellerName = JsonNullable.<String>of(sellerName);
  }


  public BusinessPaymentLinkConfig sdkLayout(@javax.annotation.Nullable String sdkLayout) {
    this.sdkLayout = JsonNullable.<String>of(sdkLayout);
    
    return this;
  }

  /**
   * Custom layout for sdk
   * @return sdkLayout
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSdkLayout() {
        return sdkLayout.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDK_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSdkLayout_JsonNullable() {
    return sdkLayout;
  }
  
  @JsonProperty(JSON_PROPERTY_SDK_LAYOUT)
  public void setSdkLayout_JsonNullable(JsonNullable<String> sdkLayout) {
    this.sdkLayout = sdkLayout;
  }

  public void setSdkLayout(@javax.annotation.Nullable String sdkLayout) {
    this.sdkLayout = JsonNullable.<String>of(sdkLayout);
  }


  public BusinessPaymentLinkConfig displaySdkOnly(@javax.annotation.Nullable Boolean displaySdkOnly) {
    this.displaySdkOnly = JsonNullable.<Boolean>of(displaySdkOnly);
    
    return this;
  }

  /**
   * Display only the sdk for payment link
   * @return displaySdkOnly
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getDisplaySdkOnly() {
        return displaySdkOnly.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_SDK_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDisplaySdkOnly_JsonNullable() {
    return displaySdkOnly;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_SDK_ONLY)
  public void setDisplaySdkOnly_JsonNullable(JsonNullable<Boolean> displaySdkOnly) {
    this.displaySdkOnly = displaySdkOnly;
  }

  public void setDisplaySdkOnly(@javax.annotation.Nullable Boolean displaySdkOnly) {
    this.displaySdkOnly = JsonNullable.<Boolean>of(displaySdkOnly);
  }


  public BusinessPaymentLinkConfig enabledSavedPaymentMethod(@javax.annotation.Nullable Boolean enabledSavedPaymentMethod) {
    this.enabledSavedPaymentMethod = JsonNullable.<Boolean>of(enabledSavedPaymentMethod);
    
    return this;
  }

  /**
   * Enable saved payment method option for payment link
   * @return enabledSavedPaymentMethod
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEnabledSavedPaymentMethod() {
        return enabledSavedPaymentMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED_SAVED_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnabledSavedPaymentMethod_JsonNullable() {
    return enabledSavedPaymentMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED_SAVED_PAYMENT_METHOD)
  public void setEnabledSavedPaymentMethod_JsonNullable(JsonNullable<Boolean> enabledSavedPaymentMethod) {
    this.enabledSavedPaymentMethod = enabledSavedPaymentMethod;
  }

  public void setEnabledSavedPaymentMethod(@javax.annotation.Nullable Boolean enabledSavedPaymentMethod) {
    this.enabledSavedPaymentMethod = JsonNullable.<Boolean>of(enabledSavedPaymentMethod);
  }


  public BusinessPaymentLinkConfig transactionDetails(@javax.annotation.Nullable List<PaymentLinkTransactionDetails> transactionDetails) {
    this.transactionDetails = JsonNullable.<List<PaymentLinkTransactionDetails>>of(transactionDetails);
    
    return this;
  }

  public BusinessPaymentLinkConfig addTransactionDetailsItem(PaymentLinkTransactionDetails transactionDetailsItem) {
    if (this.transactionDetails == null || !this.transactionDetails.isPresent()) {
      this.transactionDetails = JsonNullable.<List<PaymentLinkTransactionDetails>>of(new ArrayList<>());
    }
    try {
      this.transactionDetails.get().add(transactionDetailsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Dynamic details related to merchant to be rendered in payment link
   * @return transactionDetails
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PaymentLinkTransactionDetails> getTransactionDetails() {
        return transactionDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PaymentLinkTransactionDetails>> getTransactionDetails_JsonNullable() {
    return transactionDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DETAILS)
  public void setTransactionDetails_JsonNullable(JsonNullable<List<PaymentLinkTransactionDetails>> transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public void setTransactionDetails(@javax.annotation.Nullable List<PaymentLinkTransactionDetails> transactionDetails) {
    this.transactionDetails = JsonNullable.<List<PaymentLinkTransactionDetails>>of(transactionDetails);
  }


  public BusinessPaymentLinkConfig domainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
    
    return this;
  }

  /**
   * Custom domain name to be used for hosting the link in your own domain
   * @return domainName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDomainName() {
        return domainName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDomainName_JsonNullable() {
    return domainName;
  }
  
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  public void setDomainName_JsonNullable(JsonNullable<String> domainName) {
    this.domainName = domainName;
  }

  public void setDomainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
  }


  public BusinessPaymentLinkConfig businessSpecificConfigs(@javax.annotation.Nullable Map<String, PaymentLinkConfigRequest> businessSpecificConfigs) {
    this.businessSpecificConfigs = JsonNullable.<Map<String, PaymentLinkConfigRequest>>of(businessSpecificConfigs);
    
    return this;
  }

  public BusinessPaymentLinkConfig putBusinessSpecificConfigsItem(String key, PaymentLinkConfigRequest businessSpecificConfigsItem) {
    if (this.businessSpecificConfigs == null || !this.businessSpecificConfigs.isPresent()) {
      this.businessSpecificConfigs = JsonNullable.<Map<String, PaymentLinkConfigRequest>>of(new HashMap<>());
    }
    try {
      this.businessSpecificConfigs.get().put(key, businessSpecificConfigsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * list of configs for multi theme setup
   * @return businessSpecificConfigs
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, PaymentLinkConfigRequest> getBusinessSpecificConfigs() {
        return businessSpecificConfigs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_SPECIFIC_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, PaymentLinkConfigRequest>> getBusinessSpecificConfigs_JsonNullable() {
    return businessSpecificConfigs;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_SPECIFIC_CONFIGS)
  public void setBusinessSpecificConfigs_JsonNullable(JsonNullable<Map<String, PaymentLinkConfigRequest>> businessSpecificConfigs) {
    this.businessSpecificConfigs = businessSpecificConfigs;
  }

  public void setBusinessSpecificConfigs(@javax.annotation.Nullable Map<String, PaymentLinkConfigRequest> businessSpecificConfigs) {
    this.businessSpecificConfigs = JsonNullable.<Map<String, PaymentLinkConfigRequest>>of(businessSpecificConfigs);
  }


  public BusinessPaymentLinkConfig allowedDomains(@javax.annotation.Nullable Set<String> allowedDomains) {
    this.allowedDomains = JsonNullable.<Set<String>>of(allowedDomains);
    
    return this;
  }

  public BusinessPaymentLinkConfig addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null || !this.allowedDomains.isPresent()) {
      this.allowedDomains = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.allowedDomains.get().add(allowedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of allowed domains (glob patterns) where this link can be embedded / opened from
   * @return allowedDomains
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Set<String> getAllowedDomains() {
        return allowedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getAllowedDomains_JsonNullable() {
    return allowedDomains;
  }
  
  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  public void setAllowedDomains_JsonNullable(JsonNullable<Set<String>> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  public void setAllowedDomains(@javax.annotation.Nullable Set<String> allowedDomains) {
    this.allowedDomains = JsonNullable.<Set<String>>of(allowedDomains);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPaymentLinkConfig businessPaymentLinkConfig = (BusinessPaymentLinkConfig) o;
    return equalsNullable(this.theme, businessPaymentLinkConfig.theme) &&
        equalsNullable(this.logo, businessPaymentLinkConfig.logo) &&
        equalsNullable(this.sellerName, businessPaymentLinkConfig.sellerName) &&
        equalsNullable(this.sdkLayout, businessPaymentLinkConfig.sdkLayout) &&
        equalsNullable(this.displaySdkOnly, businessPaymentLinkConfig.displaySdkOnly) &&
        equalsNullable(this.enabledSavedPaymentMethod, businessPaymentLinkConfig.enabledSavedPaymentMethod) &&
        equalsNullable(this.transactionDetails, businessPaymentLinkConfig.transactionDetails) &&
        equalsNullable(this.domainName, businessPaymentLinkConfig.domainName) &&
        equalsNullable(this.businessSpecificConfigs, businessPaymentLinkConfig.businessSpecificConfigs) &&
        equalsNullable(this.allowedDomains, businessPaymentLinkConfig.allowedDomains);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(theme), hashCodeNullable(logo), hashCodeNullable(sellerName), hashCodeNullable(sdkLayout), hashCodeNullable(displaySdkOnly), hashCodeNullable(enabledSavedPaymentMethod), hashCodeNullable(transactionDetails), hashCodeNullable(domainName), hashCodeNullable(businessSpecificConfigs), hashCodeNullable(allowedDomains));
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
    sb.append("class BusinessPaymentLinkConfig {\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
    sb.append("    sdkLayout: ").append(toIndentedString(sdkLayout)).append("\n");
    sb.append("    displaySdkOnly: ").append(toIndentedString(displaySdkOnly)).append("\n");
    sb.append("    enabledSavedPaymentMethod: ").append(toIndentedString(enabledSavedPaymentMethod)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    businessSpecificConfigs: ").append(toIndentedString(businessSpecificConfigs)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
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

