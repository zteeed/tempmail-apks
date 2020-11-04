package b.c.a.e.a.a;

import b.c.a.e.a.a.d;

final class q extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private Integer f2461a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f2462b;

    q() {
    }

    public final d a() {
        String str = "";
        if (this.f2461a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f2462b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new r(this.f2461a.intValue(), this.f2462b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final d.a b(boolean z) {
        this.f2462b = Boolean.valueOf(z);
        return this;
    }

    public final d.a c(int i) {
        this.f2461a = Integer.valueOf(i);
        return this;
    }
}
