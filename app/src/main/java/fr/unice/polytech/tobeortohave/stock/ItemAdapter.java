package fr.unice.polytech.tobeortohave.stock;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.net.URI;
import java.util.List;
import java.util.Locale;

import fr.unice.polytech.tobeortohave.R;
import fr.unice.polytech.tobeortohave.model.Item;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder>
{
    private final List<Item> items;
    private final Context context;

    public ItemAdapter(List<Item> items, Context context)
    {
        this.items = items;
        this.context = context;
    }

    public Context getContext()
    {
        return context;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = inflater.inflate(R.layout.item, parent, false);
        return new ItemHolder(item);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position)
    {
        final Item item = items.get(position);
        holder.getTitle().setText(item.getName());
        holder.getDescription().setText(item.getDescription());
        holder.getCategory().setText(item.getCategory().toString());
        holder.getPrice().setText(String.format(Locale.getDefault(), "%.2f €", item.getPrice()));
        holder.getImageView().setImageURI(Uri.parse(item.getImagePath()));
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }
}
