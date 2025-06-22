package com.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The list of erorrs
 */
@ApiModel(description = "The list of erorrs")
@Validated
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2025-06-21T11:48:37.683+02:00")




public class GenericErrorResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  public GenericErrorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GenericErrorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericErrorResponse genericErrorResponse = (GenericErrorResponse) o;
    return Objects.equals(this.errors, genericErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericErrorResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

