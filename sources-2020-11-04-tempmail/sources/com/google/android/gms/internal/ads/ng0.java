package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
abstract class ng0<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final zzxf f4672a = e();

    ng0() {
    }

    private static zzxf e() {
        try {
            Object newInstance = zzvp.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbba.i("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzxf) {
                return (zzxf) queryLocalInterface;
            }
            return new zzxh(iBinder);
        } catch (Exception unused) {
            zzbba.i("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T f() {
        zzxf zzxf = f4672a;
        if (zzxf == null) {
            zzbba.i("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(zzxf);
        } catch (RemoteException e2) {
            zzbba.d("Cannot invoke local loader using ClientApi class.", e2);
            return null;
        }
    }

    private final T g() {
        try {
            return d();
        } catch (RemoteException e2) {
            zzbba.d("Cannot invoke remote loader.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(zzxf zzxf) throws RemoteException;

    public final T b(Context context, boolean z) {
        T t;
        boolean z2 = false;
        boolean z3 = z;
        if (!z3) {
            zzwg.a();
            if (!zzbaq.t(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbba.f("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        zzaav.a(context);
        if (zzach.f5768a.a().booleanValue()) {
            z3 = false;
        }
        if (z3) {
            t = f();
            if (t == null) {
                t = g();
            }
        } else {
            T g = g();
            int i = g == null ? 1 : 0;
            if (i != 0) {
                if (zzwg.h().nextInt(zzacq.f5788a.a().intValue()) == 0) {
                    z2 = true;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzwg.a().d(context, zzwg.g().f6314b, "gmob-apps", bundle, true);
                }
            }
            t = g == null ? f() : g;
        }
        return t == null ? c() : t;
    }

    /* access modifiers changed from: protected */
    public abstract T c();

    /* access modifiers changed from: protected */
    public abstract T d() throws RemoteException;
}
