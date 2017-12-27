<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Primary Page Layout -->
<div class="container">
    <div class="row">
        <div class="eleven columns" style="margin-top: 25%">
            <h4>Select an institute to begin your search for a certificate.</h4>
            ${message}
            <form method="post" action="home">
                <div class="row">
                    <div class="eleven columns">
                        <select name="institution" class="u-full-width">
                            <c:forEach items="${institutes}" var="institute"><option><c:out value="${institute.name}" /></option></c:forEach>
                        </select>
                    </div>
                </div>
                <input class="button-primary" type="submit" value="Select">
            </form>
            <p>Institutions, Organizations, Employers and even Individuals,
                can now verify a certificate authenticity coming from the intended institution
                to the intended candidate, hence preventing forgery, duplication and even outdated certificates.</p>
            <p>Be a <a href="member">Member</a>, Be in Control.</p>
        </div>
    </div>
</div>
</div>
<!-- End Document -->