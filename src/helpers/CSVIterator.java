package helpers;

/**
 * Implemented Iterator class
 */
public class CSVIterator implements Iterator<String[]>
{
    private final CSVReader reader;
    private String[] currentLine;
    CSVIterator(CSVReader reader)
    {
        this.reader = reader;
    }

    /**
     * Move to the first iterable item.
     */
    public void first()
    {
        try
        {
            this.reader.close();
            this.reader.open();

            this.currentLine = this.reader.readLine();
        }
        catch (Exception ignored) {
        }
    }

    /**
     * Move to the next item.
     */
    public void next()
    {
        if (this.currentItem() != null)
            this.currentLine = this.reader.readLine();
    }

    /**
     * Get the current item.
     * @return : Item that is selected by pointer
     */
    public String[] currentItem()
    {
        return this.currentLine;
    }
}
