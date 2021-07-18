package com.example.tarea03.Usuario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    private EditText cnombreyapellido;
    private EditText cdireccion;
    private EditText ctelefono;
    private EditText creferencia;
    private EditText cpassword;

    private Button btncrearusuario;



    //Variables de los datos que se reguistraran:
    private String usuario = "";
    private String nombreyapellido = "";
    private String direccion = "";
    private String telefono = "";
    private String referencia = "";
    private String password = "";


    FirebaseAuth mAuth;
    DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        cusuario = (EditText)findViewById(R.id.cusuario);
        cnombreyapellido = (EditText)findViewById(R.id.cnombreyapellido);
        cdireccion = (EditText)findViewById(R.id.cdireccion);
        ctelefono = (EditText)findViewById(R.id.ctelefono);
        creferencia = (EditText)findViewById(R.id.creferencia);
        cpassword = (EditText)findViewById(R.id.cpassword);
        btncrearusuario = (Button)findViewById(R.id.btncrearusuario);


        btncrearusuario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                usuario = cusuario.getText().toString();
                nombreyapellido = cnombreyapellido.getText().toString();
                direccion = cdireccion.getText().toString();
                telefono = ctelefono.getText().toString();
                referencia = creferencia.getText().toString();
                password = cpassword.getText().toString();

                if(!usuario.isEmpty() && !nombreyapellido.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty() && !referencia.isEmpty() && !password.isEmpty()){

                  if(password.length() >= 6){

                    }else{
                        Toast.makeText(ActivityRegistroUsuario.this,"Contraseña muy pequeña :3", Toast.LENGTH_SHORT).show();
                    }

                    registerUser();
                }
                else{
                    Toast.makeText(ActivityRegistroUsuario.this,"No se permite campos vacios", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private void registerUser(){
        mAuth.createUserWithEmailAndPassword(usuario, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    Map<String, Object> map = new HashMap<>();
                    map.put("usuario", usuario);
                    map.put("nombreyapellido", nombreyapellido);
                    map.put("direccion", direccion);
                    map.put("telefono", telefono);
                    map.put("referencia", referencia);
                    map.put("password", password);

                    String id = mAuth.getCurrentUser().getUid();


                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull  Task<Void> task2) {

                            if (task2.isSuccessful()){
                                startActivity(new Intent(ActivityRegistroUsuario.this, MainActivityPrincipal.class ));
                                finish();
                            }
                            Toast.makeText(ActivityRegistroUsuario.this,"No se pudieron crear los datos correctamente", Toast.LENGTH_SHORT).show();

                        }
                    });
                }else{
                    Toast.makeText(ActivityRegistroUsuario.this,"No se registro el usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}