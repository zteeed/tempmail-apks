package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzia;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f10993b;

    /* renamed from: a  reason: collision with root package name */
    private final zzag f10994a;

    private FirebaseAnalytics(zzag zzag) {
        Preconditions.k(zzag);
        this.f10994a = zzag;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f10993b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f10993b == null) {
                    f10993b = new FirebaseAnalytics(zzag.b(context));
                }
            }
        }
        return f10993b;
    }

    @Keep
    public static zzia getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzag c2 = zzag.c(context, (String) null, (String) null, (String) null, bundle);
        if (c2 == null) {
            return null;
        }
        return new b(c2);
    }

    public final void a(String str, Bundle bundle) {
        this.f10994a.q(str, bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.b().a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f10994a.j(activity, str, str2);
    }
}
