package com.google.firebase.iid;

import a.e.g;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzj;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class w {
    private static int g;
    private static PendingIntent h;
    @GuardedBy("responseCallbacks")

    /* renamed from: a  reason: collision with root package name */
    private final g<String, TaskCompletionSource<Bundle>> f11802a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11803b;

    /* renamed from: c  reason: collision with root package name */
    private final q f11804c;

    /* renamed from: d  reason: collision with root package name */
    private Messenger f11805d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f11806e;

    /* renamed from: f  reason: collision with root package name */
    private zzj f11807f;

    public w(Context context, q qVar) {
        this.f11803b = context;
        this.f11804c = qVar;
        this.f11805d = new Messenger(new z(this, Looper.getMainLooper()));
    }

    private static synchronized String b() {
        String num;
        synchronized (w.class) {
            int i = g;
            g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void c(Context context, Intent intent) {
        synchronized (w.class) {
            if (h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", h);
        }
    }

    /* access modifiers changed from: private */
    public final void d(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzj.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzj) {
                        this.f11807f = (zzj) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f11806e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf3 = String.valueOf(stringExtra2);
                                Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            f(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.f11802a) {
                            for (int i = 0; i < this.f11802a.size(); i++) {
                                f(this.f11802a.i(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        f(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final void f(String str, Bundle bundle) {
        synchronized (this.f11802a) {
            TaskCompletionSource remove = this.f11802a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c(bundle);
        }
    }

    private final Bundle g(Bundle bundle) throws IOException {
        Bundle h2 = h(bundle);
        if (h2 == null || !h2.containsKey("google.messenger")) {
            return h2;
        }
        Bundle h3 = h(bundle);
        if (h3 == null || !h3.containsKey("google.messenger")) {
            return h3;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final android.os.Bundle h(android.os.Bundle r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = b()
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f11802a
            monitor-enter(r2)
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r3 = r8.f11802a     // Catch:{ all -> 0x0126 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            com.google.firebase.iid.q r2 = r8.f11804c
            int r2 = r2.d()
            if (r2 == 0) goto L_0x011e
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.q r3 = r8.f11804c
            int r3 = r3.d()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r9)
            android.content.Context r9 = r8.f11803b
            c(r9, r2)
            java.lang.String r9 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "FirebaseInstanceId"
            r3 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x0096
            java.lang.String r9 = "FirebaseInstanceId"
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r9, r5)
        L_0x0096:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r5 = r8.f11805d
            r2.putExtra(r9, r5)
            android.os.Messenger r9 = r8.f11806e
            if (r9 != 0) goto L_0x00a5
            com.google.firebase.iid.zzj r9 = r8.f11807f
            if (r9 == 0) goto L_0x00cb
        L_0x00a5:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            android.os.Messenger r5 = r8.f11806e     // Catch:{ RemoteException -> 0x00bb }
            if (r5 == 0) goto L_0x00b5
            android.os.Messenger r5 = r8.f11806e     // Catch:{ RemoteException -> 0x00bb }
            r5.send(r9)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00b5:
            com.google.firebase.iid.zzj r5 = r8.f11807f     // Catch:{ RemoteException -> 0x00bb }
            r5.b(r9)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00bb:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x00cb
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x00cb:
            com.google.firebase.iid.q r9 = r8.f11804c
            int r9 = r9.d()
            if (r9 != r4) goto L_0x00d9
            android.content.Context r9 = r8.f11803b
            r9.sendBroadcast(r2)
            goto L_0x00de
        L_0x00d9:
            android.content.Context r9 = r8.f11803b
            r9.startService(r2)
        L_0x00de:
            com.google.android.gms.tasks.Task r9 = r1.a()     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            java.lang.Object r9 = com.google.android.gms.tasks.Tasks.b(r9, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r8.f11802a
            monitor-enter(r1)
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f11802a     // Catch:{ all -> 0x00f6 }
            r2.remove(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            return r9
        L_0x00f6:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            throw r9
        L_0x00f9:
            r9 = move-exception
            goto L_0x0111
        L_0x00fb:
            r9 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r9)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x0102:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r9, r1)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x00f9 }
            throw r9     // Catch:{ all -> 0x00f9 }
        L_0x0111:
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r8.f11802a
            monitor-enter(r1)
            a.e.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f11802a     // Catch:{ all -> 0x011b }
            r2.remove(r0)     // Catch:{ all -> 0x011b }
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r9
        L_0x011b:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r9
        L_0x011e:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0126:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.h(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) throws IOException {
        if (this.f11804c.g() < 12000000) {
            return g(bundle);
        }
        try {
            return (Bundle) Tasks.a(e.e(this.f11803b).f(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e2.getCause() instanceof zzam) || ((zzam) e2.getCause()).a() != 4) {
                return null;
            }
            return g(bundle);
        }
    }
}
