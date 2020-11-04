package com.google.zxing.t;

import java.util.List;

/* compiled from: DecoderResult */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11782a;

    /* renamed from: b  reason: collision with root package name */
    private int f11783b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11784c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f11785d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11786e;

    /* renamed from: f  reason: collision with root package name */
    private Object f11787f;
    private final int g;
    private final int h;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f11785d;
    }

    public String b() {
        return this.f11786e;
    }

    public int c() {
        return this.f11783b;
    }

    public Object d() {
        return this.f11787f;
    }

    public byte[] e() {
        return this.f11782a;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public String h() {
        return this.f11784c;
    }

    public boolean i() {
        return this.g >= 0 && this.h >= 0;
    }

    public void j(Integer num) {
    }

    public void k(Integer num) {
    }

    public void l(int i) {
        this.f11783b = i;
    }

    public void m(Object obj) {
        this.f11787f = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f11782a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f11783b = i3;
        this.f11784c = str;
        this.f11785d = list;
        this.f11786e = str2;
        this.g = i2;
        this.h = i;
    }
}
