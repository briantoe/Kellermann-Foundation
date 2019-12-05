package model;

import java.io.Serializable;
public class CachedOptions implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String desc;

    public CachedOptions(String c, String d)
    {
        code = c;
        desc = d;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
