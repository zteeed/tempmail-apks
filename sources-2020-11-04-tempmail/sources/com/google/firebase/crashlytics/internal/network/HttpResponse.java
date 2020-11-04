package com.google.firebase.crashlytics.internal.network;

import e.i0;
import e.y;
import java.io.IOException;

public class HttpResponse {
    private String body;
    private int code;
    private y headers;

    HttpResponse(int i, String str, y yVar) {
        this.code = i;
        this.body = str;
        this.headers = yVar;
    }

    static HttpResponse create(i0 i0Var) throws IOException {
        return new HttpResponse(i0Var.d(), i0Var.a() == null ? null : i0Var.a().string(), i0Var.h());
    }

    public String body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }

    public String header(String str) {
        return this.headers.c(str);
    }
}
