package b.c.a.d.l;

import android.util.Property;
import android.view.ViewGroup;
import b.c.a.d.f;

/* compiled from: ChildrenAlphaProperty */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f2369a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(f.mtrl_internal_children_alpha_tag);
        if (f2 != null) {
            return f2;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f2) {
        float floatValue = f2.floatValue();
        viewGroup.setTag(f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
