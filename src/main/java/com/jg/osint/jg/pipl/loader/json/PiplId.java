package com.jg.osint.jg.pipl.loader.json;

import com.google.gson.annotations.SerializedName;

public class PiplId {

    @SerializedName(value = "$oid")
    private String oid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "PiplId{" + "oid='" + oid + '\'' + '}';
    }
}
