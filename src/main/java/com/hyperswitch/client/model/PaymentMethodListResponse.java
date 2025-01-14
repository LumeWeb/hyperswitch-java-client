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
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.MandateType;
import com.hyperswitch.client.model.PaymentType;
import com.hyperswitch.client.model.ResponsePaymentMethodsEnabled;
import java.util.ArrayList;
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
 * PaymentMethodListResponse
 */
@JsonPropertyOrder({
  PaymentMethodListResponse.JSON_PROPERTY_REDIRECT_URL,
  PaymentMethodListResponse.JSON_PROPERTY_CURRENCY,
  PaymentMethodListResponse.JSON_PROPERTY_PAYMENT_METHODS,
  PaymentMethodListResponse.JSON_PROPERTY_MANDATE_PAYMENT,
  PaymentMethodListResponse.JSON_PROPERTY_MERCHANT_NAME,
  PaymentMethodListResponse.JSON_PROPERTY_SHOW_SURCHARGE_BREAKUP_SCREEN,
  PaymentMethodListResponse.JSON_PROPERTY_PAYMENT_TYPE,
  PaymentMethodListResponse.JSON_PROPERTY_REQUEST_EXTERNAL_THREE_DS_AUTHENTICATION,
  PaymentMethodListResponse.JSON_PROPERTY_COLLECT_SHIPPING_DETAILS_FROM_WALLETS,
  PaymentMethodListResponse.JSON_PROPERTY_COLLECT_BILLING_DETAILS_FROM_WALLETS,
  PaymentMethodListResponse.JSON_PROPERTY_IS_TAX_CALCULATION_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodListResponse {
  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private JsonNullable<String> redirectUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PAYMENT_METHODS = "payment_methods";
  private List<ResponsePaymentMethodsEnabled> paymentMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_MANDATE_PAYMENT = "mandate_payment";
  private MandateType mandatePayment;

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOW_SURCHARGE_BREAKUP_SCREEN = "show_surcharge_breakup_screen";
  private Boolean showSurchargeBreakupScreen;

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "payment_type";
  private JsonNullable<PaymentType> paymentType = JsonNullable.<PaymentType>undefined();

  public static final String JSON_PROPERTY_REQUEST_EXTERNAL_THREE_DS_AUTHENTICATION = "request_external_three_ds_authentication";
  private Boolean requestExternalThreeDsAuthentication;

  public static final String JSON_PROPERTY_COLLECT_SHIPPING_DETAILS_FROM_WALLETS = "collect_shipping_details_from_wallets";
  private JsonNullable<Boolean> collectShippingDetailsFromWallets = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_COLLECT_BILLING_DETAILS_FROM_WALLETS = "collect_billing_details_from_wallets";
  private JsonNullable<Boolean> collectBillingDetailsFromWallets = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_TAX_CALCULATION_ENABLED = "is_tax_calculation_enabled";
  private Boolean isTaxCalculationEnabled;

  public PaymentMethodListResponse() {
  }

  public PaymentMethodListResponse redirectUrl(String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
    
    return this;
  }

   /**
   * Redirect URL of the merchant
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRedirectUrl() {
        return redirectUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRedirectUrl_JsonNullable() {
    return redirectUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  public void setRedirectUrl_JsonNullable(JsonNullable<String> redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
  }


  public PaymentMethodListResponse currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public PaymentMethodListResponse paymentMethods(List<ResponsePaymentMethodsEnabled> paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentMethodListResponse addPaymentMethodsItem(ResponsePaymentMethodsEnabled paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Information about the payment method
   * @return paymentMethods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResponsePaymentMethodsEnabled> getPaymentMethods() {
    return paymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethods(List<ResponsePaymentMethodsEnabled> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public PaymentMethodListResponse mandatePayment(MandateType mandatePayment) {
    
    this.mandatePayment = mandatePayment;
    return this;
  }

   /**
   * Get mandatePayment
   * @return mandatePayment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MandateType getMandatePayment() {
    return mandatePayment;
  }


  @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandatePayment(MandateType mandatePayment) {
    this.mandatePayment = mandatePayment;
  }


  public PaymentMethodListResponse merchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
    
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
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

  public void setMerchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
  }


  public PaymentMethodListResponse showSurchargeBreakupScreen(Boolean showSurchargeBreakupScreen) {
    
    this.showSurchargeBreakupScreen = showSurchargeBreakupScreen;
    return this;
  }

   /**
   * flag to indicate if surcharge and tax breakup screen should be shown or not
   * @return showSurchargeBreakupScreen
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHOW_SURCHARGE_BREAKUP_SCREEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShowSurchargeBreakupScreen() {
    return showSurchargeBreakupScreen;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_SURCHARGE_BREAKUP_SCREEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShowSurchargeBreakupScreen(Boolean showSurchargeBreakupScreen) {
    this.showSurchargeBreakupScreen = showSurchargeBreakupScreen;
  }


  public PaymentMethodListResponse paymentType(PaymentType paymentType) {
    this.paymentType = JsonNullable.<PaymentType>of(paymentType);
    
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentType getPaymentType() {
        return paymentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentType> getPaymentType_JsonNullable() {
    return paymentType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  public void setPaymentType_JsonNullable(JsonNullable<PaymentType> paymentType) {
    this.paymentType = paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = JsonNullable.<PaymentType>of(paymentType);
  }


  public PaymentMethodListResponse requestExternalThreeDsAuthentication(Boolean requestExternalThreeDsAuthentication) {
    
    this.requestExternalThreeDsAuthentication = requestExternalThreeDsAuthentication;
    return this;
  }

   /**
   * flag to indicate whether to perform external 3ds authentication
   * @return requestExternalThreeDsAuthentication
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_EXTERNAL_THREE_DS_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequestExternalThreeDsAuthentication() {
    return requestExternalThreeDsAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_EXTERNAL_THREE_DS_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestExternalThreeDsAuthentication(Boolean requestExternalThreeDsAuthentication) {
    this.requestExternalThreeDsAuthentication = requestExternalThreeDsAuthentication;
  }


  public PaymentMethodListResponse collectShippingDetailsFromWallets(Boolean collectShippingDetailsFromWallets) {
    this.collectShippingDetailsFromWallets = JsonNullable.<Boolean>of(collectShippingDetailsFromWallets);
    
    return this;
  }

   /**
   * flag that indicates whether to collect shipping details from wallets or from the customer
   * @return collectShippingDetailsFromWallets
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getCollectShippingDetailsFromWallets() {
        return collectShippingDetailsFromWallets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLECT_SHIPPING_DETAILS_FROM_WALLETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCollectShippingDetailsFromWallets_JsonNullable() {
    return collectShippingDetailsFromWallets;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLECT_SHIPPING_DETAILS_FROM_WALLETS)
  public void setCollectShippingDetailsFromWallets_JsonNullable(JsonNullable<Boolean> collectShippingDetailsFromWallets) {
    this.collectShippingDetailsFromWallets = collectShippingDetailsFromWallets;
  }

  public void setCollectShippingDetailsFromWallets(Boolean collectShippingDetailsFromWallets) {
    this.collectShippingDetailsFromWallets = JsonNullable.<Boolean>of(collectShippingDetailsFromWallets);
  }


  public PaymentMethodListResponse collectBillingDetailsFromWallets(Boolean collectBillingDetailsFromWallets) {
    this.collectBillingDetailsFromWallets = JsonNullable.<Boolean>of(collectBillingDetailsFromWallets);
    
    return this;
  }

   /**
   * flag that indicates whether to collect billing details from wallets or from the customer
   * @return collectBillingDetailsFromWallets
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getCollectBillingDetailsFromWallets() {
        return collectBillingDetailsFromWallets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLECT_BILLING_DETAILS_FROM_WALLETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCollectBillingDetailsFromWallets_JsonNullable() {
    return collectBillingDetailsFromWallets;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLECT_BILLING_DETAILS_FROM_WALLETS)
  public void setCollectBillingDetailsFromWallets_JsonNullable(JsonNullable<Boolean> collectBillingDetailsFromWallets) {
    this.collectBillingDetailsFromWallets = collectBillingDetailsFromWallets;
  }

  public void setCollectBillingDetailsFromWallets(Boolean collectBillingDetailsFromWallets) {
    this.collectBillingDetailsFromWallets = JsonNullable.<Boolean>of(collectBillingDetailsFromWallets);
  }


  public PaymentMethodListResponse isTaxCalculationEnabled(Boolean isTaxCalculationEnabled) {
    
    this.isTaxCalculationEnabled = isTaxCalculationEnabled;
    return this;
  }

   /**
   * flag that indicates whether to calculate tax on the order amount
   * @return isTaxCalculationEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_TAX_CALCULATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsTaxCalculationEnabled() {
    return isTaxCalculationEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_TAX_CALCULATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsTaxCalculationEnabled(Boolean isTaxCalculationEnabled) {
    this.isTaxCalculationEnabled = isTaxCalculationEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodListResponse paymentMethodListResponse = (PaymentMethodListResponse) o;
    return equalsNullable(this.redirectUrl, paymentMethodListResponse.redirectUrl) &&
        Objects.equals(this.currency, paymentMethodListResponse.currency) &&
        Objects.equals(this.paymentMethods, paymentMethodListResponse.paymentMethods) &&
        Objects.equals(this.mandatePayment, paymentMethodListResponse.mandatePayment) &&
        equalsNullable(this.merchantName, paymentMethodListResponse.merchantName) &&
        Objects.equals(this.showSurchargeBreakupScreen, paymentMethodListResponse.showSurchargeBreakupScreen) &&
        equalsNullable(this.paymentType, paymentMethodListResponse.paymentType) &&
        Objects.equals(this.requestExternalThreeDsAuthentication, paymentMethodListResponse.requestExternalThreeDsAuthentication) &&
        equalsNullable(this.collectShippingDetailsFromWallets, paymentMethodListResponse.collectShippingDetailsFromWallets) &&
        equalsNullable(this.collectBillingDetailsFromWallets, paymentMethodListResponse.collectBillingDetailsFromWallets) &&
        Objects.equals(this.isTaxCalculationEnabled, paymentMethodListResponse.isTaxCalculationEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(redirectUrl), currency, paymentMethods, mandatePayment, hashCodeNullable(merchantName), showSurchargeBreakupScreen, hashCodeNullable(paymentType), requestExternalThreeDsAuthentication, hashCodeNullable(collectShippingDetailsFromWallets), hashCodeNullable(collectBillingDetailsFromWallets), isTaxCalculationEnabled);
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
    sb.append("class PaymentMethodListResponse {\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    mandatePayment: ").append(toIndentedString(mandatePayment)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    showSurchargeBreakupScreen: ").append(toIndentedString(showSurchargeBreakupScreen)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    requestExternalThreeDsAuthentication: ").append(toIndentedString(requestExternalThreeDsAuthentication)).append("\n");
    sb.append("    collectShippingDetailsFromWallets: ").append(toIndentedString(collectShippingDetailsFromWallets)).append("\n");
    sb.append("    collectBillingDetailsFromWallets: ").append(toIndentedString(collectBillingDetailsFromWallets)).append("\n");
    sb.append("    isTaxCalculationEnabled: ").append(toIndentedString(isTaxCalculationEnabled)).append("\n");
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

    // add `redirect_url` to the URL query string
    if (getRedirectUrl() != null) {
      try {
        joiner.add(String.format("%sredirect_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_methods` to the URL query string
    if (getPaymentMethods() != null) {
      for (int i = 0; i < getPaymentMethods().size(); i++) {
        if (getPaymentMethods().get(i) != null) {
          joiner.add(getPaymentMethods().get(i).toUrlQueryString(String.format("%spayment_methods%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `mandate_payment` to the URL query string
    if (getMandatePayment() != null) {
      joiner.add(getMandatePayment().toUrlQueryString(prefix + "mandate_payment" + suffix));
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

    // add `show_surcharge_breakup_screen` to the URL query string
    if (getShowSurchargeBreakupScreen() != null) {
      try {
        joiner.add(String.format("%sshow_surcharge_breakup_screen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShowSurchargeBreakupScreen()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_type` to the URL query string
    if (getPaymentType() != null) {
      try {
        joiner.add(String.format("%spayment_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `request_external_three_ds_authentication` to the URL query string
    if (getRequestExternalThreeDsAuthentication() != null) {
      try {
        joiner.add(String.format("%srequest_external_three_ds_authentication%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestExternalThreeDsAuthentication()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `collect_shipping_details_from_wallets` to the URL query string
    if (getCollectShippingDetailsFromWallets() != null) {
      try {
        joiner.add(String.format("%scollect_shipping_details_from_wallets%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCollectShippingDetailsFromWallets()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `collect_billing_details_from_wallets` to the URL query string
    if (getCollectBillingDetailsFromWallets() != null) {
      try {
        joiner.add(String.format("%scollect_billing_details_from_wallets%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCollectBillingDetailsFromWallets()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_tax_calculation_enabled` to the URL query string
    if (getIsTaxCalculationEnabled() != null) {
      try {
        joiner.add(String.format("%sis_tax_calculation_enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsTaxCalculationEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

