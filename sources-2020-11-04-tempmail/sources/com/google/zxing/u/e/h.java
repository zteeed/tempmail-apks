package com.google.zxing.u.e;

import com.google.zxing.e;
import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f12396a;

    /* renamed from: b  reason: collision with root package name */
    private l f12397b;

    /* renamed from: c  reason: collision with root package name */
    private e f12398c;

    /* renamed from: d  reason: collision with root package name */
    private e f12399d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f12400e;

    /* renamed from: f  reason: collision with root package name */
    int f12401f;
    private int g;
    private k h;
    private int i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f12396a = sb.toString();
        this.f12397b = l.FORCE_NONE;
        this.f12400e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int h() {
        return this.f12396a.length() - this.i;
    }

    public int a() {
        return this.f12400e.length();
    }

    public StringBuilder b() {
        return this.f12400e;
    }

    public char c() {
        return this.f12396a.charAt(this.f12401f);
    }

    public String d() {
        return this.f12396a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return h() - this.f12401f;
    }

    public k g() {
        return this.h;
    }

    public boolean i() {
        return this.f12401f < h();
    }

    public void j() {
        this.g = -1;
    }

    public void k() {
        this.h = null;
    }

    public void l(e eVar, e eVar2) {
        this.f12398c = eVar;
        this.f12399d = eVar2;
    }

    public void m(int i2) {
        this.i = i2;
    }

    public void n(l lVar) {
        this.f12397b = lVar;
    }

    public void o(int i2) {
        this.g = i2;
    }

    public void p() {
        q(a());
    }

    public void q(int i2) {
        k kVar = this.h;
        if (kVar == null || i2 > kVar.a()) {
            this.h = k.l(i2, this.f12397b, this.f12398c, this.f12399d, true);
        }
    }

    public void r(char c2) {
        this.f12400e.append(c2);
    }

    public void s(String str) {
        this.f12400e.append(str);
    }
}
