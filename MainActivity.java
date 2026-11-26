package com.demo.ffawareness;
import android.app.*;import android.os.*;import android.graphics.Color;import android.graphics.Typeface;import android.graphics.drawable.GradientDrawable;import android.view.*;import android.widget.*;
public class MainActivity extends Activity{
 int g=Color.rgb(101,255,139); LinearLayout root,panel; TextView status;
 int dp(float n){return (int)(n*getResources().getDisplayMetrics().density+.5f);}
 GradientDrawable bg(int c,int s){GradientDrawable d=new GradientDrawable();d.setColor(c);d.setCornerRadius(dp(13));if(s!=0)d.setStroke(dp(1),s);return d;}
 TextView txt(String s,int z,int c,boolean b){TextView t=new TextView(this);t.setText(s);t.setTextSize(z);t.setTextColor(c);if(b)t.setTypeface(null,1);return t;}
 void toggle(String n){LinearLayout r=new LinearLayout(this);r.setGravity(Gravity.CENTER_VERTICAL);r.setPadding(dp(13),dp(12),dp(10),dp(12));r.setBackground(bg(0xff0a120d,0xff203c2a));TextView t=txt(n+"\nVisual toggle only",13,-1,true);r.addView(t,new LinearLayout.LayoutParams(0,-2,1));Switch s=new Switch(this);r.addView(s);LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,-2);p.bottomMargin=dp(8);panel.addView(r,p);}
 public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(0xff080d0b);getWindow().setNavigationBarColor(0xff080d0b);ScrollView sc=new ScrollView(this);root=new LinearLayout(this);root.setOrientation(1);root.setPadding(dp(18),dp(25),dp(18),dp(22));root.setBackgroundColor(0xff080d0b);sc.addView(root);setContentView(sc);
 TextView tag=txt("VIRTUAL CONFIGURATION INTERFACE",10,g,true);tag.setGravity(17);root.addView(tag);
 TextView title=txt("FREE FIRE PANEL",27,-1,true);title.setGravity(17);title.setPadding(0,dp(8),0,dp(4));root.addView(title);
 TextView sub=txt("VISUAL DEMO • VERSION 1.0",11,0xff9bb2a3,false);sub.setGravity(17);root.addView(sub);
 TextView warn=txt("⚠ ENTERTAINMENT DEMO ONLY\nNot connected to Free Fire. No cheats or game changes are performed.",12,0xffffe89a,true);warn.setGravity(17);warn.setPadding(dp(12),dp(14),dp(12),dp(14));warn.setBackground(bg(0xff2d2713,0xff8c762d));LinearLayout.LayoutParams wp=new LinearLayout.LayoutParams(-1,-2);wp.setMargins(0,dp(18),0,dp(15));root.addView(warn,wp);
 root.addView(txt("PLAYER ID (DEMO INPUT)",11,0xffb7cdbd,true));EditText id=new EditText(this);id.setSingleLine(true);id.setHint("Enter any demo ID");id.setTextColor(-1);id.setHintTextColor(0xff777777);id.setInputType(2);id.setBackground(bg(0xff070d09,0xff31543b));root.addView(id,new LinearLayout.LayoutParams(-1,dp(48)));
 panel=new LinearLayout(this);panel.setOrientation(1);LinearLayout.LayoutParams pp=new LinearLayout.LayoutParams(-1,-2);pp.topMargin=dp(16);root.addView(panel,pp);toggle("Aim Assist");toggle("Headshot Mode");toggle("ESP Mode");toggle("Magic Bullet");
 Button run=new Button(this);run.setText("START DEMO");run.setTextColor(0xff061109);run.setTypeface(null,1);run.setBackground(bg(g,g));root.addView(run,new LinearLayout.LayoutParams(-1,dp(52)));
 status=txt("",12,g,true);status.setGravity(17);status.setPadding(dp(10),dp(15),dp(10),dp(15));status.setBackground(bg(0xff0a1c10,0xff2d7547));status.setVisibility(8);LinearLayout.LayoutParams sp=new LinearLayout.LayoutParams(-1,-2);sp.topMargin=dp(12);root.addView(status,sp);
 TextView foot=txt("OFFLINE UI SIMULATION\nNo internet, overlay, storage or game permissions required.",10,0xff708777,false);foot.setGravity(17);foot.setPadding(0,dp(18),0,0);root.addView(foot);
 run.setOnClickListener(v->{run.setEnabled(false);run.setText("RUNNING DEMO…");status.setVisibility(0);String[] a={"Initializing visual interface…","Loading sample settings…","Preparing preview…","Demo complete — no game was modified."};final int[] i={0};status.setText(a[0]);status.postDelayed(new Runnable(){public void run(){i[0]++;status.setText(a[i[0]]);if(i[0]<a.length-1)status.postDelayed(this,650);else{run.setEnabled(true);run.setText("RUN DEMO AGAIN");}}},650);});
 }}
