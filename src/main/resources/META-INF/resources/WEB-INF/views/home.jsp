<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>News Portal</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body >


<div class="container" style="margin-top: 20px">
    <div class="row">

<c:forEach items="${newsList}" var="singleNews" >


    <div class="col-md-4" >
        <div class="card" style="">
            <img class="card-img-top" src="${singleNews.img}"  style="">
            <div class="card-body">
                <a href="${singleNews.link}"  ><h5 class="card-title">${singleNews.title}</h5></a>
            </div>
        </div>
        <br>
    </div>

</c:forEach>

    </div>
</div>

</body>
</html>