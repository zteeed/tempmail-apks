package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2554a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f2555b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<String> f2556c;

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f2557a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f2558b;

        private a() {
        }

        public o a() {
            if (this.f2557a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f2558b != null) {
                o oVar = new o();
                String unused = oVar.f2554a = this.f2557a;
                List unused2 = oVar.f2556c = this.f2558b;
                String unused3 = oVar.f2555b = null;
                return oVar;
            } else {
                throw new IllegalArgumentException("SKUs list must be set");
            }
        }

        public a b(List<String> list) {
            this.f2558b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f2557a = str;
            return this;
        }
    }

    public static a c() {
        return new a();
    }

    public String a() {
        return this.f2554a;
    }

    public List<String> b() {
        return this.f2556c;
    }

    public final String d() {
        return this.f2555b;
    }
}
