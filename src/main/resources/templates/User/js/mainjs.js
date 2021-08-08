function containerComponent() {
    let str = '<div class="container">\n' +
        '    <div class="row" id="menu">\n' +
        '        \n' +
        '    </div>\n' +
        '    <div class="row mt-3" id="main">\n' +
        '\n' +
        '    </div>\n' +
        '</div>'
    document.getElementById('content').innerHTML = str;
}

function menuComponent() {
    let str = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
        "  <div class=\"container-fluid\">\n" +
        "    <img src='http://www.thp.com.vn/wp-content/uploads/2017/01/Logo_THP_Group.png' width='40px' height='40px' class=\"navbar-brand\" href=\"#\">THP Group</img>\n" +
        "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
        "      <span class=\"navbar-toggler-icon\"></span>\n" +
        "    </button>\n" +
        "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
        "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
        "        <li class=\"nav-item\">\n" +
        "          <a class=\"nav-link active\" aria-current=\"page\" href=\"Home.html\">Home</a>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item\">\n" +
        "          <a class=\"nav-link\" href=\"managerUser.html\">UserList</a>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item dropdown\">\n" +
        "          <a class=\"nav-link dropdown-toggle\" id='data'   href=\"#\"  role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n " +
        "         đưewewew </a>\n" +
        "          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
        "            <li><a class=\"dropdown-item\" href=\"#\">YourProfile</a></li>\n" +
        "            <li><a class=\"dropdown-item\" href=\"#\">Logout</a></li>\n" +
        "            <li><hr class=\"dropdown-divider\"></li>\n" +
        "            <li><a class=\"dropdown-item\" href=\"#\">About Us</a></li>\n" +
        "          </ul>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item\">\n" +
        "          <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n" +
        "        </li>\n" +
        "      </ul>\n" +
        "      <form class=\"d-flex\">\n" +
        "        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
        "        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n" +
        "      </form>\n" +
        "    </div>\n" +
        "  </div>\n" +
        "</nav>"
    document.getElementById('menu').innerHTML = str;
}

function mainHomeComponent() {
    let str = "<div class=\"col-3\" id='category'>Left</div>\n" +
        "<div class=\"col-7\" id='post'>Mid</div>\n" +
        "<div class=\"col-2\" id='new'>Right</div>"
    document.getElementById('main').innerHTML = str;
}

function mainProfileComponent() {
    let str = "<div class=\"col-12\">Trang cá nhân</div>"
    document.getElementById('main').innerHTML = str;
}
function mainHomeComponent() {
    let str = "<div class=\"col-3\" id='category'>Left</div>\n" +
        "<div class=\"col-7\" id='post'>Mid</div>\n" +
        "<div class=\"col-2\" id='new'>Right</div>"
    document.getElementById('main').innerHTML = str;
}

function mainProfileComponent() {
    let str = "<div class=\"col-12\">Trang cá nhân</div>"
    document.getElementById('main').innerHTML = str;
}
function loaddata() {

    document.getElementById("data").innerHTML = localStorage.getItem('name');
}
function logout() {
    window.localStorage.removeItem('name')
    window.localStorage.removeItem('token')
    window.location.href="login.html"
}
function checkToken(){
    if(localStorage.getItem('token')==null){
        window.location.href="login.html"
    }

}

