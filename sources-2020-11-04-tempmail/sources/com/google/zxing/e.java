package com.google.zxing;

import com.tempmail.utils.x;

/* compiled from: Dimension */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f12219a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12220b;

    public int a() {
        return this.f12220b;
    }

    public int b() {
        return this.f12219a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f12219a == eVar.f12219a && this.f12220b == eVar.f12220b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12219a * 32713) + this.f12220b;
    }

    public String toString() {
        return this.f12219a + x.f13134a + this.f12220b;
    }
}
