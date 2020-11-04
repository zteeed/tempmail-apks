package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: Result */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f12236a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f12237b;

    /* renamed from: c  reason: collision with root package name */
    private o[] f12238c;

    /* renamed from: d  reason: collision with root package name */
    private final a f12239d;

    /* renamed from: e  reason: collision with root package name */
    private Map<n, Object> f12240e;

    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    public void a(o[] oVarArr) {
        o[] oVarArr2 = this.f12238c;
        if (oVarArr2 == null) {
            this.f12238c = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            o[] oVarArr3 = new o[(oVarArr2.length + oVarArr.length)];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f12238c = oVarArr3;
        }
    }

    public a b() {
        return this.f12239d;
    }

    public byte[] c() {
        return this.f12237b;
    }

    public Map<n, Object> d() {
        return this.f12240e;
    }

    public o[] e() {
        return this.f12238c;
    }

    public String f() {
        return this.f12236a;
    }

    public void g(Map<n, Object> map) {
        if (map != null) {
            Map<n, Object> map2 = this.f12240e;
            if (map2 == null) {
                this.f12240e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(n nVar, Object obj) {
        if (this.f12240e == null) {
            this.f12240e = new EnumMap(n.class);
        }
        this.f12240e.put(nVar, obj);
    }

    public String toString() {
        return this.f12236a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(String str, byte[] bArr, o[] oVarArr, a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j);
    }

    public m(String str, byte[] bArr, int i, o[] oVarArr, a aVar, long j) {
        this.f12236a = str;
        this.f12237b = bArr;
        this.f12238c = oVarArr;
        this.f12239d = aVar;
        this.f12240e = null;
    }
}
