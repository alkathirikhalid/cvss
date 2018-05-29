<!-- Primary Page Layout -->
<div class="container">
    <div class="row">
        <div class="eleven columns" style="margin-top: 25%">
            <h4>Sign in.</h4>
            <message>${message}</message>
            <form method="post" action="signin" autocomplete="On">
                <div class="row">
                    <div class="six columns">
                        <label>User name</label>
                        <input class="u-full-width" type="text" name="username" placeholder="username" value="${user.userName}" required />
                    </div>
                    <div class="six columns">
                        <label>Password</label>
                        <input class="u-full-width" type="password" name="password" placeholder="password" value="" required />
                    </div>
                </div>
                <label>
                    <input type="checkbox" name="rememberme" value="Remember" checked="checked">
                    <span class="label-body">Remember me</span>
                </label>
                <input class="button-primary" type="submit" value="Sign in" ${disabled}>
            </form>
            <label><a href="forgotpassword">Forgot Password</a></label>
        </div>
    </div>
</div>
<!-- End Document -->