package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* compiled from: ActionBarDrawerToggleHoneycomb */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f739a = {16843531};

    /* compiled from: ActionBarDrawerToggleHoneycomb */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f740a;

        /* renamed from: b  reason: collision with root package name */
        public Method f741b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f742c;

        a(Activity activity) {
            try {
                this.f740a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f741b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f742c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f739a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f740a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f741b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return aVar;
    }

    public static a c(a aVar, Activity activity, Drawable drawable, int i) {
        a aVar2 = new a(activity);
        if (aVar2.f740a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f740a.invoke(actionBar, new Object[]{drawable});
                aVar2.f741b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e2);
            }
        } else {
            ImageView imageView = aVar2.f742c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return aVar2;
    }
}
