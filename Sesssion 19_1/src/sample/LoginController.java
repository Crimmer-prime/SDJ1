package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController
{

  @FXML private Button buttonLogin;
  @FXML private Button buttonCancel;
  @FXML private TextField textFieldUserName;
  @FXML private TextField textFieldPassword;

  private LoginModel model;

  public void setModel(LoginModel model)
  {
    this.model = model;
  }

  public void login()
  {
    if(model.login(textFieldUserName.getText(), textFieldPassword.getText()))
      System.out.println("Succesfully logged in!");
    else
      System.out.println("Invalid username/password");
  }

  public void cancel()
  {
    Platform.exit();
  }
}

