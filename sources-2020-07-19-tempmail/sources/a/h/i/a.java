package a.h.i;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f311d = e.f341c;

    /* renamed from: e  reason: collision with root package name */
    private static final String f312e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f313f = Character.toString(8207);
    static final a g = new a(false, 2, f311d);
    static final a h = new a(true, 2, f311d);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f314a;

    /* renamed from: b  reason: collision with root package name */
    private final int f315b;

    /* renamed from: c  reason: collision with root package name */
    private final d f316c;

    /* renamed from: a.h.i.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static final class C0009a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f317a;

        /* renamed from: b  reason: collision with root package name */
        private int f318b;

        /* renamed from: c  reason: collision with root package name */
        private d f319c;

        public C0009a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.h : a.g;
        }

        private void c(boolean z) {
            this.f317a = z;
            this.f319c = a.f311d;
            this.f318b = 2;
        }

        public a a() {
            if (this.f318b == 2 && this.f319c == a.f311d) {
                return b(this.f317a);
            }
            return new a(this.f317a, this.f318b, this.f319c);
        }
    }

    /* compiled from: BidiFormatter */
    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f320f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f321a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f322b;

        /* renamed from: c  reason: collision with root package name */
        private final int f323c;

        /* renamed from: d  reason: collision with root package name */
        private int f324d;

        /* renamed from: e  reason: collision with root package name */
        private char f325e;

        static {
            for (int i = 0; i < 1792; i++) {
                f320f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f321a = charSequence;
            this.f322b = z;
            this.f323c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f320f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i = this.f324d;
            do {
                int i2 = this.f324d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f321a;
                int i3 = i2 - 1;
                this.f324d = i3;
                charAt = charSequence.charAt(i3);
                this.f325e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f324d = i;
            this.f325e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.f324d;
                if (i >= this.f323c) {
                    return 12;
                }
                CharSequence charSequence = this.f321a;
                this.f324d = i + 1;
                charAt = charSequence.charAt(i);
                this.f325e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i = this.f324d;
            while (true) {
                int i2 = this.f324d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f321a;
                int i3 = i2 - 1;
                this.f324d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f325e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c2 = this.f325e;
                    do {
                        int i4 = this.f324d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f321a;
                        int i5 = i4 - 1;
                        this.f324d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f325e = charAt;
                    } while (charAt != c2);
                }
            }
            this.f324d = i;
            this.f325e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i = this.f324d;
            while (true) {
                int i2 = this.f324d;
                if (i2 < this.f323c) {
                    CharSequence charSequence = this.f321a;
                    this.f324d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f325e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c2 = this.f325e;
                        do {
                            int i3 = this.f324d;
                            if (i3 >= this.f323c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f321a;
                            this.f324d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f325e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.f324d = i;
                    this.f325e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f321a.charAt(this.f324d - 1);
            this.f325e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f321a, this.f324d);
                this.f324d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f324d--;
            byte c2 = c(this.f325e);
            if (!this.f322b) {
                return c2;
            }
            char c3 = this.f325e;
            if (c3 == '>') {
                return h();
            }
            return c3 == ';' ? f() : c2;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f321a.charAt(this.f324d);
            this.f325e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f321a, this.f324d);
                this.f324d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f324d++;
            byte c2 = c(this.f325e);
            if (!this.f322b) {
                return c2;
            }
            char c3 = this.f325e;
            if (c3 == '<') {
                return i();
            }
            return c3 == '&' ? g() : c2;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f324d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f324d < this.f323c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f324d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.f323c
                r7.f324d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f324d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.i.a.b.e():int");
        }
    }

    a(boolean z, int i, d dVar) {
        this.f314a = z;
        this.f315b = i;
        this.f316c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0009a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f314a && (a2 || b(charSequence) == 1)) {
            return f312e;
        }
        if (this.f314a) {
            return (!a2 || b(charSequence) == -1) ? f313f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f314a && (a2 || a(charSequence) == 1)) {
            return f312e;
        }
        if (this.f314a) {
            return (!a2 || a(charSequence) == -1) ? f313f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f315b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f316c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append(g(charSequence, a2 ? e.f340b : e.f339a));
        }
        if (a2 != this.f314a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(f(charSequence, a2 ? e.f340b : e.f339a));
        }
        return spannableStringBuilder;
    }
}
