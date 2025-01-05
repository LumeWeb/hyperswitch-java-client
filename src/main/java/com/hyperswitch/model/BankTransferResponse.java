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
import com.hyperswitch.model.LocalBankTransferAdditionalData;
import com.hyperswitch.model.PixBankTransferAdditionalData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankTransferResponse
 */
@JsonPropertyOrder({
  BankTransferResponse.JSON_PROPERTY_ACH,
  BankTransferResponse.JSON_PROPERTY_SEPA,
  BankTransferResponse.JSON_PROPERTY_BACS,
  BankTransferResponse.JSON_PROPERTY_MULTIBANCO,
  BankTransferResponse.JSON_PROPERTY_PERMATA,
  BankTransferResponse.JSON_PROPERTY_BCA,
  BankTransferResponse.JSON_PROPERTY_BNI_VA,
  BankTransferResponse.JSON_PROPERTY_BRI_VA,
  BankTransferResponse.JSON_PROPERTY_CIMB_VA,
  BankTransferResponse.JSON_PROPERTY_DANAMON_VA,
  BankTransferResponse.JSON_PROPERTY_MANDIRI_VA,
  BankTransferResponse.JSON_PROPERTY_PIX,
  BankTransferResponse.JSON_PROPERTY_PSE,
  BankTransferResponse.JSON_PROPERTY_LOCAL_BANK_TRANSFER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BankTransferResponse {
  public static final String JSON_PROPERTY_ACH = "ach";
  @javax.annotation.Nonnull
  private Object ach;

  public static final String JSON_PROPERTY_SEPA = "sepa";
  @javax.annotation.Nonnull
  private Object sepa;

  public static final String JSON_PROPERTY_BACS = "bacs";
  @javax.annotation.Nonnull
  private Object bacs;

  public static final String JSON_PROPERTY_MULTIBANCO = "multibanco";
  @javax.annotation.Nonnull
  private Object multibanco;

  public static final String JSON_PROPERTY_PERMATA = "permata";
  @javax.annotation.Nonnull
  private Object permata;

  public static final String JSON_PROPERTY_BCA = "bca";
  @javax.annotation.Nonnull
  private Object bca;

  public static final String JSON_PROPERTY_BNI_VA = "bni_va";
  @javax.annotation.Nonnull
  private Object bniVa;

  public static final String JSON_PROPERTY_BRI_VA = "bri_va";
  @javax.annotation.Nonnull
  private Object briVa;

  public static final String JSON_PROPERTY_CIMB_VA = "cimb_va";
  @javax.annotation.Nonnull
  private Object cimbVa;

  public static final String JSON_PROPERTY_DANAMON_VA = "danamon_va";
  @javax.annotation.Nonnull
  private Object danamonVa;

  public static final String JSON_PROPERTY_MANDIRI_VA = "mandiri_va";
  @javax.annotation.Nonnull
  private Object mandiriVa;

  public static final String JSON_PROPERTY_PIX = "pix";
  @javax.annotation.Nonnull
  private PixBankTransferAdditionalData pix;

  public static final String JSON_PROPERTY_PSE = "pse";
  @javax.annotation.Nonnull
  private Object pse;

  public static final String JSON_PROPERTY_LOCAL_BANK_TRANSFER = "local_bank_transfer";
  @javax.annotation.Nonnull
  private LocalBankTransferAdditionalData localBankTransfer;

  public BankTransferResponse() {
  }

  public BankTransferResponse ach(@javax.annotation.Nonnull Object ach) {
    
    this.ach = ach;
    return this;
  }

  /**
   * Get ach
   * @return ach
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAch() {
    return ach;
  }


  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAch(@javax.annotation.Nonnull Object ach) {
    this.ach = ach;
  }


  public BankTransferResponse sepa(@javax.annotation.Nonnull Object sepa) {
    
    this.sepa = sepa;
    return this;
  }

  /**
   * Get sepa
   * @return sepa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSepa() {
    return sepa;
  }


  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepa(@javax.annotation.Nonnull Object sepa) {
    this.sepa = sepa;
  }


  public BankTransferResponse bacs(@javax.annotation.Nonnull Object bacs) {
    
    this.bacs = bacs;
    return this;
  }

  /**
   * Get bacs
   * @return bacs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBacs() {
    return bacs;
  }


  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacs(@javax.annotation.Nonnull Object bacs) {
    this.bacs = bacs;
  }


  public BankTransferResponse multibanco(@javax.annotation.Nonnull Object multibanco) {
    
    this.multibanco = multibanco;
    return this;
  }

  /**
   * Get multibanco
   * @return multibanco
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MULTIBANCO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMultibanco() {
    return multibanco;
  }


  @JsonProperty(JSON_PROPERTY_MULTIBANCO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultibanco(@javax.annotation.Nonnull Object multibanco) {
    this.multibanco = multibanco;
  }


  public BankTransferResponse permata(@javax.annotation.Nonnull Object permata) {
    
    this.permata = permata;
    return this;
  }

  /**
   * Get permata
   * @return permata
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPermata() {
    return permata;
  }


  @JsonProperty(JSON_PROPERTY_PERMATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermata(@javax.annotation.Nonnull Object permata) {
    this.permata = permata;
  }


  public BankTransferResponse bca(@javax.annotation.Nonnull Object bca) {
    
    this.bca = bca;
    return this;
  }

  /**
   * Get bca
   * @return bca
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BCA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBca() {
    return bca;
  }


  @JsonProperty(JSON_PROPERTY_BCA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBca(@javax.annotation.Nonnull Object bca) {
    this.bca = bca;
  }


  public BankTransferResponse bniVa(@javax.annotation.Nonnull Object bniVa) {
    
    this.bniVa = bniVa;
    return this;
  }

  /**
   * Get bniVa
   * @return bniVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BNI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBniVa() {
    return bniVa;
  }


  @JsonProperty(JSON_PROPERTY_BNI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBniVa(@javax.annotation.Nonnull Object bniVa) {
    this.bniVa = bniVa;
  }


  public BankTransferResponse briVa(@javax.annotation.Nonnull Object briVa) {
    
    this.briVa = briVa;
    return this;
  }

  /**
   * Get briVa
   * @return briVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBriVa() {
    return briVa;
  }


  @JsonProperty(JSON_PROPERTY_BRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBriVa(@javax.annotation.Nonnull Object briVa) {
    this.briVa = briVa;
  }


  public BankTransferResponse cimbVa(@javax.annotation.Nonnull Object cimbVa) {
    
    this.cimbVa = cimbVa;
    return this;
  }

  /**
   * Get cimbVa
   * @return cimbVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CIMB_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCimbVa() {
    return cimbVa;
  }


  @JsonProperty(JSON_PROPERTY_CIMB_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCimbVa(@javax.annotation.Nonnull Object cimbVa) {
    this.cimbVa = cimbVa;
  }


  public BankTransferResponse danamonVa(@javax.annotation.Nonnull Object danamonVa) {
    
    this.danamonVa = danamonVa;
    return this;
  }

  /**
   * Get danamonVa
   * @return danamonVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DANAMON_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDanamonVa() {
    return danamonVa;
  }


  @JsonProperty(JSON_PROPERTY_DANAMON_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDanamonVa(@javax.annotation.Nonnull Object danamonVa) {
    this.danamonVa = danamonVa;
  }


  public BankTransferResponse mandiriVa(@javax.annotation.Nonnull Object mandiriVa) {
    
    this.mandiriVa = mandiriVa;
    return this;
  }

  /**
   * Get mandiriVa
   * @return mandiriVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MANDIRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMandiriVa() {
    return mandiriVa;
  }


  @JsonProperty(JSON_PROPERTY_MANDIRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandiriVa(@javax.annotation.Nonnull Object mandiriVa) {
    this.mandiriVa = mandiriVa;
  }


  public BankTransferResponse pix(@javax.annotation.Nonnull PixBankTransferAdditionalData pix) {
    
    this.pix = pix;
    return this;
  }

  /**
   * Get pix
   * @return pix
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PixBankTransferAdditionalData getPix() {
    return pix;
  }


  @JsonProperty(JSON_PROPERTY_PIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPix(@javax.annotation.Nonnull PixBankTransferAdditionalData pix) {
    this.pix = pix;
  }


  public BankTransferResponse pse(@javax.annotation.Nonnull Object pse) {
    
    this.pse = pse;
    return this;
  }

  /**
   * Get pse
   * @return pse
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPse() {
    return pse;
  }


  @JsonProperty(JSON_PROPERTY_PSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPse(@javax.annotation.Nonnull Object pse) {
    this.pse = pse;
  }


  public BankTransferResponse localBankTransfer(@javax.annotation.Nonnull LocalBankTransferAdditionalData localBankTransfer) {
    
    this.localBankTransfer = localBankTransfer;
    return this;
  }

  /**
   * Get localBankTransfer
   * @return localBankTransfer
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCAL_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalBankTransferAdditionalData getLocalBankTransfer() {
    return localBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalBankTransfer(@javax.annotation.Nonnull LocalBankTransferAdditionalData localBankTransfer) {
    this.localBankTransfer = localBankTransfer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferResponse bankTransferResponse = (BankTransferResponse) o;
    return Objects.equals(this.ach, bankTransferResponse.ach) &&
        Objects.equals(this.sepa, bankTransferResponse.sepa) &&
        Objects.equals(this.bacs, bankTransferResponse.bacs) &&
        Objects.equals(this.multibanco, bankTransferResponse.multibanco) &&
        Objects.equals(this.permata, bankTransferResponse.permata) &&
        Objects.equals(this.bca, bankTransferResponse.bca) &&
        Objects.equals(this.bniVa, bankTransferResponse.bniVa) &&
        Objects.equals(this.briVa, bankTransferResponse.briVa) &&
        Objects.equals(this.cimbVa, bankTransferResponse.cimbVa) &&
        Objects.equals(this.danamonVa, bankTransferResponse.danamonVa) &&
        Objects.equals(this.mandiriVa, bankTransferResponse.mandiriVa) &&
        Objects.equals(this.pix, bankTransferResponse.pix) &&
        Objects.equals(this.pse, bankTransferResponse.pse) &&
        Objects.equals(this.localBankTransfer, bankTransferResponse.localBankTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, sepa, bacs, multibanco, permata, bca, bniVa, briVa, cimbVa, danamonVa, mandiriVa, pix, pse, localBankTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferResponse {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    multibanco: ").append(toIndentedString(multibanco)).append("\n");
    sb.append("    permata: ").append(toIndentedString(permata)).append("\n");
    sb.append("    bca: ").append(toIndentedString(bca)).append("\n");
    sb.append("    bniVa: ").append(toIndentedString(bniVa)).append("\n");
    sb.append("    briVa: ").append(toIndentedString(briVa)).append("\n");
    sb.append("    cimbVa: ").append(toIndentedString(cimbVa)).append("\n");
    sb.append("    danamonVa: ").append(toIndentedString(danamonVa)).append("\n");
    sb.append("    mandiriVa: ").append(toIndentedString(mandiriVa)).append("\n");
    sb.append("    pix: ").append(toIndentedString(pix)).append("\n");
    sb.append("    pse: ").append(toIndentedString(pse)).append("\n");
    sb.append("    localBankTransfer: ").append(toIndentedString(localBankTransfer)).append("\n");
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

