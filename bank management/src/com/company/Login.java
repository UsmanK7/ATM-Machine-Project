package com.company;

public class Login {
String username;
String password;
Login(){
username="admin";
password="bscs";
}
boolean validate( String username, String password) {
if(this.username.equalsIgnoreCase(username) &&
this.password.equals(password))
return true;
else
return false;
}
}