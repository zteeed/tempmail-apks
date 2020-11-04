package androidx.fragment.app;

import androidx.lifecycle.r;
import java.util.List;

/* compiled from: FragmentManagerNonConfig */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final List<Fragment> f1534a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i> f1535b;

    /* renamed from: c  reason: collision with root package name */
    private final List<r> f1536c;

    i(List<Fragment> list, List<i> list2, List<r> list3) {
        this.f1534a = list;
        this.f1535b = list2;
        this.f1536c = list3;
    }

    /* access modifiers changed from: package-private */
    public List<i> a() {
        return this.f1535b;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> b() {
        return this.f1534a;
    }

    /* access modifiers changed from: package-private */
    public List<r> c() {
        return this.f1536c;
    }
}
