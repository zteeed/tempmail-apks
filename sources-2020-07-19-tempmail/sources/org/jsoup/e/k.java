package org.jsoup.e;

import org.jsoup.e.i;

/* compiled from: TokeniserState */
enum k {
    Data {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                jVar.i(aVar.d());
            } else if (q == '&') {
                jVar.a(k.CharacterReferenceInData);
            } else if (q == '<') {
                jVar.a(k.TagOpen);
            } else if (q != 65535) {
                jVar.j(aVar.e());
            } else {
                jVar.k(new i.f());
            }
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.r(jVar, k.Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                aVar.a();
                jVar.i(65533);
            } else if (q == '&') {
                jVar.a(k.CharacterReferenceInRcdata);
            } else if (q == '<') {
                jVar.a(k.RcdataLessthanSign);
            } else if (q != 65535) {
                jVar.j(aVar.m('&', '<', 0));
            } else {
                jVar.k(new i.f());
            }
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.r(jVar, k.Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.t(jVar, aVar, this, k.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.t(jVar, aVar, this, k.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                aVar.a();
                jVar.i(65533);
            } else if (q != 65535) {
                jVar.j(aVar.k(0));
            } else {
                jVar.k(new i.f());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == '!') {
                jVar.a(k.MarkupDeclarationOpen);
            } else if (q == '/') {
                jVar.a(k.EndTagOpen);
            } else if (q == '?') {
                jVar.a(k.BogusComment);
            } else if (aVar.C()) {
                jVar.g(true);
                jVar.u(k.TagName);
            } else {
                jVar.r(this);
                jVar.i('<');
                jVar.u(k.Data);
            }
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.r()) {
                jVar.p(this);
                jVar.j("</");
                jVar.u(k.Data);
            } else if (aVar.C()) {
                jVar.g(false);
                jVar.u(k.TagName);
            } else if (aVar.w('>')) {
                jVar.r(this);
                jVar.a(k.Data);
            } else {
                jVar.r(this);
                jVar.a(k.BogusComment);
            }
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            jVar.i.v(aVar.j());
            char d2 = aVar.d();
            if (d2 != 0) {
                if (d2 != ' ') {
                    if (d2 == '/') {
                        jVar.u(k.SelfClosingStartTag);
                        return;
                    } else if (d2 == '>') {
                        jVar.o();
                        jVar.u(k.Data);
                        return;
                    } else if (d2 == 65535) {
                        jVar.p(this);
                        jVar.u(k.Data);
                        return;
                    } else if (!(d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13)) {
                        jVar.i.u(d2);
                        return;
                    }
                }
                jVar.u(k.BeforeAttributeName);
                return;
            }
            jVar.i.v(k.u0);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.w('/')) {
                jVar.h();
                jVar.a(k.RCDATAEndTagOpen);
                return;
            }
            if (aVar.C() && jVar.b() != null) {
                if (!aVar.p("</" + jVar.b())) {
                    i.C0168i g = jVar.g(false);
                    g.B(jVar.b());
                    jVar.i = g;
                    jVar.o();
                    aVar.I();
                    jVar.u(k.Data);
                    return;
                }
            }
            jVar.j("<");
            jVar.u(k.Rcdata);
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                jVar.g(false);
                jVar.i.u(aVar.q());
                jVar.h.append(aVar.q());
                jVar.a(k.RCDATAEndTagName);
                return;
            }
            jVar.j("</");
            jVar.u(k.Rcdata);
        }
    },
    RCDATAEndTagName {
        private void v(j jVar, a aVar) {
            jVar.j("</" + jVar.h.toString());
            aVar.I();
            jVar.u(k.Rcdata);
        }

        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                String h = aVar.h();
                jVar.i.v(h);
                jVar.h.append(h);
                return;
            }
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                if (jVar.s()) {
                    jVar.u(k.BeforeAttributeName);
                } else {
                    v(jVar, aVar);
                }
            } else if (d2 != '/') {
                if (d2 != '>') {
                    v(jVar, aVar);
                } else if (jVar.s()) {
                    jVar.o();
                    jVar.u(k.Data);
                } else {
                    v(jVar, aVar);
                }
            } else if (jVar.s()) {
                jVar.u(k.SelfClosingStartTag);
            } else {
                v(jVar, aVar);
            }
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.w('/')) {
                jVar.h();
                jVar.a(k.RawtextEndTagOpen);
                return;
            }
            jVar.i('<');
            jVar.u(k.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.u(jVar, aVar, k.RawtextEndTagName, k.Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.p(jVar, aVar, k.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == '!') {
                jVar.j("<!");
                jVar.u(k.ScriptDataEscapeStart);
            } else if (d2 != '/') {
                jVar.j("<");
                aVar.I();
                jVar.u(k.ScriptData);
            } else {
                jVar.h();
                jVar.u(k.ScriptDataEndTagOpen);
            }
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.u(jVar, aVar, k.ScriptDataEndTagName, k.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.p(jVar, aVar, k.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.w('-')) {
                jVar.i('-');
                jVar.a(k.ScriptDataEscapeStartDash);
                return;
            }
            jVar.u(k.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.w('-')) {
                jVar.i('-');
                jVar.a(k.ScriptDataEscapedDashDash);
                return;
            }
            jVar.u(k.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.r()) {
                jVar.p(this);
                jVar.u(k.Data);
                return;
            }
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                aVar.a();
                jVar.i(65533);
            } else if (q == '-') {
                jVar.i('-');
                jVar.a(k.ScriptDataEscapedDash);
            } else if (q != '<') {
                jVar.j(aVar.m('-', '<', 0));
            } else {
                jVar.a(k.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.r()) {
                jVar.p(this);
                jVar.u(k.Data);
                return;
            }
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i(65533);
                jVar.u(k.ScriptDataEscaped);
            } else if (d2 == '-') {
                jVar.i(d2);
                jVar.u(k.ScriptDataEscapedDashDash);
            } else if (d2 != '<') {
                jVar.i(d2);
                jVar.u(k.ScriptDataEscaped);
            } else {
                jVar.u(k.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.r()) {
                jVar.p(this);
                jVar.u(k.Data);
                return;
            }
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i(65533);
                jVar.u(k.ScriptDataEscaped);
            } else if (d2 == '-') {
                jVar.i(d2);
            } else if (d2 == '<') {
                jVar.u(k.ScriptDataEscapedLessthanSign);
            } else if (d2 != '>') {
                jVar.i(d2);
                jVar.u(k.ScriptDataEscaped);
            } else {
                jVar.i(d2);
                jVar.u(k.ScriptData);
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                jVar.h();
                jVar.h.append(aVar.q());
                jVar.j("<" + aVar.q());
                jVar.a(k.ScriptDataDoubleEscapeStart);
            } else if (aVar.w('/')) {
                jVar.h();
                jVar.a(k.ScriptDataEscapedEndTagOpen);
            } else {
                jVar.i('<');
                jVar.u(k.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                jVar.g(false);
                jVar.i.u(aVar.q());
                jVar.h.append(aVar.q());
                jVar.a(k.ScriptDataEscapedEndTagName);
                return;
            }
            jVar.j("</");
            jVar.u(k.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.p(jVar, aVar, k.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.o(jVar, aVar, k.ScriptDataDoubleEscaped, k.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                aVar.a();
                jVar.i(65533);
            } else if (q == '-') {
                jVar.i(q);
                jVar.a(k.ScriptDataDoubleEscapedDash);
            } else if (q == '<') {
                jVar.i(q);
                jVar.a(k.ScriptDataDoubleEscapedLessthanSign);
            } else if (q != 65535) {
                jVar.j(aVar.m('-', '<', 0));
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i(65533);
                jVar.u(k.ScriptDataDoubleEscaped);
            } else if (d2 == '-') {
                jVar.i(d2);
                jVar.u(k.ScriptDataDoubleEscapedDashDash);
            } else if (d2 == '<') {
                jVar.i(d2);
                jVar.u(k.ScriptDataDoubleEscapedLessthanSign);
            } else if (d2 != 65535) {
                jVar.i(d2);
                jVar.u(k.ScriptDataDoubleEscaped);
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i(65533);
                jVar.u(k.ScriptDataDoubleEscaped);
            } else if (d2 == '-') {
                jVar.i(d2);
            } else if (d2 == '<') {
                jVar.i(d2);
                jVar.u(k.ScriptDataDoubleEscapedLessthanSign);
            } else if (d2 == '>') {
                jVar.i(d2);
                jVar.u(k.ScriptData);
            } else if (d2 != 65535) {
                jVar.i(d2);
                jVar.u(k.ScriptDataDoubleEscaped);
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.w('/')) {
                jVar.i('/');
                jVar.h();
                jVar.a(k.ScriptDataDoubleEscapeEnd);
                return;
            }
            jVar.u(k.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            k.o(jVar, aVar, k.ScriptDataEscaped, k.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i.C();
                aVar.I();
                jVar.u(k.AttributeName);
            } else if (d2 != ' ') {
                if (!(d2 == '\"' || d2 == '\'')) {
                    if (d2 == '/') {
                        jVar.u(k.SelfClosingStartTag);
                        return;
                    } else if (d2 == 65535) {
                        jVar.p(this);
                        jVar.u(k.Data);
                        return;
                    } else if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13) {
                        switch (d2) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                jVar.o();
                                jVar.u(k.Data);
                                return;
                            default:
                                jVar.i.C();
                                aVar.I();
                                jVar.u(k.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                jVar.r(this);
                jVar.i.C();
                jVar.i.p(d2);
                jVar.u(k.AttributeName);
            }
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            jVar.i.q(aVar.n(k.s0));
            char d2 = aVar.d();
            if (d2 != 0) {
                if (d2 != ' ') {
                    if (!(d2 == '\"' || d2 == '\'')) {
                        if (d2 == '/') {
                            jVar.u(k.SelfClosingStartTag);
                            return;
                        } else if (d2 == 65535) {
                            jVar.p(this);
                            jVar.u(k.Data);
                            return;
                        } else if (!(d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13)) {
                            switch (d2) {
                                case '<':
                                    break;
                                case '=':
                                    jVar.u(k.BeforeAttributeValue);
                                    return;
                                case '>':
                                    jVar.o();
                                    jVar.u(k.Data);
                                    return;
                                default:
                                    jVar.i.p(d2);
                                    return;
                            }
                        }
                    }
                    jVar.r(this);
                    jVar.i.p(d2);
                    return;
                }
                jVar.u(k.AfterAttributeName);
                return;
            }
            jVar.r(this);
            jVar.i.p(65533);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i.p(65533);
                jVar.u(k.AttributeName);
            } else if (d2 != ' ') {
                if (!(d2 == '\"' || d2 == '\'')) {
                    if (d2 == '/') {
                        jVar.u(k.SelfClosingStartTag);
                        return;
                    } else if (d2 == 65535) {
                        jVar.p(this);
                        jVar.u(k.Data);
                        return;
                    } else if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13) {
                        switch (d2) {
                            case '<':
                                break;
                            case '=':
                                jVar.u(k.BeforeAttributeValue);
                                return;
                            case '>':
                                jVar.o();
                                jVar.u(k.Data);
                                return;
                            default:
                                jVar.i.C();
                                aVar.I();
                                jVar.u(k.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                jVar.r(this);
                jVar.i.C();
                jVar.i.p(d2);
                jVar.u(k.AttributeName);
            }
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i.r(65533);
                jVar.u(k.AttributeValue_unquoted);
            } else if (d2 == ' ') {
            } else {
                if (d2 != '\"') {
                    if (d2 != '`') {
                        if (d2 == 65535) {
                            jVar.p(this);
                            jVar.o();
                            jVar.u(k.Data);
                            return;
                        } else if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13) {
                            if (d2 == '&') {
                                aVar.I();
                                jVar.u(k.AttributeValue_unquoted);
                                return;
                            } else if (d2 != '\'') {
                                switch (d2) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        jVar.r(this);
                                        jVar.o();
                                        jVar.u(k.Data);
                                        return;
                                    default:
                                        aVar.I();
                                        jVar.u(k.AttributeValue_unquoted);
                                        return;
                                }
                            } else {
                                jVar.u(k.AttributeValue_singleQuoted);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    jVar.r(this);
                    jVar.i.r(d2);
                    jVar.u(k.AttributeValue_unquoted);
                    return;
                }
                jVar.u(k.AttributeValue_doubleQuoted);
            }
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            String m = aVar.m(k.r0);
            if (m.length() > 0) {
                jVar.i.s(m);
            } else {
                jVar.i.F();
            }
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i.r(65533);
            } else if (d2 == '\"') {
                jVar.u(k.AfterAttributeValue_quoted);
            } else if (d2 == '&') {
                int[] d3 = jVar.d('\"', true);
                if (d3 != null) {
                    jVar.i.t(d3);
                } else {
                    jVar.i.r('&');
                }
            } else if (d2 != 65535) {
                jVar.i.r(d2);
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            String m = aVar.m(k.q0);
            if (m.length() > 0) {
                jVar.i.s(m);
            } else {
                jVar.i.F();
            }
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.i.r(65533);
            } else if (d2 == 65535) {
                jVar.p(this);
                jVar.u(k.Data);
            } else if (d2 == '&') {
                int[] d3 = jVar.d('\'', true);
                if (d3 != null) {
                    jVar.i.t(d3);
                } else {
                    jVar.i.r('&');
                }
            } else if (d2 != '\'') {
                jVar.i.r(d2);
            } else {
                jVar.u(k.AfterAttributeValue_quoted);
            }
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            String n = aVar.n(k.t0);
            if (n.length() > 0) {
                jVar.i.s(n);
            }
            char d2 = aVar.d();
            if (d2 != 0) {
                if (d2 != ' ') {
                    if (!(d2 == '\"' || d2 == '`')) {
                        if (d2 == 65535) {
                            jVar.p(this);
                            jVar.u(k.Data);
                            return;
                        } else if (!(d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13)) {
                            if (d2 == '&') {
                                int[] d3 = jVar.d('>', true);
                                if (d3 != null) {
                                    jVar.i.t(d3);
                                    return;
                                } else {
                                    jVar.i.r('&');
                                    return;
                                }
                            } else if (d2 != '\'') {
                                switch (d2) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        jVar.o();
                                        jVar.u(k.Data);
                                        return;
                                    default:
                                        jVar.i.r(d2);
                                        return;
                                }
                            }
                        }
                    }
                    jVar.r(this);
                    jVar.i.r(d2);
                    return;
                }
                jVar.u(k.BeforeAttributeName);
                return;
            }
            jVar.r(this);
            jVar.i.r(65533);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(k.BeforeAttributeName);
            } else if (d2 == '/') {
                jVar.u(k.SelfClosingStartTag);
            } else if (d2 == '>') {
                jVar.o();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                aVar.I();
                jVar.u(k.BeforeAttributeName);
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == '>') {
                jVar.i.i = true;
                jVar.o();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                aVar.I();
                jVar.u(k.BeforeAttributeName);
            } else {
                jVar.p(this);
                jVar.u(k.Data);
            }
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            aVar.I();
            i.d dVar = new i.d();
            dVar.f14660b.append(aVar.k('>'));
            jVar.k(dVar);
            jVar.a(k.Data);
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.u("--")) {
                jVar.e();
                jVar.u(k.CommentStart);
            } else if (aVar.v("DOCTYPE")) {
                jVar.u(k.Doctype);
            } else if (aVar.u("[CDATA[")) {
                jVar.h();
                jVar.u(k.CdataSection);
            } else {
                jVar.r(this);
                jVar.a(k.BogusComment);
            }
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.n.f14660b.append(65533);
                jVar.u(k.Comment);
            } else if (d2 == '-') {
                jVar.u(k.CommentStartDash);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.n.f14660b.append(d2);
                jVar.u(k.Comment);
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.n.f14660b.append(65533);
                jVar.u(k.Comment);
            } else if (d2 == '-') {
                jVar.u(k.CommentStartDash);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.n.f14660b.append(d2);
                jVar.u(k.Comment);
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char q = aVar.q();
            if (q == 0) {
                jVar.r(this);
                aVar.a();
                jVar.n.f14660b.append(65533);
            } else if (q == '-') {
                jVar.a(k.CommentEndDash);
            } else if (q != 65535) {
                jVar.n.f14660b.append(aVar.m('-', 0));
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                StringBuilder sb = jVar.n.f14660b;
                sb.append('-');
                sb.append(65533);
                jVar.u(k.Comment);
            } else if (d2 == '-') {
                jVar.u(k.CommentEnd);
            } else if (d2 != 65535) {
                StringBuilder sb2 = jVar.n.f14660b;
                sb2.append('-');
                sb2.append(d2);
                jVar.u(k.Comment);
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                StringBuilder sb = jVar.n.f14660b;
                sb.append("--");
                sb.append(65533);
                jVar.u(k.Comment);
            } else if (d2 == '!') {
                jVar.r(this);
                jVar.u(k.CommentEndBang);
            } else if (d2 == '-') {
                jVar.r(this);
                jVar.n.f14660b.append('-');
            } else if (d2 == '>') {
                jVar.m();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                StringBuilder sb2 = jVar.n.f14660b;
                sb2.append("--");
                sb2.append(d2);
                jVar.u(k.Comment);
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                StringBuilder sb = jVar.n.f14660b;
                sb.append("--!");
                sb.append(65533);
                jVar.u(k.Comment);
            } else if (d2 == '-') {
                jVar.n.f14660b.append("--!");
                jVar.u(k.CommentEndDash);
            } else if (d2 == '>') {
                jVar.m();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                StringBuilder sb2 = jVar.n.f14660b;
                sb2.append("--!");
                sb2.append(d2);
                jVar.u(k.Comment);
            } else {
                jVar.p(this);
                jVar.m();
                jVar.u(k.Data);
            }
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(k.BeforeDoctypeName);
                return;
            }
            if (d2 != '>') {
                if (d2 != 65535) {
                    jVar.r(this);
                    jVar.u(k.BeforeDoctypeName);
                    return;
                }
                jVar.p(this);
            }
            jVar.r(this);
            jVar.f();
            jVar.m.f14665f = true;
            jVar.n();
            jVar.u(k.Data);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                jVar.f();
                jVar.u(k.DoctypeName);
                return;
            }
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.f();
                jVar.m.f14661b.append(65533);
                jVar.u(k.DoctypeName);
            } else if (d2 == ' ') {
            } else {
                if (d2 == 65535) {
                    jVar.p(this);
                    jVar.f();
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                } else if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13) {
                    jVar.f();
                    jVar.m.f14661b.append(d2);
                    jVar.u(k.DoctypeName);
                }
            }
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.C()) {
                jVar.m.f14661b.append(aVar.h());
                return;
            }
            char d2 = aVar.d();
            if (d2 != 0) {
                if (d2 != ' ') {
                    if (d2 == '>') {
                        jVar.n();
                        jVar.u(k.Data);
                        return;
                    } else if (d2 == 65535) {
                        jVar.p(this);
                        jVar.m.f14665f = true;
                        jVar.n();
                        jVar.u(k.Data);
                        return;
                    } else if (!(d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13)) {
                        jVar.m.f14661b.append(d2);
                        return;
                    }
                }
                jVar.u(k.AfterDoctypeName);
                return;
            }
            jVar.r(this);
            jVar.m.f14661b.append(65533);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            if (aVar.r()) {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (aVar.y(9, 10, 13, 12, ' ')) {
                aVar.a();
            } else if (aVar.w('>')) {
                jVar.n();
                jVar.a(k.Data);
            } else if (aVar.v("PUBLIC")) {
                jVar.m.f14662c = "PUBLIC";
                jVar.u(k.AfterDoctypePublicKeyword);
            } else if (aVar.v("SYSTEM")) {
                jVar.m.f14662c = "SYSTEM";
                jVar.u(k.AfterDoctypeSystemKeyword);
            } else {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.a(k.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(k.BeforeDoctypePublicIdentifier);
            } else if (d2 == '\"') {
                jVar.r(this);
                jVar.u(k.DoctypePublicIdentifier_doubleQuoted);
            } else if (d2 == '\'') {
                jVar.r(this);
                jVar.u(k.DoctypePublicIdentifier_singleQuoted);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.u(k.BogusDoctype);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13 && d2 != ' ') {
                if (d2 == '\"') {
                    jVar.u(k.DoctypePublicIdentifier_doubleQuoted);
                } else if (d2 == '\'') {
                    jVar.u(k.DoctypePublicIdentifier_singleQuoted);
                } else if (d2 == '>') {
                    jVar.r(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                } else if (d2 != 65535) {
                    jVar.r(this);
                    jVar.m.f14665f = true;
                    jVar.u(k.BogusDoctype);
                } else {
                    jVar.p(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                }
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.m.f14663d.append(65533);
            } else if (d2 == '\"') {
                jVar.u(k.AfterDoctypePublicIdentifier);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.m.f14663d.append(d2);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.m.f14663d.append(65533);
            } else if (d2 == '\'') {
                jVar.u(k.AfterDoctypePublicIdentifier);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.m.f14663d.append(d2);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(k.BetweenDoctypePublicAndSystemIdentifiers);
            } else if (d2 == '\"') {
                jVar.r(this);
                jVar.u(k.DoctypeSystemIdentifier_doubleQuoted);
            } else if (d2 == '\'') {
                jVar.r(this);
                jVar.u(k.DoctypeSystemIdentifier_singleQuoted);
            } else if (d2 == '>') {
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.u(k.BogusDoctype);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13 && d2 != ' ') {
                if (d2 == '\"') {
                    jVar.r(this);
                    jVar.u(k.DoctypeSystemIdentifier_doubleQuoted);
                } else if (d2 == '\'') {
                    jVar.r(this);
                    jVar.u(k.DoctypeSystemIdentifier_singleQuoted);
                } else if (d2 == '>') {
                    jVar.n();
                    jVar.u(k.Data);
                } else if (d2 != 65535) {
                    jVar.r(this);
                    jVar.m.f14665f = true;
                    jVar.u(k.BogusDoctype);
                } else {
                    jVar.p(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                }
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(k.BeforeDoctypeSystemIdentifier);
            } else if (d2 == '\"') {
                jVar.r(this);
                jVar.u(k.DoctypeSystemIdentifier_doubleQuoted);
            } else if (d2 == '\'') {
                jVar.r(this);
                jVar.u(k.DoctypeSystemIdentifier_singleQuoted);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13 && d2 != ' ') {
                if (d2 == '\"') {
                    jVar.u(k.DoctypeSystemIdentifier_doubleQuoted);
                } else if (d2 == '\'') {
                    jVar.u(k.DoctypeSystemIdentifier_singleQuoted);
                } else if (d2 == '>') {
                    jVar.r(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                } else if (d2 != 65535) {
                    jVar.r(this);
                    jVar.m.f14665f = true;
                    jVar.u(k.BogusDoctype);
                } else {
                    jVar.p(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                }
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.m.f14664e.append(65533);
            } else if (d2 == '\"') {
                jVar.u(k.AfterDoctypeSystemIdentifier);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.m.f14664e.append(d2);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == 0) {
                jVar.r(this);
                jVar.m.f14664e.append(65533);
            } else if (d2 == '\'') {
                jVar.u(k.AfterDoctypeSystemIdentifier);
            } else if (d2 == '>') {
                jVar.r(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 != 65535) {
                jVar.m.f14664e.append(d2);
            } else {
                jVar.p(this);
                jVar.m.f14665f = true;
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 != 9 && d2 != 10 && d2 != 12 && d2 != 13 && d2 != ' ') {
                if (d2 == '>') {
                    jVar.n();
                    jVar.u(k.Data);
                } else if (d2 != 65535) {
                    jVar.r(this);
                    jVar.u(k.BogusDoctype);
                } else {
                    jVar.p(this);
                    jVar.m.f14665f = true;
                    jVar.n();
                    jVar.u(k.Data);
                }
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            char d2 = aVar.d();
            if (d2 == '>') {
                jVar.n();
                jVar.u(k.Data);
            } else if (d2 == 65535) {
                jVar.n();
                jVar.u(k.Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        public void q(j jVar, a aVar) {
            jVar.h.append(aVar.l("]]>"));
            if (aVar.u("]]>") || aVar.r()) {
                jVar.k(new i.b(jVar.h.toString()));
                jVar.u(k.Data);
            }
        }
    };
    
    static final char[] q0 = null;
    static final char[] r0 = null;
    static final char[] s0 = null;
    static final char[] t0 = null;
    /* access modifiers changed from: private */
    public static final String u0 = null;

    static {
        q0 = new char[]{0, '&', '\''};
        r0 = new char[]{0, '\"', '&'};
        s0 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '\'', '/', '<', '=', '>'};
        t0 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        u0 = String.valueOf(65533);
    }

    /* access modifiers changed from: private */
    public static void o(j jVar, a aVar, k kVar, k kVar2) {
        if (aVar.C()) {
            String h2 = aVar.h();
            jVar.h.append(h2);
            jVar.j(h2);
            return;
        }
        char d2 = aVar.d();
        if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ' || d2 == '/' || d2 == '>') {
            if (jVar.h.toString().equals("script")) {
                jVar.u(kVar);
            } else {
                jVar.u(kVar2);
            }
            jVar.i(d2);
            return;
        }
        aVar.I();
        jVar.u(kVar2);
    }

    /* access modifiers changed from: private */
    public static void p(j jVar, a aVar, k kVar) {
        if (aVar.C()) {
            String h2 = aVar.h();
            jVar.i.v(h2);
            jVar.h.append(h2);
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (jVar.s() && !aVar.r()) {
            char d2 = aVar.d();
            if (d2 == 9 || d2 == 10 || d2 == 12 || d2 == 13 || d2 == ' ') {
                jVar.u(BeforeAttributeName);
            } else if (d2 == '/') {
                jVar.u(SelfClosingStartTag);
            } else if (d2 != '>') {
                jVar.h.append(d2);
                z2 = true;
            } else {
                jVar.o();
                jVar.u(Data);
            }
            z3 = z2;
        }
        if (z3) {
            jVar.j("</" + jVar.h.toString());
            jVar.u(kVar);
        }
    }

    /* access modifiers changed from: private */
    public static void r(j jVar, k kVar) {
        int[] d2 = jVar.d((Character) null, false);
        if (d2 == null) {
            jVar.i('&');
        } else {
            jVar.l(d2);
        }
        jVar.u(kVar);
    }

    /* access modifiers changed from: private */
    public static void t(j jVar, a aVar, k kVar, k kVar2) {
        char q2 = aVar.q();
        if (q2 == 0) {
            jVar.r(kVar);
            aVar.a();
            jVar.i(65533);
        } else if (q2 == '<') {
            jVar.a(kVar2);
        } else if (q2 != 65535) {
            jVar.j(aVar.m('<', 0));
        } else {
            jVar.k(new i.f());
        }
    }

    /* access modifiers changed from: private */
    public static void u(j jVar, a aVar, k kVar, k kVar2) {
        if (aVar.C()) {
            jVar.g(false);
            jVar.u(kVar);
            return;
        }
        jVar.j("</");
        jVar.u(kVar2);
    }

    /* access modifiers changed from: package-private */
    public abstract void q(j jVar, a aVar);
}
