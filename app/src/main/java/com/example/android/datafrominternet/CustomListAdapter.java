package com.example.android.datafrominternet;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;


public class CustomListAdapter extends ArrayAdapter<GithubUser>
{

    private Context context;
    private int resource;
    List<GithubUser> list;
    public CustomListAdapter(Context context, int resource, List<GithubUser> list){
        super(context,resource,list);
        this.context = context;
        this.resource = resource;
        this.list = list;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            listItemView = layoutInflater.inflate(resource,parent,false);
        }
        TextView userID = (TextView) listItemView.findViewById(R.id.userID);
        TextView userScore = (TextView) listItemView.findViewById(R.id.userScore);
        GithubUser githubUser = getItem(position);
        userID.setText(githubUser.getUserID());
        userScore.setText(githubUser.getScore());


        return listItemView;
    }

}
