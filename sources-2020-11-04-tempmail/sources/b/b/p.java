package b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class p {

    /* renamed from: a  reason: collision with root package name */
    private static char[] f2153a = {5961, 46707, 21798, 62661, 37779, 12616, 53362, 32629, 7924, 48528, 23382, 64010, 39204, 14577, 51105, 25949, 1025, 41859, 17094, 57762, 36704, 11796, 52694, 27779, 3007, 43371, 18483, 6130, 46725, 21575, 62335, 37412, 12781, 53391, '1', 54731, 'y', 41292, 16915, 58342, 34041, 9796, 51059, 26718, 2508, 43705, 19533, 60687, 36404, 12252, 53387, 29288, 4899, 46303, 'b', 41300, 16904, 58362, 33973, 9836, 50958, 26694, 2449, 43705, 19495, 60788, 36381, 12243, 53471, 29224, 4964, 46307, 21902, 63114, 38928, 14652, 55994, 31731, 7324, 48660, 24403, 241, 41470, 17201, 58375, 34138, 11125, 35407, 26906, 51449, 44975, 3444, 60494, 17225, 8915, 33210, 26408, 50705, 42249, 1233, 64390, 22890, 14390, 40936, 32483, 56730, 45918, 4652, 61949, 20658, 14238, 56093, 31271, 39282, 14481, 24519, 64796, 7206, 45857, 53948, 29120, 38684, 13919, 21879, 62636, 3048, 43266, 51202, 28586, 36515, 11773, 17195, 57930, 384, 47412, 6158, 64347, 23224, 15854, 40757, 32271, 53512, 45202, 5115, 62825, 21587, 14170, 38557, 27101, 52013, 43601, 3505, 60572, 20433, 'a', 41307, 16910, 58349, 33979, 9824, 51034, 26717, 2502, 43704, 19558, 60777, 36393, 12227, 53391, '.', '\\', 41243, 63425, 22271, 46519, 5205, 29521, 53707, 12538, 40950, 65143, 23835, 48073, 6792, 31166, 55400, '/', 41302, 16907, 58364, 33980, 9836, '.', 41247, 16965, 58307, 33959, 9763, 50966, 26717, 2434, 43764, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2541, 43685, 19569, 60706, 36364, 12229, 53391, 29300, 4926, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26631, 2503, 43773, 19573, 60706, 36360, 12177, 53381, 29306, 4915, 46317, 21983, 63183, 38996, 14648, 56058, 31659, 7384, 48730, 24331, 227, 41380, 17185, 58451, 34067, 9923, 51120, 27002, 2635, 43805, 19654, 60848, 36649, 12392, 4469, 45122, 21260, 62148, 38312, 14184, 54872, 30976, 6358, 48035, 23909, 64561, 40751, 16083, 49540, 25445, 555, 42484, 17609, 59273, 35167, 10276, 52210, 27298, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2554, 43704, 19572, 60715, 36377, 12242, 53394, 29278, 4904, 46310, 21983, 63135, 38992, 14640, 56033, 31661, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26650, 2502, 43691, 19581, 60716, 36377, 12177, 53396, 29310, 4918, 46313, 21983, 63116, 38992, 14652, 56042, 31715, 7317, 48712, 24342, 255, 41379, 17253, 58390, 34076, 9929, 51105, 26978, 2591, 43793, 19665, 60861, 36726, 12344, 53513, 29403, 5000, 46450, 22123, 63398};

    /* renamed from: b  reason: collision with root package name */
    private static long f2154b = 3950183758939332917L;

    /* renamed from: c  reason: collision with root package name */
    private static int f2155c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static int f2156d = 1;

    private static String a(Context context, String str) {
        boolean z;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(e(260, 24, 4370).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{0})).iterator();
            do {
                if (!(it.hasNext())) {
                    return Boolean.FALSE.toString();
                }
                int i = f2155c + 93;
                f2156d = i % 128;
                int i2 = i % 2;
                if (((ApplicationInfo) it.next()).packageName.equals(str)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } while (!z);
            int i3 = f2156d + 85;
            f2155c = i3 % 128;
            int i4 = i3 % 2;
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e2) {
            h0 m = h0.m();
            String intern = e(284, 24, 0).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(e(308, 47, 0).intern());
            sb.append(e2);
            m.h(intern, sb.toString());
        } catch (NoSuchMethodException e3) {
            h0 m2 = h0.m();
            String intern2 = e(284, 24, 0).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e(308, 47, 0).intern());
            sb2.append(e3);
            m2.h(intern2, sb2.toString());
        } catch (InvocationTargetException e4) {
            h0 m3 = h0.m();
            String intern3 = e(284, 24, 0).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e(308, 47, 0).intern());
            sb3.append(e4);
            m3.h(intern3, sb3.toString());
        }
    }

    private static String b(String str) {
        int i = f2155c + 9;
        f2156d = i % 128;
        if (i % 2 != 0) {
            if ((!str.contains(e(169, 1, 0).intern()) ? '#' : 'J') == '#') {
                return str;
            }
        } else if (!str.contains(e(8832, 1, 0).intern())) {
            return str;
        }
        String[] split = str.split(e(170, 2, 0).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i2 = length - 1;
        sb.append(split[i2]);
        sb.append(e(169, 1, 0).intern());
        int i3 = 1;
        while (true) {
            if ((i3 < i2 ? ',' : '_') != '_') {
                int i4 = f2156d + 87;
                f2155c = i4 % 128;
                int i5 = i4 % 2;
                sb.append(split[i3]);
                sb.append(e(169, 1, 0).intern());
                i3++;
            } else {
                sb.append(split[0]);
                return sb.toString();
            }
        }
    }

    private static String c(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = f2155c + 37;
        f2156d = i % 128;
        if ((i % 2 == 0 ? (char) 0 : 29) != 29) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        }
        String str = packageManager.getPackageInfo(packageName, 0).packageName;
        int i2 = f2156d + 77;
        f2155c = i2 % 128;
        if ((i2 % 2 != 0 ? '-' : 'X') != '-') {
            return str;
        }
        int i3 = 0 / 0;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0111, code lost:
        if ((h(e(87, 65, 11028).intern()) ? 24 : 'E') != 'E') goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0127, code lost:
        if (h(e(86, 25, 11028).intern()) != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012e, code lost:
        r12 = e(35, 1, 54779);
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String d(android.content.Context r12, long r13) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 5928(0x1728, float:8.307E-42)
            r4 = 0
            r5 = 34
            java.lang.String r3 = e(r4, r5, r3)
            java.lang.String r3 = r3.intern()
            boolean r3 = h(r3)
            r6 = 54779(0xd5fb, float:7.6762E-41)
            r7 = 35
            r8 = 1
            if (r3 == 0) goto L_0x0031
            java.lang.String r3 = e(r5, r8, r4)
        L_0x002c:
            java.lang.String r3 = r3.intern()
            goto L_0x0036
        L_0x0031:
            java.lang.String r3 = e(r7, r8, r6)
            goto L_0x002c
        L_0x0036:
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = r12.getPackageName()
            java.lang.String r10 = b(r9)
            java.lang.String r11 = e(r5, r8, r4)
            java.lang.String r11 = r11.intern()
            r1.append(r11)
            r3.append(r10)
            java.lang.String r10 = f(r12)
            if (r10 != 0) goto L_0x0069
            java.lang.String r10 = e(r7, r8, r6)
            java.lang.String r10 = r10.intern()
            r1.append(r10)
            r3.append(r9)
            goto L_0x0077
        L_0x0069:
            java.lang.String r10 = e(r5, r8, r4)
            java.lang.String r10 = r10.intern()
            r1.append(r10)
            r3.append(r9)
        L_0x0077:
            java.lang.String r10 = c(r12)
            if (r10 != 0) goto L_0x008c
            java.lang.String r10 = e(r7, r8, r6)
            java.lang.String r10 = r10.intern()
            r1.append(r10)
            r3.append(r9)
            goto L_0x009a
        L_0x008c:
            java.lang.String r11 = e(r5, r8, r4)
            java.lang.String r11 = r11.intern()
            r1.append(r11)
            r3.append(r10)
        L_0x009a:
            java.lang.String r9 = a(r12, r9)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0237 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x0237 }
            android.content.pm.PackageInfo r12 = r3.getPackageInfo(r12, r4)     // Catch:{ NameNotFoundException -> 0x0237 }
            long r9 = r12.firstInstallTime     // Catch:{ NameNotFoundException -> 0x0237 }
            r12 = 36
            r3 = 18
            java.lang.String r12 = e(r12, r3, r4)     // Catch:{ NameNotFoundException -> 0x0237 }
            java.lang.String r12 = r12.intern()     // Catch:{ NameNotFoundException -> 0x0237 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ NameNotFoundException -> 0x0237 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0237 }
            r3.<init>(r12, r11)     // Catch:{ NameNotFoundException -> 0x0237 }
            java.lang.String r12 = "UTC"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r12)     // Catch:{ NameNotFoundException -> 0x0237 }
            r3.setTimeZone(r12)     // Catch:{ NameNotFoundException -> 0x0237 }
            java.util.Date r12 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x0237 }
            r12.<init>(r9)     // Catch:{ NameNotFoundException -> 0x0237 }
            java.lang.String r12 = r3.format(r12)     // Catch:{ NameNotFoundException -> 0x0237 }
            r0.append(r12)     // Catch:{ NameNotFoundException -> 0x0237 }
            int r12 = f2156d
            int r12 = r12 + 61
            int r3 = r12 % 128
            f2155c = r3
            r3 = 2
            int r12 = r12 % r3
            r9 = 85
            if (r12 == 0) goto L_0x00ef
            r12 = 13
            goto L_0x00f1
        L_0x00ef:
            r12 = 85
        L_0x00f1:
            r10 = 11028(0x2b14, float:1.5454E-41)
            r11 = 87
            if (r12 == r9) goto L_0x0114
            r0.append(r13)
            r12 = 65
            java.lang.String r12 = e(r11, r12, r10)
            java.lang.String r12 = r12.intern()
            boolean r12 = h(r12)
            r9 = 69
            if (r12 == 0) goto L_0x010f
            r12 = 24
            goto L_0x0111
        L_0x010f:
            r12 = 69
        L_0x0111:
            if (r12 == r9) goto L_0x012e
            goto L_0x0129
        L_0x0114:
            r0.append(r13)
            r12 = 86
            r9 = 25
            java.lang.String r12 = e(r12, r9, r10)
            java.lang.String r12 = r12.intern()
            boolean r12 = h(r12)
            if (r12 == 0) goto L_0x012e
        L_0x0129:
            java.lang.String r12 = e(r5, r8, r4)
            goto L_0x0132
        L_0x012e:
            java.lang.String r12 = e(r7, r8, r6)
        L_0x0132:
            java.lang.String r12 = r12.intern()
            r2.append(r12)
            r12 = 111(0x6f, float:1.56E-43)
            r9 = 23
            r10 = 56188(0xdb7c, float:7.8736E-41)
            java.lang.String r12 = e(r12, r9, r10)
            java.lang.String r12 = r12.intern()
            boolean r12 = h(r12)
            if (r12 == 0) goto L_0x0157
            java.lang.String r12 = e(r5, r8, r4)
            java.lang.String r12 = r12.intern()
            goto L_0x0167
        L_0x0157:
            java.lang.String r12 = e(r7, r8, r6)
            java.lang.String r12 = r12.intern()
            int r9 = f2156d
            int r9 = r9 + r11
            int r10 = r9 % 128
            f2155c = r10
            int r9 = r9 % r3
        L_0x0167:
            r2.append(r12)
            r12 = 134(0x86, float:1.88E-43)
            r9 = 20
            r10 = 47445(0xb955, float:6.6485E-41)
            java.lang.String r12 = e(r12, r9, r10)
            java.lang.String r12 = r12.intern()
            boolean r12 = h(r12)
            if (r12 == 0) goto L_0x019a
            int r12 = f2156d
            int r12 = r12 + 107
            int r9 = r12 % 128
            f2155c = r9
            int r12 = r12 % r3
            if (r12 == 0) goto L_0x0195
            r12 = 72
            java.lang.String r12 = e(r12, r4, r4)
            java.lang.String r12 = r12.intern()
            goto L_0x01a2
        L_0x0195:
            java.lang.String r12 = e(r5, r8, r4)
            goto L_0x019e
        L_0x019a:
            java.lang.String r12 = e(r7, r8, r6)
        L_0x019e:
            java.lang.String r12 = r12.intern()
        L_0x01a2:
            r2.append(r12)
            r12 = 154(0x9a, float:2.16E-43)
            r9 = 15
            java.lang.String r12 = e(r12, r9, r4)
            java.lang.String r12 = r12.intern()
            boolean r12 = h(r12)
            if (r12 == 0) goto L_0x01d9
            int r12 = f2156d
            int r12 = r12 + 107
            int r6 = r12 % 128
            f2155c = r6
            int r12 = r12 % r3
            r6 = 29
            if (r12 == 0) goto L_0x01c5
            goto L_0x01c7
        L_0x01c5:
            r11 = 29
        L_0x01c7:
            if (r11 == r6) goto L_0x01d4
            r12 = 122(0x7a, float:1.71E-43)
            java.lang.String r12 = e(r12, r8, r4)
            java.lang.String r12 = r12.intern()
            goto L_0x01e1
        L_0x01d4:
            java.lang.String r12 = e(r5, r8, r4)
            goto L_0x01dd
        L_0x01d9:
            java.lang.String r12 = e(r7, r8, r6)
        L_0x01dd:
            java.lang.String r12 = r12.intern()
        L_0x01e1:
            r2.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r12 = b.b.e0.c(r12)
            java.lang.String r12 = b.b.e0.d(r12)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            r12 = 17
            int r0 = java.lang.Integer.parseInt(r0, r3)
            r5 = 16
            java.lang.String r0 = java.lang.Integer.toString(r0, r5)
            char r0 = r0.charAt(r4)
            r1.setCharAt(r12, r0)
            java.lang.String r12 = r1.toString()
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            r12 = 27
            int r0 = java.lang.Integer.parseInt(r0, r3)
            java.lang.String r0 = java.lang.Integer.toString(r0, r5)
            char r0 = r0.charAt(r4)
            r1.setCharAt(r12, r0)
            java.lang.String r12 = r1.toString()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.String r12 = g(r12, r13)
            return r12
        L_0x0237:
            r12 = 54
            r13 = 32
            java.lang.String r12 = e(r12, r13, r4)
            java.lang.String r12 = r12.intern()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.p.d(android.content.Context, long):java.lang.String");
    }

    private static String e(int i, int i2, char c2) {
        int i3 = f2155c + 103;
        f2156d = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (!(i5 < i2)) {
                return new String(cArr);
            }
            int i6 = f2155c + 61;
            f2156d = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((int) ((((long) f2153a[i + i5]) ^ (((long) i5) * f2154b)) ^ ((long) c2)));
            i5++;
        }
    }

    private static String f(Context context) {
        int i = f2156d + 23;
        f2155c = i % 128;
        int i2 = i % 2;
        if (!System.getProperties().containsKey(e(172, 14, 63403).intern())) {
            return null;
        }
        int i3 = f2156d + 89;
        f2155c = i3 % 128;
        int i4 = i3 % 2;
        try {
            Matcher matcher = Pattern.compile(e(192, 10, 0).intern()).matcher(context.getCacheDir().getPath().replace(e(186, 6, 0).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            int i5 = f2155c + 15;
            f2156d = i5 % 128;
            return i5 % 2 == 0 ? matcher.group(0) : matcher.group(1);
        } catch (Exception e2) {
            h0 m = h0.m();
            String intern = e(202, 17, 0).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(e(219, 41, 0).intern());
            sb.append(e2);
            m.h(intern, sb.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((r8 != null ? '3' : '<') != '3') goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r8 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String g(java.lang.String r7, java.lang.Long r8) {
        /*
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 1
        L_0x0007:
            r3 = 32
            if (r2 == 0) goto L_0x000d
            goto L_0x00ea
        L_0x000d:
            int r2 = f2155c
            int r2 = r2 + 45
            int r4 = r2 % 128
            f2156d = r4
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0028
            r2 = 0
            int r2 = r2.length
            r2 = 51
            if (r8 == 0) goto L_0x0022
            r4 = 51
            goto L_0x0024
        L_0x0022:
            r4 = 60
        L_0x0024:
            if (r4 == r2) goto L_0x002a
            goto L_0x00ea
        L_0x0028:
            if (r8 == 0) goto L_0x00ea
        L_0x002a:
            int r2 = r7.length()
            if (r2 != r3) goto L_0x00ea
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r7 = r8.toString()
            r3 = 0
            r8 = 0
            r5 = 0
        L_0x003d:
            int r6 = r7.length()
            if (r8 >= r6) goto L_0x0045
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == r1) goto L_0x0054
            char r6 = r7.charAt(r8)
            int r6 = java.lang.Character.getNumericValue(r6)
            int r5 = r5 + r6
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0054:
            java.lang.String r7 = java.lang.Integer.toHexString(r5)
            int r8 = r7.length()
            r5 = 7
            int r8 = r8 + r5
            r2.replace(r5, r8, r7)
            int r7 = f2155c
            int r7 = r7 + 77
            int r8 = r7 % 128
            f2156d = r8
            int r7 = r7 % 2
        L_0x006b:
            int r7 = r2.length()
            r8 = 35
            if (r0 >= r7) goto L_0x0098
            int r7 = f2156d
            int r7 = r7 + r8
            int r8 = r7 % 128
            f2155c = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x008b
            char r7 = r2.charAt(r0)
            int r7 = java.lang.Character.getNumericValue(r7)
            long r7 = (long) r7
            long r3 = r3 - r7
            int r0 = r0 + 29
            goto L_0x006b
        L_0x008b:
            char r7 = r2.charAt(r0)
            int r7 = java.lang.Character.getNumericValue(r7)
            long r7 = (long) r7
            long r3 = r3 + r7
            int r0 = r0 + 1
            goto L_0x006b
        L_0x0098:
            r5 = 100
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00af
            int r7 = f2156d
            int r7 = r7 + 89
            int r0 = r7 % 128
            f2155c = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x00ad
            long r3 = r3 * r5
            goto L_0x0098
        L_0x00ad:
            long r3 = r3 % r5
            goto L_0x0098
        L_0x00af:
            int r7 = (int) r3
            r0 = 23
            r2.insert(r0, r7)
            r5 = 10
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e5
            int r7 = f2156d
            int r7 = r7 + 15
            int r3 = r7 % 128
            f2155c = r3
            int r7 = r7 % 2
            r3 = 54779(0xd5fb, float:7.6762E-41)
            if (r7 == 0) goto L_0x00da
            r7 = 101(0x65, float:1.42E-43)
            r8 = 36
            java.lang.String r8 = e(r8, r1, r3)
            java.lang.String r8 = r8.intern()
            r2.insert(r7, r8)
            goto L_0x00e5
        L_0x00da:
            java.lang.String r7 = e(r8, r1, r3)
            java.lang.String r7 = r7.intern()
            r2.insert(r0, r7)
        L_0x00e5:
            java.lang.String r7 = r2.toString()
            return r7
        L_0x00ea:
            r7 = 54
            java.lang.String r7 = e(r7, r3, r0)
            java.lang.String r7 = r7.intern()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.p.g(java.lang.String, java.lang.Long):java.lang.String");
    }

    private static boolean h(String str) {
        int i = f2155c + 121;
        f2156d = i % 128;
        if (i % 2 == 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static class a extends HashMap<String, Object> {

        /* renamed from: d  reason: collision with root package name */
        private static char[] f2157d = {'a', 26975, 53805, 15327, 42125, 3696, 30515, 57596, 18876, 45920, 7255, 34051, 18161, 12248, 38016, 32086, 57875, 24432, 13896, 36115, 25815, 64392, 20834, 10278, 49141, 'k', 26972, 53780, 33572, 59930, 20825, 47237, 10179, 36155, 62516, 25514, 51951, 12333, 40733, 1603, 28047, 54483, 16949, 43387, 4277, 32683, 58667, 19484, 47952, 8911, 35279, 63288, 24163, 50675, 11519, 39464, 266, 26719, 55244, 16064, 42010, 4984, 31413, 57849, 20274, 46614, 7515, 33923, 62352, 22851, 'k', 26972, 53780, 15250, 42205, 3620, 30575, 'f', 26960, 53760, 15320, 42128, 3665, 30519, 57594, 18854, 45922, 7250, 34103, 61133, 22417, 49531, '4', 26903, 53835, 15237, 42196, '-', 26955, 53777, 15237, 42190, 'f', 26968, 53787, 15303, 42113, 3705, 30582, 57576, 18861, 45935, 7263, 34049, 61133, 22417, 49527, 10809, 37879, 64745, 26217, 53086, 14354, 41357, 2704, 29822, 56628, 18148, 44975, 6435, 33355, 60188, 21722, 48527, 9984, 36924, 63978, 25256, 52321, 13645, 40450, 1990, 28807, 55887, 17248, 44211, 'b', 26968, 53776, 15310, 42117, 3704, 30566, 57530, 18940, 45873, 7262, 34122, 61085, 22403, 49452, 10855, 37793, 64753, 10529, 16407, 64342, 4761, 36299, 10036, 24178, 51681, 24801, 39471, 13582, 44118, 51074, 32465, 59504, 886, 47795, 54781, 20267, 58900, 4442, 35011, 9188, 23838, 62540, 28549, 34511, 12305, 43813, 49770, 32173, 38127, 3617, 47447, 53397, 19406, 58624, 't', 26972, 53791, 15323, 42113, 3695, 30519, 57595, 18877, 45939, 7263, 'x', 26881, 53828, 33253, 59594, 21386, 47694, 9501, 36857, 10693, '&', 26945, 7278, 29954, '&', 26953, 17019, 11028, 36894, 31110, 59016, 19505, 13627, 41635, 2981, 61742, 24085, 50957, 44249, 5516, 33634, 26663};

        /* renamed from: e  reason: collision with root package name */
        private static long f2158e = -7481529154018449095L;

        /* renamed from: f  reason: collision with root package name */
        private static int f2159f = 0;
        private static int g = 1;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f2160b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f2161c;

        a(Map<String, Object> map, Context context) {
            this.f2160b = map;
            this.f2161c = context;
            put(c(), b());
        }

        private String b() {
            String str;
            int i;
            try {
                String obj = this.f2160b.get(e(0, 12, 0).intern()).toString();
                String obj2 = this.f2160b.get(e(77, 15, 0).intern()).toString();
                String replaceAll = e(92, 5, 0).intern().replaceAll(e(97, 5, 0).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String c2 = e0.c(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(c2.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e(102, 44, 0).intern());
                sb3.append(e2);
                e.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(e(146, 18, 0).intern());
                str = sb4.toString();
            }
            try {
                Intent registerReceiver = this.f2161c.registerReceiver((BroadcastReceiver) null, new IntentFilter(e(164, 37, 10560).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    i2 = registerReceiver.getIntExtra(e(201, 11, 0).intern(), -2700);
                }
                if (!(this.f2161c.getApplicationInfo().nativeLibraryDir.contains(e(212, 3, 0).intern()))) {
                    int i3 = g + 53;
                    f2159f = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = g + 75;
                    f2159f = i5 % 128;
                    if ((i5 % 2 != 0 ? 'N' : 29) != 'N') {
                        i = 1;
                        int size = ((SensorManager) this.f2161c.getSystemService(e(215, 6, 33174).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(e(221, 1, 10663).intern());
                        sb5.append(i2);
                        sb5.append(e(222, 2, 0).intern());
                        sb5.append(i);
                        sb5.append(e(224, 2, 7240).intern());
                        sb5.append(size);
                        sb5.append(e(226, 2, 0).intern());
                        sb5.append(this.f2160b.size());
                        String obj3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(C0059a.d(obj3));
                        return sb6.toString();
                    }
                }
                i = 0;
                int size2 = ((SensorManager) this.f2161c.getSystemService(e(215, 6, 33174).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                sb52.append(e(221, 1, 10663).intern());
                sb52.append(i2);
                sb52.append(e(222, 2, 0).intern());
                sb52.append(i);
                sb52.append(e(224, 2, 7240).intern());
                sb52.append(size2);
                sb52.append(e(226, 2, 0).intern());
                sb52.append(this.f2160b.size());
                String obj32 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str);
                sb62.append(C0059a.d(obj32));
                return sb62.toString();
            } catch (Exception e3) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(e(102, 44, 0).intern());
                sb7.append(e3);
                e.e(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(e(228, 16, 16925).intern());
                return sb8.toString();
            }
        }

        private String c() {
            int i = g + 89;
            f2159f = i % 128;
            int i2 = i % 2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.f2160b.get(e(0, 12, 0).intern()).toString();
                String obj2 = this.f2160b.get(e(12, 5, 18067).intern()).toString();
                if ((obj2 == null ? '6' : 21) != 21) {
                    int i3 = f2159f + 17;
                    g = i3 % 128;
                    obj2 = (!(i3 % 2 == 0) ? e(17, 8, 24382) : e(40, 36, 24382)).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder d2 = d(num, obj2, sb.toString());
                int length = d2.length();
                if (!(length <= 4)) {
                    d2.delete(4, length);
                } else {
                    while (length < 4) {
                        int i4 = g + 13;
                        f2159f = i4 % 128;
                        int i5 = i4 % 2;
                        length++;
                        d2.append('1');
                    }
                }
                d2.insert(0, e(25, 3, 0).intern());
                return d2.toString();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e(28, 42, 33602).intern());
                sb2.append(e2);
                e.e(sb2.toString());
                return e(70, 7, 0).intern();
            }
        }

        private static StringBuilder d(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if ((i < 3 ? 18 : '^') == '^') {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i2 = f2159f + 15;
            g = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (true) {
                if ((i4 < intValue ? 'E' : '9') != 'E') {
                    return sb;
                }
                Integer num = null;
                Integer num2 = num;
                for (int i5 = 0; i5 < 3; i5++) {
                    char charAt = strArr[i5].charAt(i4);
                    if (num2 == null) {
                        int i6 = g + 15;
                        f2159f = i6 % 128;
                        if (i6 % 2 != 0) {
                            super.hashCode();
                        }
                    } else {
                        charAt ^= num2.intValue();
                    }
                    num2 = Integer.valueOf(charAt);
                }
                sb.append(Integer.toHexString(num2.intValue()));
                i4++;
                int i7 = g + 67;
                f2159f = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        private static String e(int i, int i2, char c2) {
            char[] cArr = new char[i2];
            int i3 = 0;
            int i4 = f2159f + 95;
            g = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if ((i3 < i2 ? '2' : 11) == 11) {
                    return new String(cArr);
                }
                int i6 = g + 95;
                f2159f = i6 % 128;
                int i7 = i6 % 2;
                cArr[i3] = (char) ((int) ((((long) f2157d[i + i3]) ^ (((long) i3) * f2158e)) ^ ((long) c2)));
                i3++;
            }
        }

        /* renamed from: b.b.p$a$a  reason: collision with other inner class name */
        static class C0059a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f2162a;

            /* renamed from: b  reason: collision with root package name */
            private long f2163b;

            /* renamed from: c  reason: collision with root package name */
            private String f2164c;

            C0059a(long j, String str) {
                this.f2162a = new Object();
                this.f2163b = 0;
                this.f2164c = "";
                this.f2163b = j;
                this.f2164c = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
                return false;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean b(long r9, java.lang.String r11) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f2162a
                    monitor-enter(r0)
                    r1 = 0
                    if (r11 == 0) goto L_0x0027
                    java.lang.String r2 = r8.f2164c     // Catch:{ all -> 0x0024 }
                    boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0024 }
                    if (r2 != 0) goto L_0x0027
                    long r2 = r8.f2163b     // Catch:{ all -> 0x0024 }
                    long r2 = r9 - r2
                    r4 = 2000(0x7d0, double:9.88E-321)
                    r6 = 1
                    int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x001b
                    r2 = 1
                    goto L_0x001c
                L_0x001b:
                    r2 = 0
                L_0x001c:
                    if (r2 == 0) goto L_0x0027
                    r8.f2163b = r9     // Catch:{ all -> 0x0024 }
                    r8.f2164c = r11     // Catch:{ all -> 0x0024 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    return r6
                L_0x0024:
                    r9 = move-exception
                    monitor-exit(r0)
                    throw r9
                L_0x0027:
                    monitor-exit(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: b.b.p.a.C0059a.b(long, java.lang.String):boolean");
            }

            static C0059a c(String str) {
                if (str == null) {
                    return new C0059a(0, "");
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new C0059a(0, "");
                }
                return new C0059a(Long.parseLong(split[0]), split[1]);
            }

            static String d(String str) throws Exception {
                byte[] bytes = str.getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ ((i % 2) + 42));
                }
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bytes) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(String.valueOf(hexString2));
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            /* access modifiers changed from: package-private */
            public final String a() {
                return this.f2164c;
            }

            /* access modifiers changed from: package-private */
            public final boolean e(C0059a aVar) {
                return b(aVar.f2163b, aVar.f2164c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2163b);
                sb.append(",");
                sb.append(this.f2164c);
                return sb.toString();
            }

            C0059a(String str) {
                this(System.currentTimeMillis(), str);
            }
        }
    }
}
