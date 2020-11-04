package com.tempmail.utils;

import android.text.TextUtils;
import com.tempmail.db.DaoMaster;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.g.f;

/* compiled from: MigrationHelper */
public class n extends DaoMaster.OpenHelper {
    static {
        Class<n> cls = n.class;
    }

    private static void a(f fVar, boolean z, Class<? extends a<?, ?>>... clsArr) {
        k(fVar, "createTable", z, clsArr);
    }

    private static void b(f fVar, boolean z, Class<? extends a<?, ?>>... clsArr) {
        k(fVar, "dropTable", z, clsArr);
    }

    private static void d(f fVar, Class<? extends a<?, ?>>... clsArr) {
        k(fVar, "createTable", true, clsArr);
    }

    private static void e(f fVar, Class<? extends a<?, ?>>... clsArr) {
        for (Class<? extends a<?, ?>> aVar : clsArr) {
            String str = new org.greenrobot.greendao.i.a(fVar, aVar).f15093c;
            fVar.b("CREATE TEMP TABLE " + str.concat("_TEMP") + " AS SELECT * FROM " + str + ";");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> f(org.greenrobot.greendao.g.f r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r1.<init>()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "SELECT * FROM "
            r1.append(r2)     // Catch:{ Exception -> 0x0041 }
            r1.append(r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = " limit 0"
            r1.append(r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            android.database.Cursor r3 = r3.f(r4, r0)     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x0032
            int r4 = r3.getColumnCount()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            if (r4 <= 0) goto L_0x0032
            java.lang.String[] r4 = r3.getColumnNames()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            java.util.List r0 = java.util.Arrays.asList(r4)     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r4 = move-exception
            r0 = r3
            goto L_0x0050
        L_0x002f:
            r4 = move-exception
            r0 = r3
            goto L_0x0042
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r3.close()
        L_0x0037:
            if (r0 != 0) goto L_0x004f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x004f
        L_0x003f:
            r4 = move-exception
            goto L_0x0050
        L_0x0041:
            r4 = move-exception
        L_0x0042:
            r4.printStackTrace()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x004a
            r0.close()
        L_0x004a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x004f:
            return r0
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()
        L_0x0055:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.utils.n.f(org.greenrobot.greendao.g.f, java.lang.String):java.util.List");
    }

    public static void g(f fVar, Class<? extends a<?, ?>>... clsArr) {
        d(fVar, clsArr);
        e(fVar, clsArr);
        b(fVar, true, clsArr);
        a(fVar, false, clsArr);
        m(fVar, clsArr);
    }

    public static void h(f fVar, Class<? extends a<?, ?>>... clsArr) {
        b(fVar, true, clsArr);
        a(fVar, false, clsArr);
    }

    private static void k(f fVar, String str, boolean z, Class<? extends a<?, ?>>... clsArr) {
        if (clsArr.length >= 1) {
            try {
                for (Class<? extends a<?, ?>> declaredMethod : clsArr) {
                    declaredMethod.getDeclaredMethod(str, new Class[]{org.greenrobot.greendao.g.a.class, Boolean.TYPE}).invoke((Object) null, new Object[]{fVar, Boolean.valueOf(z)});
                }
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            }
        }
    }

    private static void m(f fVar, Class<? extends a<?, ?>>... clsArr) {
        for (Class<? extends a<?, ?>> aVar : clsArr) {
            org.greenrobot.greendao.i.a aVar2 = new org.greenrobot.greendao.i.a(fVar, aVar);
            String str = aVar2.f15093c;
            String concat = str.concat("_TEMP");
            List<String> f2 = f(fVar, concat);
            ArrayList arrayList = new ArrayList(f2.size());
            int i = 0;
            while (true) {
                org.greenrobot.greendao.f[] fVarArr = aVar2.f15094d;
                if (i >= fVarArr.length) {
                    break;
                }
                String str2 = fVarArr[i].f15079e;
                if (f2.contains(str2)) {
                    arrayList.add(str2);
                }
                i++;
            }
            if (arrayList.size() > 0) {
                String join = TextUtils.join(",", arrayList);
                fVar.b("INSERT INTO " + str + " (" + join + ") SELECT " + join + " FROM " + concat + ";");
            }
            fVar.b("DROP TABLE " + concat);
        }
    }
}
