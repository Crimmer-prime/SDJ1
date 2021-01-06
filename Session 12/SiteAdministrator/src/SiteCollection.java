import java.util.Arrays;

public class SiteCollection
{
    private int NumberOfSites;
    private Website [] ListOfSite;

    public SiteCollection (int maxSites)
    {
        ListOfSite = new Website[maxSites];
    }
    public int getNumberOfSite()
    {
        return NumberOfSites;
    }
    public int getNumberOfUpdatedSites()
    {
        int counter = 0;
        for (int i = 0; i < ListOfSite.length; i++) {
            if (ListOfSite[i] != null && ListOfSite[i].needsUpdate() == false)
                counter++;
        }
        return counter;
    }
    public void addSite(Website site)
    {
        ListOfSite[NumberOfSites] = site;
        NumberOfSites++;
    }
    public void removeSite(String url)
    {
        for (int i = 0; i < ListOfSite.length; i++)
        {
            if (ListOfSite[i] != null && ListOfSite[i].getUrl().equals(url))
                ListOfSite[i]=null;
        }
        NumberOfSites--;
    }
    public Website[] getAllSites()
    {
        Website[] AllSites = new Website[NumberOfSites];
        for (int i = 0; i < ListOfSite.length; i++)
        {
            if(ListOfSite[i] != null)
            AllSites[i]=ListOfSite[i];
        }
        return AllSites;
    }

    public Website[] getAllNotUpdatedSites()
    {
        Website[] AllNotUpdatedSites = new Website[NumberOfSites - getNumberOfUpdatedSites()];
        for (int i = 0; i < ListOfSite.length; i++)
        {
            if(ListOfSite[i] != null && ListOfSite[i].needsUpdate() == true)
            AllNotUpdatedSites[i] = ListOfSite[i];
        }
        return AllNotUpdatedSites;
    }
    public String toString() {
        return "SiteCollection{" +
                "NumberOfSites=" + NumberOfSites +
                ", ListOfSite=" + Arrays.toString(ListOfSite) +
                '}';
    }
}
