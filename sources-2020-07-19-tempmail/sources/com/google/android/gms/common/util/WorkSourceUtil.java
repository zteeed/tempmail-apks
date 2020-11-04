package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f3126a = l();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f3127b = m();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f3128c = n();

    /* renamed from: d  reason: collision with root package name */
    private static final Method f3129d = i();

    static {
        Process.myUid();
        h();
        j();
        k();
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static WorkSource a(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c2 = Wrappers.a(context).c(str, 0);
                if (c2 != null) {
                    return e(c2.uid, str);
                }
                String valueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(valueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf2.length() != 0 ? "Could not find package: ".concat(valueOf2) : new String("Could not find package: "));
            }
        }
        return null;
    }

    @KeepForSdk
    public static List<String> b(WorkSource workSource) {
        int d2 = workSource == null ? 0 : d(workSource);
        if (d2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d2; i++) {
            String f2 = f(workSource, i);
            if (!Strings.a(f2)) {
                arrayList.add(f2);
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean c(Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    private static int d(WorkSource workSource) {
        Method method = f3128c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    private static WorkSource e(int i, String str) {
        WorkSource workSource = new WorkSource();
        g(workSource, i, str);
        return workSource;
    }

    private static String f(WorkSource workSource, int i) {
        Method method = f3129d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    private static void g(WorkSource workSource, int i, String str) {
        if (f3127b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f3127b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        } else {
            Method method = f3126a;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e3) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                }
            }
        }
    }

    private static Method h() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method i() {
        if (PlatformVersion.e()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method j() {
        if (PlatformVersion.l()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method k() {
        if (PlatformVersion.l()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        return null;
    }

    private static Method l() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method m() {
        if (PlatformVersion.e()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method n() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
