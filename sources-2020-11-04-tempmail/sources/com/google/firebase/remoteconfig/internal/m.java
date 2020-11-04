package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.g;
import java.util.Date;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class m {

    /* renamed from: d  reason: collision with root package name */
    static final Date f12059d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    static final Date f12060e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f12061a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12062b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f12063c = new Object();

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f12064a;

        /* renamed from: b  reason: collision with root package name */
        private Date f12065b;

        a(int i, Date date) {
            this.f12064a = i;
            this.f12065b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f12065b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f12064a;
        }
    }

    public m(SharedPreferences sharedPreferences) {
        this.f12061a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f12063c) {
            aVar = new a(this.f12061a.getInt("num_failed_fetches", 0), new Date(this.f12061a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public long b() {
        return this.f12061a.getLong("fetch_timeout_in_seconds", 60);
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f12061a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Date d() {
        return new Date(this.f12061a.getLong("last_fetch_time_in_millis", -1));
    }

    public boolean e() {
        return this.f12061a.getBoolean("is_developer_mode_enabled", false);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        g(0, f12060e);
    }

    /* access modifiers changed from: package-private */
    public void g(int i, Date date) {
        synchronized (this.f12063c) {
            this.f12061a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void h(g gVar) {
        synchronized (this.f12062b) {
            this.f12061a.edit().putBoolean("is_developer_mode_enabled", gVar.c()).putLong("fetch_timeout_in_seconds", gVar.a()).putLong("minimum_fetch_interval_in_seconds", gVar.b()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        synchronized (this.f12062b) {
            this.f12061a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        synchronized (this.f12062b) {
            this.f12061a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Date date) {
        synchronized (this.f12062b) {
            this.f12061a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        synchronized (this.f12062b) {
            this.f12061a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
