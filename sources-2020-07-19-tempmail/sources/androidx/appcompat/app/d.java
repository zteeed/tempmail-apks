package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog */
public class d extends i implements DialogInterface {

    /* renamed from: d  reason: collision with root package name */
    final AlertController f716d = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f717a;

        /* renamed from: b  reason: collision with root package name */
        private final int f718b;

        public a(Context context) {
            this(context, d.e(context, 0));
        }

        public d a() {
            d dVar = new d(this.f717a.f676a, this.f718b);
            this.f717a.a(dVar.f716d);
            dVar.setCancelable(this.f717a.r);
            if (this.f717a.r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f717a.s);
            dVar.setOnDismissListener(this.f717a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f717a.u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context b() {
            return this.f717a.f676a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f717a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f717a.g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f717a.f679d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f717a.h = charSequence;
            return this;
        }

        public a g(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f717a;
            fVar.l = fVar.f676a.getText(i);
            this.f717a.n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f717a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f717a.u = onKeyListener;
            return this;
        }

        public a j(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f717a;
            fVar.i = fVar.f676a.getText(i);
            this.f717a.k = onClickListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f717a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.f717a.f681f = charSequence;
            return this;
        }

        public a m(View view) {
            AlertController.f fVar = this.f717a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i) {
            this.f717a = new AlertController.f(new ContextThemeWrapper(context, d.e(context, i)));
            this.f718b = i;
        }
    }

    protected d(Context context, int i) {
        super(context, e(context, i));
    }

    static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f716d.d();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f716d.f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f716d.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f716d.p(charSequence);
    }
}
