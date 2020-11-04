package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;

/* compiled from: AutoValue_CreationContext */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2731a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2732b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2733c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2734d;

    c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f2731a = context;
            if (aVar != null) {
                this.f2732b = aVar;
                if (aVar2 != null) {
                    this.f2733c = aVar2;
                    if (str != null) {
                        this.f2734d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.f2731a;
    }

    public String c() {
        return this.f2734d;
    }

    public a d() {
        return this.f2733c;
    }

    public a e() {
        return this.f2732b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f2731a.equals(hVar.b()) || !this.f2732b.equals(hVar.e()) || !this.f2733c.equals(hVar.d()) || !this.f2734d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f2731a.hashCode() ^ 1000003) * 1000003) ^ this.f2732b.hashCode()) * 1000003) ^ this.f2733c.hashCode()) * 1000003) ^ this.f2734d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f2731a + ", wallClock=" + this.f2732b + ", monotonicClock=" + this.f2733c + ", backendName=" + this.f2734d + "}";
    }
}
