package com.example.c4q.jsonq4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 12/10/17.
 */

public class BirdsViewHolder extends RecyclerView.ViewHolder {
    private TextView birdText;

    public BirdsViewHolder(View itemView) {
        super(itemView);
        birdText = (TextView) itemView.findViewById(R.id.birdsTextview);
    }

    public void onBind(Birds birds) {
        birdText.setText(birds.getName());

    }
}
