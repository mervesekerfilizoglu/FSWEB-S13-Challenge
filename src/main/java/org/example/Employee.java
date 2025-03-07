package org.example;

public class Employee {
    private  int id;
    private  String fullName;
    private  String email;
    private int password;
    private String[] healthplans;
public  Employee(int id, String fullName, String email, int password) {
    this.id=id;
    this.fullName=fullName;
    this.email=email;
    this.password=password;
}
public int getId(){
    return id;
}
public  String getFullName() {
    return  fullName;
}
public  String getEmail() {
    return email;
}
public  int getPassword() {
    return password;
}
public void setId(int id) {
    this.id=id;
}
public void setFullName(String fullName) {
    this.fullName=fullName;
}
public void setEmail(String email) {
    this.email=email;
}
public void setPassword(int password) {
    this.password=password;
}
}




