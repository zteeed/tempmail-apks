package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gcm.zzg;
import com.google.android.gms.internal.gcm.zzj;
import com.google.android.gms.internal.gcm.zzl;
import com.google.android.gms.internal.gcm.zzm;
import com.google.android.gms.internal.gcm.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.concurrent.GuardedBy;

public abstract class GcmTaskService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f3399b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public int f3400c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f3401d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f3402e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f3403f;
    /* access modifiers changed from: private */
    public GcmNetworkManager g;
    /* access modifiers changed from: private */
    public zzl h;

    @TargetApi(21)
    @VisibleForTesting
    class a extends zzj {
        a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Messenger messenger;
            if (!UidVerifier.b(GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
                Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
                return;
            }
            int i = message.what;
            if (i == 1) {
                Bundle data = message.getData();
                if (!data.isEmpty() && (messenger = message.replyTo) != null) {
                    String string = data.getString("tag");
                    ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                    long j = data.getLong("max_exec_duration", 180);
                    if (!GcmTaskService.this.k(string)) {
                        GcmTaskService.this.e(new b(string, messenger, data.getBundle("extras"), j, (List<Uri>) parcelableArrayList));
                    }
                }
            } else if (i != 2) {
                if (i != 4) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Unrecognized message received: ");
                    sb.append(valueOf);
                    Log.e("GcmTaskService", sb.toString());
                    return;
                }
                GcmTaskService.this.a();
            } else if (Log.isLoggable("GcmTaskService", 3)) {
                String valueOf2 = String.valueOf(message);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("ignoring unimplemented stop message for now: ");
                sb2.append(valueOf2);
                Log.d("GcmTaskService", sb2.toString());
            }
        }
    }

    private final void d(int i) {
        synchronized (this.f3399b) {
            this.f3400c = i;
            if (!this.g.j(this.f3403f.getClassName())) {
                stopSelf(this.f3400c);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e(b bVar) {
        try {
            this.f3401d.execute(bVar);
        } catch (RejectedExecutionException e2) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e2);
            bVar.c(1);
        }
    }

    /* access modifiers changed from: private */
    public final boolean k(String str) {
        boolean z;
        synchronized (this.f3399b) {
            z = !this.g.f(str, this.f3403f.getClassName());
            if (z) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GcmTaskService", sb.toString());
            }
        }
        return z;
    }

    public void a() {
    }

    public abstract int b(TaskParams taskParams);

    public IBinder onBind(Intent intent) {
        if (intent == null || !PlatformVersion.h() || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return this.f3402e.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.g = GcmNetworkManager.b(this);
        this.f3401d = zzg.a().a(10, new b(this), 10);
        this.f3402e = new Messenger(new a(Looper.getMainLooper()));
        this.f3403f = new ComponentName(this, getClass());
        zzm.a();
        getClass();
        this.h = zzm.f9494a;
    }

    public void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.f3401d.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            int size = shutdownNow.size();
            StringBuilder sb = new StringBuilder(79);
            sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
            sb.append(size);
            Log.e("GcmTaskService", sb.toString());
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            d(i2);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent.getLongExtra("max_exec_duration", 180);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    String packageName = getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length());
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(stringExtra);
                    sb.append(": Could not process request, invalid callback.");
                    Log.e("GcmTaskService", sb.toString());
                    return 2;
                } else if (k(stringExtra)) {
                    d(i2);
                    return 2;
                } else {
                    e(new b(stringExtra, ((PendingCallback) parcelableExtra).f3413b, bundleExtra, longExtra, (List<Uri>) parcelableArrayListExtra));
                }
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                a();
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                sb2.append("Unknown action received ");
                sb2.append(action);
                sb2.append(", terminating");
                Log.e("GcmTaskService", sb2.toString());
            }
            d(i2);
            return 2;
        } finally {
            d(i2);
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final String f3405b;

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f3406c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Uri> f3407d;

        /* renamed from: e  reason: collision with root package name */
        private final long f3408e;

        /* renamed from: f  reason: collision with root package name */
        private final zzg f3409f;
        private final Messenger g;

        b(String str, IBinder iBinder, Bundle bundle, long j, List<Uri> list) {
            zzg zzg;
            this.f3405b = str;
            if (iBinder == null) {
                zzg = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                if (queryLocalInterface instanceof zzg) {
                    zzg = (zzg) queryLocalInterface;
                } else {
                    zzg = new zzh(iBinder);
                }
            }
            this.f3409f = zzg;
            this.f3406c = bundle;
            this.f3408e = j;
            this.f3407d = list;
            this.g = null;
        }

        private static /* synthetic */ void b(Throwable th, zzp zzp) {
            if (th != null) {
                try {
                    zzp.close();
                } catch (Throwable th2) {
                    zzq.b(th, th2);
                }
            } else {
                zzp.close();
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r6) {
            /*
                r5 = this;
                com.google.android.gms.gcm.GcmTaskService r0 = com.google.android.gms.gcm.GcmTaskService.this
                java.lang.Object r0 = r0.f3399b
                monitor-enter(r0)
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.g     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r2 = r5.f3405b     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r3 = r3.f3403f     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ RemoteException -> 0x00d0 }
                boolean r1 = r1.k(r2, r3)     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x005d
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f3405b     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f3400c     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x005b:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x005d:
                boolean r1 = r5.d()     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x008c
                android.os.Messenger r1 = r5.g     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Message r2 = android.os.Message.obtain()     // Catch:{ RemoteException -> 0x00d0 }
                r3 = 3
                r2.what = r3     // Catch:{ RemoteException -> 0x00d0 }
                r2.arg1 = r6     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00d0 }
                r6.<init>()     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "component"
                com.google.android.gms.gcm.GcmTaskService r4 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r4 = r4.f3403f     // Catch:{ RemoteException -> 0x00d0 }
                r6.putParcelable(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "tag"
                java.lang.String r4 = r5.f3405b     // Catch:{ RemoteException -> 0x00d0 }
                r6.putString(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                r2.setData(r6)     // Catch:{ RemoteException -> 0x00d0 }
                r1.send(r2)     // Catch:{ RemoteException -> 0x00d0 }
                goto L_0x0091
            L_0x008c:
                com.google.android.gms.gcm.zzg r1 = r5.f3409f     // Catch:{ RemoteException -> 0x00d0 }
                r1.T1(r6)     // Catch:{ RemoteException -> 0x00d0 }
            L_0x0091:
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f3405b     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f3400c     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
                goto L_0x012a
            L_0x00ce:
                r6 = move-exception
                goto L_0x012c
            L_0x00d0:
                java.lang.String r6 = "GcmTaskService"
                java.lang.String r1 = "Error reporting result of operation to scheduler for "
                java.lang.String r2 = r5.f3405b     // Catch:{ all -> 0x00ce }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00ce }
                int r3 = r2.length()     // Catch:{ all -> 0x00ce }
                if (r3 == 0) goto L_0x00e5
                java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00ce }
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00ce }
                r2.<init>(r1)     // Catch:{ all -> 0x00ce }
                r1 = r2
            L_0x00eb:
                android.util.Log.e(r6, r1)     // Catch:{ all -> 0x00ce }
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f3405b     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r6 = r6.g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f3400c     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x012a:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x012c:
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.g     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r5.f3405b     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r3 = r3.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0169 }
                r1.h(r2, r3)     // Catch:{ all -> 0x0169 }
                boolean r1 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmNetworkManager r1 = r1.g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f3403f     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r1 = r1.j(r2)     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r2 = r2.f3400c     // Catch:{ all -> 0x0169 }
                r1.stopSelf(r2)     // Catch:{ all -> 0x0169 }
            L_0x0168:
                throw r6     // Catch:{ all -> 0x0169 }
            L_0x0169:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.b.c(int):void");
        }

        private final boolean d() {
            return this.g != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.google.android.gms.gcm.zzp r0 = new com.google.android.gms.gcm.zzp
                java.lang.String r1 = r8.f3405b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                java.lang.String r3 = "nts:client:onRunTask:"
                if (r2 == 0) goto L_0x0015
                java.lang.String r1 = r3.concat(r1)
                goto L_0x001a
            L_0x0015:
                java.lang.String r1 = new java.lang.String
                r1.<init>(r3)
            L_0x001a:
                r0.<init>(r1)
                com.google.android.gms.gcm.TaskParams r1 = new com.google.android.gms.gcm.TaskParams     // Catch:{ all -> 0x004a }
                java.lang.String r3 = r8.f3405b     // Catch:{ all -> 0x004a }
                android.os.Bundle r4 = r8.f3406c     // Catch:{ all -> 0x004a }
                long r5 = r8.f3408e     // Catch:{ all -> 0x004a }
                java.util.List<android.net.Uri> r7 = r8.f3407d     // Catch:{ all -> 0x004a }
                r2 = r1
                r2.<init>(r3, r4, r5, r7)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x004a }
                com.google.android.gms.internal.gcm.zzl r2 = r2.h     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "onRunTask"
                int r4 = com.google.android.gms.internal.gcm.zzp.f9497a     // Catch:{ all -> 0x004a }
                r2.b(r3, r4)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0046 }
                int r1 = r2.b(r1)     // Catch:{ all -> 0x0046 }
                r8.c(r1)     // Catch:{ all -> 0x004a }
                r1 = 0
                b(r1, r0)
                return
            L_0x0046:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004c }
            L_0x004c:
                r2 = move-exception
                b(r1, r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.b.run():void");
        }

        b(String str, Messenger messenger, Bundle bundle, long j, List<Uri> list) {
            this.f3405b = str;
            this.g = messenger;
            this.f3406c = bundle;
            this.f3408e = j;
            this.f3407d = list;
            this.f3409f = null;
        }
    }
}
