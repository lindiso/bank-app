package com.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * A UI bound error response message.
 */
@ApiModel(description = "A UI bound error response message.")
@Validated
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2025-06-21T11:48:37.683+02:00")

public class TechnicalErrorResponse   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("technicalMessage")
  private String technicalMessage = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("contact")
  private String contact = null;

  @JsonProperty("moreInfo")
  private String moreInfo = null;

  public TechnicalErrorResponse statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The HTTP status code.
   * @return statusCode
  **/
  @ApiModelProperty(example = "401", required = true, value = "The HTTP status code.")
  @NotNull


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public TechnicalErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The internal error code.
   * @return errorCode
  **/
  @ApiModelProperty(example = "401001", value = "The internal error code.")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public TechnicalErrorResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Generated ticket
   * @return reference
  **/
  @ApiModelProperty(example = "1545123655606", required = true, value = "Generated ticket")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public TechnicalErrorResponse technicalMessage(String technicalMessage) {
    this.technicalMessage = technicalMessage;
    return this;
  }

  /**
   * An optional technical message.
   * @return technicalMessage
  **/
  @ApiModelProperty(example = "Invalid user account id", value = "An optional technical message.")


  public String getTechnicalMessage() {
    return technicalMessage;
  }

  public void setTechnicalMessage(String technicalMessage) {
    this.technicalMessage = technicalMessage;
  }

  public TechnicalErrorResponse value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The error message.
   * @return value
  **/
  @ApiModelProperty(example = "You do not have access", required = true, value = "The error message.")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TechnicalErrorResponse origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * The request url that caused the error.
   * @return origin
  **/
  @ApiModelProperty(example = "http://somelocation/path/pathvariable", value = "The request url that caused the error.")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public TechnicalErrorResponse contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * bank support centre
   * @return contact
  **/
  @ApiModelProperty(example = " 080 0000 0000 or support@bank.co.za", value = "bank support centre")


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public TechnicalErrorResponse moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  /**
   * More info on error message
   * @return moreInfo
  **/
  @ApiModelProperty(example = " Stack trace…..", value = "More info on error message")


  public String getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalErrorResponse technicalErrorResponse = (TechnicalErrorResponse) o;
    return Objects.equals(this.statusCode, technicalErrorResponse.statusCode) &&
        Objects.equals(this.errorCode, technicalErrorResponse.errorCode) &&
        Objects.equals(this.reference, technicalErrorResponse.reference) &&
        Objects.equals(this.technicalMessage, technicalErrorResponse.technicalMessage) &&
        Objects.equals(this.value, technicalErrorResponse.value) &&
        Objects.equals(this.origin, technicalErrorResponse.origin) &&
        Objects.equals(this.contact, technicalErrorResponse.contact) &&
        Objects.equals(this.moreInfo, technicalErrorResponse.moreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, errorCode, reference, technicalMessage, value, origin, contact, moreInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalErrorResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    technicalMessage: ").append(toIndentedString(technicalMessage)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
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

