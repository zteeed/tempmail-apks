package a.q;

import a.q.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class q extends m {
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    int M;
    boolean N = false;
    private int O = 0;

    /* compiled from: TransitionSet */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f583a;

        a(q qVar, m mVar) {
            this.f583a = mVar;
        }

        public void c(m mVar) {
            this.f583a.f0();
            mVar.b0(this);
        }
    }

    /* compiled from: TransitionSet */
    static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f584a;

        b(q qVar) {
            this.f584a = qVar;
        }

        public void a(m mVar) {
            q qVar = this.f584a;
            if (!qVar.N) {
                qVar.m0();
                this.f584a.N = true;
            }
        }

        public void c(m mVar) {
            q qVar = this.f584a;
            int i = qVar.M - 1;
            qVar.M = i;
            if (i == 0) {
                qVar.N = false;
                qVar.s();
            }
            mVar.b0(this);
        }
    }

    private void z0() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.M = this.K.size();
    }

    public void Z(View view) {
        super.Z(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).Z(view);
        }
    }

    public void d0(View view) {
        super.d0(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).d0(view);
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
        if (this.K.isEmpty()) {
            m0();
            s();
            return;
        }
        z0();
        if (!this.L) {
            for (int i = 1; i < this.K.size(); i++) {
                this.K.get(i - 1).b(new a(this, this.K.get(i)));
            }
            m mVar = this.K.get(0);
            if (mVar != null) {
                mVar.f0();
                return;
            }
            return;
        }
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().f0();
        }
    }

    public void g(s sVar) {
        if (S(sVar.f589b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.S(sVar.f589b)) {
                    next.g(sVar);
                    sVar.f590c.add(next);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ m g0(long j) {
        v0(j);
        return this;
    }

    public void h0(m.e eVar) {
        super.h0(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).h0(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
        super.j(sVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).j(sVar);
        }
    }

    public void j0(g gVar) {
        super.j0(gVar);
        this.O |= 4;
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).j0(gVar);
        }
    }

    public void k(s sVar) {
        if (S(sVar.f589b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.S(sVar.f589b)) {
                    next.k(sVar);
                    sVar.f590c.add(next);
                }
            }
        }
    }

    public void k0(p pVar) {
        super.k0(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).k0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String n0(String str) {
        String n0 = super.n0(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(n0);
            sb.append("\n");
            sb.append(this.K.get(i).n0(str + "  "));
            n0 = sb.toString();
        }
        return n0;
    }

    /* renamed from: o */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            qVar.q0(this.K.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: o0 */
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    /* renamed from: p0 */
    public q c(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).c(view);
        }
        super.c(view);
        return this;
    }

    public q q0(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
        long j = this.f565d;
        if (j >= 0) {
            mVar.g0(j);
        }
        if ((this.O & 1) != 0) {
            mVar.i0(x());
        }
        if ((this.O & 2) != 0) {
            mVar.k0(D());
        }
        if ((this.O & 4) != 0) {
            mVar.j0(C());
        }
        if ((this.O & 8) != 0) {
            mVar.h0(w());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void r(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long F = F();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            m mVar = this.K.get(i);
            if (F > 0 && (this.L || i == 0)) {
                long F2 = mVar.F();
                if (F2 > 0) {
                    mVar.l0(F2 + F);
                } else {
                    mVar.l0(F);
                }
            }
            mVar.r(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public m r0(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    public int s0() {
        return this.K.size();
    }

    /* renamed from: t0 */
    public q b0(m.f fVar) {
        super.b0(fVar);
        return this;
    }

    /* renamed from: u0 */
    public q c0(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).c0(view);
        }
        super.c0(view);
        return this;
    }

    public q v0(long j) {
        super.g0(j);
        if (this.f565d >= 0) {
            int size = this.K.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).g0(j);
            }
        }
        return this;
    }

    /* renamed from: w0 */
    public q i0(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).i0(timeInterpolator);
            }
        }
        super.i0(timeInterpolator);
        return this;
    }

    public q x0(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i == 1) {
            this.L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: y0 */
    public q l0(long j) {
        super.l0(j);
        return this;
    }
}
