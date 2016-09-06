package com.testography.instagramm.model;

import android.net.Uri;

public class InstaImage {

    private Uri mImgResourceUri;

    public InstaImage(Uri imgResourceUri) {
        mImgResourceUri = imgResourceUri;
    }

    public Uri getImgResourceUri() {
        return mImgResourceUri;
    }
}
