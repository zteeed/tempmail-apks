package com.google.android.gms.iid;

import a.e.a;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ShowFirstParty
public class zzaf {
    private static final zzaj<Boolean> g = zzai.b().a("gcm_iid_use_messenger_ipc", true);
    private static String h = null;
    private static boolean i = false;
    private static int j = 0;
    private static BroadcastReceiver k = null;

    /* renamed from: a  reason: collision with root package name */
    private Context f3483a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f3484b = new a();

    /* renamed from: c  reason: collision with root package name */
    private Messenger f3485c;

    /* renamed from: d  reason: collision with root package name */
    private Messenger f3486d;

    /* renamed from: e  reason: collision with root package name */
    private MessengerCompat f3487e;

    /* renamed from: f  reason: collision with root package name */
    private PendingIntent f3488f;

    public zzaf(Context context) {
        this.f3483a = context;
    }

    private static void b(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    private final void c(String str, Object obj) {
        synchronized (zzaf.class) {
            Object obj2 = this.f3484b.get(str);
            this.f3484b.put(str, obj);
            b(obj2, obj);
        }
    }

    private static boolean d(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            h = applicationInfo.packageName;
            int i2 = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean e(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return d(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    private final synchronized void g(Intent intent) {
        if (this.f3488f == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f3488f = PendingIntent.getBroadcast(this.f3483a, 0, intent2, 0);
        }
        intent.putExtra("app", this.f3488f);
    }

    static String i(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
            }
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if (string2 != null) {
                throw new IOException(string2);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unexpected response from GCM ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final Bundle j(Bundle bundle) throws IOException {
        Bundle k2 = k(bundle);
        if (k2 == null || !k2.containsKey("google.messenger")) {
            return k2;
        }
        Bundle k3 = k(bundle);
        if (k3 == null || !k3.containsKey("google.messenger")) {
            return k3;
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
    private final android.os.Bundle k(android.os.Bundle r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Class<com.google.android.gms.iid.zzaf> r0 = com.google.android.gms.iid.zzaf.class
            android.os.ConditionVariable r1 = new android.os.ConditionVariable
            r1.<init>()
            java.lang.String r2 = n()
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3484b     // Catch:{ all -> 0x01d6 }
            r3.put(r2, r1)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d6 }
            android.os.Messenger r3 = r9.f3485c
            if (r3 != 0) goto L_0x002b
            android.content.Context r3 = r9.f3483a
            l(r3)
            android.os.Messenger r3 = new android.os.Messenger
            com.google.android.gms.iid.e r4 = new com.google.android.gms.iid.e
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r9, r5)
            r3.<init>(r4)
            r9.f3485c = r3
        L_0x002b:
            java.lang.String r3 = h
            if (r3 == 0) goto L_0x01ce
            android.content.Intent r3 = new android.content.Intent
            boolean r4 = i
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003a
        L_0x0038:
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003a:
            r3.<init>(r4)
            java.lang.String r4 = h
            r3.setPackage(r4)
            r3.putExtras(r10)
            r9.g(r3)
            java.lang.String r10 = "kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = "|"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.putExtra(r10, r4)
            java.lang.String r10 = "X-kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = "|"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.putExtra(r10, r4)
            java.lang.String r10 = "com.google.android.gsf"
            java.lang.String r4 = h
            boolean r10 = r10.equals(r4)
            java.lang.String r4 = "useGsf"
            java.lang.String r4 = r3.getStringExtra(r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r4)
        L_0x00a8:
            java.lang.String r4 = "InstanceID"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L_0x00d9
            java.lang.String r4 = "InstanceID"
            android.os.Bundle r6 = r3.getExtras()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Sending "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.d(r4, r6)
        L_0x00d9:
            android.os.Messenger r4 = r9.f3486d
            if (r4 == 0) goto L_0x0101
            java.lang.String r4 = "google.messenger"
            android.os.Messenger r6 = r9.f3485c
            r3.putExtra(r4, r6)
            android.os.Message r4 = android.os.Message.obtain()
            r4.obj = r3
            android.os.Messenger r6 = r9.f3486d     // Catch:{ RemoteException -> 0x00f1 }
            r6.send(r4)     // Catch:{ RemoteException -> 0x00f1 }
            goto L_0x017f
        L_0x00f1:
            java.lang.String r4 = "InstanceID"
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L_0x0101
            java.lang.String r4 = "InstanceID"
            java.lang.String r6 = "Messenger failed, fallback to startService"
            android.util.Log.d(r4, r6)
        L_0x0101:
            if (r10 == 0) goto L_0x0142
            monitor-enter(r0)
            android.content.BroadcastReceiver r10 = k     // Catch:{ all -> 0x013f }
            if (r10 != 0) goto L_0x0138
            com.google.android.gms.iid.f r10 = new com.google.android.gms.iid.f     // Catch:{ all -> 0x013f }
            r10.<init>(r9)     // Catch:{ all -> 0x013f }
            k = r10     // Catch:{ all -> 0x013f }
            java.lang.String r10 = "InstanceID"
            boolean r10 = android.util.Log.isLoggable(r10, r5)     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x011e
            java.lang.String r10 = "InstanceID"
            java.lang.String r4 = "Registered GSF callback receiver"
            android.util.Log.d(r10, r4)     // Catch:{ all -> 0x013f }
        L_0x011e:
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ all -> 0x013f }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTRATION"
            r10.<init>(r4)     // Catch:{ all -> 0x013f }
            android.content.Context r4 = r9.f3483a     // Catch:{ all -> 0x013f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x013f }
            r10.addCategory(r4)     // Catch:{ all -> 0x013f }
            android.content.Context r4 = r9.f3483a     // Catch:{ all -> 0x013f }
            android.content.BroadcastReceiver r5 = k     // Catch:{ all -> 0x013f }
            java.lang.String r6 = "com.google.android.c2dm.permission.SEND"
            r7 = 0
            r4.registerReceiver(r5, r10, r6, r7)     // Catch:{ all -> 0x013f }
        L_0x0138:
            monitor-exit(r0)     // Catch:{ all -> 0x013f }
            android.content.Context r10 = r9.f3483a
            r10.sendBroadcast(r3)
            goto L_0x017f
        L_0x013f:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013f }
            throw r10
        L_0x0142:
            java.lang.String r10 = "google.messenger"
            android.os.Messenger r4 = r9.f3485c
            r3.putExtra(r10, r4)
            java.lang.String r10 = "messenger2"
            java.lang.String r4 = "1"
            r3.putExtra(r10, r4)
            com.google.android.gms.iid.MessengerCompat r10 = r9.f3487e
            if (r10 == 0) goto L_0x0170
            android.os.Message r10 = android.os.Message.obtain()
            r10.obj = r3
            com.google.android.gms.iid.MessengerCompat r4 = r9.f3487e     // Catch:{ RemoteException -> 0x0160 }
            r4.b(r10)     // Catch:{ RemoteException -> 0x0160 }
            goto L_0x017f
        L_0x0160:
            java.lang.String r10 = "InstanceID"
            boolean r10 = android.util.Log.isLoggable(r10, r5)
            if (r10 == 0) goto L_0x0170
            java.lang.String r10 = "InstanceID"
            java.lang.String r4 = "Messenger failed, fallback to startService"
            android.util.Log.d(r10, r4)
        L_0x0170:
            boolean r10 = i
            if (r10 == 0) goto L_0x017a
            android.content.Context r10 = r9.f3483a
            r10.sendBroadcast(r3)
            goto L_0x017f
        L_0x017a:
            android.content.Context r10 = r9.f3483a
            r10.startService(r3)
        L_0x017f:
            r3 = 30000(0x7530, double:1.4822E-319)
            r1.block(r3)
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.f3484b     // Catch:{ all -> 0x01cb }
            java.lang.Object r10 = r10.remove(r2)     // Catch:{ all -> 0x01cb }
            boolean r1 = r10 instanceof android.os.Bundle     // Catch:{ all -> 0x01cb }
            if (r1 == 0) goto L_0x0193
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch:{ all -> 0x01cb }
            monitor-exit(r0)     // Catch:{ all -> 0x01cb }
            return r10
        L_0x0193:
            boolean r1 = r10 instanceof java.lang.String     // Catch:{ all -> 0x01cb }
            if (r1 == 0) goto L_0x019f
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01cb }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01cb }
            r1.<init>(r10)     // Catch:{ all -> 0x01cb }
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x019f:
            java.lang.String r1 = "InstanceID"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01cb }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01cb }
            int r2 = r2.length()     // Catch:{ all -> 0x01cb }
            int r2 = r2 + 12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cb }
            r3.<init>(r2)     // Catch:{ all -> 0x01cb }
            java.lang.String r2 = "No response "
            r3.append(r2)     // Catch:{ all -> 0x01cb }
            r3.append(r10)     // Catch:{ all -> 0x01cb }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x01cb }
            android.util.Log.w(r1, r10)     // Catch:{ all -> 0x01cb }
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x01cb }
            java.lang.String r1 = "TIMEOUT"
            r10.<init>(r1)     // Catch:{ all -> 0x01cb }
            throw r10     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01cb }
            throw r10
        L_0x01ce:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r10.<init>(r0)
            throw r10
        L_0x01d6:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01d6 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.k(android.os.Bundle):android.os.Bundle");
    }

    @ShowFirstParty
    public static String l(Context context) {
        boolean z;
        String str = h;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!PlatformVersion.k()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (e(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        i = false;
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return h;
            }
        }
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (e(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    i = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return h;
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (d(packageManager, "com.google.android.gms")) {
            i = PlatformVersion.k();
            return h;
        } else if (PlatformVersion.h() || !d(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            i = false;
            return h;
        }
    }

    private static int m(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(l(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static synchronized String n() {
        String num;
        synchronized (zzaf.class) {
            int i2 = j;
            j = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle, KeyPair keyPair) throws IOException {
        int m = m(this.f3483a);
        bundle.putString("gmsv", Integer.toString(m));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.h(this.f3483a)));
        bundle.putString("app_ver_name", InstanceID.i(this.f3483a));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", InstanceID.f(keyPair));
        if (m < 12000000 || !g.get().booleanValue()) {
            return j(bundle);
        }
        try {
            return (Bundle) Tasks.a(new zzr(this.f3483a).b(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            if (!(e2.getCause() instanceof zzaa) || ((zzaa) e2.getCause()).a() != 4) {
                return null;
            }
            return j(bundle);
        }
    }

    public final void f(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.f3487e = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f3486d = (Messenger) parcelableExtra;
                    }
                }
                h((Intent) message.obj);
                return;
            }
            Log.w("InstanceID", "Dropping invalid message");
        }
    }

    public final void h(Intent intent) {
        String str;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf = String.valueOf(intent.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf);
                        Log.w("InstanceID", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("InstanceID", 3)) {
                        String valueOf2 = String.valueOf(stringExtra2);
                        Log.d("InstanceID", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                    }
                    String str2 = null;
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (!"ID".equals(split[1])) {
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.w("InstanceID", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                        }
                        if (split.length > 2) {
                            String str3 = split[2];
                            str = split[3];
                            if (str.startsWith(":")) {
                                str = str.substring(1);
                            }
                            str2 = str3;
                        } else {
                            str = "UNKNOWN";
                        }
                        stringExtra2 = str;
                        intent.putExtra("error", stringExtra2);
                    }
                    if (str2 == null) {
                        synchronized (zzaf.class) {
                            for (String next : this.f3484b.keySet()) {
                                Object obj = this.f3484b.get(next);
                                this.f3484b.put(next, stringExtra2);
                                b(obj, stringExtra2);
                            }
                        }
                        return;
                    }
                    c(str2, stringExtra2);
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Bundle extras = intent.getExtras();
                    extras.putString("registration_id", group2);
                    c(group, extras);
                } else if (Log.isLoggable("InstanceID", 3)) {
                    String valueOf4 = String.valueOf(stringExtra);
                    Log.d("InstanceID", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                }
            } else if (Log.isLoggable("InstanceID", 3)) {
                String valueOf5 = String.valueOf(intent.getAction());
                Log.d("InstanceID", valueOf5.length() != 0 ? "Unexpected response ".concat(valueOf5) : new String("Unexpected response "));
            }
        } else if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Unexpected response: null");
        }
    }
}
