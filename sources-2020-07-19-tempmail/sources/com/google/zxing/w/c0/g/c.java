package com.google.zxing.w.c0.g;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandedRow */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f11900a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11901b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11902c;

    c(List<b> list, int i, boolean z) {
        this.f11900a = new ArrayList(list);
        this.f11901b = i;
        this.f11902c = z;
    }

    /* access modifiers changed from: package-private */
    public List<b> a() {
        return this.f11900a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f11901b;
    }

    /* access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f11900a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f11900a.equals(cVar.a()) || this.f11902c != cVar.f11902c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f11900a.hashCode() ^ Boolean.valueOf(this.f11902c).hashCode();
    }

    public String toString() {
        return "{ " + this.f11900a + " }";
    }
}
