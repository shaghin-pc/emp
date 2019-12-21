package com.shagi.employ2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1;
    String s1,s2,s3,s4,s5,s6,s7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Empmodel em=new Empmodel();


        e1=(EditText)findViewById(R.id.ename);
        e2=(EditText)findViewById(R.id.edesg);
        e3=(EditText)findViewById(R.id.esalary);
        e4=(EditText)findViewById(R.id.eplace);
        e5=(EditText)findViewById(R.id.ecompany);
        e6=(EditText)findViewById(R.id.eemail);
        e7=(EditText)findViewById(R.id.ephone);
        b1=(Button)findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                s7=e7.getText().toString();

                em.setName(s1);
                em.setDesignation(s2);
                em.setSalary(s3);
                em.setPlace(s4);
                em.setCompany(s5);
                em.setEmail(s6);
                em.setMob(s7);

               String myname=em.getName();

                Toast.makeText(getApplicationContext(),"welcom"+myname,Toast.LENGTH_LONG).show();
            }
        });
    }
}
