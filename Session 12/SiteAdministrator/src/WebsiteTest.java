import java.util.Arrays;

public class WebsiteTest
{
    public static void main(String[] args)
    {
        Website website = new Website("Facebook.com");
        Website website1 = new Website("Youtube.com");
        Website website2 = new Website("Twitter.com");

        SiteCollection siteCollection = new SiteCollection(5);
        siteCollection.addSite(website);
        siteCollection.addSite(website1);
        System.out.println("Facebook is " + website.needsUpdate());
        website.markAsUpdate();
        System.out.println("Youtube is " + website1.needsUpdate());
        website1.markAsNotUpdated();


        System.out.println("all sites");
        System.out.println(Arrays.toString(siteCollection.getAllSites()));
        System.out.println("List of websites not updated");
        System.out.println(Arrays.toString(siteCollection.getAllNotUpdatedSites()));
        System.out.println(siteCollection.getNumberOfUpdatedSites());
    }
}
