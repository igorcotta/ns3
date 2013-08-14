
 
package ns3;
public class Router {
    
    private String dest;
    private String gateway;
    private String genmask;
    private String metric;
    private String iface;

    public Router(String dest, String gateway, String genmask, String metric, String iface){
        this.dest = dest;
        this.gateway = gateway;
        this.genmask = genmask;
        this.metric = metric;
        this.iface = iface;       
    }
    
    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setGenmask(String genmask) {
        this.genmask = genmask;
    }

    public void setIface(String iface) {
        this.iface = iface;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getDest() {
        return dest;
    }

    public String getGateway() {
        return gateway;
    }

    public String getGenmask() {
        return genmask;
    }

    public String getIface() {
        return iface;
    }

    public String getMetric() {
        return metric;
    }
    
    
}
