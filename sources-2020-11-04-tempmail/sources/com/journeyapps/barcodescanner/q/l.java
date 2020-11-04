package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PreviewScalingStrategy */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12811a = "l";

    /* compiled from: PreviewScalingStrategy */
    class a implements Comparator<n> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f12812b;

        a(n nVar) {
            this.f12812b = nVar;
        }

        /* renamed from: a */
        public int compare(n nVar, n nVar2) {
            return Float.compare(l.this.c(nVar2, this.f12812b), l.this.c(nVar, this.f12812b));
        }
    }

    public List<n> a(List<n> list, n nVar) {
        if (nVar == null) {
            return list;
        }
        Collections.sort(list, new a(nVar));
        return list;
    }

    public n b(List<n> list, n nVar) {
        a(list, nVar);
        String str = f12811a;
        Log.i(str, "Viewfinder size: " + nVar);
        String str2 = f12811a;
        Log.i(str2, "Preview in order of preference: " + list);
        return list.get(0);
    }

    /* access modifiers changed from: protected */
    public abstract float c(n nVar, n nVar2);

    public abstract Rect d(n nVar, n nVar2);
}
