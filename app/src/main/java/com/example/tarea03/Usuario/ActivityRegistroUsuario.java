package com.example.tarea03.Usuario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.example.tarea03.MainActivityPrincipal;
import com.example.tarea03.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class ActivityRegistroUsuario extends AppCompatActivity {

    private EditText cusuario;

    private EditText cmail;
    private EditText ctelefono;

    private EditText cpassword;

    private Button btncrearusuario;

    FirebaseAuth firebaseAuth;
    AwesomeValidation awesomeValidation;
    DatabaseReference mDatabase;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        firebaseAuth = FirebaseAuth.getInstance();
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
    /*    mDatabase = FirebaseDatabase.getInstance().getReference();*/



        awesomeValidation.addValidation(this,R.id.cmail, Patterns.EMAIL_ADDRESS,R.string.invalid_email);

        awesomeValidation.addValidation(this,R.id.cpassword,".{6,}",R.string.invalid_password);







     /*   cusuario = (EditText)findViewById(R.id.cusuario);
        ctelefono = (EditText)findViewById(R.id.ctelefono);*/
        cmail = (EditText)findViewById(R.id.cmail);

        cpassword = (EditText)findViewById(R.id.cpassword);

        btncrearusuario = (Button)findViewById(R.id.btncrearusuario);

        btncrearusuario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mail = cmail.getText().toString();

                String password = cpassword.getText().toString();

                if(awesomeValidation.validate()){

                    firebaseAuth.createUserWithEmailAndPassword(mail,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(ActivityRegistroUsuario.this, "Bien", Toast.LENGTH_SHORT).show();
                                finish();
                            }else{
                                Toast.makeText(ActivityRegistroUsuario.this, "No se reguistro", Toast.LENGTH_SHORT).show();

                            }


                        }
                    });
                }else{
                    Toast.makeText(ActivityRegistroUsuario.this, "Compelta todos los datos", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }




}