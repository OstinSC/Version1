package com.example.tarea03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tarea03.Usuario.ActivityRecuperarContrasena;
import com.example.tarea03.Usuario.ActivityRegistroUsuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    private Button BotonReguistar;
    private Button button2;


    private EditText maill;
    private EditText passwordd;
    private TextView olvidastecontraseña;

    private String email = "";
    private String password = "";

    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mAuth = FirebaseAuth.getInstance();

        maill = (EditText)findViewById(R.id.mail);
        passwordd = (EditText)findViewById(R.id.password);
        button2 = (Button)findViewById(R.id.button2);
        BotonReguistar = (Button)findViewById(R.id.BotonReguistar);

        olvidastecontraseña = (TextView)findViewById(R.id.olvidastecontraseña);




        BotonReguistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ActivityRegistroUsuario.class);
            startActivity(i);
            }
        });


        olvidastecontraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityRecuperarContrasena.class);
                startActivity(i);
            }
        });






     button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = maill.getText().toString();
                password = passwordd.getText().toString();

                if(!email.isEmpty() && !password.isEmpty()){
                    loginUser();
                }else{
                    Toast.makeText(MainActivity.this, "Compelta los campos", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }



    private void loginUser() {
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        startActivity(new Intent(MainActivity.this, MainActivityPrincipal.class));
                        finish();
                    }else{
                        Toast.makeText(MainActivity.this, "No se inicio session", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

