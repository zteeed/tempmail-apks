package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaye {
    public static final zzdrr h = new zzaxy(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Pattern> f6050a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private AtomicReference<Pattern> f6051b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f6052c = true;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f6053d = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("userAgentLock")

    /* renamed from: e  reason: collision with root package name */
    public String f6054e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6055f = false;
    private boolean g = false;

    @SuppressLint({"NewApi"})
    public static String A(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean B(Context context) {
        boolean z;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                z = false;
                            } else {
                                z = powerManager.isScreenOn();
                            }
                            if (z) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int C(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    private static KeyguardManager D(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean E(Context context) {
        KeyguardManager D;
        if (context == null || !PlatformVersion.c() || (D = D(context)) == null || !D.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    @TargetApi(18)
    public static void F(Context context, Intent intent) {
        if (intent != null && PlatformVersion.e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void G(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            new zzbad(context, str, (String) obj).zzwq();
        }
    }

    public static boolean H(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbba.c("Error loading class.", th);
            zzq.zzla().e(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static String I(Context context) {
        if (!((Boolean) zzwg.e().c(zzaav.U2)).booleanValue()) {
            return "";
        }
        return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    public static Bundle J(Context context) {
        if (!((Boolean) zzwg.e().c(zzaav.V2)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
            }
        }
        return bundle;
    }

    public static boolean K(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String L(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return T(b0(context));
    }

    public static boolean M(Context context) {
        Bundle b0 = b0(context);
        return TextUtils.isEmpty(T(b0)) && !TextUtils.isEmpty(b0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static void N(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            zzbba.c("Error writing to file in internal storage.", e2);
        }
    }

    public static void O(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbbf.f6137a.execute(runnable);
        }
    }

    public static WebResourceResponse P(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractSpiCall.HEADER_USER_AGENT, zzq.zzkw().m0(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new zzazq(context).c(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            zzbba.d("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    public static WebResourceResponse Q(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        zzq.zzkw();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        zzq.zzkw();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzq.zzky().e(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static int[] S(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return s0();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    private static String T(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    public static int V(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzbba.i(sb.toString());
            return 0;
        }
    }

    public static boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static boolean Z(String str) {
        if (!zzbau.a()) {
            return false;
        }
        if (!((Boolean) zzwg.e().c(zzaav.k2)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzwg.e().c(zzaav.m2);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzwg.e().c(zzaav.l2);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    public static DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static Bundle b0(Context context) {
        try {
            return Wrappers.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zzaxv.l("Error getting metadata", e2);
            return null;
        }
    }

    public static PopupWindow c(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static Map<String, String> d0(Uri uri) {
        if (!zzach.f5586b.a().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            zzq.zzky();
            for (String next : uri.getQueryParameterNames()) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[((length - i) / 3)];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((a(encodedQuery.charAt(i + 1)) << 4) + a(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt == '&') {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                } else if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    sb3.append(charAt);
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    public static String f(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static Bitmap f0(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    private final JSONArray g(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object o : collection) {
            o(jSONArray, o);
        }
        return jSONArray;
    }

    public static Bitmap g0(View view) {
        if (view == null) {
            return null;
        }
        Bitmap i0 = i0(view);
        return i0 == null ? h0(view) : i0;
    }

    private static Bitmap h0(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzbba.i("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            zzbba.c("Fail to capture the webview", e2);
            return null;
        }
    }

    public static void i(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static Bitmap i0(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            zzbba.c("Fail to capture the web view", e2);
        }
        return bitmap;
    }

    @TargetApi(18)
    public static void j(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            F(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzbba.f(sb.toString());
        } catch (ActivityNotFoundException e2) {
            zzbba.c("No browser is found.", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaye.j0(android.view.View):boolean");
    }

    public static int k0(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static boolean l0(Context context, String str) {
        Context c2 = zzatd.c(context);
        return Wrappers.a(c2).b(str, c2.getPackageName()) == 0;
    }

    public static void n(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = zzacq.f5606b.a().booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                CrashUtils.a(context, th);
            }
        }
    }

    public static boolean n0(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private final void o(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(R((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(e0((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(g((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object o : (Object[]) obj) {
                o(jSONArray2, o);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    public static String o0(Context context, String str) {
        try {
            return new String(IOUtils.d(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzbba.f("Error reading from internal storage.");
            return "";
        }
    }

    private final void p(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, R((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, e0((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, g((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, g(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static String p0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static String q0() {
        return UUID.randomUUID().toString();
    }

    public static String r0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static int[] s0() {
        return new int[]{0, 0};
    }

    private static boolean t(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String t0() {
        Resources b2 = zzq.zzla().b();
        return b2 != null ? b2.getString(R.string.s7) : "Test Ad";
    }

    @VisibleForTesting
    protected static String w(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return p0();
        }
    }

    public static DisplayMetrics x(Context context) {
        return b((WindowManager) context.getSystemService("window"));
    }

    public static AlertDialog.Builder y(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static zzaac z(Context context) {
        return new zzaac(context);
    }

    public final JSONObject R(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            p(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final int[] U(Activity activity) {
        int[] S = S(activity);
        return new int[]{zzwg.a().j(activity, S[0]), zzwg.a().j(activity, S[1])};
    }

    public final boolean X(String str) {
        return t(str, this.f6050a, (String) zzwg.e().c(zzaav.S));
    }

    public final boolean Y(String str) {
        return t(str, this.f6051b, (String) zzwg.e().c(zzaav.T));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] a0(android.app.Activity r7) {
        /*
            r6 = this;
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = s0()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzbaq r1 = com.google.android.gms.internal.ads.zzwg.a()
            r5 = r4[r3]
            int r1 = r1.j(r7, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzbaq r1 = com.google.android.gms.internal.ads.zzwg.a()
            r3 = r4[r2]
            int r7 = r1.j(r7, r3)
            r0[r2] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaye.a0(android.app.Activity):int[]");
    }

    public final zzdvf<Map<String, String>> c0(Uri uri) {
        return zzdux.j(zzdux.g(null), new h5(this, uri), zzbbf.f6137a);
    }

    public final JSONObject e0(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                p(jSONObject, next, map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject h(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return R(bundle);
            } catch (JSONException e2) {
                zzbba.c("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final void k(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m0(context, str));
    }

    public final void l(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzq.zzkw();
        bundle.putString("device", r0());
        bundle.putString("eids", TextUtils.join(",", zzaav.d()));
        zzwg.a();
        zzbaq.e(context, str, str2, bundle, true, new l5(this, context, str));
    }

    public final void m(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty(AbstractSpiCall.HEADER_USER_AGENT, m0(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m0(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6053d
            monitor-enter(r0)
            java.lang.String r1 = r4.f6054e     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f6054e     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = p0()     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.zzayj r1 = com.google.android.gms.ads.internal.zzq.zzky()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.a(r5)     // Catch:{ Exception -> 0x001d }
            r4.f6054e = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f6054e     // Catch:{ all -> 0x00cd }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ all -> 0x00cd }
            boolean r1 = com.google.android.gms.internal.ads.zzbaq.y()     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x0065
            r1 = 0
            r4.f6054e = r1     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.ads.zzdrr r1 = h     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.ads.i5 r2 = new com.google.android.gms.internal.ads.i5     // Catch:{ all -> 0x00cd }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00cd }
            r1.post(r2)     // Catch:{ all -> 0x00cd }
        L_0x003b:
            java.lang.String r1 = r4.f6054e     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x006b
            java.lang.Object r1 = r4.f6053d     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = p0()     // Catch:{ all -> 0x00cd }
            r4.f6054e = r1     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            int r3 = r1.length()     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00cd }
            goto L_0x0061
        L_0x005c:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00cd }
            r1.<init>(r2)     // Catch:{ all -> 0x00cd }
        L_0x0061:
            com.google.android.gms.internal.ads.zzbba.i(r1)     // Catch:{ all -> 0x00cd }
            goto L_0x003b
        L_0x0065:
            java.lang.String r1 = w(r5)     // Catch:{ all -> 0x00cd }
            r4.f6054e = r1     // Catch:{ all -> 0x00cd }
        L_0x006b:
            java.lang.String r1 = r4.f6054e     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            int r2 = r2.length()     // Catch:{ all -> 0x00cd }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00cd }
            int r3 = r3.length()     // Catch:{ all -> 0x00cd }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r3.<init>(r2)     // Catch:{ all -> 0x00cd }
            r3.append(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00cd }
            r3.append(r6)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00cd }
            r4.f6054e = r6     // Catch:{ all -> 0x00cd }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.a(r5)     // Catch:{ Exception -> 0x00b3 }
            boolean r5 = r5.g()     // Catch:{ Exception -> 0x00b3 }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = r4.f6054e     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b3 }
            r4.f6054e = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00bd
        L_0x00b3:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzaxh r6 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.e(r5, r1)     // Catch:{ all -> 0x00cd }
        L_0x00bd:
            java.lang.String r5 = r4.f6054e     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00cd }
            r4.f6054e = r5     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x00cd:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaye.m0(android.content.Context, java.lang.String):java.lang.String");
    }

    public final boolean q(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, D(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzaye r0 = com.google.android.gms.ads.internal.zzq.zzkw()
            boolean r0 = r0.f6052c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r6 != 0) goto L_0x000e
            r6 = 0
            goto L_0x0012
        L_0x000e:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r6 == 0) goto L_0x001d
            boolean r6 = j0(r4)
            if (r6 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r6 = 0
            goto L_0x001e
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0035
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0063
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzaav.D0
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r5 = r6.c(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaye.r(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public final boolean u(Context context) {
        if (this.f6055f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new m5(this, (j5) null), intentFilter);
        this.f6055f = true;
        return true;
    }

    public final boolean v(Context context) {
        if (this.g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new k5(this, (j5) null), intentFilter);
        this.g = true;
        return true;
    }
}
