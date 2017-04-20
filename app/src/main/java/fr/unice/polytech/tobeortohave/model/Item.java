package fr.unice.polytech.tobeortohave.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class Item
{
    private final int id;
    private final String name;
    private final String imagePath;
    private final Category category;
    private final double price;
    private final String description;
    public Item(int id, String name, String imagePath, Category category, double price, String description)
    {
        this.id = id;
        this.name = name;
        this.imagePath = imagePath;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public Category getCategory()
    {
        return category;
    }

    public double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }

    public enum Category
    {
        BOOK,
        DVD
    }

    public static List<Item> createItems(int n)
    {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            items.add(new Item(i, "Item" + i, "http://www.legorafi.fr/wp-content/uploads/2015/06/ThinkstockPhotos-139859412.jpg", Category.DVD, 9.999, "Gud movie"));
        }
        return items;
    }
}
