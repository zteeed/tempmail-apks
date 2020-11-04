package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzw;
import java.util.Map;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
public class AppMeasurementDynamiteService extends zzu {
    @VisibleForTesting
    zzfy zza = null;
    private Map<Integer, zzha> zzb = new a.e.a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
    class a implements zzha {

        /* renamed from: a  reason: collision with root package name */
        private zzab f9900a;

        a(zzab zzab) {
            this.f9900a = zzab;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f9900a.a4(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.zza.h().J().b("Event listener threw exception", e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
    class b implements zzhb {

        /* renamed from: a  reason: collision with root package name */
        private zzab f9902a;

        b(zzab zzab) {
            this.f9902a = zzab;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f9902a.a4(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.zza.h().J().b("Event interceptor threw exception", e2);
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.S().A(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        this.zza.F().u0(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.S().E(str, j);
    }

    public void generateEventId(zzw zzw) throws RemoteException {
        zza();
        this.zza.G().P(zzw, this.zza.G().E0());
    }

    public void getAppInstanceId(zzw zzw) throws RemoteException {
        zza();
        this.zza.g().z(new t4(this, zzw));
    }

    public void getCachedAppInstanceId(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.F().e0());
    }

    public void getConditionalUserProperties(String str, String str2, zzw zzw) throws RemoteException {
        zza();
        this.zza.g().z(new v7(this, zzw, str, str2));
    }

    public void getCurrentScreenClass(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.F().h0());
    }

    public void getCurrentScreenName(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.F().g0());
    }

    public void getGmpAppId(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.F().i0());
    }

    public void getMaxUserProperties(String str, zzw zzw) throws RemoteException {
        zza();
        this.zza.F();
        Preconditions.g(str);
        this.zza.G().O(zzw, 25);
    }

    public void getTestFlag(zzw zzw, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.zza.G().R(zzw, this.zza.F().a0());
        } else if (i == 1) {
            this.zza.G().P(zzw, this.zza.F().b0().longValue());
        } else if (i == 2) {
            zzkr G = this.zza.G();
            double doubleValue = this.zza.F().d0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzw.B(bundle);
            } catch (RemoteException e2) {
                G.f10171a.h().J().b("Error returning double value to wrapper", e2);
            }
        } else if (i == 3) {
            this.zza.G().O(zzw, this.zza.F().c0().intValue());
        } else if (i == 4) {
            this.zza.G().T(zzw, this.zza.F().Z().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzw zzw) throws RemoteException {
        zza();
        this.zza.g().z(new p5(this, zzw, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzae zzae, long j) throws RemoteException {
        Context context = (Context) ObjectWrapper.P(iObjectWrapper);
        zzfy zzfy = this.zza;
        if (zzfy == null) {
            this.zza = zzfy.a(context, zzae, Long.valueOf(j));
        } else {
            zzfy.h().J().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzw zzw) throws RemoteException {
        zza();
        this.zza.g().z(new g7(this, zzw));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.zza.F().S(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzw zzw, long j) throws RemoteException {
        Bundle bundle2;
        zza();
        Preconditions.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.zza.g().z(new j6(this, zzw, new zzao(str2, new zzan(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zza();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.P(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.P(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.P(iObjectWrapper3);
        }
        this.zza.h().B(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityCreated((Activity) ObjectWrapper.P(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityDestroyed((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityPaused((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityResumed((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzw zzw, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        Bundle bundle = new Bundle();
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivitySaveInstanceState((Activity) ObjectWrapper.P(iObjectWrapper), bundle);
        }
        try {
            zzw.B(bundle);
        } catch (RemoteException e2) {
            this.zza.h().J().b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityStarted((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        n5 n5Var = this.zza.F().f10468c;
        if (n5Var != null) {
            this.zza.F().Y();
            n5Var.onActivityStopped((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void performAction(Bundle bundle, zzw zzw, long j) throws RemoteException {
        zza();
        zzw.B((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzab zzab) throws RemoteException {
        zza();
        zzha zzha = this.zzb.get(Integer.valueOf(zzab.a()));
        if (zzha == null) {
            zzha = new a(zzab);
            this.zzb.put(Integer.valueOf(zzab.a()), zzha);
        }
        this.zza.F().I(zzha);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        zzhc F = this.zza.F();
        F.N((String) null);
        F.g().z(new a5(F, j));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.h().G().a("Conditional user property must not be null");
        } else {
            this.zza.F().H(bundle, j);
        }
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zza();
        this.zza.O().J((Activity) ObjectWrapper.P(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        zzhc F = this.zza.F();
        F.y();
        F.a();
        F.g().z(new m5(F, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zza();
        zzhc F = this.zza.F();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        F.g().z(new v4(F, bundle2));
    }

    public void setEventInterceptor(zzab zzab) throws RemoteException {
        zza();
        zzhc F = this.zza.F();
        b bVar = new b(zzab);
        F.a();
        F.y();
        F.g().z(new c5(F, bVar));
    }

    public void setInstanceIdProvider(zzac zzac) throws RemoteException {
        zza();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.zza.F().X(z);
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
        zzhc F = this.zza.F();
        F.a();
        F.g().z(new o5(F, j));
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        zzhc F = this.zza.F();
        F.a();
        F.g().z(new w4(F, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        zza();
        this.zza.F().V((String) null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zza();
        this.zza.F().V(str, str2, ObjectWrapper.P(iObjectWrapper), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzab zzab) throws RemoteException {
        zza();
        zzha remove = this.zzb.remove(Integer.valueOf(zzab.a()));
        if (remove == null) {
            remove = new a(zzab);
        }
        this.zza.F().o0(remove);
    }

    private final void zza(zzw zzw, String str) {
        this.zza.G().R(zzw, str);
    }
}
