package com.example.info;

import com.sun.xml.bind.v2.model.core.ID;

import java.io.Serializable;

public class RpcInfo implements Serializable {
    private static final long serialVersionUID = -1411196001315001514L;
    /**
     * @param
     * @return
     * @author liufa
     * @date
     * 包名，类名，方法+参数
     */

    private String packageName;
    private String className;
    private String methodName;
    private Object[] para;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getPara() {
        return para;
    }

    public void setPara(Object[] para) {
        this.para = para;
    }
}
