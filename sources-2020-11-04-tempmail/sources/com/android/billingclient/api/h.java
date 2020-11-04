package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public final class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2525a;

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f2526a;

        private a() {
        }

        public final h a() {
            if (this.f2526a != null) {
                h hVar = new h();
                String unused = hVar.f2525a = this.f2526a;
                return hVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public final a b(String str) {
            this.f2526a = str;
            return this;
        }
    }

    private h() {
    }

    public static a b() {
        return new a();
    }

    public final String a() {
        return this.f2525a;
    }
}
