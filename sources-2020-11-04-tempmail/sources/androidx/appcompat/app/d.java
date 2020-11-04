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
    final AlertController f743d = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f744a;

        /* renamed from: b  reason: collision with root package name */
        private final int f745b;

        public a(Context context) {
            this(context, d.e(context, 0));
        }

        public d a() {
            d dVar = new d(this.f744a.f703a, this.f745b);
            this.f744a.a(dVar.f743d);
            dVar.setCancelable(this.f744a.r);
            if (this.f744a.r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f744a.s);
            dVar.setOnDismissListener(this.f744a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f744a.u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context b() {
            return this.f744a.f703a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f744a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f744a.g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f744a.f706d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f744a.h = charSequence;
            return this;
        }

        public a g(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f744a;
            fVar.l = fVar.f703a.getText(i);
            this.f744a.n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f744a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f744a.u = onKeyListener;
            return this;
        }

        public a j(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f744a;
            fVar.i = fVar.f703a.getText(i);
            this.f744a.k = onClickListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f744a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.f744a.f708f = charSequence;
            return this;
        }

        public a m(View view) {
            AlertController.f fVar = this.f744a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i) {
            this.f744a = new AlertController.f(new ContextThemeWrapper(context, d.e(context, i)));
            this.f745b = i;
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
        this.f743d.d();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f743d.f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f743d.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f743d.p(charSequence);
    }
}
