package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SkuDetailsParams */
public class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2410a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<String> f2411b;

    /* compiled from: SkuDetailsParams */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f2412a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f2413b;

        public h a() {
            h hVar = new h();
            String unused = hVar.f2410a = this.f2412a;
            List unused2 = hVar.f2411b = this.f2413b;
            return hVar;
        }

        public b b(List<String> list) {
            this.f2413b = new ArrayList(list);
            return this;
        }

        public b c(String str) {
            this.f2412a = str;
            return this;
        }

        private b() {
        }
    }

    public static b e() {
        return new b();
    }

    public String c() {
        return this.f2410a;
    }

    public List<String> d() {
        return this.f2411b;
    }
}
