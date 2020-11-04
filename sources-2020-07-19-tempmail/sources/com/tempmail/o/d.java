package com.tempmail.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.m.a0;
import com.tempmail.n.q;
import com.tempmail.utils.e;
import com.tempmail.utils.j;
import com.tempmail.utils.m;
import com.tempmail.utils.w;

/* compiled from: MailboxFragment */
public class d extends b implements View.OnClickListener, com.tempmail.l.b {
    /* access modifiers changed from: private */
    public static final String t0 = d.class.getSimpleName();
    private static final Integer u0 = 440;
    /* access modifiers changed from: private */
    public a0 p0;
    /* access modifiers changed from: private */
    public ObjectAnimator q0;
    private ObjectAnimator r0;
    private Animation s0;

    /* compiled from: MailboxFragment */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.q0.start();
            d.this.L2();
        }
    }

    /* compiled from: MailboxFragment */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.p0.H.setAlpha(1.0f);
            d.this.p0.H.setVisibility(0);
        }
    }

    /* compiled from: MailboxFragment */
    class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaPlayer f12449a;

        c(MediaPlayer mediaPlayer) {
            this.f12449a = mediaPlayer;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            m.b(d.t0, "animationView onAnimationEnd");
            d.this.p0.q.setVisibility(8);
            d.this.p0.B.setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            m.b(d.t0, "animationView onAnimationStart");
            this.f12449a.start();
            d.this.p0.B.setVisibility(4);
        }
    }

    /* renamed from: com.tempmail.o.d$d  reason: collision with other inner class name */
    /* compiled from: MailboxFragment */
    class C0125d implements Animation.AnimationListener {
        C0125d() {
        }

        public void onAnimationEnd(Animation animation) {
            m.b(d.t0, "shapeAnimation onAnimationEnd");
            d.this.p0.q.setVisibility(0);
            d.this.p0.q.playAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            m.b(d.t0, "shapeAnimation onAnimationStart");
        }
    }

    private void I2() {
        this.s0 = AnimationUtils.loadAnimation(this.c0, R.anim.shape_animation);
        String str = t0;
        m.b(str, "animationview anim duration " + this.p0.q.getDuration());
        String str2 = t0;
        m.b(str2, "shapeAnimation.getRepeatCount() " + this.s0.getRepeatCount());
        int intValue = (int) (((long) u0.intValue()) + (this.s0.getDuration() * 4));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.p0.H, "alpha", new float[]{1.0f, 0.0f});
        this.r0 = ofFloat;
        ofFloat.setDuration((long) intValue);
        this.r0.setInterpolator(new AccelerateInterpolator());
        this.r0.addListener(new a());
        this.q0 = ObjectAnimator.ofFloat(this.p0.H, "alpha", new float[]{0.0f, 1.0f});
        String str3 = t0;
        m.b(str3, "fade out duration " + this.r0.getDuration());
        this.q0.setInterpolator(new DecelerateInterpolator());
        this.q0.setDuration(this.r0.getDuration());
        this.q0.addListener(new b());
        MediaPlayer create = MediaPlayer.create(H(), R.raw.explosion_sound);
        create.setVolume(0.3f, 0.3f);
        this.p0.q.addAnimatorListener(new c(create));
        this.s0.setAnimationListener(new C0125d());
    }

    private void J2() {
        this.p0.t.setOnClickListener(this);
        this.p0.r.setOnClickListener(this);
        this.p0.u.setOnClickListener(this);
        this.p0.C.setOnClickListener(this);
        this.p0.B.setOnClickListener(this);
        if (!e.O(this.c0)) {
            y2();
        }
        this.p0.A.setBackgroundColor(a0().getColor(17170445));
        this.p0.A.setImageBitmap(j.a(((BitmapDrawable) this.p0.A.getDrawable()).getBitmap(), (int) w.d(this.c0, 20.0f)));
    }

    public static d K2() {
        return new d();
    }

    public void C2() {
        m.b(t0, "initAnimation ");
        this.p0.B.startAnimation(this.s0);
        this.r0.start();
    }

    public void G0(Context context) {
        super.G0(context);
    }

    public void L2() {
        String str = t0;
        m.b(str, "setEmailAddress " + this.e0.V());
        a0 a0Var = this.p0;
        if (a0Var != null) {
            a0Var.H.setText(this.e0.V());
        }
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(t0, "onCreateView");
        this.p0 = (a0) f.d(layoutInflater, R.layout.fragment_email_address, viewGroup, false);
        J2();
        u2();
        L2();
        float textSize = this.p0.I.getTextSize() / a0().getDisplayMetrics().scaledDensity;
        String str = t0;
        m.b(str, "text size " + textSize);
        I2();
        return this.p0.n();
    }

    public void R0() {
        super.R0();
    }

    public void Z0() {
        super.Z0();
        m.b(t0, "onPause");
    }

    public void f1() {
        super.f1();
        com.tempmail.utils.z.a aVar = this.f0;
        if (aVar != null) {
            aVar.Y(0);
        }
        m.b(t0, "onResume");
        androidx.appcompat.app.a v0 = this.a0.v0();
        if (v0 != null) {
            v0.y();
        }
        L2();
    }

    public void onClick(View view) {
        String str;
        switch (view.getId()) {
            case R.id.btnChange /*2131296343*/:
                D2();
                return;
            case R.id.btnCopy /*2131296345*/:
                if (e.O(this.c0)) {
                    h2(this.c0.getString(R.string.analytics_email_copy_free));
                } else {
                    h2(this.c0.getString(R.string.analytics_email_copy_premium));
                }
                E2();
                return;
            case R.id.btnEdit /*2131296346*/:
                if (e.O(this.c0)) {
                    h2(this.c0.getString(R.string.analytics_email_edit_free));
                    this.e0.S(false);
                    return;
                }
                h2(this.c0.getString(R.string.analytics_email_edit_premium));
                this.e0.c0(this);
                return;
            case R.id.ivEmail /*2131296470*/:
                com.tempmail.utils.z.a aVar = this.f0;
                if (aVar != null) {
                    aVar.Z(R.id.inbox);
                    return;
                }
                return;
            case R.id.ivQrCode /*2131296476*/:
                String h = com.tempmail.utils.f.h(this.e0.V().getBytes(), true);
                if (e.O(this.c0)) {
                    Context context = this.c0;
                    str = context.getString(R.string.temp_email_qr_code_link, new Object[]{w.l(context), h});
                } else {
                    str = this.e0.V();
                }
                h2(this.c0.getString(R.string.analytics_qr_code));
                q.t2(str).r2(this.a0.k0(), q.class.getSimpleName());
                return;
            default:
                return;
        }
    }

    public void y2() {
        this.p0.z.setImageResource(R.drawable.ic_create_new);
        this.p0.F.setText(R.string.current_address_add);
        u2();
    }
}
