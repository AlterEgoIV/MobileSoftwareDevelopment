package ie.theglassboard.mobiledevelopmentsample.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ie.theglassboard.mobiledevelopmentsample.R;

/**
 * Created by Kevin on 04/11/2016.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    private static class ViewHolder {
        TextView tvName;
        TextView tvEmail;
        TextView tvPhone;
    }

    public ContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, R.layout.item_list_sample, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contact contact = getItem(position);

        ViewHolder viewHolder;

        if(convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_sample, parent, false);

            viewHolder.tvName = (TextView)convertView.findViewById(R.id.contactName);
            viewHolder.tvEmail = (TextView)convertView.findViewById(R.id.contactEmail);
            viewHolder.tvPhone = (TextView)convertView.findViewById(R.id.contactPhone);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText(contact.getName());
        viewHolder.tvEmail.setText(contact.getEmail());
        viewHolder.tvPhone.setText(contact.getPhone());

        return convertView;
    }
}
