package net.xiaoyuer.demo.domian;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Users {

    @JsonIgnore
    private int age;
    @JsonProperty("SuperMan is :")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale = "zh",timezone ="GMT+8")
    private Date brithday;

    public Users(int age, String name, Date brithday) {

        this.age = age;
        this.brithday = brithday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
