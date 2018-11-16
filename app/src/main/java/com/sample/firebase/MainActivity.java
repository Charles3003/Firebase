package com.sample.firebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference oDatabaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference oUsuario = oDatabaseReference.child("Usuario");
    private DatabaseReference DatabaseReference_Produto = oDatabaseReference.child("Produto");
    private DatabaseReference DatabaseReference_Lista= oDatabaseReference.child("Lista");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Usuario o = new Usuario();
        o.setIdade(15);
        o.setNome("Mariana");
        o.setSexo("Feminina");
        o.setSobrenome("Marques");
        oUsuario.child("003").setValue(o);

        Produto oProduto = new Produto();
        oProduto.setDescricao("MOTOCICLETA");
        oProduto.setId_Produto(1);

        Produto o1 = new Produto();
        o1.setDescricao("MOTO");
        o1.setId_Produto(1);

        List<Produto> oLista = new ArrayList<Produto>();
        oLista.add(oProduto);
        oLista.add(o1);

        DatabaseReference_Lista.setValue(oLista);
        */

        DatabaseReference_Produto.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
