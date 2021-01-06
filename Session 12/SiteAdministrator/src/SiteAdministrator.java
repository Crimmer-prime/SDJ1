import java.util.Arrays;

public class SiteAdministrator
{
    private String name;
    private SiteCollection [] siteCollection;
    private Website[] ListOfSites;

    public SiteAdministrator (String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public SiteCollection[] getSiteCollection()
    {
        return siteCollection;
    }
    public Website getNextSiteToUpdate()
    {
        for (int i = 0; i < siteCollection.length; i++) {
        }
        return new Website("asd");
    }
    public Website[] getAllSitesToUpdate()
    {
        return getAllSitesToUpdate();
    }
}