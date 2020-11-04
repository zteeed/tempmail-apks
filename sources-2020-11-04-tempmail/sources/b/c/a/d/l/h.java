package b.c.a.d.l;

import a.e.g;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g<String, i> f2376a = new g<>();

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.h(objectAnimator.getPropertyName(), i.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static h b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static h c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    private static h d(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(hVar, list.get(i));
        }
        return hVar;
    }

    public i e(String str) {
        if (g(str)) {
            return this.f2376a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f2376a.equals(((h) obj).f2376a);
    }

    public long f() {
        int size = this.f2376a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            i m = this.f2376a.m(i);
            j = Math.max(j, m.c() + m.d());
        }
        return j;
    }

    public boolean g(String str) {
        return this.f2376a.get(str) != null;
    }

    public void h(String str, i iVar) {
        this.f2376a.put(str, iVar);
    }

    public int hashCode() {
        return this.f2376a.hashCode();
    }

    public String toString() {
        return 10 + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2376a + "}\n";
    }
}
