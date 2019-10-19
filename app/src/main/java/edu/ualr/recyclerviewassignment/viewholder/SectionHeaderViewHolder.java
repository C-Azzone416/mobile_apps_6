package edu.ualr.recyclerviewassignment.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.ualr.recyclerviewassignment.R;

public class SectionHeaderViewHolder extends RecyclerView.ViewHolder {

    public TextView label;

    public SectionHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        this.label = itemView.findViewById(R.id.title_section);
    }
}
