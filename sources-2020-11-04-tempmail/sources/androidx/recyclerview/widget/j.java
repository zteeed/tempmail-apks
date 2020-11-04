package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
class j {
    static int a(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.f0(view) - layoutManager.f0(view2)) + 1;
        }
        return Math.min(hVar.n(), hVar.d(view2) - hVar.g(view));
    }

    static int b(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int i;
        if (layoutManager.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.f0(view), layoutManager.f0(view2));
        int max = Math.max(layoutManager.f0(view), layoutManager.f0(view2));
        if (z2) {
            i = Math.max(0, (yVar.b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(hVar.d(view2) - hVar.g(view))) / ((float) (Math.abs(layoutManager.f0(view) - layoutManager.f0(view2)) + 1)))) + ((float) (hVar.m() - hVar.g(view))));
    }

    static int c(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.b();
        }
        return (int) ((((float) (hVar.d(view2) - hVar.g(view))) / ((float) (Math.abs(layoutManager.f0(view) - layoutManager.f0(view2)) + 1))) * ((float) yVar.b()));
    }
}
