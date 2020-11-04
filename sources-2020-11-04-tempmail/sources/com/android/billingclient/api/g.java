package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f2518a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f2519b;

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f2520a;

        /* renamed from: b  reason: collision with root package name */
        private String f2521b;

        private a() {
            this.f2521b = "";
        }

        public g a() {
            g gVar = new g();
            int unused = gVar.f2518a = this.f2520a;
            String unused2 = gVar.f2519b = this.f2521b;
            return gVar;
        }

        public a b(String str) {
            this.f2521b = str;
            return this;
        }

        public a c(int i) {
            this.f2520a = i;
            return this;
        }
    }

    public static a c() {
        return new a();
    }

    public final String a() {
        return this.f2519b;
    }

    public final int b() {
        return this.f2518a;
    }
}
