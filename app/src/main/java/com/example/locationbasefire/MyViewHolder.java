package com.example.locationbasefire;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

TextView title,desc,loc;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.textViewTitle);
        desc=itemView.findViewById(R.id.textViewDescription);
        loc=itemView.findViewById(R.id.textViewLocation);
    }
}
