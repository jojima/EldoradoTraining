package com.example.fjojima.contactlistapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/*public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>{

    private List<Contact> contactList;
    private Context mContext;
    public ContactsAdapter(List<Contact> contactList, Context mContext){
        this.contactList = contactList;
        this.mContext = mContext;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.one_contact, null);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.tvContactName.setText(contact.getContactName());
        holder.tvPhoneNumber.setText(contact.getContactNumber());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        ImageView ivContactImage;
        TextView tvContactName;
        TextView tvPhoneNumber;

        public ContactViewHolder(View itemView) {
            super(itemView);
            ivContactImage = (ImageView) itemView.findViewById(R.id.ivContactImage);
            tvContactName = (TextView) itemView.findViewById(R.id.tvContactName);
            tvPhoneNumber = (TextView) itemView.findViewById(R.id.tvPhoneNumber);
        }
    }
}*/

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    private ArrayList<Contact> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView contactName;
        public TextView contactNumber;
        public ImageView contactIcon;
        public ContactViewHolder(View v) {
            super(v);
            contactName = (TextView) v.findViewById(R.id.tvContactName);
            contactNumber = (TextView) v.findViewById(R.id.tvPhoneNumber);
            contactIcon = (ImageView) v.findViewById(R.id.ivContactImage);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ContactsAdapter(ArrayList<Contact> myDataset) {
        this.mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ContactsAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.one_contact, parent, false);
        ContactViewHolder vh = new ContactViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Contact c = mDataset.get(position);
        holder.contactName.setText(c.getContactName());
        holder.contactNumber.setText(c.getContactNumber());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
