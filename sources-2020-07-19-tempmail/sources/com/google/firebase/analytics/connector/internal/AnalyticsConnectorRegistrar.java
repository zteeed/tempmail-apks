package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.analytics.a.a;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.j.g;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public class AnalyticsConnectorRegistrar implements h {
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<d<?>> getComponents() {
        d.b<a> a2 = d.a(a.class);
        a2.b(n.f(c.class));
        a2.b(n.f(Context.class));
        a2.b(n.f(com.google.firebase.f.d.class));
        a2.f(c.f11015a);
        a2.e();
        return Arrays.asList(new d[]{a2.d(), g.a("fire-analytics", "17.4.3")});
    }
}
