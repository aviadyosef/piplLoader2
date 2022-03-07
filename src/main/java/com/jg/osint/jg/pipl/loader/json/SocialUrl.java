package com.jg.osint.jg.pipl.loader.json;

public class SocialUrl {

    private String dataSource;
    private String domain;
    private String name;
    private String url;


    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDataSource() {
        return dataSource;
    }


    @Override
    public String toString() {
        return (
            "SocialUrl{" +
            "source='" +
            dataSource +
            '\'' +
            ", domain='" +
            domain +
            '\'' +
            ", name='" +
            name +
            '\'' +
            ", url='" +
            url +
            '\'' +
            '}'
        );
    }
}
