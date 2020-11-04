package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjr implements zzjo {
    private static final zzcv<Long> A;
    private static final zzcv<Long> B;
    private static final zzcv<Long> C;
    private static final zzcv<Long> D;
    private static final zzcv<Long> E;
    private static final zzcv<String> F;
    private static final zzcv<Long> G;

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Long> f9874a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Long> f9875b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<String> f9876c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<String> f9877d;

    /* renamed from: e  reason: collision with root package name */
    private static final zzcv<Long> f9878e;

    /* renamed from: f  reason: collision with root package name */
    private static final zzcv<Long> f9879f;
    private static final zzcv<Long> g;
    private static final zzcv<Long> h;
    private static final zzcv<Long> i;
    private static final zzcv<Long> j;
    private static final zzcv<Long> k;
    private static final zzcv<Long> l;
    private static final zzcv<Long> m;
    private static final zzcv<Long> n;
    private static final zzcv<Long> o;
    private static final zzcv<Long> p;
    private static final zzcv<Long> q;
    private static final zzcv<Long> r;
    private static final zzcv<Long> s;
    private static final zzcv<Long> t;
    private static final zzcv<Long> u;
    private static final zzcv<Long> v;
    private static final zzcv<Long> w;
    private static final zzcv<Long> x;
    private static final zzcv<Long> y;
    private static final zzcv<Long> z;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9874a = zzdb.b("measurement.ad_id_cache_time", 10000);
        f9875b = zzdb.b("measurement.config.cache_time", 86400000);
        zzdb.c("measurement.log_tag", "FA");
        f9876c = zzdb.c("measurement.config.url_authority", "app-measurement.com");
        f9877d = zzdb.c("measurement.config.url_scheme", "https");
        f9878e = zzdb.b("measurement.upload.debug_upload_interval", 1000);
        f9879f = zzdb.b("measurement.lifetimevalue.max_currency_tracked", 4);
        g = zzdb.b("measurement.store.max_stored_events_per_app", 100000);
        h = zzdb.b("measurement.experiment.max_ids", 50);
        i = zzdb.b("measurement.audience.filter_result_max_count", 200);
        j = zzdb.b("measurement.alarm_manager.minimum_interval", 60000);
        k = zzdb.b("measurement.upload.minimum_delay", 500);
        l = zzdb.b("measurement.monitoring.sample_period_millis", 86400000);
        m = zzdb.b("measurement.upload.realtime_upload_interval", 10000);
        n = zzdb.b("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        zzdb.b("measurement.config.cache_time.service", 3600000);
        o = zzdb.b("measurement.service_client.idle_disconnect_millis", 5000);
        zzdb.c("measurement.log_tag.service", "FA-SVC");
        p = zzdb.b("measurement.upload.stale_data_deletion_interval", 86400000);
        q = zzdb.b("measurement.upload.backoff_period", 43200000);
        r = zzdb.b("measurement.upload.initial_upload_delay_time", 15000);
        s = zzdb.b("measurement.upload.interval", 3600000);
        t = zzdb.b("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        u = zzdb.b("measurement.upload.max_bundles", 100);
        v = zzdb.b("measurement.upload.max_conversions_per_day", 500);
        w = zzdb.b("measurement.upload.max_error_events_per_day", 1000);
        x = zzdb.b("measurement.upload.max_events_per_bundle", 1000);
        y = zzdb.b("measurement.upload.max_events_per_day", 100000);
        z = zzdb.b("measurement.upload.max_public_events_per_day", 50000);
        A = zzdb.b("measurement.upload.max_queue_time", 2419200000L);
        B = zzdb.b("measurement.upload.max_realtime_events_per_day", 10);
        C = zzdb.b("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        D = zzdb.b("measurement.upload.retry_count", 6);
        E = zzdb.b("measurement.upload.retry_time", 1800000);
        F = zzdb.c("measurement.upload.url", "https://app-measurement.com/a");
        G = zzdb.b("measurement.upload.window_interval", 3600000);
    }

    public final long A() {
        return k.n().longValue();
    }

    public final long B() {
        return t.n().longValue();
    }

    public final long C() {
        return A.n().longValue();
    }

    public final long D() {
        return B.n().longValue();
    }

    public final long L() {
        return G.n().longValue();
    }

    public final long Q() {
        return E.n().longValue();
    }

    public final String X() {
        return F.n();
    }

    public final long a() {
        return f9874a.n().longValue();
    }

    public final long b() {
        return f9875b.n().longValue();
    }

    public final String c() {
        return f9876c.n();
    }

    public final String d() {
        return f9877d.n();
    }

    public final long e() {
        return f9878e.n().longValue();
    }

    public final long f() {
        return n.n().longValue();
    }

    public final long g() {
        return q.n().longValue();
    }

    public final long h() {
        return r.n().longValue();
    }

    public final long i() {
        return w.n().longValue();
    }

    public final long j() {
        return f9879f.n().longValue();
    }

    public final long k() {
        return o.n().longValue();
    }

    public final long l() {
        return g.n().longValue();
    }

    public final long m() {
        return u.n().longValue();
    }

    public final long n() {
        return m.n().longValue();
    }

    public final long o() {
        return p.n().longValue();
    }

    public final long p() {
        return h.n().longValue();
    }

    public final long q() {
        return v.n().longValue();
    }

    public final long r() {
        return i.n().longValue();
    }

    public final long s() {
        return y.n().longValue();
    }

    public final long t() {
        return z.n().longValue();
    }

    public final long u() {
        return l.n().longValue();
    }

    public final long v() {
        return x.n().longValue();
    }

    public final long w() {
        return C.n().longValue();
    }

    public final long x() {
        return j.n().longValue();
    }

    public final long y() {
        return s.n().longValue();
    }

    public final long z() {
        return D.n().longValue();
    }
}
