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
import com.hyperswitch.client.model.GpayAllowedPaymentMethods;
import com.hyperswitch.client.model.GpayMerchantInfo;
import com.hyperswitch.client.model.GpayShippingAddressParameters;
import com.hyperswitch.client.model.GpayTransactionInfo;
import com.hyperswitch.client.model.SdkNextAction;
import com.hyperswitch.client.model.SecretInfoToInitiateSdk;
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
 * SessionTokenOneOf
 */
@JsonPropertyOrder({
  SessionTokenOneOf.JSON_PROPERTY_DELAYED_SESSION_TOKEN,
  SessionTokenOneOf.JSON_PROPERTY_CONNECTOR,
  SessionTokenOneOf.JSON_PROPERTY_SDK_NEXT_ACTION,
  SessionTokenOneOf.JSON_PROPERTY_MERCHANT_INFO,
  SessionTokenOneOf.JSON_PROPERTY_SHIPPING_ADDRESS_REQUIRED,
  SessionTokenOneOf.JSON_PROPERTY_EMAIL_REQUIRED,
  SessionTokenOneOf.JSON_PROPERTY_SHIPPING_ADDRESS_PARAMETERS,
  SessionTokenOneOf.JSON_PROPERTY_ALLOWED_PAYMENT_METHODS,
  SessionTokenOneOf.JSON_PROPERTY_TRANSACTION_INFO,
  SessionTokenOneOf.JSON_PROPERTY_SECRETS,
  SessionTokenOneOf.JSON_PROPERTY_WALLET_NAME
})
@JsonTypeName("SessionToken_oneOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionTokenOneOf {
  public static final String JSON_PROPERTY_DELAYED_SESSION_TOKEN = "delayed_session_token";
  private Boolean delayedSessionToken;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_SDK_NEXT_ACTION = "sdk_next_action";
  private SdkNextAction sdkNextAction;

  public static final String JSON_PROPERTY_MERCHANT_INFO = "merchant_info";
  private GpayMerchantInfo merchantInfo;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS_REQUIRED = "shipping_address_required";
  private Boolean shippingAddressRequired;

  public static final String JSON_PROPERTY_EMAIL_REQUIRED = "email_required";
  private Boolean emailRequired;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS_PARAMETERS = "shipping_address_parameters";
  private GpayShippingAddressParameters shippingAddressParameters;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHODS = "allowed_payment_methods";
  private List<GpayAllowedPaymentMethods> allowedPaymentMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSACTION_INFO = "transaction_info";
  private GpayTransactionInfo transactionInfo;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private JsonNullable<SecretInfoToInitiateSdk> secrets = JsonNullable.<SecretInfoToInitiateSdk>undefined();

  /**
   * Gets or Sets walletName
   */
  public enum WalletNameEnum {
    GOOGLE_PAY("google_pay");

    private String value;

    WalletNameEnum(String value) {
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
    public static WalletNameEnum fromValue(String value) {
      for (WalletNameEnum b : WalletNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WALLET_NAME = "wallet_name";
  private WalletNameEnum walletName;

  public SessionTokenOneOf() {
  }

  public SessionTokenOneOf delayedSessionToken(Boolean delayedSessionToken) {
    
    this.delayedSessionToken = delayedSessionToken;
    return this;
  }

   /**
   * Identifier for the delayed session response
   * @return delayedSessionToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELAYED_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDelayedSessionToken() {
    return delayedSessionToken;
  }


  @JsonProperty(JSON_PROPERTY_DELAYED_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelayedSessionToken(Boolean delayedSessionToken) {
    this.delayedSessionToken = delayedSessionToken;
  }


  public SessionTokenOneOf connector(String connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * The name of the connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public SessionTokenOneOf sdkNextAction(SdkNextAction sdkNextAction) {
    
    this.sdkNextAction = sdkNextAction;
    return this;
  }

   /**
   * Get sdkNextAction
   * @return sdkNextAction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SdkNextAction getSdkNextAction() {
    return sdkNextAction;
  }


  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkNextAction(SdkNextAction sdkNextAction) {
    this.sdkNextAction = sdkNextAction;
  }


  public SessionTokenOneOf merchantInfo(GpayMerchantInfo merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayMerchantInfo getMerchantInfo() {
    return merchantInfo;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantInfo(GpayMerchantInfo merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public SessionTokenOneOf shippingAddressRequired(Boolean shippingAddressRequired) {
    
    this.shippingAddressRequired = shippingAddressRequired;
    return this;
  }

   /**
   * Is shipping address required
   * @return shippingAddressRequired
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShippingAddressRequired() {
    return shippingAddressRequired;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShippingAddressRequired(Boolean shippingAddressRequired) {
    this.shippingAddressRequired = shippingAddressRequired;
  }


  public SessionTokenOneOf emailRequired(Boolean emailRequired) {
    
    this.emailRequired = emailRequired;
    return this;
  }

   /**
   * Is email required
   * @return emailRequired
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEmailRequired() {
    return emailRequired;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailRequired(Boolean emailRequired) {
    this.emailRequired = emailRequired;
  }


  public SessionTokenOneOf shippingAddressParameters(GpayShippingAddressParameters shippingAddressParameters) {
    
    this.shippingAddressParameters = shippingAddressParameters;
    return this;
  }

   /**
   * Get shippingAddressParameters
   * @return shippingAddressParameters
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayShippingAddressParameters getShippingAddressParameters() {
    return shippingAddressParameters;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShippingAddressParameters(GpayShippingAddressParameters shippingAddressParameters) {
    this.shippingAddressParameters = shippingAddressParameters;
  }


  public SessionTokenOneOf allowedPaymentMethods(List<GpayAllowedPaymentMethods> allowedPaymentMethods) {
    
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public SessionTokenOneOf addAllowedPaymentMethodsItem(GpayAllowedPaymentMethods allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * List of the allowed payment meythods
   * @return allowedPaymentMethods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GpayAllowedPaymentMethods> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedPaymentMethods(List<GpayAllowedPaymentMethods> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }


  public SessionTokenOneOf transactionInfo(GpayTransactionInfo transactionInfo) {
    
    this.transactionInfo = transactionInfo;
    return this;
  }

   /**
   * Get transactionInfo
   * @return transactionInfo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayTransactionInfo getTransactionInfo() {
    return transactionInfo;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionInfo(GpayTransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }


  public SessionTokenOneOf secrets(SecretInfoToInitiateSdk secrets) {
    this.secrets = JsonNullable.<SecretInfoToInitiateSdk>of(secrets);
    
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public SecretInfoToInitiateSdk getSecrets() {
        return secrets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SecretInfoToInitiateSdk> getSecrets_JsonNullable() {
    return secrets;
  }
  
  @JsonProperty(JSON_PROPERTY_SECRETS)
  public void setSecrets_JsonNullable(JsonNullable<SecretInfoToInitiateSdk> secrets) {
    this.secrets = secrets;
  }

  public void setSecrets(SecretInfoToInitiateSdk secrets) {
    this.secrets = JsonNullable.<SecretInfoToInitiateSdk>of(secrets);
  }


  public SessionTokenOneOf walletName(WalletNameEnum walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * Get walletName
   * @return walletName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletNameEnum getWalletName() {
    return walletName;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletName(WalletNameEnum walletName) {
    this.walletName = walletName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionTokenOneOf sessionTokenOneOf = (SessionTokenOneOf) o;
    return Objects.equals(this.delayedSessionToken, sessionTokenOneOf.delayedSessionToken) &&
        Objects.equals(this.connector, sessionTokenOneOf.connector) &&
        Objects.equals(this.sdkNextAction, sessionTokenOneOf.sdkNextAction) &&
        Objects.equals(this.merchantInfo, sessionTokenOneOf.merchantInfo) &&
        Objects.equals(this.shippingAddressRequired, sessionTokenOneOf.shippingAddressRequired) &&
        Objects.equals(this.emailRequired, sessionTokenOneOf.emailRequired) &&
        Objects.equals(this.shippingAddressParameters, sessionTokenOneOf.shippingAddressParameters) &&
        Objects.equals(this.allowedPaymentMethods, sessionTokenOneOf.allowedPaymentMethods) &&
        Objects.equals(this.transactionInfo, sessionTokenOneOf.transactionInfo) &&
        equalsNullable(this.secrets, sessionTokenOneOf.secrets) &&
        Objects.equals(this.walletName, sessionTokenOneOf.walletName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayedSessionToken, connector, sdkNextAction, merchantInfo, shippingAddressRequired, emailRequired, shippingAddressParameters, allowedPaymentMethods, transactionInfo, hashCodeNullable(secrets), walletName);
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
    sb.append("class SessionTokenOneOf {\n");
    sb.append("    delayedSessionToken: ").append(toIndentedString(delayedSessionToken)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    sdkNextAction: ").append(toIndentedString(sdkNextAction)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    shippingAddressRequired: ").append(toIndentedString(shippingAddressRequired)).append("\n");
    sb.append("    emailRequired: ").append(toIndentedString(emailRequired)).append("\n");
    sb.append("    shippingAddressParameters: ").append(toIndentedString(shippingAddressParameters)).append("\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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

    // add `delayed_session_token` to the URL query string
    if (getDelayedSessionToken() != null) {
      try {
        joiner.add(String.format("%sdelayed_session_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayedSessionToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      try {
        joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sdk_next_action` to the URL query string
    if (getSdkNextAction() != null) {
      joiner.add(getSdkNextAction().toUrlQueryString(prefix + "sdk_next_action" + suffix));
    }

    // add `merchant_info` to the URL query string
    if (getMerchantInfo() != null) {
      joiner.add(getMerchantInfo().toUrlQueryString(prefix + "merchant_info" + suffix));
    }

    // add `shipping_address_required` to the URL query string
    if (getShippingAddressRequired() != null) {
      try {
        joiner.add(String.format("%sshipping_address_required%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingAddressRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email_required` to the URL query string
    if (getEmailRequired() != null) {
      try {
        joiner.add(String.format("%semail_required%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shipping_address_parameters` to the URL query string
    if (getShippingAddressParameters() != null) {
      joiner.add(getShippingAddressParameters().toUrlQueryString(prefix + "shipping_address_parameters" + suffix));
    }

    // add `allowed_payment_methods` to the URL query string
    if (getAllowedPaymentMethods() != null) {
      for (int i = 0; i < getAllowedPaymentMethods().size(); i++) {
        if (getAllowedPaymentMethods().get(i) != null) {
          joiner.add(getAllowedPaymentMethods().get(i).toUrlQueryString(String.format("%sallowed_payment_methods%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `transaction_info` to the URL query string
    if (getTransactionInfo() != null) {
      joiner.add(getTransactionInfo().toUrlQueryString(prefix + "transaction_info" + suffix));
    }

    // add `secrets` to the URL query string
    if (getSecrets() != null) {
      joiner.add(getSecrets().toUrlQueryString(prefix + "secrets" + suffix));
    }

    // add `wallet_name` to the URL query string
    if (getWalletName() != null) {
      try {
        joiner.add(String.format("%swallet_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

