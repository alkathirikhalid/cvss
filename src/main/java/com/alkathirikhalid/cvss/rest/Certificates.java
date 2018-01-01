package com.alkathirikhalid.cvss.rest;

import com.alkathirikhalid.cvss.model.data.certificate.CertificateIMP;
import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * <p>
 * RESTful Web Services for Certificates.</p>
 *
 * @author alkathirikhalid
 */
@Path("certificates")
public class Certificates {

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
     * @return a Certificates
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CertificateEntity getCertificate(@PathParam("id") int id) {
        return new CertificateIMP().getCertificate(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCertificate(CertificateEntity certificate) {
        return Response.status(201).entity(new CertificateIMP().createCertificate(certificate)).build();
    }
}
