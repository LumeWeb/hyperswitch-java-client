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
import com.hyperswitch.client.model.Connector;
import com.hyperswitch.client.model.ConnectorStatus;
import com.hyperswitch.client.model.ConnectorType;
import com.hyperswitch.client.model.CountryAlpha2;
import com.hyperswitch.client.model.FrmConfigs;
import com.hyperswitch.client.model.PaymentMethodsEnabled;
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
 * MerchantConnectorListResponse
 */
@JsonPropertyOrder({
  MerchantConnectorListResponse.JSON_PROPERTY_CONNECTOR_TYPE,
  MerchantConnectorListResponse.JSON_PROPERTY_CONNECTOR_NAME,
  MerchantConnectorListResponse.JSON_PROPERTY_CONNECTOR_LABEL,
  MerchantConnectorListResponse.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  MerchantConnectorListResponse.JSON_PROPERTY_PROFILE_ID,
  MerchantConnectorListResponse.JSON_PROPERTY_PAYMENT_METHODS_ENABLED,
  MerchantConnectorListResponse.JSON_PROPERTY_TEST_MODE,
  MerchantConnectorListResponse.JSON_PROPERTY_DISABLED,
  MerchantConnectorListResponse.JSON_PROPERTY_FRM_CONFIGS,
  MerchantConnectorListResponse.JSON_PROPERTY_BUSINESS_COUNTRY,
  MerchantConnectorListResponse.JSON_PROPERTY_BUSINESS_LABEL,
  MerchantConnectorListResponse.JSON_PROPERTY_BUSINESS_SUB_LABEL,
  MerchantConnectorListResponse.JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS,
  MerchantConnectorListResponse.JSON_PROPERTY_PM_AUTH_CONFIG,
  MerchantConnectorListResponse.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MerchantConnectorListResponse {
  public static final String JSON_PROPERTY_CONNECTOR_TYPE = "connector_type";
  @javax.annotation.Nonnull
  private ConnectorType connectorType;

  public static final String JSON_PROPERTY_CONNECTOR_NAME = "connector_name";
  @javax.annotation.Nonnull
  private Connector connectorName;

  public static final String JSON_PROPERTY_CONNECTOR_LABEL = "connector_label";
  @javax.annotation.Nullable
  private JsonNullable<String> connectorLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  @javax.annotation.Nonnull
  private String merchantConnectorId;

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  @javax.annotation.Nonnull
  private String profileId;

  public static final String JSON_PROPERTY_PAYMENT_METHODS_ENABLED = "payment_methods_enabled";
  @javax.annotation.Nullable
  private JsonNullable<List<PaymentMethodsEnabled>> paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>undefined();

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> testMode = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> disabled = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_FRM_CONFIGS = "frm_configs";
  @javax.annotation.Nullable
  private JsonNullable<List<FrmConfigs>> frmConfigs = JsonNullable.<List<FrmConfigs>>undefined();

  public static final String JSON_PROPERTY_BUSINESS_COUNTRY = "business_country";
  @javax.annotation.Nullable
  private JsonNullable<CountryAlpha2> businessCountry = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_BUSINESS_LABEL = "business_label";
  @javax.annotation.Nullable
  private JsonNullable<String> businessLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUSINESS_SUB_LABEL = "business_sub_label";
  @javax.annotation.Nullable
  private JsonNullable<String> businessSubLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS = "applepay_verified_domains";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> applepayVerifiedDomains = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PM_AUTH_CONFIG = "pm_auth_config";
  @javax.annotation.Nullable
  private JsonNullable<Object> pmAuthConfig = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private ConnectorStatus status;

  public MerchantConnectorListResponse() {
  }

  public MerchantConnectorListResponse connectorType(@javax.annotation.Nonnull ConnectorType connectorType) {
    
    this.connectorType = connectorType;
    return this;
  }

  /**
   * Get connectorType
   * @return connectorType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorType getConnectorType() {
    return connectorType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorType(@javax.annotation.Nonnull ConnectorType connectorType) {
    this.connectorType = connectorType;
  }

  public MerchantConnectorListResponse connectorName(@javax.annotation.Nonnull Connector connectorName) {
    
    this.connectorName = connectorName;
    return this;
  }

  /**
   * Get connectorName
   * @return connectorName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Connector getConnectorName() {
    return connectorName;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorName(@javax.annotation.Nonnull Connector connectorName) {
    this.connectorName = connectorName;
  }

  public MerchantConnectorListResponse connectorLabel(@javax.annotation.Nullable String connectorLabel) {
    this.connectorLabel = JsonNullable.<String>of(connectorLabel);
    
    return this;
  }

  /**
   * A unique label to identify the connector account created under a profile
   * @return connectorLabel
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorLabel() {
        return connectorLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorLabel_JsonNullable() {
    return connectorLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_LABEL)
  public void setConnectorLabel_JsonNullable(JsonNullable<String> connectorLabel) {
    this.connectorLabel = connectorLabel;
  }

  public void setConnectorLabel(@javax.annotation.Nullable String connectorLabel) {
    this.connectorLabel = JsonNullable.<String>of(connectorLabel);
  }

  public MerchantConnectorListResponse merchantConnectorId(@javax.annotation.Nonnull String merchantConnectorId) {
    
    this.merchantConnectorId = merchantConnectorId;
    return this;
  }

  /**
   * Unique ID of the merchant connector account
   * @return merchantConnectorId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantConnectorId() {
    return merchantConnectorId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantConnectorId(@javax.annotation.Nonnull String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }

  public MerchantConnectorListResponse profileId(@javax.annotation.Nonnull String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Identifier for the profile, if not provided default will be chosen from merchant account
   * @return profileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }

  public MerchantConnectorListResponse paymentMethodsEnabled(@javax.annotation.Nullable List<PaymentMethodsEnabled> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(paymentMethodsEnabled);
    
    return this;
  }

  public MerchantConnectorListResponse addPaymentMethodsEnabledItem(PaymentMethodsEnabled paymentMethodsEnabledItem) {
    if (this.paymentMethodsEnabled == null || !this.paymentMethodsEnabled.isPresent()) {
      this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(new ArrayList<>());
    }
    try {
      this.paymentMethodsEnabled.get().add(paymentMethodsEnabledItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * An object containing the details about the payment methods that need to be enabled under this merchant connector account
   * @return paymentMethodsEnabled
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PaymentMethodsEnabled> getPaymentMethodsEnabled() {
        return paymentMethodsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PaymentMethodsEnabled>> getPaymentMethodsEnabled_JsonNullable() {
    return paymentMethodsEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS_ENABLED)
  public void setPaymentMethodsEnabled_JsonNullable(JsonNullable<List<PaymentMethodsEnabled>> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = paymentMethodsEnabled;
  }

  public void setPaymentMethodsEnabled(@javax.annotation.Nullable List<PaymentMethodsEnabled> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(paymentMethodsEnabled);
  }

  public MerchantConnectorListResponse testMode(@javax.annotation.Nullable Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
    
    return this;
  }

  /**
   * A boolean value to indicate if the connector is in Test mode. By default, its value is false.
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

  public MerchantConnectorListResponse disabled(@javax.annotation.Nullable Boolean disabled) {
    this.disabled = JsonNullable.<Boolean>of(disabled);
    
    return this;
  }

  /**
   * A boolean value to indicate if the connector is disabled. By default, its value is false.
   * @return disabled
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getDisabled() {
        return disabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDisabled_JsonNullable() {
    return disabled;
  }
  
  @JsonProperty(JSON_PROPERTY_DISABLED)
  public void setDisabled_JsonNullable(JsonNullable<Boolean> disabled) {
    this.disabled = disabled;
  }

  public void setDisabled(@javax.annotation.Nullable Boolean disabled) {
    this.disabled = JsonNullable.<Boolean>of(disabled);
  }

  public MerchantConnectorListResponse frmConfigs(@javax.annotation.Nullable List<FrmConfigs> frmConfigs) {
    this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(frmConfigs);
    
    return this;
  }

  public MerchantConnectorListResponse addFrmConfigsItem(FrmConfigs frmConfigsItem) {
    if (this.frmConfigs == null || !this.frmConfigs.isPresent()) {
      this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(new ArrayList<>());
    }
    try {
      this.frmConfigs.get().add(frmConfigsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Contains the frm configs for the merchant connector
   * @return frmConfigs
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FrmConfigs> getFrmConfigs() {
        return frmConfigs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FrmConfigs>> getFrmConfigs_JsonNullable() {
    return frmConfigs;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_CONFIGS)
  public void setFrmConfigs_JsonNullable(JsonNullable<List<FrmConfigs>> frmConfigs) {
    this.frmConfigs = frmConfigs;
  }

  public void setFrmConfigs(@javax.annotation.Nullable List<FrmConfigs> frmConfigs) {
    this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(frmConfigs);
  }

  public MerchantConnectorListResponse businessCountry(@javax.annotation.Nullable CountryAlpha2 businessCountry) {
    this.businessCountry = JsonNullable.<CountryAlpha2>of(businessCountry);
    
    return this;
  }

  /**
   * Get businessCountry
   * @return businessCountry
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getBusinessCountry() {
        return businessCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getBusinessCountry_JsonNullable() {
    return businessCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  public void setBusinessCountry_JsonNullable(JsonNullable<CountryAlpha2> businessCountry) {
    this.businessCountry = businessCountry;
  }

  public void setBusinessCountry(@javax.annotation.Nullable CountryAlpha2 businessCountry) {
    this.businessCountry = JsonNullable.<CountryAlpha2>of(businessCountry);
  }

  public MerchantConnectorListResponse businessLabel(@javax.annotation.Nullable String businessLabel) {
    this.businessLabel = JsonNullable.<String>of(businessLabel);
    
    return this;
  }

  /**
   * The business label to which the connector account is attached. To be deprecated soon. Use the &#39;profile_id&#39; instead
   * @return businessLabel
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBusinessLabel() {
        return businessLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessLabel_JsonNullable() {
    return businessLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  public void setBusinessLabel_JsonNullable(JsonNullable<String> businessLabel) {
    this.businessLabel = businessLabel;
  }

  public void setBusinessLabel(@javax.annotation.Nullable String businessLabel) {
    this.businessLabel = JsonNullable.<String>of(businessLabel);
  }

  public MerchantConnectorListResponse businessSubLabel(@javax.annotation.Nullable String businessSubLabel) {
    this.businessSubLabel = JsonNullable.<String>of(businessSubLabel);
    
    return this;
  }

  /**
   * The business sublabel to which the connector account is attached. To be deprecated soon. Use the &#39;profile_id&#39; instead
   * @return businessSubLabel
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBusinessSubLabel() {
        return businessSubLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_SUB_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessSubLabel_JsonNullable() {
    return businessSubLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_SUB_LABEL)
  public void setBusinessSubLabel_JsonNullable(JsonNullable<String> businessSubLabel) {
    this.businessSubLabel = businessSubLabel;
  }

  public void setBusinessSubLabel(@javax.annotation.Nullable String businessSubLabel) {
    this.businessSubLabel = JsonNullable.<String>of(businessSubLabel);
  }

  public MerchantConnectorListResponse applepayVerifiedDomains(@javax.annotation.Nullable List<String> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = JsonNullable.<List<String>>of(applepayVerifiedDomains);
    
    return this;
  }

  public MerchantConnectorListResponse addApplepayVerifiedDomainsItem(String applepayVerifiedDomainsItem) {
    if (this.applepayVerifiedDomains == null || !this.applepayVerifiedDomains.isPresent()) {
      this.applepayVerifiedDomains = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.applepayVerifiedDomains.get().add(applepayVerifiedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * identifier for the verified domains of a particular connector account
   * @return applepayVerifiedDomains
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getApplepayVerifiedDomains() {
        return applepayVerifiedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getApplepayVerifiedDomains_JsonNullable() {
    return applepayVerifiedDomains;
  }
  
  @JsonProperty(JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS)
  public void setApplepayVerifiedDomains_JsonNullable(JsonNullable<List<String>> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = applepayVerifiedDomains;
  }

  public void setApplepayVerifiedDomains(@javax.annotation.Nullable List<String> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = JsonNullable.<List<String>>of(applepayVerifiedDomains);
  }

  public MerchantConnectorListResponse pmAuthConfig(@javax.annotation.Nullable Object pmAuthConfig) {
    this.pmAuthConfig = JsonNullable.<Object>of(pmAuthConfig);
    
    return this;
  }

  /**
   * Get pmAuthConfig
   * @return pmAuthConfig
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPmAuthConfig() {
        return pmAuthConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PM_AUTH_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPmAuthConfig_JsonNullable() {
    return pmAuthConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_PM_AUTH_CONFIG)
  public void setPmAuthConfig_JsonNullable(JsonNullable<Object> pmAuthConfig) {
    this.pmAuthConfig = pmAuthConfig;
  }

  public void setPmAuthConfig(@javax.annotation.Nullable Object pmAuthConfig) {
    this.pmAuthConfig = JsonNullable.<Object>of(pmAuthConfig);
  }

  public MerchantConnectorListResponse status(@javax.annotation.Nonnull ConnectorStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull ConnectorStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantConnectorListResponse merchantConnectorListResponse = (MerchantConnectorListResponse) o;
    return Objects.equals(this.connectorType, merchantConnectorListResponse.connectorType) &&
        Objects.equals(this.connectorName, merchantConnectorListResponse.connectorName) &&
        equalsNullable(this.connectorLabel, merchantConnectorListResponse.connectorLabel) &&
        Objects.equals(this.merchantConnectorId, merchantConnectorListResponse.merchantConnectorId) &&
        Objects.equals(this.profileId, merchantConnectorListResponse.profileId) &&
        equalsNullable(this.paymentMethodsEnabled, merchantConnectorListResponse.paymentMethodsEnabled) &&
        equalsNullable(this.testMode, merchantConnectorListResponse.testMode) &&
        equalsNullable(this.disabled, merchantConnectorListResponse.disabled) &&
        equalsNullable(this.frmConfigs, merchantConnectorListResponse.frmConfigs) &&
        equalsNullable(this.businessCountry, merchantConnectorListResponse.businessCountry) &&
        equalsNullable(this.businessLabel, merchantConnectorListResponse.businessLabel) &&
        equalsNullable(this.businessSubLabel, merchantConnectorListResponse.businessSubLabel) &&
        equalsNullable(this.applepayVerifiedDomains, merchantConnectorListResponse.applepayVerifiedDomains) &&
        equalsNullable(this.pmAuthConfig, merchantConnectorListResponse.pmAuthConfig) &&
        Objects.equals(this.status, merchantConnectorListResponse.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorType, connectorName, hashCodeNullable(connectorLabel), merchantConnectorId, profileId, hashCodeNullable(paymentMethodsEnabled), hashCodeNullable(testMode), hashCodeNullable(disabled), hashCodeNullable(frmConfigs), hashCodeNullable(businessCountry), hashCodeNullable(businessLabel), hashCodeNullable(businessSubLabel), hashCodeNullable(applepayVerifiedDomains), hashCodeNullable(pmAuthConfig), status);
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
    sb.append("class MerchantConnectorListResponse {\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    connectorLabel: ").append(toIndentedString(connectorLabel)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    paymentMethodsEnabled: ").append(toIndentedString(paymentMethodsEnabled)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    frmConfigs: ").append(toIndentedString(frmConfigs)).append("\n");
    sb.append("    businessCountry: ").append(toIndentedString(businessCountry)).append("\n");
    sb.append("    businessLabel: ").append(toIndentedString(businessLabel)).append("\n");
    sb.append("    businessSubLabel: ").append(toIndentedString(businessSubLabel)).append("\n");
    sb.append("    applepayVerifiedDomains: ").append(toIndentedString(applepayVerifiedDomains)).append("\n");
    sb.append("    pmAuthConfig: ").append(toIndentedString(pmAuthConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `connector_type` to the URL query string
    if (getConnectorType() != null) {
      try {
        joiner.add(String.format("%sconnector_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectorType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connector_name` to the URL query string
    if (getConnectorName() != null) {
      try {
        joiner.add(String.format("%sconnector_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectorName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connector_label` to the URL query string
    if (getConnectorLabel() != null) {
      try {
        joiner.add(String.format("%sconnector_label%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectorLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant_connector_id` to the URL query string
    if (getMerchantConnectorId() != null) {
      try {
        joiner.add(String.format("%smerchant_connector_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantConnectorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profile_id` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofile_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_methods_enabled` to the URL query string
    if (getPaymentMethodsEnabled() != null) {
      for (int i = 0; i < getPaymentMethodsEnabled().size(); i++) {
        if (getPaymentMethodsEnabled().get(i) != null) {
          joiner.add(getPaymentMethodsEnabled().get(i).toUrlQueryString(String.format("%spayment_methods_enabled%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

    // add `disabled` to the URL query string
    if (getDisabled() != null) {
      try {
        joiner.add(String.format("%sdisabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_configs` to the URL query string
    if (getFrmConfigs() != null) {
      for (int i = 0; i < getFrmConfigs().size(); i++) {
        if (getFrmConfigs().get(i) != null) {
          joiner.add(getFrmConfigs().get(i).toUrlQueryString(String.format("%sfrm_configs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `business_country` to the URL query string
    if (getBusinessCountry() != null) {
      try {
        joiner.add(String.format("%sbusiness_country%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `business_label` to the URL query string
    if (getBusinessLabel() != null) {
      try {
        joiner.add(String.format("%sbusiness_label%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `business_sub_label` to the URL query string
    if (getBusinessSubLabel() != null) {
      try {
        joiner.add(String.format("%sbusiness_sub_label%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessSubLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `applepay_verified_domains` to the URL query string
    if (getApplepayVerifiedDomains() != null) {
      for (int i = 0; i < getApplepayVerifiedDomains().size(); i++) {
        try {
          joiner.add(String.format("%sapplepay_verified_domains%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getApplepayVerifiedDomains().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `pm_auth_config` to the URL query string
    if (getPmAuthConfig() != null) {
      try {
        joiner.add(String.format("%spm_auth_config%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPmAuthConfig()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

