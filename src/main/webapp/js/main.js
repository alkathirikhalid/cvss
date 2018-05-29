/* 
 * www.alkathirikhalid.com
 */
function docPrep() {
    document.getElementsByTagName("year")[0].innerHTML = (new Date()).getFullYear();
}

function getusername(username) {
    if (username.trim().length < 4) {
        document.getElementById("results").innerHTML = "User name";
        return;
    } else {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                document.getElementById("results").innerHTML = xmlHttp.responseText;
            }
        };
        xmlHttp.open("GET", "getusername?username=" + username, true);
        xmlHttp.send(null);
    }
}