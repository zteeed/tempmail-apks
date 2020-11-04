package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2481a;

    /* renamed from: com.android.billingclient.api.a$a  reason: collision with other inner class name */
    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static final class C0065a {

        /* renamed from: a  reason: collision with root package name */
        private String f2482a;

        private C0065a() {
        }

        public final a a() {
            if (this.f2482a != null) {
                a aVar = new a();
                String unused = aVar.f2481a = this.f2482a;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public final C0065a b(String str) {
            this.f2482a = str;
            return this;
        }
    }

    private a() {
    }

    public static C0065a b() {
        return new C0065a();
    }

    public final String a() {
        return this.f2481a;
    }
}
