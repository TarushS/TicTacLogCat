package com.anonimbus.tictaclogcat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class tttActivity extends AppCompatActivity {
    /* renamed from: b1 */
    Button f42b1;

    /* renamed from: b2 */
    Button f43b2;

    /* renamed from: b3 */
    Button f44b3;

    /* renamed from: b4 */
    Button f45b4;

    /* renamed from: b5 */
    Button f46b5;

    /* renamed from: b6 */
    Button f47b6;

    /* renamed from: b7 */
    Button f48b7;

    /* renamed from: b8 */
    Button f49b8;

    /* renamed from: b9 */
    Button f50b9;
    int turn;

    public void checkGame() {
        checkWinner(this.f42b1, this.f43b2, this.f44b3);
        checkWinner(this.f45b4, this.f46b5, this.f47b6);
        checkWinner(this.f48b7, this.f49b8, this.f50b9);
        checkWinner(this.f42b1, this.f45b4, this.f48b7);
        checkWinner(this.f43b2, this.f46b5, this.f49b8);
        checkWinner(this.f44b3, this.f47b6, this.f50b9);
        checkWinner(this.f42b1, this.f46b5, this.f50b9);
        checkWinner(this.f44b3, this.f46b5, this.f48b7);
    }

    public void checkWinner(Button button, Button button2, Button button3) {
        if (button.getText() == button2.getText().toString() && button2.getText().toString() == button3.getText().toString() && button3.getText().toString() == "X") {
            startActivity(new Intent(this, WinnerOne.class));
        }
        if (button.getText() == button2.getText().toString() && button2.getText().toString() == button3.getText().toString() && button3.getText().toString() == "O") {
            startActivity(new Intent(this, WinnerTwo.class));
        }
    }

    public void reset(View view) {
        this.turn = 1;
        this.f42b1.setText("");
        this.f43b2.setText("");
        this.f44b3.setText("");
        this.f45b4.setText("");
        this.f46b5.setText("");
        this.f47b6.setText("");
        this.f48b7.setText("");
        this.f49b8.setText("");
        this.f50b9.setText("");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0254R.layout.startup);
    }

    public void start(View view) {
        setContentView((int) C0254R.layout.activity_ttt);
        this.f42b1 = (Button) findViewById(C0254R.C0256id.f32b1);
        this.f43b2 = (Button) findViewById(C0254R.C0256id.f33b2);
        this.f44b3 = (Button) findViewById(C0254R.C0256id.f34b3);
        this.f45b4 = (Button) findViewById(C0254R.C0256id.f35b4);
        this.f46b5 = (Button) findViewById(C0254R.C0256id.f36b5);
        this.f47b6 = (Button) findViewById(C0254R.C0256id.f37b6);
        this.f48b7 = (Button) findViewById(C0254R.C0256id.f38b7);
        this.f49b8 = (Button) findViewById(C0254R.C0256id.f39b8);
        this.f50b9 = (Button) findViewById(C0254R.C0256id.f40b9);
        this.turn = 1;
        this.f42b1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f42b1.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f42b1.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f42b1.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f43b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f43b2.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f43b2.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f43b2.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f44b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f44b3.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f44b3.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f44b3.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f45b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f45b4.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f45b4.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f45b4.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f46b5.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f46b5.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f46b5.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f46b5.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f47b6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f47b6.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f47b6.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f47b6.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f48b7.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f48b7.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f48b7.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f48b7.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f49b8.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f49b8.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f49b8.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f49b8.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
        this.f50b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (tttActivity.this.f50b9.getText().toString().equals("")) {
                    if (tttActivity.this.turn == 1) {
                        tttActivity.this.f50b9.setText("X");
                        tttActivity.this.turn = 2;
                    } else if (tttActivity.this.turn == 2) {
                        tttActivity.this.f50b9.setText("O");
                        tttActivity.this.turn = 1;
                    }
                }
                tttActivity.this.checkGame();
            }
        });
    }
}
