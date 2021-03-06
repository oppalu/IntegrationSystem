
package gpms;

import util.ConfigManager;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GPMSImplService", targetNamespace = "http://gpms.ws/", wsdlLocation = "http://localhost:8085/ws/gpms?wsdl")
public class GPMSImplService
    extends Service
{

    private final static URL GPMSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException GPMSIMPLSERVICE_EXCEPTION;
    private final static QName GPMSIMPLSERVICE_QNAME = new QName("http://gpms.ws/", "GPMSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
        	String urlStr = ConfigManager.getValue("gpmswsdl");
			url = new URL(urlStr);
			
            //url = new URL("http://localhost:8085/ws/gpms?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GPMSIMPLSERVICE_WSDL_LOCATION = url;
        GPMSIMPLSERVICE_EXCEPTION = e;
    }

    public GPMSImplService() {
        super(__getWsdlLocation(), GPMSIMPLSERVICE_QNAME);
    }

    public GPMSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GPMSIMPLSERVICE_QNAME, features);
    }

    public GPMSImplService(URL wsdlLocation) {
        super(wsdlLocation, GPMSIMPLSERVICE_QNAME);
    }

    public GPMSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GPMSIMPLSERVICE_QNAME, features);
    }

    public GPMSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GPMSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GPMSPort
     */
    @WebEndpoint(name = "GPMSImplPort")
    public GPMSPort getGPMSImplPort() {
        return super.getPort(new QName("http://gpms.ws/", "GPMSImplPort"), GPMSPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GPMSPort
     */
    @WebEndpoint(name = "GPMSImplPort")
    public GPMSPort getGPMSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://gpms.ws/", "GPMSImplPort"), GPMSPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GPMSIMPLSERVICE_EXCEPTION!= null) {
            throw GPMSIMPLSERVICE_EXCEPTION;
        }
        return GPMSIMPLSERVICE_WSDL_LOCATION;
    }

}
