package androidx.core.content.c;

import a.h.j.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* compiled from: ResourcesCompat */
public final class f {

    /* compiled from: ResourcesCompat */
    public static abstract class a {

        /* renamed from: androidx.core.content.c.f$a$a  reason: collision with other inner class name */
        /* compiled from: ResourcesCompat */
        class C0041a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Typeface f1325b;

            C0041a(Typeface typeface) {
                this.f1325b = typeface;
            }

            public void run() {
                a.this.d(this.f1325b);
            }
        }

        /* compiled from: ResourcesCompat */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1327b;

            b(int i) {
                this.f1327b = i;
            }

            public void run() {
                a.this.c(this.f1327b);
            }
        }

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0041a(typeface));
        }

        public abstract void c(int i);

        public abstract void d(Typeface typeface);
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Typeface b(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, new TypedValue(), 0, (a) null, (Handler) null, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    public static void d(Context context, int i, a aVar, Handler handler) throws Resources.NotFoundException {
        h.b(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
            return;
        }
        e(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    private static Typeface e(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface f2 = f(context, resources, typedValue, i, i2, aVar, handler, z);
        if (f2 != null || aVar != null) {
            return f2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.c.f.a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a7
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = a.h.e.c.e(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            androidx.core.content.c.c$a r2 = androidx.core.content.c.c.b(r1, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = a.h.e.c.b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = a.h.e.c.c(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.b(r0, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a1
        L_0x008c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a1:
            if (r9 == 0) goto L_0x00a6
            r9.a(r14, r10)
        L_0x00a6:
            return r13
        L_0x00a7:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.f.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
