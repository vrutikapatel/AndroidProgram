package com.example.retrofitgetdataexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {

    private List<DemoModel> demoModelList;

    public DemoAdapter(List<DemoModel> demoAdapterList) {
        this.demoModelList = demoAdapterList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.postId.setText(demoModelList.get(position).getPostId());
        holder.id.setText(demoModelList.get(position).getId());
        holder.name.setText(demoModelList.get(position).getName());
        holder.email.setText(demoModelList.get(position).getEmail());
        holder.body.setText(demoModelList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return demoModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView postId,id,name,email,body;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            postId=itemView.findViewById(R.id.postId);
            id=itemView.findViewById(R.id.id);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);
            body=itemView.findViewById(R.id.body);
        }
    }
}
