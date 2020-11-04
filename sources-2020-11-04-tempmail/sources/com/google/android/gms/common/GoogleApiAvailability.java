package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.g;
import androidx.fragment.app.c;
import com.google.android.gms.base.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;

public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2851d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final GoogleApiAvailability f2852e = new GoogleApiAvailability();

    /* renamed from: c  reason: collision with root package name */
    private String f2853c;

    @SuppressLint({"HandlerLeak"})
    private class a extends zap {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2854a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f2854a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int i2 = GoogleApiAvailability.this.i(this.f2854a);
            if (GoogleApiAvailability.this.m(i2)) {
                GoogleApiAvailability.this.s(this.f2854a, i2);
            }
        }
    }

    private final String B() {
        String str;
        synchronized (f2851d) {
            str = this.f2853c;
        }
        return str;
    }

    public static GoogleApiAvailability q() {
        return f2852e;
    }

    public static Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ConnectionErrorMessages.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    static Dialog u(Context context, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ConnectionErrorMessages.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = ConnectionErrorMessages.c(context, i);
        if (c2 != null) {
            builder.setPositiveButton(c2, dialogRedirect);
        }
        String g = ConnectionErrorMessages.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    static void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof c) {
            SupportErrorDialogFragment.y2(dialog, onCancelListener).x2(((c) activity).k0(), str);
            return;
        }
        ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void y(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            x(context);
        } else if (pendingIntent != null) {
            String f2 = ConnectionErrorMessages.f(context, i);
            String e2 = ConnectionErrorMessages.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            g.d dVar = new g.d(context);
            dVar.q(true);
            dVar.f(true);
            dVar.k(f2);
            g.c cVar = new g.c();
            cVar.g(e2);
            dVar.w(cVar);
            if (DeviceProperties.d(context)) {
                Preconditions.n(PlatformVersion.g());
                dVar.u(context.getApplicationInfo().icon);
                dVar.s(2);
                if (DeviceProperties.e(context)) {
                    dVar.a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    dVar.i(pendingIntent);
                }
            } else {
                dVar.u(17301642);
                dVar.x(resources.getString(R.string.common_google_play_services_notification_ticker));
                dVar.A(System.currentTimeMillis());
                dVar.i(pendingIntent);
                dVar.j(e2);
            }
            if (PlatformVersion.k()) {
                Preconditions.n(PlatformVersion.k());
                String B = B();
                if (B == null) {
                    B = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(B);
                    String b2 = ConnectionErrorMessages.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(B, b2, 4));
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.g(B);
            }
            Notification b3 = dVar.b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b3);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean A(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent p = p(context, connectionResult);
        if (p == null) {
            return false;
        }
        y(context, connectionResult.u(), (String) null, GoogleApiActivity.a(context, p, i));
        return true;
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent d(Context context, int i, String str) {
        return super.d(context, i, str);
    }

    public PendingIntent e(Context context, int i, int i2) {
        return super.e(context, i, i2);
    }

    public final String g(int i) {
        return super.g(i);
    }

    @HideFirstParty
    public int i(Context context) {
        return super.i(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int j(Context context, int i) {
        return super.j(context, i);
    }

    public final boolean m(int i) {
        return super.m(i);
    }

    public Dialog o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return u(activity, i, DialogRedirect.a(activity, d(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent p(Context context, ConnectionResult connectionResult) {
        if (connectionResult.B()) {
            return connectionResult.A();
        }
        return e(context, connectionResult.u(), 0);
    }

    public boolean r(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        w(activity, o, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void s(Context context, int i) {
        y(context, i, (String) null, f(context, i, 0, "n"));
    }

    public final zabq v(Context context, zabr zabr) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(zabr);
        context.registerReceiver(zabq, intentFilter);
        zabq.b(context);
        if (l(context, "com.google.android.gms")) {
            return zabq;
        }
        zabr.a();
        zabq.a();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void x(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean z(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog u = u(activity, i, DialogRedirect.c(lifecycleFragment, d(activity, i, "d"), 2), onCancelListener);
        if (u == null) {
            return false;
        }
        w(activity, u, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
