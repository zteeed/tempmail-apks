package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzae;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfq {

    /* renamed from: a  reason: collision with root package name */
    private final zzft f10442a;

    public zzfq(zzft zzft) {
        Preconditions.k(zzft);
        this.f10442a = zzft;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        zzfy a2 = zzfy.a(context, (zzae) null, (Long) null);
        zzeu h = a2.h();
        if (intent == null) {
            h.J().a("Receiver called with null intent");
            return;
        }
        a2.m();
        String action = intent.getAction();
        h.O().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            h.O().a("Starting wakeful intent.");
            this.f10442a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            h.J().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
