package androidx.core.content.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat */
public class c {

    /* compiled from: FontResourcesParserCompat */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final C0040c[] f1340a;

        public b(C0040c[] cVarArr) {
            this.f1340a = cVarArr;
        }

        public C0040c[] a() {
            return this.f1340a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c  reason: collision with other inner class name */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0040c {

        /* renamed from: a  reason: collision with root package name */
        private final String f1341a;

        /* renamed from: b  reason: collision with root package name */
        private int f1342b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1343c;

        /* renamed from: d  reason: collision with root package name */
        private String f1344d;

        /* renamed from: e  reason: collision with root package name */
        private int f1345e;

        /* renamed from: f  reason: collision with root package name */
        private int f1346f;

        public C0040c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1341a = str;
            this.f1342b = i;
            this.f1343c = z;
            this.f1344d = str2;
            this.f1345e = i2;
            this.f1346f = i3;
        }

        public String a() {
            return this.f1341a;
        }

        public int b() {
            return this.f1346f;
        }

        public int c() {
            return this.f1345e;
        }

        public String d() {
            return this.f1344d;
        }

        public int e() {
            return this.f1342b;
        }

        public boolean f() {
            return this.f1343c;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final a.h.h.a f1347a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1348b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1349c;

        public d(a.h.h.a aVar, int i, int i2) {
            this.f1347a = aVar;
            this.f1349c = i;
            this.f1348b = i2;
        }

        public int a() {
            return this.f1349c;
        }

        public a.h.h.a b() {
            return this.f1347a;
        }

        public int c() {
            return this.f1348b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.c.c.a b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.c.c$a r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.c.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.c.c$a");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.h.d.FontFamily);
        String string = obtainAttributes.getString(a.h.d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(a.h.d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(a.h.d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(a.h.d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(a.h.d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(a.h.d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0040c[]) arrayList.toArray(new C0040c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(new a.h.h.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
    }

    private static C0040c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.h.d.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(a.h.d.FontFamilyFont_fontWeight) ? a.h.d.FontFamilyFont_fontWeight : a.h.d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(a.h.d.FontFamilyFont_fontStyle) ? a.h.d.FontFamilyFont_fontStyle : a.h.d.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(a.h.d.FontFamilyFont_ttcIndex) ? a.h.d.FontFamilyFont_ttcIndex : a.h.d.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(a.h.d.FontFamilyFont_fontVariationSettings) ? a.h.d.FontFamilyFont_fontVariationSettings : a.h.d.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(a.h.d.FontFamilyFont_font) ? a.h.d.FontFamilyFont_font : a.h.d.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0040c(string2, i, z, string, i3, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
