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
import com.hyperswitch.client.model.Bank;
import com.hyperswitch.client.model.CardDetailFromLocker;
import com.hyperswitch.client.model.PaymentExperience;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodType;
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
 * PaymentMethodResponse
 */
@JsonPropertyOrder({
  PaymentMethodResponse.JSON_PROPERTY_MERCHANT_ID,
  PaymentMethodResponse.JSON_PROPERTY_CUSTOMER_ID,
  PaymentMethodResponse.JSON_PROPERTY_PAYMENT_METHOD_ID,
  PaymentMethodResponse.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentMethodResponse.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  PaymentMethodResponse.JSON_PROPERTY_CARD,
  PaymentMethodResponse.JSON_PROPERTY_RECURRING_ENABLED,
  PaymentMethodResponse.JSON_PROPERTY_INSTALLMENT_PAYMENT_ENABLED,
  PaymentMethodResponse.JSON_PROPERTY_PAYMENT_EXPERIENCE,
  PaymentMethodResponse.JSON_PROPERTY_METADATA,
  PaymentMethodResponse.JSON_PROPERTY_CREATED,
  PaymentMethodResponse.JSON_PROPERTY_BANK_TRANSFER,
  PaymentMethodResponse.JSON_PROPERTY_LAST_USED_AT,
  PaymentMethodResponse.JSON_PROPERTY_CLIENT_SECRET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentMethodResponse {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @javax.annotation.Nonnull
  private String merchantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  @javax.annotation.Nullable
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_ID = "payment_method_id";
  @javax.annotation.Nonnull
  private String paymentMethodId;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  @javax.annotation.Nonnull
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  @javax.annotation.Nullable
  private JsonNullable<PaymentMethodType> paymentMethodType = JsonNullable.<PaymentMethodType>undefined();

  public static final String JSON_PROPERTY_CARD = "card";
  @javax.annotation.Nullable
  private JsonNullable<CardDetailFromLocker> card = JsonNullable.<CardDetailFromLocker>undefined();

  public static final String JSON_PROPERTY_RECURRING_ENABLED = "recurring_enabled";
  @javax.annotation.Nonnull
  private Boolean recurringEnabled;

  public static final String JSON_PROPERTY_INSTALLMENT_PAYMENT_ENABLED = "installment_payment_enabled";
  @javax.annotation.Nonnull
  private Boolean installmentPaymentEnabled;

  public static final String JSON_PROPERTY_PAYMENT_EXPERIENCE = "payment_experience";
  @javax.annotation.Nullable
  private JsonNullable<List<PaymentExperience>> paymentExperience = JsonNullable.<List<PaymentExperience>>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> created = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_BANK_TRANSFER = "bank_transfer";
  @javax.annotation.Nullable
  private JsonNullable<Bank> bankTransfer = JsonNullable.<Bank>undefined();

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> lastUsedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  @javax.annotation.Nullable
  private JsonNullable<String> clientSecret = JsonNullable.<String>undefined();

  public PaymentMethodResponse() {
  }

  public PaymentMethodResponse merchantId(@javax.annotation.Nonnull String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Unique identifier for a merchant
   * @return merchantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentMethodResponse customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * The unique identifier of the customer.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }

  public PaymentMethodResponse paymentMethodId(@javax.annotation.Nonnull String paymentMethodId) {
    
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * The unique identifier of the Payment method
   * @return paymentMethodId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentMethodId() {
    return paymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodId(@javax.annotation.Nonnull String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public PaymentMethodResponse paymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentMethodResponse paymentMethodType(@javax.annotation.Nullable PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
    
    return this;
  }

  /**
   * Get paymentMethodType
   * @return paymentMethodType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodType> getPaymentMethodType_JsonNullable() {
    return paymentMethodType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  public void setPaymentMethodType_JsonNullable(JsonNullable<PaymentMethodType> paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public void setPaymentMethodType(@javax.annotation.Nullable PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
  }

  public PaymentMethodResponse card(@javax.annotation.Nullable CardDetailFromLocker card) {
    this.card = JsonNullable.<CardDetailFromLocker>of(card);
    
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public CardDetailFromLocker getCard() {
        return card.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CardDetailFromLocker> getCard_JsonNullable() {
    return card;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD)
  public void setCard_JsonNullable(JsonNullable<CardDetailFromLocker> card) {
    this.card = card;
  }

  public void setCard(@javax.annotation.Nullable CardDetailFromLocker card) {
    this.card = JsonNullable.<CardDetailFromLocker>of(card);
  }

  public PaymentMethodResponse recurringEnabled(@javax.annotation.Nonnull Boolean recurringEnabled) {
    
    this.recurringEnabled = recurringEnabled;
    return this;
  }

  /**
   * Indicates whether the payment method is eligible for recurring payments
   * @return recurringEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECURRING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRecurringEnabled() {
    return recurringEnabled;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecurringEnabled(@javax.annotation.Nonnull Boolean recurringEnabled) {
    this.recurringEnabled = recurringEnabled;
  }

  public PaymentMethodResponse installmentPaymentEnabled(@javax.annotation.Nonnull Boolean installmentPaymentEnabled) {
    
    this.installmentPaymentEnabled = installmentPaymentEnabled;
    return this;
  }

  /**
   * Indicates whether the payment method is eligible for installment payments
   * @return installmentPaymentEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInstallmentPaymentEnabled() {
    return installmentPaymentEnabled;
  }


  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstallmentPaymentEnabled(@javax.annotation.Nonnull Boolean installmentPaymentEnabled) {
    this.installmentPaymentEnabled = installmentPaymentEnabled;
  }

  public PaymentMethodResponse paymentExperience(@javax.annotation.Nullable List<PaymentExperience> paymentExperience) {
    this.paymentExperience = JsonNullable.<List<PaymentExperience>>of(paymentExperience);
    
    return this;
  }

  public PaymentMethodResponse addPaymentExperienceItem(PaymentExperience paymentExperienceItem) {
    if (this.paymentExperience == null || !this.paymentExperience.isPresent()) {
      this.paymentExperience = JsonNullable.<List<PaymentExperience>>of(new ArrayList<>());
    }
    try {
      this.paymentExperience.get().add(paymentExperienceItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Type of payment experience enabled with the connector
   * @return paymentExperience
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PaymentExperience> getPaymentExperience() {
        return paymentExperience.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PaymentExperience>> getPaymentExperience_JsonNullable() {
    return paymentExperience;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE)
  public void setPaymentExperience_JsonNullable(JsonNullable<List<PaymentExperience>> paymentExperience) {
    this.paymentExperience = paymentExperience;
  }

  public void setPaymentExperience(@javax.annotation.Nullable List<PaymentExperience> paymentExperience) {
    this.paymentExperience = JsonNullable.<List<PaymentExperience>>of(paymentExperience);
  }

  public PaymentMethodResponse metadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

  /**
   * You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object.
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }

  public PaymentMethodResponse created(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = JsonNullable.<OffsetDateTime>of(created);
    
    return this;
  }

  /**
   * A timestamp (ISO 8601 code) that determines when the payment method was created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCreated() {
        return created.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreated_JsonNullable() {
    return created;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED)
  public void setCreated_JsonNullable(JsonNullable<OffsetDateTime> created) {
    this.created = created;
  }

  public void setCreated(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = JsonNullable.<OffsetDateTime>of(created);
  }

  public PaymentMethodResponse bankTransfer(@javax.annotation.Nullable Bank bankTransfer) {
    this.bankTransfer = JsonNullable.<Bank>of(bankTransfer);
    
    return this;
  }

  /**
   * Get bankTransfer
   * @return bankTransfer
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Bank getBankTransfer() {
        return bankTransfer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Bank> getBankTransfer_JsonNullable() {
    return bankTransfer;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  public void setBankTransfer_JsonNullable(JsonNullable<Bank> bankTransfer) {
    this.bankTransfer = bankTransfer;
  }

  public void setBankTransfer(@javax.annotation.Nullable Bank bankTransfer) {
    this.bankTransfer = JsonNullable.<Bank>of(bankTransfer);
  }

  public PaymentMethodResponse lastUsedAt(@javax.annotation.Nullable OffsetDateTime lastUsedAt) {
    this.lastUsedAt = JsonNullable.<OffsetDateTime>of(lastUsedAt);
    
    return this;
  }

  /**
   * Get lastUsedAt
   * @return lastUsedAt
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getLastUsedAt() {
        return lastUsedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLastUsedAt_JsonNullable() {
    return lastUsedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  public void setLastUsedAt_JsonNullable(JsonNullable<OffsetDateTime> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public void setLastUsedAt(@javax.annotation.Nullable OffsetDateTime lastUsedAt) {
    this.lastUsedAt = JsonNullable.<OffsetDateTime>of(lastUsedAt);
  }

  public PaymentMethodResponse clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
    
    return this;
  }

  /**
   * For Client based calls
   * @return clientSecret
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getClientSecret() {
        return clientSecret.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientSecret_JsonNullable() {
    return clientSecret;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  public void setClientSecret_JsonNullable(JsonNullable<String> clientSecret) {
    this.clientSecret = clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodResponse paymentMethodResponse = (PaymentMethodResponse) o;
    return Objects.equals(this.merchantId, paymentMethodResponse.merchantId) &&
        equalsNullable(this.customerId, paymentMethodResponse.customerId) &&
        Objects.equals(this.paymentMethodId, paymentMethodResponse.paymentMethodId) &&
        Objects.equals(this.paymentMethod, paymentMethodResponse.paymentMethod) &&
        equalsNullable(this.paymentMethodType, paymentMethodResponse.paymentMethodType) &&
        equalsNullable(this.card, paymentMethodResponse.card) &&
        Objects.equals(this.recurringEnabled, paymentMethodResponse.recurringEnabled) &&
        Objects.equals(this.installmentPaymentEnabled, paymentMethodResponse.installmentPaymentEnabled) &&
        equalsNullable(this.paymentExperience, paymentMethodResponse.paymentExperience) &&
        equalsNullable(this.metadata, paymentMethodResponse.metadata) &&
        equalsNullable(this.created, paymentMethodResponse.created) &&
        equalsNullable(this.bankTransfer, paymentMethodResponse.bankTransfer) &&
        equalsNullable(this.lastUsedAt, paymentMethodResponse.lastUsedAt) &&
        equalsNullable(this.clientSecret, paymentMethodResponse.clientSecret);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, hashCodeNullable(customerId), paymentMethodId, paymentMethod, hashCodeNullable(paymentMethodType), hashCodeNullable(card), recurringEnabled, installmentPaymentEnabled, hashCodeNullable(paymentExperience), hashCodeNullable(metadata), hashCodeNullable(created), hashCodeNullable(bankTransfer), hashCodeNullable(lastUsedAt), hashCodeNullable(clientSecret));
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
    sb.append("class PaymentMethodResponse {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    recurringEnabled: ").append(toIndentedString(recurringEnabled)).append("\n");
    sb.append("    installmentPaymentEnabled: ").append(toIndentedString(installmentPaymentEnabled)).append("\n");
    sb.append("    paymentExperience: ").append(toIndentedString(paymentExperience)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    bankTransfer: ").append(toIndentedString(bankTransfer)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

    // add `merchant_id` to the URL query string
    if (getMerchantId() != null) {
      try {
        joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `payment_method_id` to the URL query string
    if (getPaymentMethodId() != null) {
      try {
        joiner.add(String.format("%spayment_method_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_method` to the URL query string
    if (getPaymentMethod() != null) {
      try {
        joiner.add(String.format("%spayment_method%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_method_type` to the URL query string
    if (getPaymentMethodType() != null) {
      try {
        joiner.add(String.format("%spayment_method_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `recurring_enabled` to the URL query string
    if (getRecurringEnabled() != null) {
      try {
        joiner.add(String.format("%srecurring_enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurringEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `installment_payment_enabled` to the URL query string
    if (getInstallmentPaymentEnabled() != null) {
      try {
        joiner.add(String.format("%sinstallment_payment_enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstallmentPaymentEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_experience` to the URL query string
    if (getPaymentExperience() != null) {
      for (int i = 0; i < getPaymentExperience().size(); i++) {
        if (getPaymentExperience().get(i) != null) {
          try {
            joiner.add(String.format("%spayment_experience%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getPaymentExperience().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      try {
        joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_transfer` to the URL query string
    if (getBankTransfer() != null) {
      joiner.add(getBankTransfer().toUrlQueryString(prefix + "bank_transfer" + suffix));
    }

    // add `last_used_at` to the URL query string
    if (getLastUsedAt() != null) {
      try {
        joiner.add(String.format("%slast_used_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastUsedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

