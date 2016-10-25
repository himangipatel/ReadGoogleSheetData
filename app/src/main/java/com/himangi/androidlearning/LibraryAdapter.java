package com.himangi.androidlearning;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by himangi.
 */

class LibraryAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<LibraryDetails> mLibraryList;
    private Context context;

    LibraryAdapter(List<LibraryDetails> mLibraryList, Context context) {
        this.mLibraryList = mLibraryList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_library, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.txtLibTitle.setText(mLibraryList.get(position).getLibName());
        viewHolder.txtLibURL.setText(mLibraryList.get(position).getLibLinkURL());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(mLibraryList.get(holder.getAdapterPosition()).getLibLinkURL()));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mLibraryList.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtLibTitle, txtLibURL;

        ViewHolder(View itemView) {
            super(itemView);

            txtLibTitle = (TextView) itemView.findViewById(R.id.txtLibTitle);
            txtLibURL = (TextView) itemView.findViewById(R.id.txtLibURL);

        }
    }
}
