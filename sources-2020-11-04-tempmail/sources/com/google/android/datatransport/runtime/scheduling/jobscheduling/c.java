package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.d;
import b.c.a.b.i.x.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final a f2758a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, g.b> f2759b;

    c(a aVar, Map<d, g.b> map) {
        if (aVar != null) {
            this.f2758a = aVar;
            if (map != null) {
                this.f2759b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public a d() {
        return this.f2758a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f2758a.equals(gVar.d()) || !this.f2759b.equals(gVar.g())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map<d, g.b> g() {
        return this.f2759b;
    }

    public int hashCode() {
        return ((this.f2758a.hashCode() ^ 1000003) * 1000003) ^ this.f2759b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f2758a + ", values=" + this.f2759b + "}";
    }
}
