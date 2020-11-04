package com.google.zxing.w.c0.g;

import com.google.zxing.w.c0.c;

/* compiled from: ExpandedPair */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.w.c0.b f11897a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.zxing.w.c0.b f11898b;

    /* renamed from: c  reason: collision with root package name */
    private final c f11899c;

    b(com.google.zxing.w.c0.b bVar, com.google.zxing.w.c0.b bVar2, c cVar, boolean z) {
        this.f11897a = bVar;
        this.f11898b = bVar2;
        this.f11899c = cVar;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return this.f11899c;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.w.c0.b c() {
        return this.f11897a;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.w.c0.b d() {
        return this.f11898b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!a(this.f11897a, bVar.f11897a) || !a(this.f11898b, bVar.f11898b) || !a(this.f11899c, bVar.f11899c)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f11898b == null;
    }

    public int hashCode() {
        return (e(this.f11897a) ^ e(this.f11898b)) ^ e(this.f11899c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f11897a);
        sb.append(" , ");
        sb.append(this.f11898b);
        sb.append(" : ");
        c cVar = this.f11899c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
