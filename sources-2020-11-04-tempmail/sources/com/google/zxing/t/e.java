package com.google.zxing.t;

import java.util.List;

/* compiled from: DecoderResult */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12331a;

    /* renamed from: b  reason: collision with root package name */
    private int f12332b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12333c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f12334d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12335e;

    /* renamed from: f  reason: collision with root package name */
    private Object f12336f;
    private final int g;
    private final int h;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f12334d;
    }

    public String b() {
        return this.f12335e;
    }

    public int c() {
        return this.f12332b;
    }

    public Object d() {
        return this.f12336f;
    }

    public byte[] e() {
        return this.f12331a;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public String h() {
        return this.f12333c;
    }

    public boolean i() {
        return this.g >= 0 && this.h >= 0;
    }

    public void j(Integer num) {
    }

    public void k(Integer num) {
    }

    public void l(int i) {
        this.f12332b = i;
    }

    public void m(Object obj) {
        this.f12336f = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f12331a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f12332b = i3;
        this.f12333c = str;
        this.f12334d = list;
        this.f12335e = str2;
        this.g = i2;
        this.h = i;
    }
}
