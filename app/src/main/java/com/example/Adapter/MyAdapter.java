package com.example.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Model.ListItem;
import com.example.test4.InfoActivity;
import com.example.test4.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.listItems = listitem;

    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_row,parent,false );

        return new ViewHolder( view );
    }


    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        ListItem item = listItems.get( position );
        holder.name.setText( item.getName() );
        holder.description.setText( item.getDescription() );
        holder.age.setText( item.getAge() );
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private TextView description;
        private TextView age;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            itemView.setOnClickListener( this );
            name = itemView.findViewById( R.id.title );
            description = itemView.findViewById( R.id.myinfo );
            age = itemView.findViewById( R.id.age );
        }

        @Override
        public void onClick(View v) {

            int postion = getAdapterPosition();
            ListItem item = listItems.get( postion );

            Intent intent = new Intent(context, InfoActivity.class );
            intent.putExtra( "name",item.getName() );
            intent.putExtra( "description",item.getDescription() );
            intent.putExtra( "age",item.getAge() );
            context.startActivity( intent );



          //  Toast.makeText( context, item.getName(), Toast.LENGTH_SHORT ).show();

        }
    }
}
