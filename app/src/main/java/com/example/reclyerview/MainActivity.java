package com.example.reclyerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        /**
         * List of contacts to display.
         */
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Dayahang Rai", "6598465486" , R.drawable.ic_launcher_background));
        contactsList.add(new Contacts("Bhuwan KC", "4865438454" , R.drawable.ic_launcher_background));
        contactsList.add(new Contacts("Saugat Malla", "21384897654" , R.drawable.ic_launcher_background));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
