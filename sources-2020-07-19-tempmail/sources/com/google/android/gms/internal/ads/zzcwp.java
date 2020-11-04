package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwp extends zzapb {

    /* renamed from: b  reason: collision with root package name */
    private final String f7646b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaox f7647c;

    /* renamed from: d  reason: collision with root package name */
    private zzbbn<JSONObject> f7648d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f7649e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private boolean f7650f = false;

    public zzcwp(String str, zzaox zzaox, zzbbn<JSONObject> zzbbn) {
        JSONObject jSONObject = new JSONObject();
        this.f7649e = jSONObject;
        this.f7648d = zzbbn;
        this.f7646b = str;
        this.f7647c = zzaox;
        try {
            jSONObject.put("adapter_version", zzaox.a0().toString());
            this.f7649e.put("sdk_version", this.f7647c.Y().toString());
            this.f7649e.put(AnalyticsConnectorReceiver.EVENT_NAME_KEY, this.f7646b);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void B4(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f7650f     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.onFailure(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f7649e     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.zzbbn<org.json.JSONObject> r3 = r2.f7648d     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f7649e     // Catch:{ all -> 0x0023 }
            r3.a(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f7650f = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcwp.B4(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onFailure(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f7650f     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f7649e     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.zzbbn<org.json.JSONObject> r3 = r2.f7648d     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f7649e     // Catch:{ all -> 0x001a }
            r3.a(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f7650f = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcwp.onFailure(java.lang.String):void");
    }
}
