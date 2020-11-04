package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzw;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkr extends s4 {
    private static final String[] g = {"firebase_", "google_", "ga_"};
    private static final String[] h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f10705c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f10706d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f10707e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f10708f = null;

    zzkr(zzfy zzfy) {
        super(zzfy);
    }

    static boolean A0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static Bundle D(List<zzkq> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkq next : list) {
            String str = next.f10704f;
            if (str != null) {
                bundle.putString(next.f10701c, str);
            } else {
                Long l = next.f10703e;
                if (l != null) {
                    bundle.putLong(next.f10701c, l.longValue());
                } else {
                    Double d2 = next.h;
                    if (d2 != null) {
                        bundle.putDouble(next.f10701c, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object F(int i, Object obj, boolean z, boolean z2) {
        Bundle B;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return H(String.valueOf(obj), i, z);
            }
            if (!zzjw.b() || !l().t(zzaq.H0) || !l().t(zzaq.G0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (B = B((Bundle) parcelable)) != null && !B.isEmpty()) {
                    arrayList.add(B);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static boolean F0(String str) {
        for (String equals : h) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int G0(String str) {
        if (!g0("event param", str)) {
            return 3;
        }
        if (!l0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!f0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public static String H(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    private final int I0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!l0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!f0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    static MessageDigest J0() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    private static void K(Bundle bundle, int i, String str, String str2, Object obj) {
        if (t0(bundle, i)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                Preconditions.k(bundle);
                if (obj == null) {
                    return;
                }
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    @VisibleForTesting
    private static boolean L0(String str) {
        Preconditions.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int M0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!l().t(zzaq.l0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    private final void X(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        int i2;
        String str4;
        int i3;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean t = l().t(zzaq.I0);
            if (t) {
                i = 0;
            } else {
                i = l().A();
            }
            int i4 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i2 = z ? G0(str7) : 0;
                    if (i2 == 0) {
                        i2 = I0(str7);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    K(bundle2, i2, str7, str7, i2 == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (c0(bundle2.get(str7))) {
                        h().L().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i3 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i3 = v(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        K(bundle2, i3, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (d0(str4) && (!t || !k0(str4, zzgz.f10653d))) {
                        int i5 = i4 + 1;
                        if (i5 > i) {
                            if (t) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            h().I().c(str5, e().w(str6), e().u(bundle2));
                            t0(bundle2, t ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i4 = i5;
                    }
                }
            }
        }
    }

    static boolean Y(Context context, boolean z) {
        Preconditions.k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return s0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return s0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean a0(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean b0(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean c0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean d0(String str) {
        Preconditions.g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    static boolean j0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean k0(String str, String[] strArr) {
        Preconditions.k(strArr);
        for (String A0 : strArr) {
            if (A0(str, A0)) {
                return true;
            }
        }
        return false;
    }

    static boolean m0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle q0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> r0(List<zzw> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzw next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f10715b);
            bundle.putString("origin", next.f10716c);
            bundle.putLong("creation_timestamp", next.f10718e);
            bundle.putString("name", next.f10717d.f10701c);
            zzgx.b(bundle, next.f10717d.u());
            bundle.putBoolean("active", next.f10719f);
            String str = next.g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzao zzao = next.h;
            if (zzao != null) {
                bundle.putString("timed_out_event_name", zzao.f10563b);
                zzan zzan = next.h.f10564c;
                if (zzan != null) {
                    bundle.putBundle("timed_out_event_params", zzan.B());
                }
            }
            bundle.putLong("trigger_timeout", next.i);
            zzao zzao2 = next.j;
            if (zzao2 != null) {
                bundle.putString("triggered_event_name", zzao2.f10563b);
                zzan zzan2 = next.j.f10564c;
                if (zzan2 != null) {
                    bundle.putBundle("triggered_event_params", zzan2.B());
                }
            }
            bundle.putLong("triggered_timestamp", next.f10717d.f10702d);
            bundle.putLong("time_to_live", next.k);
            zzao zzao3 = next.l;
            if (zzao3 != null) {
                bundle.putString("expired_event_name", zzao3.f10563b);
                zzan zzan3 = next.l.f10564c;
                if (zzan3 != null) {
                    bundle.putBundle("expired_event_params", zzan3.B());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean s0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean t0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.c()
            boolean r2 = com.google.android.gms.internal.measurement.zzjw.b()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.zzy r2 = r17.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.I0
            boolean r2 = r2.t(r5)
            if (r2 == 0) goto L_0x007f
            boolean r2 = c0(r21)
            if (r2 == 0) goto L_0x008a
            if (r25 == 0) goto L_0x007c
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzgz.f10652c
            boolean r2 = k0(r8, r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            com.google.android.gms.measurement.internal.zzfy r2 = r7.f10357a
            com.google.android.gms.measurement.internal.zzir r2 = r2.P()
            boolean r2 = r2.d0()
            if (r2 != 0) goto L_0x0044
            r0 = 25
            return r0
        L_0x0044:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.v0(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0060
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0079
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0079
        L_0x0060:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0079
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0079:
            r10 = 17
            goto L_0x008b
        L_0x007c:
            r0 = 21
            return r0
        L_0x007f:
            if (r25 == 0) goto L_0x008a
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.v0(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x008a
            return r3
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.google.android.gms.measurement.internal.zzy r1 = r17.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.R
            r11 = r18
            boolean r1 = r1.C(r11, r2)
            if (r1 == 0) goto L_0x009f
            boolean r1 = C0(r19)
            if (r1 != 0) goto L_0x00a5
        L_0x009f:
            boolean r1 = C0(r20)
            if (r1 == 0) goto L_0x00a8
        L_0x00a5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00aa
        L_0x00a8:
            r1 = 100
        L_0x00aa:
            boolean r1 = r7.h0(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r10
        L_0x00b1:
            if (r25 == 0) goto L_0x0167
            boolean r1 = com.google.android.gms.internal.measurement.zzjw.b()
            r12 = 1
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.zzy r1 = r17.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.H0
            boolean r1 = r1.t(r2)
            if (r1 == 0) goto L_0x00c8
            r13 = 1
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
        L_0x00e1:
            r9 = 1
            goto L_0x0164
        L_0x00e4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0123
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00ed:
            if (r6 >= r15) goto L_0x00e1
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.zzeu r1 = r17.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.L()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x0164
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
            goto L_0x0120
        L_0x011e:
            r16 = r6
        L_0x0120:
            int r6 = r16 + 1
            goto L_0x00ed
        L_0x0123:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0164
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r15) goto L_0x00e1
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.zzeu r0 = r17.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.L()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.c(r2, r1, r8)
            goto L_0x0164
        L_0x014d:
            if (r13 == 0) goto L_0x0161
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
        L_0x0161:
            r0 = r16
            goto L_0x012f
        L_0x0164:
            if (r9 == 0) goto L_0x0167
            return r10
        L_0x0167:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkr.v(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    private final boolean v0(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            h().L().d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    public static long w(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    static Bundle[] w0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long y(zzan zzan) {
        long j = 0;
        if (zzan == null) {
            return 0;
        }
        Iterator<String> it = zzan.iterator();
        while (it.hasNext()) {
            Object A = zzan.A(it.next());
            if (A instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) A).length;
            }
        }
        return j;
    }

    @VisibleForTesting
    static long z(byte[] bArr) {
        Preconditions.k(bArr);
        int i = 0;
        Preconditions.n(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    @VisibleForTesting
    private final boolean z0(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e2 = Wrappers.a(context).e(str, 64);
            if (e2 == null || e2.signatures == null || e2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e3) {
            h().G().b("Error obtaining certificate", e3);
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            h().G().b("Package name not found", e4);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle A(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            h().J().b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle B(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object G = G(str, bundle.get(str));
                if (G == null) {
                    h().L().b("Param value can't be null", e().z(str));
                } else {
                    N(bundle2, str, G);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final boolean B0(String str) {
        c();
        if (Wrappers.a(f()).a(str) == 0) {
            return true;
        }
        h().N().b("Permission not granted", str);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle C(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            boolean r0 = com.google.android.gms.internal.measurement.zzjw.b()
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.measurement.internal.zzy r0 = r19.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.I0
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r14 = 1
            goto L_0x001e
        L_0x001d:
            r14 = 0
        L_0x001e:
            if (r14 == 0) goto L_0x0028
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzgw.f10647c
            boolean r0 = k0(r10, r0)
            r15 = r0
            goto L_0x002a
        L_0x0028:
            r15 = r25
        L_0x002a:
            r16 = 0
            if (r11 == 0) goto L_0x012c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            com.google.android.gms.measurement.internal.zzy r0 = r19.l()
            int r7 = r0.A()
            com.google.android.gms.measurement.internal.zzy r0 = r19.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.b0
            r6 = r20
            boolean r0 = r0.C(r6, r1)
            if (r0 == 0) goto L_0x0053
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0057
        L_0x0053:
            java.util.Set r0 = r22.keySet()
        L_0x0057:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x005d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r17.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r12 == 0) goto L_0x0075
            boolean r0 = r12.contains(r5)
            if (r0 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 0
            goto L_0x0083
        L_0x0075:
            if (r24 == 0) goto L_0x007c
            int r0 = r9.G0(r5)
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0083
            int r0 = r9.I0(r5)
        L_0x0083:
            if (r0 == 0) goto L_0x0095
            r1 = 3
            if (r0 != r1) goto L_0x008a
            r1 = r5
            goto L_0x008c
        L_0x008a:
            r1 = r16
        L_0x008c:
            K(r8, r0, r5, r5, r1)
            r8.remove(r5)
            r9 = r7
            r12 = r8
            goto L_0x00d4
        L_0x0095:
            java.lang.Object r4 = r11.get(r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r5
            r13 = r5
            r5 = r8
            r6 = r23
            r9 = r7
            r7 = r24
            r12 = r8
            r8 = r15
            int r0 = r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00b9
            r1 = 17
            if (r0 != r1) goto L_0x00b9
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            K(r12, r0, r13, r13, r1)
            goto L_0x00dd
        L_0x00b9:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00dd
            r1 = 21
            if (r0 != r1) goto L_0x00c9
            r5 = r10
            goto L_0x00ca
        L_0x00c9:
            r5 = r13
        L_0x00ca:
            java.lang.Object r1 = r11.get(r13)
            K(r12, r0, r5, r13, r1)
            r12.remove(r13)
        L_0x00d4:
            r6 = r20
        L_0x00d6:
            r7 = r9
            r8 = r12
            r9 = r19
            r12 = r23
            goto L_0x005d
        L_0x00dd:
            boolean r0 = d0(r13)
            if (r0 == 0) goto L_0x00d4
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x0126
            r1 = 48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Event can't contain more than "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = " params"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.measurement.internal.zzeu r2 = r19.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.I()
            com.google.android.gms.measurement.internal.zzes r3 = r19.e()
            java.lang.String r3 = r3.w(r10)
            com.google.android.gms.measurement.internal.zzes r4 = r19.e()
            java.lang.String r4 = r4.u(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            t0(r12, r1)
            r12.remove(r13)
            r6 = r20
            r18 = r0
            goto L_0x00d6
        L_0x0126:
            r18 = r0
            goto L_0x00d4
        L_0x0129:
            r12 = r8
            r16 = r12
        L_0x012c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkr.C(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String P = l().P();
        m();
        return P.equals(str);
    }

    /* access modifiers changed from: package-private */
    public final zzao E(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (o0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            return new zzao(str2, new zzan(B(C(str, str2, bundle3, CollectionUtils.c("_o"), false, false))), str3, j);
        }
        h().G().b("Invalid conditional property event name", e().A(str2));
        throw new IllegalArgumentException();
    }

    public final long E0() {
        long andIncrement;
        long j;
        if (this.f10706d.get() == 0) {
            synchronized (this.f10706d) {
                long nextLong = new Random(System.nanoTime() ^ n().a()).nextLong();
                int i = this.f10707e + 1;
                this.f10707e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f10706d) {
            this.f10706d.compareAndSet(-1, 1);
            andIncrement = this.f10706d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final Object G(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return F(256, obj, true, true);
        }
        if (!C0(str)) {
            i = 100;
        }
        return F(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom H0() {
        c();
        if (this.f10705c == null) {
            this.f10705c = new SecureRandom();
        }
        return this.f10705c;
    }

    public final URL I(long j, String str, String str2, long j2) {
        try {
            Preconditions.g(str2);
            Preconditions.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(K0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(l().Q())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            h().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final void J(int i, String str, String str2, int i2) {
        W((String) null, i, str, str2, i2);
    }

    public final int K0() {
        if (this.f10708f == null) {
            this.f10708f = Integer.valueOf(GoogleApiAvailabilityLight.h().b(f()) / 1000);
        }
        return this.f10708f.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void L(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            h().J().b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    j().N(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (zzjw.b() && l().t(zzaq.H0) && l().t(zzaq.G0) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                h().L().c("Not putting event parameter. Invalid value type. name, type", e().z(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String N0() {
        byte[] bArr = new byte[16];
        H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void O(zzw zzw, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning int value to wrapper", e2);
        }
    }

    public final boolean O0() {
        try {
            f().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void P(zzw zzw, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning long value to wrapper", e2);
        }
    }

    public final void Q(zzw zzw, Bundle bundle) {
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void R(zzw zzw, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning string value to wrapper", e2);
        }
    }

    public final void S(zzw zzw, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void T(zzw zzw, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void U(zzw zzw, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzw.E(bundle);
        } catch (RemoteException e2) {
            this.f10357a.h().J().b("Error returning byte array to wrapper", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(zzey zzey, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzey.f10599d.keySet())) {
            if (d0(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                h().I().c(sb.toString(), e().w(zzey.f10596a), e().u(zzey.f10599d));
                t0(zzey.f10599d, 5);
                zzey.f10599d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void W(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        t0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f10357a.m();
        this.f10357a.F().R("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean e0(String str, double d2) {
        try {
            SharedPreferences.Editor edit = f().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            h().G().b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f0(String str, int i, String str2) {
        if (str2 == null) {
            h().I().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            h().I().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g0(String str, String str2) {
        if (str2 == null) {
            h().I().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            h().I().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                h().I().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    h().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                h().L().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean i0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (L0(str)) {
                return true;
            }
            if (this.f10357a.J()) {
                h().I().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeu.x(str));
            }
            return false;
        } else if (zzlm.b() && l().t(zzaq.o0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f10357a.J()) {
                    h().I().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (L0(str2)) {
                return true;
            } else {
                h().I().b("Invalid admob_app_id. Analytics disabled.", zzeu.x(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean l0(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            h().I().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.k(str2);
        String[] strArr2 = g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            h().I().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !k0(str2, strArr)) {
            return true;
        } else {
            h().I().c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                h().J().a("Utils falling back to Random for random id");
            }
        }
        this.f10706d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final int o0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!l0("event", zzgw.f10645a, str)) {
            return 13;
        }
        if (!f0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int p0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = h0("user property referrer", str, M0(str), obj);
        } else {
            z = h0("user property", str, M0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return true;
    }

    public final int u(int i) {
        return GoogleApiAvailabilityLight.h().j(f(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    public final boolean u0(String str, String str2) {
        if (str2 == null) {
            h().I().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            h().I().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        h().I().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            h().I().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long x(Context context, String str) {
        c();
        Preconditions.k(context);
        Preconditions.g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest J0 = J0();
        if (J0 == null) {
            h().G().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!z0(context, str)) {
                    PackageInfo e2 = Wrappers.a(context).e(f().getPackageName(), 64);
                    if (e2.signatures != null && e2.signatures.length > 0) {
                        return z(J0.digest(e2.signatures[0].toByteArray()));
                    }
                    h().J().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                h().G().b("Package name not found", e3);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int x0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!l0("user property", zzgy.f10648a, str)) {
            return 15;
        }
        if (!f0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object y0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return F(M0(str), obj, true, false);
        }
        return F(M0(str), obj, false, false);
    }
}
