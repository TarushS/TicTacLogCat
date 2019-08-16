package com.anonimbus.tictaclogcat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WinnerOne extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0254R.layout.activity_winner_one);
        Log.d("You found it", "enc0r3{t1ck_t4ck_l0ckF4t}");
        ((Button) findViewById(C0254R.C0256id.buttonOne)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                WinnerOne.this.startActivity(new Intent(WinnerOne.this, tttActivity.class));
            }
        });
    }
}
