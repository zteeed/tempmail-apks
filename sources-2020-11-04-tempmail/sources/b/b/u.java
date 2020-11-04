package b.b;

import android.content.Context;
import b.a.a.a.a;
import b.a.a.a.c;
import b.a.a.a.d;
import java.util.HashMap;

final class u implements c {

    /* renamed from: a  reason: collision with root package name */
    private a f2175a;

    /* renamed from: b  reason: collision with root package name */
    private t f2176b;

    u() {
    }

    public final void a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        d dVar = null;
        if (i == 0) {
            try {
                e.a("InstallReferrer connected");
                if (this.f2175a.c()) {
                    dVar = this.f2175a.b();
                    this.f2175a.a();
                } else {
                    e.f("ReferrerClient: InstallReferrer is not ready");
                    hashMap.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                e.f(sb.toString());
                hashMap.put("err", th.getMessage());
            }
        } else if (i == 1) {
            e.f("InstallReferrer not supported");
        } else if (i != 2) {
            e.f("responseCode not found.");
        } else {
            e.f("InstallReferrer not supported");
        }
        if (dVar != null) {
            try {
                if (dVar.b() != null) {
                    hashMap.put("val", dVar.b());
                }
                hashMap.put("clk", Long.toString(dVar.c()));
                hashMap.put("install", Long.toString(dVar.a()));
            } catch (Exception e2) {
                e2.printStackTrace();
                hashMap.put("val", "-1");
                hashMap.put("clk", "-1");
                hashMap.put("install", "-1");
            }
        }
        t tVar = this.f2176b;
        if (tVar != null) {
            tVar.a(hashMap);
        }
    }

    public final void b() {
        e.a("Install Referrer service disconnected");
    }

    /* access modifiers changed from: protected */
    public final void c(Context context, t tVar) {
        this.f2176b = tVar;
        try {
            a a2 = a.d(context).a();
            this.f2175a = a2;
            a2.e(this);
        } catch (Throwable th) {
            e.b("referrerClient -> startConnection", th);
        }
    }
}
