package ie.theglassboard.mobiledevelopmentsample.list;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import ie.theglassboard.mobiledevelopmentsample.R;

public class ContactListActivity extends ListActivity {

    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        contacts = new ArrayList<>();
        contacts.add(new Contact("John", "john@gmail.com", "087 123 4567", 20, "1234567"));
        contacts.add(new Contact("Jane", "jane@gmail.com", "083 098 7654", 21, "1723456"));
        contacts.add(new Contact("Patrick", "patrick@gmail.com", "086 365 1980", 25, "7654321"));
        contacts.add(new Contact("Patricia", "patricia@gmail.com", "087 123 4567", 19, "7612345"));
        contacts.add(new Contact("Mark", "mark@gmail.com", "087 123 4567", 23, "1325467"));
        contacts.add(new Contact("Mary", "mary@gmail.com", "087 123 4567", 22, "3217654"));

        setListAdapter(new ContactAdapter(this, contacts));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Toast.makeText(this, contacts.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
