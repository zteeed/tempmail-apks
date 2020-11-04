package com.tempmail.p;

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
import com.tempmail.n.c0;
import com.tempmail.o.p;
import com.tempmail.utils.j;
import com.tempmail.utils.m;
import com.tempmail.utils.x;

/* compiled from: MailboxFragment */
public class e extends c implements View.OnClickListener, com.tempmail.m.b {
    /* access modifiers changed from: private */
    public static final String u0 = e.class.getSimpleName();
    private static final Integer v0 = 440;
    /* access modifiers changed from: private */
    public c0 q0;
    /* access modifiers changed from: private */
    public ObjectAnimator r0;
    private ObjectAnimator s0;
    private Animation t0;

    /* compiled from: MailboxFragment */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.r0.start();
            e.this.I2();
        }
    }

    /* compiled from: MailboxFragment */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.q0.I.setAlpha(1.0f);
            e.this.q0.I.setVisibility(0);
        }
    }

    /* compiled from: MailboxFragment */
    class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaPlayer f12959a;

        c(MediaPlayer mediaPlayer) {
            this.f12959a = mediaPlayer;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            m.b(e.u0, "animationView onAnimationEnd");
            e.this.q0.q.setVisibility(8);
            e.this.q0.B.setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            m.b(e.u0, "animationView onAnimationStart");
            MediaPlayer mediaPlayer = this.f12959a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            e.this.q0.B.setVisibility(4);
        }
    }

    /* compiled from: MailboxFragment */
    class d implements Animation.AnimationListener {
        d() {
        }

        public void onAnimationEnd(Animation animation) {
            m.b(e.u0, "shapeAnimation onAnimationEnd");
            e.this.q0.q.setVisibility(0);
            e.this.q0.q.playAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            m.b(e.u0, "shapeAnimation onAnimationStart");
        }
    }

    private void V2() {
        this.t0 = AnimationUtils.loadAnimation(this.b0, R.anim.shape_animation);
        String str = u0;
        m.b(str, "animationview anim duration " + this.q0.q.getDuration());
        String str2 = u0;
        m.b(str2, "shapeAnimation.getRepeatCount() " + this.t0.getRepeatCount());
        int intValue = (int) (((long) v0.intValue()) + (this.t0.getDuration() * 4));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.q0.I, "alpha", new float[]{1.0f, 0.0f});
        this.s0 = ofFloat;
        ofFloat.setDuration((long) intValue);
        this.s0.setInterpolator(new AccelerateInterpolator());
        this.s0.addListener(new a());
        this.r0 = ObjectAnimator.ofFloat(this.q0.I, "alpha", new float[]{0.0f, 1.0f});
        String str3 = u0;
        m.b(str3, "fade out duration " + this.s0.getDuration());
        this.r0.setInterpolator(new DecelerateInterpolator());
        this.r0.setDuration(this.s0.getDuration());
        this.r0.addListener(new b());
        MediaPlayer create = MediaPlayer.create(L(), R.raw.explosion_sound);
        if (create != null) {
            create.setVolume(0.3f, 0.3f);
        }
        this.q0.q.addAnimatorListener(new c(create));
        this.t0.setAnimationListener(new d());
    }

    private void W2() {
        this.q0.t.setOnClickListener(this);
        this.q0.r.setOnClickListener(this);
        this.q0.u.setOnClickListener(this);
        this.q0.D.setOnClickListener(this);
        this.q0.B.setOnClickListener(this);
        if (!com.tempmail.utils.e.P(this.b0)) {
            K2();
        }
        float B = x.B(L(), (float) x.o(L(), R.dimen.cloud_height));
        float B2 = x.B(L(), (float) x.o(L(), R.dimen.cloud_padding));
        float B3 = x.B(L(), (float) x.o(L(), R.dimen.mailbox_btn_corner_round));
        String str = u0;
        m.b(str, "cloudHeightDp " + B);
        String str2 = u0;
        m.b(str2, "cloud padding dp " + B2);
        float f2 = (B3 - ((B - B2) / B3)) + 1.5f;
        String str3 = u0;
        m.b(str3, "cornersRound " + f2);
        this.q0.A.setImageBitmap(j.a(L(), ((BitmapDrawable) this.q0.A.getDrawable()).getBitmap(), (int) x.d(this.b0, f2)));
    }

    public static e X2() {
        return new e();
    }

    public void I2() {
        com.tempmail.utils.z.c cVar;
        if (this.c0 != null) {
            String str = u0;
            m.b(str, "setEmailAddress " + this.c0.T());
        }
        c0 c0Var = this.q0;
        if (c0Var != null && (cVar = this.c0) != null) {
            c0Var.I.setText(cVar.T());
        }
    }

    public void J0(Context context) {
        super.J0(context);
    }

    public void K2() {
        this.q0.z.setImageResource(R.drawable.ic_create_new);
        this.q0.G.setText(R.string.current_address_add);
        D2();
    }

    public void P2() {
        m.b(u0, "initAnimation ");
        this.q0.B.startAnimation(this.t0);
        this.s0.start();
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(u0, "onCreateView");
        this.q0 = (c0) f.d(layoutInflater, R.layout.fragment_email_address, viewGroup, false);
        W2();
        D2();
        I2();
        float textSize = this.q0.J.getTextSize() / e0().getDisplayMetrics().scaledDensity;
        String str = u0;
        m.b(str, "text size " + textSize);
        V2();
        C2();
        return this.q0.n();
    }

    public void U0() {
        super.U0();
    }

    public void c1() {
        super.c1();
        m.b(u0, "onPause");
    }

    public void i1() {
        super.i1();
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.X(0);
        }
        this.c0.k(true);
        m.b(u0, "onResume");
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.y();
        }
        I2();
    }

    public void onClick(View view) {
        String str;
        switch (view.getId()) {
            case R.id.btnChange /*2131296344*/:
                Q2();
                return;
            case R.id.btnCopy /*2131296346*/:
                if (com.tempmail.utils.e.P(this.b0)) {
                    o2(this.b0.getString(R.string.analytics_email_copy_free));
                } else {
                    o2(this.b0.getString(R.string.analytics_email_copy_premium));
                }
                R2();
                return;
            case R.id.btnEdit /*2131296347*/:
                if (com.tempmail.utils.e.P(this.b0)) {
                    o2(this.b0.getString(R.string.analytics_email_edit_free));
                    this.c0.o(false, (String) null);
                    return;
                }
                o2(this.b0.getString(R.string.analytics_email_edit_premium));
                this.c0.b0(this);
                return;
            case R.id.ivEmail /*2131296480*/:
                com.tempmail.utils.z.a aVar = this.d0;
                if (aVar != null) {
                    aVar.Y(R.id.inbox);
                    return;
                }
                return;
            case R.id.ivQrCode /*2131296489*/:
                String h = com.tempmail.utils.f.h(this.c0.T().getBytes(), true);
                if (com.tempmail.utils.e.P(this.b0)) {
                    Context context = this.b0;
                    str = context.getString(R.string.temp_email_qr_code_link, new Object[]{x.m(context), h});
                } else {
                    str = this.c0.T();
                }
                o2(this.b0.getString(R.string.analytics_qr_code));
                p.z2(str).x2(this.Z.k0(), p.class.getSimpleName());
                return;
            default:
                return;
        }
    }
}
