package com.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * An error message.
 */
@ApiModel(description = "An error message.")
@Validated
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2025-06-21T11:48:37.683+02:00")

public class Error   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("severity")
  private Severity severity = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The error code.
   * @return code
  **/
  @ApiModelProperty(example = "001", value = "The error code.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to error
   * @return path
  **/
  @ApiModelProperty(example = "path/to/field", value = "Path to error")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The error message.
   * @return message
  **/
  @ApiModelProperty(example = "Schedule Number is Mandatory", required = true, value = "The error message.")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Backend error origin
   * @return origin
  **/
  @ApiModelProperty(example = "TMS Service", value = "Backend error origin")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Error severity(Severity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Severity getSeverity() {
    return severity;
  }

  public void setSeverity(Severity severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.path, error.path) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.origin, error.origin) &&
        Objects.equals(this.severity, error.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, path, message, origin, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

