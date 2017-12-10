package com.example.c4q.jsonq4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by c4q on 12/10/17.
 */

public class BirdsAdapter extends RecyclerView.Adapter<BirdsViewHolder> {
    private List<Birds> birdsList;

    public BirdsAdapter(List<Birds> birdsList) {
        this.birdsList = birdsList;
    }

    @Override
    public BirdsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View birdsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.birds_itemview, parent, false);

        return new BirdsViewHolder(birdsView);
    }

    @Override
    public void onBindViewHolder(BirdsViewHolder holder, int position) {
        holder.onBind(birdsList.get(position));

    }

    @Override
    public int getItemCount() {
        return birdsList.size();
    }
}
