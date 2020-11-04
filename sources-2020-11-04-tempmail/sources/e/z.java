package e;

import e.m0.e;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okio.Buffer;

/* compiled from: HttpUrl */
public final class z {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f14787a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14788b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14789c;

    /* renamed from: d  reason: collision with root package name */
    final String f14790d;

    /* renamed from: e  reason: collision with root package name */
    final int f14791e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f14792f;
    @Nullable
    private final List<String> g;
    @Nullable
    private final String h;
    private final String i;

    /* compiled from: HttpUrl */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        String f14793a;

        /* renamed from: b  reason: collision with root package name */
        String f14794b = "";

        /* renamed from: c  reason: collision with root package name */
        String f14795c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        String f14796d;

        /* renamed from: e  reason: collision with root package name */
        int f14797e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f14798f;
        @Nullable
        List<String> g;
        @Nullable
        String h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f14798f = arrayList;
            arrayList.add("");
        }

        @Nullable
        private static String d(String str, int i, int i2) {
            return e.c(z.u(str, i, i2, false));
        }

        private boolean h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int k(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(z.a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void m() {
            List<String> list = this.f14798f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f14798f.isEmpty()) {
                this.f14798f.add("");
                return;
            }
            List<String> list2 = this.f14798f;
            list2.set(list2.size() - 1, "");
        }

        private static int o(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        private void p(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = z.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!h(a2)) {
                if (i(a2)) {
                    m();
                    return;
                }
                List<String> list = this.f14798f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f14798f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f14798f.add(a2);
                }
                if (z) {
                    this.f14798f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void r(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f14798f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f14798f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f14798f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = e.m0.e.n(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.z.a.r(java.lang.String, int, int):void");
        }

        private static int t(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private static int u(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public a a(String str, @Nullable String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(z.b(str, " \"'<>#&=", true, false, true, true));
                this.g.add(str2 != null ? z.b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public a b(String str, @Nullable String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(z.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.g.add(str2 != null ? z.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public z c() {
            if (this.f14793a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f14796d != null) {
                return new z(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            int i = this.f14797e;
            return i != -1 ? i : z.e(this.f14793a);
        }

        public a f(@Nullable String str) {
            this.g = str != null ? z.B(z.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a g(String str) {
            if (str != null) {
                String d2 = d(str, 0, str.length());
                if (d2 != null) {
                    this.f14796d = d2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        public a j(@Nullable z zVar, String str) {
            int n;
            int i;
            z zVar2 = zVar;
            String str2 = str;
            int F = e.F(str2, 0, str.length());
            int G = e.G(str2, F, str.length());
            int t = t(str2, F, G);
            if (t != -1) {
                if (str.regionMatches(true, F, "https:", 0, 6)) {
                    this.f14793a = "https";
                    F += 6;
                } else if (str.regionMatches(true, F, "http:", 0, 5)) {
                    this.f14793a = "http";
                    F += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, t) + "'");
                }
            } else if (zVar2 != null) {
                this.f14793a = zVar2.f14787a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int u = u(str2, F, G);
            char c2 = '?';
            char c3 = '#';
            if (u >= 2 || zVar2 == null || !zVar2.f14787a.equals(this.f14793a)) {
                int i2 = F + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    n = e.n(str2, i2, G, "@/\\?#");
                    char charAt = n != G ? str2.charAt(n) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = n;
                        int o = o(str2, i2, i3);
                        int i4 = o + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int m = e.m(str2, i2, n, ':');
                                int i5 = m;
                                String str3 = "%40";
                                i = n;
                                String a2 = z.a(str, i2, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a2 = this.f14794b + str3 + a2;
                                }
                                this.f14794b = a2;
                                if (i5 != i) {
                                    this.f14795c = z.a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = n;
                                this.f14795c += "%40" + z.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = n;
                int o2 = o(str2, i2, i32);
                int i42 = o2 + 1;
                if (i42 < i32) {
                    this.f14796d = d(str2, i2, o2);
                    int k = k(str2, i42, i32);
                    this.f14797e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.f14796d = d(str2, i2, o2);
                    this.f14797e = z.e(this.f14793a);
                }
                if (this.f14796d != null) {
                    F = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, o2) + '\"');
                }
            } else {
                this.f14794b = zVar.k();
                this.f14795c = zVar.g();
                this.f14796d = zVar2.f14790d;
                this.f14797e = zVar2.f14791e;
                this.f14798f.clear();
                this.f14798f.addAll(zVar.i());
                if (F == G || str2.charAt(F) == '#') {
                    f(zVar.j());
                }
            }
            int n2 = e.n(str2, F, G, "?#");
            r(str2, F, n2);
            if (n2 < G && str2.charAt(n2) == '?') {
                int m2 = e.m(str2, n2, G, '#');
                this.g = z.B(z.a(str, n2 + 1, m2, " \"'<>#", true, false, true, true, (Charset) null));
                n2 = m2;
            }
            if (n2 < G && str2.charAt(n2) == '#') {
                this.h = z.a(str, 1 + n2, G, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        public a l(String str) {
            if (str != null) {
                this.f14795c = z.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a n(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f14797e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a q() {
            int size = this.f14798f.size();
            for (int i = 0; i < size; i++) {
                this.f14798f.set(i, z.b(this.f14798f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, z.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = z.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a s(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f14793a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f14793a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f14793a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f14794b.isEmpty() || !this.f14795c.isEmpty()) {
                sb.append(this.f14794b);
                if (!this.f14795c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f14795c);
                }
                sb.append('@');
            }
            String str2 = this.f14796d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f14796d);
                    sb.append(']');
                } else {
                    sb.append(this.f14796d);
                }
            }
            if (!(this.f14797e == -1 && this.f14793a == null)) {
                int e2 = e();
                String str3 = this.f14793a;
                if (str3 == null || e2 != z.e(str3)) {
                    sb.append(':');
                    sb.append(e2);
                }
            }
            z.t(sb, this.f14798f);
            if (this.g != null) {
                sb.append('?');
                z.o(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        public a v(String str) {
            if (str != null) {
                this.f14794b = z.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    z(a aVar) {
        this.f14787a = aVar.f14793a;
        this.f14788b = v(aVar.f14794b, false);
        this.f14789c = v(aVar.f14795c, false);
        this.f14790d = aVar.f14796d;
        this.f14791e = aVar.e();
        this.f14792f = w(aVar.f14798f, false);
        List<String> list = aVar.g;
        String str = null;
        this.g = list != null ? w(list, true) : null;
        String str2 = aVar.h;
        this.h = str2 != null ? v(str2, false) : str;
        this.i = aVar.toString();
    }

    static List<String> B(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        String str3 = str;
        int i4 = i3;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || y(str, i5, i3)))) && (codePointAt != 43 || !z3))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            Buffer buffer = new Buffer();
            int i6 = i2;
            buffer.writeUtf8(str, i2, i5);
            d(buffer, str, i5, i3, str2, z, z2, z3, z4, charset);
            return buffer.readUtf8();
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static void d(Buffer buffer, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        Buffer buffer2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !y(str, i2, i3)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        buffer2.writeUtf8CodePoint(codePointAt);
                    } else {
                        buffer2.writeString(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) j[(readByte >> 4) & 15]);
                        buffer.writeByte((int) j[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public static int e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static z l(String str) {
        a aVar = new a();
        aVar.j((z) null, str);
        return aVar.c();
    }

    static void o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public static z r(String str) {
        try {
            return l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void t(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    static String u(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i2, i4);
                x(buffer, str, i4, i3, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i2, i3);
    }

    static String v(String str, boolean z) {
        return u(str, 0, str.length(), z);
    }

    private List<String> w(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? v(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void x(Buffer buffer, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int j2 = e.j(str.charAt(i2 + 1));
                int j3 = e.j(str.charAt(i4));
                if (!(j2 == -1 || j3 == -1)) {
                    buffer.writeByte((j2 << 4) + j3);
                    i2 = i4;
                    i2 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                buffer.writeByte(32);
                i2 += Character.charCount(codePointAt);
            }
            buffer.writeUtf8CodePoint(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static boolean y(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || e.j(str.charAt(i2 + 1)) == -1 || e.j(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    @Nullable
    public String A() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        o(sb, this.g);
        return sb.toString();
    }

    public String C() {
        a q = q("/...");
        q.v("");
        q.l("");
        return q.c().toString();
    }

    @Nullable
    public z D(String str) {
        a q = q(str);
        if (q != null) {
            return q.c();
        }
        return null;
    }

    public String E() {
        return this.f14787a;
    }

    public URI F() {
        a p = p();
        p.q();
        String aVar = p.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof z) && ((z) obj).i.equals(this.i);
    }

    @Nullable
    public String f() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    public String g() {
        if (this.f14789c.isEmpty()) {
            return "";
        }
        int indexOf = this.i.indexOf(64);
        return this.i.substring(this.i.indexOf(58, this.f14787a.length() + 3) + 1, indexOf);
    }

    public String h() {
        int indexOf = this.i.indexOf(47, this.f14787a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, e.n(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public List<String> i() {
        int indexOf = this.i.indexOf(47, this.f14787a.length() + 3);
        String str = this.i;
        int n = e.n(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < n) {
            int i2 = indexOf + 1;
            int m = e.m(this.i, i2, n, '/');
            arrayList.add(this.i.substring(i2, m));
            indexOf = m;
        }
        return arrayList;
    }

    @Nullable
    public String j() {
        if (this.g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, e.m(str, indexOf, str.length(), '#'));
    }

    public String k() {
        if (this.f14788b.isEmpty()) {
            return "";
        }
        int length = this.f14787a.length() + 3;
        String str = this.i;
        return this.i.substring(length, e.n(str, length, str.length(), ":@"));
    }

    public String m() {
        return this.f14790d;
    }

    public boolean n() {
        return this.f14787a.equals("https");
    }

    public a p() {
        a aVar = new a();
        aVar.f14793a = this.f14787a;
        aVar.f14794b = k();
        aVar.f14795c = g();
        aVar.f14796d = this.f14790d;
        aVar.f14797e = this.f14791e != e(this.f14787a) ? this.f14791e : -1;
        aVar.f14798f.clear();
        aVar.f14798f.addAll(i());
        aVar.f(j());
        aVar.h = f();
        return aVar;
    }

    @Nullable
    public a q(String str) {
        try {
            a aVar = new a();
            aVar.j(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public List<String> s() {
        return this.f14792f;
    }

    public String toString() {
        return this.i;
    }

    public int z() {
        return this.f14791e;
    }
}
