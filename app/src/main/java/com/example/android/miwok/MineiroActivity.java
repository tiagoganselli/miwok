package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MineiroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("pão de queijo", "pãdequei"));
        words.add(new Word("jeitinho", "jeitin"));
        words.add(new Word("pare por favor", "pópará"));
        words.add(new Word("pertinho", "pertim"));
        words.add(new Word("nossa senhora", "nóssenhora"));
        words.add(new Word("deixe-me ver", "chovê"));
        words.add(new Word("conforme for eu vou", "confófô eu vô"));
        words.add(new Word("ônibus", "ôns"));
        words.add(new Word("blusa de frio", "blusdifrii"));
        words.add(new Word("embaixo da ponte", "bádapônti"));
        words.add(new Word("doce de leite", "docindileiti"));
        words.add(new Word("dá arrepio de ver", "dárrepidivê"));

        WordAdapter adapter = new WordAdapter(this, words, ContextCompat.getColor(getApplicationContext(), R.color.category_minas));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
