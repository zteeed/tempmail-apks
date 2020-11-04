package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import b.c.a.b.d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig */
public abstract class g {

    /* compiled from: SchedulerConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private b.c.a.b.i.x.a f2583a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f2584b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f2584b.put(dVar, bVar);
            return this;
        }

        public g b() {
            if (this.f2583a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f2584b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f2584b;
                this.f2584b = new HashMap();
                return g.c(this.f2583a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public a c(b.c.a.b.i.x.a aVar) {
            this.f2583a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig */
    public static abstract class b {

        /* compiled from: SchedulerConfig */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            d.b bVar = new d.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a a() {
        return new a();
    }

    static g c(b.c.a.b.i.x.a aVar, Map<b.c.a.b.d, b> map) {
        return new c(aVar, map);
    }

    public static g e(b.c.a.b.i.x.a aVar) {
        a a2 = a();
        b.c.a.b.d dVar = b.c.a.b.d.DEFAULT;
        b.a a3 = b.a();
        a3.b(30000);
        a3.d(86400000);
        a2.a(dVar, a3.a());
        b.c.a.b.d dVar2 = b.c.a.b.d.HIGHEST;
        b.a a4 = b.a();
        a4.b(1000);
        a4.d(86400000);
        a2.a(dVar2, a4.a());
        b.c.a.b.d dVar3 = b.c.a.b.d.VERY_LOW;
        b.a a5 = b.a();
        a5.b(86400000);
        a5.d(86400000);
        a5.c(h(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        a2.a(dVar3, a5.a());
        a2.c(aVar);
        return a2.b();
    }

    private static <T> Set<T> h(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void i(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder b(JobInfo.Builder builder, b.c.a.b.d dVar, long j, int i) {
        builder.setMinimumLatency(f(dVar, j, i));
        i(builder, g().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract b.c.a.b.i.x.a d();

    public long f(b.c.a.b.d dVar, long j, int i) {
        long a2 = j - d().a();
        b bVar = g().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.b(), a2), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<b.c.a.b.d, b> g();
}
