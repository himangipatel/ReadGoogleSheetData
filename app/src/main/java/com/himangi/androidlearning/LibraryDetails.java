package com.himangi.androidlearning;

/**
 * Created by himangi.
 */

public class LibraryDetails {

    private String libLinkURL;
    private String libName;

    public LibraryDetails(String libLinkURL, String libName) {
        this.libLinkURL = libLinkURL;
        this.libName = libName;
    }

    public String getLibLinkURL() {
        return libLinkURL;
    }

    public void setLibLinkURL(String libLinkURL) {
        this.libLinkURL = libLinkURL;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }
}
