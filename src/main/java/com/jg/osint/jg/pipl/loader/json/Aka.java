package com.jg.osint.jg.pipl.loader.json;

import com.google.gson.annotations.SerializedName;

public class Aka {

    @SerializedName(value = "firstname", alternate = "firstName")
    private String firstName;

    @SerializedName(value = "middlename", alternate = "middleName")
    private String middleName;

    @SerializedName(value = "lastname", alternate = "lastName")
    private String lastName;

    @Override
    public String toString() {
        return "Aka{" + "fn=" + firstName + ", mn=" + middleName + ", ln=" + lastName + '}';
    }
}
