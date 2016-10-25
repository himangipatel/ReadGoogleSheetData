package com.himangi.androidlearning;

/**
 * Created by himangi.
 */

class LibraryDetails {

    private String libLinkURL;
    private String libName;

    LibraryDetails(String libLinkURL, String libName) {
        this.libLinkURL = libLinkURL;
        this.libName = libName;
    }

    String getLibLinkURL() {
        return libLinkURL;
    }

    @SuppressWarnings("unused")
    public void setLibLinkURL(String libLinkURL) {
        this.libLinkURL = libLinkURL;
    }

    String getLibName() {
        return libName;
    }

    @SuppressWarnings("unused")
    public void setLibName(String libName) {
        this.libName = libName;
    }
}
