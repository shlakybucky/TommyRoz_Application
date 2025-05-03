//package model;
//
////import jakarta.persistence.Entity;
//import jakarta.persistence.*;
////import jakarta.persistence.GeneratedValue;
////import jakarta.persistence.GenerationType;
////import jakarta.persistence.Id;
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String fullName;
//    private String username;
//    private String phone;
//    private String email;
//    private String password;
//    private String role; //simple user or premium user
//
//    //constructors
//    public User(){
//
//    }
//    public User(String fullName, String password, String username, String phone, String email){
//        this.fullName = fullName;
//        this.password = password;
//        this.username = username;
//        this.phone = phone;
//        this.email = email;
//        this.role = "ROLE_USER";
//    }
//
//    //getters and setters
//    public Long getId(){return id;}
//    public void setId(Long id){this.id = id;}
//
//    public String getFullName(){return fullName;}
//    public void setFullName(String fullName){this.fullName = fullName;}
//
//    public void setUsername(String fullName){this.username = username;}
//    public String getUsername(){return username;}
//
//    public void setPhone(String phone){this.phone = phone;}
//    public String getPhone(){return phone;}
//
//    public String getEmail(){return email;}
//    public void setEmail(String email){this.email = email;}
//
//    public String getPassword(){ return password;}
//    public void setPassword(String password){this.password = password;}
//
//    public String getRole(){return role;}
//    public void setRole(String role){
//        //if(role = null || role.isEmpty()){
//           // this.role = "ROLE_USER";
//        //}else{
//            this.role = role;
//       // }
//    }
//}
