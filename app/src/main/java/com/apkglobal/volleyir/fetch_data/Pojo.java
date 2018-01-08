package com.apkglobal.volleyir.fetch_data;

/**
 * Created by HP on 06-Jan-18.
 */

public class Pojo {
    private String name;
    private String email;
    private String phn;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhn() {
        return phn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public Pojo(String name, String email, String phn) {

        this.name = name;
        this.email = email;
        this.phn = phn;

    }
}
