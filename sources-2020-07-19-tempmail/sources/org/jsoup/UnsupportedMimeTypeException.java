package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: b  reason: collision with root package name */
    private String f14577b;

    /* renamed from: c  reason: collision with root package name */
    private String f14578c;

    public String toString() {
        return super.toString() + ". Mimetype=" + this.f14577b + ", URL=" + this.f14578c;
    }
}
