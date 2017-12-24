package com.alkathirikhalid.cvss.rest;

import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alkathirikhalid
 */
@Path("certificate")
public class Certificate {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CertificateEntity> getCertificates() {
        List<CertificateEntity> certificates = new ArrayList<>();

        CertificateEntity certificate = new CertificateEntity();
        certificate.setCertificateId("0");
        certificate.setAction("Completed");
        certificate.setDateIssued("10/09/2015");
        certificate.setDescription("Full Stack Dev Ops");
        certificate.setInstitute("IAT");
        certificate.setName("Super Hero");

        certificates.add(certificate);

        CertificateEntity certificate1 = new CertificateEntity();
        certificate1.setCertificateId("1");
        certificate1.setAction("Completed");
        certificate1.setDateIssued("11/09/2015");
        certificate1.setDescription("Full Stack Dev Ops");
        certificate1.setInstitute("IAT");
        certificate1.setName("Super Hero");

        certificates.add(certificate1);

        return certificates;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CertificateEntity getCertificate(@PathParam("id") String id) {
        // TODO Fetching
        CertificateEntity certificate = new CertificateEntity();
        certificate.setCertificateId(id);
        certificate.setAction("Completed");
        certificate.setDateIssued("11/09/2015");
        certificate.setDescription("Full Stack Dev Ops");
        certificate.setInstitute("IAT");
        certificate.setName("Super Hero");
        return certificate;
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
