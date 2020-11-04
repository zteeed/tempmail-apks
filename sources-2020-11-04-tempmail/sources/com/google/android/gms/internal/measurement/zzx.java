package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzx extends zza implements zzv {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeLong(j);
        V(23, B);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.c(B, bundle);
        V(9, B);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeLong(j);
        V(24, B);
    }

    public final void generateEventId(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(22, B);
    }

    public final void getAppInstanceId(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(20, B);
    }

    public final void getCachedAppInstanceId(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(19, B);
    }

    public final void getConditionalUserProperties(String str, String str2, zzw zzw) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.b(B, zzw);
        V(10, B);
    }

    public final void getCurrentScreenClass(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(17, B);
    }

    public final void getCurrentScreenName(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(16, B);
    }

    public final void getGmpAppId(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(21, B);
    }

    public final void getMaxUserProperties(String str, zzw zzw) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzb.b(B, zzw);
        V(6, B);
    }

    public final void getTestFlag(zzw zzw, int i) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        B.writeInt(i);
        V(38, B);
    }

    public final void getUserProperties(String str, String str2, boolean z, zzw zzw) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.d(B, z);
        zzb.b(B, zzw);
        V(5, B);
    }

    public final void initForTests(Map map) throws RemoteException {
        Parcel B = B();
        B.writeMap(map);
        V(37, B);
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzae zzae, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        zzb.c(B, zzae);
        B.writeLong(j);
        V(1, B);
    }

    public final void isDataCollectionEnabled(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzw);
        V(40, B);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.c(B, bundle);
        zzb.d(B, z);
        zzb.d(B, z2);
        B.writeLong(j);
        V(2, B);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzw zzw, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.c(B, bundle);
        zzb.b(B, zzw);
        B.writeLong(j);
        V(3, B);
    }

    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeString(str);
        zzb.b(B, iObjectWrapper);
        zzb.b(B, iObjectWrapper2);
        zzb.b(B, iObjectWrapper3);
        V(33, B);
    }

    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        zzb.c(B, bundle);
        B.writeLong(j);
        V(27, B);
    }

    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeLong(j);
        V(28, B);
    }

    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeLong(j);
        V(29, B);
    }

    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeLong(j);
        V(30, B);
    }

    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzw zzw, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        zzb.b(B, zzw);
        B.writeLong(j);
        V(31, B);
    }

    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeLong(j);
        V(25, B);
    }

    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeLong(j);
        V(26, B);
    }

    public final void performAction(Bundle bundle, zzw zzw, long j) throws RemoteException {
        Parcel B = B();
        zzb.c(B, bundle);
        zzb.b(B, zzw);
        B.writeLong(j);
        V(32, B);
    }

    public final void registerOnMeasurementEventListener(zzab zzab) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzab);
        V(35, B);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel B = B();
        B.writeLong(j);
        V(12, B);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel B = B();
        zzb.c(B, bundle);
        B.writeLong(j);
        V(8, B);
    }

    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel B = B();
        zzb.b(B, iObjectWrapper);
        B.writeString(str);
        B.writeString(str2);
        B.writeLong(j);
        V(15, B);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel B = B();
        zzb.d(B, z);
        V(39, B);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzb.c(B, bundle);
        V(42, B);
    }

    public final void setEventInterceptor(zzab zzab) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzab);
        V(34, B);
    }

    public final void setInstanceIdProvider(zzac zzac) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzac);
        V(18, B);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel B = B();
        zzb.d(B, z);
        B.writeLong(j);
        V(11, B);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel B = B();
        B.writeLong(j);
        V(13, B);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel B = B();
        B.writeLong(j);
        V(14, B);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeLong(j);
        V(7, B);
    }

    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.b(B, iObjectWrapper);
        zzb.d(B, z);
        B.writeLong(j);
        V(4, B);
    }

    public final void unregisterOnMeasurementEventListener(zzab zzab) throws RemoteException {
        Parcel B = B();
        zzb.b(B, zzab);
        V(36, B);
    }
}
