package com.android.billingclient.api;

import java.util.ArrayList;

/* compiled from: BillingFlowParams */
public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2389a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f2390b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public g f2391c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f2392d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f2393e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f2394f;
    /* access modifiers changed from: private */
    public int g = 0;

    /* compiled from: BillingFlowParams */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f2395a;

        /* renamed from: b  reason: collision with root package name */
        private String f2396b;

        /* renamed from: c  reason: collision with root package name */
        private g f2397c;

        /* renamed from: d  reason: collision with root package name */
        private String f2398d;

        /* renamed from: e  reason: collision with root package name */
        private String f2399e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2400f;
        private int g;

        public d a() {
            d dVar = new d();
            String unused = dVar.f2389a = this.f2395a;
            String unused2 = dVar.f2390b = this.f2396b;
            g unused3 = dVar.f2391c = this.f2397c;
            String unused4 = dVar.f2392d = this.f2398d;
            String unused5 = dVar.f2393e = this.f2399e;
            boolean unused6 = dVar.f2394f = this.f2400f;
            int unused7 = dVar.g = this.g;
            return dVar;
        }

        @Deprecated
        public b b(ArrayList<String> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                this.f2398d = arrayList.get(0);
            }
            return this;
        }

        @Deprecated
        public b c(String str) {
            if (this.f2397c == null) {
                this.f2395a = str;
                return this;
            }
            throw new RuntimeException("Sku details already set");
        }

        public b d(g gVar) {
            if (this.f2395a == null && this.f2396b == null) {
                this.f2397c = gVar;
                return this;
            }
            throw new RuntimeException("Sku or type already set");
        }

        @Deprecated
        public b e(String str) {
            if (this.f2397c == null) {
                this.f2396b = str;
                return this;
            }
            throw new RuntimeException("Sku details already set");
        }

        private b() {
            this.g = 0;
        }
    }

    public static b p() {
        return new b();
    }

    public String h() {
        return this.f2393e;
    }

    public String i() {
        return this.f2392d;
    }

    public int j() {
        return this.g;
    }

    public String k() {
        g gVar = this.f2391c;
        if (gVar != null) {
            return gVar.f();
        }
        return this.f2389a;
    }

    public g l() {
        return this.f2391c;
    }

    public String m() {
        g gVar = this.f2391c;
        if (gVar != null) {
            return gVar.g();
        }
        return this.f2390b;
    }

    public boolean n() {
        return this.f2394f;
    }

    public boolean o() {
        return (!this.f2394f && this.f2393e == null && this.g == 0) ? false : true;
    }
}
