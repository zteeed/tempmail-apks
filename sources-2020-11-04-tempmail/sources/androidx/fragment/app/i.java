package androidx.fragment.app;

import a.k.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: FragmentLayoutInflaterFactory */
class i implements LayoutInflater.Factory2 {

    /* renamed from: b  reason: collision with root package name */
    private final k f1533b;

    i(k kVar) {
        this.f1533b = kVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f1533b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f1533b.Y(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f1533b.Z(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f1533b.Y(id);
        }
        if (k.r0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f1533b.g0().a(context.getClassLoader(), attributeValue);
            fragment.n = true;
            fragment.w = resourceId != 0 ? resourceId : id;
            fragment.x = id;
            fragment.y = string;
            fragment.o = true;
            k kVar = this.f1533b;
            fragment.s = kVar;
            h<?> hVar = kVar.o;
            fragment.t = hVar;
            fragment.Y0(hVar.g(), attributeSet, fragment.f1469c);
            this.f1533b.d(fragment);
            this.f1533b.B0(fragment);
        } else if (!fragment.o) {
            fragment.o = true;
            h<?> hVar2 = this.f1533b.o;
            fragment.t = hVar2;
            fragment.Y0(hVar2.g(), attributeSet, fragment.f1469c);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        k kVar2 = this.f1533b;
        if (kVar2.n >= 1 || !fragment.n) {
            this.f1533b.B0(fragment);
        } else {
            kVar2.C0(fragment, 1);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
