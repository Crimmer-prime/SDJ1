package sample;

import java.util.HashMap;
import java.util.Map;

public class LoginModel
{

  private Map logins;

  public LoginModel()
  {
     /*
    Create dummy data for logins. Feel free to add your own data
     */ logins = new HashMap();
    logins.put("Michael", "password123");
    logins.put("Bob", "qwerty1234");
    logins.put("Alice", "superC00lPASSW0RD!");
    logins.put("Carl", "CarlCarl");
  }

  public boolean login(String username, String password)
  {
    if(!(logins.containsKey(username)))
      return false;
    if(logins.get(username).equals(password))
      return true;
    else
      return false;
  }

}
