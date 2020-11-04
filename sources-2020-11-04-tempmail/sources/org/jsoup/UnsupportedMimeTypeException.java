package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: b  reason: collision with root package name */
    private String f15146b;

    /* renamed from: c  reason: collision with root package name */
    private String f15147c;

    public String toString() {
        return super.toString() + ". Mimetype=" + this.f15146b + ", URL=" + this.f15147c;
    }
}
