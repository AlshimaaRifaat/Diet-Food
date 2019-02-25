package com.example.shosho.dietfood.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dietfoooood.R;


public class RequestedSuccessfully extends AppCompatActivity {
    TextView TextDone;
    SharedPreferences.Editor sharesss;
    TextView txtorder,T_Price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requested_successfully);
        txtorder=findViewById(R.id.T_Orderss);
        T_Price=findViewById(R.id.T_Price);
        TextDone=findViewById(R.id.done);
        txtorder.setText(getIntent().getStringExtra("id"));
        T_Price.setText(getIntent().getStringExtra("price"));
        TextDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inty=new Intent(RequestedSuccessfully.this,HomeActivity.class);
//                inty.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                inty.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(inty);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent inty=new Intent(RequestedSuccessfully.this,HomeActivity.class);
        startActivity(inty);
        finish();

    }
}
