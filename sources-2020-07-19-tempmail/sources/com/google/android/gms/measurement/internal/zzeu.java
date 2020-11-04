package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzeu extends s4 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f10402c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f10403d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f10404e;

    /* renamed from: f  reason: collision with root package name */
    private final zzew f10405f = new zzew(this, 6, false, false);
    private final zzew g = new zzew(this, 6, true, false);
    private final zzew h = new zzew(this, 6, false, true);
    private final zzew i = new zzew(this, 5, false, false);
    private final zzew j = new zzew(this, 5, true, false);
    private final zzew k = new zzew(this, 5, false, true);
    private final zzew l = new zzew(this, 4, false, false);
    private final zzew m = new zzew(this, 3, false, false);
    private final zzew n = new zzew(this, 2, false, false);

    zzeu(zzfy zzfy) {
        super(zzfy);
    }

    @VisibleForTesting
    private final String D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f10404e == null) {
                if (this.f10171a.M() != null) {
                    str2 = this.f10171a.M();
                } else {
                    l().m();
                    str2 = "FA";
                }
                this.f10404e = str2;
            }
            str = this.f10404e;
        }
        return str;
    }

    private static String F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new j3(str);
    }

    @VisibleForTesting
    private static String y(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String F = F(zzfy.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && F(className).equals(F)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof j3) {
                return ((j3) obj).f10069a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String y = y(z, obj);
        String y2 = y(z, obj2);
        String y3 = y(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(y)) {
            sb.append(str2);
            sb.append(y);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(y2)) {
            sb.append(str2);
            sb.append(y2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(y3)) {
            sb.append(str3);
            sb.append(y3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void A(int i2, String str) {
        Log.println(i2, D(), str);
    }

    /* access modifiers changed from: protected */
    public final void B(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && C(i2)) {
            A(i2, z(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            Preconditions.k(str);
            zzfv E = this.f10171a.E();
            if (E == null) {
                A(6, "Scheduler not set. Not logging error/warn");
            } else if (!E.t()) {
                A(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                E.z(new i3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final boolean C(int i2) {
        return Log.isLoggable(D(), i2);
    }

    public final zzew G() {
        return this.f10405f;
    }

    public final zzew H() {
        return this.g;
    }

    public final zzew I() {
        return this.h;
    }

    public final zzew J() {
        return this.i;
    }

    public final zzew K() {
        return this.j;
    }

    public final zzew L() {
        return this.k;
    }

    public final zzew M() {
        return this.l;
    }

    public final zzew N() {
        return this.m;
    }

    public final zzew O() {
        return this.n;
    }

    public final String P() {
        Pair<String, Long> a2 = k().f10188d.a();
        if (a2 == null || a2 == q3.D) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        String str = (String) a2.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }
}
