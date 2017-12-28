package com.alkathirikhalid.cvss.rest;

import com.alkathirikhalid.cvss.model.data.certificate.CertificateIMP;
import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <p>
 * RESTful Web Services for Certificate.</p>
 *
 * @author alkathirikhalid
 */
@Path("certificate")
public class Certificate {

    /**
     * Accessible .../rest/certificate
     *
     * @return a list of Certificates
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CertificateEntity> getCertificates() {
        return new CertificateIMP().getCertificates();
    }

    /**
     * Accessible .../rest/certificate/id
     *
     * @param id
     * @return a Certificate
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CertificateEntity getCertificate(@PathParam("id") int id) {
        return new CertificateIMP().getCertificate(id);
    }

    /*
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCertificate(CertificateEntity certificate) {
        // TODO Create
        String result = "Certificate Created : " + certificate;
        return Response.status(201).entity(result).build();

    }
     */
}
