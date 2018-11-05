package com.sample.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference oDatabaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference oUsuario = oDatabaseReference.child("Usuario");
    private DatabaseReference DatabaseReference_Produto = oDatabaseReference.child("Produto");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Usuario o = new Usuario();
        o.setIdade(15);
        o.setNome("Mariana");
        o.setSexo("Feminina");
        o.setSobrenome("Marques");
        oUsuario.child("001").setValue(o);

        Produto oProduto = new Produto();
        oProduto.setDescricao("Carro");
        oProduto.setId_Produto(1);
        DatabaseReference_Produto.child("002").setValue(oProduto);
    }
}
