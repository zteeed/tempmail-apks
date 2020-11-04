package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;

/* compiled from: AutoValue_CreationContext */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2543a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2544b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2545c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2546d;

    c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f2543a = context;
            if (aVar != null) {
                this.f2544b = aVar;
                if (aVar2 != null) {
                    this.f2545c = aVar2;
                    if (str != null) {
                        this.f2546d = str;
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
        return this.f2543a;
    }

    public String c() {
        return this.f2546d;
    }

    public a d() {
        return this.f2545c;
    }

    public a e() {
        return this.f2544b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f2543a.equals(hVar.b()) || !this.f2544b.equals(hVar.e()) || !this.f2545c.equals(hVar.d()) || !this.f2546d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f2543a.hashCode() ^ 1000003) * 1000003) ^ this.f2544b.hashCode()) * 1000003) ^ this.f2545c.hashCode()) * 1000003) ^ this.f2546d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f2543a + ", wallClock=" + this.f2544b + ", monotonicClock=" + this.f2545c + ", backendName=" + this.f2546d + "}";
    }
}
