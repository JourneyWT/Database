package com.jwt.mybatis1.bo;

/**
 * ʵ����
 *
 * @author juwenting
 * @date 2018/1/17 ����1:51
 */
public class User {
    private int id;
    /**
     * ���֤��
     */
    private String idNo;
    /**
     * ����
     */
    private String name;
    /**
     * ����
     */
    private int age;
    /**
     * �༶����
     */
    private String className;
    /**
     * ����
     */
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
