package com.example.jihc_house;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class kuntizbe extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuntizbe);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        MainActivity2.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        MainActivity2.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        MainActivity2.redirectActivity(this, MainActivity2.class);
    }

    public void ClickDashboard(View view){
        recreate();
    }
    public void ClickAboutUs(View view){
        MainActivity2.redirectActivity(this, MainActivity2.class);
    }
    public void ClickLogout(View view){
        MainActivity2.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity2.closeDrawer(drawerLayout);
    }
}