package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class BaseGmsClient<T extends IInterface> {
    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zzbt = new Feature[0];
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private int zzbu;
    private long zzbv;
    private long zzbw;
    private int zzbx;
    private long zzby;
    @VisibleForTesting
    private zzh zzbz;
    private final Looper zzca;
    private final GmsClientSupervisor zzcb;
    private final GoogleApiAvailabilityLight zzcc;
    /* access modifiers changed from: private */
    public final Object zzcd;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")
    public IGmsServiceBroker zzce;
    @VisibleForTesting
    protected ConnectionProgressReportCallbacks zzcf;
    @GuardedBy("mLock")
    private T zzcg;
    /* access modifiers changed from: private */
    public final ArrayList<zzc<?>> zzch;
    @GuardedBy("mLock")
    private zze zzci;
    @GuardedBy("mLock")
    private int zzcj;
    /* access modifiers changed from: private */
    public final BaseConnectionCallbacks zzck;
    /* access modifiers changed from: private */
    public final BaseOnConnectionFailedListener zzcl;
    private final int zzcm;
    private final String zzcn;
    /* access modifiers changed from: private */
    public ConnectionResult zzco;
    /* access modifiers changed from: private */
    public boolean zzcp;
    private volatile zzb zzcq;
    @VisibleForTesting
    protected AtomicInteger zzcr;

    @KeepForSdk
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        void B(int i);

        @KeepForSdk
        void H(Bundle bundle);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        void h0(ConnectionResult connectionResult);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void a(ConnectionResult connectionResult);
    }

    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        public void a(ConnectionResult connectionResult) {
            if (connectionResult.G()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService((IAccountAccessor) null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.this.zzcl != null) {
                BaseGmsClient.this.zzcl.h0(connectionResult);
            }
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void a();
    }

    private abstract class a extends zzc<Boolean> {

        /* renamed from: d  reason: collision with root package name */
        private final int f3152d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f3153e;

        protected a(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f3152d = i;
            this.f3153e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void c(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.BaseGmsClient r5 = com.google.android.gms.common.internal.BaseGmsClient.this
                r5.zza((int) r0, null)
                return
            L_0x000c:
                int r5 = r4.f3152d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.BaseGmsClient r5 = com.google.android.gms.common.internal.BaseGmsClient.this
                r5.zza((int) r0, null)
                android.os.Bundle r5 = r4.f3153e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                int r0 = r4.f3152d
                r5.<init>(r0, r1)
                r4.f(r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.BaseGmsClient r5 = com.google.android.gms.common.internal.BaseGmsClient.this
                r5.zza((int) r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.BaseGmsClient r2 = com.google.android.gms.common.internal.BaseGmsClient.this
                java.lang.String r2 = r2.getStartServiceAction()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.BaseGmsClient r2 = com.google.android.gms.common.internal.BaseGmsClient.this
                java.lang.String r2 = r2.getServiceDescriptor()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.g()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.BaseGmsClient r5 = com.google.android.gms.common.internal.BaseGmsClient.this
                r5.zza((int) r0, null)
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r5.<init>(r0, r1)
                r4.f(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.a.c(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        public final void d() {
        }

        /* access modifiers changed from: protected */
        public abstract void f(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        public abstract boolean g();
    }

    final class b extends com.google.android.gms.internal.common.zze {
        public b(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            zzc zzc = (zzc) message.obj;
            zzc.d();
            zzc.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.zzcr
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x0015
                a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r0 = r0.enableLocalFallback()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r0 = r0.isConnecting()
                if (r0 != 0) goto L_0x003a
                a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.ConnectionResult unused = r0.zzco = r1
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r8 = r8.zzl()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r8 = r8.zzcp
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                r8.zza((int) r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzco
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzco
                goto L_0x0078
            L_0x0073:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzcf
                r0.a(r8)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.onConnectionFailed(r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzco
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzco
                goto L_0x009b
            L_0x0096:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzcf
                r0.a(r8)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.onConnectionFailed(r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r8 = r8.zzcf
                r8.a(r0)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                r8.onConnectionFailed(r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                r0.zza((int) r3, null)
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzck
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzck
                int r1 = r8.arg2
                r0.B(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                int r8 = r8.arg2
                r0.onConnectionSuspended(r8)
                com.google.android.gms.common.internal.BaseGmsClient r8 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean unused = r8.zza((int) r3, (int) r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.BaseGmsClient r0 = com.google.android.gms.common.internal.BaseGmsClient.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x00fe
                a(r8)
                return
            L_0x00fe:
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.BaseGmsClient$zzc r8 = (com.google.android.gms.common.internal.BaseGmsClient.zzc) r8
                r8.e()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.b.handleMessage(android.os.Message):void");
        }
    }

    protected abstract class zzc<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f3156a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3157b = false;

        public zzc(TListener tlistener) {
            this.f3156a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.f3156a = null;
            }
        }

        public final void b() {
            a();
            synchronized (BaseGmsClient.this.zzch) {
                BaseGmsClient.this.zzch.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void c(TListener tlistener);

        /* access modifiers changed from: protected */
        public abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f3156a;
                if (this.f3157b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e2) {
                    d();
                    throw e2;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.f3157b = true;
            }
            b();
        }
    }

    @VisibleForTesting
    public static final class zzd extends IGmsCallbacks.zza {

        /* renamed from: b  reason: collision with root package name */
        private BaseGmsClient f3159b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3160c;

        public zzd(BaseGmsClient baseGmsClient, int i) {
            this.f3159b = baseGmsClient;
            this.f3160c = i;
        }

        public final void L3(int i, IBinder iBinder, Bundle bundle) {
            Preconditions.l(this.f3159b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3159b.onPostInitHandler(i, iBinder, bundle, this.f3160c);
            this.f3159b = null;
        }

        public final void V2(int i, IBinder iBinder, zzb zzb) {
            Preconditions.l(this.f3159b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.k(zzb);
            this.f3159b.zza(zzb);
            L3(i, iBinder, zzb.f3244b);
        }

        public final void m3(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    @VisibleForTesting
    public final class zze implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f3161a;

        public zze(int i) {
            this.f3161a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGmsServiceBroker iGmsServiceBroker;
            if (iBinder == null) {
                BaseGmsClient.this.zzb(16);
                return;
            }
            synchronized (BaseGmsClient.this.zzcd) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                if (iBinder == null) {
                    iGmsServiceBroker = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                        iGmsServiceBroker = new IGmsServiceBroker.Stub.a(iBinder);
                    } else {
                        iGmsServiceBroker = (IGmsServiceBroker) queryLocalInterface;
                    }
                }
                IGmsServiceBroker unused = baseGmsClient.zzce = iGmsServiceBroker;
            }
            BaseGmsClient.this.zza(0, (Bundle) null, this.f3161a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseGmsClient.this.zzcd) {
                IGmsServiceBroker unused = BaseGmsClient.this.zzce = null;
            }
            Handler handler = BaseGmsClient.this.mHandler;
            handler.sendMessage(handler.obtainMessage(6, this.f3161a, 1));
        }
    }

    protected final class zzf extends a {
        private final IBinder g;

        public zzf(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        /* access modifiers changed from: protected */
        public final void f(ConnectionResult connectionResult) {
            if (BaseGmsClient.this.zzcl != null) {
                BaseGmsClient.this.zzcl.h0(connectionResult);
            }
            BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!BaseGmsClient.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    String serviceDescriptor = BaseGmsClient.this.getServiceDescriptor();
                    StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface createServiceInterface = BaseGmsClient.this.createServiceInterface(this.g);
                if (createServiceInterface == null || (!BaseGmsClient.this.zza(2, 4, createServiceInterface) && !BaseGmsClient.this.zza(3, 4, createServiceInterface))) {
                    return false;
                }
                ConnectionResult unused = BaseGmsClient.this.zzco = null;
                Bundle connectionHint = BaseGmsClient.this.getConnectionHint();
                if (BaseGmsClient.this.zzck == null) {
                    return true;
                }
                BaseGmsClient.this.zzck.H(connectionHint);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class zzg extends a {
        public zzg(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        public final void f(ConnectionResult connectionResult) {
            if (!BaseGmsClient.this.enableLocalFallback() || !BaseGmsClient.this.zzl()) {
                BaseGmsClient.this.zzcf.a(connectionResult);
                BaseGmsClient.this.onConnectionFailed(connectionResult);
                return;
            }
            BaseGmsClient.this.zzb(16);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            BaseGmsClient.this.zzcf.a(ConnectionResult.f2841f);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.a(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.h()
            com.google.android.gms.common.internal.Preconditions.k(r13)
            r6 = r13
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r6 = (com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) r6
            com.google.android.gms.common.internal.Preconditions.k(r14)
            r7 = r14
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r7 = (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb) {
        this.zzcq = zzb;
    }

    /* access modifiers changed from: private */
    public final void zzb(int i) {
        int i2;
        if (zzk()) {
            i2 = 5;
            this.zzcp = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i2, this.zzcr.get(), 16));
    }

    private final String zzj() {
        String str = this.zzcn;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean zzl() {
        if (this.zzcp || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int j = this.zzcc.j(this.mContext, getMinApkVersion());
        if (j != 0) {
            zza(1, (IInterface) null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), j, (PendingIntent) null);
            return;
        }
        connect(new LegacyClientCallbackAdapter());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @KeepForSdk
    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.l(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzcf = connectionProgressReportCallbacks;
        zza(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract T createServiceInterface(IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.zzcr.incrementAndGet();
        synchronized (this.zzch) {
            int size = this.zzch.size();
            for (int i = 0; i < size; i++) {
                this.zzch.get(i).a();
            }
            this.zzch.clear();
        }
        synchronized (this.zzcd) {
            this.zzce = null;
        }
        zza(1, (IInterface) null);
    }

    @KeepForSdk
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.mLock) {
            i = this.zzcj;
            t = this.zzcg;
        }
        synchronized (this.zzcd) {
            iGmsServiceBroker = this.zzce;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzbw > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzbw;
            String format = simpleDateFormat.format(new Date(this.zzbw));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzbv > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.zzbu;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzbv;
            String format2 = simpleDateFormat.format(new Date(this.zzbv));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzby > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.a(this.zzbx));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzby;
            String format3 = simpleDateFormat.format(new Date(this.zzby));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean enableLocalFallback() {
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @KeepForSdk
    public Feature[] getApiFeatures() {
        return zzbt;
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzb zzb = this.zzcq;
        if (zzb == null) {
            return null;
        }
        return zzb.f3245c;
    }

    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @KeepForSdk
    public final Context getContext() {
        return this.mContext;
    }

    @KeepForSdk
    public String getEndpointPackageName() {
        zzh zzh;
        if (isConnected() && (zzh = this.zzbz) != null) {
            return zzh.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public String getLocalStartServiceAction() {
        return null;
    }

    @KeepForSdk
    public final Looper getLooper() {
        return this.zzca;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.f2856a;
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzcm);
        getServiceRequest.f3183e = this.mContext.getPackageName();
        getServiceRequest.h = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.i = getAccount() != null ? getAccount() : new Account(DEFAULT_ACCOUNT, "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.f3184f = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.i = getAccount();
        }
        getServiceRequest.j = zzbt;
        getServiceRequest.k = getApiFeatures();
        try {
            synchronized (this.zzcd) {
                if (this.zzce != null) {
                    this.zzce.F1(new zzd(this, this.zzcr.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzcr.get());
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzcj != 5) {
                checkConnected();
                Preconditions.o(this.zzcg != null, "Client is connected but service is null");
                t = this.zzcg;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzcd) {
            if (this.zzce == null) {
                return null;
            }
            IBinder asBinder = this.zzce.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract String getServiceDescriptor();

    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    @KeepForSdk
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 4;
        }
        return z;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            if (this.zzcj != 2) {
                if (this.zzcj != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectedLocked(T t) {
        this.zzbw = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbx = connectionResult.u();
        this.zzby = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectionSuspended(int i) {
        this.zzbu = i;
        this.zzbv = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new zzf(i, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    @KeepForSdk
    public void onSetConnectState(int i, T t) {
    }

    @KeepForSdk
    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzcr.get(), i));
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @VisibleForTesting
    public void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        Preconditions.l(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzcf = connectionProgressReportCallbacks;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzcr.get(), i, pendingIntent));
    }

    /* access modifiers changed from: private */
    public final void zza(int i, T t) {
        zzh zzh;
        Preconditions.a((i == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzcj = i;
            this.zzcg = t;
            onSetConnectState(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.zzci == null || this.zzbz == null)) {
                        String c2 = this.zzbz.c();
                        String a2 = this.zzbz.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.zzcb.b(this.zzbz.c(), this.zzbz.a(), this.zzbz.b(), this.zzci, zzj());
                        this.zzcr.incrementAndGet();
                    }
                    this.zzci = new zze(this.zzcr.get());
                    if (this.zzcj != 3 || getLocalStartServiceAction() == null) {
                        zzh = new zzh(getStartServicePackage(), getStartServiceAction(), false, 129);
                    } else {
                        zzh = new zzh(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
                    }
                    this.zzbz = zzh;
                    if (!this.zzcb.c(new GmsClientSupervisor.zza(zzh.c(), this.zzbz.a(), this.zzbz.b()), this.zzci, zzj())) {
                        String c3 = this.zzbz.c();
                        String a3 = this.zzbz.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(a3);
                        Log.e("GmsClient", sb2.toString());
                        zza(16, (Bundle) null, this.zzcr.get());
                    }
                } else if (i == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzci != null) {
                this.zzcb.b(this.zzbz.c(), this.zzbz.a(), this.zzbz.b(), this.zzci, zzj());
                this.zzci = null;
            }
        }
    }

    @KeepForSdk
    @VisibleForTesting
    protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        Preconditions.l(context, "Context must not be null");
        this.mContext = context;
        Preconditions.l(looper, "Looper must not be null");
        this.zzca = looper;
        Preconditions.l(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcb = gmsClientSupervisor;
        Preconditions.l(googleApiAvailabilityLight, "API availability must not be null");
        this.zzcc = googleApiAvailabilityLight;
        this.mHandler = new b(looper);
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = str;
    }

    @KeepForSdk
    @VisibleForTesting
    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        Preconditions.l(context, "Context must not be null");
        this.mContext = context;
        Preconditions.l(handler, "Handler must not be null");
        this.mHandler = handler;
        this.zzca = handler.getLooper();
        Preconditions.l(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcb = gmsClientSupervisor;
        Preconditions.l(googleApiAvailabilityLight, "API availability must not be null");
        this.zzcc = googleApiAvailabilityLight;
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = null;
    }

    /* access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzcj != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(int i, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new zzg(i, (Bundle) null)));
    }
}
