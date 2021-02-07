package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Error implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String controller_Name;
  private String method_Name;
  private String error;
  private LocalDateTime error_date;

  public String getController_Name()
  {
    return this.controller_Name;
  }

  public void setController_Name(String controller_Name) {
    this.controller_Name = controller_Name;
  }

  public String getMethod_Name() {
    return this.method_Name;
  }

  public void setMethod_Name(String method_Name) {
    this.method_Name = method_Name;
  }

  public String getError() {
    return this.error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public LocalDateTime getError_date() {
    return this.error_date;
  }

  public void setError_date(LocalDateTime error_date) {
    this.error_date = error_date;
  }

  public Error() {
  }

  public Error(String controller_Name, String method_Name, String error, LocalDateTime error_date) {
    this.controller_Name = controller_Name;
    this.method_Name = method_Name;
    this.error = error;
    this.error_date = error_date;
  }
}