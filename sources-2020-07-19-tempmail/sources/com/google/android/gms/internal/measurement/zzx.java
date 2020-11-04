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
        Parcel y = y();
        y.writeString(str);
        y.writeLong(j);
        P(23, y);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.c(y, bundle);
        P(9, y);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeLong(j);
        P(24, y);
    }

    public final void generateEventId(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(22, y);
    }

    public final void getAppInstanceId(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(20, y);
    }

    public final void getCachedAppInstanceId(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(19, y);
    }

    public final void getConditionalUserProperties(String str, String str2, zzw zzw) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.b(y, zzw);
        P(10, y);
    }

    public final void getCurrentScreenClass(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(17, y);
    }

    public final void getCurrentScreenName(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(16, y);
    }

    public final void getGmpAppId(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(21, y);
    }

    public final void getMaxUserProperties(String str, zzw zzw) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzb.b(y, zzw);
        P(6, y);
    }

    public final void getTestFlag(zzw zzw, int i) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        y.writeInt(i);
        P(38, y);
    }

    public final void getUserProperties(String str, String str2, boolean z, zzw zzw) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.d(y, z);
        zzb.b(y, zzw);
        P(5, y);
    }

    public final void initForTests(Map map) throws RemoteException {
        Parcel y = y();
        y.writeMap(map);
        P(37, y);
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzae zzae, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        zzb.c(y, zzae);
        y.writeLong(j);
        P(1, y);
    }

    public final void isDataCollectionEnabled(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzw);
        P(40, y);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.c(y, bundle);
        zzb.d(y, z);
        zzb.d(y, z2);
        y.writeLong(j);
        P(2, y);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzw zzw, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.c(y, bundle);
        zzb.b(y, zzw);
        y.writeLong(j);
        P(3, y);
    }

    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        y.writeString(str);
        zzb.b(y, iObjectWrapper);
        zzb.b(y, iObjectWrapper2);
        zzb.b(y, iObjectWrapper3);
        P(33, y);
    }

    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        zzb.c(y, bundle);
        y.writeLong(j);
        P(27, y);
    }

    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeLong(j);
        P(28, y);
    }

    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeLong(j);
        P(29, y);
    }

    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeLong(j);
        P(30, y);
    }

    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzw zzw, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        zzb.b(y, zzw);
        y.writeLong(j);
        P(31, y);
    }

    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeLong(j);
        P(25, y);
    }

    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeLong(j);
        P(26, y);
    }

    public final void performAction(Bundle bundle, zzw zzw, long j) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        zzb.b(y, zzw);
        y.writeLong(j);
        P(32, y);
    }

    public final void registerOnMeasurementEventListener(zzab zzab) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzab);
        P(35, y);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel y = y();
        y.writeLong(j);
        P(12, y);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        y.writeLong(j);
        P(8, y);
    }

    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel y = y();
        zzb.b(y, iObjectWrapper);
        y.writeString(str);
        y.writeString(str2);
        y.writeLong(j);
        P(15, y);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel y = y();
        zzb.d(y, z);
        P(39, y);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        P(42, y);
    }

    public final void setEventInterceptor(zzab zzab) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzab);
        P(34, y);
    }

    public final void setInstanceIdProvider(zzac zzac) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzac);
        P(18, y);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel y = y();
        zzb.d(y, z);
        y.writeLong(j);
        P(11, y);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel y = y();
        y.writeLong(j);
        P(13, y);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel y = y();
        y.writeLong(j);
        P(14, y);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeLong(j);
        P(7, y);
    }

    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.b(y, iObjectWrapper);
        zzb.d(y, z);
        y.writeLong(j);
        P(4, y);
    }

    public final void unregisterOnMeasurementEventListener(zzab zzab) throws RemoteException {
        Parcel y = y();
        zzb.b(y, zzab);
        P(36, y);
    }
}
