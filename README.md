Test project with one test login page and secured endpoint

You can login via
http://localhost:8080/login
with credentials:
<p>login: login</p>
<p>password: password</p>

<br/>
After authentication you are able to get version from test endpoint.
http://localhost:8080/version leads to VersionController with the text:
<h2>There is no versions!</h2>