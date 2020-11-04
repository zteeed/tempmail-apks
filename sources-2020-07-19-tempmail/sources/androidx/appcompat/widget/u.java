package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
class u {

    /* renamed from: a  reason: collision with root package name */
    private int f1157a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1158b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1159c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1160d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1161e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1162f = 0;
    private boolean g = false;
    private boolean h = false;

    u() {
    }

    public int a() {
        return this.g ? this.f1157a : this.f1158b;
    }

    public int b() {
        return this.f1157a;
    }

    public int c() {
        return this.f1158b;
    }

    public int d() {
        return this.g ? this.f1158b : this.f1157a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1161e = i;
            this.f1157a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1162f = i2;
            this.f1158b = i2;
        }
    }

    public void f(boolean z) {
        if (z != this.g) {
            this.g = z;
            if (!this.h) {
                this.f1157a = this.f1161e;
                this.f1158b = this.f1162f;
            } else if (z) {
                int i = this.f1160d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1161e;
                }
                this.f1157a = i;
                int i2 = this.f1159c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1162f;
                }
                this.f1158b = i2;
            } else {
                int i3 = this.f1159c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1161e;
                }
                this.f1157a = i3;
                int i4 = this.f1160d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1162f;
                }
                this.f1158b = i4;
            }
        }
    }

    public void g(int i, int i2) {
        this.f1159c = i;
        this.f1160d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1157a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1158b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1157a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1158b = i2;
        }
    }
}
