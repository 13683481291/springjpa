package com.yy.springjpa.bean;



import javax.persistence.*;


@Entity
@Table(name = "sys_user_t")
public class UserBean {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int uid;
    private String uname;
    private String uphone;





    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getUphone() {
        return uphone;
    }



    @Override
    public String toString() {
        return "UserBean{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }
}