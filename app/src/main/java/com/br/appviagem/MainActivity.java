package com.br.appviagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.br.appviagem.adapter.ListaPacoteAdapter;
import com.br.appviagem.dao.PacoteDAO;
import com.br.appviagem.model.Pacote;

import java.util.List;

//import com.br.appviagem.adapter.ListaPacoteAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista_de_pacote = findViewById(R.id.item_pacote_listview);

        setTitle("Pacotes");

        List<Pacote> pacotes = new PacoteDAO().lista();

        lista_de_pacote.setAdapter(new ListaPacoteAdapter(pacotes, this));
    }
}