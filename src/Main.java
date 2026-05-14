import admin.NationalEuthenizedContainer;
import firewall.FirewallAdministration;
import loaders.NationalLoader;
import logger.NationalLogger;
import swing.national.NationalFrame;

@SuppressWarnings("all")
public class Main
{
    public Route route = new Route();

    public static void main(String...args) throws ClassNotFoundException
    {
        Main main = new Main();
    }

    public Main()
    {
        NationalFrame national_frame = new NationalFrame();

        NationalLoader national_loader = new NationalLoader();

        NationalLogger national_logger = new NationalLogger();

        FirewallAdministration firewall_administration = new FirewallAdministration();
    }

    public class Route
    {

    }
}
