package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {

    /* renamed from: b  reason: collision with root package name */
    private int f14575b;

    /* renamed from: c  reason: collision with root package name */
    private String f14576c;

    public String toString() {
        return super.toString() + ". Status=" + this.f14575b + ", URL=" + this.f14576c;
    }
}
