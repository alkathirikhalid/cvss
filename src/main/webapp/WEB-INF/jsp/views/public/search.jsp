<!-- Primary Page Layout -->
<div class="container">
    <div class="row">
        <div class="eleven columns" style="margin-top: 25%">
            <h4>Search ${institution}.</h4>
            <p>Input certificate number and search.<br/>
                Search results will only be displayed for certification holders who have provided their consent to <b>${institution}</b> to display their information.</p>
            <a href="home">Home</a>
            ${message}
            <form method="post" action="search">
                <div class="row">
                    <div class="six columns">
                        <input type="hidden" name="institution" value="${institution}" />
                        <input class="u-full-width" type="text" name="certificateid" placeholder="Certificate ID" value="${certificate.certificateid}" required /><br/>
                        <input class="button-primary"type="Submit" value="Search" />
                    </div></div>
            </form>
        </div>
    </div>
</div>
<!-- End Document -->