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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.ApplepayInitiative;
import com.hyperswitch.model.CountryAlpha2;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SessionTokenInfo
 */
@JsonPropertyOrder({
  SessionTokenInfo.JSON_PROPERTY_CERTIFICATE,
  SessionTokenInfo.JSON_PROPERTY_CERTIFICATE_KEYS,
  SessionTokenInfo.JSON_PROPERTY_MERCHANT_IDENTIFIER,
  SessionTokenInfo.JSON_PROPERTY_DISPLAY_NAME,
  SessionTokenInfo.JSON_PROPERTY_INITIATIVE,
  SessionTokenInfo.JSON_PROPERTY_INITIATIVE_CONTEXT,
  SessionTokenInfo.JSON_PROPERTY_MERCHANT_BUSINESS_COUNTRY,
  SessionTokenInfo.JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE,
  SessionTokenInfo.JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY,
  SessionTokenInfo.JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "payment_processing_details_at", // ignore manually set payment_processing_details_at, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the payment_processing_details_at to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "payment_processing_details_at", visible = true)

public class SessionTokenInfo {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public static final String JSON_PROPERTY_CERTIFICATE_KEYS = "certificate_keys";
  private String certificateKeys;

  public static final String JSON_PROPERTY_MERCHANT_IDENTIFIER = "merchant_identifier";
  private String merchantIdentifier;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_INITIATIVE = "initiative";
  private ApplepayInitiative initiative;

  public static final String JSON_PROPERTY_INITIATIVE_CONTEXT = "initiative_context";
  private JsonNullable<String> initiativeContext = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_BUSINESS_COUNTRY = "merchant_business_country";
  private JsonNullable<CountryAlpha2> merchantBusinessCountry = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE = "payment_processing_certificate";
  private String paymentProcessingCertificate;

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY = "payment_processing_certificate_key";
  private String paymentProcessingCertificateKey;

  /**
   * Gets or Sets paymentProcessingDetailsAt
   */
  public enum PaymentProcessingDetailsAtEnum {
    CONNECTOR("Connector");

    private String value;

    PaymentProcessingDetailsAtEnum(String value) {
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
    public static PaymentProcessingDetailsAtEnum fromValue(String value) {
      for (PaymentProcessingDetailsAtEnum b : PaymentProcessingDetailsAtEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT = "payment_processing_details_at";
  protected PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt;

  public SessionTokenInfo() {
  }

  public SessionTokenInfo certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public SessionTokenInfo certificateKeys(String certificateKeys) {
    
    this.certificateKeys = certificateKeys;
    return this;
  }

   /**
   * Get certificateKeys
   * @return certificateKeys
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCertificateKeys() {
    return certificateKeys;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertificateKeys(String certificateKeys) {
    this.certificateKeys = certificateKeys;
  }


  public SessionTokenInfo merchantIdentifier(String merchantIdentifier) {
    
    this.merchantIdentifier = merchantIdentifier;
    return this;
  }

   /**
   * Get merchantIdentifier
   * @return merchantIdentifier
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantIdentifier() {
    return merchantIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }


  public SessionTokenInfo displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SessionTokenInfo initiative(ApplepayInitiative initiative) {
    
    this.initiative = initiative;
    return this;
  }

   /**
   * Get initiative
   * @return initiative
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INITIATIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApplepayInitiative getInitiative() {
    return initiative;
  }


  @JsonProperty(JSON_PROPERTY_INITIATIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitiative(ApplepayInitiative initiative) {
    this.initiative = initiative;
  }


  public SessionTokenInfo initiativeContext(String initiativeContext) {
    this.initiativeContext = JsonNullable.<String>of(initiativeContext);
    
    return this;
  }

   /**
   * Get initiativeContext
   * @return initiativeContext
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInitiativeContext() {
        return initiativeContext.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INITIATIVE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInitiativeContext_JsonNullable() {
    return initiativeContext;
  }
  
  @JsonProperty(JSON_PROPERTY_INITIATIVE_CONTEXT)
  public void setInitiativeContext_JsonNullable(JsonNullable<String> initiativeContext) {
    this.initiativeContext = initiativeContext;
  }

  public void setInitiativeContext(String initiativeContext) {
    this.initiativeContext = JsonNullable.<String>of(initiativeContext);
  }


  public SessionTokenInfo merchantBusinessCountry(CountryAlpha2 merchantBusinessCountry) {
    this.merchantBusinessCountry = JsonNullable.<CountryAlpha2>of(merchantBusinessCountry);
    
    return this;
  }

   /**
   * Get merchantBusinessCountry
   * @return merchantBusinessCountry
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getMerchantBusinessCountry() {
        return merchantBusinessCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_BUSINESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getMerchantBusinessCountry_JsonNullable() {
    return merchantBusinessCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_BUSINESS_COUNTRY)
  public void setMerchantBusinessCountry_JsonNullable(JsonNullable<CountryAlpha2> merchantBusinessCountry) {
    this.merchantBusinessCountry = merchantBusinessCountry;
  }

  public void setMerchantBusinessCountry(CountryAlpha2 merchantBusinessCountry) {
    this.merchantBusinessCountry = JsonNullable.<CountryAlpha2>of(merchantBusinessCountry);
  }


  public SessionTokenInfo paymentProcessingCertificate(String paymentProcessingCertificate) {
    
    this.paymentProcessingCertificate = paymentProcessingCertificate;
    return this;
  }

   /**
   * Get paymentProcessingCertificate
   * @return paymentProcessingCertificate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentProcessingCertificate() {
    return paymentProcessingCertificate;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingCertificate(String paymentProcessingCertificate) {
    this.paymentProcessingCertificate = paymentProcessingCertificate;
  }


  public SessionTokenInfo paymentProcessingCertificateKey(String paymentProcessingCertificateKey) {
    
    this.paymentProcessingCertificateKey = paymentProcessingCertificateKey;
    return this;
  }

   /**
   * Get paymentProcessingCertificateKey
   * @return paymentProcessingCertificateKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentProcessingCertificateKey() {
    return paymentProcessingCertificateKey;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_CERTIFICATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingCertificateKey(String paymentProcessingCertificateKey) {
    this.paymentProcessingCertificateKey = paymentProcessingCertificateKey;
  }


  public SessionTokenInfo paymentProcessingDetailsAt(PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
    
    this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
    return this;
  }

   /**
   * Get paymentProcessingDetailsAt
   * @return paymentProcessingDetailsAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentProcessingDetailsAtEnum getPaymentProcessingDetailsAt() {
    return paymentProcessingDetailsAt;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingDetailsAt(PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
    this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionTokenInfo sessionTokenInfo = (SessionTokenInfo) o;
    return Objects.equals(this.certificate, sessionTokenInfo.certificate) &&
        Objects.equals(this.certificateKeys, sessionTokenInfo.certificateKeys) &&
        Objects.equals(this.merchantIdentifier, sessionTokenInfo.merchantIdentifier) &&
        Objects.equals(this.displayName, sessionTokenInfo.displayName) &&
        Objects.equals(this.initiative, sessionTokenInfo.initiative) &&
        equalsNullable(this.initiativeContext, sessionTokenInfo.initiativeContext) &&
        equalsNullable(this.merchantBusinessCountry, sessionTokenInfo.merchantBusinessCountry) &&
        Objects.equals(this.paymentProcessingCertificate, sessionTokenInfo.paymentProcessingCertificate) &&
        Objects.equals(this.paymentProcessingCertificateKey, sessionTokenInfo.paymentProcessingCertificateKey) &&
        Objects.equals(this.paymentProcessingDetailsAt, sessionTokenInfo.paymentProcessingDetailsAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, certificateKeys, merchantIdentifier, displayName, initiative, hashCodeNullable(initiativeContext), hashCodeNullable(merchantBusinessCountry), paymentProcessingCertificate, paymentProcessingCertificateKey, paymentProcessingDetailsAt);
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
    sb.append("class SessionTokenInfo {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateKeys: ").append(toIndentedString(certificateKeys)).append("\n");
    sb.append("    merchantIdentifier: ").append(toIndentedString(merchantIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    initiative: ").append(toIndentedString(initiative)).append("\n");
    sb.append("    initiativeContext: ").append(toIndentedString(initiativeContext)).append("\n");
    sb.append("    merchantBusinessCountry: ").append(toIndentedString(merchantBusinessCountry)).append("\n");
    sb.append("    paymentProcessingCertificate: ").append(toIndentedString(paymentProcessingCertificate)).append("\n");
    sb.append("    paymentProcessingCertificateKey: ").append(toIndentedString(paymentProcessingCertificateKey)).append("\n");
    sb.append("    paymentProcessingDetailsAt: ").append(toIndentedString(paymentProcessingDetailsAt)).append("\n");
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

