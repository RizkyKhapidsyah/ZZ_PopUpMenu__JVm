package com.rk.pum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button B_1_IDJAVA;
    RelativeLayout RLayout_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        RLayout_1_IDJAVA = findViewById(R.id.RLayout_1_IDXML);

    }

    public void TombolBackgroundWarna_KetikaDipijit(View Tampil) {
        PopupMenu pMenu = new PopupMenu(MainActivity.this, B_1_IDJAVA);

        pMenu.getMenuInflater().inflate(R.menu.menu_main, pMenu.getMenu());
        pMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.wPutih:
                        RLayout_1_IDJAVA.setBackgroundColor(Color.WHITE);
                        break;
                    case R.id.wBiru:
                        RLayout_1_IDJAVA.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.wKuning:
                        RLayout_1_IDJAVA.setBackgroundColor(Color.YELLOW);
                        break;
                    case R.id.wMerah:
                        RLayout_1_IDJAVA.setBackgroundColor(Color.RED);
                        break;
                }
                return true;
            }
        });

        pMenu.show();
    }
}
