<!-- Primary Page Layout -->
<div class="container">
    <div class="row">
        <div class="eleven columns" style="margin-top: 25%">
            <h4>Sign up.</h4>
            <message>${message}</message>
            <form method="post" action="signup" autocomplete="Off">
                <div class="row">
                    <div class="six columns">
                        <label id="results">User name</label>
                        <input class="u-full-width" name="username" type="text" placeholder="username" onkeyup="getusername(this.value)" value="${user.userName}" required />
                    </div>
                    <div class="six columns">
                        <label>Email</label>
                        <input class="u-full-width" type="email" name="email" id="email" placeholder="user@mailbox.com" value="${user.email}" required />
                    </div>
                </div>
                <div class="row">
                    <div class="six columns">
                        <label>Password</label>
                        <input class="u-full-width" type="password" name="password" placeholder="password" required />
                    </div>
                    <div class="six columns">
                        <label>Confirm password</label>
                        <input class="u-full-width" type="password" name="confirmpassword" placeholder="password" required />
                    </div>
                </div>
                <div class="row">
                    <div class="six columns">
                        <label>CAPTCHA code</label>
                        <input class="u-full-width" type="text" name="code" placeholder="code" required />
                    </div>
                    <div class="six columns">
                        <label>CAPTCHA image</label>
                        <img src="captcha"> 
                    </div>
                </div>
                <input class="button-primary" type="submit" value="Sign up">
            </form>
        </div>
    </div>
</div>
<!-- End Document -->