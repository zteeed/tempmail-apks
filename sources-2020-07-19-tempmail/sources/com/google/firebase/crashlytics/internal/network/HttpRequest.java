package com.google.firebase.crashlytics.internal.network;

import e.b0;
import e.c0;
import e.d0;
import e.g0;
import e.h0;
import e.i;
import e.z;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HttpRequest {
    private static final d0 CLIENT;
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private c0.a bodyBuilder = null;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private final Map<String, String> queryParams;
    private final String url;

    static {
        d0.b x = new d0().x();
        x.c(10000, TimeUnit.MILLISECONDS);
        CLIENT = x.b();
    }

    public HttpRequest(HttpMethod httpMethod, String str, Map<String, String> map) {
        this.method = httpMethod;
        this.url = str;
        this.queryParams = map;
        this.headers = new HashMap();
    }

    private g0 build() {
        g0.a aVar = new g0.a();
        i.a aVar2 = new i.a();
        aVar2.c();
        aVar.b(aVar2.a());
        z.a p = z.r(this.url).p();
        for (Map.Entry next : this.queryParams.entrySet()) {
            p.a((String) next.getKey(), (String) next.getValue());
        }
        aVar.i(p.c());
        for (Map.Entry next2 : this.headers.entrySet()) {
            aVar.c((String) next2.getKey(), (String) next2.getValue());
        }
        c0.a aVar3 = this.bodyBuilder;
        aVar.e(this.method.name(), aVar3 == null ? null : aVar3.e());
        return aVar.a();
    }

    private c0.a getOrCreateBodyBuilder() {
        if (this.bodyBuilder == null) {
            c0.a aVar = new c0.a();
            aVar.f(c0.f13985f);
            this.bodyBuilder = aVar;
        }
        return this.bodyBuilder;
    }

    public HttpResponse execute() throws IOException {
        return HttpResponse.create(CLIENT.b(build()).execute());
    }

    public HttpRequest header(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }

    public String method() {
        return this.method.name();
    }

    public HttpRequest part(String str, String str2) {
        c0.a orCreateBodyBuilder = getOrCreateBodyBuilder();
        orCreateBodyBuilder.a(str, str2);
        this.bodyBuilder = orCreateBodyBuilder;
        return this;
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public HttpRequest part(String str, String str2, String str3, File file) {
        h0 create = h0.create(b0.d(str3), file);
        c0.a orCreateBodyBuilder = getOrCreateBodyBuilder();
        orCreateBodyBuilder.b(str, str2, create);
        this.bodyBuilder = orCreateBodyBuilder;
        return this;
    }
}
