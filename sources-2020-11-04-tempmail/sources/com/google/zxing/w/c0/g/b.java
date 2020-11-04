package com.google.zxing.w.c0.g;

import com.google.zxing.w.c0.c;

/* compiled from: ExpandedPair */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.w.c0.b f12446a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.zxing.w.c0.b f12447b;

    /* renamed from: c  reason: collision with root package name */
    private final c f12448c;

    b(com.google.zxing.w.c0.b bVar, com.google.zxing.w.c0.b bVar2, c cVar, boolean z) {
        this.f12446a = bVar;
        this.f12447b = bVar2;
        this.f12448c = cVar;
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
        return this.f12448c;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.w.c0.b c() {
        return this.f12446a;
    }

    /* access modifiers changed from: package-private */
    public com.google.zxing.w.c0.b d() {
        return this.f12447b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!a(this.f12446a, bVar.f12446a) || !a(this.f12447b, bVar.f12447b) || !a(this.f12448c, bVar.f12448c)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f12447b == null;
    }

    public int hashCode() {
        return (e(this.f12446a) ^ e(this.f12447b)) ^ e(this.f12448c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f12446a);
        sb.append(" , ");
        sb.append(this.f12447b);
        sb.append(" : ");
        c cVar = this.f12448c;
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
