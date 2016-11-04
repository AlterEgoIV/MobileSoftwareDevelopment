package ie.theglassboard.mobiledevelopmentsample.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import ie.theglassboard.mobiledevelopmentsample.R;

public class ListActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        contacts = new ArrayList<>();
        contacts.add(new Contact("John", "john@gmail.com", "087 123 4567"));
        contacts.add(new Contact("Jane", "jane@gmail.com", "083 098 7654"));
        contacts.add(new Contact("Patrick", "patrick@gmail.com", "086 365 1980"));
        contacts.add(new Contact("Patricia", "patricia@gmail.com", "087 123 4567"));
        contacts.add(new Contact("Mark", "mark@gmail.com", "087 123 4567"));
        contacts.add(new Contact("Mary", "mary@gmail.com", "087 123 4567"));

        ListView contactsList = (ListView) findViewById(R.id.contactsList);
        contactsList.setAdapter(new ContactAdapter(this, contacts));
    }
}
