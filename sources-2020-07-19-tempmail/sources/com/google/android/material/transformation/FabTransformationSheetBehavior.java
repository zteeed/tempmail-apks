package com.google.android.material.transformation;

import a.h.k.t;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.a.d.a;
import b.c.a.d.l.h;
import b.c.a.d.l.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> g;

    public FabTransformationSheetBehavior() {
    }

    private void c0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.g;
                        if (map != null && map.containsKey(childAt)) {
                            t.i0(childAt, this.g.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        t.i0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.g = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean G(View view, View view2, boolean z, boolean z2) {
        c0(view2, z);
        return super.G(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.e a0(Context context, boolean z) {
        int i;
        if (z) {
            i = a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f10973a = h.c(context, i);
        eVar.f10974b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
