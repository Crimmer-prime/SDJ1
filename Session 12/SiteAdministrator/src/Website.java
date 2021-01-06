import java.util.Arrays;
import java.util.Objects;

public class Website
{
    private String url;
    private boolean needsUpdate;

    public Website(String url)
    {
        this.url=url;
    }
    public String getUrl()
    {
        return url;
    }
    public boolean needsUpdate()
        {
            return needsUpdate;
        }
        public void markAsNotUpdated()
        {
            needsUpdate = false;
        }
        public void markAsUpdate()
        {
            needsUpdate = true;
        }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Website)) return false;
        Website website = (Website) o;
        return needsUpdate == website.needsUpdate &&
                Objects.equals(getUrl(), website.getUrl());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getUrl(), needsUpdate);
    }

    public String toString()
    {
        return "Website{" +
                "url='" + url + '\'' +
                ", needsUpdate=" + needsUpdate +
                '}';
    }
}
