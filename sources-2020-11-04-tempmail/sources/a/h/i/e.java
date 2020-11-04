package a.h.i;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f340a = new C0011e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f341b = new C0011e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f342c = new C0011e(b.f346a, false);

    /* renamed from: d  reason: collision with root package name */
    public static final d f343d = new C0011e(b.f346a, true);

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f344b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f345a;

        private a(boolean z) {
            this.f345a = z;
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f345a) {
                        return 1;
                    }
                } else if (this.f345a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f345a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f346a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f347a;

        d(c cVar) {
            this.f347a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a2 = this.f347a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f347a == null) {
                return b();
            } else {
                return c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: a.h.i.e$e  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0011e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f348b;

        C0011e(c cVar, boolean z) {
            super(cVar);
            this.f348b = z;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f348b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f349b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.f344b;
        f fVar = f.f349b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
