package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: Result */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f11687a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11688b;

    /* renamed from: c  reason: collision with root package name */
    private o[] f11689c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11690d;

    /* renamed from: e  reason: collision with root package name */
    private Map<n, Object> f11691e;

    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    public void a(o[] oVarArr) {
        o[] oVarArr2 = this.f11689c;
        if (oVarArr2 == null) {
            this.f11689c = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            o[] oVarArr3 = new o[(oVarArr2.length + oVarArr.length)];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f11689c = oVarArr3;
        }
    }

    public a b() {
        return this.f11690d;
    }

    public byte[] c() {
        return this.f11688b;
    }

    public Map<n, Object> d() {
        return this.f11691e;
    }

    public o[] e() {
        return this.f11689c;
    }

    public String f() {
        return this.f11687a;
    }

    public void g(Map<n, Object> map) {
        if (map != null) {
            Map<n, Object> map2 = this.f11691e;
            if (map2 == null) {
                this.f11691e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(n nVar, Object obj) {
        if (this.f11691e == null) {
            this.f11691e = new EnumMap(n.class);
        }
        this.f11691e.put(nVar, obj);
    }

    public String toString() {
        return this.f11687a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(String str, byte[] bArr, o[] oVarArr, a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j);
    }

    public m(String str, byte[] bArr, int i, o[] oVarArr, a aVar, long j) {
        this.f11687a = str;
        this.f11688b = bArr;
        this.f11689c = oVarArr;
        this.f11690d = aVar;
        this.f11691e = null;
    }
}
