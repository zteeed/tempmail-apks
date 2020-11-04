package com.google.zxing.w.c0.g;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandedRow */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f12449a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12450b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12451c;

    c(List<b> list, int i, boolean z) {
        this.f12449a = new ArrayList(list);
        this.f12450b = i;
        this.f12451c = z;
    }

    /* access modifiers changed from: package-private */
    public List<b> a() {
        return this.f12449a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f12450b;
    }

    /* access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f12449a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f12449a.equals(cVar.a()) || this.f12451c != cVar.f12451c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12449a.hashCode() ^ Boolean.valueOf(this.f12451c).hashCode();
    }

    public String toString() {
        return "{ " + this.f12449a + " }";
    }
}
