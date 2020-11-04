package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
class u {

    /* renamed from: a  reason: collision with root package name */
    private int f1184a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1185b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1186c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1187d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1188e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1189f = 0;
    private boolean g = false;
    private boolean h = false;

    u() {
    }

    public int a() {
        return this.g ? this.f1184a : this.f1185b;
    }

    public int b() {
        return this.f1184a;
    }

    public int c() {
        return this.f1185b;
    }

    public int d() {
        return this.g ? this.f1185b : this.f1184a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1188e = i;
            this.f1184a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1189f = i2;
            this.f1185b = i2;
        }
    }

    public void f(boolean z) {
        if (z != this.g) {
            this.g = z;
            if (!this.h) {
                this.f1184a = this.f1188e;
                this.f1185b = this.f1189f;
            } else if (z) {
                int i = this.f1187d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1188e;
                }
                this.f1184a = i;
                int i2 = this.f1186c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1189f;
                }
                this.f1185b = i2;
            } else {
                int i3 = this.f1186c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1188e;
                }
                this.f1184a = i3;
                int i4 = this.f1187d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1189f;
                }
                this.f1185b = i4;
            }
        }
    }

    public void g(int i, int i2) {
        this.f1186c = i;
        this.f1187d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1184a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1185b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1184a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1185b = i2;
        }
    }
}
