package b.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import b.b.p;
import com.google.firebase.iid.FirebaseInstanceIdService;
import java.lang.ref.WeakReference;

final class j0 {

    static class a extends AsyncTask<Void, Void, String> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f2052a;

        /* renamed from: b  reason: collision with root package name */
        private String f2053b;

        a(WeakReference<Context> weakReference) {
            this.f2052a = weakReference;
        }

        private String a() {
            try {
                if (this.f2053b != null) {
                    return j0.a(this.f2052a, this.f2053b);
                }
                return null;
            } catch (Throwable th) {
                e.b("Error registering for uninstall feature", th);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                String g = j.b().g("afUninstallToken");
                p.a.C0059a aVar = new p.a.C0059a(str);
                if (g == null) {
                    j0.e(this.f2052a.get(), aVar);
                    return;
                }
                p.a.C0059a c2 = p.a.C0059a.c(g);
                if (c2.e(aVar)) {
                    j0.e(this.f2052a.get(), c2);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.f2053b = j.b().g("gcmProjectNumber");
        }
    }

    /* access modifiers changed from: private */
    public static String a(WeakReference<Context> weakReference, String str) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            Object invoke = cls2.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls2, new Object[]{weakReference.get()});
            String str2 = (String) cls2.getDeclaredMethod("getToken", new Class[]{cls, cls}).invoke(invoke, new Object[]{str, "GCM"});
            if (str2 != null) {
                return str2;
            }
            e.f("Couldn't get token using reflection.");
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            e.b("Couldn't get token using GoogleCloudMessaging. ", th);
            return null;
        }
    }

    static boolean c(Context context) {
        return f(context) | d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if ((r6.getPackageManager().queryIntentServices(r3, 0).size() > 0) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(android.content.Context r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.iid.InstanceID"
            b.b.i r1 = b.b.i.e()
            boolean r1 = r1.j()
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r1 = "com.google.android.gms.iid.InstanceIDListenerService"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.Class<b.b.m> r3 = b.b.m.class
            r4 = 0
            r1.<init>(r0, r4, r6, r3)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.Class<com.google.android.gms.iid.InstanceIDListenerService> r5 = com.google.android.gms.iid.InstanceIDListenerService.class
            r3.<init>(r0, r4, r6, r5)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.util.List r0 = r0.queryIntentServices(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            r1 = 1
            if (r0 <= 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0049
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.util.List r0 = r0.queryIntentServices(r3, r2)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            if (r0 <= 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x00a0
        L_0x0049:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            java.lang.String r5 = "com.google.android.gms.gcm.GcmReceiver"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            r0.<init>(r3, r4, r6, r5)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.util.List r0 = r3.queryBroadcastReceivers(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            if (r0 <= 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r6.getPackageName()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            r3.append(r0)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.String r0 = ".permission.C2D_MESSAGE"
            r3.append(r0)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.String r0 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            boolean r6 = b.b.b.a.C0058a.a(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            if (r6 == 0) goto L_0x0085
            return r1
        L_0x0085:
            java.lang.String r6 = "Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation."
            b.b.e.f(r6)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            goto L_0x00a0
        L_0x008b:
            java.lang.String r6 = "Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation."
            b.b.e.f(r6)     // Catch:{ ClassNotFoundException -> 0x0098, all -> 0x0091 }
            goto L_0x00a0
        L_0x0091:
            r6 = move-exception
            java.lang.String r0 = "An error occurred while trying to verify manifest declarations: "
            b.b.e.b(r0, r6)
            goto L_0x00a0
        L_0x0098:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            b.b.e.e(r6)
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j0.d(android.content.Context):boolean");
    }

    static void e(Context context, p.a.C0059a aVar) {
        StringBuilder sb = new StringBuilder("updateServerUninstallToken called with: ");
        sb.append(aVar.toString());
        e.c(sb.toString());
        p.a.C0059a c2 = p.a.C0059a.c(j.b().g("afUninstallToken"));
        if (!i.M(context).getBoolean("sentRegisterRequestToAF", false) || c2.a() == null || !c2.a().equals(aVar.a())) {
            j.b().n("afUninstallToken", aVar.toString());
            i.e().U(context, aVar.a());
        }
    }

    private static boolean f(Context context) {
        if (i.e().j()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            Intent intent = new Intent("com.google.firebase.INSTANCE_ID_EVENT", (Uri) null, context, l.class);
            Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", (Uri) null, context, FirebaseInstanceIdService.class);
            if (!(context.getPackageManager().queryIntentServices(intent, 0).size() > 0)) {
                if (!(context.getPackageManager().queryIntentServices(intent2, 0).size() > 0)) {
                    e.f("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            e.b("An error occurred while trying to verify manifest declarations: ", th);
        }
    }
}
