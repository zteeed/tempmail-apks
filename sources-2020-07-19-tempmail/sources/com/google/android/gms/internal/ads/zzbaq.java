package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbaq {

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f6115b = new zzdrr(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final String f6116c = AdView.class.getName();

    /* renamed from: d  reason: collision with root package name */
    private static final String f6117d = InterstitialAd.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private static final String f6118e = PublisherAdView.class.getName();

    /* renamed from: f  reason: collision with root package name */
    private static final String f6119f = PublisherInterstitialAd.class.getName();
    private static final String g = SearchAdView.class.getName();
    private static final String h = AdLoader.class.getName();

    /* renamed from: a  reason: collision with root package name */
    private float f6120a = -1.0f;

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static AdSize b(Context context, int i, int i2, int i3) {
        int u = u(context, i3);
        if (u == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i, Math.max(Math.min(i > 655 ? Math.round((((float) i) / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? Math.round((((float) i) / 468.0f) * 60.0f) : i > 432 ? 68 : Math.round((((float) i) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) u) * 0.15f))), 50));
    }

    @VisibleForTesting
    public static String c(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f6116c.equalsIgnoreCase(className) && !f6117d.equalsIgnoreCase(className) && !f6118e.equalsIgnoreCase(className) && !f6119f.equalsIgnoreCase(className) && !g.equalsIgnoreCase(className) && !h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public static void e(Context context, String str, String str2, Bundle bundle, boolean z, zzbar zzbar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int b2 = GoogleApiAvailabilityLight.h().b(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(b2);
            sb.append(".201604000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzbar.a(appendQueryParameter.toString());
    }

    private final void g(ViewGroup viewGroup, zzvh zzvh, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int r = r(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzvh.g - r, zzvh.f9191d - r, 17));
            viewGroup.addView(frameLayout, zzvh.g, zzvh.f9191d);
        }
    }

    public static void i(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty(AbstractSpiCall.HEADER_USER_AGENT, str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static int k(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static String l(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || x()) {
            str = "emulator";
        }
        return v(str);
    }

    public static String m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static boolean n(Context context) {
        int j = GoogleApiAvailabilityLight.h().j(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return j == 0 || j == 2;
    }

    public static boolean o(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
            return true;
        }
        return false;
    }

    @TargetApi(17)
    public static boolean p(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (PlatformVersion.d()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    public static int q(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int r(Context context, int i) {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public static Throwable s(Throwable th) {
        if (zzacq.f5610f.a().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (w(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static boolean t(Context context, int i) {
        return GoogleApiAvailabilityLight.h().j(context, i) == 0;
    }

    public static int u(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static String v(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    @VisibleForTesting
    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(zzacq.f5608d.a());
    }

    public static boolean x() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String z() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public final void d(Context context, String str, String str2, Bundle bundle, boolean z) {
        e(context, str, str2, bundle, true, new i6(this));
    }

    public final void f(ViewGroup viewGroup, zzvh zzvh, String str) {
        g(viewGroup, zzvh, str, -16777216, -1);
    }

    public final void h(ViewGroup viewGroup, zzvh zzvh, String str, String str2) {
        zzbba.i(str2);
        g(viewGroup, zzvh, str, -65536, -16777216);
    }

    public final int j(Context context, int i) {
        if (this.f6120a < 0.0f) {
            synchronized (this) {
                if (this.f6120a < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f6120a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f6120a);
    }
}
