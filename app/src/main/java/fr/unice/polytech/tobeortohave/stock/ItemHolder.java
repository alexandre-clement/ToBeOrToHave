package fr.unice.polytech.tobeortohave.stock;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fr.unice.polytech.tobeortohave.R;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class ItemHolder extends RecyclerView.ViewHolder
{
    private final ImageView imageView;
    private final TextView title;
    private final TextView category;
    private final TextView price;
    private final TextView description;

    public ItemHolder(View itemView)
    {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.item_image);
        title = (TextView) itemView.findViewById(R.id.item_title);
        category = (TextView) itemView.findViewById(R.id.item_category);
        price = (TextView) itemView.findViewById(R.id.item_price);
        description = (TextView) itemView.findViewById(R.id.item_description);
    }

    public ImageView getImageView()
    {
        return imageView;
    }

    public TextView getDescription()
    {
        return description;
    }

    public TextView getPrice()
    {
        return price;
    }

    public TextView getCategory()
    {
        return category;
    }

    public TextView getTitle()
    {
        return title;
    }
}

