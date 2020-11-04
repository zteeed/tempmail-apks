package com.tempmail.utils;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.content.a;
import com.tempmail.R;
import com.tempmail.u.c;
import com.tempmail.utils.y.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* compiled from: Utils */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13134a = "x";

    public static void A(Context context, String str) {
        z(context, Uri.parse(str));
    }

    public static float B(Context context, float f2) {
        return f2 / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int C(double d2) {
        return (int) Math.ceil(d2);
    }

    public static String D(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("###.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(d2);
    }

    public static void E(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        Uri parse = Uri.parse("mailto:" + Uri.encode(str));
        intent.setType("message/rfc822");
        intent.setData(parse);
        intent.putExtra("android.intent.extra.EMAIL", str);
        if (str2 != null) {
            String str3 = b.f13138c + " - " + str2;
            intent.putExtra("android.intent.extra.SUBJECT", str3);
            m.b(f13134a, "subject " + str3);
        }
        String str4 = "Android " + Build.VERSION.RELEASE;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String typeName = (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) ? "NONE" : connectivityManager.getActiveNetworkInfo().getTypeName();
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.feedback_body, new Object[]{Locale.getDefault().getLanguage(), Build.MODEL, typeName, str4, f(context)}));
        m.b(f13134a, "feedback " + context.getString(R.string.feedback_body, new Object[]{Locale.getDefault().getLanguage(), Build.MODEL, typeName, str4, f(context)}));
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.message_send_email_title)));
    }

    public static c F(String str) {
        String[] split = str.split("@");
        if (split.length != 2) {
            return null;
        }
        String str2 = split[0];
        return new c(str2, "@" + split[1]);
    }

    public static List<String> G(String str, int i) {
        if (i == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(((str.length() + i) - 1) / i);
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + i;
            arrayList.add(str.substring(i2, Math.min(str.length(), i3)));
            i2 = i3;
        }
        return arrayList;
    }

    public static String H(String str) {
        if (str == null) {
            return "";
        }
        return "‭" + str;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static void b(Context context, Class<?> cls, boolean z) {
        m.b("Utils", "change enable of " + cls.getName() + " to " + z);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), z ? 1 : 2, 1);
    }

    public static boolean c(Context context, Class<?> cls) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls)) == 1;
    }

    public static float d(Context context, float f2) {
        return f2 * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int e(int i, int i2) {
        return new Random().nextInt(i - i2) + i2;
    }

    public static String f(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        return packageInfo.versionName;
    }

    public static String g(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            return String.valueOf(packageInfo.versionCode);
        }
        try {
            return String.valueOf(packageInfo.getLongVersionCode());
        } catch (NoSuchMethodError e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static int h(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        try {
            return (int) packageInfo.getLongVersionCode();
        } catch (NoSuchMethodError e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    public static String i(Context context) {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (CertificateException e3) {
            e3.printStackTrace();
            certificateFactory = null;
        }
        try {
            x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
        } catch (CertificateException e4) {
            e4.printStackTrace();
            x509Certificate = null;
        }
        try {
            return a(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return null;
        } catch (CertificateEncodingException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static int j(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static String k(String str) {
        Integer num;
        String l = l(str);
        m.b(f13134a, "xor key 1573252");
        try {
            num = Integer.valueOf("1573252");
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            num = null;
        }
        if (num != null) {
            l = v.b(l, num.intValue());
        }
        String str2 = f13134a;
        m.b(str2, "encodedString " + l);
        return l;
    }

    public static String l(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String m(Context context) {
        String language = Locale.getDefault().getLanguage();
        if (Arrays.asList(context.getResources().getStringArray(R.array.covered_languages_website)).contains(language)) {
            return language;
        }
        return context.getString(R.string.default_language);
    }

    public static String n(Context context) {
        String language = Locale.getDefault().getLanguage();
        if (Arrays.asList(context.getResources().getStringArray(R.array.covered_languages_app)).contains(language)) {
            return language;
        }
        return context.getString(R.string.default_language);
    }

    public static int o(Context context, int i) {
        return (int) context.getResources().getDimension(i);
    }

    public static File p() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), b.f13138c);
        file.mkdirs();
        return file;
    }

    public static void q(Context context) {
        String packageName = context.getPackageName();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    public static void r(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean s(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean t(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || configuration.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static boolean u(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    public static boolean v(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static boolean w(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public static boolean x(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && a.a(context, "android.permission.CAMERA") != 0) {
            return false;
        }
        return true;
    }

    public static boolean y(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return true;
        }
        return false;
    }

    public static void z(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                Toast.makeText(context, R.string.message_cannot_found_browser, 1).show();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }
}
