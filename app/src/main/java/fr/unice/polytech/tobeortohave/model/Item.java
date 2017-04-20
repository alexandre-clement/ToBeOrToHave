package fr.unice.polytech.tobeortohave.model;

/**
 * @author Alexandre Clement
 *         Created the 20/04/2017.
 */

public class Item
{
    public enum Category
    {
        BOOK,
        DVD
    }

    private final int id;
    private final String name;
    private final Category category;
    private final double price;
    private final String description;

    public Item(int id, String name, Category category, double price, String description)
    {
        this.id = id;
        this.name = name;
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
}
