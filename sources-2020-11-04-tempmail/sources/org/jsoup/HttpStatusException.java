package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {

    /* renamed from: b  reason: collision with root package name */
    private int f15144b;

    /* renamed from: c  reason: collision with root package name */
    private String f15145c;

    public String toString() {
        return super.toString() + ". Status=" + this.f15144b + ", URL=" + this.f15145c;
    }
}
