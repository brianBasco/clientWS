
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueWS {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://ws/", className = "ws.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://ws/", className = "ws.ConversionResponse")
    @Action(input = "http://ws/BanqueWS/conversionRequest", output = "http://ws/BanqueWS/conversionResponse")
    public double conversion(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param id
     * @return
     *     returns ws.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "ws.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "ws.GetCompteResponse")
    @Action(input = "http://ws/BanqueWS/getCompteRequest", output = "http://ws/BanqueWS/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeComptes", targetNamespace = "http://ws/", className = "ws.ListeComptes")
    @ResponseWrapper(localName = "listeComptesResponse", targetNamespace = "http://ws/", className = "ws.ListeComptesResponse")
    @Action(input = "http://ws/BanqueWS/listeComptesRequest", output = "http://ws/BanqueWS/listeComptesResponse")
    public List<Compte> listeComptes();

}
