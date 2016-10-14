package com.sim.multipanelayout.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sim.multipanelayout.R;
import com.sim.multipanelayout.data.JoueurContent;


public class JoueurAdapter extends ArrayAdapter<JoueurContent.JoueurItem>{

    Context context; 
    int layoutResourceId;    
    List<JoueurContent.JoueurItem> joueurs = null;
    
    public JoueurAdapter(Context context, int layoutResourceId, List<JoueurContent.JoueurItem> joueurs) {
        super(context, layoutResourceId, joueurs);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.joueurs = joueurs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        UserHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new UserHolder();
            holder.txtName = (TextView)row.findViewById(R.id.name_joueur);
            holder.image = (ImageView)row.findViewById(R.id.img_joueur_small);
            row.setTag(holder);
        }
        else
        {
            holder = (UserHolder)row.getTag();
        }
        
        JoueurContent.JoueurItem joueur = joueurs.get(position);
        holder.txtName.setText(joueur.name);
        holder.image.setImageResource(joueur.smallPictureId);
       
        return row;
    }
    
    static class UserHolder
    {
        
        TextView txtName;
        ImageView image;
    }
}
