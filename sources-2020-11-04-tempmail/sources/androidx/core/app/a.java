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
    private static c f1289c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    static class C0039a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f1290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f1291c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1292d;

        C0039a(String[] strArr, Activity activity, int i) {
            this.f1290b = strArr;
            this.f1291c = activity;
            this.f1292d = i;
        }

        public void run() {
            int[] iArr = new int[this.f1290b.length];
            PackageManager packageManager = this.f1291c.getPackageManager();
            String packageName = this.f1291c.getPackageName();
            int length = this.f1290b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1290b[i], packageName);
            }
            ((b) this.f1291c).onRequestPermissionsResult(this.f1292d, this.f1290b, iArr);
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
        void e(int i);
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c m() {
        return f1289c;
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
        c cVar = f1289c;
        if (cVar != null && cVar.b(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).e(i);
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
