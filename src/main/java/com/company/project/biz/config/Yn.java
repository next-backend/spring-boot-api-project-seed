package com.company.project.biz.config;

public enum Yn {
    Yes(0, "Yes"), No(1, "No");

    private Integer code;
    private String desc;

    private Yn(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
