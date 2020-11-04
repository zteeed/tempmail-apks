package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ActivityCompat */
public class a extends androidx.core.content.a {

    /* renamed from: c  reason: collision with root package name */
    private static c f1262c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    static class C0039a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f1263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f1264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1265d;

        C0039a(String[] strArr, Activity activity, int i) {
            this.f1263b = strArr;
            this.f1264c = activity;
            this.f1265d = i;
        }

        public void run() {
            int[] iArr = new int[this.f1263b.length];
            PackageManager packageManager = this.f1264c.getPackageManager();
            String packageName = this.f1264c.getPackageName();
            int length = this.f1263b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1263b[i], packageName);
            }
            ((b) this.f1264c).onRequestPermissionsResult(this.f1265d, this.f1263b, iArr);
        }
    }

    /* compiled from: ActivityCompat */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean b(Activity activity, String[] strArr, int i);
    }

    /* compiled from: ActivityCompat */
    public interface d {
        void g(int i);
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c m() {
        return f1262c;
    }

    public static Uri n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static void o(Activity activity, String[] strArr, int i) {
        c cVar = f1262c;
        if (cVar != null && cVar.b(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).g(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new C0039a(strArr, activity, i));
        }
    }

    public static boolean p(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void q(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
