package fr.unice.polytech.tobeortohave.stock;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.unice.polytech.tobeortohave.R;
import fr.unice.polytech.tobeortohave.model.Item;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class StockFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.stock_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.store_recycler);
        recyclerView.setAdapter(new ItemAdapter(Item.createItems(10), getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}
