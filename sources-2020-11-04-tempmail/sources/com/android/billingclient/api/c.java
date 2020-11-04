package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.j;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public abstract class c {

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2489a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f2490b;

        /* renamed from: c  reason: collision with root package name */
        private m f2491c;

        private a(Context context) {
            this.f2490b = context;
        }

        public final c a() {
            Context context = this.f2490b;
            if (context != null) {
                m mVar = this.f2491c;
                if (mVar != null) {
                    boolean z = this.f2489a;
                    if (z) {
                        return new d((String) null, z, context, mVar);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public final a b() {
            this.f2489a = true;
            return this;
        }

        public final a c(m mVar) {
            this.f2491c = mVar;
            return this;
        }
    }

    public static a f(Context context) {
        return new a(context);
    }

    public abstract void a(a aVar, b bVar);

    public abstract void b(h hVar, i iVar);

    public abstract void c();

    public abstract boolean d();

    public abstract g e(Activity activity, f fVar);

    public abstract void g(String str, l lVar);

    public abstract j.a h(String str);

    public abstract void i(o oVar, p pVar);

    public abstract void j(e eVar);
}
